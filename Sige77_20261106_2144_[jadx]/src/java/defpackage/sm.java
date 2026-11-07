package defpackage;

import android.util.Base64;
import java.io.File;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class sm extends Lambda implements Function1 {
    public static final sm b;
    public static final sm c;
    public static final sm d;
    public static final sm e;
    public final /* synthetic */ int a;

    static {
        int i = 1;
        b = new sm(i, 0);
        c = new sm(i, 1);
        d = new sm(i, 2);
        e = new sm(i, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sm(int i, int i2) {
        super(i);
        this.a = i2;
    }

    public final Object invoke(Object obj) {
        String strValueOf;
        switch (this.a) {
            case 0:
                byte[] bArr = (byte[]) obj;
                bArr.getClass();
                String strEncodeToString = Base64.encodeToString(bArr, 2);
                strEncodeToString.getClass();
                return strEncodeToString;
            case 1:
                File file = (File) obj;
                file.getClass();
                String absolutePath = file.getCanonicalFile().getAbsolutePath();
                absolutePath.getClass();
                return new dr1(absolutePath);
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                Object value = entry.getValue();
                if (value instanceof byte[]) {
                    StringBuilder sb = new StringBuilder();
                    sb.append((CharSequence) "[");
                    int i = 0;
                    for (byte b2 : (byte[]) value) {
                        i++;
                        if (i > 1) {
                            sb.append((CharSequence) ", ");
                        }
                        sb.append((CharSequence) String.valueOf((int) b2));
                    }
                    sb.append((CharSequence) "]");
                    strValueOf = sb.toString();
                } else {
                    strValueOf = String.valueOf(entry.getValue());
                }
                return y00.l(new StringBuilder("  "), ((fc1) entry.getKey()).a, " = ", strValueOf);
            default:
                ((bu) obj).getClass();
                return new ql1();
        }
    }
}
