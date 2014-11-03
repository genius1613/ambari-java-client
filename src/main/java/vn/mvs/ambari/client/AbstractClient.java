package vn.mvs.ambari.client;

import com.google.gson.JsonObject;
import vn.mvs.ambari.retrofit.AmbariCliApi;
import vn.mvs.ambari.pojo.base.ServiceComponent;
import vn.mvs.ambari.pojo.base.ServiceComponentList;

/**
 * Created by tienbm on 23/10/2014.
 */
public  class AbstractClient {
    protected AmbariCliApi ambariCliApi;
    protected String clusterName;
    protected String serviceName;


    public AbstractClient(AmbariCliApi cliApi, String clusterName) {
        this.ambariCliApi = cliApi;
        this.clusterName = clusterName;
    }

    /**
     * @return
     */
    public ServiceComponent[] listServiceComponents() {
        ServiceComponentList serviceComponentList = ambariCliApi.listServiceComponents(clusterName, serviceName);
        return serviceComponentList.getItems();
    }

    /**
     * @param componentName
     * @return
     */

    public JsonObject createServiceComponent(String componentName) {
        return ambariCliApi.createServiceComponent(clusterName, serviceName, componentName);
    }


}
