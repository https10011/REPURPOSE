package defpackage;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class nk0 extends AsyncTask {
    public final ok0 a;
    public Exception b;

    public nk0(ok0 ok0Var) {
        this.a = ok0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.util.ArrayList] */
    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        Set set = mt.a;
        if (!set.contains(this)) {
            try {
                Void[] voidArr = (Void[]) objArr;
                if (!set.contains(this)) {
                    try {
                        voidArr.getClass();
                        try {
                            ok0 ok0Var = this.a;
                            ok0Var.getClass();
                            String str = mk0.j;
                            this = vl0.k(ok0Var);
                            return this;
                        } catch (Exception e) {
                            this.b = e;
                        }
                    } catch (Throwable th) {
                        mt.a(this, th);
                    }
                }
            } catch (Throwable th2) {
                mt.a(this, th2);
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [i90] */
    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        Set set = mt.a;
        if (set.contains(this)) {
            return;
        }
        try {
            List list = (List) obj;
            if (set.contains(this)) {
                return;
            }
            try {
                list.getClass();
                super.onPostExecute(list);
                Exception exc = this.b;
                if (exc != null) {
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    String.format("onPostExecute: exception encountered during request: %s", Arrays.copyOf(new Object[]{exc.getMessage()}, 1));
                    this = i90.a;
                    return;
                }
                return;
            } catch (Throwable th) {
                mt.a(this, th);
                return;
            }
            mt.a(this, th);
        } catch (Throwable th2) {
            mt.a(this, th2);
        }
    }

    @Override // android.os.AsyncTask
    public final void onPreExecute() {
        ok0 ok0Var = this.a;
        if (mt.a.contains(this)) {
            return;
        }
        try {
            super.onPreExecute();
            i90 i90Var = i90.a;
            if (ok0Var.a == null) {
                ok0Var.a = Thread.currentThread() instanceof HandlerThread ? new Handler() : new Handler(Looper.getMainLooper());
            }
        } catch (Throwable th) {
            mt.a(this, th);
        }
    }

    public final String toString() {
        return "{RequestAsyncTask:  connection: null, requests: " + this.a + "}";
    }
}
