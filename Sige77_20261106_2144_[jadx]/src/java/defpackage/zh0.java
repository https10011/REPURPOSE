package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class zh0 extends di0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zh0(CharSequence charSequence, int i) {
        super(charSequence, "android.credentials.GetCredentialException.TYPE_USER_CANCELED");
        switch (i) {
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                super(charSequence, "android.credentials.GetCredentialException.TYPE_INTERRUPTED");
                break;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                super(charSequence, "androidx.credentials.TYPE_GET_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION");
                break;
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                super(charSequence, "android.credentials.GetCredentialException.TYPE_UNKNOWN");
                break;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                super(charSequence, "androidx.credentials.TYPE_GET_CREDENTIAL_UNSUPPORTED_EXCEPTION");
                break;
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                super(charSequence, "android.credentials.GetCredentialException.TYPE_NO_CREDENTIAL");
                break;
            default:
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zh0(CharSequence charSequence, String str) {
        super(charSequence, str);
        str.getClass();
        if (str.length() > 0) {
            return;
        }
        e.g("type must not be empty");
        throw null;
    }
}
