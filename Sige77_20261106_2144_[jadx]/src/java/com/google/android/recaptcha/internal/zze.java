package com.google.android.recaptcha.internal;

import defpackage.fs;
import kotlin.Unit;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class zze {
    private boolean zza;

    public zzen zza(String str) {
        throw null;
    }

    public zzen zzb() {
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c1, code lost:
    
        if (r14 == r7) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzc(java.lang.String r11, long r12, defpackage.fs r14) throws com.google.android.recaptcha.internal.zzbd {
        /*
            r10 = this;
            boolean r0 = r14 instanceof com.google.android.recaptcha.internal.zza
            if (r0 == 0) goto L14
            r0 = r14
            com.google.android.recaptcha.internal.zza r0 = (com.google.android.recaptcha.internal.zza) r0
            int r1 = r0.zze
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.zze = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            com.google.android.recaptcha.internal.zza r0 = new com.google.android.recaptcha.internal.zza
            r0.<init>(r10, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r6.zzc
            ft r7 = defpackage.ft.a
            int r0 = r6.zze
            r8 = 3
            r1 = 2
            r2 = 1
            r9 = 0
            if (r0 == 0) goto L5a
            if (r0 == r2) goto L42
            if (r0 == r1) goto L37
            if (r0 != r8) goto L31
            defpackage.zi0.B(r14)
            goto Lc4
        L31:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.uq1.q(r10)
            return r9
        L37:
            java.lang.String r10 = r6.zzf
            java.lang.Object r11 = r6.zza
            com.google.android.recaptcha.internal.zze r11 = (com.google.android.recaptcha.internal.zze) r11
            defpackage.zi0.B(r14)
            goto Lb5
        L42:
            long r12 = r6.zzb
            com.google.android.recaptcha.internal.zzen r10 = r6.zzg
            java.lang.String r11 = r6.zzf
            java.lang.Object r0 = r6.zza
            r2 = r0
            com.google.android.recaptcha.internal.zze r2 = (com.google.android.recaptcha.internal.zze) r2
            defpackage.zi0.B(r14)     // Catch: java.lang.Exception -> L51
            goto L79
        L51:
            r0 = move-exception
            r14 = r0
            r3 = r2
            r2 = r11
            r11 = r1
            r1 = r3
            r3 = r12
            r5 = r14
            goto L8f
        L5a:
            defpackage.zi0.B(r14)
            com.google.android.recaptcha.internal.zzen r14 = r10.zza(r11)
            com.google.android.recaptcha.internal.zzb r0 = new com.google.android.recaptcha.internal.zzb     // Catch: java.lang.Exception -> L88
            r0.<init>(r10, r11, r9)     // Catch: java.lang.Exception -> L88
            r6.zza = r10     // Catch: java.lang.Exception -> L88
            r6.zzf = r11     // Catch: java.lang.Exception -> L88
            r6.zzg = r14     // Catch: java.lang.Exception -> L88
            r6.zzb = r12     // Catch: java.lang.Exception -> L88
            r6.zze = r2     // Catch: java.lang.Exception -> L88
            java.lang.Object r0 = defpackage.yx1.a(r12, r0, r6)     // Catch: java.lang.Exception -> L88
            if (r0 == r7) goto Lc7
            r2 = r10
            r10 = r14
            r14 = r0
        L79:
            rj1 r14 = (defpackage.rj1) r14     // Catch: java.lang.Exception -> L51
            java.lang.Object r14 = r14.a     // Catch: java.lang.Exception -> L51
            defpackage.zi0.B(r14)     // Catch: java.lang.Exception -> L51
            com.google.android.recaptcha.internal.zzsi r14 = (com.google.android.recaptcha.internal.zzsi) r14     // Catch: java.lang.Exception -> L51
            if (r10 == 0) goto L87
            r10.zza()     // Catch: java.lang.Exception -> L51
        L87:
            return r14
        L88:
            r0 = move-exception
            r2 = r11
            r3 = r12
            r5 = r0
            r11 = r1
            r1 = r10
            r10 = r14
        L8f:
            com.google.android.recaptcha.internal.zzbd r12 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r13 = com.google.android.recaptcha.internal.zzbb.zzb
            com.google.android.recaptcha.internal.zzba r14 = com.google.android.recaptcha.internal.zzba.zzaa
            java.lang.String r0 = r5.getMessage()
            r12.<init>(r13, r14, r0)
            com.google.android.recaptcha.internal.zzbd r12 = com.google.android.recaptcha.internal.zzf.zza(r5, r12)
            if (r10 == 0) goto La5
            r10.zzb(r12)
        La5:
            r6.zza = r1
            r6.zzf = r2
            r6.zzg = r9
            r6.zze = r11
            java.lang.Object r10 = r1.zzi(r2, r3, r5, r6)
            if (r10 == r7) goto Lc7
            r11 = r1
            r10 = r2
        Lb5:
            pj1 r12 = defpackage.rj1.b
            r6.zza = r9
            r6.zzf = r9
            r6.zze = r8
            java.lang.Object r14 = r11.zzd(r10, r6)
            if (r14 != r7) goto Lc4
            goto Lc7
        Lc4:
            pj1 r10 = defpackage.rj1.b
            return r14
        Lc7:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zze.zzc(java.lang.String, long, fs):java.lang.Object");
    }

    public abstract Object zzd(String str, fs fsVar);

    /* JADX WARN: Code duplicated, block: B:37:0x009e  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0078, code lost:
    
        if (r9 != r1) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zze(long r9, com.google.android.recaptcha.internal.zzsc r11, defpackage.fs r12) throws com.google.android.recaptcha.internal.zzbd {
        /*
            r8 = this;
            boolean r0 = r12 instanceof com.google.android.recaptcha.internal.zzc
            if (r0 == 0) goto L13
            r0 = r12
            com.google.android.recaptcha.internal.zzc r0 = (com.google.android.recaptcha.internal.zzc) r0
            int r1 = r0.zzd
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzd = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzc r0 = new com.google.android.recaptcha.internal.zzc
            r0.<init>(r8, r12)
        L18:
            java.lang.Object r12 = r0.zzb
            ft r1 = defpackage.ft.a
            int r2 = r0.zzd
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L56
            if (r2 == r6) goto L44
            if (r2 == r5) goto L39
            if (r2 != r4) goto L33
            java.lang.Object r8 = r0.zza
            com.google.android.recaptcha.internal.zzbd r8 = (com.google.android.recaptcha.internal.zzbd) r8
            defpackage.zi0.B(r12)
            goto Lb7
        L33:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.uq1.q(r8)
            return r3
        L39:
            com.google.android.recaptcha.internal.zzen r8 = r0.zze
            java.lang.Object r9 = r0.zza
            com.google.android.recaptcha.internal.zze r9 = (com.google.android.recaptcha.internal.zze) r9
            defpackage.zi0.B(r12)
            goto La2
        L44:
            com.google.android.recaptcha.internal.zzen r8 = r0.zze
            java.lang.Object r9 = r0.zza
            com.google.android.recaptcha.internal.zze r9 = (com.google.android.recaptcha.internal.zze) r9
            defpackage.zi0.B(r12)     // Catch: java.lang.Exception -> L52
            r7 = r12
            r12 = r8
            r8 = r9
            r9 = r7
            goto L7a
        L52:
            r10 = move-exception
            r12 = r8
            r8 = r9
            goto L8f
        L56:
            defpackage.zi0.B(r12)
            com.google.android.recaptcha.internal.zzen r12 = r8.zzb()
            boolean r2 = r8.zza
            if (r2 == 0) goto L69
            r12.zza()
            pj1 r8 = defpackage.rj1.b
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        L69:
            com.google.android.recaptcha.internal.zzd r2 = new com.google.android.recaptcha.internal.zzd     // Catch: java.lang.Exception -> L8b
            r2.<init>(r8, r11, r3)     // Catch: java.lang.Exception -> L8b
            r0.zza = r8     // Catch: java.lang.Exception -> L8b
            r0.zze = r12     // Catch: java.lang.Exception -> L8b
            r0.zzd = r6     // Catch: java.lang.Exception -> L8b
            java.lang.Object r9 = defpackage.yx1.a(r9, r2, r0)     // Catch: java.lang.Exception -> L8b
            if (r9 == r1) goto Lbe
        L7a:
            rj1 r9 = (defpackage.rj1) r9     // Catch: java.lang.Exception -> L8b
            java.lang.Object r9 = r9.a     // Catch: java.lang.Exception -> L8b
            defpackage.zi0.B(r9)     // Catch: java.lang.Exception -> L8b
            kotlin.Unit r9 = kotlin.Unit.a     // Catch: java.lang.Exception -> L8b
            r8.zza = r6     // Catch: java.lang.Exception -> L8b
            if (r12 == 0) goto L8e
            r12.zza()     // Catch: java.lang.Exception -> L8b
            return r9
        L8b:
            r9 = move-exception
            r10 = r9
            goto L8f
        L8e:
            return r9
        L8f:
            r9 = 0
            r8.zza = r9
            r0.zza = r8
            r0.zze = r12
            r0.zzd = r5
            java.lang.Object r9 = r8.zzj(r10, r0)
            if (r9 == r1) goto Lbe
            r7 = r9
            r9 = r8
            r8 = r12
            r12 = r7
        La2:
            r10 = r12
            com.google.android.recaptcha.internal.zzbd r10 = (com.google.android.recaptcha.internal.zzbd) r10
            if (r8 == 0) goto Laa
            r8.zzb(r10)
        Laa:
            r0.zza = r10
            r0.zze = r3
            r0.zzd = r4
            java.lang.Object r8 = r9.zzg(r10, r0)
            if (r8 == r1) goto Lbe
            r8 = r10
        Lb7:
            pj1 r9 = defpackage.rj1.b
            qj1 r8 = defpackage.zi0.i(r8)
            return r8
        Lbe:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zze.zze(long, com.google.android.recaptcha.internal.zzsc, fs):java.lang.Object");
    }

    public abstract Object zzf(String str, fs fsVar) throws zzbd;

    public Object zzg(zzbd zzbdVar, fs fsVar) {
        return Unit.a;
    }

    public abstract Object zzh(zzsc zzscVar, fs fsVar) throws zzbd;

    public Object zzi(String str, long j, Exception exc, fs fsVar) {
        return Unit.a;
    }

    public Object zzj(Exception exc, fs fsVar) {
        return zzf.zza(exc, new zzbd(zzbb.zzb, zzba.zzap, exc.getMessage()));
    }

    public void zzk(zzsr zzsrVar) {
    }

    public final boolean zzl() {
        return this.zza;
    }
}
