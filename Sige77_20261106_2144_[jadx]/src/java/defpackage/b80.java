package defpackage;

import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class b80 extends l02 {
    public volatile l02 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ uk0 d;
    public final /* synthetic */ s12 e;
    public final /* synthetic */ c80 f;

    public b80(c80 c80Var, boolean z, boolean z2, uk0 uk0Var, s12 s12Var) {
        this.f = c80Var;
        this.b = z;
        this.c = z2;
        this.d = uk0Var;
        this.e = s12Var;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0061  */
    @Override // defpackage.l02
    public final Object b(au0 au0Var) throws IOException {
        if (this.b) {
            au0Var.X();
            return null;
        }
        l02 l02VarB = this.a;
        if (l02VarB == null) {
            uk0 uk0Var = this.d;
            m02 m02Var = this.f;
            s12 s12Var = this.e;
            ot0 ot0Var = uk0Var.d;
            ot0Var.getClass();
            ConcurrentHashMap concurrentHashMap = ot0Var.b;
            if (m02Var == ot0.c) {
                m02Var = ot0Var;
            } else {
                Class cls = s12Var.a;
                m02 m02Var2 = (m02) concurrentHashMap.get(cls);
                if (m02Var2 == null) {
                    mt0 mt0Var = (mt0) cls.getAnnotation(mt0.class);
                    if (mt0Var != null) {
                        Class clsValue = mt0Var.value();
                        if (m02.class.isAssignableFrom(clsValue)) {
                            m02 m02Var3 = (m02) ot0Var.a.c(new s12(clsValue), true).e();
                            m02 m02Var4 = (m02) concurrentHashMap.putIfAbsent(cls, m02Var3);
                            if (m02Var4 != null) {
                                m02Var3 = m02Var4;
                            }
                            if (m02Var3 == m02Var) {
                                m02Var = ot0Var;
                            }
                        }
                    }
                } else if (m02Var2 == m02Var) {
                    m02Var = ot0Var;
                }
            }
            Iterator it = uk0Var.e.iterator();
            boolean z = false;
            while (true) {
                if (!it.hasNext()) {
                    if (!z) {
                        l02VarB = uk0Var.b(s12Var);
                        break;
                    }
                    ur.g(s12Var, "GSON cannot serialize or deserialize ");
                    return null;
                }
                m02 m02Var5 = (m02) it.next();
                if (z) {
                    l02 l02VarC = m02Var5.c(uk0Var, s12Var);
                    if (l02VarC != null) {
                        l02VarB = l02VarC;
                        break;
                    }
                } else if (m02Var5 == m02Var) {
                    z = true;
                }
            }
            this.a = l02VarB;
        }
        return l02VarB.b(au0Var);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0060  */
    @Override // defpackage.l02
    public final void c(eu0 eu0Var, Object obj) throws IOException {
        if (this.c) {
            eu0Var.p();
            return;
        }
        l02 l02VarB = this.a;
        if (l02VarB == null) {
            uk0 uk0Var = this.d;
            m02 m02Var = this.f;
            s12 s12Var = this.e;
            ot0 ot0Var = uk0Var.d;
            ot0Var.getClass();
            ConcurrentHashMap concurrentHashMap = ot0Var.b;
            if (m02Var == ot0.c) {
                m02Var = ot0Var;
            } else {
                Class cls = s12Var.a;
                m02 m02Var2 = (m02) concurrentHashMap.get(cls);
                if (m02Var2 == null) {
                    mt0 mt0Var = (mt0) cls.getAnnotation(mt0.class);
                    if (mt0Var != null) {
                        Class clsValue = mt0Var.value();
                        if (m02.class.isAssignableFrom(clsValue)) {
                            m02 m02Var3 = (m02) ot0Var.a.c(new s12(clsValue), true).e();
                            m02 m02Var4 = (m02) concurrentHashMap.putIfAbsent(cls, m02Var3);
                            if (m02Var4 != null) {
                                m02Var3 = m02Var4;
                            }
                            if (m02Var3 == m02Var) {
                                m02Var = ot0Var;
                            }
                        }
                    }
                } else if (m02Var2 == m02Var) {
                    m02Var = ot0Var;
                }
            }
            Iterator it = uk0Var.e.iterator();
            boolean z = false;
            while (true) {
                if (!it.hasNext()) {
                    if (!z) {
                        l02VarB = uk0Var.b(s12Var);
                        break;
                    } else {
                        ur.g(s12Var, "GSON cannot serialize or deserialize ");
                        return;
                    }
                }
                m02 m02Var5 = (m02) it.next();
                if (z) {
                    l02 l02VarC = m02Var5.c(uk0Var, s12Var);
                    if (l02VarC != null) {
                        l02VarB = l02VarC;
                        break;
                    }
                } else if (m02Var5 == m02Var) {
                    z = true;
                }
            }
            this.a = l02VarB;
        }
        l02VarB.c(eu0Var, obj);
    }
}
