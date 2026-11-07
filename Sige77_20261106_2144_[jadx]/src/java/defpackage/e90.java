package defpackage;

import com.facebook.FacebookRequestError;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class e90 extends d90 {
    public final pk0 b;

    public e90(pk0 pk0Var, String str) {
        super(str);
        this.b = pk0Var;
    }

    @Override // defpackage.d90, java.lang.Throwable
    public final String toString() {
        pk0 pk0Var = this.b;
        FacebookRequestError facebookRequestError = pk0Var != null ? pk0Var.c : null;
        StringBuilder sb = new StringBuilder("{FacebookGraphResponseException: ");
        String message = getMessage();
        if (message != null) {
            sb.append(message);
            sb.append(" ");
        }
        if (facebookRequestError != null) {
            sb.append("httpResponseCode: ");
            sb.append(facebookRequestError.a);
            sb.append(", facebookErrorCode: ");
            sb.append(facebookRequestError.b);
            sb.append(", facebookErrorType: ");
            sb.append(facebookRequestError.d);
            sb.append(", message: ");
            sb.append(facebookRequestError.a());
            sb.append("}");
        }
        return sb.toString();
    }
}
