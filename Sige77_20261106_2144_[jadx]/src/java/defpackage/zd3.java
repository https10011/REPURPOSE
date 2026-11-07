package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class zd3 implements cv1 {
    public final String a;
    public final bk0 b;
    public volatile int c = -1;
    public k93 d;

    public zd3(String str, bk0 bk0Var) {
        this.a = str;
        this.b = bk0Var;
    }

    public abstract Object a();

    public abstract Object b(String str);

    public abstract Object c(Object obj);

    public abstract Object d();

    public abstract void e(Object obj);

    /* JADX WARN: Code duplicated, block: B:48:0x00f2  */
    @Override // defpackage.cv1
    public final Object get() {
        hf3 hf3VarD;
        Object objA;
        wq1 wq1Var;
        y93 y93Var;
        if (kv.f == null) {
            Object obj = y93.j;
            kv.f = new nc0(5);
        }
        Context context = (Context) y93.k.get();
        Object objC = null;
        if (context == null) {
            synchronized (kv.d) {
            }
            uq1.q("Must call PhenotypeContext.setContext() first");
            return null;
        }
        y93 y93Var2 = y93.l;
        boolean z = false;
        if (y93Var2 == null) {
            Context applicationContext = context.getApplicationContext();
            try {
                applicationContext.getClass();
                Context applicationContext2 = applicationContext.getApplicationContext();
                applicationContext2.getClass();
                Class<?> cls = applicationContext2.getClass();
                new StringBuilder(String.valueOf(cls).length() + 72);
                cls.toString();
                throw new IllegalStateException("Given application context does not implement GeneratedComponentManager: ".concat(String.valueOf(cls)));
            } catch (IllegalStateException unused) {
                synchronized (y93.j) {
                    try {
                        if (y93.l != null) {
                            y93Var = y93.l;
                        } else {
                            y93Var = (y93) new aa3(applicationContext, 0).get();
                            y93.l = y93Var;
                            ta.P(Level.CONFIG, y93Var.a(), null, "Application doesn't implement PhenotypeApplication interface, falling back to globally set context. See go/phenotype-flag#process-stable-init for more info.", new Object[0]);
                        }
                        y93Var2 = y93Var;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        int i = this.c;
        if (i == -1 || i < ((AtomicInteger) this.d.a).get()) {
            synchronized (this) {
                try {
                    int i2 = this.c;
                    if (i2 == -1) {
                        y93.b();
                        y93Var2.getClass();
                        hf3VarD = this.b.d(y93Var2);
                        this.d = hf3VarD.g;
                    } else {
                        hf3VarD = null;
                    }
                    int i3 = ((AtomicInteger) this.d.a).get();
                    if (i2 < i3) {
                        y93.b();
                        y93Var2.getClass();
                        aa1 aa1VarM0 = r93.m0(y93Var2.b);
                        if (aa1VarM0.b()) {
                            o93 o93Var = (o93) aa1VarM0.a();
                            Uri uriA = s93.a();
                            String str = this.a;
                            if (uriA != null) {
                                wq1Var = (wq1) o93Var.a.get(uriA.toString());
                            } else {
                                o93Var.getClass();
                                wq1Var = null;
                            }
                            String str2 = wq1Var == null ? null : (String) wq1Var.get(str);
                            if (str2 == null) {
                                objA = null;
                            } else {
                                try {
                                    objA = b(str2);
                                } catch (IOException | IllegalArgumentException e) {
                                    Log.e("FilePhenotypeFlags", "Invalid Phenotype flag value for flag ".concat(this.a), e);
                                    objA = null;
                                }
                            }
                        } else {
                            objA = null;
                        }
                        if (hf3VarD == null) {
                            hf3VarD = this.b.d(y93Var2);
                        }
                        String str3 = hf3VarD.c;
                        if (Build.VERSION.SDK_INT >= 26 && !y93Var2.b.getPackageName().equals("com.android.vending") && !str3.startsWith("com.google.android.gms.measurement#")) {
                            ListenableFuture listenableFutureA = y93Var2.a().a(new z83(11, y93Var2, str3, z));
                            listenableFutureA.a(new aj2(listenableFutureA, 9), t10.a);
                        }
                        Object obj2 = ((lh1) hf3VarD.a().d).get(this.a);
                        if (obj2 != null) {
                            try {
                                objC = c(obj2);
                            } catch (IOException | ClassCastException e2) {
                                Log.e("FilePhenotypeFlags", "Invalid Phenotype flag value for flag ".concat(this.a), e2);
                            }
                        }
                        if (true != aa1VarM0.b()) {
                            objA = objC;
                        }
                        if (objA == null) {
                            objA = a();
                        }
                        if (objA != null) {
                            e(objA);
                            this.c = i3;
                        }
                    } else {
                        objA = d();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } else {
            objA = d();
        }
        objA.getClass();
        return objA;
    }
}
