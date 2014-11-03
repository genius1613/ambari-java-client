package vn.mvs.ambari.client;

import vn.mvs.ambari.retrofit.AmbariCliApi;
import vn.mvs.ambari.pojo.base.ServiceComponent;

/**
 * Created by tienbm on 23/10/2014.
 */
public class Hive extends AbstractClient {

    public static final String hiveClient = "HIVE_CLIENT";
    public static final String hiveMetaStore = "HIVE_METASTORE";
    public static final String hiveServer = "HIVE_SERVER";
    public static final String mysqlServer = "MySQL_SERVER";

    public Hive(AmbariCliApi cliApi, String clusterName) {
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
