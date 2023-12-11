package scheduler;

import java.util.*;

public class User implements Comparable<User> {

    private String id;
    private Score score;
    private Queue<Job> jobs;

    public User(String id, Score score) {
        this.id = id;
        this.score = score;
        this.jobs = new LinkedList<Job>();
    }

    public String getId() {
        return this.id;
    }

    public void addJob(Job job) {
        this.jobs.add(job);
    }

    public Job extractJob() {
        this.score.increase();
        return this.jobs.remove();
    }

    public boolean hasJob() {
        return !this.jobs.isEmpty();
    }

    @Override
    public int hashCode() {
        return this.id.hashCode();
    }

    @Override
    public boolean equals(Object other) {
        return other instanceof User && this.id.equals(((User) other).id);
    }

    @Override
    public int compareTo(User other) {
        if (!this.hasJob()) {
            return 1;
        } else if (!other.hasJob()) {
            return -1;
        } else if (this.score.compareTo(other.score) != 0) {
            return this.score.compareTo(other.score);
        } else {
            return this.id.compareTo(other.id);
        }
    }
}
