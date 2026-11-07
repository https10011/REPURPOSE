package defpackage;

import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class x23 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final int b;
    public final String c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object i;

    public /* synthetic */ x23(String str, h33 h33Var, int i, IOException iOException, byte[] bArr, Map map) {
        gu2.o(h33Var);
        this.d = h33Var;
        this.b = i;
        this.e = iOException;
        this.f = bArr;
        this.c = str;
        this.i = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                c33 c33Var = (c33) this.i;
                h43 h43Var = ((y53) c33Var.a).e;
                y53.j(h43Var);
                if (!h43Var.b) {
                    Log.println(6, c33Var.O(), "Persisted config not initialized. Not logging error/warn");
                    return;
                }
                if (c33Var.c == 0) {
                    is2 is2Var = ((y53) c33Var.a).d;
                    if (is2Var.e == null) {
                        synchronized (is2Var) {
                            try {
                                if (is2Var.e == null) {
                                    y53 y53Var = (y53) is2Var.a;
                                    ApplicationInfo applicationInfo = y53Var.a.getApplicationInfo();
                                    String strH = dw0.h();
                                    if (applicationInfo != null) {
                                        String str = applicationInfo.processName;
                                        is2Var.e = Boolean.valueOf(str != null && str.equals(strH));
                                    }
                                    if (is2Var.e == null) {
                                        is2Var.e = Boolean.TRUE;
                                        c33 c33Var2 = y53Var.f;
                                        y53.l(c33Var2);
                                        c33Var2.f.a("My process not in the list of running processes");
                                    }
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    if (is2Var.e.booleanValue()) {
                        c33Var.c = 'C';
                    } else {
                        c33Var.c = 'c';
                    }
                    break;
                }
                if (c33Var.d < 0) {
                    ((y53) c33Var.a).d.K();
                    c33Var.d = 161000L;
                }
                int i = this.b;
                char c = c33Var.c;
                long j = c33Var.d;
                String str2 = this.c;
                Object obj = this.d;
                Object obj2 = this.e;
                Object obj3 = this.f;
                char cCharAt = "01VDIWEA?".charAt(i);
                String strP = c33.P(true, str2, obj, obj2, obj3);
                StringBuilder sb = new StringBuilder(String.valueOf(cCharAt).length() + 1 + String.valueOf(c).length() + String.valueOf(j).length() + 1 + strP.length());
                sb.append("2");
                sb.append(cCharAt);
                sb.append(c);
                sb.append(j);
                sb.append(":");
                sb.append(strP);
                String string = sb.toString();
                if (string.length() > 1024) {
                    string = str2.substring(0, 1024);
                }
                e20 e20Var = h43Var.e;
                if (e20Var != null) {
                    String str3 = (String) e20Var.d;
                    h43 h43Var2 = (h43) e20Var.e;
                    h43Var2.D();
                    if (((h43) e20Var.e).I().getLong((String) e20Var.b, 0L) == 0) {
                        e20Var.e();
                    }
                    SharedPreferences sharedPreferencesI = h43Var2.I();
                    String str4 = (String) e20Var.c;
                    long j2 = sharedPreferencesI.getLong(str4, 0L);
                    if (j2 <= 0) {
                        SharedPreferences.Editor editorEdit = h43Var2.I().edit();
                        editorEdit.putString(str3, string);
                        editorEdit.putLong(str4, 1L);
                        editorEdit.apply();
                        return;
                    }
                    qf3 qf3Var = ((y53) h43Var2.a).w;
                    y53.j(qf3Var);
                    long jNextLong = qf3Var.D0().nextLong() & Long.MAX_VALUE;
                    long j3 = j2 + 1;
                    long j4 = Long.MAX_VALUE / j3;
                    SharedPreferences.Editor editorEdit2 = h43Var2.I().edit();
                    if (jNextLong < j4) {
                        editorEdit2.putString(str3, string);
                    }
                    editorEdit2.putLong(str4, j3);
                    editorEdit2.apply();
                    return;
                }
                return;
            default:
                ((h33) this.d).d(this.c, this.b, (Throwable) this.e, (byte[]) this.f, (Map) this.i);
                return;
        }
    }

    public x23(c33 c33Var, int i, String str, Object obj, Object obj2, Object obj3) {
        this.b = i;
        this.c = str;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.i = c33Var;
    }
}
