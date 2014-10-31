package vn.mvs.ambari.pojo.common;

import com.google.gson.annotations.Expose;

/**
 * Created by tienbm on 01/10/2014.
 */
public class Alerts
{
    @Expose
    private Detail[] detail;
    @Expose
    private Summary summary;

    public Summary getSummary ()
    {
        return summary;
    }

    public void setSummary (Summary summary)
    {
        this.summary = summary;
    }

    public Detail[] getDetail ()
    {
        return detail;
    }

    public void setDetail (Detail[] detail)
    {
        this.detail = detail;
    }
}
