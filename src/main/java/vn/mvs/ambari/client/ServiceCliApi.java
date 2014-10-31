package vn.mvs.ambari.client;

import retrofit.http.GET;
import vn.mvs.ambari.pojo.common.ServiceState;

/**
 * Created by tienbm on 25/09/2014.
 */
public interface ServiceCliApi {

    // The path where we expect the VideoSvc to live
    public static final String SERVICE_STATE_PATH = "/services?fields=ServiceInfo/state";

    @GET(SERVICE_STATE_PATH)
    public ServiceState getServiceState();

}
