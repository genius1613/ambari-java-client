package vn.mvs.ambari.retrofit;

import retrofit.http.GET;
import retrofit.http.Path;
import vn.mvs.ambari.pojo.WorkFlowList;
import vn.mvs.ambari.pojo.WorkFlows;

/**
 * Created by tienbm on 24/10/2014.
 */
public interface WorkFlowCliApi {

    /**
     * @param clusterName
     * @return
     */
    @GET("/clusters/{clusterName}/workflows")
    public WorkFlowList listWorkFlows(@Path("clusterName") String clusterName);

    /**
     * @param clusterName
     * @param workflowId
     * @return
     */
    @GET("/clusters/{clusterName}/workflows/{workflowid}")
    public WorkFlows getWorkFlowInfo(@Path("clusterName") String clusterName,
                                     @Path("workflowid") String workflowId);
}
