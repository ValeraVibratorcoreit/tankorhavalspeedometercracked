package com.jcraft.jsch;

/* JADX INFO: loaded from: classes.dex */
public class SftpStatVFS {
    int atime;
    private long bavail;
    private long bfree;
    private long blocks;
    private long bsize;
    private long favail;
    private long ffree;
    private long files;
    private long flag;
    private long frsize;
    private long fsid;
    int gid;
    int mtime;
    private long namemax;
    int permissions;
    long size;
    int uid;
    int flags = 0;
    String[] extended = null;

    private SftpStatVFS() {
    }

    public static SftpStatVFS getStatVFS(Buffer buffer) {
        SftpStatVFS sftpStatVFS = new SftpStatVFS();
        sftpStatVFS.bsize = buffer.getLong();
        sftpStatVFS.frsize = buffer.getLong();
        sftpStatVFS.blocks = buffer.getLong();
        sftpStatVFS.bfree = buffer.getLong();
        sftpStatVFS.bavail = buffer.getLong();
        sftpStatVFS.files = buffer.getLong();
        sftpStatVFS.ffree = buffer.getLong();
        sftpStatVFS.favail = buffer.getLong();
        sftpStatVFS.fsid = buffer.getLong();
        int i = (int) buffer.getLong();
        sftpStatVFS.namemax = buffer.getLong();
        long j = (i & 1) != 0 ? 1L : 0L;
        sftpStatVFS.flag = j;
        sftpStatVFS.flag = j | ((i & 2) != 0 ? 2L : 0L);
        return sftpStatVFS;
    }

    public long getAvail() {
        return (getFreeBlocks() * getFragmentSize()) / 1024;
    }

    public long getAvailBlocks() {
        return this.bavail;
    }

    public long getAvailForNonRoot() {
        return (getAvailBlocks() * getFragmentSize()) / 1024;
    }

    public long getAvailINodes() {
        return this.favail;
    }

    public long getBlockSize() {
        return this.bsize;
    }

    public long getBlocks() {
        return this.blocks;
    }

    public int getCapacity() {
        return (int) (((getBlocks() - getFreeBlocks()) * 100) / getBlocks());
    }

    public long getFileSystemID() {
        return this.fsid;
    }

    public long getFragmentSize() {
        return this.frsize;
    }

    public long getFreeBlocks() {
        return this.bfree;
    }

    public long getFreeINodes() {
        return this.ffree;
    }

    public long getINodes() {
        return this.files;
    }

    public long getMaximumFilenameLength() {
        return this.namemax;
    }

    public long getMountFlag() {
        return this.flag;
    }

    public long getSize() {
        return (getBlocks() * getFragmentSize()) / 1024;
    }

    public long getUsed() {
        return ((getBlocks() - getFreeBlocks()) * getFragmentSize()) / 1024;
    }
}
