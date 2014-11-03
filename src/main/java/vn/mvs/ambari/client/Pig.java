package vn.mvs.ambari.client;

import vn.mvs.ambari.retrofit.AmbariCliApi;
import vn.mvs.ambari.pojo.base.ServiceComponent;

/**
 * Created by tienbm on 24/10/2014.
 */
public class Pig extends AbstractClient {
    public static final String pig = "PIG";

    public Pig(AmbariCliApi cliApi, String clusterName) {
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
