package defpackage;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class wb0 implements Sequence {
    public final /* synthetic */ int a;
    public final Object b;
    public final Function1 c;

    public /* synthetic */ wb0(Object obj, Function1 function1, int i) {
        this.a = i;
        this.b = obj;
        this.c = function1;
    }

    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new vb0(this);
            case 1:
                return new th0(this);
            default:
                return new kz1(this);
        }
    }
}
