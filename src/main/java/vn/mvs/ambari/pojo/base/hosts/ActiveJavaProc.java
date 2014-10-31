package vn.mvs.ambari.pojo.base.hosts;

/**
 * Created by tienbm on 25/10/2014.
 */
public class ActiveJavaProc {
    private String hadoop;

    private String command;

    private String pid;

    private String user;

    public String getHadoop() {
        return hadoop;
    }

    public void setHadoop(String hadoop) {
        this.hadoop = hadoop;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
