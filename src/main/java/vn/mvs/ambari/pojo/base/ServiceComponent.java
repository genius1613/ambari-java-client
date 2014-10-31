package vn.mvs.ambari.pojo.base;

/**
 * Created by tienbm on 26/09/2014.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import vn.mvs.ambari.pojo.common.Metrics;

/**
 *
 */
public class ServiceComponent {
    @Expose
    private String href;

    @Expose
    @SerializedName("ServiceComponentInfo")
    private ServiceComponentInfo ServiceComponentInfo;

    @Expose
    @SerializedName("metrics")
    private Metrics metrics;

    /**
     *
     */
    @Expose
    @SerializedName("host_components")
    private HostComponent[] host_components;

    public HostComponent[] getHost_components() {
        return host_components;
    }

    public void setHost_components(HostComponent[] host_components) {
        this.host_components = host_components;
    }

    public Metrics getMetrics() {
        return metrics;
    }

    public void setMetrics(Metrics metrics) {
        this.metrics = metrics;
    }

    public ServiceComponentInfo getServiceComponentInfo() {
        return ServiceComponentInfo;
    }

    public void setServiceComponentInfo(ServiceComponentInfo ServiceComponentInfo) {
        this.ServiceComponentInfo = ServiceComponentInfo;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }
}
