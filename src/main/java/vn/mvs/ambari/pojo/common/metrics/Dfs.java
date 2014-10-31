package vn.mvs.ambari.pojo.common.metrics;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by tienbm on 22/10/2014.
 */
public class Dfs {
    public class DataNode {
        private String readBlockOp_num_ops;

        private String block_verification_failures;

        private String writeBlockOp_avg_time;

        private String blockChecksumOp_num_ops;

        private String blocks_read;

        private String blocks_written;

        private String copyBlockOp_avg_time;

        private String heartBeats_num_ops;

        private String writes_from_remote_client;

        private String replaceBlockOp_num_ops;

        private String blocks_replicated;

        private String blockReports_avg_time;

        private String writeBlockOp_num_ops;

        private String heartBeats_avg_time;

        private String bytes_read;

        private String copyBlockOp_num_ops;

        private String blockReports_num_ops;

        private String bytes_written;

        private String reads_from_remote_client;

        private String replaceBlockOp_avg_time;

        private String readBlockOp_avg_time;

        private String reads_from_local_client;

        private String blocks_verified;

        private String writes_from_local_client;

        private String blocks_get_local_pathinfo;

        private String blockChecksumOp_avg_time;

        private String blocks_removed;

        public String getReadBlockOp_num_ops() {
            return readBlockOp_num_ops;
        }

        public void setReadBlockOp_num_ops(String readBlockOp_num_ops) {
            this.readBlockOp_num_ops = readBlockOp_num_ops;
        }

        public String getBlock_verification_failures() {
            return block_verification_failures;
        }

        public void setBlock_verification_failures(String block_verification_failures) {
            this.block_verification_failures = block_verification_failures;
        }

        public String getWriteBlockOp_avg_time() {
            return writeBlockOp_avg_time;
        }

        public void setWriteBlockOp_avg_time(String writeBlockOp_avg_time) {
            this.writeBlockOp_avg_time = writeBlockOp_avg_time;
        }

        public String getBlockChecksumOp_num_ops() {
            return blockChecksumOp_num_ops;
        }

        public void setBlockChecksumOp_num_ops(String blockChecksumOp_num_ops) {
            this.blockChecksumOp_num_ops = blockChecksumOp_num_ops;
        }

        public String getBlocks_read() {
            return blocks_read;
        }

        public void setBlocks_read(String blocks_read) {
            this.blocks_read = blocks_read;
        }

        public String getBlocks_written() {
            return blocks_written;
        }

        public void setBlocks_written(String blocks_written) {
            this.blocks_written = blocks_written;
        }

        public String getCopyBlockOp_avg_time() {
            return copyBlockOp_avg_time;
        }

        public void setCopyBlockOp_avg_time(String copyBlockOp_avg_time) {
            this.copyBlockOp_avg_time = copyBlockOp_avg_time;
        }

        public String getHeartBeats_num_ops() {
            return heartBeats_num_ops;
        }

        public void setHeartBeats_num_ops(String heartBeats_num_ops) {
            this.heartBeats_num_ops = heartBeats_num_ops;
        }

        public String getWrites_from_remote_client() {
            return writes_from_remote_client;
        }

        public void setWrites_from_remote_client(String writes_from_remote_client) {
            this.writes_from_remote_client = writes_from_remote_client;
        }

        public String getReplaceBlockOp_num_ops() {
            return replaceBlockOp_num_ops;
        }

        public void setReplaceBlockOp_num_ops(String replaceBlockOp_num_ops) {
            this.replaceBlockOp_num_ops = replaceBlockOp_num_ops;
        }

        public String getBlocks_replicated() {
            return blocks_replicated;
        }

        public void setBlocks_replicated(String blocks_replicated) {
            this.blocks_replicated = blocks_replicated;
        }

        public String getBlockReports_avg_time() {
            return blockReports_avg_time;
        }

        public void setBlockReports_avg_time(String blockReports_avg_time) {
            this.blockReports_avg_time = blockReports_avg_time;
        }

        public String getWriteBlockOp_num_ops() {
            return writeBlockOp_num_ops;
        }

        public void setWriteBlockOp_num_ops(String writeBlockOp_num_ops) {
            this.writeBlockOp_num_ops = writeBlockOp_num_ops;
        }

        public String getHeartBeats_avg_time() {
            return heartBeats_avg_time;
        }

        public void setHeartBeats_avg_time(String heartBeats_avg_time) {
            this.heartBeats_avg_time = heartBeats_avg_time;
        }

        public String getBytes_read() {
            return bytes_read;
        }

        public void setBytes_read(String bytes_read) {
            this.bytes_read = bytes_read;
        }

        public String getCopyBlockOp_num_ops() {
            return copyBlockOp_num_ops;
        }

        public void setCopyBlockOp_num_ops(String copyBlockOp_num_ops) {
            this.copyBlockOp_num_ops = copyBlockOp_num_ops;
        }

