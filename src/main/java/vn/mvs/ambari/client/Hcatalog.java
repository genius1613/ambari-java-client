package vn.mvs.ambari.client;

import vn.mvs.ambari.retrofit.AmbariCliApi;
import vn.mvs.ambari.pojo.base.ServiceComponent;

/**
 * Created by tienbm on 23/10/2014.
 */
public class Hcatalog extends AbstractClient {

    private static final String hcat = "HCAT";

    public Hcatalog(AmbariCliApi cliApi, String clusterName) {
        super(cliApi, clusterName);
        this.serviceName = "HCATALOG";
    }

    /**
     * @return
     */
    public ServiceComponent getGangliaMonitor() {
        return ambariCliApi.getServiceComponentInfo(clusterName, serviceName, hcat);
    }

}
