package vn.mvs.ambari.ambariclient.services;

import vn.mvs.ambari.ambariclient.AbstractClient;
import vn.mvs.ambari.client.AmbariCliApi;
import vn.mvs.ambari.pojo.base.ServiceComponent;

/**
 * Created by tienbm on 24/10/2014.
 */
public class OozieClient extends AbstractClient {
    public static final String oozieClient = "OOZIE_CLIENT";
    public static final String oozieServer = "OOZIE_SERVER";

    public OozieClient(AmbariCliApi cliApi, String clusterName) {
        super(cliApi, clusterName);
        this.serviceName = "MAPREDUCE";
    }

    /**
     * @return
     */
    public ServiceComponent getOozieClient() {
        return ambariCliApi.getServiceComponentInfo(clusterName, serviceName, oozieClient);
    }

    /**
     *
     * @return
     */
    public ServiceComponent getOozieServer() {
        return ambariCliApi.getServiceComponentInfo(clusterName, serviceName, oozieServer);
    }
}
