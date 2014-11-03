package vn.mvs.ambari.retrofit;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.junit.Test;
import retrofit.RestAdapter;

import retrofit.converter.GsonConverter;

/**
 * Created by tienbm on 25/09/2014.
 */
public class ServiceListClientApiTest {
    private final String TEST_URL = "http://123.30.245.21:8081/api/v1/clusters/hadoop";

    private Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
//    private Gson gson = new GsonBuilder().create();


    private AmbariCliApi videoService = new RestAdapter.Builder()
            .setEndpoint(TEST_URL)
            .setConverter(new GsonConverter(gson)).build()
            .create(AmbariCliApi.class);


    /**
     * This test creates a Video, adds the Video to the VideoSvc, and then
     * checks that the Video is included in the list when getVideoList() is
     * called.
     *
     * @throws Exception
     */


}
