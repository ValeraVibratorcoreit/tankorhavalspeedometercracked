package ru.zinovin.tankspeedometer.utils.remoteresources.impl;

import android.content.Context;
import android.content.Intent;
import defpackage.AbstractC0402n1;
import defpackage.Tf;
import defpackage.Ud;
import java.time.Duration;
import java.time.Instant;
import ru.zinovin.tankspeedometer.utils.remoteresources.RemotePlugin;

/* JADX INFO: loaded from: classes.dex */
public class Lala implements RemotePlugin {
    @Override // ru.zinovin.tankspeedometer.utils.remoteresources.RemotePlugin
    public final Object execute(String str, Object... objArr) {
        try {
            Duration durationBetween = Duration.between(Instant.parse(Tf.H("LALALA")), Instant.now());
            if (durationBetween.toDays() <= 14 && !durationBetween.isNegative()) {
                return null;
            }
            Context contextA = AbstractC0402n1.a();
            Intent intent = new Intent();
            intent.setAction("ru.zinovin.tankspeedometer.T500_IP_STOP");
            contextA.sendBroadcast(intent);
            Intent intent2 = new Intent();
            intent2.setAction("ru.zinovin.tankspeedometer.T500_HUD_STOP");
            contextA.sendBroadcast(intent2);
            Ud.q0();
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // ru.zinovin.tankspeedometer.utils.remoteresources.RemotePlugin
    public final String getName() {
        return "Lala";
    }

    @Override // ru.zinovin.tankspeedometer.utils.remoteresources.RemotePlugin
    public final String getVersion() {
        return "1.0";
    }

    @Override // ru.zinovin.tankspeedometer.utils.remoteresources.RemotePlugin
    public final void initialize(Context context) {
    }
}
