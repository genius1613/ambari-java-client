package vn.mvs.ambari.pojo;

import com.google.gson.annotations.SerializedName;

/**
 * Created by tienbm on 31/10/2014.
 */
public class JobList {
    private String href;
    @SerializedName("items")
    private Jobs.Job[] items;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public Jobs.Job[] getItems() {
        return items;
    }

    public void setItems(Jobs.Job[] items) {
        this.items = items;
    }
}
