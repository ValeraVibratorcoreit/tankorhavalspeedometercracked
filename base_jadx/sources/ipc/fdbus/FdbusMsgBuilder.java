package ipc.fdbus;

/* JADX INFO: loaded from: classes.dex */
public class FdbusMsgBuilder {
    protected Object mMsg;
    protected byte[] mStream;
    protected String mText;

    public FdbusMsgBuilder(Object obj) {
        this.mStream = null;
        this.mText = null;
        this.mMsg = obj;
    }

    public boolean build(boolean z) {
        return true;
    }

    public byte[] toBuffer() {
        return this.mStream;
    }

    public String toString() {
        return this.mText;
    }

    public FdbusMsgBuilder(byte[] bArr, String str) {
        this.mStream = bArr;
        this.mText = str;
        this.mMsg = null;
    }
}
