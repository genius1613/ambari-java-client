package vn.mvs.ambari.pojo.common;

/**
 * Created by tienbm on 01/10/2014.
 */
public class Summary
{
    private String OK;

    private String PASSIVE;

    private String WARNING;

    private String CRITICAL;

    public String getOK ()
    {
        return OK;
    }

    public void setOK (String OK)
    {
        this.OK = OK;
    }

    public String getPASSIVE ()
    {
        return PASSIVE;
    }

    public void setPASSIVE (String PASSIVE)
    {
        this.PASSIVE = PASSIVE;
    }

    public String getWARNING ()
    {
        return WARNING;
    }

    public void setWARNING (String WARNING)
    {
        this.WARNING = WARNING;
    }

    public String getCRITICAL ()
    {
        return CRITICAL;
    }

    public void setCRITICAL (String CRITICAL)
    {
        this.CRITICAL = CRITICAL;
    }
}