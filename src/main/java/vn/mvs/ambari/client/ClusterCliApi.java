package vn.mvs.ambari.client;

import com.google.gson.JsonObject;
import retrofit.http.*;
import vn.mvs.ambari.pojo.cluster.ClusterInfo;

/**
 * Created by tienbm on 21/10/2014.
 */
public interface ClusterCliApi {
    public static final String ROOT_PATH = "/clusters";

    @GET(ROOT_PATH)
    public ClusterInfo getClusterInfomations(@Query("name") String clusterName);

    @GET(ROOT_PATH)
    public ClusterInfo getClusterList();

    @POST(ROOT_PATH + "/{clusterName}")
    public JsonObject createCluster(@Path("clusterName") String clusterName);

    @DELETE(ROOT_PATH + "/{clusterName}")
    public JsonObject deleteCluster(@Path("clusterName") String clusterName);
}
