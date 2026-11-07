package defpackage;

import android.text.TextUtils;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final /* synthetic */ class pc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qc0 b;

    public /* synthetic */ pc0(qc0 qc0Var, int i) {
        this.a = i;
        this.b = qc0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ae aeVarB;
        ae aeVarG;
        int i = this.a;
        qc0 qc0Var = this.b;
        switch (i) {
            case 0:
                qc0Var.a();
                return;
            case 1:
                Object obj = qc0.m;
                synchronized (obj) {
                    try {
                        hc0 hc0Var = qc0Var.a;
                        hc0Var.a();
                        rd2 rd2VarD = rd2.d(hc0Var.a);
                        try {
                            aeVarB = qc0Var.c.B();
                            if (rd2VarD != null) {
                                rd2VarD.f();
                            }
                        } catch (Throwable th) {
                            if (rd2VarD != null) {
                                rd2VarD.f();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                try {
                    int i2 = aeVarB.b;
                    if (i2 == 5) {
                        aeVarG = qc0Var.g(aeVarB);
                    } else {
                        if (i2 == 3) {
                            aeVarG = qc0Var.g(aeVarB);
                        } else if (!qc0Var.d.a(aeVarB)) {
                            return;
                        } else {
                            aeVarG = qc0Var.b(aeVarB);
                        }
                    }
                    synchronized (obj) {
                        try {
                            hc0 hc0Var2 = qc0Var.a;
                            hc0Var2.a();
                            rd2 rd2VarD2 = rd2.d(hc0Var2.a);
                            try {
                                qc0Var.c.A(aeVarG);
                                if (rd2VarD2 != null) {
                                    rd2VarD2.f();
                                }
                            } catch (Throwable th3) {
                                if (rd2VarD2 != null) {
                                    rd2VarD2.f();
                                }
                                throw th3;
                            }
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                    synchronized (qc0Var) {
                        try {
                            if (qc0Var.k.size() != 0 && !TextUtils.equals(aeVarB.a, aeVarG.a)) {
                                Iterator it = qc0Var.k.iterator();
                                if (it.hasNext()) {
                                    if (it.next() != null) {
                                        throw new ClassCastException();
                                    }
                                    throw null;
                                }
                            }
                        } catch (Throwable th5) {
                            throw th5;
                        }
                    }
                    if (aeVarG.b == 4) {
                        String str = aeVarG.a;
                        synchronized (qc0Var) {
                            qc0Var.j = str;
                        }
                    }
                    int i3 = aeVarG.b;
                    if (i3 == 5) {
                        qc0Var.h(new sc0(0));
                        return;
                    } else if (i3 == 2 || i3 == 1) {
                        qc0Var.h(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                        return;
                    } else {
                        qc0Var.i(aeVarG);
                        return;
                    }
                } catch (sc0 e) {
                    qc0Var.h(e);
                    return;
                }
            default:
                qc0Var.a();
                return;
        }
    }
}
