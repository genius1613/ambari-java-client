package vn.mvs.ambari.client;

import vn.mvs.ambari.retrofit.AmbariCliApi;
import vn.mvs.ambari.pojo.base.ServiceComponent;

/**
 * Created by tienbm on 23/10/2014.
 */
public class Mapreduce extends AbstractClient {

    public static final String mapreduceClient = "MAPREDUCE_CLIENT";
    public static final String jobTracker = "JOBTRACKER";
    public static final String historyServer = "HISTORYSERVER";
    public static final String taskTracker = "TASKTRACKER";

    public Mapreduce(AmbariCliApi cliApi, String clusterName) {
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
