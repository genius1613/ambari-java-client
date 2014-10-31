package vn.mvs.ambari.pojo.base;

import vn.mvs.ambari.pojo.base.HostComponent;

/**
 * Created by tienbm on 29/10/2014.
 */
public class HostComponentList {
    private String href;
    private HostComponent items;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public HostComponent getItems() {
        return items;
    }

    public void setItems(HostComponent items) {
        this.items = items;
    }
}