        public String getBlockReports_num_ops() {
            return blockReports_num_ops;
        }

        public void setBlockReports_num_ops(String blockReports_num_ops) {
            this.blockReports_num_ops = blockReports_num_ops;
        }

        public String getBytes_written() {
            return bytes_written;
        }

        public void setBytes_written(String bytes_written) {
            this.bytes_written = bytes_written;
        }

        public String getReads_from_remote_client() {
            return reads_from_remote_client;
        }

        public void setReads_from_remote_client(String reads_from_remote_client) {
            this.reads_from_remote_client = reads_from_remote_client;
        }

        public String getReplaceBlockOp_avg_time() {
            return replaceBlockOp_avg_time;
        }

        public void setReplaceBlockOp_avg_time(String replaceBlockOp_avg_time) {
            this.replaceBlockOp_avg_time = replaceBlockOp_avg_time;
        }

        public String getReadBlockOp_avg_time() {
            return readBlockOp_avg_time;
        }

        public void setReadBlockOp_avg_time(String readBlockOp_avg_time) {
            this.readBlockOp_avg_time = readBlockOp_avg_time;
        }

        public String getReads_from_local_client() {
            return reads_from_local_client;
        }

        public void setReads_from_local_client(String reads_from_local_client) {
            this.reads_from_local_client = reads_from_local_client;
        }

        public String getBlocks_verified() {
            return blocks_verified;
        }

        public void setBlocks_verified(String blocks_verified) {
            this.blocks_verified = blocks_verified;
        }

        public String getWrites_from_local_client() {
            return writes_from_local_client;
        }

        public void setWrites_from_local_client(String writes_from_local_client) {
            this.writes_from_local_client = writes_from_local_client;
        }

        public String getBlocks_get_local_pathinfo() {
            return blocks_get_local_pathinfo;
        }

        public void setBlocks_get_local_pathinfo(String blocks_get_local_pathinfo) {
            this.blocks_get_local_pathinfo = blocks_get_local_pathinfo;
        }

        public String getBlockChecksumOp_avg_time() {
            return blockChecksumOp_avg_time;
        }

        public void setBlockChecksumOp_avg_time(String blockChecksumOp_avg_time) {
            this.blockChecksumOp_avg_time = blockChecksumOp_avg_time;
        }

        public String getBlocks_removed() {
            return blocks_removed;
        }

        public void setBlocks_removed(String blocks_removed) {
            this.blocks_removed = blocks_removed;
        }

        @Override
        public String toString() {
            return this.block_verification_failures + " : " + this.blockReports_num_ops;
        }
    }

    public class NameNode {

        @Expose
        private String DeleteFileOps;
        @Expose
        private String FilesAppended;
        @Expose
        private String FilesDeleted;
        @Expose
        private String SafemodeTime;
        @Expose
        private String FilesRenamed;
        @Expose
        private String JournalTransactionsBatchedInSync;
        @Expose
        private String fsImageLoadTime;

        public String getDeleteFileOps() {
            return DeleteFileOps;
        }

        public void setDeleteFileOps(String deleteFileOps) {
            DeleteFileOps = deleteFileOps;
        }

        public String getFilesAppended() {
            return FilesAppended;
        }

        public void setFilesAppended(String filesAppended) {
            FilesAppended = filesAppended;
        }

        public String getFilesDeleted() {
            return FilesDeleted;
        }

        public void setFilesDeleted(String filesDeleted) {
            FilesDeleted = filesDeleted;
        }

        public String getSafemodeTime() {
            return SafemodeTime;
        }

        public void setSafemodeTime(String safemodeTime) {
            SafemodeTime = safemodeTime;
        }

        public String getFilesRenamed() {
            return FilesRenamed;
        }

        public void setFilesRenamed(String filesRenamed) {
            FilesRenamed = filesRenamed;
        }

        public String getJournalTransactionsBatchedInSync() {
            return JournalTransactionsBatchedInSync;
        }

        public void setJournalTransactionsBatchedInSync(String journalTransactionsBatchedInSync) {
            JournalTransactionsBatchedInSync = journalTransactionsBatchedInSync;
        }

        public String getFsImageLoadTime() {
            return fsImageLoadTime;
        }

        public void setFsImageLoadTime(String fsImageLoadTime) {
            this.fsImageLoadTime = fsImageLoadTime;
        }
    }

    @SerializedName("datanode")
    private DataNode dataNode;

    @SerializedName("namenode")
    private NameNode nameNode;

    public NameNode getNameNode() {
        return nameNode;
    }

    public void setNameNode(NameNode nameNode) {
        this.nameNode = nameNode;
    }

    public DataNode getDataNode() {
        return dataNode;
    }

    public void setDataNode(DataNode dataNode) {
        this.dataNode = dataNode;
    }
}
