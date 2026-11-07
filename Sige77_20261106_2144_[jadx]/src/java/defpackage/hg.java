package defpackage;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.c;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class hg implements DialogInterface.OnClickListener {
    public final /* synthetic */ yg a;

    public hg(yg ygVar) {
        this.a = ygVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Intent intent = new Intent();
        intent.addFlags(268435456);
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        c cVar = this.a;
        intent.setData(Uri.fromParts("package", cVar.getPackageName(), null));
        cVar.startActivity(intent);
    }
}
