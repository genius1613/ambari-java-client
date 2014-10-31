package vn.mvs.ambari.pojo.common;

/**
 * Created by tienbm on 01/10/2014.
 */
public class Detail
{
    private String last_status_time;

    private String status;

    private String last_status;

    private String status_time;

    private String description;

    private String actual_status;

    private String service_name;

    private String output;

    private String host_name;

    public String getLast_status_time ()
    {
        return last_status_time;
    }

    public void setLast_status_time (String last_status_time)
    {
        this.last_status_time = last_status_time;
    }

    public String getStatus ()
    {
        return status;
    }

    public void setStatus (String status)
    {
        this.status = status;
    }

    public String getLast_status ()
    {
        return last_status;
    }

    public void setLast_status (String last_status)
    {
        this.last_status = last_status;
    }

    public String getStatus_time ()
    {
        return status_time;
    }

    public void setStatus_time (String status_time)
    {
        this.status_time = status_time;
    }

    public String getDescription ()
    {
        return description;
    }

    public void setDescription (String description)
    {
        this.description = description;
    }

    public String getActual_status ()
    {
        return actual_status;
    }

    public void setActual_status (String actual_status)
    {
        this.actual_status = actual_status;
    }

    public String getService_name ()
    {
        return service_name;
    }

    public void setService_name (String service_name)
    {
        this.service_name = service_name;
    }

    public String getOutput ()
    {
        return output;
    }

    public void setOutput (String output)
    {
        this.output = output;
    }

    public String getHost_name ()
    {
        return host_name;
    }

    public void setHost_name (String host_name)
    {
        this.host_name = host_name;
    }
}