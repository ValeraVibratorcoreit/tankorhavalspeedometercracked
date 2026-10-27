package ru.zinovin.tankspeedometer.utils.remoteresources.impl;

import android.content.Context;
import ru.zinovin.tankspeedometer.utils.remoteresources.RemotePlugin;

/* JADX INFO: loaded from: classes.dex */
public class GifPluginDemo implements RemotePlugin {
    @Override // ru.zinovin.tankspeedometer.utils.remoteresources.RemotePlugin
    public final /* bridge */ /* synthetic */ Object execute(String str, Object[] objArr) {
        return Boolean.FALSE;
    }

    @Override // ru.zinovin.tankspeedometer.utils.remoteresources.RemotePlugin
    public final String getName() {
        return "GifPluginDemo";
    }

    @Override // ru.zinovin.tankspeedometer.utils.remoteresources.RemotePlugin
    public final String getVersion() {
        return "1.0";
    }

    @Override // ru.zinovin.tankspeedometer.utils.remoteresources.RemotePlugin
    public final void initialize(Context context) {
    }
}
