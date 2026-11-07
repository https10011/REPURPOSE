package defpackage;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class rk3 {
    public final String a;
    public final ListenableFuture b;
    public final rl3 c;
    public final wo1 d;
    public final nh3 e;
    public final sc1 f;
    public final r41 g;
    public final Object h = new Object();
    public final md2 i = new md2(3);
    public ListenableFuture j = null;

    public rk3(String str, un0 un0Var, rl3 rl3Var, Executor executor, nh3 nh3Var, sc1 sc1Var, r41 r41Var) {
        this.a = str;
        this.b = dh0.e(un0Var);
        this.c = rl3Var;
        this.d = new wo1(executor);
        this.e = nh3Var;
        this.f = sc1Var;
        this.g = r41Var;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x001c A[Catch: all -> 0x0013, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000d, B:13:0x0016, B:14:0x0018, B:16:0x001c, B:17:0x0033, B:18:0x0035), top: B:25:0x0003, inners: #0 }] */
    public final ListenableFuture a(bg3 bg3Var, Executor executor) {
        ListenableFuture listenableFuture;
        synchronized (this.h) {
            ListenableFuture listenableFuture2 = this.j;
            if (listenableFuture2 == null || !listenableFuture2.isDone()) {
                if (this.j == null) {
                    this.j = dh0.e(this.i.j(to3.a(new ik3(this)), this.d));
                }
                listenableFuture = this.j;
            } else {
                try {
                    dh0.b(this.j);
                } catch (ExecutionException unused) {
                    this.j = null;
                }
                if (this.j == null) {
                    this.j = dh0.e(this.i.j(to3.a(new ik3(this)), this.d));
                }
                listenableFuture = this.j;
            }
            throw th;
        }
        return this.i.j(to3.a(new ud2(this, listenableFuture, bg3Var, executor)), t10.a);
    }

    public final wk2 b(Uri uri) throws IOException {
        rl3 rl3Var = this.c;
        String str = this.a;
        nh3 nh3Var = this.e;
        try {
            try {
                r41 r41Var = this.g;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 5);
                sb.append("Read ");
                sb.append(str);
                String string = sb.toString();
                r41Var.getClass();
                mn3 mn3VarS = r41.s(string);
                try {
                    InputStream inputStreamH = rq0.H(nh3Var.b(uri));
                    try {
                        dm2 dm2VarA = ((cm2) ((rn2) rl3Var.a.s(7))).a(inputStreamH, rl3Var.b);
                        if (inputStreamH != null) {
                            inputStreamH.close();
                        }
                        mn3VarS.close();
                        return dm2VarA;
                    } catch (Throwable th) {
                        if (inputStreamH != null) {
                            try {
                                inputStreamH.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    try {
                        mn3VarS.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (FileNotFoundException e) {
                ep1 ep1VarB = nh3Var.b(uri);
                if (((xi3) ep1VarB.b).b((Uri) ep1VarB.e)) {
                    throw e;
                }
                return rl3Var.a;
            }
        } catch (IOException e2) {
            throw x91.T(nh3Var, uri, e2, str);
        }
    }

    public final void c(Uri uri, Object obj) {
        String str = this.a;
        nh3 nh3Var = this.e;
        Uri uriBuild = uri.buildUpon().path(String.valueOf(uri.getPath()).concat(".tmp")).build();
        try {
            r41 r41Var = this.g;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 6);
            sb.append("Write ");
            sb.append(str);
            String string = sb.toString();
            r41Var.getClass();
            mn3 mn3VarS = r41.s(string);
            try {
                dc2 dc2Var = new dc2();
                try {
                    ep1 ep1VarB = nh3Var.b(uriBuild);
                    ArrayList arrayListM = ep1VarB.M(((xi3) ep1VarB.b).c((Uri) ep1VarB.e));
                    new dc2[]{dc2Var}[0].L(arrayListM);
                    OutputStream outputStream = (OutputStream) arrayListM.get(0);
                    try {
                        ((wk2) obj).b(outputStream);
                        if (((gi3) dc2Var.b) == null) {
                            throw new tn("Cannot sync underlying stream");
                        }
                        ((OutputStream) dc2Var.a).flush();
                        ((gi3) dc2Var.b).a.getFD().sync();
                        outputStream.close();
                        mn3VarS.close();
                        ep1 ep1VarB2 = nh3Var.b(uriBuild);
                        ep1 ep1VarB3 = nh3Var.b(uri);
                        xi3 xi3Var = (xi3) ep1VarB2.b;
                        if (xi3Var != ((xi3) ep1VarB3.b)) {
                            throw new tn("Cannot rename file across backends");
                        }
                        xi3Var.e((Uri) ep1VarB2.e, (Uri) ep1VarB3.e);
                    } catch (Throwable th) {
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    throw x91.T(nh3Var, uri, e, str);
                }
            } catch (Throwable th3) {
                try {
                    mn3VarS.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (IOException e2) {
            ep1 ep1VarB4 = nh3Var.b(uriBuild);
            if (((xi3) ep1VarB4.b).b((Uri) ep1VarB4.e)) {
                try {
                    ep1 ep1VarB5 = nh3Var.b(uriBuild);
                    ((xi3) ep1VarB5.b).d((Uri) ep1VarB5.e);
                } catch (IOException e3) {
                    e2.addSuppressed(e3);
                }
            }
            throw e2;
        }
    }
}
