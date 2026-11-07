package defpackage;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final /* synthetic */ class zy implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ az b;

    public /* synthetic */ zy(az azVar, int i) {
        this.a = i;
        this.b = azVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String string;
        switch (this.a) {
            case 0:
                az azVar = this.b;
                synchronized (azVar) {
                    try {
                        zl0 zl0Var = (zl0) azVar.a.get();
                        ArrayList arrayListA = zl0Var.a();
                        synchronized (zl0Var) {
                            zl0Var.a.a(new c0(zl0Var, 3));
                        }
                        JSONArray jSONArray = new JSONArray();
                        for (int i = 0; i < arrayListA.size(); i++) {
                            qd qdVar = (qd) arrayListA.get(i);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("agent", qdVar.a);
                            jSONObject.put("dates", new JSONArray((Collection) qdVar.b));
                            jSONArray.put(jSONObject);
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("heartbeats", jSONArray);
                        jSONObject2.put("version", "2");
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
                        try {
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                            try {
                                gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                                gZIPOutputStream.close();
                                base64OutputStream.close();
                                string = byteArrayOutputStream.toString("UTF-8");
                            } catch (Throwable th) {
                                try {
                                    gZIPOutputStream.close();
                                    throw th;
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                    throw th;
                                }
                            }
                        } catch (Throwable th3) {
                            try {
                                base64OutputStream.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    } catch (Throwable th5) {
                        throw th5;
                    }
                }
                return string;
            default:
                az azVar2 = this.b;
                synchronized (azVar2) {
                    zl0 zl0Var2 = (zl0) azVar2.a.get();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    String strA = ((d00) azVar2.c.get()).a();
                    synchronized (zl0Var2) {
                        String strB = zl0Var2.b(jCurrentTimeMillis);
                        strA.getClass();
                        zl0Var2.a.a(new ai0(1, zl0Var2, strB, strA, new fc1(strA)));
                    }
                }
                return null;
        }
    }
}
