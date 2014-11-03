package vn.mvs.ambari.pojo.base;

import com.google.gson.annotations.SerializedName;

/**
 * Created by tienbm on 02/10/2014.
 */
public class Actual_configs {
    @SerializedName("hbase-log4j")
    private String hbaselog4j;

    @SerializedName("mapreduce-log4j")
    private String mapreducelog4j;

    @SerializedName("hbase-site")
    private String hbasesite;

    @SerializedName("global")
    private String global;

    @SerializedName("hdfs-site")
    private String hdfssite;

    @SerializedName("hive-exec-log4j")
    private String hiveExecLog4j;

    @SerializedName("oozie-site")
    private String oozieSite;

    @SerializedName("hive-site")
    private String hiveSite;

    @SerializedName("core-site")
    private String coreSite;

    @SerializedName("mapred-site")
    private String mapredSite;

    @SerializedName("hdfs-log4j")
    private String hdfsLog4j;

    @SerializedName("pig-log4j")
    private String pigLog4j;

    @SerializedName("pig-properties")
    private String pigProperties;

    @SerializedName("zookeeper-log4j")
    private String oozieLog4j;

    @SerializedName("oozie-log4j")
    private String webhcatSite;

    @SerializedName("hive-log4j")
    private String hiveLog4j;

    @SerializedName("zoo.cfg")
    private String zooCfg;

    public String getHbaselog4j() {
        return hbaselog4j;
    }

    public void setHbaselog4j(String hbaselog4j) {
        this.hbaselog4j = hbaselog4j;
    }

    public String getMapreducelog4j() {
        return mapreducelog4j;
    }

    public void setMapreducelog4j(String mapreducelog4j) {
        this.mapreducelog4j = mapreducelog4j;
    }

    public String getHbasesite() {
        return hbasesite;
    }

    public void setHbasesite(String hbasesite) {
        this.hbasesite = hbasesite;
    }

    public String getGlobal() {
        return global;
    }

    public void setGlobal(String global) {
        this.global = global;
    }

    public String getHdfssite() {
        return hdfssite;
    }

    public void setHdfssite(String hdfssite) {
        this.hdfssite = hdfssite;
    }

    public String getHiveExecLog4j() {
        return hiveExecLog4j;
    }

    public void setHiveExecLog4j(String hiveExecLog4j) {
        this.hiveExecLog4j = hiveExecLog4j;
    }

    public String getOozieSite() {
        return oozieSite;
    }

    public void setOozieSite(String oozieSite) {
        this.oozieSite = oozieSite;
    }

    public String getHiveSite() {
        return hiveSite;
    }

    public void setHiveSite(String hiveSite) {
        this.hiveSite = hiveSite;
    }

    public String getCoreSite() {
        return coreSite;
    }

    public void setCoreSite(String coreSite) {
        this.coreSite = coreSite;
    }

    public String getMapredSite() {
        return mapredSite;
    }

    public void setMapredSite(String mapredSite) {
        this.mapredSite = mapredSite;
    }

    public String getHdfsLog4j() {
        return hdfsLog4j;
    }

    public void setHdfsLog4j(String hdfsLog4j) {
        this.hdfsLog4j = hdfsLog4j;
    }

    public String getPigLog4j() {
        return pigLog4j;
    }

    public void setPigLog4j(String pigLog4j) {
        this.pigLog4j = pigLog4j;
    }

    public String getPigProperties() {
        return pigProperties;
    }

    public void setPigProperties(String pigProperties) {
        this.pigProperties = pigProperties;
    }

    public String getOozieLog4j() {
        return oozieLog4j;
    }

    public void setOozieLog4j(String oozieLog4j) {
        this.oozieLog4j = oozieLog4j;
    }

    public String getWebhcatSite() {
        return webhcatSite;
    }

    public void setWebhcatSite(String webhcatSite) {
        this.webhcatSite = webhcatSite;
    }

    public String getHiveLog4j() {
        return hiveLog4j;
    }

    public void setHiveLog4j(String hiveLog4j) {
        this.hiveLog4j = hiveLog4j;
    }

    public String getZooCfg() {
        return zooCfg;
    }

    public void setZooCfg(String zooCfg) {
        this.zooCfg = zooCfg;
    }
}