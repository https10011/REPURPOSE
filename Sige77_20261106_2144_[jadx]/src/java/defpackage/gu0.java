package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class gu0 extends hb0 {
    @Override // defpackage.hb0
    public final kr1 a(jb1 jb1Var) {
        jb1Var.getClass();
        return new ga1(new FileOutputStream(jb1Var.toFile(), true), new vx1());
    }

    @Override // defpackage.hb0
    public void b(jb1 jb1Var, jb1 jb1Var2) throws IOException {
        jb1Var.getClass();
        jb1Var2.getClass();
        if (jb1Var.toFile().renameTo(jb1Var2.toFile())) {
            return;
        }
        throw new IOException("failed to move " + jb1Var + " to " + jb1Var2);
    }

    @Override // defpackage.hb0
    public final void e(jb1 jb1Var) throws IOException {
        jb1Var.getClass();
        if (jb1Var.toFile().mkdir()) {
            return;
        }
        x00 x00VarN = n(jb1Var);
        if (x00VarN == null || !x00VarN.c) {
            uq1.g(jb1Var, "failed to create directory: ");
        }
    }

    @Override // defpackage.hb0
    public final void i(jb1 jb1Var) throws IOException {
        jb1Var.getClass();
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File file = jb1Var.toFile();
        if (file.delete() || !file.exists()) {
            return;
        }
        uq1.g(jb1Var, "failed to delete ");
    }

    @Override // defpackage.hb0
    public final List l(jb1 jb1Var) throws IOException {
        File file = jb1Var.toFile();
        String[] list = file.list();
        if (list == null) {
            if (file.exists()) {
                uq1.g(jb1Var, "failed to list ");
                return null;
            }
            ur.b(jb1Var, "no such file: ");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            str.getClass();
            arrayList.add(jb1Var.d(str));
        }
        if (arrayList.size() > 1) {
            Collections.sort(arrayList);
        }
        return arrayList;
    }

    @Override // defpackage.hb0
    public x00 n(jb1 jb1Var) {
        jb1Var.getClass();
        File file = jb1Var.toFile();
        boolean zIsFile = file.isFile();
        boolean zIsDirectory = file.isDirectory();
        long jLastModified = file.lastModified();
        long length = file.length();
        if (zIsFile || zIsDirectory || jLastModified != 0 || length != 0 || file.exists()) {
            return new x00(zIsFile, zIsDirectory, null, Long.valueOf(length), null, Long.valueOf(jLastModified), null);
        }
        return null;
    }

    @Override // defpackage.hb0
    public final fu0 p(jb1 jb1Var) {
        return new fu0(new RandomAccessFile(jb1Var.toFile(), "r"));
    }

    @Override // defpackage.hb0
    public final kr1 q(jb1 jb1Var) {
        jb1Var.getClass();
        return new ga1(new FileOutputStream(jb1Var.toFile(), false), new vx1());
    }

    @Override // defpackage.hb0
    public final ds1 s(jb1 jb1Var) {
        jb1Var.getClass();
        return new lq0(new FileInputStream(jb1Var.toFile()), vx1.d);
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }
}
