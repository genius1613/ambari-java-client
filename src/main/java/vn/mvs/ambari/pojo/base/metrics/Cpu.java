package vn.mvs.ambari.pojo.base.metrics;

import com.google.gson.annotations.Expose;

/**
 * Created by tienbm on 25/09/2014.
 */
public class Cpu {
    @Expose
    private String cpu_aidle;
    @Expose
    private String cpu_idle;
    @Expose
    private String cpu_nice;
    @Expose
    private String cpu_num;
    @Expose
    private String cpu_speed;
    @Expose
    private String cpu_system;
    @Expose
    private String cpu_user;
    @Expose
    private String cpu_wio;

    public String getCpu_speed() {
        return cpu_speed;
    }

    public void setCpu_speed(String cpu_speed) {
        this.cpu_speed = cpu_speed;
    }

    public String getCpu_wio() {
        return cpu_wio;
    }

    public void setCpu_wio(String cpu_wio) {
        this.cpu_wio = cpu_wio;
    }

    public String getCpu_num() {
        return cpu_num;
    }

    public void setCpu_num(String cpu_num) {
        this.cpu_num = cpu_num;
    }

    public String getCpu_idle() {
        return cpu_idle;
    }

    public void setCpu_idle(String cpu_idle) {
        this.cpu_idle = cpu_idle;
    }

    public String getCpu_nice() {
        return cpu_nice;
    }

    public void setCpu_nice(String cpu_nice) {
        this.cpu_nice = cpu_nice;
    }

    public String getCpu_aidle() {
        return cpu_aidle;
    }

    public void setCpu_aidle(String cpu_aidle) {
        this.cpu_aidle = cpu_aidle;
    }

    public String getCpu_system() {
        return cpu_system;
    }

    public void setCpu_system(String cpu_system) {
        this.cpu_system = cpu_system;
    }

    public String getCpu_user() {
        return cpu_user;
    }

    public void setCpu_user(String cpu_user) {
        this.cpu_user = cpu_user;
    }
}

