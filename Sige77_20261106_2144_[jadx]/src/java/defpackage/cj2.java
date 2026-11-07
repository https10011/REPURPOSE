package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class cj2 extends Fragment implements tw0 {
    public static final WeakHashMap b = new WeakHashMap();
    public final q8 a = new q8();

    @Override // defpackage.tw0
    public final void a(String str, pw0 pw0Var) {
        this.a.j(str, pw0Var);
    }

    @Override // defpackage.tw0
    public final pw0 b(Class cls, String str) {
        return (pw0) cls.cast(((Map) this.a.b).get(str));
    }

    @Override // defpackage.tw0
    public final Activity c() {
        return getActivity();
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it = ((Map) this.a.b).values().iterator();
        while (it.hasNext()) {
            ((pw0) it.next()).dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Iterator it = ((Map) this.a.b).values().iterator();
        while (it.hasNext()) {
            ((pw0) it.next()).onActivityResult(i, i2, intent);
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a.k(bundle);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        q8 q8Var = this.a;
        q8Var.a = 5;
        Iterator it = ((Map) q8Var.b).values().iterator();
        while (it.hasNext()) {
            ((pw0) it.next()).onDestroy();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        q8 q8Var = this.a;
        q8Var.a = 3;
        Iterator it = ((Map) q8Var.b).values().iterator();
        while (it.hasNext()) {
            ((pw0) it.next()).onResume();
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.a.l(bundle);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        q8 q8Var = this.a;
        q8Var.a = 2;
        Iterator it = ((Map) q8Var.b).values().iterator();
        while (it.hasNext()) {
            ((pw0) it.next()).onStart();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        q8 q8Var = this.a;
        q8Var.a = 4;
        Iterator it = ((Map) q8Var.b).values().iterator();
        while (it.hasNext()) {
            ((pw0) it.next()).onStop();
        }
    }
}
