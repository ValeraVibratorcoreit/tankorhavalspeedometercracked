package ru.zinovin.tankspeedometer.utils.remoteresources.impl;

import android.content.Context;
import ru.zinovin.tankspeedometer.utils.remoteresources.RemotePlugin;

/* JADX INFO: loaded from: classes.dex */
public class TruePlugin implements RemotePlugin {
    @Override // ru.zinovin.tankspeedometer.utils.remoteresources.RemotePlugin
    public final /* bridge */ /* synthetic */ Object execute(String str, Object[] objArr) {
        return Boolean.TRUE;
    }

    @Override // ru.zinovin.tankspeedometer.utils.remoteresources.RemotePlugin
    public final String getName() {
        return "TruePlugin";
    }

    @Override // ru.zinovin.tankspeedometer.utils.remoteresources.RemotePlugin
    public final String getVersion() {
        return "1.0";
    }

    @Override // ru.zinovin.tankspeedometer.utils.remoteresources.RemotePlugin
    public final void initialize(Context context) {
    }
}
