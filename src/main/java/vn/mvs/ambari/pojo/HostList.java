package vn.mvs.ambari.pojo;

import com.google.gson.annotations.SerializedName;

/**
 * Created by tienbm on 29/10/2014.
 */
public class HostList {
    private String href;

    @SerializedName("items")
    private Host[] items;
}
