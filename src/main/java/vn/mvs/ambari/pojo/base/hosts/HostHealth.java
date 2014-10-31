package vn.mvs.ambari.pojo.base.hosts;

import com.google.gson.annotations.SerializedName;

/**
 * Created by tienbm on 25/10/2014.
 */
public class HostHealth {
    @SerializedName("activeJavaProcs")
    private ActiveJavaProc[] activeJavaProcs;

    private String serverTimeStampAtReporting;

    @SerializedName("liveServices")
    private LiveService[] liveServices;

    @SerializedName("agentTimeStampAtReporting")
    private String agentTimeStampAtReporting;



    public String getServerTimeStampAtReporting() {
        return serverTimeStampAtReporting;
    }

    public void setServerTimeStampAtReporting(String serverTimeStampAtReporting) {
        this.serverTimeStampAtReporting = serverTimeStampAtReporting;
    }

    public LiveService[] getLiveServices() {
        return liveServices;
    }

    public void setLiveServices(LiveService[] liveServices) {
        this.liveServices = liveServices;
    }

    public String getAgentTimeStampAtReporting() {
        return agentTimeStampAtReporting;
    }

    public void setAgentTimeStampAtReporting(String agentTimeStampAtReporting) {
        this.agentTimeStampAtReporting = agentTimeStampAtReporting;
    }

    public ActiveJavaProc[] getActiveJavaProcs() {
        return activeJavaProcs;
    }

    public void setActiveJavaProcs(ActiveJavaProc[] activeJavaProcs) {
        this.activeJavaProcs = activeJavaProcs;
    }
}
