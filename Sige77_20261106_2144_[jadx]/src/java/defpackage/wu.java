package defpackage;

import android.database.ContentObserver;
import android.database.Cursor;
import android.os.Handler;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class wu extends ContentObserver {
    public final /* synthetic */ yu1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wu(yu1 yu1Var) {
        super(new Handler());
        this.a = yu1Var;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        return true;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        Cursor cursor;
        yu1 yu1Var = this.a;
        if (!yu1Var.b || (cursor = yu1Var.c) == null || cursor.isClosed()) {
            return;
        }
        yu1Var.a = yu1Var.c.requery();
    }
}
