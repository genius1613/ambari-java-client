package vn.mvs.ambari.client;

import retrofit.http.GET;
import retrofit.http.Path;
import vn.mvs.ambari.pojo.JobList;
import vn.mvs.ambari.pojo.Jobs;

/**
 * Created by tienbm on 24/10/2014.
 */
public interface JobCliApi extends AmbariCliApi {

    /**
     *
     * @param clusterName
     * @param workflowid
     * @param jobid
     * @return
     */
    @GET("/clusters/{clusterName}/workflows/{workflowid}/jobs/{jobid}")
    public Jobs getJobInfo(@Path("clusterName") String clusterName,
                           @Path("workflowid") String workflowid,
                           @Path("jobid") String jobid);

    /**
     *
     * @param clusterName
     * @param workflowid
     * @return
     */
    @GET("/clusters/{clusterName}/workflows/{workflowid}/jobs")
    public JobList listJobs(@Path("clusterName") String clusterName,
                            @Path("workflowid") String workflowid);
}
