package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class w41 {
    public static final CopyOnWriteArraySet d = new CopyOnWriteArraySet();
    public final String a;
    public final String b;
    public final List c;

    public w41(String str, List list, String str2) {
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    public static final CopyOnWriteArraySet a() {
        if (mt.a.contains(w41.class)) {
            return null;
        }
        try {
            return d;
        } catch (Throwable th) {
            mt.a(w41.class, th);
            return null;
        }
    }

    public final ArrayList b() {
        if (mt.a.contains(this)) {
            return null;
        }
        try {
            return new ArrayList(this.c);
        } catch (Throwable th) {
            mt.a(this, th);
            return null;
        }
    }

    public final String c() {
        if (mt.a.contains(this)) {
            return null;
        }
        try {
            return this.a;
        } catch (Throwable th) {
            mt.a(this, th);
            return null;
        }
    }
}
