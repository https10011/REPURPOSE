package com.google.android.recaptcha.internal;

import defpackage.et;
import defpackage.fs;
import defpackage.ft;
import defpackage.mv1;
import defpackage.zi0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
final class zzbh extends mv1 implements Function2 {
    public zzbh(fs fsVar) {
        super(2, fsVar);
    }

    @Override // defpackage.ze
    public final fs create(Object obj, fs fsVar) {
        return new zzbh(fsVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbh) create((et) obj, (fs) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.ze
    public final Object invokeSuspend(Object obj) {
        ft ftVar = ft.a;
        zi0.B(obj);
        Thread.currentThread().setPriority(8);
        return Unit.a;
    }
}
