package de.ropemc.api.scheduler;

public interface SchedulerTask {

    public void execute(Object... args);

}
