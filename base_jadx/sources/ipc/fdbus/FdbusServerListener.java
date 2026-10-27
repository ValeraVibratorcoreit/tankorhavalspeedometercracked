package ipc.fdbus;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public interface FdbusServerListener {
    void onInvoke(FdbusMessage fdbusMessage);

    void onOffline(int i, boolean z);

    void onOnline(int i, boolean z);

    void onSubscribe(FdbusMessage fdbusMessage, ArrayList<SubscribeItem> arrayList);
}
