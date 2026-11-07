package defpackage;

import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.Ref;
import kotlin.text.Charsets;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final /* synthetic */ class d80 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ d80(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        int i = this.a;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                h02 h02Var = (h02) obj5;
                mp1 mp1Var = (mp1) obj4;
                ListenableFuture listenableFuture = (ListenableFuture) obj3;
                ListenableFuture listenableFuture2 = (ListenableFuture) obj2;
                f80 f80Var = (f80) obj;
                if (h02Var.isDone()) {
                    mp1Var.n(listenableFuture);
                    return;
                } else {
                    if (listenableFuture2.isCancelled()) {
                        int i2 = f80.e;
                        if (f80Var.compareAndSet(e80.a, e80.b)) {
                            h02Var.cancel(false);
                            return;
                        }
                        return;
                    }
                    return;
                }
            default:
                Ref.ObjectRef objectRef = (Ref.ObjectRef) obj4;
                String str = (String) obj3;
                ReentrantLock reentrantLock = (ReentrantLock) obj2;
                Condition condition = (Condition) obj;
                str.getClass();
                Unit unitOpenConnection = ((URL) obj5).openConnection();
                unitOpenConnection.getClass();
                Unit unit = (HttpURLConnection) unitOpenConnection;
                try {
                    try {
                        InputStream inputStream = unit.getInputStream();
                        inputStream.getClass();
                        String strV = zi0.v(new BufferedReader(new InputStreamReader(inputStream, Charsets.UTF_8), 8192));
                        unit.getInputStream().close();
                        objectRef.element = new JSONObject(strV).optString(str);
                        unit.disconnect();
                        reentrantLock.lock();
                        try {
                            condition.signal();
                            unit = Unit.a;
                            return;
                        } finally {
                            reentrantLock.unlock();
                        }
                    } catch (Throwable th) {
                        unit.disconnect();
                        reentrantLock.lock();
                        try {
                            condition.signal();
                            Unit unit2 = Unit.a;
                            throw th;
                        } finally {
                            reentrantLock.unlock();
                        }
                    }
                } catch (Exception e) {
                    String name = h81.class.getName();
                    String message = e.getMessage();
                    if (message == null) {
                        message = "Error getting public key";
                    }
                    Log.d(name, message);
                    unit.disconnect();
                    reentrantLock.lock();
                    try {
                        condition.signal();
                        unit = Unit.a;
                    } finally {
                        reentrantLock.unlock();
                    }
                    break;
                }
                break;
        }
    }
}
