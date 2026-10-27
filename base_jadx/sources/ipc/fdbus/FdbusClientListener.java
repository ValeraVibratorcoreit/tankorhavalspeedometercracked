package ipc.fdbus;

/* JADX INFO: loaded from: classes.dex */
public interface FdbusClientListener {
    void onBroadcast(FdbusMessage fdbusMessage);

    void onGetEvent(FdbusMessage fdbusMessage);

    void onOffline(int i);

    void onOnline(int i);

    void onReply(FdbusMessage fdbusMessage);
}
