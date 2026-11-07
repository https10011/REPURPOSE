package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.JarURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class xi1 extends hb0 {
    public static final jb1 f;
    public final ClassLoader c;
    public final hb0 d;
    public final uv1 e;

    static {
        String str = jb1.b;
        f = br0.h("/");
    }

    public xi1(ClassLoader classLoader) {
        classLoader.getClass();
        gu0 gu0Var = hb0.a;
        gu0Var.getClass();
        this.c = classLoader;
        this.d = gu0Var;
        this.e = aw0.a(new bq(this, 4));
    }

    @Override // defpackage.hb0
    public final kr1 a(jb1 jb1Var) throws IOException {
        jb1Var.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.hb0
    public final void b(jb1 jb1Var, jb1 jb1Var2) throws IOException {
        jb1Var.getClass();
        jb1Var2.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.hb0
    public final void e(jb1 jb1Var) throws IOException {
        jb1Var.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.hb0
    public final void i(jb1 jb1Var) throws IOException {
        jb1Var.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.hb0
    public final List l(jb1 jb1Var) throws FileNotFoundException {
        jb1 jb1Var2 = f;
        jb1Var2.getClass();
        String strR = d.b(jb1Var2, jb1Var, true).c(jb1Var2).a.r();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z = false;
        for (Pair pair : (List) this.e.getValue()) {
            hb0 hb0Var = (hb0) pair.a;
            jb1 jb1Var3 = (jb1) pair.b;
            try {
                List listL = hb0Var.l(jb1Var3.d(strR));
                ArrayList arrayList = new ArrayList();
                for (Object obj : listL) {
                    if (vl0.d((jb1) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(ko.h(arrayList));
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    jb1 jb1Var4 = (jb1) obj2;
                    jb1Var4.getClass();
                    String strReplace = StringsKt.A(jb1Var4.a.r(), jb1Var3.a.r()).replace('\\', '/');
                    strReplace.getClass();
                    arrayList2.add(jb1Var2.d(strReplace));
                }
                oo.i(arrayList2, linkedHashSet);
                z = true;
            } catch (IOException unused) {
            }
        }
        if (z) {
            return CollectionsKt.B(linkedHashSet);
        }
        ur.b(jb1Var, "file not found: ");
        return null;
    }

    @Override // defpackage.hb0
    public final x00 n(jb1 jb1Var) {
        jb1Var.getClass();
        if (!vl0.d(jb1Var)) {
            return null;
        }
        jb1 jb1Var2 = f;
        jb1Var2.getClass();
        String strR = d.b(jb1Var2, jb1Var, true).c(jb1Var2).a.r();
        for (Pair pair : (List) this.e.getValue()) {
            x00 x00VarN = ((hb0) pair.a).n(((jb1) pair.b).d(strR));
            if (x00VarN != null) {
                return x00VarN;
            }
        }
        return null;
    }

    @Override // defpackage.hb0
    public final fu0 p(jb1 jb1Var) throws FileNotFoundException {
        if (!vl0.d(jb1Var)) {
            ur.b(jb1Var, "file not found: ");
            return null;
        }
        jb1 jb1Var2 = f;
        jb1Var2.getClass();
        String strR = d.b(jb1Var2, jb1Var, true).c(jb1Var2).a.r();
        Iterator it = ((List) this.e.getValue()).iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            try {
                return ((hb0) pair.a).p(((jb1) pair.b).d(strR));
            } catch (FileNotFoundException unused) {
            }
        }
        ur.b(jb1Var, "file not found: ");
        return null;
    }

    @Override // defpackage.hb0
    public final kr1 q(jb1 jb1Var) throws IOException {
        jb1Var.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.hb0
    public final ds1 s(jb1 jb1Var) throws IOException {
        jb1Var.getClass();
        if (!vl0.d(jb1Var)) {
            ur.b(jb1Var, "file not found: ");
            return null;
        }
        jb1 jb1Var2 = f;
        jb1Var2.getClass();
        URL resource = this.c.getResource(d.b(jb1Var2, jb1Var, false).c(jb1Var2).a.r());
        if (resource == null) {
            ur.b(jb1Var, "file not found: ");
            return null;
        }
        URLConnection uRLConnectionOpenConnection = resource.openConnection();
        if (uRLConnectionOpenConnection instanceof JarURLConnection) {
            ((JarURLConnection) uRLConnectionOpenConnection).setUseCaches(false);
        }
        InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
        inputStream.getClass();
        return new lq0(inputStream, new vx1());
    }
}
