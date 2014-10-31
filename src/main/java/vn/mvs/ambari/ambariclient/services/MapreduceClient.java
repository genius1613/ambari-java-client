package vn.mvs.ambari.ambariclient.services;

import vn.mvs.ambari.ambariclient.AbstractClient;
import vn.mvs.ambari.client.AmbariCliApi;
import vn.mvs.ambari.pojo.base.ServiceComponent;

/**
 * Created by tienbm on 23/10/2014.
 */
public class MapreduceClient extends AbstractClient {

    public static final String mapreduceClient = "MAPREDUCE_CLIENT";
    public static final String jobTracker = "JOBTRACKER";
    public static final String historyServer = "HISTORYSERVER";
    public static final String taskTracker = "TASKTRACKER";

    public MapreduceClient(AmbariCliApi cliApi, String clusterName) {
        super(cliApi, clusterName);
        this.serviceName = "MAPREDUCE";
    }

    /**
     * @return
     */
    public ServiceComponent getMapreduceClient() {
        return ambariCliApi.getServiceComponentInfo(clusterName, serviceName, mapreduceClient);
    }

    /**
     * @return
     */
    public ServiceComponent getJobTracker() {
        return ambariCliApi.getServiceComponentInfo(clusterName, serviceName, jobTracker);
    }

    /**
     * @return
     */
    public ServiceComponent getHistoryServer() {
        return ambariCliApi.getServiceComponentInfo(clusterName, serviceName, historyServer);
    }

    /**
     * @return
     */
    public ServiceComponent getTaskTracker() {
        return ambariCliApi.getServiceComponentInfo(clusterName, serviceName, taskTracker);
    }
}
