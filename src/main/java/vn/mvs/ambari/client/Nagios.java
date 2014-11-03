package vn.mvs.ambari.client;

import vn.mvs.ambari.retrofit.AmbariCliApi;
import vn.mvs.ambari.pojo.base.ServiceComponent;

/**
 * Created by tienbm on 24/10/2014.
 */
public class Nagios extends AbstractClient {
    public static final String nagiosServer = "NAGIOS_SERVER";

    public Nagios(AmbariCliApi cliApi, String clusterName) {
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
