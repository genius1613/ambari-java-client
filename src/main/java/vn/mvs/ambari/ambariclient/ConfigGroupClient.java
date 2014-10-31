package vn.mvs.ambari.ambariclient;

import vn.mvs.ambari.client.ConfigCliApi;

/**
 * Created by tienbm on 24/10/2014.
 */
public class ConfigGroupClient {
    private String clusterName;
    private String configGroups = "config_groups";
    public ConfigGroupClient(ConfigCliApi configCliApi, String clusterName){
        this.clusterName=  clusterName;
    }

}
