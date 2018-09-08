package de.ropemc.api.scheduler;

public interface SchedulerTask {

    void execute(Object... args);

}
