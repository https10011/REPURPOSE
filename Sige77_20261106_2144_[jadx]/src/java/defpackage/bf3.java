package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.Feature;
import java.util.Iterator;
import java.util.regex.Matcher;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class bf3 implements pf3, cv1, hr3, gr3 {
    public Object a;

    public /* synthetic */ bf3(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.hr3
    public Iterator a(ox1 ox1Var, CharSequence charSequence) {
        Matcher matcher = ((md3) this.a).w.matcher(charSequence);
        m83 m83Var = new m83();
        matcher.getClass();
        m83Var.a = matcher;
        return new so3(ox1Var, charSequence, m83Var, 0);
    }

    @Override // defpackage.pf3
    public void b(String str, String str2, Bundle bundle) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        if3 if3Var = (if3) this.a;
        if (!zIsEmpty) {
            if3Var.e().N(new yk(11, this, str, str2, bundle));
            return;
        }
        y53 y53Var = if3Var.Y;
        if (y53Var != null) {
            c33 c33Var = y53Var.f;
            y53.l(c33Var);
            c33Var.f.b(str2, "AppId not known when logging event");
        }
    }

    @Override // defpackage.cv1
    public Object get() {
        ch3 ch3Var = (ch3) this.a;
        q51 q51Var = (q51) ch3Var.c.get();
        q51Var.getClass();
        nb3 nb3Var = (nb3) ch3Var.b.get();
        nb3Var.getClass();
        u83 u83Var = nb3Var.a;
        ei eiVarB = ei.b();
        eiVarB.d = new m83(u83Var);
        eiVarB.e = new Feature[]{yv2.m};
        eiVarB.c = false;
        z zVarB = nb3.b(u83Var.b(0, eiVarB.a()));
        to2 to2Var = to2.e;
        int i = b0.Y;
        a0 a0Var = new a0(zVarB, jb3.class, to2Var);
        zVarB.a(a0Var, gb2.C(q51Var, a0Var));
        s1 s1VarF = dh0.f(a0Var, new ve3(ch3Var, 2), q51Var);
        s1VarF.a(new aj2(s1VarF, 12), q51Var);
        return s1VarF;
    }

    @Override // defpackage.gr3
    public Object zza(String str) {
        return ((kr3) this.a).a(str, null);
    }
}
