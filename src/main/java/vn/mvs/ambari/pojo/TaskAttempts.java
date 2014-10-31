package vn.mvs.ambari.pojo;

import com.google.gson.annotations.SerializedName;

/**
 * Created by tienbm on 31/10/2014.
 */
public class TaskAttempts {
    public class TaskAttempt {
        private String cluster_name;
        private String workflow_id;
        private String job_id;
        private String task_attempt_id;
        private String status;
        private String finish_time;

        private String input_bytes;

        private String type;

        private String output_bytes;
        private String shuffle_finish_time;
        private String locality;

        private String start_time;

        private String sort_finish_fime;

        private String map_finish_time;

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

        public String getTask_attempt_id() {
            return task_attempt_id;
        }

        public void setTask_attempt_id(String task_attempt_id) {
            this.task_attempt_id = task_attempt_id;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getFinish_time() {
            return finish_time;
        }

        public void setFinish_time(String finish_time) {
            this.finish_time = finish_time;
        }

        public String getInput_bytes() {
            return input_bytes;
        }

        public void setInput_bytes(String input_bytes) {
            this.input_bytes = input_bytes;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getOutput_bytes() {
            return output_bytes;
        }

        public void setOutput_bytes(String output_bytes) {
            this.output_bytes = output_bytes;
        }

        public String getShuffle_finish_time() {
            return shuffle_finish_time;
        }

        public void setShuffle_finish_time(String shuffle_finish_time) {
            this.shuffle_finish_time = shuffle_finish_time;
        }

        public String getLocality() {
            return locality;
        }

        public void setLocality(String locality) {
            this.locality = locality;
        }

        public String getStart_time() {
            return start_time;
        }

        public void setStart_time(String start_time) {
            this.start_time = start_time;
        }

        public String getSort_finish_fime() {
            return sort_finish_fime;
        }

        public void setSort_finish_fime(String sort_finish_fime) {
            this.sort_finish_fime = sort_finish_fime;
        }

        public String getMap_finish_time() {
            return map_finish_time;
        }

        public void setMap_finish_time(String map_finish_time) {
            this.map_finish_time = map_finish_time;
        }
    }

    private String href;
    @SerializedName("TaskAttempt")
    private TaskAttempt taskAttempt;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public TaskAttempt getTaskAttempt() {
        return taskAttempt;
    }

    public void setTaskAttempt(TaskAttempt taskAttempt) {
        this.taskAttempt = taskAttempt;
    }
}
