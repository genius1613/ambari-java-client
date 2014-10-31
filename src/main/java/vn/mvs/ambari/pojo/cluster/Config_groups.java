package vn.mvs.ambari.pojo.cluster;

/**
 * Created by tienbm on 09/10/2014.
 */
public class Config_groups {
    private ConfigGroup ConfigGroup;

    private String href;

    public ConfigGroup getConfigGroup ()
    {
        return ConfigGroup;
    }

    public void setConfigGroup (ConfigGroup ConfigGroup)
    {
        this.ConfigGroup = ConfigGroup;
    }

    public String getHref ()
    {
        return href;
    }

    public void setHref (String href)
    {
        this.href = href;
    }
}
