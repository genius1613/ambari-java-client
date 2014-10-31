package vn.mvs.ambari.pojo.cluster;

/**
 * Created by tienbm on 09/10/2014.
 */
public class Clusters
{
    private String cluster_name;

    private String total_hosts;

    private Desired_configs desired_configs;

    private String cluster_id;

    private String provisioning_state;

    private Health_report health_report;

    private String version;

    public String getCluster_name ()
    {
        return cluster_name;
    }

    public void setCluster_name (String cluster_name)
    {
        this.cluster_name = cluster_name;
    }

    public String getTotal_hosts ()
    {
        return total_hosts;
    }

    public void setTotal_hosts (String total_hosts)
    {
        this.total_hosts = total_hosts;
    }

    public Desired_configs getDesired_configs ()
    {
        return desired_configs;
    }

    public void setDesired_configs (Desired_configs desired_configs)
    {
        this.desired_configs = desired_configs;
    }

    public String getCluster_id ()
    {
        return cluster_id;
    }

    public void setCluster_id (String cluster_id)
    {
        this.cluster_id = cluster_id;
    }

    public String getProvisioning_state ()
    {
        return provisioning_state;
    }

    public void setProvisioning_state (String provisioning_state)
    {
        this.provisioning_state = provisioning_state;
    }

    public Health_report getHealth_report ()
    {
        return health_report;
    }

    public void setHealth_report (Health_report health_report)
    {
        this.health_report = health_report;
    }

    public String getVersion ()
    {
        return version;
    }

    public void setVersion (String version)
    {
        this.version = version;
    }
}