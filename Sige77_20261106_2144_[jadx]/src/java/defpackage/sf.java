package defpackage;

import android.view.View;
import com.facebook.login.k;
import com.hjq.toast.ToastUtils;
import java.util.Arrays;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final /* synthetic */ class sf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yg b;

    public /* synthetic */ sf(yg ygVar, int i) {
        this.a = i;
        this.b = ygVar;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [android.app.Activity, p5, p7, yg] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        ?? r4 = this.b;
        switch (i) {
            case 0:
                int i2 = yg.MODE_SONIC_WITH_OFFLINE_CACHE;
                if (so.b(r4.getResources().getColor(2131099703, null)) >= 0.5d) {
                    View decorView = r4.getWindow().getDecorView();
                    decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
                }
                break;
            case 1:
                int i3 = yg.MODE_SONIC_WITH_OFFLINE_CACHE;
                ToastUtils.show(r4.getResources().getText(2131886372));
                break;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                int i4 = yg.MODE_SONIC_WITH_OFFLINE_CACHE;
                ToastUtils.show(r4.getResources().getText(2131886370));
                break;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                int i5 = yg.MODE_SONIC_WITH_OFFLINE_CACHE;
                ToastUtils.show(r4.getResources().getText(2131886370));
                break;
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                int i6 = yg.MODE_SONIC_WITH_OFFLINE_CACHE;
                ToastUtils.show(r4.getResources().getText(2131886372));
                break;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                int i7 = yg.MODE_SONIC_WITH_OFFLINE_CACHE;
                ToastUtils.show(r4.getResources().getText(2131886370));
                break;
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                int i8 = yg.MODE_SONIC_WITH_OFFLINE_CACHE;
                ToastUtils.show(r4.getResources().getText(2131886370));
                break;
            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                int i9 = yg.MODE_SONIC_WITH_OFFLINE_CACHE;
                ToastUtils.show(r4.getResources().getText(2131886370));
                break;
            case oc1.BYTES_FIELD_NUMBER /* 8 */:
                int i10 = yg.MODE_SONIC_WITH_OFFLINE_CACHE;
                ToastUtils.show(r4.getResources().getText(2131886372));
                break;
            case 9:
                int i11 = yg.MODE_SONIC_WITH_OFFLINE_CACHE;
                ToastUtils.show(r4.getResources().getText(2131886372));
                break;
            case 10:
                int i12 = yg.MODE_SONIC_WITH_OFFLINE_CACHE;
                ToastUtils.show(r4.getResources().getText(2131886370));
                break;
            case 11:
                int i13 = yg.MODE_SONIC_WITH_OFFLINE_CACHE;
                ToastUtils.show(r4.getResources().getText(2131886370));
                break;
            case 12:
                int i14 = yg.MODE_SONIC_WITH_OFFLINE_CACHE;
                ToastUtils.show(r4.getResources().getText(2131886370));
                break;
            case 13:
                int i15 = yg.MODE_SONIC_WITH_OFFLINE_CACHE;
                ToastUtils.show(r4.getResources().getText(2131886370));
                break;
            case 14:
                int i16 = yg.MODE_SONIC_WITH_OFFLINE_CACHE;
                ToastUtils.show(r4.getResources().getText(2131886370));
                break;
            case 15:
                int i17 = yg.MODE_SONIC_WITH_OFFLINE_CACHE;
                ToastUtils.show((CharSequence) r4.getResources().getString(2131886368));
                break;
            case 16:
                r4.D0.setVisibility(0);
                break;
            case 17:
                int i18 = yg.MODE_SONIC_WITH_OFFLINE_CACHE;
                ToastUtils.show(r4.getResources().getText(2131886372));
                break;
            case 18:
                int i19 = yg.MODE_SONIC_WITH_OFFLINE_CACHE;
                ToastUtils.show(r4.getResources().getText(2131886370));
                break;
            case 19:
                int i20 = yg.MODE_SONIC_WITH_OFFLINE_CACHE;
                ToastUtils.show(r4.getResources().getText(2131886370));
                break;
            default:
                int i21 = yg.MODE_SONIC_WITH_OFFLINE_CACHE;
                try {
                    r4.j();
                    k.a().c((p5) r4, r4.M0, Arrays.asList("email", "public_profile"));
                    kv.E("Facebook login initiated via ActivityResultRegistry");
                } catch (Exception e) {
                    kv.o("Facebook login failed", e);
                    r4.w("Failure: " + e.getMessage());
                }
                break;
        }
    }
}
