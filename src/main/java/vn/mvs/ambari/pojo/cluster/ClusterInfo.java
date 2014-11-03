package vn.mvs.ambari.pojo.cluster;

import com.google.gson.annotations.SerializedName;
import vn.mvs.ambari.pojo.base.Alerts;
import vn.mvs.ambari.pojo.Service;
import vn.mvs.ambari.pojo.base.*;

/**
 * Created by tienbm on 09/10/2014.
 */
public class ClusterInfo {
    private Request[] requests;

    @SerializedName("services")
    private Service[] services;

    private Config_groups[] config_groups;

    private Clusters Clusters;

    private String[] workflows;

    private Alerts alerts;

    private HostComponentList[] hostComponentLists;

    private Configurations[] configurations;

    private String href;

    public Request[] getRequests() {
        return requests;
    }

    public void setRequests(Request[] requests) {
        this.requests = requests;
    }

    public Service[] getServices() {
        return services;
    }

    public void setServices(Service[] services) {
        this.services = services;
    }

    public Config_groups[] getConfig_groups() {
        return config_groups;
    }

    public void setConfig_groups(Config_groups[] config_groups) {
        this.config_groups = config_groups;
    }

    public Clusters getClusters() {
        return Clusters;
    }

    public void setClusters(Clusters Clusters) {
        this.Clusters = Clusters;
    }

    public String[] getWorkflows() {
        return workflows;
    }

    public void setWorkflows(String[] workflows) {
        this.workflows = workflows;
    }

    public Alerts getAlerts() {
        return alerts;
    }

    public void setAlerts(Alerts alerts) {
        this.alerts = alerts;
    }

    public HostComponentList[] getHostComponentLists() {
        return hostComponentLists;
    }

    public void setHostComponentLists(HostComponentList[] hostComponentLists) {
        this.hostComponentLists = hostComponentLists;
    }

    public Configurations[] getConfigurations() {
        return configurations;
    }

    public void setConfigurations(Configurations[] configurations) {
        this.configurations = configurations;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }
}