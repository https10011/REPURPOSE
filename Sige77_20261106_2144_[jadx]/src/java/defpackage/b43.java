package defpackage;

import android.content.SharedPreferences;
import java.util.Objects;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class b43 {
    public final String a;
    public final long b;
    public boolean c;
    public long d;
    public final /* synthetic */ h43 e;

    public b43(h43 h43Var, String str, long j) {
        Objects.requireNonNull(h43Var);
        this.e = h43Var;
        gu2.l(str);
        this.a = str;
        this.b = j;
    }

    public final long a() {
        if (!this.c) {
            this.c = true;
            this.d = this.e.I().getLong(this.a, this.b);
        }
        return this.d;
    }

    public final void b(long j) {
        SharedPreferences.Editor editorEdit = this.e.I().edit();
        editorEdit.putLong(this.a, j);
        editorEdit.apply();
        this.d = j;
    }
}
