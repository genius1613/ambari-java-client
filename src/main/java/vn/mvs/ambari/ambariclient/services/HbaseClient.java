package vn.mvs.ambari.ambariclient.services;

import vn.mvs.ambari.ambariclient.AbstractClient;
import vn.mvs.ambari.client.AmbariCliApi;
import vn.mvs.ambari.pojo.base.ServiceComponent;

/**
 * Created by tienbm on 22/10/2014.
 */
public class HbaseClient extends AbstractClient {

    private final static String hbaseClient = "HBASE_CLIENT";
    private final static String hbaseMaster = "HBASE_MASTER";
    private final static String hbaseRegionServer = "HBASE_REGIONSERVER";

    public HbaseClient(AmbariCliApi cliApi, String clusterName) {
        super(cliApi, clusterName);
        this.serviceName = "HBASE";
    }

    /**
     * @return
     */
    public ServiceComponent getHbaseMaster() {
        return this.ambariCliApi.getServiceComponentInfo(clusterName, serviceName, hbaseMaster);
    }

    /**
     * @return
     */
    public ServiceComponent getHbaseRegionServer() {
        return ambariCliApi.getServiceComponentInfo(clusterName, serviceName, hbaseRegionServer);
    }

    /**
     *
     * @return
     */
    public ServiceComponent getHbaseClient() {
        return ambariCliApi.getServiceComponentInfo(clusterName, serviceName, hbaseClient);
    }
}
