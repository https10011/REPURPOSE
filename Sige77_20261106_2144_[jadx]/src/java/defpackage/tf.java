package defpackage;

import android.content.DialogInterface;
import android.content.Intent;
import android.text.TextUtils;
import androidx.activity.ComponentActivity;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final /* synthetic */ class tf implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ yg b;

    public /* synthetic */ tf(yg ygVar, int i) {
        this.a = i;
        this.b = ygVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.a;
        ComponentActivity componentActivity = this.b;
        switch (i2) {
            case 0:
                if (!TextUtils.isEmpty(componentActivity.t0)) {
                    String str = componentActivity.t0;
                    c6 c6Var = componentActivity.E0;
                    str.getClass();
                    c6Var.getClass();
                    nl1 nl1Var = new nl1();
                    nl1Var.b = str;
                    nl1Var.a = c6Var;
                    sz szVar = i20.a;
                    qt.o(ta.a(fz.c), new r00(nl1Var, null, 0));
                } else if (sp0.d(componentActivity, "android.permission.CAMERA") != 0) {
                    sp0.A(componentActivity, new String[]{"android.permission.CAMERA"}, 3);
                } else {
                    componentActivity.A();
                }
                break;
            case 1:
                int i3 = yg.MODE_SONIC_WITH_OFFLINE_CACHE;
                Intent intent = new Intent("android.intent.action.GET_CONTENT");
                intent.addCategory("android.intent.category.OPENABLE");
                intent.setType("image/*");
                componentActivity.startActivityForResult(Intent.createChooser(intent, "Image Chooser"), 1);
                break;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                int i4 = yg.MODE_SONIC_WITH_OFFLINE_CACHE;
                Intent intent2 = new Intent("android.intent.action.GET_CONTENT");
                intent2.setType("text/plain");
                intent2.addCategory("android.intent.category.OPENABLE");
                componentActivity.startActivityForResult(intent2, 4);
                break;
            default:
                int i5 = yg.MODE_SONIC_WITH_OFFLINE_CACHE;
                componentActivity.finish();
                dialogInterface.dismiss();
                break;
        }
    }
}
