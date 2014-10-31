package vn.mvs.ambari.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import vn.mvs.ambari.pojo.common.Alerts;
import vn.mvs.ambari.pojo.common.ServiceInfo;
import vn.mvs.ambari.pojo.base.ServiceComponent;

/**
 * Created by tienbm on 28/10/2014.
 */
public class Service {
    private String href;

    @SerializedName("ServiceInfo")
    private ServiceInfo serviceInfo;

    private Alerts alerts;

    @Expose
    @SerializedName("components")
    private ServiceComponent[] components;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public ServiceInfo getServiceInfo() {
        return serviceInfo;
    }

    public void setServiceInfo(ServiceInfo serviceInfo) {
        this.serviceInfo = serviceInfo;
    }

    public Alerts getAlerts() {
        return alerts;
    }

    public void setAlerts(Alerts alerts) {
        this.alerts = alerts;
    }

    public ServiceComponent[] getComponents() {
        return components;
    }

    public void setComponents(ServiceComponent[] components) {
        this.components = components;
    }
}
