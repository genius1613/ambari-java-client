package vn.mvs.ambari.retrofit;

import com.google.gson.JsonObject;
import retrofit.http.*;
import vn.mvs.ambari.pojo.configurations.*;

/**
 * Created by tienbm on 24/10/2014.
 */
public interface ConfigCliApi {

    /**
     * @param clusterName
     * @param query
     * @return
     */
    @GET("/clusters/{clusterName}/config_groups")
    public ConfGroupList getConfigGroupList(@Path("clusterName") String clusterName,
                                            @Path("query") String query);

    /**
     * @param clusterName
     * @param id
     * @return
     */
    @GET("/api/v1/clusters/{clusterName}/config_groups/{id}")
    public ConfigGroupItem getConfigGroupInfo(@Path("clusterName") String clusterName,
                                              @Path("id") String id);

    /**
     * @param clusterName
     * @param configGroups
     * @return
     */
    @POST("/api/v1/clusters/{clusterName}/config_groups")
    public JsonObject createConfigGroup(@Path("clusterName") String clusterName,
                                        @Body ConfigGroup[] configGroups);

    /**
     * @param clusterName
     * @param id
     * @param configGroup
     * @return
     */
    @PUT("/api/v1/clusters/{clusterName}/config_groups/{cgroup_id}")
    public JsonObject updateConfigGroup(@Path("clusterName") String clusterName,
                                        @Path("cgroup_id") String id,
                                        @Body ConfigGroup configGroup);
}
