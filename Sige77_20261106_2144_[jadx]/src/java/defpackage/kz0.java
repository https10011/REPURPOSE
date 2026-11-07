package defpackage;

import androidx.lifecycle.b;
import java.io.PrintWriter;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class kz0 extends gz0 {
    public final ww0 a;
    public final jz0 b;

    public kz0(ww0 ww0Var, p62 p62Var) {
        this.a = ww0Var;
        this.b = (jz0) new p11(p62Var, jz0.f).c(jz0.class);
    }

    public final void a(String str, PrintWriter printWriter) {
        jz0 jz0Var = this.b;
        if (jz0Var.d.c <= 0) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Loaders:");
        String strConcat = str.concat("    ");
        int i = 0;
        while (true) {
            ks1 ks1Var = jz0Var.d;
            if (i >= ks1Var.c) {
                return;
            }
            hz0 hz0Var = (hz0) ks1Var.b[i];
            printWriter.print(str);
            printWriter.print("  #");
            printWriter.print(jz0Var.d.a[i]);
            printWriter.print(": ");
            printWriter.println(hz0Var.toString());
            printWriter.print(strConcat);
            printWriter.print("mId=");
            printWriter.print(0);
            printWriter.print(" mArgs=");
            printWriter.println((Object) null);
            printWriter.print(strConcat);
            printWriter.print("mLoader=");
            printWriter.println(hz0Var.l);
            hi2 hi2Var = hz0Var.l;
            String strConcat2 = strConcat.concat("  ");
            hi2Var.getClass();
            printWriter.print(strConcat2);
            printWriter.print("mId=");
            printWriter.print(0);
            printWriter.print(" mListener=");
            printWriter.println(hi2Var.a);
            if (hi2Var.b || hi2Var.e) {
                printWriter.print(strConcat2);
                printWriter.print("mStarted=");
                printWriter.print(hi2Var.b);
                printWriter.print(" mContentChanged=");
                printWriter.print(hi2Var.e);
                printWriter.print(" mProcessingChange=");
                printWriter.println(false);
            }
            if (hi2Var.c || hi2Var.d) {
                printWriter.print(strConcat2);
                printWriter.print("mAbandoned=");
                printWriter.print(hi2Var.c);
                printWriter.print(" mReset=");
                printWriter.println(hi2Var.d);
            }
            if (hi2Var.g != null) {
                printWriter.print(strConcat2);
                printWriter.print("mTask=");
                printWriter.print(hi2Var.g);
                printWriter.print(" waiting=");
                hi2Var.g.getClass();
                printWriter.println(false);
            }
            if (hi2Var.h != null) {
                printWriter.print(strConcat2);
                printWriter.print("mCancellingTask=");
                printWriter.print(hi2Var.h);
                printWriter.print(" waiting=");
                hi2Var.h.getClass();
                printWriter.println(false);
            }
            if (hz0Var.n != null) {
                printWriter.print(strConcat);
                printWriter.print("mCallbacks=");
                printWriter.println(hz0Var.n);
                iz0 iz0Var = hz0Var.n;
                String strConcat3 = strConcat.concat("  ");
                iz0Var.getClass();
                printWriter.print(strConcat3);
                printWriter.print("mDeliveredData=");
                printWriter.println(iz0Var.b);
            }
            printWriter.print(strConcat);
            printWriter.print("mData=");
            hi2 hi2Var2 = hz0Var.l;
            Object objD = hz0Var.d();
            hi2Var2.getClass();
            StringBuilder sb = new StringBuilder(64);
            if (objD == null) {
                sb.append("null");
            } else {
                Class<?> cls = objD.getClass();
                sb.append(cls.getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(cls)));
                sb.append("}");
            }
            printWriter.println(sb.toString());
            printWriter.print(strConcat);
            printWriter.print("mStarted=");
            printWriter.println(((b) hz0Var).c > 0);
            i++;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Class<?> cls = this.a.getClass();
        sb.append(cls.getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(cls)));
        sb.append("}}");
        return sb.toString();
    }
}
