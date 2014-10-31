package vn.mvs.ambari.ambariclient.services;

import vn.mvs.ambari.ambariclient.AbstractClient;
import vn.mvs.ambari.client.AmbariCliApi;
import vn.mvs.ambari.pojo.base.ServiceComponent;

/**
 * Created by tienbm on 23/10/2014.
 */
public class HcatalogClient extends AbstractClient {

    private static final String hcat = "HCAT";

    public HcatalogClient(AmbariCliApi cliApi, String clusterName) {
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
