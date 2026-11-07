package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.internal.zzmx;
import com.google.android.recaptcha.internal.zznd;
import defpackage.e;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class zzmx<MessageType extends zznd<MessageType, BuilderType>, BuilderType extends zzmx<MessageType, BuilderType>> extends zzkn<MessageType, BuilderType> {
    protected zznd zza;
    private final zznd zzb;

    public zzmx(MessageType messagetype) {
        this.zzb = messagetype;
        if (messagetype.zzL()) {
            e.g("Default instance must be immutable.");
            throw null;
        }
        this.zza = messagetype.zzv();
    }

    private static void zze(Object obj, Object obj2) {
        zzos.zza().zzb(obj.getClass()).zzg(obj, obj2);
    }

    @Override // com.google.android.recaptcha.internal.zzkn
    public final /* synthetic */ zzkn zzb(zzko zzkoVar) {
        zzh((zznd) zzkoVar);
        return this;
    }

    @Override // com.google.android.recaptcha.internal.zzkn
    /* JADX INFO: renamed from: zzg, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final zzmx zza() {
        zzmx zzmxVar = (zzmx) this.zzb.zzh(5, null, null);
        zzmxVar.zza = zzl();
        return zzmxVar;
    }

    public final zzmx zzh(zznd zzndVar) {
        if (!this.zzb.equals(zzndVar)) {
            if (!this.zza.zzL()) {
                zzo();
            }
            zze(this.zza, zzndVar);
        }
        return this;
    }

    @Override // com.google.android.recaptcha.internal.zzoh
    /* JADX INFO: renamed from: zzi, reason: merged with bridge method [inline-methods] */
    public final MessageType zzk() {
        MessageType messagetype = (MessageType) zzl();
        if (zznd.zzK(messagetype, true)) {
            return messagetype;
        }
        throw new zzpk(messagetype);
    }

    @Override // com.google.android.recaptcha.internal.zzoh
    /* JADX INFO: renamed from: zzj, reason: merged with bridge method [inline-methods] */
    public MessageType zzl() {
        boolean zZzL = this.zza.zzL();
        MessageType messagetype = (MessageType) this.zza;
        if (!zZzL) {
            return messagetype;
        }
        messagetype.zzG();
        return (MessageType) this.zza;
    }

    @Override // com.google.android.recaptcha.internal.zzoj
    public final /* synthetic */ zzoi zzm() {
        return this.zzb;
    }

    public final void zzn() {
        if (this.zza.zzL()) {
            return;
        }
        zzo();
    }

    public void zzo() {
        zznd zzndVarZzv = this.zzb.zzv();
        zze(zzndVarZzv, this.zza);
        this.zza = zzndVarZzv;
    }

    @Override // com.google.android.recaptcha.internal.zzoj
    public final boolean zzp() {
        return zznd.zzK(this.zza, false);
    }
}
