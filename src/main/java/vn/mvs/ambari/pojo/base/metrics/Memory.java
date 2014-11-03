package vn.mvs.ambari.pojo.base.metrics;

/**
 * Created by tienbm on 25/09/2014.
 */

public class Memory
{
    private String mem_total;

    private String swap_free;

    private String mem_buffers;

    private String mem_shared;

    private String swap_total;

    private String mem_free;

    private String mem_cached;

    public String getMem_total ()
    {
        return mem_total;
    }

    public void setMem_total (String mem_total)
    {
        this.mem_total = mem_total;
    }

    public String getSwap_free ()
    {
        return swap_free;
    }

    public void setSwap_free (String swap_free)
    {
        this.swap_free = swap_free;
    }

    public String getMem_buffers ()
    {
        return mem_buffers;
    }

    public void setMem_buffers (String mem_buffers)
    {
        this.mem_buffers = mem_buffers;
    }

    public String getMem_shared ()
    {
        return mem_shared;
    }

    public void setMem_shared (String mem_shared)
    {
        this.mem_shared = mem_shared;
    }

    public String getSwap_total ()
    {
        return swap_total;
    }

    public void setSwap_total (String swap_total)
    {
        this.swap_total = swap_total;
    }

    public String getMem_free ()
    {
        return mem_free;
    }

    public void setMem_free (String mem_free)
    {
        this.mem_free = mem_free;
    }

    public String getMem_cached ()
    {
        return mem_cached;
    }

    public void setMem_cached (String mem_cached)
    {
        this.mem_cached = mem_cached;
    }
}

