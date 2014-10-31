package vn.mvs.ambari.ambariclient.services;

import vn.mvs.ambari.ambariclient.AbstractClient;
import vn.mvs.ambari.client.AmbariCliApi;
import vn.mvs.ambari.pojo.base.ServiceComponent;

/**
 * Created by tienbm on 22/10/2014.
 */
public class HdfsClient extends AbstractClient {

    private static String nameNode = "NAMENODE";
    private static String dataNode = "DATANODE";
    private static String secondaryNameNode = "SECONDARY_NAMENODE";
    private static String client = "HDFS_CLIENT";

    /**
     * @param hdfsCliApi
     * @param clusterName
     */
    public HdfsClient(AmbariCliApi hdfsCliApi, String clusterName) {
        super(hdfsCliApi, clusterName);
        this.serviceName = "HDFS";
    }

    /**
     * @return
     */
    public ServiceComponent getNameNode() {
        return ambariCliApi.getServiceComponentInfo(clusterName, serviceName, nameNode);
    }

    /**
     * @return
     */
    public ServiceComponent getDataNode() {
        return ambariCliApi.getServiceComponentInfo(clusterName, serviceName, dataNode);
    }

    /**
     * @return
     */
    public ServiceComponent getClient() {
        return ambariCliApi.getServiceComponentInfo(clusterName, serviceName, client);
    }

    /**
     * @return
     */
    public ServiceComponent getSecondaryNameNode() {
        return ambariCliApi.getServiceComponentInfo(clusterName, serviceName, secondaryNameNode);
    }
}
