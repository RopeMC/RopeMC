package de.ropemc.api.scheduler;

import java.util.ArrayList;
import java.util.List;

public class Scheduler
{

    private static List<ScheduledTask> tasks = new ArrayList<ScheduledTask>();
    private static int last_id = 0;

    public static int schedule(SchedulerTask task, ScheduledTask.TimeFormat format, long delay, Object... args)
    {
        last_id++;
        tasks.add(new ScheduledTask(last_id,task,format,delay,args));
        return last_id;
    }

    public static int schedule(SchedulerTask task, ScheduledTask.TimeFormat format, long delay, long interval, Object... args)
    {
        last_id++;
        tasks.add(new ScheduledTask(last_id,task,format,delay,interval,args));
        return last_id;
    }

    public static void cancel(int task_id)
    {
         for(ScheduledTask task : tasks)
         {
             if(task.getId()==task_id)
             {
                 task.cancelTask();
             }
         }
    }

}
