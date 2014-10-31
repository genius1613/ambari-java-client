package vn.mvs.ambari.pojo;

import com.google.gson.annotations.SerializedName;

/**
 * Created by tienbm on 30/10/2014.
 */
public class Jobs {
    public class Job {
        private String cluster_name;
        private String workflow_id;
        private String job_id;
        private String reduces;
        private String status;
        private String workflow_entity_name;
        private String input_bytes;
        private String output_bytes;
        private String conf_path;
        private String user_name;
        private String elapsed_time;
        private String maps;
        private String name;
        private String submit_time;

        public String getCluster_name() {
            return cluster_name;
        }

        public void setCluster_name(String cluster_name) {
            this.cluster_name = cluster_name;
        }

        public String getWorkflow_id() {
            return workflow_id;
        }

        public void setWorkflow_id(String workflow_id) {
            this.workflow_id = workflow_id;
        }

        public String getJob_id() {
            return job_id;
        }

        public void setJob_id(String job_id) {
            this.job_id = job_id;
        }

        public String getReduces() {
            return reduces;
        }

        public void setReduces(String reduces) {
            this.reduces = reduces;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getWorkflow_entity_name() {
            return workflow_entity_name;
        }

        public void setWorkflow_entity_name(String workflow_entity_name) {
            this.workflow_entity_name = workflow_entity_name;
        }

        public String getInput_bytes() {
            return input_bytes;
        }

        public void setInput_bytes(String input_bytes) {
            this.input_bytes = input_bytes;
        }

        public String getOutput_bytes() {
            return output_bytes;
        }

        public void setOutput_bytes(String output_bytes) {
            this.output_bytes = output_bytes;
        }

        public String getConf_path() {
            return conf_path;
        }

        public void setConf_path(String conf_path) {
            this.conf_path = conf_path;
        }

        public String getUser_name() {
            return user_name;
        }

        public void setUser_name(String user_name) {
            this.user_name = user_name;
        }

        public String getElapsed_time() {
            return elapsed_time;
        }

        public void setElapsed_time(String elapsed_time) {
            this.elapsed_time = elapsed_time;
        }

        public String getMaps() {
            return maps;
        }

        public void setMaps(String maps) {
            this.maps = maps;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSubmit_time() {
            return submit_time;
        }

        public void setSubmit_time(String submit_time) {
            this.submit_time = submit_time;
        }
    }

    private String href;
    @SerializedName("Job")
    private Job job;
    @SerializedName("taskattempts")
    private TaskAttempts.TaskAttempt[] taskAttempts;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public TaskAttempts.TaskAttempt[] getTaskAttempts() {
        return taskAttempts;
    }

    public void setTaskAttempts(TaskAttempts.TaskAttempt[] taskAttempts) {
        this.taskAttempts = taskAttempts;
    }
}
