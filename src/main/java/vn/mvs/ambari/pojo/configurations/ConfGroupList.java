package vn.mvs.ambari.pojo.configurations;

import com.google.gson.annotations.SerializedName;

/**
 * Created by tienbm on 24/10/2014.
 */
public class ConfGroupList {

    private String href;

    @SerializedName("items")
    private ConfigGroupItem[] items;

    public ConfigGroupItem[] getItems() {
        return items;
    }

    public void setItems(ConfigGroupItem[] items) {
        this.items = items;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }
}
