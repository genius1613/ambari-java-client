package vn.mvs.ambari.client;

import vn.mvs.ambari.retrofit.AmbariCliApi;
import vn.mvs.ambari.pojo.base.ServiceComponent;

/**
 * Created by tienbm on 24/10/2014.
 */
public class Webhcat extends AbstractClient {
    public static final String webhcatServer = "WEBHCAT_SERVER";

    public Webhcat(AmbariCliApi cliApi, String clusterName) {
        super(cliApi, clusterName);
        this.serviceName = "WEBHCAT";
    }

    /**
     * @return
     */
    public ServiceComponent getWebhcatServer() {
        return ambariCliApi.getServiceComponentInfo(clusterName, serviceName, webhcatServer);
    }
}
