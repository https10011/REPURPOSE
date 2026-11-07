package com.google.android.recaptcha.internal;

import defpackage.bp;
import defpackage.cp;
import defpackage.et;
import defpackage.fs;
import defpackage.ft;
import defpackage.mv1;
import defpackage.yx1;
import defpackage.zi0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
final class zzam extends mv1 implements Function2 {
    Object zza;
    int zzb;
    final /* synthetic */ zzan zzc;
    final /* synthetic */ zzen zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzam(zzan zzanVar, zzen zzenVar, fs fsVar) {
        super(2, fsVar);
        this.zzc = zzanVar;
        this.zzd = zzenVar;
    }

    @Override // defpackage.ze
    public final fs create(Object obj, fs fsVar) {
        return new zzam(this.zzc, this.zzd, fsVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzam) create((et) obj, (fs) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0041  */
    @Override // defpackage.ze
    public final Object invokeSuspend(Object obj) {
        Ref.ObjectRef objectRef;
        Exception e;
        Throwable th;
        ft ftVar = ft.a;
        if (this.zzb != 0) {
            objectRef = (Ref.ObjectRef) this.zza;
            try {
                zi0.B(obj);
            } catch (Exception e2) {
                e = e2;
                bp bpVarZzf = this.zzc.zzf();
                th = (Throwable) objectRef.element;
                if (th == null) {
                    th = e;
                }
                ((cp) bpVarZzf).V(th);
                this.zzc.zze = zzao.zza;
                this.zzd.zzb(new zzbd(zzbb.zzb, zzba.zza, e.getMessage()));
            }
        } else {
            zi0.B(obj);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            try {
                zzal zzalVar = new zzal(this.zzc, this.zzd, objectRef2, null);
                this.zza = objectRef2;
                this.zzb = 1;
                if (yx1.a(60000L, zzalVar, this) == ftVar) {
                    return ftVar;
                }
            } catch (Exception e3) {
                objectRef = objectRef2;
                e = e3;
                bp bpVarZzf2 = this.zzc.zzf();
                th = (Throwable) objectRef.element;
                if (th == null) {
                    th = e;
                }
                ((cp) bpVarZzf2).V(th);
                this.zzc.zze = zzao.zza;
                this.zzd.zzb(new zzbd(zzbb.zzb, zzba.zza, e.getMessage()));
            }
        }
        return Unit.a;
    }
}
