package vn.mvs.ambari.pojo.common.metrics;

/**
 * Created by tienbm on 25/09/2014.
 */

public class Disk {
    private String disk_free;
    private String disk_total;
    private String part_max_used;

    public String getDisk_total() {
        return disk_total;
    }

    public void setDisk_total(String disk_total) {
        this.disk_total = disk_total;
    }

    public String getDisk_free() {
        return disk_free;
    }

    public void setDisk_free(String disk_free) {
        this.disk_free = disk_free;
    }

    public String getPart_max_used() {
        return part_max_used;
    }

    public void setPart_max_used(String part_max_used) {
        this.part_max_used = part_max_used;
    }
}
