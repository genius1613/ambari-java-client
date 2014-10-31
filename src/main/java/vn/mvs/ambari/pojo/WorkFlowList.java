package vn.mvs.ambari.pojo;

import com.google.gson.annotations.SerializedName;

/**
 * Created by tienbm on 31/10/2014.
 */
public class WorkFlowList {
    private String href;

    @SerializedName("items")
    private WorkFlows items;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public WorkFlows getItems() {
        return items;
    }

    public void setItems(WorkFlows items) {
        this.items = items;
    }
}
