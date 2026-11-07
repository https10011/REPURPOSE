package defpackage;

import com.facebook.FacebookRequestError;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class j90 extends d90 {
    public final FacebookRequestError b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j90(FacebookRequestError facebookRequestError, String str) {
        super(str);
        facebookRequestError.getClass();
        this.b = facebookRequestError;
    }

    @Override // defpackage.d90, java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder("{FacebookServiceException: httpResponseCode: ");
        FacebookRequestError facebookRequestError = this.b;
        sb.append(facebookRequestError.a);
        sb.append(", facebookErrorCode: ");
        sb.append(facebookRequestError.b);
        sb.append(", facebookErrorType: ");
        sb.append(facebookRequestError.d);
        sb.append(", message: ");
        sb.append(facebookRequestError.a());
        sb.append("}");
        return sb.toString();
    }
}
