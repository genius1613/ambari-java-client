package vn.mvs.ambari.pojo.configurations;

import com.google.gson.annotations.SerializedName;

/**
 * Created by tienbm on 24/10/2014.
 */
public class ConfigGroup {
    private String id;

    private String cluster_name;

    @SerializedName("description")
    private String description;

    @SerializedName("desired_configs")
    private DesiredConfig[] desired_Configs;

    @SerializedName("tag")
    private String tag;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCluster_name() {
        return cluster_name;
    }

    public void setCluster_name(String cluster_name) {
        this.cluster_name = cluster_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public DesiredConfig[] getDesired_Configs() {
        return desired_Configs;
    }

    public void setDesired_Configs(DesiredConfig[] desired_Configs) {
        this.desired_Configs = desired_Configs;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    private class DesiredConfig {

        private String tag;
        private String type;
        private String href;

        public String getTag() {
            return tag;
        }

        public void setTag(String tag) {
            this.tag = tag;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }
    }

    private class Host {
        private String host_name;
        private String href;

        public String getHost_name() {
            return host_name;
        }

        public void setHost_name(String host_name) {
            this.host_name = host_name;
        }

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }
    }
}