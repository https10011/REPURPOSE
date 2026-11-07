package com.google.android.recaptcha.internal;

import defpackage.bp;
import defpackage.c11;
import defpackage.co1;
import defpackage.cp;
import defpackage.do1;
import defpackage.e00;
import defpackage.et0;
import defpackage.fs;
import defpackage.ft;
import defpackage.hm;
import defpackage.it0;
import defpackage.jt0;
import defpackage.km;
import defpackage.kt0;
import defpackage.lt0;
import defpackage.n20;
import defpackage.up0;
import defpackage.vp;
import defpackage.ws0;
import defpackage.ww;
import defpackage.xs0;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.coroutines.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class zzbw implements e00 {
    private final /* synthetic */ bp zza;

    public zzbw(bp bpVar) {
        this.zza = bpVar;
    }

    @Override // defpackage.ws0
    public final hm attachChild(km kmVar) {
        return this.zza.attachChild(kmVar);
    }

    @Override // defpackage.e00
    public final Object await(fs fsVar) throws Throwable {
        Object objI = ((cp) this.zza).i(fsVar);
        ft ftVar = ft.a;
        return objI;
    }

    public final /* synthetic */ boolean cancel(Throwable th) {
        CancellationException xs0Var;
        lt0 lt0Var = (lt0) this.zza;
        if (th != null) {
            lt0Var.getClass();
            xs0Var = lt0.Q(lt0Var, th);
        } else {
            xs0Var = new xs0(lt0Var.m(), null, lt0Var);
        }
        lt0Var.k(xs0Var);
        return true;
    }

    public final Object fold(Object obj, Function2 function2) {
        lt0 lt0Var = (lt0) this.zza;
        lt0Var.getClass();
        function2.getClass();
        return function2.invoke(obj, lt0Var);
    }

    public final CoroutineContext.Element get(f fVar) {
        lt0 lt0Var = (lt0) this.zza;
        lt0Var.getClass();
        return e.a(lt0Var, fVar);
    }

    @Override // defpackage.ws0
    public final CancellationException getCancellationException() {
        return this.zza.getCancellationException();
    }

    @Override // defpackage.ws0
    public final Sequence getChildren() {
        return this.zza.getChildren();
    }

    @Override // defpackage.e00
    public final Object getCompleted() {
        return ((cp) this.zza).r();
    }

    @Override // defpackage.e00
    public final Throwable getCompletionExceptionOrNull() {
        return ((lt0) this.zza).getCompletionExceptionOrNull();
    }

    public final f getKey() {
        return this.zza.getKey();
    }

    public final do1 getOnAwait() {
        cp cpVar = (cp) this.zza;
        cpVar.getClass();
        it0 it0Var = it0.a;
        it0Var.getClass();
        jt0 jt0Var = jt0.a;
        jt0Var.getClass();
        return new ww(cpVar);
    }

    public final co1 getOnJoin() {
        ((lt0) this.zza).getClass();
        kt0 kt0Var = kt0.a;
        kt0Var.getClass();
        return new c11(9);
    }

    public final ws0 getParent() {
        hm hmVarW = ((lt0) this.zza).w();
        if (hmVarW != null) {
            return hmVarW.getParent();
        }
        return null;
    }

    @Override // defpackage.ws0
    public final n20 invokeOnCompletion(Function1 function1) {
        return this.zza.invokeOnCompletion(function1);
    }

    @Override // defpackage.ws0
    public final boolean isActive() {
        return this.zza.isActive();
    }

    public final boolean isCancelled() {
        Object objX = ((lt0) this.zza).x();
        if (objX instanceof vp) {
            return true;
        }
        return (objX instanceof et0) && ((et0) objX).e();
    }

    public final boolean isCompleted() {
        return !(((lt0) this.zza).x() instanceof up0);
    }

    @Override // defpackage.ws0
    public final Object join(fs fsVar) {
        return this.zza.join(fsVar);
    }

    public final CoroutineContext minusKey(f fVar) {
        return this.zza.minusKey(fVar);
    }

    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return this.zza.plus(coroutineContext);
    }

    @Override // defpackage.ws0
    public final boolean start() {
        return this.zza.start();
    }

    public final ws0 plus(ws0 ws0Var) {
        this.zza.getClass();
        return ws0Var;
    }

    @Override // defpackage.ws0
    public final n20 invokeOnCompletion(boolean z, boolean z2, Function1 function1) {
        return this.zza.invokeOnCompletion(z, z2, function1);
    }

    @Override // defpackage.ws0, defpackage.nl
    public final void cancel(CancellationException cancellationException) {
        this.zza.cancel(cancellationException);
    }

    public final /* synthetic */ void cancel() {
        ((lt0) this.zza).cancel(null);
    }
}
