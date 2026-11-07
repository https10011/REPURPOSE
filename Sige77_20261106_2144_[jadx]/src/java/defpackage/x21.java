package defpackage;

import android.adservices.measurement.MeasurementManager;
import android.net.Uri;
import android.view.InputEvent;
import kotlin.Unit;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public abstract class x21 {
    public final MeasurementManager a;

    public x21(MeasurementManager measurementManager) {
        measurementManager.getClass();
        this.a = measurementManager;
    }

    public static Object b(x21 x21Var, s00 s00Var, fs<? super Unit> fsVar) {
        new pk(1, sr0.b(fsVar)).u();
        MeasurementManager measurementManager = x21Var.a;
        throw null;
    }

    public static Object d(x21 x21Var, fs<? super Integer> fsVar) {
        pk pkVar = new pk(1, sr0.b(fsVar));
        pkVar.u();
        x21Var.a.getMeasurementApiStatus(new w21(), new is(pkVar));
        Object objS = pkVar.s();
        ft ftVar = ft.a;
        return objS;
    }

    public static Object g(x21 x21Var, gs1 gs1Var, fs<? super Unit> fsVar) throws Throwable {
        Object objE = ta.e(new gx(x21Var, (fs) null, 2), fsVar);
        return objE == ft.a ? objE : Unit.a;
    }

    public static Object h(x21 x21Var, Uri uri, InputEvent inputEvent, fs<? super Unit> fsVar) {
        pk pkVar = new pk(1, sr0.b(fsVar));
        pkVar.u();
        x21Var.a.registerSource(uri, inputEvent, new w21(), new is(pkVar));
        Object objS = pkVar.s();
        return objS == ft.a ? objS : Unit.a;
    }

    public static Object j(x21 x21Var, Uri uri, fs<? super Unit> fsVar) {
        pk pkVar = new pk(1, sr0.b(fsVar));
        pkVar.u();
        x21Var.a.registerTrigger(uri, new w21(), new is(pkVar));
        Object objS = pkVar.s();
        return objS == ft.a ? objS : Unit.a;
    }

    public static Object l(x21 x21Var, g82 g82Var, fs<? super Unit> fsVar) {
        new pk(1, sr0.b(fsVar)).u();
        MeasurementManager measurementManager = x21Var.a;
        throw null;
    }

    public static Object n(x21 x21Var, h82 h82Var, fs<? super Unit> fsVar) {
        new pk(1, sr0.b(fsVar)).u();
        MeasurementManager measurementManager = x21Var.a;
        throw null;
    }

    public Object a(s00 s00Var, fs<? super Unit> fsVar) {
        return b(this, s00Var, fsVar);
    }

    public Object c(fs<? super Integer> fsVar) {
        return d(this, fsVar);
    }

    public Object e(gs1 gs1Var, fs<? super Unit> fsVar) {
        return g(this, gs1Var, fsVar);
    }

    public Object f(Uri uri, InputEvent inputEvent, fs<? super Unit> fsVar) {
        return h(this, uri, inputEvent, fsVar);
    }

    public Object i(Uri uri, fs<? super Unit> fsVar) {
        return j(this, uri, fsVar);
    }

    public Object k(g82 g82Var, fs<? super Unit> fsVar) {
        return l(this, g82Var, fsVar);
    }

    public Object m(h82 h82Var, fs<? super Unit> fsVar) {
        return n(this, h82Var, fsVar);
    }
}
