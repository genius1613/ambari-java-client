package vn.mvs.ambari.pojo.cluster;

import com.google.gson.annotations.SerializedName;

/**
 * Created by tienbm on 21/10/2014.
 */
public class Cluster {
    private String href;

    @SerializedName("Clusters")
    private Clusters clusters;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }
}
