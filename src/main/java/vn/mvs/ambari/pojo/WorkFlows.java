package vn.mvs.ambari.pojo;

import com.google.gson.annotations.SerializedName;

/**
 * Created by tienbm on 30/10/2014.
 */
public class WorkFlows {
    private class WorkFlow{
        @SerializedName("cluster_name")
        private String clusterName;
        @SerializedName("workflow_id")
        private String workflowId;
        @SerializedName("input_bytes")
        private Integer inputBytes;
        @SerializedName("output_bytes")
        private Integer outputBytes;
        @SerializedName("user_name")
        private String userName;
        @SerializedName("elapsed_time")
        private String elapsedTime;
        @SerializedName("num_jobs_total")
        private Integer numJobsTotal;
        @SerializedName("num_jobs_completed")
        private Integer numJobbsCompleted;
        @SerializedName("name")
        private String name;
        @SerializedName("context")
        private String context;
        @SerializedName("start_time")
        private Long startTime;
        @SerializedName("parent_id")
        private String parentId;

    }

    private String href;
    @SerializedName("Workflow")
    private WorkFlow workFlow;

    @SerializedName("jobs")
    private Jobs[] jobs;

}
