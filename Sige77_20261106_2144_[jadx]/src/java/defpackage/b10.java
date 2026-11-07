package defpackage;

import android.content.DialogInterface;
import com.facebook.login.DeviceAuthDialog;
import java.util.Date;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final /* synthetic */ class b10 implements DialogInterface.OnClickListener {
    public final /* synthetic */ DeviceAuthDialog a;
    public final /* synthetic */ String b;
    public final /* synthetic */ ac2 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Date e;
    public final /* synthetic */ Date f;

    public /* synthetic */ b10(DeviceAuthDialog deviceAuthDialog, String str, ac2 ac2Var, String str2, Date date, Date date2) {
        this.a = deviceAuthDialog;
        this.b = str;
        this.c = ac2Var;
        this.d = str2;
        this.e = date;
        this.f = date2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        String str = this.b;
        str.getClass();
        String str2 = this.d;
        str2.getClass();
        this.a.S(str, this.c, str2, this.e, this.f);
    }
}
