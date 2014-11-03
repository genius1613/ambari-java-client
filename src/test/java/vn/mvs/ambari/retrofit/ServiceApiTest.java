package vn.mvs.ambari.retrofit;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.junit.Test;
import retrofit.RestAdapter;
import retrofit.converter.GsonConverter;
import vn.mvs.ambari.pojo.Service;
import vn.mvs.ambari.pojo.ServiceList;
import vn.mvs.ambari.pojo.base.ServiceComponent;

/**
 * Created by tienbm on 28/10/2014.
 */
public class ServiceApiTest {
    private final String TEST_URL = "http://123.30.245.21:8081/api/v1/";

//    private Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
    private Gson gson = new GsonBuilder().create();


    private AmbariCliApi videoService = new RestAdapter.Builder()
            .setEndpoint(TEST_URL)
            .setConverter(new GsonConverter(gson)).build()
            .create(AmbariCliApi.class);

    @Test
    public void testServiceApi(){
        ServiceList serviceList = videoService.listServices("hadoop");
        Service service = serviceList.getItems()[3];
        System.out.println(gson.toJson(service));

        Service hbase = videoService.getServiceInfo("hadoop", "HBASE");
        System.out.println(gson.toJson(hbase));

        ServiceComponent regionServer = videoService.getServiceComponentInfo("hadoop", "HBASE","HBASE_REGIONSERVER");
        System.out.println(gson.toJson(regionServer));
    }

}
