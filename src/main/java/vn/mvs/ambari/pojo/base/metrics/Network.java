package vn.mvs.ambari.pojo.base.metrics;

/**
 * Created by tienbm on 25/09/2014.
 */

public class Network
{
    private String pkts_out;

    private String bytes_in;

    private String bytes_out;

    private String pkts_in;

    public String getPkts_out ()
    {
        return pkts_out;
    }

    public void setPkts_out (String pkts_out)
    {
        this.pkts_out = pkts_out;
    }

    public String getBytes_in ()
    {
        return bytes_in;
    }

    public void setBytes_in (String bytes_in)
    {
        this.bytes_in = bytes_in;
    }

    public String getBytes_out ()
    {
        return bytes_out;
    }

    public void setBytes_out (String bytes_out)
    {
        this.bytes_out = bytes_out;
    }

    public String getPkts_in ()
    {
        return pkts_in;
    }

    public void setPkts_in (String pkts_in)
    {
        this.pkts_in = pkts_in;
    }
}
