package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class b73 extends pg2 implements ro3 {
    public static final /* synthetic */ int c = 0;
    public final int b;

    public b73(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData", 2);
        gu2.i(bArr.length == 25);
        this.b = Arrays.hashCode(bArr);
    }

    public static byte[] I(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            e.b(e);
            return null;
        }
    }

    @Override // defpackage.pg2
    public final boolean G(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            en0 en0VarZzd = zzd();
            parcel2.writeNoException();
            xv2.b(parcel2, en0VarZzd);
            return true;
        }
        if (i != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeInt(this.b);
        return true;
    }

    public abstract byte[] H();

    public final boolean equals(Object obj) {
        en0 en0VarZzd;
        if (obj instanceof ro3) {
            try {
                ro3 ro3Var = (ro3) obj;
                if (ro3Var.zze() == this.b && (en0VarZzd = ro3Var.zzd()) != null) {
                    return Arrays.equals(H(), (byte[]) e81.I(en0VarZzd));
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b;
    }

    @Override // defpackage.ro3
    public final en0 zzd() {
        return new e81(H());
    }

    @Override // defpackage.ro3
    public final int zze() {
        return this.b;
    }
}
