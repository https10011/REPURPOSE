package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class rw extends mv1 implements Function1 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rw(Object obj, fs fsVar, int i) {
        super(1, fsVar);
        this.a = i;
        this.c = obj;
    }

    @Override // defpackage.ze
    public final fs create(fs fsVar) {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                return new rw((gq1) obj, fsVar, 0);
            default:
                return new rw((sx) obj, fsVar, 1);
        }
    }

    public final Object invoke(Object obj) {
        fs fsVar = (fs) obj;
        switch (this.a) {
            case 0:
                break;
        }
        return ((rw) create(fsVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.ze
    public final Object invokeSuspend(Object obj) throws IOException {
        Context context;
        String str;
        int i = this.a;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                Unit unit = ft.a;
                int i2 = this.b;
                if (i2 == 0) {
                    zi0.B(obj);
                    gq1 gq1Var = (gq1) obj2;
                    this.b = 1;
                    SharedPreferences.Editor editorEdit = ((SharedPreferences) gq1Var.e.getValue()).edit();
                    LinkedHashSet linkedHashSet = gq1Var.f;
                    if (linkedHashSet == null) {
                        editorEdit.clear();
                    } else {
                        Iterator it = linkedHashSet.iterator();
                        while (it.hasNext()) {
                            editorEdit.remove((String) it.next());
                        }
                    }
                    if (!editorEdit.commit()) {
                        uq1.o("Unable to delete migrated keys from SharedPreferences.");
                        return null;
                    }
                    if (((SharedPreferences) gq1Var.e.getValue()).getAll().isEmpty() && (context = gq1Var.c) != null && (str = gq1Var.d) != null) {
                        eq1.a(context, str);
                    }
                    if (linkedHashSet != null) {
                        linkedHashSet.clear();
                    }
                    if (Unit.a == unit) {
                        return unit;
                    }
                } else {
                    if (i2 != 1) {
                        uq1.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    zi0.B(obj);
                }
                return Unit.a;
            default:
                ft ftVar = ft.a;
                int i3 = this.b;
                if (i3 == 0) {
                    zi0.B(obj);
                    this.b = 1;
                    Object objInvoke = ((sx) obj2).invoke(this);
                    return objInvoke == ftVar ? ftVar : objInvoke;
                }
                if (i3 == 1) {
                    zi0.B(obj);
                    return obj;
                }
                uq1.q("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
