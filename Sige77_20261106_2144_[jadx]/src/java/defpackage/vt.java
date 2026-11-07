package defpackage;

import androidx.fragment.app.c;
import com.hjq.toast.BuildConfig;
import com.linecorp.linesdk.api.LineApiClientBuilder;
import com.linecorp.linesdk.openchat.ui.CreateOpenChatActivity;
import io.jsonwebtoken.JwtParser;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class vt extends Lambda implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vt(Object obj, int i) {
        super(0);
        this.a = i;
        this.b = obj;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                c cVar = (CreateOpenChatActivity) this.b;
                String stringExtra = cVar.getIntent().getStringExtra("arg_channel_id");
                if (stringExtra == null) {
                    stringExtra = BuildConfig.FLAVOR;
                }
                fx0 fx0VarBuild = new LineApiClientBuilder(cVar, stringExtra).build();
                fx0VarBuild.getClass();
                return fx0VarBuild;
            case 1:
                Object obj = db0.d;
                File file = (File) this.b;
                synchronized (obj) {
                    db0.c.remove(file.getAbsolutePath());
                }
                return Unit.a;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                File file2 = (File) ((dc1) this.b).invoke();
                String name = file2.getName();
                name.getClass();
                String strSubstring = BuildConfig.FLAVOR;
                int iX = StringsKt.x(name, JwtParser.SEPARATOR_CHAR, 0, 6);
                if (iX != -1) {
                    strSubstring = name.substring(iX + 1, name.length());
                }
                if (!Intrinsics.areEqual(strSubstring, "preferences_pb")) {
                    sm0.t(file2, " does not match required extension for Preferences file: preferences_pb", "File extension for file: ");
                    return null;
                }
                File absoluteFile = file2.getAbsoluteFile();
                absoluteFile.getClass();
                return absoluteFile;
            default:
                return bj0.n((q62) this.b);
        }
    }
}
