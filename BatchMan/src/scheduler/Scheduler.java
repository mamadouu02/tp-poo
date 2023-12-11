package scheduler;

import java.util.*;

public class Scheduler {

    private Map<String, User> users;
    private Map<JobId, Job> jobs;
    private Queue<User> queue;

    public Scheduler() {
        this.users = new HashMap<>();
        this.jobs = new HashMap<>();
        this.queue = new PriorityQueue<>();
    }

    public void addUser(User user) {
        this.users.put(user.getId(), user);
        this.queue.offer(user);
    }

    /**
     * @return L'identifiant du job ajouté
     */
    public JobId addJob(String execFile, int maxSpan, String userId) {
        Job job = new Job(execFile, maxSpan);
        
        users.get(userId).addJob(job);
        queue.offer(queue.poll());
        
        JobId id = job.getJobId();
        jobs.put(id, job);
        return id;
    }

    /**
     * @return Un objet avec les infos sur le job
     */
    public Job getJob(JobId id) {
        return jobs.get(id);
    }

    /**
     * Supprime le prochain job à exécuter de l'ensemble des jobs en attente et met
     * à jour le score de l'utilisateur.
     * 
     * @return Le prochain job à exécuter
     */
    public Job extractNextJobToSchedule() {
        User user = queue.poll();

        if (!user.hasJob()) {
            return null;
        }

        Job job = user.extractJob();
        job.start();
        queue.offer(user);
        return job;
    }
}
