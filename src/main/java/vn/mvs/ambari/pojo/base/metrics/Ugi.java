package vn.mvs.ambari.pojo.base.metrics;

/**
 * Created by tienbm on 26/09/2014.
 */
public class Ugi
{
    private String loginSuccess_num_ops;

    private String loginFailure_num_ops;

    private String loginSuccess_avg_time;

    private String loginFailure_avg_time;

    public String getLoginSuccess_num_ops ()
    {
        return loginSuccess_num_ops;
    }

    public void setLoginSuccess_num_ops (String loginSuccess_num_ops)
    {
        this.loginSuccess_num_ops = loginSuccess_num_ops;
    }

    public String getLoginFailure_num_ops ()
    {
        return loginFailure_num_ops;
    }

    public void setLoginFailure_num_ops (String loginFailure_num_ops)
    {
        this.loginFailure_num_ops = loginFailure_num_ops;
    }

    public String getLoginSuccess_avg_time ()
    {
        return loginSuccess_avg_time;
    }

    public void setLoginSuccess_avg_time (String loginSuccess_avg_time)
    {
        this.loginSuccess_avg_time = loginSuccess_avg_time;
    }

    public String getLoginFailure_avg_time ()
    {
        return loginFailure_avg_time;
    }

    public void setLoginFailure_avg_time (String loginFailure_avg_time)
    {
        this.loginFailure_avg_time = loginFailure_avg_time;
    }
}

