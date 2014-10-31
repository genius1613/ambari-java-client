package vn.mvs.ambari.client;

import com.google.gson.JsonObject;
import retrofit.http.*;
import vn.mvs.ambari.pojo.*;
import vn.mvs.ambari.pojo.base.HostComponent;
import vn.mvs.ambari.pojo.base.HostComponentList;
import vn.mvs.ambari.pojo.base.Request;

/**
 * Created by tienbm on 24/10/2014.
 */
public interface HostCliApi {

    /**
     * @param clusterName
     * @param hostName
     * @return
     */
    @POST("/clusters/{clusterName}/hosts/{hostName}")
    public JsonObject createHost(@Path("clusterName") String clusterName,
                                 @Path("hostName") String hostName);

    /**
     * @param clusterName
     * @return
     */
    @GET("/clusters/{clusterName}/hosts")
    public HostList getHostList(@Path("clusterName") String clusterName);


    /**
     * @param clusterName
     * @param hostName
     * @return
     */
    @GET("/clusters/{clusterName}/hosts/{hostName}")
    public Host getHostInfo(@Path("clusterName") String clusterName,
                            @Path("hostName") String hostName);

    /**
     * @param clusterName
     * @param hostName
     * @return
     */
    @GET("/clusters/{clusterName}/hosts/{hostName}/host_components")
    public HostComponentList listHostComponent(@Path("clusterName") String clusterName,
                                               @Path("hostName") String hostName);

    /**
     * @param clusterName
     * @param hostName
     * @param componentName
     * @return
     */
    @POST("/clusters/{clusterName}/hosts/{hostName}/host_components/{componentName}")
    public JsonObject createHostComponent(@Path("clusterName") String clusterName,
                                          @Path("hostName") String hostName,
                                          @Path("componentName") String componentName);

    /**
     *
     * @param clusterName
     * @param hostName
     * @return
     */
    @GET("/clusters/{clusterName}/hosts/{hostName}/host_components/{componentName}")
    public HostComponent getHostComponentInfo(@Path("clusterName") String clusterName,
                                              @Path("hostName") String hostName);

    /**
     *
     * @param clusterName
     * @param serviceName
     * @param componentName
     * @param hostComponent
     * @return
     */
    @PUT("/clusters/{clusterName}/hosts/{hostName}/host_components/{componentName}")
    public Request updateHostComponent(@Path("clusterName") String clusterName,
                                       @Path("hostName") String serviceName,
                                       @Path("componentName") String componentName,
                                       @Body HostComponent hostComponent);



}

