package ru.zinovin.tankspeedometer.utils.remoteresources.impl;

import android.content.Context;
import defpackage.Lf;
import ru.zinovin.tankspeedometer.utils.remoteresources.RemotePlugin;

/* JADX INFO: loaded from: classes.dex */
public class MicroModePlugin implements RemotePlugin {
    @Override // ru.zinovin.tankspeedometer.utils.remoteresources.RemotePlugin
    public final Object execute(String str, Object... objArr) {
        Lf.a().e(3);
        return null;
    }

    @Override // ru.zinovin.tankspeedometer.utils.remoteresources.RemotePlugin
    public final String getName() {
        return "MicroModePlugin";
    }

    @Override // ru.zinovin.tankspeedometer.utils.remoteresources.RemotePlugin
    public final String getVersion() {
        return "1.0";
    }

    @Override // ru.zinovin.tankspeedometer.utils.remoteresources.RemotePlugin
    public final void initialize(Context context) {
    }
}
