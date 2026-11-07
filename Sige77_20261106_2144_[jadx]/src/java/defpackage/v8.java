package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import com.android.installreferrer.api.InstallReferrerStateListener;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public abstract class v8 {
    public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
        InstallReferrerStateListener yrVar;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                yrVar = new gk1(clipData, 3);
            } else {
                yrVar = new yr();
                yrVar.b = clipData;
                yrVar.c = 3;
            }
            x52.j(textView, yrVar.build());
            return true;
        } finally {
            textView.endBatchEdit();
        }
    }

    public static boolean b(DragEvent dragEvent, View view, Activity activity) {
        InstallReferrerStateListener yrVar;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            yrVar = new gk1(clipData, 3);
        } else {
            yrVar = new yr();
            yrVar.b = clipData;
            yrVar.c = 3;
        }
        x52.j(view, yrVar.build());
        return true;
    }
}
