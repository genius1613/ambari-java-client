package vn.mvs.ambari.pojo.cluster;

/**
 * Created by tienbm on 09/10/2014.
 */
public class Configurations {
    private Config Config;

    private String tag;

    private String type;

    private String href;

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Config getConfig() {
        return Config;
    }

    public void setConfig(Config config) {
        Config = config;
    }
}
