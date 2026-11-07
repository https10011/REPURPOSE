package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ir3 {
    public d53 a;
    public Long b;
    public long c;
    public final /* synthetic */ rl2 d;

    public /* synthetic */ ir3(rl2 rl2Var) {
        this.d = rl2Var;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00f8 A[PHI: r6 r16 r17
      0x00f8: PHI (r6v4 android.database.Cursor) = (r6v3 android.database.Cursor), (r6v6 android.database.Cursor) binds: [B:61:0x0123, B:46:0x00f1] A[DONT_GENERATE, DONT_INLINE]
      0x00f8: PHI (r16v5 d53) = (r16v3 d53), (r16v9 d53) binds: [B:61:0x0123, B:46:0x00f1] A[DONT_GENERATE, DONT_INLINE]
      0x00f8: PHI (r17v4 long) = (r17v2 long), (r17v7 long) binds: [B:61:0x0123, B:46:0x00f1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:90:0x01ea  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32, types: [android.util.Pair] */
    /* JADX WARN: Type inference failed for: r0v73 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v7 */
    public final d53 a(String str, d53 d53Var) {
        ?? r5;
        d53 d53Var2;
        long j;
        Cursor cursorRawQuery;
        ?? r0;
        Object obj;
        Pair pair;
        String strY = d53Var.y();
        List listV = d53Var.v();
        rl2 rl2Var = this.d;
        if3 if3Var = rl2Var.b;
        if3 if3Var2 = rl2Var.b;
        y53 y53Var = (y53) rl2Var.a;
        if3Var.j0();
        l53 l53VarO = lf3.O("_eid", d53Var);
        Long l = (Long) (l53VarO == null ? null : lf3.W(l53VarO));
        if (l != null) {
            if (strY.equals("_ep")) {
                if3Var.j0();
                l53 l53VarO2 = lf3.O("_en", d53Var);
                String str2 = (String) (l53VarO2 == null ? null : lf3.W(l53VarO2));
                if (TextUtils.isEmpty(str2)) {
                    c33 c33Var = y53Var.f;
                    y53.l(c33Var);
                    c33Var.i.b(l, "Extra parameter without an event name. eventId");
                    return null;
                }
                if (this.a == null || this.b == null || l.longValue() != this.b.longValue()) {
                    bu2 bu2Var = if3Var.c;
                    if3.T(bu2Var);
                    y53 y53Var2 = (y53) bu2Var.a;
                    bu2Var.D();
                    bu2Var.F();
                    try {
                        try {
                            cursorRawQuery = bu2Var.v0().rawQuery("select main_event, children_to_process from main_event_params where app_id=? and event_id=?", new String[]{str, l.toString()});
                            try {
                                if (cursorRawQuery.moveToFirst()) {
                                    d53Var2 = null;
                                    try {
                                        try {
                                            Pair pairCreate = Pair.create((d53) ((b53) lf3.p0(d53.J(), cursorRawQuery.getBlob(0))).g(), Long.valueOf(cursorRawQuery.getLong(1)));
                                            cursorRawQuery.close();
                                            pair = pairCreate;
                                        } catch (IOException e) {
                                            c33 c33Var2 = y53Var2.f;
                                            y53.l(c33Var2);
                                            j = 0;
                                            try {
                                                c33Var2.f.d("Failed to merge main event. appId, eventId", c33.M(str), l, e);
                                            } catch (SQLiteException e2) {
                                                e = e2;
                                                c33 c33Var3 = y53Var2.f;
                                                y53.l(c33Var3);
                                                c33Var3.f.b(e, "Error selecting main event");
                                                if (cursorRawQuery != null) {
                                                    cursorRawQuery.close();
                                                }
                                                r0 = d53Var2;
                                                if (r0 != 0) {
                                                }
                                                c33 c33Var4 = y53Var.f;
                                                y53.l(c33Var4);
                                                c33Var4.i.c(str2, l, "Extra parameter without existing main event. eventName, eventId");
                                                return d53Var2;
                                            }
                                            cursorRawQuery.close();
                                            r0 = d53Var2;
                                        }
                                    } catch (SQLiteException e3) {
                                        e = e3;
                                        j = 0;
                                        c33 c33Var5 = y53Var2.f;
                                        y53.l(c33Var5);
                                        c33Var5.f.b(e, "Error selecting main event");
                                        if (cursorRawQuery != null) {
                                            cursorRawQuery.close();
                                        }
                                        r0 = d53Var2;
                                    }
                                } else {
                                    c33 c33Var6 = y53Var2.f;
                                    y53.l(c33Var6);
                                    c33Var6.a0.a("Main event not found");
                                    cursorRawQuery.close();
                                    pair = null;
                                    d53Var2 = null;
                                }
                                j = 0;
                                r0 = pair;
                            } catch (SQLiteException e4) {
                                e = e4;
                                d53Var2 = null;
                            }
                        } catch (Throwable th) {
                            th = th;
                            r5 = strY;
                            if (r5 != 0) {
                                r5.close();
                            }
                            throw th;
                        }
                    } catch (SQLiteException e5) {
                        e = e5;
                        d53Var2 = null;
                        j = 0;
                        cursorRawQuery = null;
                    } catch (Throwable th2) {
                        th = th2;
                        r5 = 0;
                        if (r5 != 0) {
                            r5.close();
                        }
                        throw th;
                    }
                    if (r0 != 0 || (obj = ((Pair) r0).first) == null) {
                        c33 c33Var7 = y53Var.f;
                        y53.l(c33Var7);
                        c33Var7.i.c(str2, l, "Extra parameter without existing main event. eventName, eventId");
                        return d53Var2;
                    }
                    this.a = (d53) obj;
                    this.c = ((Long) ((Pair) r0).second).longValue();
                    if3Var2.j0();
                    this.b = (Long) lf3.Q("_eid", this.a);
                } else {
                    j = 0;
                }
                long j2 = this.c - 1;
                this.c = j2;
                if (j2 <= j) {
                    bu2 bu2Var2 = if3Var2.c;
                    if3.T(bu2Var2);
                    y53 y53Var3 = (y53) bu2Var2.a;
                    bu2Var2.D();
                    c33 c33Var8 = y53Var3.f;
                    y53.l(c33Var8);
                    c33Var8.a0.b(str, "Clearing complex main event info. appId");
                    try {
                        bu2Var2.v0().execSQL("delete from main_event_params where app_id=?", new String[]{str});
                    } catch (SQLiteException e6) {
                        c33 c33Var9 = y53Var3.f;
                        y53.l(c33Var9);
                        c33Var9.f.b(e6, "Error clearing complex main event");
                    }
                } else {
                    bu2 bu2Var3 = if3Var2.c;
                    if3.T(bu2Var3);
                    bu2Var3.W(str, l, this.c, this.a);
                }
                ArrayList arrayList = new ArrayList();
                for (l53 l53Var : this.a.v()) {
                    if3Var2.j0();
                    if (lf3.O(l53Var.u(), d53Var) == null) {
                        arrayList.add(l53Var);
                    }
                }
                if (arrayList.isEmpty()) {
                    c33 c33Var10 = y53Var.f;
                    y53.l(c33Var10);
                    c33Var10.i.b(str2, "No unique parameters in main event. eventName");
                } else {
                    arrayList.addAll(listV);
                    listV = arrayList;
                }
                strY = str2;
            } else {
                this.b = l;
                this.a = d53Var;
                if3Var.j0();
                l53 l53VarO3 = lf3.O("_epc", d53Var);
                Serializable serializableW = l53VarO3 == null ? null : lf3.W(l53VarO3);
                long jLongValue = ((Long) (serializableW != null ? serializableW : 0L)).longValue();
                this.c = jLongValue;
                if (jLongValue <= 0) {
                    c33 c33Var11 = y53Var.f;
                    y53.l(c33Var11);
                    c33Var11.i.b(strY, "Complex event with zero extra param count. eventName");
                } else {
                    bu2 bu2Var4 = if3Var.c;
                    if3.T(bu2Var4);
                    bu2Var4.W(str, l, this.c, d53Var);
                }
            }
        }
        b53 b53Var = (b53) d53Var.k();
        b53Var.q(strY);
        b53Var.d();
        ((d53) b53Var.b).N();
        b53Var.d();
        ((d53) b53Var.b).M(listV);
        return (d53) b53Var.g();
    }
}
