package vn.mvs.ambari.ambariclient.services;

import vn.mvs.ambari.ambariclient.AbstractClient;
import vn.mvs.ambari.client.AmbariCliApi;
import vn.mvs.ambari.pojo.base.ServiceComponent;

/**
 * Created by tienbm on 24/10/2014.
 */

public class Zookeeper extends AbstractClient {
    public static final String zookeeperClient = "ZOOKEEPER_CLIENT";
    public static final String zookeeperServer = "ZOOKEEPER_SERVER";

    public Zookeeper(AmbariCliApi cliApi, String clusterName) {
        super(cliApi, clusterName);
        this.serviceName = "MAPREDUCE";
    }

    /**
     * @return
     */
    public ServiceComponent getZookeeperClient() {
        return ambariCliApi.getServiceComponentInfo(clusterName, serviceName, zookeeperClient);
    }

    /**
     * @return
     */
    public ServiceComponent getHistoryServer() {
        return ambariCliApi.getServiceComponentInfo(clusterName, serviceName, zookeeperServer);
    }
}