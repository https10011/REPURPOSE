package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.c;
import kotlin.text.d;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class j82 extends d82 {
    public static final /* synthetic */ int b0 = 0;
    public final String a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j82(c cVar, String str, String str2) {
        super(cVar, str);
        cVar.getClass();
        str.getClass();
        str2.getClass();
        this.a0 = str2;
        this.b = str2;
    }

    @Override // defpackage.d82
    public final Bundle c(String str) {
        String str2 = this.a0;
        if (str2.length() <= 0 || !d.j(str, str2, false)) {
            return super.c(str);
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(268435456);
            getContext().startActivity(intent);
            dismiss();
        } catch (Exception e) {
            e(new a90("Failed to launch custom redirect: " + e.getMessage(), -1, str));
        }
        return new Bundle();
    }
}
