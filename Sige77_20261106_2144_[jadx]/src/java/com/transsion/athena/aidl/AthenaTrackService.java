package com.transsion.athena.aidl;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import defpackage.cc2;
import defpackage.jc;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class AthenaTrackService extends Service {
    public final jc a;

    public AthenaTrackService() {
        jc jcVar = new jc();
        jcVar.attachInterface(jcVar, "com.transsion.athena.IAthenaTrackInterface");
        this.a = jcVar;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        cc2.a("AthenaTrackService onBind");
        return this.a;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        cc2.a("AthenaTrackService onUnbind");
        return super.onUnbind(intent);
    }
}
