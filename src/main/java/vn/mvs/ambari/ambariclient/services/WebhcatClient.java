package vn.mvs.ambari.ambariclient.services;

import vn.mvs.ambari.ambariclient.AbstractClient;
import vn.mvs.ambari.client.AmbariCliApi;
import vn.mvs.ambari.pojo.base.ServiceComponent;

/**
 * Created by tienbm on 24/10/2014.
 */
public class WebhcatClient extends AbstractClient {
    public static final String webhcatServer = "WEBHCAT_SERVER";

    public WebhcatClient(AmbariCliApi cliApi, String clusterName) {
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
