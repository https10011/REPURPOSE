package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.StrictMode;
import android.util.Pair;
import com.google.android.gms.common.Feature;
import com.hjq.toast.BuildConfig;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class hf3 {
    public static final m83 i;
    public static final he3 j;
    public volatile nx0 a;
    public final y93 b;
    public final String c;
    public final String d;
    public final boolean e;
    public final wo0 f;
    public final k93 g;
    public final u23 h;

    static {
        m83 m83Var = new m83();
        m83Var.a = new ConcurrentHashMap();
        i = m83Var;
        to2 to2Var = to2.c;
        int i2 = wo0.c;
        j = new he3(to2Var, false, mh1.W);
    }

    public hf3(y93 y93Var, he3 he3Var) {
        this.b = y93Var;
        String strA = he3Var.a(y93Var.b);
        this.c = strA;
        this.d = BuildConfig.FLAVOR;
        this.e = he3Var.b;
        this.f = he3Var.c;
        this.a = null;
        this.g = new k93();
        this.h = new u23(y93Var, strA);
    }

    public final nx0 a() {
        nx0 nx0Var;
        nx0 nx0Var2 = this.a;
        if (nx0Var2 != null) {
            return nx0Var2;
        }
        synchronized (this) {
            try {
                nx0Var = this.a;
                if (nx0Var == null) {
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
                    try {
                        nx0 nx0VarB = this.h.b();
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                        int i2 = ((u61) nx0VarB.e).b - 2;
                        if (i2 == 15 || i2 == 16) {
                            nx0Var = nx0VarB;
                        } else {
                            y93 y93Var = this.b;
                            y93Var.g.a();
                            if (this.e || this.h.m() || !((String) nx0VarB.a).isEmpty()) {
                                final int i3 = 3;
                                y93Var.a().execute(new Runnable(this) { // from class: ke3
                                    public final /* synthetic */ hf3 b;

                                    {
                                        this.b = this;
                                    }

                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int i4;
                                        cd3 cd3Var;
                                        gj3 gj3Var;
                                        int i5;
                                        j10 j10Var;
                                        vd0 vd0VarA;
                                        z zVarB;
                                        int i6 = i3;
                                        int i7 = 0;
                                        hf3 hf3Var = this.b;
                                        switch (i6) {
                                            case 0:
                                                hf3Var.b();
                                                return;
                                            case 1:
                                                y93 y93Var2 = hf3Var.b;
                                                String str = hf3Var.c;
                                                pl3 pl3Var = uf3.a;
                                                j10 j10Var2 = j10.e;
                                                Context context = y93Var2.b;
                                                Pattern pattern = sh3.a;
                                                qp0 qp0Var = new qp0(context);
                                                qp0Var.v("phenotype");
                                                qp0Var.y("all_accounts.pb");
                                                Uri uriZ = qp0Var.z();
                                                if (uriZ == null) {
                                                    uq1.h("Null uri");
                                                    return;
                                                }
                                                cd3 cd3VarU = cd3.u();
                                                if (cd3VarU == null) {
                                                    uq1.h("Null schema");
                                                    return;
                                                }
                                                pl3 pl3Var2 = uf3.a;
                                                pl3Var2.getClass();
                                                sc1 sc1Var = new sc1(pl3Var2);
                                                no0 no0Var = ro0.b;
                                                gh1 gh1Var = gh1.e;
                                                gj3 gj3Var2 = new gj3(uriZ, cd3VarU, sc1Var, gh1Var);
                                                co coVar = uf3.c;
                                                if (coVar == null) {
                                                    synchronized (uf3.b) {
                                                        try {
                                                            coVar = uf3.c;
                                                            if (coVar == null) {
                                                                HashMap map = new HashMap();
                                                                q51 q51VarA = y93Var2.a();
                                                                nh3 nh3Var = (nh3) y93Var2.f.get();
                                                                bk3 bk3Var = bk3.a;
                                                                i4 = 1;
                                                                yv2.i(!map.containsKey("singleproc"), "There is already a factory registered for the ID %s", "singleproc");
                                                                map.put("singleproc", bk3Var);
                                                                co coVar2 = new co();
                                                                coVar2.a = new ConcurrentHashMap();
                                                                q51VarA.getClass();
                                                                coVar2.b = q51VarA;
                                                                nh3Var.getClass();
                                                                coVar2.c = nh3Var;
                                                                coVar2.e = map;
                                                                yv2.h(!map.isEmpty());
                                                                coVar2.d = kb3.c;
                                                                uf3.c = coVar2;
                                                                coVar = coVar2;
                                                            } else {
                                                                i4 = 1;
                                                            }
                                                        } catch (Throwable th) {
                                                            throw th;
                                                        }
                                                        break;
                                                    }
                                                } else {
                                                    y93Var2 = y93Var2;
                                                    i4 = 1;
                                                }
                                                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) coVar.a;
                                                Pair pair = (Pair) concurrentHashMap.get(uriZ);
                                                if (pair == null) {
                                                    yv2.i(uriZ.isHierarchical(), "Uri must be hierarchical: %s", uriZ);
                                                    String lastPathSegment = uriZ.getLastPathSegment();
                                                    int i8 = sb1.a;
                                                    if (lastPathSegment == null) {
                                                        lastPathSegment = BuildConfig.FLAVOR;
                                                    }
                                                    int iLastIndexOf = lastPathSegment.lastIndexOf(46);
                                                    yv2.i((iLastIndexOf == -1 ? BuildConfig.FLAVOR : lastPathSegment.substring(iLastIndexOf + 1)).equals("pb"), "Uri extension must be .pb: %s", uriZ);
                                                    bk3 bk3Var2 = (bk3) ((HashMap) coVar.e).get("singleproc");
                                                    yv2.i(bk3Var2 != null ? i4 : 0, "No XDataStoreVariantFactory registered for ID %s", "singleproc");
                                                    String lastPathSegment2 = uriZ.getLastPathSegment();
                                                    if (lastPathSegment2 == null) {
                                                        lastPathSegment2 = BuildConfig.FLAVOR;
                                                    }
                                                    int iLastIndexOf2 = lastPathSegment2.lastIndexOf(46);
                                                    if (iLastIndexOf2 != -1) {
                                                        lastPathSegment2 = lastPathSegment2.substring(0, iLastIndexOf2);
                                                    }
                                                    r1 r1VarG = dh0.g(dh0.d(uriZ), (kb3) coVar.d, t10.a);
                                                    Executor executor = (Executor) coVar.b;
                                                    nh3 nh3Var2 = (nh3) coVar.c;
                                                    bk3Var2.getClass();
                                                    String str2 = lastPathSegment2;
                                                    rl3 rl3Var = new rl3(cd3VarU, vl2.a());
                                                    i5 = i4;
                                                    j10Var = j10Var2;
                                                    cd3Var = cd3VarU;
                                                    tj3 tj3Var = new tj3(new rk3(str2, dh0.d(uriZ), rl3Var, executor, nh3Var2, sc1Var, new r41(23)), r1VarG);
                                                    if (!gh1Var.isEmpty()) {
                                                        bg3 bg3Var = new bg3(i5, gh1Var, executor);
                                                        synchronized (tj3Var.g) {
                                                            tj3Var.i.add(bg3Var);
                                                        }
                                                    }
                                                    Pair pairCreate = Pair.create(tj3Var, gj3Var2);
                                                    Pair pair2 = (Pair) concurrentHashMap.putIfAbsent(uriZ, pairCreate);
                                                    if (pair2 != null) {
                                                        pair = pair2;
                                                        gj3Var = gj3Var2;
                                                    } else {
                                                        gj3Var = gj3Var2;
                                                        pair = pairCreate;
                                                    }
                                                    break;
                                                } else {
                                                    cd3Var = cd3VarU;
                                                    gj3Var = gj3Var2;
                                                    i5 = i4;
                                                    j10Var = j10Var2;
                                                }
                                                tj3 tj3Var2 = (tj3) pair.first;
                                                gj3 gj3Var3 = (gj3) pair.second;
                                                if (gj3Var.equals(gj3Var3)) {
                                                    s1 s1VarA = tj3Var2.a(new ve3(str, i5), y93Var2.a());
                                                    s1VarA.a(new qe3(hf3Var, s1VarA, 0), y93Var2.a());
                                                    return;
                                                }
                                                String strS = ga.s("ProtoDataStoreConfig<%s> doesn't match previous call [uri=%s] [%s]", cd3.class.getSimpleName(), uriZ);
                                                yv2.i(uriZ.equals(gj3Var3.a), strS, "uri");
                                                yv2.i(cd3Var.equals(gj3Var3.b), strS, "schema");
                                                yv2.i(sc1Var.equals(gj3Var3.c), strS, "handler");
                                                yv2.i(gh1Var.equals(gj3Var3.d), strS, "migrations");
                                                Object obj = j10Var;
                                                yv2.i(obj.equals(obj), strS, "variantConfig");
                                                e.g(ga.s(strS, "unknown"));
                                                return;
                                            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                                                gg3 gg3Var = hf3Var.b.i;
                                                boolean z = hf3Var.e;
                                                re3 re3Var = re3.a;
                                                mg3 mg3Var = (mg3) gg3Var.c.get();
                                                if (mg3Var == null && !z) {
                                                    un0 un0Var = un0.b;
                                                    return;
                                                }
                                                if ((gg3Var.e & 64) == 0) {
                                                    CopyOnWriteArrayList copyOnWriteArrayList = gg3Var.f;
                                                    synchronized (copyOnWriteArrayList) {
                                                        try {
                                                            int i9 = gg3Var.e;
                                                            if ((i9 & 64) == 0) {
                                                                copyOnWriteArrayList.add(re3Var);
                                                                gg3Var.e = i9 | 64;
                                                            }
                                                        } catch (Throwable th2) {
                                                            throw th2;
                                                        }
                                                        break;
                                                    }
                                                }
                                                if (gg3Var.h == null) {
                                                    synchronized (gg3Var.g) {
                                                        try {
                                                            if (gg3Var.h == null) {
                                                                if (mg3Var == null) {
                                                                    mg3Var = dg3.a;
                                                                }
                                                                Context context2 = gg3Var.a;
                                                                if (g93.S(context2)) {
                                                                    vd0VarA = ((nb3) gg3Var.d.get()).a(new nl1(gg3Var, mg3Var));
                                                                    gg3Var.h = vd0VarA;
                                                                } else {
                                                                    e10 e10Var = e10.c;
                                                                    cv1 cv1Var = gg3Var.b;
                                                                    vd0VarA = dh0.g(g93.P(context2, Executors.callable(e10Var, null), (Executor) cv1Var.get()), new bg3(i7, gg3Var, mg3Var), (Executor) cv1Var.get());
                                                                    gg3Var.h = vd0VarA;
                                                                }
                                                                vd0VarA.a(new aj2(vd0VarA, 10), (Executor) gg3Var.b.get());
                                                            }
                                                        } catch (Throwable th3) {
                                                            throw th3;
                                                        }
                                                        break;
                                                    }
                                                    return;
                                                }
                                                return;
                                            default:
                                                nx0 nx0VarA = hf3Var.a();
                                                String str3 = (String) nx0VarA.a;
                                                y93 y93Var3 = hf3Var.b;
                                                cv1 cv1Var2 = y93Var3.d;
                                                og3 og3VarB = y93Var3.g.b();
                                                boolean z2 = og3VarB.i;
                                                if (og3VarB.j) {
                                                    if (sb1.a(str3) && !z2) {
                                                        un0 un0Var2 = un0.b;
                                                        return;
                                                    }
                                                    ta3 ta3VarU = ab3.u();
                                                    u61 u61Var = (u61) nx0VarA.e;
                                                    int i10 = u61Var.a;
                                                    wa3 wa3VarT = za3.t();
                                                    wa3VarT.d();
                                                    ((za3) wa3VarT.b).u(i10);
                                                    int i11 = u61Var.b;
                                                    wa3VarT.d();
                                                    ((za3) wa3VarT.b).v(i11);
                                                    za3 za3Var = (za3) wa3VarT.g();
                                                    ta3VarU.d();
                                                    ((ab3) ta3VarU.b).w(za3Var);
                                                    if (!sb1.a(str3)) {
                                                        ta3VarU.d();
                                                        ((ab3) ta3VarU.b).v(str3);
                                                    }
                                                    if (z2) {
                                                        String str4 = hf3Var.c;
                                                        ta3VarU.d();
                                                        ((ab3) ta3VarU.b).x(str4);
                                                    }
                                                    nb3 nb3Var = (nb3) cv1Var2.get();
                                                    ab3 ab3Var = (ab3) ta3VarU.g();
                                                    u83 u83Var = nb3Var.a;
                                                    ei eiVarB = ei.b();
                                                    eiVarB.d = new gk1(ab3Var, 28);
                                                    eiVarB.e = new Feature[]{yv2.k};
                                                    eiVarB.c = false;
                                                    zVarB = nb3.b(u83Var.b(0, eiVarB.a()).continueWithTask(t10.a, new md2(u83Var, ab3Var)));
                                                } else {
                                                    if (sb1.a(str3)) {
                                                        un0 un0Var3 = un0.b;
                                                        return;
                                                    }
                                                    nb3 nb3Var2 = (nb3) cv1Var2.get();
                                                    nb3Var2.getClass();
                                                    str3.getClass();
                                                    zVarB = nb3.b(nb3Var2.a.c(str3));
                                                }
                                                dh0.a(zVarB, jb3.class, new me3(hf3Var, i7), y93Var3.a());
                                                return;
                                        }
                                    }
                                });
                                y93Var.a.j((hl2) nx0VarB.c, this.f, this.c);
                                if (!this.d.equals(BuildConfig.FLAVOR)) {
                                    final int i4 = 1;
                                    y93Var.a().execute(new Runnable(this) { // from class: ke3
                                        public final /* synthetic */ hf3 b;

                                        {
                                            this.b = this;
                                        }

                                        /* JADX WARN: Multi-variable type inference failed */
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i5;
                                            cd3 cd3Var;
                                            gj3 gj3Var;
                                            int i6;
                                            j10 j10Var;
                                            vd0 vd0VarA;
                                            z zVarB;
                                            int i7 = i4;
                                            int i8 = 0;
                                            hf3 hf3Var = this.b;
                                            switch (i7) {
                                                case 0:
                                                    hf3Var.b();
                                                    return;
                                                case 1:
                                                    y93 y93Var2 = hf3Var.b;
                                                    String str = hf3Var.c;
                                                    pl3 pl3Var = uf3.a;
                                                    j10 j10Var2 = j10.e;
                                                    Context context = y93Var2.b;
                                                    Pattern pattern = sh3.a;
                                                    qp0 qp0Var = new qp0(context);
                                                    qp0Var.v("phenotype");
                                                    qp0Var.y("all_accounts.pb");
                                                    Uri uriZ = qp0Var.z();
                                                    if (uriZ == null) {
                                                        uq1.h("Null uri");
                                                        return;
                                                    }
                                                    cd3 cd3VarU = cd3.u();
                                                    if (cd3VarU == null) {
                                                        uq1.h("Null schema");
                                                        return;
                                                    }
                                                    pl3 pl3Var2 = uf3.a;
                                                    pl3Var2.getClass();
                                                    sc1 sc1Var = new sc1(pl3Var2);
                                                    no0 no0Var = ro0.b;
                                                    gh1 gh1Var = gh1.e;
                                                    gj3 gj3Var2 = new gj3(uriZ, cd3VarU, sc1Var, gh1Var);
                                                    co coVar = uf3.c;
                                                    if (coVar == null) {
                                                        synchronized (uf3.b) {
                                                            try {
                                                                coVar = uf3.c;
                                                                if (coVar == null) {
                                                                    HashMap map = new HashMap();
                                                                    q51 q51VarA = y93Var2.a();
                                                                    nh3 nh3Var = (nh3) y93Var2.f.get();
                                                                    bk3 bk3Var = bk3.a;
                                                                    i5 = 1;
                                                                    yv2.i(!map.containsKey("singleproc"), "There is already a factory registered for the ID %s", "singleproc");
                                                                    map.put("singleproc", bk3Var);
                                                                    co coVar2 = new co();
                                                                    coVar2.a = new ConcurrentHashMap();
                                                                    q51VarA.getClass();
                                                                    coVar2.b = q51VarA;
                                                                    nh3Var.getClass();
                                                                    coVar2.c = nh3Var;
                                                                    coVar2.e = map;
                                                                    yv2.h(!map.isEmpty());
                                                                    coVar2.d = kb3.c;
                                                                    uf3.c = coVar2;
                                                                    coVar = coVar2;
                                                                } else {
                                                                    i5 = 1;
                                                                }
                                                            } catch (Throwable th) {
                                                                throw th;
                                                            }
                                                            break;
                                                        }
                                                    } else {
                                                        y93Var2 = y93Var2;
                                                        i5 = 1;
                                                    }
                                                    ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) coVar.a;
                                                    Pair pair = (Pair) concurrentHashMap.get(uriZ);
                                                    if (pair == null) {
                                                        yv2.i(uriZ.isHierarchical(), "Uri must be hierarchical: %s", uriZ);
                                                        String lastPathSegment = uriZ.getLastPathSegment();
                                                        int i9 = sb1.a;
                                                        if (lastPathSegment == null) {
                                                            lastPathSegment = BuildConfig.FLAVOR;
                                                        }
                                                        int iLastIndexOf = lastPathSegment.lastIndexOf(46);
                                                        yv2.i((iLastIndexOf == -1 ? BuildConfig.FLAVOR : lastPathSegment.substring(iLastIndexOf + 1)).equals("pb"), "Uri extension must be .pb: %s", uriZ);
                                                        bk3 bk3Var2 = (bk3) ((HashMap) coVar.e).get("singleproc");
                                                        yv2.i(bk3Var2 != null ? i5 : 0, "No XDataStoreVariantFactory registered for ID %s", "singleproc");
                                                        String lastPathSegment2 = uriZ.getLastPathSegment();
                                                        if (lastPathSegment2 == null) {
                                                            lastPathSegment2 = BuildConfig.FLAVOR;
                                                        }
                                                        int iLastIndexOf2 = lastPathSegment2.lastIndexOf(46);
                                                        if (iLastIndexOf2 != -1) {
                                                            lastPathSegment2 = lastPathSegment2.substring(0, iLastIndexOf2);
                                                        }
                                                        r1 r1VarG = dh0.g(dh0.d(uriZ), (kb3) coVar.d, t10.a);
                                                        Executor executor = (Executor) coVar.b;
                                                        nh3 nh3Var2 = (nh3) coVar.c;
                                                        bk3Var2.getClass();
                                                        String str2 = lastPathSegment2;
                                                        rl3 rl3Var = new rl3(cd3VarU, vl2.a());
                                                        i6 = i5;
                                                        j10Var = j10Var2;
                                                        cd3Var = cd3VarU;
                                                        tj3 tj3Var = new tj3(new rk3(str2, dh0.d(uriZ), rl3Var, executor, nh3Var2, sc1Var, new r41(23)), r1VarG);
                                                        if (!gh1Var.isEmpty()) {
                                                            bg3 bg3Var = new bg3(i6, gh1Var, executor);
                                                            synchronized (tj3Var.g) {
                                                                tj3Var.i.add(bg3Var);
                                                            }
                                                        }
                                                        Pair pairCreate = Pair.create(tj3Var, gj3Var2);
                                                        Pair pair2 = (Pair) concurrentHashMap.putIfAbsent(uriZ, pairCreate);
                                                        if (pair2 != null) {
                                                            pair = pair2;
                                                            gj3Var = gj3Var2;
                                                        } else {
                                                            gj3Var = gj3Var2;
                                                            pair = pairCreate;
                                                        }
                                                        break;
                                                    } else {
                                                        cd3Var = cd3VarU;
                                                        gj3Var = gj3Var2;
                                                        i6 = i5;
                                                        j10Var = j10Var2;
                                                    }
                                                    tj3 tj3Var2 = (tj3) pair.first;
                                                    gj3 gj3Var3 = (gj3) pair.second;
                                                    if (gj3Var.equals(gj3Var3)) {
                                                        s1 s1VarA = tj3Var2.a(new ve3(str, i6), y93Var2.a());
                                                        s1VarA.a(new qe3(hf3Var, s1VarA, 0), y93Var2.a());
                                                        return;
                                                    }
                                                    String strS = ga.s("ProtoDataStoreConfig<%s> doesn't match previous call [uri=%s] [%s]", cd3.class.getSimpleName(), uriZ);
                                                    yv2.i(uriZ.equals(gj3Var3.a), strS, "uri");
                                                    yv2.i(cd3Var.equals(gj3Var3.b), strS, "schema");
                                                    yv2.i(sc1Var.equals(gj3Var3.c), strS, "handler");
                                                    yv2.i(gh1Var.equals(gj3Var3.d), strS, "migrations");
                                                    Object obj = j10Var;
                                                    yv2.i(obj.equals(obj), strS, "variantConfig");
                                                    e.g(ga.s(strS, "unknown"));
                                                    return;
                                                case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                                                    gg3 gg3Var = hf3Var.b.i;
                                                    boolean z = hf3Var.e;
                                                    re3 re3Var = re3.a;
                                                    mg3 mg3Var = (mg3) gg3Var.c.get();
                                                    if (mg3Var == null && !z) {
                                                        un0 un0Var = un0.b;
                                                        return;
                                                    }
                                                    if ((gg3Var.e & 64) == 0) {
                                                        CopyOnWriteArrayList copyOnWriteArrayList = gg3Var.f;
                                                        synchronized (copyOnWriteArrayList) {
                                                            try {
                                                                int i10 = gg3Var.e;
                                                                if ((i10 & 64) == 0) {
                                                                    copyOnWriteArrayList.add(re3Var);
                                                                    gg3Var.e = i10 | 64;
                                                                }
                                                            } catch (Throwable th2) {
                                                                throw th2;
                                                            }
                                                            break;
                                                        }
                                                    }
                                                    if (gg3Var.h == null) {
                                                        synchronized (gg3Var.g) {
                                                            try {
                                                                if (gg3Var.h == null) {
                                                                    if (mg3Var == null) {
                                                                        mg3Var = dg3.a;
                                                                    }
                                                                    Context context2 = gg3Var.a;
                                                                    if (g93.S(context2)) {
                                                                        vd0VarA = ((nb3) gg3Var.d.get()).a(new nl1(gg3Var, mg3Var));
                                                                        gg3Var.h = vd0VarA;
                                                                    } else {
                                                                        e10 e10Var = e10.c;
                                                                        cv1 cv1Var = gg3Var.b;
                                                                        vd0VarA = dh0.g(g93.P(context2, Executors.callable(e10Var, null), (Executor) cv1Var.get()), new bg3(i8, gg3Var, mg3Var), (Executor) cv1Var.get());
                                                                        gg3Var.h = vd0VarA;
                                                                    }
                                                                    vd0VarA.a(new aj2(vd0VarA, 10), (Executor) gg3Var.b.get());
                                                                }
                                                            } catch (Throwable th3) {
                                                                throw th3;
                                                            }
                                                            break;
                                                        }
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    nx0 nx0VarA = hf3Var.a();
                                                    String str3 = (String) nx0VarA.a;
                                                    y93 y93Var3 = hf3Var.b;
                                                    cv1 cv1Var2 = y93Var3.d;
                                                    og3 og3VarB = y93Var3.g.b();
                                                    boolean z2 = og3VarB.i;
                                                    if (og3VarB.j) {
                                                        if (sb1.a(str3) && !z2) {
                                                            un0 un0Var2 = un0.b;
                                                            return;
                                                        }
                                                        ta3 ta3VarU = ab3.u();
                                                        u61 u61Var = (u61) nx0VarA.e;
                                                        int i11 = u61Var.a;
                                                        wa3 wa3VarT = za3.t();
                                                        wa3VarT.d();
                                                        ((za3) wa3VarT.b).u(i11);
                                                        int i12 = u61Var.b;
                                                        wa3VarT.d();
                                                        ((za3) wa3VarT.b).v(i12);
                                                        za3 za3Var = (za3) wa3VarT.g();
                                                        ta3VarU.d();
                                                        ((ab3) ta3VarU.b).w(za3Var);
                                                        if (!sb1.a(str3)) {
                                                            ta3VarU.d();
                                                            ((ab3) ta3VarU.b).v(str3);
                                                        }
                                                        if (z2) {
                                                            String str4 = hf3Var.c;
                                                            ta3VarU.d();
                                                            ((ab3) ta3VarU.b).x(str4);
                                                        }
                                                        nb3 nb3Var = (nb3) cv1Var2.get();
                                                        ab3 ab3Var = (ab3) ta3VarU.g();
                                                        u83 u83Var = nb3Var.a;
                                                        ei eiVarB = ei.b();
                                                        eiVarB.d = new gk1(ab3Var, 28);
                                                        eiVarB.e = new Feature[]{yv2.k};
                                                        eiVarB.c = false;
                                                        zVarB = nb3.b(u83Var.b(0, eiVarB.a()).continueWithTask(t10.a, new md2(u83Var, ab3Var)));
                                                    } else {
                                                        if (sb1.a(str3)) {
                                                            un0 un0Var3 = un0.b;
                                                            return;
                                                        }
                                                        nb3 nb3Var2 = (nb3) cv1Var2.get();
                                                        nb3Var2.getClass();
                                                        str3.getClass();
                                                        zVarB = nb3.b(nb3Var2.a.c(str3));
                                                    }
                                                    dh0.a(zVarB, jb3.class, new me3(hf3Var, i8), y93Var3.a());
                                                    return;
                                            }
                                        }
                                    });
                                }
                                if (this.h.m()) {
                                    final int i5 = 2;
                                    y93Var.a().execute(new Runnable(this) { // from class: ke3
                                        public final /* synthetic */ hf3 b;

                                        {
                                            this.b = this;
                                        }

                                        /* JADX WARN: Multi-variable type inference failed */
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i6;
                                            cd3 cd3Var;
                                            gj3 gj3Var;
                                            int i7;
                                            j10 j10Var;
                                            vd0 vd0VarA;
                                            z zVarB;
                                            int i8 = i5;
                                            int i9 = 0;
                                            hf3 hf3Var = this.b;
                                            switch (i8) {
                                                case 0:
                                                    hf3Var.b();
                                                    return;
                                                case 1:
                                                    y93 y93Var2 = hf3Var.b;
                                                    String str = hf3Var.c;
                                                    pl3 pl3Var = uf3.a;
                                                    j10 j10Var2 = j10.e;
                                                    Context context = y93Var2.b;
                                                    Pattern pattern = sh3.a;
                                                    qp0 qp0Var = new qp0(context);
                                                    qp0Var.v("phenotype");
                                                    qp0Var.y("all_accounts.pb");
                                                    Uri uriZ = qp0Var.z();
                                                    if (uriZ == null) {
                                                        uq1.h("Null uri");
                                                        return;
                                                    }
                                                    cd3 cd3VarU = cd3.u();
                                                    if (cd3VarU == null) {
                                                        uq1.h("Null schema");
                                                        return;
                                                    }
                                                    pl3 pl3Var2 = uf3.a;
                                                    pl3Var2.getClass();
                                                    sc1 sc1Var = new sc1(pl3Var2);
                                                    no0 no0Var = ro0.b;
                                                    gh1 gh1Var = gh1.e;
                                                    gj3 gj3Var2 = new gj3(uriZ, cd3VarU, sc1Var, gh1Var);
                                                    co coVar = uf3.c;
                                                    if (coVar == null) {
                                                        synchronized (uf3.b) {
                                                            try {
                                                                coVar = uf3.c;
                                                                if (coVar == null) {
                                                                    HashMap map = new HashMap();
                                                                    q51 q51VarA = y93Var2.a();
                                                                    nh3 nh3Var = (nh3) y93Var2.f.get();
                                                                    bk3 bk3Var = bk3.a;
                                                                    i6 = 1;
                                                                    yv2.i(!map.containsKey("singleproc"), "There is already a factory registered for the ID %s", "singleproc");
                                                                    map.put("singleproc", bk3Var);
                                                                    co coVar2 = new co();
                                                                    coVar2.a = new ConcurrentHashMap();
                                                                    q51VarA.getClass();
                                                                    coVar2.b = q51VarA;
                                                                    nh3Var.getClass();
                                                                    coVar2.c = nh3Var;
                                                                    coVar2.e = map;
                                                                    yv2.h(!map.isEmpty());
                                                                    coVar2.d = kb3.c;
                                                                    uf3.c = coVar2;
                                                                    coVar = coVar2;
                                                                } else {
                                                                    i6 = 1;
                                                                }
                                                            } catch (Throwable th) {
                                                                throw th;
                                                            }
                                                            break;
                                                        }
                                                    } else {
                                                        y93Var2 = y93Var2;
                                                        i6 = 1;
                                                    }
                                                    ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) coVar.a;
                                                    Pair pair = (Pair) concurrentHashMap.get(uriZ);
                                                    if (pair == null) {
                                                        yv2.i(uriZ.isHierarchical(), "Uri must be hierarchical: %s", uriZ);
                                                        String lastPathSegment = uriZ.getLastPathSegment();
                                                        int i10 = sb1.a;
                                                        if (lastPathSegment == null) {
                                                            lastPathSegment = BuildConfig.FLAVOR;
                                                        }
                                                        int iLastIndexOf = lastPathSegment.lastIndexOf(46);
                                                        yv2.i((iLastIndexOf == -1 ? BuildConfig.FLAVOR : lastPathSegment.substring(iLastIndexOf + 1)).equals("pb"), "Uri extension must be .pb: %s", uriZ);
                                                        bk3 bk3Var2 = (bk3) ((HashMap) coVar.e).get("singleproc");
                                                        yv2.i(bk3Var2 != null ? i6 : 0, "No XDataStoreVariantFactory registered for ID %s", "singleproc");
                                                        String lastPathSegment2 = uriZ.getLastPathSegment();
                                                        if (lastPathSegment2 == null) {
                                                            lastPathSegment2 = BuildConfig.FLAVOR;
                                                        }
                                                        int iLastIndexOf2 = lastPathSegment2.lastIndexOf(46);
                                                        if (iLastIndexOf2 != -1) {
                                                            lastPathSegment2 = lastPathSegment2.substring(0, iLastIndexOf2);
                                                        }
                                                        r1 r1VarG = dh0.g(dh0.d(uriZ), (kb3) coVar.d, t10.a);
                                                        Executor executor = (Executor) coVar.b;
                                                        nh3 nh3Var2 = (nh3) coVar.c;
                                                        bk3Var2.getClass();
                                                        String str2 = lastPathSegment2;
                                                        rl3 rl3Var = new rl3(cd3VarU, vl2.a());
                                                        i7 = i6;
                                                        j10Var = j10Var2;
                                                        cd3Var = cd3VarU;
                                                        tj3 tj3Var = new tj3(new rk3(str2, dh0.d(uriZ), rl3Var, executor, nh3Var2, sc1Var, new r41(23)), r1VarG);
                                                        if (!gh1Var.isEmpty()) {
                                                            bg3 bg3Var = new bg3(i7, gh1Var, executor);
                                                            synchronized (tj3Var.g) {
                                                                tj3Var.i.add(bg3Var);
                                                            }
                                                        }
                                                        Pair pairCreate = Pair.create(tj3Var, gj3Var2);
                                                        Pair pair2 = (Pair) concurrentHashMap.putIfAbsent(uriZ, pairCreate);
                                                        if (pair2 != null) {
                                                            pair = pair2;
                                                            gj3Var = gj3Var2;
                                                        } else {
                                                            gj3Var = gj3Var2;
                                                            pair = pairCreate;
                                                        }
                                                        break;
                                                    } else {
                                                        cd3Var = cd3VarU;
                                                        gj3Var = gj3Var2;
                                                        i7 = i6;
                                                        j10Var = j10Var2;
                                                    }
                                                    tj3 tj3Var2 = (tj3) pair.first;
                                                    gj3 gj3Var3 = (gj3) pair.second;
                                                    if (gj3Var.equals(gj3Var3)) {
                                                        s1 s1VarA = tj3Var2.a(new ve3(str, i7), y93Var2.a());
                                                        s1VarA.a(new qe3(hf3Var, s1VarA, 0), y93Var2.a());
                                                        return;
                                                    }
                                                    String strS = ga.s("ProtoDataStoreConfig<%s> doesn't match previous call [uri=%s] [%s]", cd3.class.getSimpleName(), uriZ);
                                                    yv2.i(uriZ.equals(gj3Var3.a), strS, "uri");
                                                    yv2.i(cd3Var.equals(gj3Var3.b), strS, "schema");
                                                    yv2.i(sc1Var.equals(gj3Var3.c), strS, "handler");
                                                    yv2.i(gh1Var.equals(gj3Var3.d), strS, "migrations");
                                                    Object obj = j10Var;
                                                    yv2.i(obj.equals(obj), strS, "variantConfig");
                                                    e.g(ga.s(strS, "unknown"));
                                                    return;
                                                case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                                                    gg3 gg3Var = hf3Var.b.i;
                                                    boolean z = hf3Var.e;
                                                    re3 re3Var = re3.a;
                                                    mg3 mg3Var = (mg3) gg3Var.c.get();
                                                    if (mg3Var == null && !z) {
                                                        un0 un0Var = un0.b;
                                                        return;
                                                    }
                                                    if ((gg3Var.e & 64) == 0) {
                                                        CopyOnWriteArrayList copyOnWriteArrayList = gg3Var.f;
                                                        synchronized (copyOnWriteArrayList) {
                                                            try {
                                                                int i11 = gg3Var.e;
                                                                if ((i11 & 64) == 0) {
                                                                    copyOnWriteArrayList.add(re3Var);
                                                                    gg3Var.e = i11 | 64;
                                                                }
                                                            } catch (Throwable th2) {
                                                                throw th2;
                                                            }
                                                            break;
                                                        }
                                                    }
                                                    if (gg3Var.h == null) {
                                                        synchronized (gg3Var.g) {
                                                            try {
                                                                if (gg3Var.h == null) {
                                                                    if (mg3Var == null) {
                                                                        mg3Var = dg3.a;
                                                                    }
                                                                    Context context2 = gg3Var.a;
                                                                    if (g93.S(context2)) {
                                                                        vd0VarA = ((nb3) gg3Var.d.get()).a(new nl1(gg3Var, mg3Var));
                                                                        gg3Var.h = vd0VarA;
                                                                    } else {
                                                                        e10 e10Var = e10.c;
                                                                        cv1 cv1Var = gg3Var.b;
                                                                        vd0VarA = dh0.g(g93.P(context2, Executors.callable(e10Var, null), (Executor) cv1Var.get()), new bg3(i9, gg3Var, mg3Var), (Executor) cv1Var.get());
                                                                        gg3Var.h = vd0VarA;
                                                                    }
                                                                    vd0VarA.a(new aj2(vd0VarA, 10), (Executor) gg3Var.b.get());
                                                                }
                                                            } catch (Throwable th3) {
                                                                throw th3;
                                                            }
                                                            break;
                                                        }
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    nx0 nx0VarA = hf3Var.a();
                                                    String str3 = (String) nx0VarA.a;
                                                    y93 y93Var3 = hf3Var.b;
                                                    cv1 cv1Var2 = y93Var3.d;
                                                    og3 og3VarB = y93Var3.g.b();
                                                    boolean z2 = og3VarB.i;
                                                    if (og3VarB.j) {
                                                        if (sb1.a(str3) && !z2) {
                                                            un0 un0Var2 = un0.b;
                                                            return;
                                                        }
                                                        ta3 ta3VarU = ab3.u();
                                                        u61 u61Var = (u61) nx0VarA.e;
                                                        int i12 = u61Var.a;
                                                        wa3 wa3VarT = za3.t();
                                                        wa3VarT.d();
                                                        ((za3) wa3VarT.b).u(i12);
                                                        int i13 = u61Var.b;
                                                        wa3VarT.d();
                                                        ((za3) wa3VarT.b).v(i13);
                                                        za3 za3Var = (za3) wa3VarT.g();
                                                        ta3VarU.d();
                                                        ((ab3) ta3VarU.b).w(za3Var);
                                                        if (!sb1.a(str3)) {
                                                            ta3VarU.d();
                                                            ((ab3) ta3VarU.b).v(str3);
                                                        }
                                                        if (z2) {
                                                            String str4 = hf3Var.c;
                                                            ta3VarU.d();
                                                            ((ab3) ta3VarU.b).x(str4);
                                                        }
                                                        nb3 nb3Var = (nb3) cv1Var2.get();
                                                        ab3 ab3Var = (ab3) ta3VarU.g();
                                                        u83 u83Var = nb3Var.a;
                                                        ei eiVarB = ei.b();
                                                        eiVarB.d = new gk1(ab3Var, 28);
                                                        eiVarB.e = new Feature[]{yv2.k};
                                                        eiVarB.c = false;
                                                        zVarB = nb3.b(u83Var.b(0, eiVarB.a()).continueWithTask(t10.a, new md2(u83Var, ab3Var)));
                                                    } else {
                                                        if (sb1.a(str3)) {
                                                            un0 un0Var3 = un0.b;
                                                            return;
                                                        }
                                                        nb3 nb3Var2 = (nb3) cv1Var2.get();
                                                        nb3Var2.getClass();
                                                        str3.getClass();
                                                        zVarB = nb3.b(nb3Var2.a.c(str3));
                                                    }
                                                    dh0.a(zVarB, jb3.class, new me3(hf3Var, i9), y93Var3.a());
                                                    return;
                                            }
                                        }
                                    });
                                }
                                nx0Var = nx0VarB;
                            } else {
                                final int i6 = 0;
                                y93Var.a().execute(new Runnable(this) { // from class: ke3
                                    public final /* synthetic */ hf3 b;

                                    {
                                        this.b = this;
                                    }

                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int i7;
                                        cd3 cd3Var;
                                        gj3 gj3Var;
                                        int i8;
                                        j10 j10Var;
                                        vd0 vd0VarA;
                                        z zVarB;
                                        int i9 = i6;
                                        int i10 = 0;
                                        hf3 hf3Var = this.b;
                                        switch (i9) {
                                            case 0:
                                                hf3Var.b();
                                                return;
                                            case 1:
                                                y93 y93Var2 = hf3Var.b;
                                                String str = hf3Var.c;
                                                pl3 pl3Var = uf3.a;
                                                j10 j10Var2 = j10.e;
                                                Context context = y93Var2.b;
                                                Pattern pattern = sh3.a;
                                                qp0 qp0Var = new qp0(context);
                                                qp0Var.v("phenotype");
                                                qp0Var.y("all_accounts.pb");
                                                Uri uriZ = qp0Var.z();
                                                if (uriZ == null) {
                                                    uq1.h("Null uri");
                                                    return;
                                                }
                                                cd3 cd3VarU = cd3.u();
                                                if (cd3VarU == null) {
                                                    uq1.h("Null schema");
                                                    return;
                                                }
                                                pl3 pl3Var2 = uf3.a;
                                                pl3Var2.getClass();
                                                sc1 sc1Var = new sc1(pl3Var2);
                                                no0 no0Var = ro0.b;
                                                gh1 gh1Var = gh1.e;
                                                gj3 gj3Var2 = new gj3(uriZ, cd3VarU, sc1Var, gh1Var);
                                                co coVar = uf3.c;
                                                if (coVar == null) {
                                                    synchronized (uf3.b) {
                                                        try {
                                                            coVar = uf3.c;
                                                            if (coVar == null) {
                                                                HashMap map = new HashMap();
                                                                q51 q51VarA = y93Var2.a();
                                                                nh3 nh3Var = (nh3) y93Var2.f.get();
                                                                bk3 bk3Var = bk3.a;
                                                                i7 = 1;
                                                                yv2.i(!map.containsKey("singleproc"), "There is already a factory registered for the ID %s", "singleproc");
                                                                map.put("singleproc", bk3Var);
                                                                co coVar2 = new co();
                                                                coVar2.a = new ConcurrentHashMap();
                                                                q51VarA.getClass();
                                                                coVar2.b = q51VarA;
                                                                nh3Var.getClass();
                                                                coVar2.c = nh3Var;
                                                                coVar2.e = map;
                                                                yv2.h(!map.isEmpty());
                                                                coVar2.d = kb3.c;
                                                                uf3.c = coVar2;
                                                                coVar = coVar2;
                                                            } else {
                                                                i7 = 1;
                                                            }
                                                        } catch (Throwable th) {
                                                            throw th;
                                                        }
                                                        break;
                                                    }
                                                } else {
                                                    y93Var2 = y93Var2;
                                                    i7 = 1;
                                                }
                                                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) coVar.a;
                                                Pair pair = (Pair) concurrentHashMap.get(uriZ);
                                                if (pair == null) {
                                                    yv2.i(uriZ.isHierarchical(), "Uri must be hierarchical: %s", uriZ);
                                                    String lastPathSegment = uriZ.getLastPathSegment();
                                                    int i11 = sb1.a;
                                                    if (lastPathSegment == null) {
                                                        lastPathSegment = BuildConfig.FLAVOR;
                                                    }
                                                    int iLastIndexOf = lastPathSegment.lastIndexOf(46);
                                                    yv2.i((iLastIndexOf == -1 ? BuildConfig.FLAVOR : lastPathSegment.substring(iLastIndexOf + 1)).equals("pb"), "Uri extension must be .pb: %s", uriZ);
                                                    bk3 bk3Var2 = (bk3) ((HashMap) coVar.e).get("singleproc");
                                                    yv2.i(bk3Var2 != null ? i7 : 0, "No XDataStoreVariantFactory registered for ID %s", "singleproc");
                                                    String lastPathSegment2 = uriZ.getLastPathSegment();
                                                    if (lastPathSegment2 == null) {
                                                        lastPathSegment2 = BuildConfig.FLAVOR;
                                                    }
                                                    int iLastIndexOf2 = lastPathSegment2.lastIndexOf(46);
                                                    if (iLastIndexOf2 != -1) {
                                                        lastPathSegment2 = lastPathSegment2.substring(0, iLastIndexOf2);
                                                    }
                                                    r1 r1VarG = dh0.g(dh0.d(uriZ), (kb3) coVar.d, t10.a);
                                                    Executor executor = (Executor) coVar.b;
                                                    nh3 nh3Var2 = (nh3) coVar.c;
                                                    bk3Var2.getClass();
                                                    String str2 = lastPathSegment2;
                                                    rl3 rl3Var = new rl3(cd3VarU, vl2.a());
                                                    i8 = i7;
                                                    j10Var = j10Var2;
                                                    cd3Var = cd3VarU;
                                                    tj3 tj3Var = new tj3(new rk3(str2, dh0.d(uriZ), rl3Var, executor, nh3Var2, sc1Var, new r41(23)), r1VarG);
                                                    if (!gh1Var.isEmpty()) {
                                                        bg3 bg3Var = new bg3(i8, gh1Var, executor);
                                                        synchronized (tj3Var.g) {
                                                            tj3Var.i.add(bg3Var);
                                                        }
                                                    }
                                                    Pair pairCreate = Pair.create(tj3Var, gj3Var2);
                                                    Pair pair2 = (Pair) concurrentHashMap.putIfAbsent(uriZ, pairCreate);
                                                    if (pair2 != null) {
                                                        pair = pair2;
                                                        gj3Var = gj3Var2;
                                                    } else {
                                                        gj3Var = gj3Var2;
                                                        pair = pairCreate;
                                                    }
                                                    break;
                                                } else {
                                                    cd3Var = cd3VarU;
                                                    gj3Var = gj3Var2;
                                                    i8 = i7;
                                                    j10Var = j10Var2;
                                                }
                                                tj3 tj3Var2 = (tj3) pair.first;
                                                gj3 gj3Var3 = (gj3) pair.second;
                                                if (gj3Var.equals(gj3Var3)) {
                                                    s1 s1VarA = tj3Var2.a(new ve3(str, i8), y93Var2.a());
                                                    s1VarA.a(new qe3(hf3Var, s1VarA, 0), y93Var2.a());
                                                    return;
                                                }
                                                String strS = ga.s("ProtoDataStoreConfig<%s> doesn't match previous call [uri=%s] [%s]", cd3.class.getSimpleName(), uriZ);
                                                yv2.i(uriZ.equals(gj3Var3.a), strS, "uri");
                                                yv2.i(cd3Var.equals(gj3Var3.b), strS, "schema");
                                                yv2.i(sc1Var.equals(gj3Var3.c), strS, "handler");
                                                yv2.i(gh1Var.equals(gj3Var3.d), strS, "migrations");
                                                Object obj = j10Var;
                                                yv2.i(obj.equals(obj), strS, "variantConfig");
                                                e.g(ga.s(strS, "unknown"));
                                                return;
                                            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                                                gg3 gg3Var = hf3Var.b.i;
                                                boolean z = hf3Var.e;
                                                re3 re3Var = re3.a;
                                                mg3 mg3Var = (mg3) gg3Var.c.get();
                                                if (mg3Var == null && !z) {
                                                    un0 un0Var = un0.b;
                                                    return;
                                                }
                                                if ((gg3Var.e & 64) == 0) {
                                                    CopyOnWriteArrayList copyOnWriteArrayList = gg3Var.f;
                                                    synchronized (copyOnWriteArrayList) {
                                                        try {
                                                            int i12 = gg3Var.e;
                                                            if ((i12 & 64) == 0) {
                                                                copyOnWriteArrayList.add(re3Var);
                                                                gg3Var.e = i12 | 64;
                                                            }
                                                        } catch (Throwable th2) {
                                                            throw th2;
                                                        }
                                                        break;
                                                    }
                                                }
                                                if (gg3Var.h == null) {
                                                    synchronized (gg3Var.g) {
                                                        try {
                                                            if (gg3Var.h == null) {
                                                                if (mg3Var == null) {
                                                                    mg3Var = dg3.a;
                                                                }
                                                                Context context2 = gg3Var.a;
                                                                if (g93.S(context2)) {
                                                                    vd0VarA = ((nb3) gg3Var.d.get()).a(new nl1(gg3Var, mg3Var));
                                                                    gg3Var.h = vd0VarA;
                                                                } else {
                                                                    e10 e10Var = e10.c;
                                                                    cv1 cv1Var = gg3Var.b;
                                                                    vd0VarA = dh0.g(g93.P(context2, Executors.callable(e10Var, null), (Executor) cv1Var.get()), new bg3(i10, gg3Var, mg3Var), (Executor) cv1Var.get());
                                                                    gg3Var.h = vd0VarA;
                                                                }
                                                                vd0VarA.a(new aj2(vd0VarA, 10), (Executor) gg3Var.b.get());
                                                            }
                                                        } catch (Throwable th3) {
                                                            throw th3;
                                                        }
                                                        break;
                                                    }
                                                    return;
                                                }
                                                return;
                                            default:
                                                nx0 nx0VarA = hf3Var.a();
                                                String str3 = (String) nx0VarA.a;
                                                y93 y93Var3 = hf3Var.b;
                                                cv1 cv1Var2 = y93Var3.d;
                                                og3 og3VarB = y93Var3.g.b();
                                                boolean z2 = og3VarB.i;
                                                if (og3VarB.j) {
                                                    if (sb1.a(str3) && !z2) {
                                                        un0 un0Var2 = un0.b;
                                                        return;
                                                    }
                                                    ta3 ta3VarU = ab3.u();
                                                    u61 u61Var = (u61) nx0VarA.e;
                                                    int i13 = u61Var.a;
                                                    wa3 wa3VarT = za3.t();
                                                    wa3VarT.d();
                                                    ((za3) wa3VarT.b).u(i13);
                                                    int i14 = u61Var.b;
                                                    wa3VarT.d();
                                                    ((za3) wa3VarT.b).v(i14);
                                                    za3 za3Var = (za3) wa3VarT.g();
                                                    ta3VarU.d();
                                                    ((ab3) ta3VarU.b).w(za3Var);
                                                    if (!sb1.a(str3)) {
                                                        ta3VarU.d();
                                                        ((ab3) ta3VarU.b).v(str3);
                                                    }
                                                    if (z2) {
                                                        String str4 = hf3Var.c;
                                                        ta3VarU.d();
                                                        ((ab3) ta3VarU.b).x(str4);
                                                    }
                                                    nb3 nb3Var = (nb3) cv1Var2.get();
                                                    ab3 ab3Var = (ab3) ta3VarU.g();
                                                    u83 u83Var = nb3Var.a;
                                                    ei eiVarB = ei.b();
                                                    eiVarB.d = new gk1(ab3Var, 28);
                                                    eiVarB.e = new Feature[]{yv2.k};
                                                    eiVarB.c = false;
                                                    zVarB = nb3.b(u83Var.b(0, eiVarB.a()).continueWithTask(t10.a, new md2(u83Var, ab3Var)));
                                                } else {
                                                    if (sb1.a(str3)) {
                                                        un0 un0Var3 = un0.b;
                                                        return;
                                                    }
                                                    nb3 nb3Var2 = (nb3) cv1Var2.get();
                                                    nb3Var2.getClass();
                                                    str3.getClass();
                                                    zVarB = nb3.b(nb3Var2.a.c(str3));
                                                }
                                                dh0.a(zVarB, jb3.class, new me3(hf3Var, i10), y93Var3.a());
                                                return;
                                        }
                                    }
                                });
                                nx0Var = new nx0(ug3.A(), (u61) nx0VarB.e);
                            }
                        }
                        if (!this.e || ((u61) nx0Var.e).b != 17) {
                            this.a = nx0Var;
                        }
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return nx0Var;
    }

    public final void b() {
        u23 u23Var = this.h;
        y93 y93Var = (y93) u23Var.b;
        nb3 nb3Var = (nb3) y93Var.d.get();
        String str = (String) u23Var.d;
        nb3Var.getClass();
        str.getClass();
        u83 u83Var = nb3Var.a;
        ei eiVarB = ei.b();
        eiVarB.d = new dz2(str, 5);
        s1 s1VarF = dh0.f(nb3.b(u83Var.b(0, eiVarB.a()).continueWith(t10.a, new r41(22))), to2.d, y93Var.a());
        int i2 = 1;
        me3 me3Var = new me3(u23Var, i2);
        y93 y93Var2 = this.b;
        dh0.g(s1VarF, me3Var, y93Var2.a()).a(new qe3(this, s1VarF, i2), y93Var2.a());
    }
}
