package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class bk0 implements ij0 {
    public static bk0 c;
    public Object a;
    public volatile Object b;

    public /* synthetic */ bk0(Object obj) {
        this.a = obj;
    }

    public static bk0 b(Context context) {
        gu2.o(context);
        synchronized (bk0.class) {
            if (c == null) {
                zx2 zx2Var = nd3.a;
                synchronized (nd3.class) {
                    if (nd3.e == null) {
                        nd3.e = context.getApplicationContext();
                    } else {
                        Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
                    }
                }
                bk0 bk0Var = new bk0();
                bk0Var.a = context.getApplicationContext();
                c = bk0Var;
            }
        }
        return c;
    }

    public static final boolean e(PackageInfo packageInfo, boolean z) {
        br2 br2Var;
        int i;
        if (packageInfo != null) {
            if (z && ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName))) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                z = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
            }
            try {
                br2 br2Var2 = z ? xb3.c : xb3.b;
                int i2 = Build.VERSION.SDK_INT;
                if (i2 < 28) {
                    Signature[] signatureArr = packageInfo.signatures;
                    byte[] byteArray = null;
                    if (signatureArr != null && signatureArr.length == 1) {
                        byteArray = signatureArr[0].toByteArray();
                    }
                    if (byteArray != null) {
                        km2 km2Var = cp2.e;
                        Object[] objArr = {byteArray};
                        nj2.Z(1, objArr);
                        br2Var = new br2(1, objArr);
                    } else {
                        km2 km2Var2 = cp2.e;
                        br2Var = br2.v;
                    }
                } else {
                    if (i2 < 28) {
                        throw new IllegalStateException();
                    }
                    SigningInfo signingInfo = packageInfo.signingInfo;
                    if (signingInfo == null || signingInfo.hasMultipleSigners() || signingInfo.getSigningCertificateHistory() == null) {
                        km2 km2Var3 = cp2.e;
                        br2Var = br2.v;
                    } else {
                        km2 km2Var4 = cp2.e;
                        Object[] objArrCopyOf = new Object[4];
                        Signature[] signingCertificateHistory = signingInfo.getSigningCertificateHistory();
                        int length = signingCertificateHistory.length;
                        int i3 = 0;
                        int i4 = 0;
                        while (i3 < length) {
                            byte[] byteArray2 = signingCertificateHistory[i3].toByteArray();
                            byteArray2.getClass();
                            int length2 = objArrCopyOf.length;
                            int i5 = i4 + 1;
                            if (i5 < 0) {
                                throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
                            }
                            if (i5 <= length2) {
                                i = length2;
                            } else {
                                i = (length2 >> 1) + length2 + 1;
                                if (i < i5) {
                                    int iHighestOneBit = Integer.highestOneBit(i4);
                                    i = iHighestOneBit + iHighestOneBit;
                                }
                                if (i < 0) {
                                    i = Integer.MAX_VALUE;
                                }
                            }
                            if (i > length2) {
                                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i);
                            }
                            objArrCopyOf[i4] = byteArray2;
                            i3++;
                            i4 = i5;
                        }
                        br2Var = i4 == 0 ? br2.v : new br2(i4, objArrCopyOf);
                    }
                }
                if (br2Var.isEmpty()) {
                    throw new IllegalArgumentException("Unable to obtain package certificate history.");
                }
                cp2 cp2VarK = br2Var.k();
                int size = cp2VarK.size();
                int i6 = 0;
                while (i6 < size) {
                    byte[] bArr = (byte[]) cp2VarK.get(i6);
                    km2 km2VarM = br2Var2.listIterator(0);
                    do {
                        int i7 = i6 + 1;
                        if (!km2VarM.hasNext()) {
                            i6 = i7;
                        }
                    } while (!Arrays.equals(bArr, (byte[]) km2VarM.next()));
                    return true;
                }
            } catch (IllegalArgumentException unused) {
                Log.i("GoogleSignatureVerifier", "package info is not set correctly");
                if ((z ? f(packageInfo, xb3.a) : f(packageInfo, xb3.a[0])) == null) {
                    return false;
                }
            }
        }
        return false;
    }

    public static b73 f(PackageInfo packageInfo, b73... b73VarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            b83 b83Var = new b83(packageInfo.signatures[0].toByteArray());
            for (int i = 0; i < b73VarArr.length; i++) {
                if (b73VarArr[i].equals(b83Var)) {
                    return b73VarArr[i];
                }
            }
        }
        return null;
    }

    public w10 a() {
        if (((w10) this.b) == null) {
            synchronized (this) {
                try {
                    if (((w10) this.b) == null) {
                        File cacheDir = ((gr0) ((pv2) this.a).a).a.getCacheDir();
                        e20 e20Var = null;
                        File file = cacheDir == null ? null : new File(cacheDir, "image_manager_disk_cache");
                        if (file != null && (file.isDirectory() || file.mkdirs())) {
                            e20Var = new e20();
                            e20Var.d = new hs1(3);
                            e20Var.c = file;
                            e20Var.a = 262144000L;
                            e20Var.b = new f91(7);
                        }
                        this.b = e20Var;
                    }
                    if (((w10) this.b) == null) {
                        this.b = new op0(5);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return (w10) this.b;
    }

    /* JADX WARN: Failed to calculate best type for var: r9v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v2 ??, new type: int
    	at uv1.l(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:80)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:29)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:22)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.k(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at pw0.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:29)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:32)
    Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.instructions.args.ArgType jadx.core.dex.instructions.args.Typed.getType()' on a null object reference
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:27)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.u(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at ho3.update(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:53)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:39)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	... 8 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v2 ??, new type: int
    	at uv1.l(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:80)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.a(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at zn3.accept(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:12)
    	at java.util.ArrayList.forEach(ArrayList.java:1621)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:20)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:14)
    Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.instructions.args.ArgType jadx.core.dex.instructions.args.Typed.getType()' on a null object reference
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:27)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.u(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at ho3.update(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:53)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:39)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	... 9 more
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v2 ??, new type: int
        	at uv1.l(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:80)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:31)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:32)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:22)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.k(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
        	at pw0.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:29)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:32)
        Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.instructions.args.ArgType jadx.core.dex.instructions.args.Typed.getType()' on a null object reference
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:27)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.u(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
        	at ho3.update(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:53)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:39)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
        	... 7 more
        */
    public boolean c(int r21) {
        /*
            Method dump skipped, instruction units count: 495
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bk0.c(int):boolean");
    }

    public hf3 d(final y93 y93Var) {
        final he3 he3Var = (he3) this.b;
        he3 he3Var2 = hf3.j;
        if (he3Var != he3Var2) {
            m83 m83Var = hf3.i;
            m83Var.getClass();
            final bc3 bc3Var = new bc3();
            int i = 0;
            bc3Var.a = false;
            je3 je3Var = (je3) ((ConcurrentHashMap) m83Var.a).computeIfAbsent(he3Var.a(y93Var.b), new Function() { // from class: af3
                @Override // java.util.function.Function
                public final /* synthetic */ Object apply(Object obj) {
                    je3 je3Var2 = new je3(new hf3(y93Var, he3Var));
                    bc3Var.a = true;
                    return je3Var2;
                }
            });
            if (bc3Var.a) {
                Context context = y93Var.b;
                u93 u93Var = new u93(m83Var, 1);
                if (lg3.b == null) {
                    synchronized (lg3.class) {
                        try {
                            if (lg3.b == null) {
                                if (!Objects.equals(context.getPackageName(), "com.google.android.gms")) {
                                    if (Build.VERSION.SDK_INT >= 33) {
                                        context.registerReceiver(new lg3(i), new IntentFilter("com.google.android.gms.phenotype.UPDATE"), 2);
                                    } else {
                                        context.registerReceiver(new lg3(i), new IntentFilter("com.google.android.gms.phenotype.UPDATE"));
                                    }
                                }
                                lg3.b = u93Var;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
            this.a = je3Var.a;
            this.b = he3Var2;
        }
        return (hf3) this.a;
    }

    @Override // defpackage.ij0
    public Object get() {
        if (this.b == null) {
            synchronized (this) {
                try {
                    if (this.b == null) {
                        Object obj = ((ij0) this.a).get();
                        am2.p(obj, "Argument must not be null");
                        this.b = obj;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.b;
    }
}
