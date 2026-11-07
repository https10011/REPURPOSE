package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ev2 {
    public static final ut2 c;
    public static final ev2 d;
    public Task a;
    public long b;

    static {
        Object[] objArr = {"firebaseAppName", "firebaseUserUid", "operation", "tenantId", "verifyAssertionRequest", "statusCode", "statusMessage", "timestamp"};
        cr2 cr2Var = dp2.e;
        for (int i = 0; i < 8; i++) {
            if (objArr[i] == null) {
                uq1.h(ck1.r(i, "at index "));
                return;
            }
        }
        c = new ut2(8, objArr);
        ev2 ev2Var = new ev2();
        ev2Var.b = 0L;
        d = ev2Var;
    }

    public static void a(Context context, Status status) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        editorEdit.putInt("statusCode", status.a);
        editorEdit.putString("statusMessage", status.b);
        editorEdit.putLong("timestamp", System.currentTimeMillis());
        editorEdit.commit();
    }

    public static void b(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        ut2 ut2Var = c;
        int i = ut2Var.i;
        int i2 = 0;
        while (i2 < i) {
            Object obj = ut2Var.get(i2);
            i2++;
            editorEdit.remove((String) obj);
        }
        editorEdit.commit();
    }
}
