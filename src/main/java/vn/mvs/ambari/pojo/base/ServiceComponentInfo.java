package vn.mvs.ambari.pojo.base;

import com.google.gson.annotations.Expose;

/**
 * Created by tienbm on 22/10/2014.
 */
public class ServiceComponentInfo {
    @Expose
    private String category;
    @Expose
    private String cluster_name;
    @Expose
    private String component_name;
    @Expose
    private String installed_count;
    @Expose
    private String service_name;
    @Expose
    private String started_count;
    @Expose
    private String state;
    @Expose
    private String total_count;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCluster_name() {
        return cluster_name;
    }

    public void setCluster_name(String cluster_name) {
        this.cluster_name = cluster_name;
    }

    public String getComponent_name() {
        return component_name;
    }

    public void setComponent_name(String component_name) {
        this.component_name = component_name;
    }

    public String getInstalled_count() {
        return installed_count;
    }

    public void setInstalled_count(String installed_count) {
        this.installed_count = installed_count;
    }

    public String getService_name() {
        return service_name;
    }

    public void setService_name(String service_name) {
        this.service_name = service_name;
    }

    public String getStarted_count() {
        return started_count;
    }

    public void setStarted_count(String started_count) {
        this.started_count = started_count;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getTotal_count() {
        return total_count;
    }

    public void setTotal_count(String total_count) {
        this.total_count = total_count;
    }
}
