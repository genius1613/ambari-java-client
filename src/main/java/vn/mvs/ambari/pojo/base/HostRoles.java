package vn.mvs.ambari.pojo.base;

import vn.mvs.ambari.pojo.common.Actual_configs;

/**
 * Created by tienbm on 25/09/2014.
 */

public class HostRoles {
    private String cluster_name;

    private String maintenance_state;

    private String state;

    private String component_name;

    private String service_name;

    private String host_name;

    private String desired_stack_id;

    private String stale_configs;

    private String stack_id;
    private Actual_configs actual_configs;

    public String getService_name() {
        return service_name;
    }

    public void setService_name(String service_name) {
        this.service_name = service_name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getMaintenance_state() {
        return maintenance_state;
    }

    public void setMaintenance_state(String maintenance_state) {
        this.maintenance_state = maintenance_state;
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

    public String getHost_name() {
        return host_name;
    }

    public void setHost_name(String host_name) {
        this.host_name = host_name;
    }

    public String getDesired_stack_id() {
        return desired_stack_id;
    }

    public void setDesired_stack_id(String desired_stack_id) {
        this.desired_stack_id = desired_stack_id;
    }

    public String getStale_configs() {
        return stale_configs;
    }

    public void setStale_configs(String stale_configs) {
        this.stale_configs = stale_configs;
    }

    public String getStack_id() {
        return stack_id;
    }

    public void setStack_id(String stack_id) {
        this.stack_id = stack_id;
    }

    public Actual_configs getActual_configs() {
        return actual_configs;
    }

    public void setActual_configs(Actual_configs actual_configs) {
        this.actual_configs = actual_configs;
    }
}

