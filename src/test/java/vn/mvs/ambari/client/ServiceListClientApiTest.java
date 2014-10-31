package vn.mvs.ambari.client;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.junit.Test;
import retrofit.RestAdapter;

import retrofit.converter.GsonConverter;
import vn.mvs.ambari.pojo.common.ServiceState;

/**
 * Created by tienbm on 25/09/2014.
 */
public class ServiceListClientApiTest {
    private final String TEST_URL = "http://123.30.245.21:8081/api/v1/clusters/hadoop";

    private Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
//    private Gson gson = new GsonBuilder().create();


    private ServiceCliApi videoService = new RestAdapter.Builder()
            .setEndpoint(TEST_URL)
            .setConverter(new GsonConverter(gson)).build()
            .create(ServiceCliApi.class);


    /**
     * This test creates a Video, adds the Video to the VideoSvc, and then
     * checks that the Video is included in the list when getVideoList() is
     * called.
     *
     * @throws Exception
     */
    @Test
    public void testVideoAddAndList() throws Exception {
        // We should get back state of service list
        ServiceState serviceState = videoService.getServiceState();
        System.out.println("---> Starting test function:");
        System.out.println("--->" + serviceState.getHref());

        Gson gson1 = new Gson();
        String json = gson.toJson(serviceState);
        System.out.print(json);

    }


}
