package vn.mvs.ambari.pojo;

import vn.mvs.ambari.pojo.base.hosts.Hosts;
import vn.mvs.ambari.pojo.common.Alerts;
import vn.mvs.ambari.pojo.base.HostComponent;
import vn.mvs.ambari.pojo.common.Metrics;

/**
 * Created by tienbm on 29/10/2014.
 */
public class Host {
    private String href;
    private Hosts hosts;
    private Alerts alerts;
    private Metrics metrics;
    private HostComponent[] host_components;
}
