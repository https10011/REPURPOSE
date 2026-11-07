package defpackage;

import androidx.fragment.app.c;
import com.hjq.toast.BuildConfig;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d;
import okhttp3.Handshake;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.Http2Connection;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final /* synthetic */ class bq implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bq(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:124:0x0291 A[Catch: all -> 0x0225, TRY_LEAVE, TryCatch #4 {all -> 0x0225, blocks: (B:39:0x014e, B:95:0x022c, B:124:0x0291, B:130:0x02b2, B:121:0x028b, B:91:0x0224, B:87:0x021b, B:148:0x02e8, B:149:0x02eb, B:141:0x02cb, B:144:0x02de, B:145:0x02e5, B:152:0x02f0, B:153:0x0306, B:40:0x0157, B:42:0x0160, B:45:0x0171, B:74:0x0200, B:70:0x01f9, B:77:0x0204, B:78:0x0209, B:79:0x020a, B:67:0x01f2, B:118:0x0284, B:84:0x0214), top: B:186:0x014e, inners: #1, #7, #18 }] */
    /* JADX WARN: Code duplicated, block: B:128:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:17:0x0096  */
    /* JADX WARN: Code duplicated, block: B:237:0x02b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:240:0x02ad A[SYNTHETIC] */
    public final Object invoke() {
        fu0 fu0Var;
        int i;
        mf1 mf1Var;
        Throwable th;
        Pair pair;
        Throwable th2;
        Throwable th3;
        Throwable th4;
        Pair pair2;
        int i2 = this.a;
        boolean z = false;
        Object obj = this.b;
        switch (i2) {
            case 0:
                ((c) obj).reportFullyDrawn();
                return null;
            case 1:
                Function0 function0 = (Function0) obj;
                Handshake.Companion companion = Handshake.e;
                try {
                    return (List) function0.invoke();
                } catch (SSLPeerUnverifiedException unused) {
                    return x50.a;
                }
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return (List) obj;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                Http2Connection http2Connection = (Http2Connection) obj;
                Http2Connection.Companion companion2 = Http2Connection.m0;
                http2Connection.getClass();
                try {
                    http2Connection.j0.l(2, 0, false);
                    break;
                } catch (IOException e) {
                    ErrorCode errorCode = ErrorCode.d;
                    http2Connection.a(errorCode, errorCode, e);
                }
                return Unit.a;
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                xi1 xi1Var = (xi1) obj;
                ClassLoader classLoader = xi1Var.c;
                hb0 hb0Var = xi1Var.d;
                Enumeration<URL> resources = classLoader.getResources(BuildConfig.FLAVOR);
                resources.getClass();
                ArrayList list = Collections.list(resources);
                list.getClass();
                ArrayList arrayList = new ArrayList();
                int size = list.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj2 = list.get(i3);
                    i3++;
                    URL url = (URL) obj2;
                    url.getClass();
                    if (Intrinsics.areEqual(url.getProtocol(), "file")) {
                        String str = jb1.b;
                        pair2 = new Pair(hb0Var, br0.j(new File(url.toURI())));
                    } else {
                        pair2 = null;
                    }
                    if (pair2 != null) {
                        arrayList.add(pair2);
                    }
                }
                Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
                resources2.getClass();
                ArrayList list2 = Collections.list(resources2);
                list2.getClass();
                ArrayList arrayList2 = new ArrayList();
                int size2 = list2.size();
                int i4 = 0;
                while (i4 < size2) {
                    int i5 = i4 + 1;
                    URL url2 = (URL) list2.get(i4);
                    url2.getClass();
                    String string = url2.toString();
                    string.getClass();
                    if (d.j(string, "jar:file:", z)) {
                        boolean z2 = true;
                        int iLastIndexOf = string.lastIndexOf("!", string.length() - 1);
                        if (iLastIndexOf != -1) {
                            String str2 = jb1.b;
                            jb1 jb1VarJ = br0.j(new File(URI.create(string.substring(4, iLastIndexOf))));
                            fu0 fu0VarP = hb0Var.p(jb1VarJ);
                            try {
                                long size3 = fu0VarP.size();
                                long j = size3 - 22;
                                long j2 = 0;
                                if (j < 0) {
                                    throw new IOException("not a zip: size=" + fu0VarP.size());
                                }
                                long jMax = Math.max(size3 - 65558, 0L);
                                while (true) {
                                    long j3 = j2;
                                    mf1 mf1Var2 = new mf1(fu0VarP.a(j));
                                    try {
                                        if (mf1Var2.b() == 101010256) {
                                            int i6 = mf1Var2.i() & 65535;
                                            int i7 = mf1Var2.i() & 65535;
                                            hb0 hb0Var2 = hb0Var;
                                            long jI = mf1Var2.i() & 65535;
                                            fu0 fu0Var2 = fu0VarP;
                                            if (jI == (mf1Var2.i() & 65535) && i6 == 0 && i7 == 0) {
                                                try {
                                                    mf1Var2.skip(4L);
                                                    long jB = ((long) mf1Var2.b()) & 4294967295L;
                                                    int i8 = mf1Var2.i() & 65535;
                                                    g70 g70Var = new g70(i8, jI, jB);
                                                    mf1Var2.j(i8);
                                                    try {
                                                        mf1Var2.close();
                                                        long j4 = j - 20;
                                                        if (j4 > j3) {
                                                            fu0Var = fu0Var2;
                                                            try {
                                                                mf1 mf1Var3 = new mf1(fu0Var.a(j4));
                                                                try {
                                                                    if (mf1Var3.b() == 117853008) {
                                                                        int iB = mf1Var3.b();
                                                                        long jE = mf1Var3.e();
                                                                        if (mf1Var3.b() != 1 || iB != 0) {
                                                                            throw new IOException("unsupported zip: spanned");
                                                                        }
                                                                        mf1 mf1Var4 = new mf1(fu0Var.a(jE));
                                                                        try {
                                                                            int iB2 = mf1Var4.b();
                                                                            if (iB2 != 101075792) {
                                                                                throw new IOException("bad zip: expected " + fb2.b(101075792) + " but was " + fb2.b(iB2));
                                                                            }
                                                                            mf1Var4.skip(12L);
                                                                            int iB3 = mf1Var4.b();
                                                                            int iB4 = mf1Var4.b();
                                                                            long jE2 = mf1Var4.e();
                                                                            if (jE2 != mf1Var4.e() || iB3 != 0 || iB4 != 0) {
                                                                                throw new IOException("unsupported zip: spanned");
                                                                            }
                                                                            mf1Var4.skip(8L);
                                                                            g70 g70Var2 = new g70(i8, jE2, mf1Var4.e());
                                                                            try {
                                                                                Unit unit = Unit.a;
                                                                                try {
                                                                                    mf1Var4.close();
                                                                                    th4 = null;
                                                                                } catch (Throwable th5) {
                                                                                    th4 = th5;
                                                                                }
                                                                                g70Var = g70Var2;
                                                                            } catch (Throwable th6) {
                                                                                th3 = th6;
                                                                                g70Var = g70Var2;
                                                                                try {
                                                                                    mf1Var4.close();
                                                                                    Unit unit2 = Unit.a;
                                                                                } catch (Throwable th7) {
                                                                                    a80.a(th3, th7);
                                                                                }
                                                                                th4 = th3;
                                                                            }
                                                                            if (th4 != null) {
                                                                                throw th4;
                                                                            }
                                                                        } catch (Throwable th8) {
                                                                            th3 = th8;
                                                                        }
                                                                    }
                                                                    Unit unit3 = Unit.a;
                                                                    try {
                                                                        mf1Var3.close();
                                                                        th2 = null;
                                                                    } catch (Throwable th9) {
                                                                        th2 = th9;
                                                                    }
                                                                } catch (Throwable th10) {
                                                                    try {
                                                                        mf1Var3.close();
                                                                        Unit unit4 = Unit.a;
                                                                    } catch (Throwable th11) {
                                                                        a80.a(th10, th11);
                                                                    }
                                                                    th2 = th10;
                                                                }
                                                                if (th2 != null) {
                                                                    throw th2;
                                                                }
                                                            } catch (Throwable th12) {
                                                                th = th12;
                                                            }
                                                        } else {
                                                            fu0Var = fu0Var2;
                                                        }
                                                        g70 g70Var3 = g70Var;
                                                        ArrayList arrayList3 = new ArrayList();
                                                        mf1 mf1Var5 = new mf1(fu0Var.a(g70Var3.b));
                                                        try {
                                                            long j5 = g70Var3.a;
                                                            while (j3 < j5) {
                                                                bb2 bb2VarC = fb2.c(mf1Var5);
                                                                i = i5;
                                                                mf1Var = mf1Var5;
                                                                try {
                                                                    if (bb2VarC.h >= g70Var3.b) {
                                                                        throw new IOException("bad zip: local file header offset >= central directory offset");
                                                                    }
                                                                    jb1 jb1Var = xi1.f;
                                                                    if (vl0.d(bb2VarC.a)) {
                                                                        arrayList3.add(bb2VarC);
                                                                    }
                                                                    j3++;
                                                                    mf1Var5 = mf1Var;
                                                                    i5 = i;
                                                                } catch (Throwable th13) {
                                                                    th = th13;
                                                                    Throwable th14 = th;
                                                                    try {
                                                                        mf1Var.close();
                                                                        Unit unit5 = Unit.a;
                                                                    } catch (Throwable th15) {
                                                                        a80.a(th14, th15);
                                                                    }
                                                                    th = th14;
                                                                    if (th == null) {
                                                                        throw th;
                                                                    }
                                                                    hb0Var = hb0Var2;
                                                                    cb2 cb2Var = new cb2(jb1VarJ, hb0Var, fb2.a(arrayList3));
                                                                    try {
                                                                        fu0Var.close();
                                                                        Unit unit6 = Unit.a;
                                                                        break;
                                                                    } catch (Throwable unused2) {
                                                                    }
                                                                    pair = new Pair(cb2Var, xi1.f);
                                                                    if (pair != null) {
                                                                        arrayList2.add(pair);
                                                                    }
                                                                    i4 = i;
                                                                    z = false;
                                                                }
                                                                break;
                                                            }
                                                            i = i5;
                                                            mf1 mf1Var6 = mf1Var5;
                                                            Unit unit7 = Unit.a;
                                                            try {
                                                                mf1Var6.close();
                                                                th = null;
                                                            } catch (Throwable th16) {
                                                                th = th16;
                                                            }
                                                        } catch (Throwable th17) {
                                                            th = th17;
                                                            i = i5;
                                                            mf1Var = mf1Var5;
                                                        }
                                                        if (th == null) {
                                                            throw th;
                                                        }
                                                        hb0Var = hb0Var2;
                                                        cb2 cb2Var2 = new cb2(jb1VarJ, hb0Var, fb2.a(arrayList3));
                                                        fu0Var.close();
                                                        Unit unit8 = Unit.a;
                                                        pair = new Pair(cb2Var2, xi1.f);
                                                    } catch (Throwable th18) {
                                                        th = th18;
                                                        fu0Var = fu0Var2;
                                                    }
                                                } catch (Throwable th19) {
                                                    th = th19;
                                                }
                                                break;
                                            } else {
                                                try {
                                                    throw new IOException("unsupported zip: spanned");
                                                } catch (Throwable th20) {
                                                    th = th20;
                                                }
                                            }
                                        } else {
                                            int i9 = i5;
                                            boolean z3 = z2;
                                            fu0 fu0Var3 = fu0VarP;
                                            mf1Var2.close();
                                            j--;
                                            if (j < jMax) {
                                                throw new IOException("not a zip: end of central directory signature not found");
                                            }
                                            fu0VarP = fu0Var3;
                                            j2 = j3;
                                            i5 = i9;
                                            z2 = z3;
                                        }
                                    } catch (Throwable th21) {
                                        th = th21;
                                    }
                                    mf1Var2.close();
                                    throw th;
                                }
                            } catch (Throwable th22) {
                                th = th22;
                                fu0Var = fu0VarP;
                            }
                            Throwable th23 = th;
                            if (fu0Var == null) {
                                throw th23;
                            }
                            try {
                                fu0Var.close();
                                Unit unit9 = Unit.a;
                                throw th23;
                            } catch (Throwable th24) {
                                a80.a(th23, th24);
                                throw th23;
                            }
                        }
                        i = i5;
                        pair = null;
                    } else {
                        i = i5;
                        pair = null;
                    }
                    if (pair != null) {
                        arrayList2.add(pair);
                    }
                    i4 = i;
                    z = false;
                }
                return CollectionsKt.v(arrayList, arrayList2);
            default:
                return obj;
        }
    }
}
