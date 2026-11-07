package defpackage;

import com.google.firebase.auth.zzc;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class zo2 {
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;
    public final String e;
    public ri2 f;
    public final String g;
    public final long h;
    public final long i;
    public boolean j;
    public zzc k;
    public final List l;
    public dp2 m;

    public zo2(String str, String str2, boolean z, String str3, String str4, ri2 ri2Var, String str5, long j, long j2, ArrayList arrayList, ut2 ut2Var) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = str4;
        List list = (List) ri2Var.a;
        ri2 ri2Var2 = new ri2(24);
        if (list != null) {
            ((List) ri2Var2.a).addAll(list);
        }
        this.f = ri2Var2;
        this.g = str5;
        this.h = j;
        this.i = j2;
        this.j = false;
        this.k = null;
        this.l = arrayList;
        this.m = ut2Var;
    }
}
