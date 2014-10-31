package vn.mvs.ambari.client;

import com.google.gson.JsonObject;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.POST;

import vn.mvs.ambari.pojo.Service;
import vn.mvs.ambari.pojo.ServiceList;
import vn.mvs.ambari.pojo.base.ServiceComponent;
import vn.mvs.ambari.pojo.base.ServiceComponentList;
import vn.mvs.ambari.pojo.common.HostComponentList;

/**
 * Created by tienbm on 21/10/2014.
 */
public interface AmbariCliApi {

    /**
     *
     * @param clusterName
     * @param serviceName
     * @return
     */
    @GET("/clusters/{clusterName}/services/{serviceName}/components")
    public ServiceComponentList listServiceComponents(@Path("clusterName") String clusterName,
                                                 @Path("serviceName") String serviceName);

    /**
     *
     * @param clusterName
     * @param serviceName
     * @param componentName
     * @return
     */
    @GET("/clusters/{clusterName}/services/{serviceName}/components/{componentName}")
    public ServiceComponent getServiceComponentInfo(@Path("clusterName") String clusterName,
                                      @Path("serviceName") String serviceName,
                                      @Path("componentName") String componentName);

    /**
     *
     * @param clusterName
     * @param serviceName
     * @param componentName
     * @return
     */
    @POST("/clusters/{clusterName}/services/{serviceName}/components/{componentName}")
    public JsonObject createServiceComponent(@Path("clusterName") String clusterName,
                                      @Path("serviceName") String serviceName,
                                      @Path("componentName") String componentName);


    /**
     *
     * @param clusterName
     * @return
     */
    @GET("/clusters/{clusterName}/services")
    public ServiceList listServices(@Path("clusterName")String clusterName);

    /**
     *
     * @param clusterName
     * @param serviceName
     * @return
     */
    @GET("/clusters/{clusterName}/services/{serviceName}")
    public Service getServiceInfo(@Path("clusterName")String clusterName,
                                      @Path("serviceName") String serviceName);


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
     * @param hostName
     * @return
     */
    @GET("/clusters/{clusterName}/hosts/{hostName}/host_components")
    public HostComponentList listHostComponents(@Path("clusterName") String clusterName,
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



}
