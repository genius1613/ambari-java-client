package vn.mvs.ambari.pojo.cluster;

import com.google.gson.annotations.SerializedName;

/**
 * Created by tienbm on 09/10/2014.
 */
public class Desired_configs {
    @SerializedName("hbase-log4j")
    private Cfg hbase_log4j;

    @SerializedName("mapreduce-log4j")
    private Cfg mapreduce_log4j;

    @SerializedName("hbase-site")
    private Cfg hbase_site;

    @SerializedName("global")
    private Cfg global;

    @SerializedName("hdfs-site")
    private Cfg hdfs_site;

    @SerializedName("hive-exec-log4j")
    private Cfg hive_exec_log4j;

    @SerializedName("oozie-site")
    private Cfg oozie_site;

    @SerializedName("hive-site")
    private Cfg hive_site;

    @SerializedName("core-site")
    private Cfg core_site;

    @SerializedName("mapred-site")
    private Cfg mapred_site;

    @SerializedName("zookeeper-log4j")
    private Cfg zookeeper_log4j;

    @SerializedName("hdfs-log4j")
    private Cfg hdfs_log4j;

    @SerializedName("pig-log4j")
    private Cfg pig_log4j;

    @SerializedName("pig-properties")
    private Cfg pig_properties;

    @SerializedName("oozie-log4j")
    private Cfg oozie_log4j;

    @SerializedName("wehcat-sites")
    private Cfg webhcat_site;

    @SerializedName("hive-log4j")
    private Cfg hive_log4j;

    @SerializedName("zoo.cfg")
    private Cfg zoo_cfg;


    private class Cfg {
        private String tag;

        private String user;

        @SerializedName("default")
        private String defaults;

        public String getDefaults() {
            return defaults;
        }

        public void setDefaults(String defaults) {
            this.defaults = defaults;
        }

        public String getUser() {
            return user;
        }

        public void setUser(String user) {
            this.user = user;
        }

        public String getTag() {
            return tag;
        }

        public void setTag(String tag) {
            this.tag = tag;
        }
    }

    public Cfg getHbase_log4j() {
        return hbase_log4j;
    }

    public void setHbase_log4j(Cfg hbase_log4j) {
        this.hbase_log4j = hbase_log4j;
    }
}
