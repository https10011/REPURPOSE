package defpackage;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public abstract class v52 {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static as b(View view, as asVar) {
        ContentInfo contentInfoX = asVar.a.x();
        Objects.requireNonNull(contentInfoX);
        ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoX);
        if (contentInfoPerformReceiveContent == null) {
            return null;
        }
        return contentInfoPerformReceiveContent == contentInfoX ? asVar : new as(new kj0(contentInfoPerformReceiveContent));
    }
}
