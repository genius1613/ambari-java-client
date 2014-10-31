package vn.mvs.ambari.pojo.common;

import com.google.gson.annotations.Expose;

/**
 * Created by tienbm on 25/09/2014.
 */
public class ServiceInfo
{
    @Expose
    private String cluster_name;
    @Expose
    private String maintenance_state;
    @Expose
    private String service_name;
    @Expose
    private String state;


    public String getCluster_name ()
    {
        return cluster_name;
    }

    public void setCluster_name (String cluster_name)
    {
        this.cluster_name = cluster_name;
    }

    public String getMaintenance_state ()
    {
        return maintenance_state;
    }

    public void setMaintenance_state (String maintenance_state)
    {
        this.maintenance_state = maintenance_state;
    }

    public String getState ()
    {
        return state;
    }

    public void setState (String state)
    {
        this.state = state;
    }

    public String getService_name ()
    {
        return service_name;
    }

    public void setService_name (String service_name)
    {
        this.service_name = service_name;
    }
}

