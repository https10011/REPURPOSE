package defpackage;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Regex;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final /* synthetic */ class l70 implements FilenameFilter {
    public final /* synthetic */ int a;

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        switch (this.a) {
            case 0:
                str.getClass();
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                return new Regex(String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"error_log_"}, 1))).c(str);
            case 1:
                str.getClass();
                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                return new Regex(String.format("^(%s|%s|%s)[0-9]+.json$", Arrays.copyOf(new Object[]{"crash_log_", "shield_log_", "thread_check_log_"}, 3))).c(str);
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                str.getClass();
                StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
                return new Regex(String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"anr_log_"}, 1))).c(str);
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                str.getClass();
                StringCompanionObject stringCompanionObject4 = StringCompanionObject.INSTANCE;
                return new Regex(String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"analysis_log_"}, 1))).c(str);
            default:
                return Pattern.matches("cpu[0-9]+", str);
        }
    }
}
