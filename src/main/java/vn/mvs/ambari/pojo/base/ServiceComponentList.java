package vn.mvs.ambari.pojo.base;

/**
 * Created by tienbm on 21/10/2014.
 */
public class ServiceComponentList {
    private String href;
    private ServiceComponent[] items;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public ServiceComponent[] getItems() {
        return items;
    }

    public void setItems(ServiceComponent[] items) {
        this.items = items;
    }
}
