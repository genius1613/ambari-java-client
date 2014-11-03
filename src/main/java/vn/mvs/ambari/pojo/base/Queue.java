package vn.mvs.ambari.pojo.base;

/**
 * Created by tienbm on 26/09/2014.
 */
public class Queue
{
    private String reserved_reduce_slots;

    private String running_300;

    private String running_0;

    private String reserved_map_slots;

    private String jobs_completed;

    private String waiting_maps;

    private String running_60;

    private String running_1440;

    private String jobs_submitted;

    private String waiting_reduces;

    public String getReserved_reduce_slots ()
    {
        return reserved_reduce_slots;
    }

    public void setReserved_reduce_slots (String reserved_reduce_slots)
    {
        this.reserved_reduce_slots = reserved_reduce_slots;
    }

    public String getRunning_300 ()
    {
        return running_300;
    }

    public void setRunning_300 (String running_300)
    {
        this.running_300 = running_300;
    }

    public String getRunning_0 ()
    {
        return running_0;
    }

    public void setRunning_0 (String running_0)
    {
        this.running_0 = running_0;
    }

    public String getReserved_map_slots ()
    {
        return reserved_map_slots;
    }

    public void setReserved_map_slots (String reserved_map_slots)
    {
        this.reserved_map_slots = reserved_map_slots;
    }

    public String getJobs_completed ()
    {
        return jobs_completed;
    }

    public void setJobs_completed (String jobs_completed)
    {
        this.jobs_completed = jobs_completed;
    }

    public String getWaiting_maps ()
    {
        return waiting_maps;
    }

    public void setWaiting_maps (String waiting_maps)
    {
        this.waiting_maps = waiting_maps;
    }

    public String getRunning_60 ()
    {
        return running_60;
    }

    public void setRunning_60 (String running_60)
    {
        this.running_60 = running_60;
    }

    public String getRunning_1440 ()
    {
        return running_1440;
    }

    public void setRunning_1440 (String running_1440)
    {
        this.running_1440 = running_1440;
    }

    public String getJobs_submitted ()
    {
        return jobs_submitted;
    }

    public void setJobs_submitted (String jobs_submitted)
    {
        this.jobs_submitted = jobs_submitted;
    }

    public String getWaiting_reduces ()
    {
        return waiting_reduces;
    }

    public void setWaiting_reduces (String waiting_reduces)
    {
        this.waiting_reduces = waiting_reduces;
    }
}