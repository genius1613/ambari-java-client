package vn.mvs.ambari.ambariclient.services;

import vn.mvs.ambari.ambariclient.AbstractClient;
import vn.mvs.ambari.client.AmbariCliApi;
import vn.mvs.ambari.pojo.base.ServiceComponent;

/**
 * Created by tienbm on 23/10/2014.
 */
public class HiveClient extends AbstractClient {

    public static final String hiveClient = "HIVE_CLIENT";
    public static final String hiveMetaStore = "HIVE_METASTORE";
    public static final String hiveServer = "HIVE_SERVER";
    public static final String mysqlServer = "MySQL_SERVER";

    public HiveClient(AmbariCliApi cliApi, String clusterName) {
        super(cliApi, clusterName);
        this.serviceName = "HIVE";
    }

    /**
     * @return
     */
    public ServiceComponent getHiveClient() {
        return ambariCliApi.getServiceComponentInfo(clusterName, serviceName, hiveClient);
    }

    /**
     * @return
     */
    public ServiceComponent getHiveMetaStore() {
        return ambariCliApi.getServiceComponentInfo(clusterName, serviceName, hiveMetaStore);
    }

    /**
     * @return
     */
    public ServiceComponent getHiveServer() {
        return ambariCliApi.getServiceComponentInfo(clusterName, serviceName, hiveServer);
    }

    /**
     *
     * @return
     */
    public ServiceComponent getMysqlServer() {
        return ambariCliApi.getServiceComponentInfo(clusterName, serviceName, mysqlServer);
    }
}
