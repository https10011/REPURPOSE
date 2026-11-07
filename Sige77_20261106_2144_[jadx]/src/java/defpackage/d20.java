package defpackage;

import android.os.Build;
import android.os.StrictMode;
import com.hjq.toast.BuildConfig;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class d20 implements Closeable {
    public int X;
    public final File a;
    public final File b;
    public final File c;
    public final File d;
    public final long f;
    public BufferedWriter w;
    public long v = 0;
    public final LinkedHashMap W = new LinkedHashMap(0, 0.75f, true);
    public long Y = 0;
    public final ThreadPoolExecutor Z = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b20());
    public final a20 a0 = new a20(this, 0);
    public final int e = 1;
    public final int i = 1;

    public d20(File file, long j) {
        this.a = file;
        this.b = new File(file, "journal");
        this.c = new File(file, "journal.tmp");
        this.d = new File(file, "journal.bkp");
        this.f = j;
    }

    public static void a(d20 d20Var, hc hcVar, boolean z) {
        synchronized (d20Var) {
            c20 c20Var = (c20) hcVar.b;
            if (c20Var.f != hcVar) {
                throw new IllegalStateException();
            }
            if (z && !c20Var.e) {
                for (int i = 0; i < d20Var.i; i++) {
                    if (!((boolean[]) hcVar.c)[i]) {
                        hcVar.b();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                    }
                    if (!c20Var.d[i].exists()) {
                        hcVar.b();
                        return;
                    }
                }
            }
            for (int i2 = 0; i2 < d20Var.i; i2++) {
                File file = c20Var.d[i2];
                if (!z) {
                    e(file);
                } else if (file.exists()) {
                    File file2 = c20Var.c[i2];
                    file.renameTo(file2);
                    long j = c20Var.b[i2];
                    long length = file2.length();
                    c20Var.b[i2] = length;
                    d20Var.v = (d20Var.v - j) + length;
                }
            }
            d20Var.X++;
            c20Var.f = null;
            if (c20Var.e || z) {
                c20Var.e = true;
                d20Var.w.append((CharSequence) "CLEAN");
                d20Var.w.append(' ');
                d20Var.w.append((CharSequence) c20Var.a);
                d20Var.w.append((CharSequence) c20Var.a());
                d20Var.w.append('\n');
                if (z) {
                    d20Var.Y++;
                }
            } else {
                d20Var.W.remove(c20Var.a);
                d20Var.w.append((CharSequence) "REMOVE");
                d20Var.w.append(' ');
                d20Var.w.append((CharSequence) c20Var.a);
                d20Var.w.append('\n');
            }
            j(d20Var.w);
            if (d20Var.v > d20Var.f || d20Var.m()) {
                d20Var.Z.submit(d20Var.a0);
            }
        }
    }

    public static void b(BufferedWriter bufferedWriter) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            bufferedWriter.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            bufferedWriter.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static void e(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public static void j(BufferedWriter bufferedWriter) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            bufferedWriter.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            bufferedWriter.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static d20 n(File file, long j) throws IOException {
        if (j <= 0) {
            e.g("maxSize <= 0");
            return null;
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                w(file2, file3, false);
            }
        }
        d20 d20Var = new d20(file, j);
        if (d20Var.b.exists()) {
            try {
                d20Var.q();
                d20Var.p();
                return d20Var;
            } catch (IOException e) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                d20Var.close();
                e42.a(d20Var.a);
            }
        }
        file.mkdirs();
        d20 d20Var2 = new d20(file, j);
        d20Var2.t();
        return d20Var2;
    }

    public static void w(File file, File file2, boolean z) throws IOException {
        if (z) {
            e(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.w == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(this.W.values());
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                hc hcVar = ((c20) obj).f;
                if (hcVar != null) {
                    hcVar.b();
                }
            }
            x();
            b(this.w);
            this.w = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final hc i(String str) {
        synchronized (this) {
            try {
                if (this.w == null) {
                    throw new IllegalStateException("cache is closed");
                }
                c20 c20Var = (c20) this.W.get(str);
                if (c20Var == null) {
                    c20Var = new c20(this, str);
                    this.W.put(str, c20Var);
                } else if (c20Var.f != null) {
                    return null;
                }
                hc hcVar = new hc(this, c20Var);
                c20Var.f = hcVar;
                this.w.append((CharSequence) "DIRTY");
                this.w.append(' ');
                this.w.append((CharSequence) str);
                this.w.append('\n');
                j(this.w);
                return hcVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized pv2 l(String str) {
        if (this.w == null) {
            throw new IllegalStateException("cache is closed");
        }
        c20 c20Var = (c20) this.W.get(str);
        if (c20Var == null) {
            return null;
        }
        if (!c20Var.e) {
            return null;
        }
        for (File file : c20Var.c) {
            if (!file.exists()) {
                return null;
            }
        }
        this.X++;
        this.w.append((CharSequence) "READ");
        this.w.append(' ');
        this.w.append((CharSequence) str);
        this.w.append('\n');
        if (m()) {
            this.Z.submit(this.a0);
        }
        return new pv2(c20Var.c);
    }

    public final boolean m() {
        int i = this.X;
        return i >= 2000 && i >= this.W.size();
    }

    public final void p() throws IOException {
        e(this.c);
        Iterator it = this.W.values().iterator();
        while (it.hasNext()) {
            c20 c20Var = (c20) it.next();
            hc hcVar = c20Var.f;
            int i = this.i;
            int i2 = 0;
            if (hcVar == null) {
                while (i2 < i) {
                    this.v += c20Var.b[i2];
                    i2++;
                }
            } else {
                c20Var.f = null;
                while (i2 < i) {
                    e(c20Var.c[i2]);
                    e(c20Var.d[i2]);
                    i2++;
                }
                it.remove();
            }
        }
    }

    public final void q() {
        File file = this.b;
        gu1 gu1Var = new gu1(new FileInputStream(file), e42.a);
        try {
            String strA = gu1Var.a();
            String strA2 = gu1Var.a();
            String strA3 = gu1Var.a();
            String strA4 = gu1Var.a();
            String strA5 = gu1Var.a();
            if (!"libcore.io.DiskLruCache".equals(strA) || !"1".equals(strA2) || !Integer.toString(this.e).equals(strA3) || !Integer.toString(this.i).equals(strA4) || !BuildConfig.FLAVOR.equals(strA5)) {
                throw new IOException("unexpected journal header: [" + strA + ", " + strA2 + ", " + strA4 + ", " + strA5 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    s(gu1Var.a());
                    i++;
                } catch (EOFException unused) {
                    this.X = i - this.W.size();
                    if (gu1Var.e == -1) {
                        t();
                    } else {
                        this.w = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), e42.a));
                    }
                    try {
                        gu1Var.close();
                        return;
                    } catch (RuntimeException e) {
                        throw e;
                    } catch (Exception unused2) {
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            try {
                gu1Var.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused3) {
            }
            throw th;
        }
    }

    public final void s(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            uq1.o("unexpected journal line: ".concat(str));
            return;
        }
        int i = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i);
        LinkedHashMap linkedHashMap = this.W;
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iIndexOf2);
        }
        c20 c20Var = (c20) linkedHashMap.get(strSubstring);
        if (c20Var == null) {
            c20Var = new c20(this, strSubstring);
            linkedHashMap.put(strSubstring, c20Var);
        }
        if (iIndexOf2 == -1 || iIndexOf != 5 || !str.startsWith("CLEAN")) {
            if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
                c20Var.f = new hc(this, c20Var);
                return;
            } else {
                if (iIndexOf2 == -1 && iIndexOf == 4 && str.startsWith("READ")) {
                    return;
                }
                uq1.o("unexpected journal line: ".concat(str));
                return;
            }
        }
        String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
        c20Var.e = true;
        c20Var.f = null;
        if (strArrSplit.length != c20Var.g.i) {
            ur.h(Arrays.toString(strArrSplit), "unexpected journal line: ");
            return;
        }
        for (int i2 = 0; i2 < strArrSplit.length; i2++) {
            try {
                c20Var.b[i2] = Long.parseLong(strArrSplit[i2]);
            } catch (NumberFormatException unused) {
                ur.h(Arrays.toString(strArrSplit), "unexpected journal line: ");
                return;
            }
        }
    }

    public final synchronized void t() {
        try {
            BufferedWriter bufferedWriter = this.w;
            if (bufferedWriter != null) {
                b(bufferedWriter);
            }
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.c), e42.a));
            try {
                bufferedWriter2.write("libcore.io.DiskLruCache");
                bufferedWriter2.write("\n");
                bufferedWriter2.write("1");
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.e));
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.i));
                bufferedWriter2.write("\n");
                bufferedWriter2.write("\n");
                for (c20 c20Var : this.W.values()) {
                    if (c20Var.f != null) {
                        bufferedWriter2.write("DIRTY " + c20Var.a + '\n');
                    } else {
                        bufferedWriter2.write("CLEAN " + c20Var.a + c20Var.a() + '\n');
                    }
                }
                b(bufferedWriter2);
                if (this.b.exists()) {
                    w(this.b, this.d, true);
                }
                w(this.c, this.b, false);
                this.d.delete();
                this.w = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.b, true), e42.a));
            } catch (Throwable th) {
                b(bufferedWriter2);
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void x() {
        while (this.v > this.f) {
            String str = (String) ((Map.Entry) this.W.entrySet().iterator().next()).getKey();
            synchronized (this) {
                try {
                    if (this.w == null) {
                        throw new IllegalStateException("cache is closed");
                    }
                    c20 c20Var = (c20) this.W.get(str);
                    if (c20Var != null && c20Var.f == null) {
                        for (int i = 0; i < this.i; i++) {
                            File file = c20Var.c[i];
                            if (file.exists() && !file.delete()) {
                                throw new IOException("failed to delete " + file);
                            }
                            long j = this.v;
                            long[] jArr = c20Var.b;
                            this.v = j - jArr[i];
                            jArr[i] = 0;
                        }
                        this.X++;
                        this.w.append((CharSequence) "REMOVE");
                        this.w.append(' ');
                        this.w.append((CharSequence) str);
                        this.w.append('\n');
                        this.W.remove(str);
                        if (m()) {
                            this.Z.submit(this.a0);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
