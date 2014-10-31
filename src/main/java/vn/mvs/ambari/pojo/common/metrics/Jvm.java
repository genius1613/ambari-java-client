package vn.mvs.ambari.pojo.common.metrics;

/**
 * Created by tienbm on 25/09/2014.
 */

public class Jvm {
    private String gcCount;
    private String gcTimeMillis;
    private String logError;
    private String logFatal;
    private String logInfo;
    private String logWarn;
    private String maxMemoryM;
    private String memHeapCommittedM;
    private String memNonHeapUsedM;
    private String memNonHeapCommittedM;
    private String memHeapUsedM;
    private String threadsBlocked;
    private String threadsNew;
    private String threadsRunnable;
    private String threadsTerminated;
    private String threadsWaiting;
    private String threadsTimedWaiting;


    public String getMemHeapCommittedM() {
        return memHeapCommittedM;
    }

    public void setMemHeapCommittedM(String memHeapCommittedM) {
        this.memHeapCommittedM = memHeapCommittedM;
    }

    public String getLogFatal() {
        return logFatal;
    }

    public void setLogFatal(String logFatal) {
        this.logFatal = logFatal;
    }

    public String getThreadsWaiting() {
        return threadsWaiting;
    }

    public void setThreadsWaiting(String threadsWaiting) {
        this.threadsWaiting = threadsWaiting;
    }

    public String getGcCount() {
        return gcCount;
    }

    public void setGcCount(String gcCount) {
        this.gcCount = gcCount;
    }

    public String getThreadsBlocked() {
        return threadsBlocked;
    }

    public void setThreadsBlocked(String threadsBlocked) {
        this.threadsBlocked = threadsBlocked;
    }

    public String getLogError() {
        return logError;
    }

    public void setLogError(String logError) {
        this.logError = logError;
    }

    public String getLogWarn() {
        return logWarn;
    }

    public void setLogWarn(String logWarn) {
        this.logWarn = logWarn;
    }

    public String getMemNonHeapCommittedM() {
        return memNonHeapCommittedM;
    }

    public void setMemNonHeapCommittedM(String memNonHeapCommittedM) {
        this.memNonHeapCommittedM = memNonHeapCommittedM;
    }

    public String getGcTimeMillis() {
        return gcTimeMillis;
    }

    public void setGcTimeMillis(String gcTimeMillis) {
        this.gcTimeMillis = gcTimeMillis;
    }

    public String getMemNonHeapUsedM() {
        return memNonHeapUsedM;
    }

    public void setMemNonHeapUsedM(String memNonHeapUsedM) {
        this.memNonHeapUsedM = memNonHeapUsedM;
    }

    public String getLogInfo() {
        return logInfo;
    }

    public void setLogInfo(String logInfo) {
        this.logInfo = logInfo;
    }

    public String getMemHeapUsedM() {
        return memHeapUsedM;
    }

    public void setMemHeapUsedM(String memHeapUsedM) {
        this.memHeapUsedM = memHeapUsedM;
    }

    public String getThreadsNew() {
        return threadsNew;
    }

    public void setThreadsNew(String threadsNew) {
        this.threadsNew = threadsNew;
    }

    public String getThreadsTerminated() {
        return threadsTerminated;
    }

    public void setThreadsTerminated(String threadsTerminated) {
        this.threadsTerminated = threadsTerminated;
    }

    public String getThreadsTimedWaiting() {
        return threadsTimedWaiting;
    }

    public void setThreadsTimedWaiting(String threadsTimedWaiting) {
        this.threadsTimedWaiting = threadsTimedWaiting;
    }

    public String getMaxMemoryM() {
        return maxMemoryM;
    }

    public void setMaxMemoryM(String maxMemoryM) {
        this.maxMemoryM = maxMemoryM;
    }

    public String getThreadsRunnable() {
        return threadsRunnable;
    }

    public void setThreadsRunnable(String threadsRunnable) {
        this.threadsRunnable = threadsRunnable;
    }
}

