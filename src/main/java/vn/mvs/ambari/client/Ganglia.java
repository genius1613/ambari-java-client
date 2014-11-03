package vn.mvs.ambari.client;

import vn.mvs.ambari.retrofit.AmbariCliApi;
import vn.mvs.ambari.pojo.base.ServiceComponent;

/**
 * Created by tienbm on 23/10/2014.
 */
public class Ganglia extends AbstractClient {

    public static final String gangliaMonitor = "GANGLIA_MONITOR";
    public static final String gangliaServer = "GANGLIA_SERVER";
    public Ganglia(AmbariCliApi cliApi, String clusterName) {
        super(cliApi, clusterName);
        this.serviceName = "GANGLIA";
    }

    /**
     *
     * @return
     */
    public ServiceComponent getGangliaMonitor(){
        return ambariCliApi.getServiceComponentInfo(clusterName, serviceName, gangliaMonitor);
    }

    /**
     *
     * @return
     */
    public ServiceComponent getGangliaServer(){
        return ambariCliApi.getServiceComponentInfo(clusterName, serviceName, gangliaServer);
    }
}
