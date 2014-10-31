package vn.mvs.ambari.pojo.cluster;

import com.google.gson.annotations.SerializedName;
import vn.mvs.ambari.pojo.common.*;

public class Health_report {
    //host info
    @SerializedName("Host/stale_config")
    private String host_stale_config;

    @SerializedName("Host/maintenance_state;")
    private String host_maintenance_state;

    //host state
    @SerializedName("Host/host_state/HEALTHY")
    private String host_state_heathy;

    @SerializedName("Host/host_state/UNHEALTHY")
    private String host_state_unhealthy;

    @SerializedName("Host/host_state/HEARTBEAT_LOST")
    private String host_state_hearbeat_lost;

    @SerializedName("Host/host_state/INIT")
    private String host_state_init;

    //host status

    @SerializedName("Host/host_status/HEALTHY")
    private String host_status_healthy;

    @SerializedName("Host/host_status/UNHEALTHY")
    private String host_status_unhealthy;

    @SerializedName("Host/host_status/ALERT")
    private String host_status_alert;

    @SerializedName("Host/host_status/UNKNOWN")
    private String host_status_unknown;

    public String getHost_stale_config() {
        return host_stale_config;
    }

    public void setHost_stale_config(String host_stale_config) {
        this.host_stale_config = host_stale_config;
    }
}

