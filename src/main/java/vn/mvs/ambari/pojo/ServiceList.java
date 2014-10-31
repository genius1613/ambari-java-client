package vn.mvs.ambari.pojo;

import com.google.gson.annotations.SerializedName;

/**
 * Created by tienbm on 28/10/2014.
 */
public class ServiceList {
    private String href;

    @SerializedName("items")
    private Service[] items;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public Service[] getItems() {
        return items;
    }

    public void setItems(Service[] items) {
        this.items = items;
    }
}
