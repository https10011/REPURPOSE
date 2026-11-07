package defpackage;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Regex;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public abstract class x9 {
    public static void a(String str) {
        boolean zContains;
        str.getClass();
        if (str.length() == 0 || str.length() > 40) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            throw new d90(String.format(Locale.ROOT, "Identifier '%s' must be less than %d characters", Arrays.copyOf(new Object[]{str, 40}, 2)));
        }
        HashSet hashSet = z9.f;
        synchronized (hashSet) {
            zContains = hashSet.contains(str);
            Unit unit = Unit.a;
        }
        if (zContains) {
            return;
        }
        if (!new Regex("^[0-9a-zA-Z_]+[0-9a-zA-Z _-]*$").c(str)) {
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            throw new d90(String.format("Skipping event named '%s' due to illegal name - must be under 40 chars and alphanumeric, _, - or space, and not start with a space or hyphen.", Arrays.copyOf(new Object[]{str}, 1)));
        }
        synchronized (hashSet) {
            hashSet.add(str);
        }
    }
}
