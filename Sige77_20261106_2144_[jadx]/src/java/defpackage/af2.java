package defpackage;

import android.os.Handler;
import android.util.Log;
import com.tencent.mmkv.MMKV;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class af2 implements Runnable {
    public final /* synthetic */ ff2 a;

    public af2(ff2 ff2Var) {
        this.a = ff2Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        String str = ze2.a;
        try {
            MMKV mmkvMmkvWithID = MMKV.mmkvWithID("AthenaKV", 2);
            String[] strArrAllKeys = mmkvMmkvWithID.allKeys();
            ff2 ff2Var = this.a;
            if (strArrAllKeys != null && strArrAllKeys.length > 0) {
                ff2Var.y(mmkvMmkvWithID);
            }
            ((Handler) ff2Var.b).postDelayed(this, 300000L);
        } catch (Exception e) {
            cc2.c(Log.getStackTraceString(e));
        }
    }
}
