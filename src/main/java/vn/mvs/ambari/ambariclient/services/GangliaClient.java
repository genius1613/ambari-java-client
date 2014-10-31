package vn.mvs.ambari.ambariclient.services;

import vn.mvs.ambari.ambariclient.AbstractClient;
import vn.mvs.ambari.client.AmbariCliApi;
import vn.mvs.ambari.pojo.base.ServiceComponent;

/**
 * Created by tienbm on 23/10/2014.
 */
public class GangliaClient extends AbstractClient {

    public static final String gangliaMonitor = "GANGLIA_MONITOR";
    public static final String gangliaServer = "GANGLIA_SERVER";
    public GangliaClient(AmbariCliApi cliApi, String clusterName) {
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
