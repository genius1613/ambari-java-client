package vn.mvs.ambari.retrofit;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.junit.Test;
import retrofit.RestAdapter;
import retrofit.converter.GsonConverter;
import vn.mvs.ambari.pojo.base.ServiceComponent;

/**
 * Created by tienbm on 22/10/2014.
 */
public class HdfsClientApiTest {
    private final String TEST_URL = "http://123.30.245.21:8081/api/v1/";

   // private Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
    private Gson gson = new GsonBuilder().create();
    private AmbariCliApi ambariCliApi = new RestAdapter.Builder()
            .setEndpoint(TEST_URL).setLogLevel(RestAdapter.LogLevel.HEADERS)
            .setConverter(new GsonConverter(gson)).build()
            .create(AmbariCliApi.class);

    @Test
    public void testGetService(){
        ServiceComponent dataNode = ambariCliApi.getServiceComponentInfo("hadoop", "HDFS","DATANODE");
        System.out.println(dataNode.getHref());
        String data = "http://123.30.245.21:8081/api/v1/clusters/hadoop/services/HDFS/components/DATANODE";
        System.out.println(dataNode.getServiceComponentInfo().getComponent_name());
        System.out.println(dataNode.getMetrics().getJvm().getLogError());
        System.out.println(dataNode.getHost_components()[0].getHref());


        //   Assert.assertEquals(data, dataNode.getHref());

    }
}
