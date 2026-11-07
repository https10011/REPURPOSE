package defpackage;

import android.util.Log;
import java.util.TreeSet;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class k61 {
    public TreeSet a;
    public final /* synthetic */ int b;

    public /* synthetic */ k61(int i) {
        this.b = i;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0011 A[Catch: all -> 0x000f, TRY_LEAVE, TryCatch #1 {all -> 0x000f, blocks: (B:5:0x0004, B:7:0x0008, B:20:0x002b, B:22:0x002f, B:24:0x0035, B:25:0x0037, B:27:0x003b, B:29:0x0049, B:36:0x005b, B:35:0x0058, B:12:0x0011, B:19:0x0029, B:18:0x0025, B:15:0x001f), top: B:43:0x0004, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:14:0x001d  */
    /* JADX WARN: Code duplicated, block: B:41:0x001f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public final synchronized void a(boolean z) {
        l61 l61Var;
        TreeSet treeSetF;
        if (z) {
            l61Var = l61.a;
            if (mt.a.contains(l61.class)) {
                treeSetF = null;
                this.a = treeSetF;
            } else {
                treeSetF = l61Var.f(this);
                this.a = treeSetF;
            }
        } else {
            try {
                TreeSet treeSet = this.a;
                if (treeSet == null || treeSet.isEmpty()) {
                    l61Var = l61.a;
                    if (mt.a.contains(l61.class)) {
                        treeSetF = null;
                        this.a = treeSetF;
                    } else {
                        try {
                            treeSetF = l61Var.f(this);
                        } catch (Throwable th) {
                            mt.a(l61.class, th);
                            treeSetF = null;
                        }
                        this.a = treeSetF;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        TreeSet treeSet2 = this.a;
        if (treeSet2 == null || treeSet2.isEmpty()) {
            switch (this.b) {
                case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                    if (i90.a().getApplicationInfo().targetSdkVersion >= 30) {
                        Log.w(mt.a.contains(l61.class) ? null : "l61", "Apps that target Android API 30+ (Android 11+) cannot call Facebook native apps unless the package visibility needs are declared. Please follow https://developers.facebook.com/docs/android/troubleshooting/#faq_267321845055988 to make the declaration.");
                    }
                    break;
                default:
                    break;
            }
            throw th2;
        }
    }

    public final String b() {
        switch (this.b) {
            case 0:
                return "com.facebook.arstudio.player";
            case 1:
                return "com.instagram.android";
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return "com.facebook.katana";
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                return "com.facebook.orca";
            default:
                return "com.facebook.wakizashi";
        }
    }

    public final void c() {
    }
}
