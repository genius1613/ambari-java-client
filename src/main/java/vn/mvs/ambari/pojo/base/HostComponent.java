package vn.mvs.ambari.pojo.base;

import com.google.gson.annotations.SerializedName;
import vn.mvs.ambari.pojo.common.Metrics;

/**
 * Created by tienbm on 25/09/2014.
 */
public class HostComponent
{
    private String href;
    @SerializedName("HostRoles")
    private vn.mvs.ambari.pojo.base.HostRoles HostRoles;
    @SerializedName("host")
    private Host host;
    private Metrics metrics;

    @SerializedName("component")
    private ServiceComponent[] component;

    public ServiceComponent[] getComponent() {
        return component;
    }

    public void setComponent(ServiceComponent[] component) {
        this.component = component;
    }

    public Host getHost() {
        return host;
    }

    public void setHost(Host host) {
        this.host = host;
    }

    private class Host{
        private String href;

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }
    }

    public HostRoles getHostRoles ()
    {
        return HostRoles;
    }

    public void setHostRoles (HostRoles HostRoles)
    {
        this.HostRoles = HostRoles;
    }

    public String getHref ()
    {
        return href;
    }

    public void setHref (String href)
    {
        this.href = href;
    }

    public Metrics getMetrics() {
        return metrics;
    }

    public void setMetrics(Metrics metrics) {
        this.metrics = metrics;
    }
}
