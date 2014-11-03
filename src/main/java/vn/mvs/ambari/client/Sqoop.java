package vn.mvs.ambari.client;

import vn.mvs.ambari.retrofit.AmbariCliApi;
import vn.mvs.ambari.pojo.base.ServiceComponent;

/**
 * Created by tienbm on 24/10/2014.
 */
public class Sqoop extends AbstractClient {
    public static final String sqoop = "SQOOP";

    public Sqoop(AmbariCliApi cliApi, String clusterName) {
        super(cliApi, clusterName);
        this.serviceName = "SQOOP";
    }

    /**
     * @return
     */
    public ServiceComponent getSqoop() {
        return ambariCliApi.getServiceComponentInfo(clusterName, serviceName, sqoop);
    }
}
