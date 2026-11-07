package defpackage;

import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.hjq.toast.BuildConfig;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class dz2 implements zm2, ph1 {
    public static final dz2 W;
    public static final dz2 X;
    public static final dz2 c;
    public static final dz2 d;
    public static final dz2 e;
    public static final dz2 f;
    public static final dz2 i;
    public static final dz2 v;
    public static final dz2 w;
    public final /* synthetic */ int a;
    public String b;

    static {
        int i2 = 0;
        c = new dz2("TINK", i2);
        d = new dz2("CRUNCHY", i2);
        e = new dz2("NO_PREFIX", i2);
        int i3 = 1;
        f = new dz2("TINK", i3);
        i = new dz2("NO_PREFIX", i3);
        int i4 = 2;
        v = new dz2("TINK", i4);
        w = new dz2("CRUNCHY", i4);
        W = new dz2("LEGACY", i4);
        X = new dz2("NO_PREFIX", i4);
    }

    public /* synthetic */ dz2(String str, int i2) {
        this.a = i2;
        this.b = str;
    }

    @Override // defpackage.ph1
    public void accept(Object obj, Object obj2) {
        int i2 = u83.l;
        a83 a83Var = new a83((TaskCompletionSource) obj2);
        a93 a93Var = (a93) ((b93) obj).l();
        String str = this.b;
        Parcel parcelF = a93Var.F();
        fv2.c(parcelF, a83Var);
        parcelF.writeString(str);
        parcelF.writeString(BuildConfig.FLAVOR);
        parcelF.writeString(null);
        a93Var.G(parcelF, 11);
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return this.b;
            case 1:
                return this.b;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return this.b;
            default:
                return super.toString();
        }
    }

    @Override // defpackage.zm2
    public String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("idToken", this.b);
        return jSONObject.toString();
    }

    public /* synthetic */ dz2(int i2) {
        this.a = i2;
    }
}
