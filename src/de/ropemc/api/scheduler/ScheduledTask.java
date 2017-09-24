package de.ropemc.api.scheduler;

import java.util.Timer;
import java.util.TimerTask;

public class ScheduledTask extends TimerTask {

    private Timer timer;
    private int id;
    private SchedulerTask task;
    private Object[] args;

    private ScheduledTask(int id,SchedulerTask task,Object... args)
    {
        this.timer=new Timer();
        this.id=id;
        this.task=task;
        this.args=args;
    }

    public ScheduledTask(int id,SchedulerTask task,TimeFormat format,long delay,Object... args)
    {
        this(id,task,args);
        timer.schedule(this,format.toMilliseconds(delay));
    }

    public ScheduledTask(int id,SchedulerTask task,TimeFormat format,long delay,long interval,Object... args)
    {
        this(id,task,args);
        timer.schedule(this,format.toMilliseconds(delay),format.toMilliseconds(interval));
    }

    public int getId(){
        return this.id;
    }

    public void run(){
        task.execute(args);
    }

    public void cancelTask() {
        timer.cancel();
    }

    public enum TimeFormat
    {
        MILLISECONDS,
        SECONDS,
        MINUTES;
        public long toMilliseconds(long value)
        {
            switch(this)
            {
                case MILLISECONDS: return value;
                case SECONDS: return value*1000;
                case MINUTES: return value*1000*60;
                default: return value;
            }
        }
    }

}
