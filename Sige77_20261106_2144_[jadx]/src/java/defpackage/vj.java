package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.preference.PreferenceManager;
import android.util.Log;
import com.google.android.material.datepicker.l;
import java.io.ByteArrayInputStream;
import java.io.CharConversionException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class vj {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;

    public vj(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(jw.v(2130969411, context, l.class.getCanonicalName()).data, ue1.o);
        this.a = wf3.a(context, typedArrayObtainStyledAttributes.getResourceId(4, 0));
        this.g = wf3.a(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        this.b = wf3.a(context, typedArrayObtainStyledAttributes.getResourceId(3, 0));
        this.c = wf3.a(context, typedArrayObtainStyledAttributes.getResourceId(5, 0));
        ColorStateList colorStateListK = xi0.k(context, typedArrayObtainStyledAttributes, 7);
        this.d = wf3.a(context, typedArrayObtainStyledAttributes.getResourceId(9, 0));
        this.e = wf3.a(context, typedArrayObtainStyledAttributes.getResourceId(8, 0));
        this.f = wf3.a(context, typedArrayObtainStyledAttributes.getResourceId(10, 0));
        Paint paint = new Paint();
        this.h = paint;
        paint.setColor(colorStateListK.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }

    public static ri2 b(byte[] bArr) throws IOException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            go3 go3VarV = go3.v(byteArrayInputStream, wr2.b);
            byteArrayInputStream.close();
            go3 go3VarF = yd2.o(go3VarV).F();
            bs2 bs2Var = (bs2) go3VarF.d(5);
            if (!bs2Var.a.equals(go3VarF)) {
                if (!bs2Var.b.s()) {
                    bs2Var.g();
                }
                bs2.c(bs2Var.b, go3VarF);
            }
            return new ri2((fo3) bs2Var);
        } catch (Throwable th) {
            byteArrayInputStream.close();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0073 A[Catch: all -> 0x007a, TRY_ENTER, TryCatch #3 {all -> 0x007a, blocks: (B:14:0x002b, B:16:0x003b, B:18:0x0041, B:20:0x004a, B:32:0x0073, B:35:0x007d, B:37:0x0083, B:39:0x009a, B:41:0x00a2, B:43:0x00b7, B:45:0x00bd, B:49:0x00cc, B:56:0x00f2, B:66:0x011d, B:67:0x0122, B:52:0x00e2, B:54:0x00ea, B:55:0x00ed, B:48:0x00c5, B:57:0x00fa, B:58:0x00ff, B:42:0x00ad, B:59:0x0100, B:60:0x0105, B:61:0x0106, B:62:0x010d, B:64:0x0110, B:65:0x0117, B:23:0x0052, B:25:0x0057, B:26:0x0064, B:19:0x0046, B:27:0x0065), top: B:81:0x002b, outer: #0, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0083 A[Catch: all -> 0x007a, TryCatch #3 {all -> 0x007a, blocks: (B:14:0x002b, B:16:0x003b, B:18:0x0041, B:20:0x004a, B:32:0x0073, B:35:0x007d, B:37:0x0083, B:39:0x009a, B:41:0x00a2, B:43:0x00b7, B:45:0x00bd, B:49:0x00cc, B:56:0x00f2, B:66:0x011d, B:67:0x0122, B:52:0x00e2, B:54:0x00ea, B:55:0x00ed, B:48:0x00c5, B:57:0x00fa, B:58:0x00ff, B:42:0x00ad, B:59:0x0100, B:60:0x0105, B:61:0x0106, B:62:0x010d, B:64:0x0110, B:65:0x0117, B:23:0x0052, B:25:0x0057, B:26:0x0064, B:19:0x0046, B:27:0x0065), top: B:81:0x002b, outer: #0, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x009a A[Catch: all -> 0x007a, TryCatch #3 {all -> 0x007a, blocks: (B:14:0x002b, B:16:0x003b, B:18:0x0041, B:20:0x004a, B:32:0x0073, B:35:0x007d, B:37:0x0083, B:39:0x009a, B:41:0x00a2, B:43:0x00b7, B:45:0x00bd, B:49:0x00cc, B:56:0x00f2, B:66:0x011d, B:67:0x0122, B:52:0x00e2, B:54:0x00ea, B:55:0x00ed, B:48:0x00c5, B:57:0x00fa, B:58:0x00ff, B:42:0x00ad, B:59:0x0100, B:60:0x0105, B:61:0x0106, B:62:0x010d, B:64:0x0110, B:65:0x0117, B:23:0x0052, B:25:0x0057, B:26:0x0064, B:19:0x0046, B:27:0x0065), top: B:81:0x002b, outer: #0, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00a2 A[Catch: all -> 0x007a, TryCatch #3 {all -> 0x007a, blocks: (B:14:0x002b, B:16:0x003b, B:18:0x0041, B:20:0x004a, B:32:0x0073, B:35:0x007d, B:37:0x0083, B:39:0x009a, B:41:0x00a2, B:43:0x00b7, B:45:0x00bd, B:49:0x00cc, B:56:0x00f2, B:66:0x011d, B:67:0x0122, B:52:0x00e2, B:54:0x00ea, B:55:0x00ed, B:48:0x00c5, B:57:0x00fa, B:58:0x00ff, B:42:0x00ad, B:59:0x0100, B:60:0x0105, B:61:0x0106, B:62:0x010d, B:64:0x0110, B:65:0x0117, B:23:0x0052, B:25:0x0057, B:26:0x0064, B:19:0x0046, B:27:0x0065), top: B:81:0x002b, outer: #0, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00ad A[Catch: all -> 0x007a, TryCatch #3 {all -> 0x007a, blocks: (B:14:0x002b, B:16:0x003b, B:18:0x0041, B:20:0x004a, B:32:0x0073, B:35:0x007d, B:37:0x0083, B:39:0x009a, B:41:0x00a2, B:43:0x00b7, B:45:0x00bd, B:49:0x00cc, B:56:0x00f2, B:66:0x011d, B:67:0x0122, B:52:0x00e2, B:54:0x00ea, B:55:0x00ed, B:48:0x00c5, B:57:0x00fa, B:58:0x00ff, B:42:0x00ad, B:59:0x0100, B:60:0x0105, B:61:0x0106, B:62:0x010d, B:64:0x0110, B:65:0x0117, B:23:0x0052, B:25:0x0057, B:26:0x0064, B:19:0x0046, B:27:0x0065), top: B:81:0x002b, outer: #0, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00bd A[Catch: all -> 0x007a, IOException -> 0x00c3, TRY_ENTER, TryCatch #3 {all -> 0x007a, blocks: (B:14:0x002b, B:16:0x003b, B:18:0x0041, B:20:0x004a, B:32:0x0073, B:35:0x007d, B:37:0x0083, B:39:0x009a, B:41:0x00a2, B:43:0x00b7, B:45:0x00bd, B:49:0x00cc, B:56:0x00f2, B:66:0x011d, B:67:0x0122, B:52:0x00e2, B:54:0x00ea, B:55:0x00ed, B:48:0x00c5, B:57:0x00fa, B:58:0x00ff, B:42:0x00ad, B:59:0x0100, B:60:0x0105, B:61:0x0106, B:62:0x010d, B:64:0x0110, B:65:0x0117, B:23:0x0052, B:25:0x0057, B:26:0x0064, B:19:0x0046, B:27:0x0065), top: B:81:0x002b, outer: #0, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00c5 A[Catch: all -> 0x007a, IOException -> 0x00c3, TRY_LEAVE, TryCatch #3 {all -> 0x007a, blocks: (B:14:0x002b, B:16:0x003b, B:18:0x0041, B:20:0x004a, B:32:0x0073, B:35:0x007d, B:37:0x0083, B:39:0x009a, B:41:0x00a2, B:43:0x00b7, B:45:0x00bd, B:49:0x00cc, B:56:0x00f2, B:66:0x011d, B:67:0x0122, B:52:0x00e2, B:54:0x00ea, B:55:0x00ed, B:48:0x00c5, B:57:0x00fa, B:58:0x00ff, B:42:0x00ad, B:59:0x0100, B:60:0x0105, B:61:0x0106, B:62:0x010d, B:64:0x0110, B:65:0x0117, B:23:0x0052, B:25:0x0057, B:26:0x0064, B:19:0x0046, B:27:0x0065), top: B:81:0x002b, outer: #0, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e2 A[Catch: all -> 0x007a, TryCatch #3 {all -> 0x007a, blocks: (B:14:0x002b, B:16:0x003b, B:18:0x0041, B:20:0x004a, B:32:0x0073, B:35:0x007d, B:37:0x0083, B:39:0x009a, B:41:0x00a2, B:43:0x00b7, B:45:0x00bd, B:49:0x00cc, B:56:0x00f2, B:66:0x011d, B:67:0x0122, B:52:0x00e2, B:54:0x00ea, B:55:0x00ed, B:48:0x00c5, B:57:0x00fa, B:58:0x00ff, B:42:0x00ad, B:59:0x0100, B:60:0x0105, B:61:0x0106, B:62:0x010d, B:64:0x0110, B:65:0x0117, B:23:0x0052, B:25:0x0057, B:26:0x0064, B:19:0x0046, B:27:0x0065), top: B:81:0x002b, outer: #0, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00ea A[Catch: all -> 0x007a, TryCatch #3 {all -> 0x007a, blocks: (B:14:0x002b, B:16:0x003b, B:18:0x0041, B:20:0x004a, B:32:0x0073, B:35:0x007d, B:37:0x0083, B:39:0x009a, B:41:0x00a2, B:43:0x00b7, B:45:0x00bd, B:49:0x00cc, B:56:0x00f2, B:66:0x011d, B:67:0x0122, B:52:0x00e2, B:54:0x00ea, B:55:0x00ed, B:48:0x00c5, B:57:0x00fa, B:58:0x00ff, B:42:0x00ad, B:59:0x0100, B:60:0x0105, B:61:0x0106, B:62:0x010d, B:64:0x0110, B:65:0x0117, B:23:0x0052, B:25:0x0057, B:26:0x0064, B:19:0x0046, B:27:0x0065), top: B:81:0x002b, outer: #0, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0100 A[Catch: all -> 0x007a, TryCatch #3 {all -> 0x007a, blocks: (B:14:0x002b, B:16:0x003b, B:18:0x0041, B:20:0x004a, B:32:0x0073, B:35:0x007d, B:37:0x0083, B:39:0x009a, B:41:0x00a2, B:43:0x00b7, B:45:0x00bd, B:49:0x00cc, B:56:0x00f2, B:66:0x011d, B:67:0x0122, B:52:0x00e2, B:54:0x00ea, B:55:0x00ed, B:48:0x00c5, B:57:0x00fa, B:58:0x00ff, B:42:0x00ad, B:59:0x0100, B:60:0x0105, B:61:0x0106, B:62:0x010d, B:64:0x0110, B:65:0x0117, B:23:0x0052, B:25:0x0057, B:26:0x0064, B:19:0x0046, B:27:0x0065), top: B:81:0x002b, outer: #0, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0106 A[Catch: all -> 0x007a, TryCatch #3 {all -> 0x007a, blocks: (B:14:0x002b, B:16:0x003b, B:18:0x0041, B:20:0x004a, B:32:0x0073, B:35:0x007d, B:37:0x0083, B:39:0x009a, B:41:0x00a2, B:43:0x00b7, B:45:0x00bd, B:49:0x00cc, B:56:0x00f2, B:66:0x011d, B:67:0x0122, B:52:0x00e2, B:54:0x00ea, B:55:0x00ed, B:48:0x00c5, B:57:0x00fa, B:58:0x00ff, B:42:0x00ad, B:59:0x0100, B:60:0x0105, B:61:0x0106, B:62:0x010d, B:64:0x0110, B:65:0x0117, B:23:0x0052, B:25:0x0057, B:26:0x0064, B:19:0x0046, B:27:0x0065), top: B:81:0x002b, outer: #0, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x010e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x0110 A[Catch: all -> 0x007a, TryCatch #3 {all -> 0x007a, blocks: (B:14:0x002b, B:16:0x003b, B:18:0x0041, B:20:0x004a, B:32:0x0073, B:35:0x007d, B:37:0x0083, B:39:0x009a, B:41:0x00a2, B:43:0x00b7, B:45:0x00bd, B:49:0x00cc, B:56:0x00f2, B:66:0x011d, B:67:0x0122, B:52:0x00e2, B:54:0x00ea, B:55:0x00ed, B:48:0x00c5, B:57:0x00fa, B:58:0x00ff, B:42:0x00ad, B:59:0x0100, B:60:0x0105, B:61:0x0106, B:62:0x010d, B:64:0x0110, B:65:0x0117, B:23:0x0052, B:25:0x0057, B:26:0x0064, B:19:0x0046, B:27:0x0065), top: B:81:0x002b, outer: #0, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0117 A[Catch: all -> 0x007a, TryCatch #3 {all -> 0x007a, blocks: (B:14:0x002b, B:16:0x003b, B:18:0x0041, B:20:0x004a, B:32:0x0073, B:35:0x007d, B:37:0x0083, B:39:0x009a, B:41:0x00a2, B:43:0x00b7, B:45:0x00bd, B:49:0x00cc, B:56:0x00f2, B:66:0x011d, B:67:0x0122, B:52:0x00e2, B:54:0x00ea, B:55:0x00ed, B:48:0x00c5, B:57:0x00fa, B:58:0x00ff, B:42:0x00ad, B:59:0x0100, B:60:0x0105, B:61:0x0106, B:62:0x010d, B:64:0x0110, B:65:0x0117, B:23:0x0052, B:25:0x0057, B:26:0x0064, B:19:0x0046, B:27:0x0065), top: B:81:0x002b, outer: #0, inners: #1, #2 }] */
    public synchronized ox1 a() {
        byte[] bArrP0;
        String str;
        ox1 ox1Var;
        kj0 kj0Var;
        yd2 yd2VarM;
        dc2 dc2Var;
        Context context;
        String str2;
        String str3;
        Context applicationContext;
        cc3 cc3Var;
        go3 go3VarF;
        bs2 bs2Var;
        try {
            if (((String) this.b) == null) {
                throw new IllegalArgumentException("keysetName cannot be null");
            }
            xn3 xn3Var = (xn3) this.g;
            if (xn3Var != null && ((kj0) this.f) == null) {
                this.f = new kj0(sp0.J(xn3Var.c()), 27);
            }
            synchronized (ox1.c) {
                try {
                    Context context2 = (Context) this.a;
                    String str4 = (String) this.b;
                    String str5 = (String) this.c;
                    if (str4 != null) {
                        Context applicationContext2 = context2.getApplicationContext();
                        try {
                            String string = (str5 == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext2) : applicationContext2.getSharedPreferences(str5, 0)).getString(str4, null);
                            if (string != null) {
                                bArrP0 = r93.p0(string);
                            }
                            str = (String) this.d;
                            if (bArrP0 == null) {
                                if (str != null) {
                                    this.e = d();
                                }
                                kj0Var = (kj0) this.f;
                                if (kj0Var != null) {
                                    throw new GeneralSecurityException("cannot read or generate keyset");
                                }
                                yd2VarM = yd2.m(kj0Var);
                                context = (Context) this.a;
                                str2 = (String) this.b;
                                str3 = (String) this.c;
                                dc2Var = new dc2();
                                if (str2 != null) {
                                    e.g("keysetName cannot be null");
                                    throw null;
                                }
                                dc2Var.b = str2;
                                applicationContext = context.getApplicationContext();
                                if (str3 == null) {
                                    dc2Var.a = PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
                                } else {
                                    dc2Var.a = applicationContext.getSharedPreferences(str3, 0).edit();
                                }
                                cc3Var = (cc3) this.e;
                                try {
                                    if (cc3Var != null) {
                                        yd2VarM.t(dc2Var, cc3Var, new byte[0]);
                                    } else {
                                        dc2Var.M(yd2VarM.F());
                                    }
                                    go3VarF = yd2VarM.F();
                                    bs2Var = (bs2) go3VarF.d(5);
                                    if (!bs2Var.a.equals(go3VarF)) {
                                        if (!bs2Var.b.s()) {
                                            bs2Var.g();
                                        }
                                        bs2.c(bs2Var.b, go3VarF);
                                    }
                                    this.h = new ri2((fo3) bs2Var);
                                } catch (IOException e) {
                                    throw new GeneralSecurityException(e);
                                }
                            } else if (str != null) {
                                this.h = c(bArrP0);
                            } else {
                                this.h = b(bArrP0);
                            }
                            ox1Var = new ox1(this);
                        } catch (ClassCastException | IllegalArgumentException unused) {
                            throw new CharConversionException(ts.k("can't read keyset; the pref value ", str4, " is not a valid hex string"));
                        }
                    } else {
                        e.g("keysetName cannot be null");
                    }
                    bArrP0 = null;
                    str = (String) this.d;
                    if (bArrP0 == null) {
                        if (str != null) {
                            this.e = d();
                        }
                        kj0Var = (kj0) this.f;
                        if (kj0Var != null) {
                            throw new GeneralSecurityException("cannot read or generate keyset");
                        }
                        yd2VarM = yd2.m(kj0Var);
                        context = (Context) this.a;
                        str2 = (String) this.b;
                        str3 = (String) this.c;
                        dc2Var = new dc2();
                        if (str2 != null) {
                            e.g("keysetName cannot be null");
                            throw null;
                        }
                        dc2Var.b = str2;
                        applicationContext = context.getApplicationContext();
                        if (str3 == null) {
                            dc2Var.a = PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
                        } else {
                            dc2Var.a = applicationContext.getSharedPreferences(str3, 0).edit();
                        }
                        cc3Var = (cc3) this.e;
                        if (cc3Var != null) {
                            yd2VarM.t(dc2Var, cc3Var, new byte[0]);
                        } else {
                            dc2Var.M(yd2VarM.F());
                        }
                        go3VarF = yd2VarM.F();
                        bs2Var = (bs2) go3VarF.d(5);
                        if (!bs2Var.a.equals(go3VarF)) {
                            if (!bs2Var.b.s()) {
                                bs2Var.g();
                            }
                            bs2.c(bs2Var.b, go3VarF);
                        }
                        this.h = new ri2((fo3) bs2Var);
                    } else if (str != null) {
                        this.h = c(bArrP0);
                    } else {
                        this.h = b(bArrP0);
                    }
                    ox1Var = new ox1(this);
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return ox1Var;
    }

    public ri2 c(byte[] bArr) {
        try {
            this.e = d42.H((String) this.d);
            try {
                go3 go3VarF = yd2.n(new pv2(new ByteArrayInputStream(bArr)), (cc3) this.e, new byte[0]).F();
                bs2 bs2Var = (bs2) go3VarF.d(5);
                if (!bs2Var.a.equals(go3VarF)) {
                    if (!bs2Var.b.s()) {
                        bs2Var.g();
                    }
                    bs2.c(bs2Var.b, go3VarF);
                }
                return new ri2((fo3) bs2Var);
            } catch (IOException | GeneralSecurityException e) {
                try {
                    return b(bArr);
                } catch (IOException unused) {
                    throw e;
                }
            }
        } catch (GeneralSecurityException | ProviderException e2) {
            try {
                ri2 ri2VarB = b(bArr);
                Object obj = ox1.c;
                Log.w("ox1", "cannot use Android Keystore, it'll be disabled", e2);
                return ri2VarB;
            } catch (IOException unused2) {
                throw e2;
            }
        }
    }

    public cc3 d() throws KeyStoreException {
        Object obj = ox1.c;
        try {
            boolean zM = d42.M((String) this.d);
            try {
                return d42.H((String) this.d);
            } catch (GeneralSecurityException | ProviderException e) {
                if (!zM) {
                    throw new KeyStoreException(ts.k("the master key ", (String) this.d, " exists but is unusable"), e);
                }
                Object obj2 = ox1.c;
                Log.w("ox1", "cannot use Android Keystore, it'll be disabled", e);
                return null;
            }
        } catch (GeneralSecurityException | ProviderException e2) {
            Object obj3 = ox1.c;
            Log.w("ox1", "cannot use Android Keystore, it'll be disabled", e2);
            return null;
        }
    }

    public vj() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
    }
}
