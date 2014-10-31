package vn.mvs.ambari.pojo.common;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import vn.mvs.ambari.pojo.common.metrics.*;
import vn.mvs.ambari.pojo.common.metrics.Process;
import vn.mvs.ambari.pojo.common.metrics.Hbase;

import java.lang.*;

/**
 * Created by tienbm on 25/09/2014.
 */
public class Metrics {

    @Expose
    private String boottime;
    @Expose
    private Cpu cpu;
    @Expose
    private Disk disk;
    @Expose
    private Hbase hbase;
    @Expose
    private Dfs dfs;
    @Expose
    private Jvm jvm;
    @Expose
    private Load load;
    @Expose
    private Memory memory;
    @Expose
    private Network network;
    @Expose
    private Process process;
    @Expose
    private Rpc rpc;
    @Expose
    @SerializedName("rpcdetailed")
    private Rpcdetailed rpcdetailed;

    public Process getProcess() {
        return process;
    }

    public void setProcess(Process process) {
        this.process = process;
    }

    public Hbase getHbase() {
        return hbase;
    }

    public void setHbase(Hbase hbase) {
        this.hbase = hbase;
    }

    public Disk getDisk() {
        return disk;
    }

    public void setDisk(Disk disk) {
        this.disk = disk;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public Load getLoad() {
        return load;
    }

    public void setLoad(Load load) {
        this.load = load;
    }

    public Jvm getJvm() {
        return jvm;
    }

    public void setJvm(Jvm jvm) {
        this.jvm = jvm;
    }

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public String getBoottime() {
        return boottime;
    }

    public void setBoottime(String boottime) {
        this.boottime = boottime;
    }

    public Dfs getDfs() {
        return dfs;
    }

    public void setDfs(Dfs dfs) {
        this.dfs = dfs;
    }

    public Rpc getRpc() {
        return rpc;
    }

    public void setRpc(Rpc rpc) {
        this.rpc = rpc;
    }

    public Rpcdetailed getRpcdetailed() {
        return rpcdetailed;
    }

    public void setRpcdetailed(Rpcdetailed rpcdetailed) {
        this.rpcdetailed = rpcdetailed;
    }
}
