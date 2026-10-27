package ru.zinovin.tankspeedometer.utils.remoteresources;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public interface RemotePlugin {
    <T> T execute(String str, Object... objArr);

    String getName();

    String getVersion();

    void initialize(Context context);
}
