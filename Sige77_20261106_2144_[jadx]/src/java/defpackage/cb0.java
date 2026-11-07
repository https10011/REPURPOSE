package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class cb0 implements kn {
    public final File a;
    public final AtomicBoolean b = new AtomicBoolean(false);

    public cb0(File file) {
        this.a = file;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0081  */
    /* JADX WARN: Code duplicated, block: B:46:0x0095  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9, types: [cb0] */
    /* JADX WARN: Type inference failed for: r8v0, types: [cb0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [cb0] */
    public static Object a(cb0 cb0Var, gs gsVar) {
        bb0 bb0Var;
        FileInputStream fileInputStream;
        Throwable th;
        Closeable closeable;
        d61 d61VarH;
        FileInputStream fileInputStream2;
        Throwable th2;
        if (gsVar instanceof bb0) {
            bb0Var = (bb0) gsVar;
            int i = bb0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                bb0Var.e = i - Integer.MIN_VALUE;
            } else {
                bb0Var = new bb0(cb0Var, gsVar);
            }
        } else {
            bb0Var = new bb0(cb0Var, gsVar);
        }
        Object obj = bb0Var.c;
        ft ftVar = ft.a;
        ?? r2 = bb0Var.e;
        boolean z = true;
        try {
            if (r2 != 0) {
                if (r2 == 1) {
                    fileInputStream2 = bb0Var.b;
                    r2 = (cb0) bb0Var.a;
                    try {
                        zi0.B(obj);
                        nj2.q(fileInputStream2, null);
                        return obj;
                    } catch (Throwable th3) {
                        th2 = th3;
                        try {
                            throw th2;
                        } catch (Throwable th4) {
                            nj2.q(fileInputStream2, th2);
                            throw th4;
                        }
                    }
                }
                if (r2 != 2) {
                    uq1.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                closeable = (Closeable) bb0Var.a;
                try {
                    zi0.B(obj);
                    nj2.q(closeable, null);
                    return obj;
                } catch (Throwable th5) {
                    th = th5;
                    try {
                        throw th;
                    } catch (Throwable th6) {
                        nj2.q(closeable, th);
                        throw th6;
                    }
                }
            }
            zi0.B(obj);
            if (cb0Var.b.get()) {
                uq1.q("This scope has already been closed.");
                return null;
            }
            try {
                FileInputStream fileInputStream3 = new FileInputStream(cb0Var.a);
                try {
                    bb0Var.a = cb0Var;
                    bb0Var.b = fileInputStream3;
                    bb0Var.e = 1;
                    d61 d61VarH2 = nk1.h(fileInputStream3);
                    if (d61VarH2 != ftVar) {
                        fileInputStream2 = fileInputStream3;
                        obj = d61VarH2;
                        nj2.q(fileInputStream2, null);
                        return obj;
                    }
                    return ftVar;
                } catch (Throwable th7) {
                    r2 = cb0Var;
                    fileInputStream2 = fileInputStream3;
                    th2 = th7;
                    throw th2;
                }
            } catch (FileNotFoundException unused) {
                if (cb0Var.a.exists()) {
                    return new d61(z);
                }
                fileInputStream = new FileInputStream(cb0Var.a);
                try {
                    bb0Var.a = fileInputStream;
                    bb0Var.b = null;
                    bb0Var.e = 2;
                    d61VarH = nk1.h(fileInputStream);
                    if (d61VarH != ftVar) {
                        obj = d61VarH;
                        closeable = fileInputStream;
                        nj2.q(closeable, null);
                        return obj;
                    }
                } catch (Throwable th8) {
                    th = th8;
                    closeable = fileInputStream;
                    throw th;
                }
            }
        } catch (FileNotFoundException unused2) {
            cb0Var = r2;
            if (cb0Var.a.exists()) {
                return new d61(z);
            }
            fileInputStream = new FileInputStream(cb0Var.a);
            bb0Var.a = fileInputStream;
            bb0Var.b = null;
            bb0Var.e = 2;
            d61VarH = nk1.h(fileInputStream);
            if (d61VarH != ftVar) {
                obj = d61VarH;
                closeable = fileInputStream;
                nj2.q(closeable, null);
                return obj;
            }
            return ftVar;
        }
    }

    @Override // defpackage.kn
    public final void close() {
        this.b.set(true);
    }
}
