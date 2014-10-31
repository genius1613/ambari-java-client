package vn.mvs.ambari.pojo.base.hosts;

/**
 * Created by tienbm on 25/10/2014.
 */
public class LastAgentEnv {
    private String umask;

    private String[] installedPackages;

    private String[] existingUsers;

    private String[] existingRepos;

    private String[] stackFoldersAndFiles;

    private String reverseLookup;

    private String[] alternatives;

    private HostHealth hostHealth;

    private String iptablesIsRunning;

    public String getUmask() {
        return umask;
    }

    public void setUmask(String umask) {
        this.umask = umask;
    }

    public String[] getInstalledPackages() {
        return installedPackages;
    }

    public void setInstalledPackages(String[] installedPackages) {
        this.installedPackages = installedPackages;
    }

    public String[] getExistingUsers() {
        return existingUsers;
    }

    public void setExistingUsers(String[] existingUsers) {
        this.existingUsers = existingUsers;
    }

    public String[] getExistingRepos() {
        return existingRepos;
    }

    public void setExistingRepos(String[] existingRepos) {
        this.existingRepos = existingRepos;
    }

    public String[] getStackFoldersAndFiles() {
        return stackFoldersAndFiles;
    }

    public void setStackFoldersAndFiles(String[] stackFoldersAndFiles) {
        this.stackFoldersAndFiles = stackFoldersAndFiles;
    }

    public String getReverseLookup() {
        return reverseLookup;
    }

    public void setReverseLookup(String reverseLookup) {
        this.reverseLookup = reverseLookup;
    }

    public String[] getAlternatives() {
        return alternatives;
    }

    public void setAlternatives(String[] alternatives) {
        this.alternatives = alternatives;
    }

    public HostHealth getHostHealth() {
        return hostHealth;
    }

    public void setHostHealth(HostHealth hostHealth) {
        this.hostHealth = hostHealth;
    }

    public String getIptablesIsRunning() {
        return iptablesIsRunning;
    }

    public void setIptablesIsRunning(String iptablesIsRunning) {
        this.iptablesIsRunning = iptablesIsRunning;
    }
}
