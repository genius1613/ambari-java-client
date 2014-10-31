package vn.mvs.ambari.pojo.common.metrics;

/**
 * Created by tienbm on 26/09/2014.
 */

public class Rpc
{
    private String rpcAuthorizationSuccesses;

    private String rpcAuthorizationFailures;

    private String SentBytes;

    private String ReceivedBytes;

    private String NumOpenConnections;

    private String callQueueLen;

    private String rpcAuthenticationSuccesses;

    private String RpcQueueTime_num_ops;

    private String RpcProcessingTime_num_ops;

    private String rpcAuthenticationFailures;

    private String RpcProcessingTime_avg_time;

    private String RpcQueueTime_avg_time;

    private Integer getBlockLocalPathInfo_avg_time;
    private Integer getBlockLocalPathInfo_num_ops;
    private Integer getProtocolVersion_avg_time;
    private Integer getProtocolVersion_num_ops;

    public String getRpcAuthorizationSuccesses ()
    {
        return rpcAuthorizationSuccesses;
    }

    public void setRpcAuthorizationSuccesses (String rpcAuthorizationSuccesses)
    {
        this.rpcAuthorizationSuccesses = rpcAuthorizationSuccesses;
    }

    public String getRpcAuthorizationFailures ()
    {
        return rpcAuthorizationFailures;
    }

    public void setRpcAuthorizationFailures (String rpcAuthorizationFailures)
    {
        this.rpcAuthorizationFailures = rpcAuthorizationFailures;
    }

    public String getSentBytes ()
    {
        return SentBytes;
    }

    public void setSentBytes (String SentBytes)
    {
        this.SentBytes = SentBytes;
    }

    public String getReceivedBytes ()
    {
        return ReceivedBytes;
    }

    public void setReceivedBytes (String ReceivedBytes)
    {
        this.ReceivedBytes = ReceivedBytes;
    }

    public String getNumOpenConnections ()
    {
        return NumOpenConnections;
    }

    public void setNumOpenConnections (String NumOpenConnections)
    {
        this.NumOpenConnections = NumOpenConnections;
    }

    public String getCallQueueLen ()
    {
        return callQueueLen;
    }

    public void setCallQueueLen (String callQueueLen)
    {
        this.callQueueLen = callQueueLen;
    }

    public String getRpcAuthenticationSuccesses ()
    {
        return rpcAuthenticationSuccesses;
    }

    public void setRpcAuthenticationSuccesses (String rpcAuthenticationSuccesses)
    {
        this.rpcAuthenticationSuccesses = rpcAuthenticationSuccesses;
    }

    public String getRpcQueueTime_num_ops ()
    {
        return RpcQueueTime_num_ops;
    }

    public void setRpcQueueTime_num_ops (String RpcQueueTime_num_ops)
    {
        this.RpcQueueTime_num_ops = RpcQueueTime_num_ops;
    }

    public String getRpcProcessingTime_num_ops ()
    {
        return RpcProcessingTime_num_ops;
    }

    public void setRpcProcessingTime_num_ops (String RpcProcessingTime_num_ops)
    {
        this.RpcProcessingTime_num_ops = RpcProcessingTime_num_ops;
    }

    public String getRpcAuthenticationFailures ()
    {
        return rpcAuthenticationFailures;
    }

    public void setRpcAuthenticationFailures (String rpcAuthenticationFailures)
    {
        this.rpcAuthenticationFailures = rpcAuthenticationFailures;
    }

    public String getRpcProcessingTime_avg_time ()
    {
        return RpcProcessingTime_avg_time;
    }

    public void setRpcProcessingTime_avg_time (String RpcProcessingTime_avg_time)
    {
        this.RpcProcessingTime_avg_time = RpcProcessingTime_avg_time;
    }

    public String getRpcQueueTime_avg_time ()
    {
        return RpcQueueTime_avg_time;
    }

    public void setRpcQueueTime_avg_time (String RpcQueueTime_avg_time)
    {
        this.RpcQueueTime_avg_time = RpcQueueTime_avg_time;
    }
}

