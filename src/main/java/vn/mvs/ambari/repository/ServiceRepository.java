package vn.mvs.ambari.repository;

import vn.mvs.ambari.pojo.common.ServiceState;
/**
 * Created by tienbm on 25/09/2014.
 */
public interface ServiceRepository {
    public ServiceState getServiceState();
}
