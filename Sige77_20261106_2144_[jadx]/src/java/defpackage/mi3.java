package defpackage;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class mi3 {
    public static final Pattern a = Pattern.compile("(\\w+).*");

    public static String a(gh1 gh1Var) {
        if (gh1Var.isEmpty()) {
            return null;
        }
        qv2 qv2Var = new qv2("+", 3);
        no0 no0VarListIterator = gh1Var.listIterator(0);
        StringBuilder sb = new StringBuilder();
        qv2Var.a(sb, no0VarListIterator);
        return "transform=".concat(sb.toString());
    }
}
