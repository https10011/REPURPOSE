package defpackage;

import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class gb0 implements kn {
    public final File a;
    public final dr1 b;
    public final vt c;
    public final AtomicBoolean d;
    public final h61 e;

    public gb0(File file, dr1 dr1Var, vt vtVar) {
        dr1Var.getClass();
        this.a = file;
        this.b = dr1Var;
        this.c = vtVar;
        this.d = new AtomicBoolean(false);
        this.e = new h61();
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0073  */
    /* JADX WARN: Code duplicated, block: B:52:0x0079 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [hx] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public final Object a(hx hxVar, gs gsVar) throws Throwable {
        eb0 eb0Var;
        Throwable th;
        cb0 cb0Var;
        gb0 gb0Var;
        boolean z;
        ?? r9;
        if (gsVar instanceof eb0) {
            eb0Var = (eb0) gsVar;
            int i = eb0Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                eb0Var.f = i - Integer.MIN_VALUE;
            } else {
                eb0Var = new eb0(this, gsVar);
            }
        } else {
            eb0Var = new eb0(this, gsVar);
        }
        ?? r10 = eb0Var.d;
        ft ftVar = ft.a;
        int i2 = eb0Var.f;
        try {
            if (i2 == 0) {
                zi0.B(r10);
                if (this.d.get()) {
                    uq1.q("StorageConnection has already been disposed.");
                    return null;
                }
                boolean zE = this.e.e();
                cb0 cb0Var2 = new cb0(this.a);
                try {
                    Boolean boolValueOf = Boolean.valueOf(zE);
                    eb0Var.a = this;
                    eb0Var.b = cb0Var2;
                    eb0Var.c = zE;
                    eb0Var.f = 1;
                    Object objInvoke = hxVar.invoke(cb0Var2, boolValueOf, eb0Var);
                    if (objInvoke == ftVar) {
                        return ftVar;
                    }
                    gb0Var = this;
                    z = zE ? 1 : 0;
                    r9 = objInvoke;
                    cb0Var = cb0Var2;
                    cb0Var.close();
                    th = null;
                    if (th != null) {
                        throw th;
                    }
                    if (z) {
                        gb0Var.e.g(null);
                    }
                    return r9;
                } catch (Throwable th2) {
                    th = th2;
                    cb0Var = cb0Var2;
                    r10 = zE;
                    cb0Var.close();
                    throw th;
                }
            }
            if (i2 != 1) {
                uq1.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = eb0Var.c;
            cb0Var = eb0Var.b;
            gb0Var = eb0Var.a;
            try {
                zi0.B(r10);
                r9 = r10;
                try {
                    cb0Var.close();
                    th = null;
                } catch (Throwable th3) {
                    th = th3;
                }
                if (th != null) {
                    if (z) {
                        gb0Var.e.g(null);
                    }
                    return r9;
                }
                try {
                    throw th;
                } catch (Throwable th4) {
                    th = th4;
                    r10 = z;
                    this = gb0Var;
                }
            } catch (Throwable th5) {
                r10 = z ? 1 : 0;
                this = gb0Var;
                th = th5;
                try {
                    cb0Var.close();
                    throw th;
                } catch (Throwable th6) {
                    a80.a(th, th6);
                    throw th;
                }
            }
        } catch (Throwable th7) {
            th = th7;
        }
        if (r10 != 0) {
            this.e.g(null);
        }
        throw th;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00cb A[Catch: all -> 0x0106, IOException -> 0x0109, TRY_ENTER, TryCatch #0 {IOException -> 0x0109, blocks: (B:43:0x00cb, B:45:0x00d1, B:47:0x00d9, B:51:0x00e5, B:52:0x0105, B:48:0x00de, B:60:0x0117, B:67:0x0125, B:66:0x0122), top: B:79:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00d1 A[Catch: all -> 0x0106, IOException -> 0x0109, TryCatch #0 {IOException -> 0x0109, blocks: (B:43:0x00cb, B:45:0x00d1, B:47:0x00d9, B:51:0x00e5, B:52:0x0105, B:48:0x00de, B:60:0x0117, B:67:0x0125, B:66:0x0122), top: B:79:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00d9 A[Catch: all -> 0x0106, IOException -> 0x0109, TryCatch #0 {IOException -> 0x0109, blocks: (B:43:0x00cb, B:45:0x00d1, B:47:0x00d9, B:51:0x00e5, B:52:0x0105, B:48:0x00de, B:60:0x0117, B:67:0x0125, B:66:0x0122), top: B:79:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00de A[Catch: all -> 0x0106, IOException -> 0x0109, TryCatch #0 {IOException -> 0x0109, blocks: (B:43:0x00cb, B:45:0x00d1, B:47:0x00d9, B:51:0x00e5, B:52:0x0105, B:48:0x00de, B:60:0x0117, B:67:0x0125, B:66:0x0122), top: B:79:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e5 A[Catch: all -> 0x0106, IOException -> 0x0109, TryCatch #0 {IOException -> 0x0109, blocks: (B:43:0x00cb, B:45:0x00d1, B:47:0x00d9, B:51:0x00e5, B:52:0x0105, B:48:0x00de, B:60:0x0117, B:67:0x0125, B:66:0x0122), top: B:79:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0117 A[Catch: all -> 0x0106, IOException -> 0x0109, TRY_ENTER, TRY_LEAVE, TryCatch #0 {IOException -> 0x0109, blocks: (B:43:0x00cb, B:45:0x00d1, B:47:0x00d9, B:51:0x00e5, B:52:0x0105, B:48:0x00de, B:60:0x0117, B:67:0x0125, B:66:0x0122), top: B:79:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Instruction removed from duplicated block: B:51:0x00e5, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object b(xx xxVar, gs gsVar) throws Throwable {
        fb0 fb0Var;
        Object obj;
        File file;
        Function2 function2;
        qb0 qb0Var;
        Throwable th;
        qb0 qb0Var2;
        gb0 gb0Var;
        Object obj2;
        File file2;
        File file3;
        boolean zRenameTo;
        if (gsVar instanceof fb0) {
            fb0Var = (fb0) gsVar;
            int i = fb0Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                fb0Var.i = i - Integer.MIN_VALUE;
            } else {
                fb0Var = new fb0(this, gsVar);
            }
        } else {
            fb0Var = new fb0(this, gsVar);
        }
        Object obj3 = fb0Var.e;
        ft ftVar = ft.a;
        int i2 = fb0Var.i;
        try {
            try {
                try {
                    try {
                        try {
                            if (i2 == 0) {
                                zi0.B(obj3);
                                if (this.d.get()) {
                                    uq1.q("StorageConnection has already been disposed.");
                                    return null;
                                }
                                File file4 = this.a;
                                File parentFile = file4.getCanonicalFile().getParentFile();
                                if (parentFile != null) {
                                    parentFile.mkdirs();
                                    if (!parentFile.isDirectory()) {
                                        uq1.g(file4, "Unable to create parent directories of ");
                                        return null;
                                    }
                                }
                                fb0Var.a = this;
                                fb0Var.b = xxVar;
                                h61 h61Var = this.e;
                                fb0Var.c = h61Var;
                                fb0Var.i = 1;
                                Object objD = h61Var.d(fb0Var);
                                function2 = xxVar;
                                obj = h61Var;
                                if (objD != ftVar) {
                                }
                                return ftVar;
                            }
                            if (i2 != 1) {
                                if (i2 != 2) {
                                    uq1.q("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                qb0Var2 = fb0Var.d;
                                File file5 = (File) fb0Var.c;
                                f61 f61Var = (f61) fb0Var.b;
                                gb0Var = fb0Var.a;
                                try {
                                    zi0.B(obj3);
                                    obj2 = f61Var;
                                    file2 = file5;
                                    Unit unit = Unit.a;
                                    try {
                                        qb0Var2.close();
                                        th = null;
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                    if (th == null) {
                                        throw th;
                                    }
                                    if (file2.exists()) {
                                        file3 = gb0Var.a;
                                        if (Build.VERSION.SDK_INT >= 26) {
                                            zRenameTo = g7.e(file2, file3);
                                        } else {
                                            zRenameTo = file2.renameTo(file3);
                                        }
                                        if (zRenameTo) {
                                            throw new IOException("Unable to rename " + file2 + " to " + gb0Var.a + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                        }
                                    }
                                    Unit unit2 = Unit.a;
                                    ((h61) obj2).g(null);
                                    return Unit.a;
                                } catch (Throwable th3) {
                                    th = th3;
                                    try {
                                        qb0Var2.close();
                                    } catch (Throwable th4) {
                                        a80.a(th, th4);
                                    }
                                    throw th;
                                }
                            }
                            f61 f61Var2 = (f61) fb0Var.c;
                            Function2 function3 = (Function2) fb0Var.b;
                            gb0 gb0Var2 = fb0Var.a;
                            zi0.B(obj3);
                            obj = f61Var2;
                            this = gb0Var2;
                            function2 = function3;
                            fb0Var.a = this;
                            fb0Var.b = obj;
                            fb0Var.c = file;
                            fb0Var.d = qb0Var;
                            fb0Var.i = 2;
                            if (function2.invoke(qb0Var, fb0Var) != ftVar) {
                                gb0Var = this;
                                obj2 = obj;
                                file2 = file;
                                qb0Var2 = qb0Var;
                                Unit unit3 = Unit.a;
                                qb0Var2.close();
                                th = null;
                                if (th == null) {
                                    throw th;
                                }
                                if (file2.exists()) {
                                    file3 = gb0Var.a;
                                    if (Build.VERSION.SDK_INT >= 26) {
                                        zRenameTo = g7.e(file2, file3);
                                    } else {
                                        zRenameTo = file2.renameTo(file3);
                                    }
                                    if (zRenameTo) {
                                        throw new IOException("Unable to rename " + file2 + " to " + gb0Var.a + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                    }
                                }
                                Unit unit4 = Unit.a;
                                ((h61) obj2).g(null);
                                return Unit.a;
                            }
                            return ftVar;
                        } catch (Throwable th5) {
                            th = th5;
                            qb0Var2 = qb0Var;
                            qb0Var2.close();
                            throw th;
                        }
                        qb0Var = new qb0(file);
                    } catch (IOException e) {
                        e = e;
                        if (file.exists()) {
                            file.delete();
                        }
                        throw e;
                    }
                    file = new File(this.a.getAbsolutePath() + ".tmp");
                } catch (Throwable th6) {
                    th = th6;
                    ((h61) obj).g(null);
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
                file = xxVar;
                obj = ftVar;
            }
        } catch (Throwable th7) {
            th = th7;
            obj = ftVar;
            ((h61) obj).g(null);
            throw th;
        }
    }

    @Override // defpackage.kn
    public final void close() {
        this.d.set(true);
        this.c.invoke();
    }
}
