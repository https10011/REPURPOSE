package defpackage;

import android.os.Bundle;
import android.os.ResultReceiver;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class eu {
    public static ot a(String str, String str2) {
        if (Intrinsics.areEqual(str, "CREATE_CANCELED")) {
            return new nt(str2, 0);
        }
        return Intrinsics.areEqual(str, "CREATE_INTERRUPTED") ? new nt(str2, 2) : new nt(str2, 5);
    }

    public static di0 b(String str, String str2) {
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -1567968963) {
                if (iHashCode != -154594663) {
                    if (iHashCode == 1996705159 && str.equals("GET_NO_CREDENTIALS")) {
                        return new zh0(str2, 6);
                    }
                } else if (str.equals("GET_INTERRUPTED")) {
                    return new zh0(str2, 2);
                }
            } else if (str.equals("GET_CANCELED_TAG")) {
                return new zh0(str2, 0);
            }
        }
        return new zh0(str2, 4);
    }

    public static void c(ResultReceiver resultReceiver, String str, String str2) {
        resultReceiver.getClass();
        Bundle bundle = new Bundle();
        bundle.putBoolean("FAILURE_RESPONSE", true);
        bundle.putString("EXCEPTION_TYPE", str);
        bundle.putString("EXCEPTION_MESSAGE", str2);
        resultReceiver.send(Integer.MAX_VALUE, bundle);
    }
}
