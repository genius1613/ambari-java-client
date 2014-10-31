package vn.mvs.ambari.ambariclient.services;

import vn.mvs.ambari.ambariclient.AbstractClient;
import vn.mvs.ambari.client.AmbariCliApi;
import vn.mvs.ambari.pojo.base.ServiceComponent;

/**
 * Created by tienbm on 24/10/2014.
 */
public class PigClient extends AbstractClient {
    public static final String pig = "PIG";

    public PigClient(AmbariCliApi cliApi, String clusterName) {
        super(cliApi, clusterName);
        this.serviceName = "PIG";
    }

    /**
     * @return
     */
    public ServiceComponent getPig() {
        return ambariCliApi.getServiceComponentInfo(clusterName, serviceName, pig);
    }
}
