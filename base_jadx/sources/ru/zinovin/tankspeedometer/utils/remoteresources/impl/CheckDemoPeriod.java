package ru.zinovin.tankspeedometer.utils.remoteresources.impl;

import android.content.Context;
import defpackage.Tf;
import java.time.Duration;
import java.time.Instant;
import ru.zinovin.tankspeedometer.utils.remoteresources.RemotePlugin;

/* JADX INFO: loaded from: classes.dex */
public class CheckDemoPeriod implements RemotePlugin {
    @Override // ru.zinovin.tankspeedometer.utils.remoteresources.RemotePlugin
    public final Object execute(String str, Object[] objArr) {
        boolean z = false;
        try {
            Duration durationBetween = Duration.between(Instant.parse(Tf.H("LALALA")), Instant.now());
            if (durationBetween.toDays() <= 14 && !durationBetween.isNegative()) {
                z = true;
            }
        } catch (Exception unused) {
        }
        return Boolean.valueOf(z);
    }

    @Override // ru.zinovin.tankspeedometer.utils.remoteresources.RemotePlugin
    public final String getName() {
        return "CheckDemoPeriod";
    }

    @Override // ru.zinovin.tankspeedometer.utils.remoteresources.RemotePlugin
    public final String getVersion() {
        return "1.0";
    }

    @Override // ru.zinovin.tankspeedometer.utils.remoteresources.RemotePlugin
    public final void initialize(Context context) {
    }
}
