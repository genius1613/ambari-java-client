package vn.mvs.ambari.ambariclient.services;

import vn.mvs.ambari.ambariclient.AbstractClient;
import vn.mvs.ambari.client.AmbariCliApi;
import vn.mvs.ambari.pojo.base.ServiceComponent;

/**
 * Created by tienbm on 24/10/2014.
 */
public class SqoopClient extends AbstractClient {
    public static final String sqoop = "SQOOP";

    public SqoopClient(AmbariCliApi cliApi, String clusterName) {
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
