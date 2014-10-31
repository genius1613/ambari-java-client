package vn.mvs.ambari.ambariclient.services;

import vn.mvs.ambari.ambariclient.AbstractClient;
import vn.mvs.ambari.client.AmbariCliApi;
import vn.mvs.ambari.pojo.base.ServiceComponent;

/**
 * Created by tienbm on 24/10/2014.
 */
public class NagiosClient extends AbstractClient {
    public static final String nagiosServer = "NAGIOS_SERVER";

    public NagiosClient(AmbariCliApi cliApi, String clusterName) {
        super(cliApi, clusterName);
        this.serviceName = "NAGIOS";
    }

    /**
     * @return
     */
    public ServiceComponent getNagiosServer() {
        return ambariCliApi.getServiceComponentInfo(clusterName, serviceName, nagiosServer);
    }
}
