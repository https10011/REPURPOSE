package defpackage;

import android.content.pm.Signature;
import android.os.Build;
import android.util.Base64;
import android.util.Log;
import com.hjq.toast.BuildConfig;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class gc2 {
    public static final eg2 a = new eg2("PhoneskyVerificationUtils");

    public static boolean a(Signature[] signatureArr) {
        String strEncodeToString;
        if (signatureArr == null || (signatureArr.length) == 0) {
            Object[] objArr = new Object[0];
            eg2 eg2Var = a;
            eg2Var.getClass();
            if (Log.isLoggable("PlayCore", 5)) {
                Log.w("PlayCore", eg2.c(eg2Var.a, "Phonesky package is not signed -- possibly self-built package. Could not verify.", objArr));
            }
            return false;
        }
        for (Signature signature : signatureArr) {
            byte[] byteArray = signature.toByteArray();
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                messageDigest.update(byteArray);
                strEncodeToString = Base64.encodeToString(messageDigest.digest(), 11);
            } catch (NoSuchAlgorithmException unused) {
                strEncodeToString = BuildConfig.FLAVOR;
            }
            if ("8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(strEncodeToString)) {
                return true;
            }
            String str = Build.TAGS;
            if ((str.contains("dev-keys") || str.contains("test-keys")) && "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(strEncodeToString)) {
                return true;
            }
        }
        return false;
    }
}
