package vn.mvs.ambari.pojo.base;

import com.google.gson.annotations.SerializedName;

/**
 * Created by tienbm on 30/10/2014.
 */
public class Request {
    private class Requests{

        private Integer id;
        private String status;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }
    }

    private String href;

    @SerializedName("Requests")
    private Requests requests;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public Requests getRequests() {
        return requests;
    }

    public void setRequests(Requests requests) {
        this.requests = requests;
    }
}
