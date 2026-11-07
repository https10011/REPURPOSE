package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.hjq.toast.BuildConfig;
import java.io.File;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class hg2 extends Handler {
    public final qp0 a;
    public final ec1 b;
    public final lf2 c;
    public final ud2 d;
    public final pv2 e;
    public final q8 f;
    public long g;
    public int h;

    public hg2(Looper looper, qp0 qp0Var) throws Throwable {
        super(looper);
        this.h = 0;
        this.a = qp0Var;
        this.b = (ec1) qp0Var.d;
        this.c = (lf2) qp0Var.e;
        this.d = (ud2) qp0Var.b;
        pv2 pv2Var = (pv2) qp0Var.c;
        this.e = pv2Var;
        ue2 ue2Var = ue2.j;
        Context context = ue2Var.a;
        String str = (String) ue2Var.b;
        q8 q8Var = new q8();
        File file = new File(context.getFilesDir(), str);
        q8Var.b = file;
        File file2 = new File(context.getFilesDir(), y00.k(str, ".t"));
        q8Var.c = file2;
        q8Var.a = q8.a(file2) + q8.a(file);
        this.f = q8Var;
        pv2Var.getClass();
        long j = 0;
        try {
            j = ((SharedPreferences) ((FutureTask) pv2Var.a).get()).getLong("FM_last_time", 0L);
        } catch (InterruptedException | ExecutionException unused) {
        }
        this.g = j;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003b  */
    /* JADX WARN: Code duplicated, block: B:21:0x0042  */
    /* JADX WARN: Code duplicated, block: B:23:0x0052 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:? A[RETURN, SYNTHETIC] */
    public final boolean a(boolean z) {
        ec1 ec1Var = this.b;
        if (ec1Var.b()) {
            q8 q8Var = this.f;
            lf2 lf2Var = this.c;
            if (z) {
                if (!lf2.c(lf2Var.d) && !lf2.c(lf2Var.c)) {
                    ((File) q8Var.b).delete();
                    ((File) q8Var.c).delete();
                    q8Var.a = 0;
                    return false;
                }
                if (q8Var.a > 0) {
                    if (q8Var.a >= 300) {
                        return true;
                    }
                    if (lf2Var.e * 1000 < System.currentTimeMillis() - this.g) {
                        return true;
                    }
                }
            } else {
                if (q8Var.a >= 300) {
                    return true;
                }
                if (lf2Var.e * 1000 < System.currentTimeMillis() - this.g) {
                    return true;
                }
            }
        } else if (!z) {
            ec1Var.a();
            return false;
        }
        return false;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:17)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:14)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:101)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:21)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.a(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at pw0.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:44)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:32)
     */
    public final void b() throws Throwable {
        pv2 pv2Var = this.e;
        q8 q8Var = this.f;
        ec1 ec1Var = this.b;
        if (((jf2) ec1Var.b) != jf2.f) {
            ec1Var.a();
            return;
        }
        File file = (File) q8Var.b;
        File file2 = (File) q8Var.c;
        int iA = q8.a(file2);
        String strB = ga.b(file2);
        if (iA <= 150) {
            int i = 300 - iA;
            String strB2 = ga.b(file);
            int i2 = 0;
            int i3 = 0;
            do {
                int iIndexOf = strB2.indexOf(";", i2);
                if (iIndexOf == -1) {
                    break;
                }
                i3++;
                i2 = iIndexOf + 1;
            } while (i3 < i);
            strB = strB.concat(strB2.substring(0, i2));
            ga.a(file2, strB, false);
            ga.a(file, strB2.substring(i2), false);
        }
        ce2 ce2VarB = this.d.b("/stats/events", strB, true);
        lf2 lf2Var = this.c;
        boolean z = ce2VarB instanceof vd2;
        if (z) {
            String str = ((vd2) ce2VarB).d;
            if (!TextUtils.isEmpty(str)) {
                lf2 lf2VarB = lf2.b(str);
                if (!lf2Var.equals(lf2VarB)) {
                    lf2Var.a(lf2VarB);
                    pv2Var.o(lf2Var);
                }
                if (!TextUtils.isEmpty(lf2Var.f)) {
                    pv2 pv2VarJ = this.a.j();
                    String str2 = (String) ue2.j.b;
                    String str3 = lf2Var.f;
                    rb2 rb2Var = (rb2) pv2VarJ.a;
                    String strB3 = rb2Var.b(str2);
                    if (strB3 == null || !strB3.equals(str3)) {
                        rb2Var.d(str2, str3);
                    }
                }
            }
        }
        this.g = System.currentTimeMillis();
        if (!z) {
            if (g93.i) {
                g93.j("statEvents fail : %s", ce2VarB.f());
            }
            int i4 = this.h;
            if (i4 < 10) {
                this.h = i4 + 1;
                return;
            }
            return;
        }
        if (((vd2) ce2VarB).a == 0) {
            if (g93.i) {
                g93.b("statEvents success", new Object[0]);
            }
            this.h = 0;
            File file3 = (File) q8Var.c;
            int iA2 = q8.a(file3);
            ga.a(file3, BuildConfig.FLAVOR, false);
            q8Var.a -= iA2;
        }
        long j = this.g;
        pv2Var.getClass();
        try {
            SharedPreferences.Editor editorEdit = ((SharedPreferences) ((FutureTask) pv2Var.a).get()).edit();
            editorEdit.putLong("FM_last_time", j);
            editorEdit.apply();
        } catch (InterruptedException | ExecutionException unused) {
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) throws Throwable {
        int i = message.what;
        if (i != 21) {
            if (i == 23 && this.h < 10 && a(true)) {
                b();
                return;
            }
            return;
        }
        uf2 uf2Var = (uf2) message.obj;
        int i2 = uf2Var.b;
        lf2 lf2Var = this.c;
        if (i2 != 2 || lf2.c(lf2Var.d)) {
            if (i2 != 1 || lf2.c(lf2Var.d)) {
                if (i2 != 0 || lf2.c(lf2Var.c)) {
                    q8 q8Var = this.f;
                    q8Var.getClass();
                    StringBuilder sb = new StringBuilder();
                    String str = uf2Var.c;
                    Map map = uf2Var.f;
                    if (!TextUtils.isEmpty(str)) {
                        sb.append(str);
                        sb.append(",");
                    }
                    Long l = uf2Var.d;
                    if (l != null) {
                        sb.append(l);
                        sb.append(",");
                    }
                    Long l2 = uf2Var.e;
                    if (l2 != null) {
                        sb.append(l2);
                        sb.append(",");
                    }
                    if (map != null && map.size() > 0) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            for (Map.Entry entry : map.entrySet()) {
                                jSONObject.put((String) entry.getKey(), entry.getValue());
                            }
                            String string = jSONObject.toString();
                            try {
                                ub2 ub2Var = ub2.e;
                                Charset charset = vb2.a;
                                string = new String(ub2Var.a(string.getBytes(charset)), charset);
                            } catch (Exception unused) {
                            }
                            sb.append(string);
                            sb.append(",");
                        } catch (JSONException unused2) {
                        }
                    }
                    if (sb.length() > 0) {
                        sb.setLength(sb.length() - 1);
                        sb.append(";");
                    }
                    String string2 = sb.toString();
                    int length = string2.getBytes(vb2.a).length;
                    if (length >= 1024 && g93.i) {
                        g93.g("效果点 %s 过长 : %d", str, Integer.valueOf(length));
                    }
                    File file = (File) q8Var.b;
                    ga.a(file, string2, true);
                    file.length();
                    q8Var.a++;
                    if (uf2Var.a || a(false)) {
                        b();
                        return;
                    }
                    return;
                }
                if (g93.i) {
                    g93.g("registerStatsEnabled is false", new Object[0]);
                }
            } else if (g93.i) {
                g93.g("eventStatsEnabled is false", new Object[0]);
            }
        } else if (g93.i) {
            g93.g("eventStatsEnabled is false", new Object[0]);
        }
        if (a(false)) {
            b();
        }
    }
}
