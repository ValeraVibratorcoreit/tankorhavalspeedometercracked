package ipc.fdbus;

/* JADX INFO: loaded from: classes.dex */
public class SubscribeItem {
    private int mCode;
    private String mTopic;

    public SubscribeItem(int i, String str) {
        this.mCode = i;
        this.mTopic = str;
    }

    public static SubscribeItem newEvent(int i, String str) {
        return new SubscribeItem(i, str);
    }

    public static SubscribeItem newGroup(int i, String str) {
        return new SubscribeItem(((i & 255) << 24) | 16777215, str);
    }

    public int code() {
        return this.mCode;
    }

    public String topic() {
        return this.mTopic;
    }

    public static SubscribeItem newEvent(int i) {
        return new SubscribeItem(i, null);
    }

    public static SubscribeItem newGroup(int i) {
        return new SubscribeItem(((i & 255) << 24) | 16777215, null);
    }
}
