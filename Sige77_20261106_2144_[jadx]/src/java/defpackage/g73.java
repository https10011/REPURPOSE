package defpackage;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzaf;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzao;
import com.google.android.gms.measurement.internal.zzbh;
import com.google.android.gms.measurement.internal.zzoo;
import com.google.android.gms.measurement.internal.zzpl;
import com.google.android.gms.measurement.internal.zzr;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class g73 extends dv2 implements n13 {
    public final if3 a;
    public Boolean b;
    public String c;

    public g73(if3 if3Var) {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
        gu2.o(if3Var);
        this.a = if3Var;
        this.c = null;
    }

    @Override // defpackage.n13
    public final void A(zzr zzrVar) {
        gu2.l(zzrVar.a);
        gu2.o(zzrVar.f0);
        d(new d63(this, zzrVar, 4));
    }

    @Override // defpackage.n13
    public final void B(zzr zzrVar) {
        e(zzrVar);
        E(new d63(this, zzrVar, 2));
    }

    @Override // defpackage.n13
    public final void C(zzr zzrVar) {
        gu2.l(zzrVar.a);
        gu2.o(zzrVar.f0);
        d(new d63(this, zzrVar, 5));
    }

    public final void D(String str, boolean z) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        if3 if3Var = this.a;
        if (zIsEmpty) {
            if3Var.d().f.a("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z) {
            try {
                if (this.b == null) {
                    boolean z2 = true;
                    if (!"com.google.android.gms".equals(this.c) && !gu2.y(if3Var.Y.a, Binder.getCallingUid()) && !bk0.b(if3Var.Y.a).c(Binder.getCallingUid())) {
                        z2 = false;
                    }
                    this.b = Boolean.valueOf(z2);
                }
                if (this.b.booleanValue()) {
                    return;
                }
            } catch (SecurityException e) {
                if3Var.d().f.b(c33.M(str), "Measurement Service called with invalid calling package. appId");
                throw e;
            }
        }
        if (this.c == null) {
            Context context = if3Var.Y.a;
            int callingUid = Binder.getCallingUid();
            int i = xj0.e;
            if (gu2.N(callingUid, context, str)) {
                this.c = str;
            }
        }
        if (str.equals(this.c)) {
            return;
        }
        throw new SecurityException("Unknown calling package name '" + str + "'.");
    }

    public final void E(Runnable runnable) {
        if3 if3Var = this.a;
        if (if3Var.e().K()) {
            runnable.run();
        } else {
            if3Var.e().N(runnable);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dv2
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        List list;
        if3 if3Var = this.a;
        ArrayList arrayList = null;
        v13 q13Var = null;
        c23 y13Var = null;
        boolean z = false;
        int i2 = 1;
        switch (i) {
            case 1:
                zzbh zzbhVar = (zzbh) fv2.a(parcel, zzbh.CREATOR);
                zzr zzrVar = (zzr) fv2.a(parcel, zzr.CREATOR);
                fv2.d(parcel);
                w(zzbhVar, zzrVar);
                parcel2.writeNoException();
                return true;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                zzpl zzplVar = (zzpl) fv2.a(parcel, zzpl.CREATOR);
                zzr zzrVar2 = (zzr) fv2.a(parcel, zzr.CREATOR);
                fv2.d(parcel);
                g(zzplVar, zzrVar2);
                parcel2.writeNoException();
                return true;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
            case oc1.BYTES_FIELD_NUMBER /* 8 */:
            case 22:
            case 23:
            case 28:
            default:
                return false;
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                zzr zzrVar3 = (zzr) fv2.a(parcel, zzr.CREATOR);
                fv2.d(parcel);
                n(zzrVar3);
                parcel2.writeNoException();
                return true;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                zzbh zzbhVarA = fv2.a(parcel, zzbh.CREATOR);
                String string = parcel.readString();
                parcel.readString();
                fv2.d(parcel);
                gu2.o(zzbhVarA);
                gu2.l(string);
                D(string, true);
                E(new gc((Object) this, (Object) zzbhVarA, string, 9));
                parcel2.writeNoException();
                return true;
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                zzr zzrVar4 = (zzr) fv2.a(parcel, zzr.CREATOR);
                fv2.d(parcel);
                B(zzrVar4);
                parcel2.writeNoException();
                return true;
            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                zzr zzrVar5 = (zzr) fv2.a(parcel, zzr.CREATOR);
                Object[] objArr = parcel.readInt() != 0;
                fv2.d(parcel);
                e(zzrVar5);
                String str = zzrVar5.a;
                gu2.o(str);
                try {
                    List<of3> list2 = (List) if3Var.e().L(new b63(this, str, z ? 1 : 0)).get();
                    ArrayList arrayList2 = new ArrayList(list2.size());
                    for (of3 of3Var : list2) {
                        if (objArr != false || !qf3.i0(of3Var.c)) {
                            arrayList2.add(new zzpl(of3Var));
                        }
                        break;
                    }
                    arrayList = arrayList2;
                } catch (InterruptedException e) {
                    e = e;
                    if3Var.d().f.c(c33.M(str), e, "Failed to get user properties. appId");
                } catch (ExecutionException e2) {
                    e = e2;
                    if3Var.d().f.c(c33.M(str), e, "Failed to get user properties. appId");
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(arrayList);
                return true;
            case 9:
                zzbh zzbhVar2 = (zzbh) fv2.a(parcel, zzbh.CREATOR);
                String string2 = parcel.readString();
                fv2.d(parcel);
                byte[] bArrU = u(zzbhVar2, string2);
                parcel2.writeNoException();
                parcel2.writeByteArray(bArrU);
                return true;
            case 10:
                long j = parcel.readLong();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                fv2.d(parcel);
                l(j, string3, string4, string5);
                parcel2.writeNoException();
                return true;
            case 11:
                zzr zzrVar6 = (zzr) fv2.a(parcel, zzr.CREATOR);
                fv2.d(parcel);
                String strX = x(zzrVar6);
                parcel2.writeNoException();
                parcel2.writeString(strX);
                return true;
            case 12:
                zzah zzahVar = (zzah) fv2.a(parcel, zzah.CREATOR);
                zzr zzrVar7 = (zzr) fv2.a(parcel, zzr.CREATOR);
                fv2.d(parcel);
                f(zzahVar, zzrVar7);
                parcel2.writeNoException();
                return true;
            case 13:
                zzah zzahVarA = fv2.a(parcel, zzah.CREATOR);
                fv2.d(parcel);
                gu2.o(zzahVarA);
                gu2.o(zzahVarA.c);
                gu2.l(zzahVarA.a);
                D(zzahVarA.a, true);
                E(new bh0(28, this, new zzah(zzahVarA), z));
                parcel2.writeNoException();
                return true;
            case 14:
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                ClassLoader classLoader = fv2.a;
                z = parcel.readInt() != 0;
                zzr zzrVar8 = (zzr) fv2.a(parcel, zzr.CREATOR);
                fv2.d(parcel);
                List listT = t(string6, string7, z, zzrVar8);
                parcel2.writeNoException();
                parcel2.writeTypedList(listT);
                return true;
            case 15:
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                ClassLoader classLoader2 = fv2.a;
                boolean z2 = parcel.readInt() != 0;
                fv2.d(parcel);
                List listC = c(string8, string9, string10, z2);
                parcel2.writeNoException();
                parcel2.writeTypedList(listC);
                return true;
            case 16:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                zzr zzrVar9 = (zzr) fv2.a(parcel, zzr.CREATOR);
                fv2.d(parcel);
                List listY = y(string11, string12, zzrVar9);
                parcel2.writeNoException();
                parcel2.writeTypedList(listY);
                return true;
            case 17:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                fv2.d(parcel);
                List listP = p(string13, string14, string15);
                parcel2.writeNoException();
                parcel2.writeTypedList(listP);
                return true;
            case 18:
                zzr zzrVar10 = (zzr) fv2.a(parcel, zzr.CREATOR);
                fv2.d(parcel);
                m(zzrVar10);
                parcel2.writeNoException();
                return true;
            case 19:
                Bundle bundle = (Bundle) fv2.a(parcel, Bundle.CREATOR);
                zzr zzrVar11 = (zzr) fv2.a(parcel, zzr.CREATOR);
                fv2.d(parcel);
                j(bundle, zzrVar11);
                parcel2.writeNoException();
                return true;
            case 20:
                zzr zzrVar12 = (zzr) fv2.a(parcel, zzr.CREATOR);
                fv2.d(parcel);
                A(zzrVar12);
                parcel2.writeNoException();
                return true;
            case 21:
                zzr zzrVar13 = (zzr) fv2.a(parcel, zzr.CREATOR);
                fv2.d(parcel);
                zzao zzaoVarI = i(zzrVar13);
                parcel2.writeNoException();
                if (zzaoVarI == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                zzaoVarI.writeToParcel(parcel2, 1);
                return true;
            case 24:
                zzr zzrVar14 = (zzr) fv2.a(parcel, zzr.CREATOR);
                Bundle bundle2 = (Bundle) fv2.a(parcel, Bundle.CREATOR);
                fv2.d(parcel);
                e(zzrVar14);
                String str2 = zzrVar14.a;
                gu2.o(str2);
                if (!if3Var.e0().P(null, h13.T0)) {
                    try {
                        list = (List) if3Var.e().L(new v63(this, zzrVar14, bundle2, i2)).get();
                    } catch (InterruptedException | ExecutionException e3) {
                        if3Var.d().f.c(c33.M(str2), e3, "Failed to get trigger URIs. appId");
                        list = Collections.EMPTY_LIST;
                    }
                    break;
                } else {
                    try {
                        list = (List) if3Var.e().M(new v63(this, zzrVar14, bundle2, z ? 1 : 0)).get(10000L, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException | ExecutionException | TimeoutException e4) {
                        if3Var.d().f.c(c33.M(str2), e4, "Failed to get trigger URIs. appId");
                        list = Collections.EMPTY_LIST;
                    }
                    break;
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(list);
                return true;
            case 25:
                zzr zzrVar15 = (zzr) fv2.a(parcel, zzr.CREATOR);
                fv2.d(parcel);
                v(zzrVar15);
                parcel2.writeNoException();
                return true;
            case 26:
                zzr zzrVar16 = (zzr) fv2.a(parcel, zzr.CREATOR);
                fv2.d(parcel);
                C(zzrVar16);
                parcel2.writeNoException();
                return true;
            case 27:
                zzr zzrVar17 = (zzr) fv2.a(parcel, zzr.CREATOR);
                fv2.d(parcel);
                q(zzrVar17);
                parcel2.writeNoException();
                return true;
            case 29:
                zzr zzrVar18 = (zzr) fv2.a(parcel, zzr.CREATOR);
                zzoo zzooVar = (zzoo) fv2.a(parcel, zzoo.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
                    y13Var = iInterfaceQueryLocalInterface instanceof c23 ? (c23) iInterfaceQueryLocalInterface : new y13(strongBinder, "com.google.android.gms.measurement.internal.IUploadBatchesCallback", 4);
                }
                fv2.d(parcel);
                h(zzrVar18, zzooVar, y13Var);
                parcel2.writeNoException();
                return true;
            case 30:
                zzr zzrVar19 = (zzr) fv2.a(parcel, zzr.CREATOR);
                zzaf zzafVar = (zzaf) fv2.a(parcel, zzaf.CREATOR);
                fv2.d(parcel);
                b(zzrVar19, zzafVar);
                parcel2.writeNoException();
                return true;
            case 31:
                zzr zzrVar20 = (zzr) fv2.a(parcel, zzr.CREATOR);
                Bundle bundle3 = (Bundle) fv2.a(parcel, Bundle.CREATOR);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
                    q13Var = iInterfaceQueryLocalInterface2 instanceof v13 ? (v13) iInterfaceQueryLocalInterface2 : new q13(strongBinder2, "com.google.android.gms.measurement.internal.ITriggerUrisCallback", 4);
                }
                fv2.d(parcel);
                z(zzrVar20, bundle3, q13Var);
                parcel2.writeNoException();
                return true;
        }
    }

    @Override // defpackage.n13
    public final void b(zzr zzrVar, zzaf zzafVar) {
        e(zzrVar);
        E(new gc(this, zzrVar, zzafVar, 11, false));
    }

    @Override // defpackage.n13
    public final List c(String str, String str2, String str3, boolean z) {
        D(str, true);
        if3 if3Var = this.a;
        try {
            List<of3> list = (List) if3Var.e().L(new l63(this, str, str2, str3, 1)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (of3 of3Var : list) {
                if (z || !qf3.i0(of3Var.c)) {
                    arrayList.add(new zzpl(of3Var));
                }
            }
            return arrayList;
        } catch (InterruptedException e) {
            e = e;
            if3Var.d().f.c(c33.M(str), e, "Failed to get user properties as. appId");
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e2) {
            e = e2;
            if3Var.d().f.c(c33.M(str), e, "Failed to get user properties as. appId");
            return Collections.EMPTY_LIST;
        }
    }

    public final void d(Runnable runnable) {
        if3 if3Var = this.a;
        if (if3Var.e().K()) {
            runnable.run();
        } else {
            if3Var.e().P(runnable);
        }
    }

    public final void e(zzr zzrVar) {
        gu2.o(zzrVar);
        String str = zzrVar.a;
        gu2.l(str);
        D(str, false);
        this.a.k0().K(zzrVar.b);
    }

    @Override // defpackage.n13
    public final void f(zzah zzahVar, zzr zzrVar) {
        gu2.o(zzahVar);
        gu2.o(zzahVar.c);
        e(zzrVar);
        zzah zzahVar2 = new zzah(zzahVar);
        zzahVar2.a = zzrVar.a;
        E(new gc(this, zzahVar2, zzrVar, 7));
    }

    @Override // defpackage.n13
    public final void g(zzpl zzplVar, zzr zzrVar) {
        gu2.o(zzplVar);
        e(zzrVar);
        E(new gc(this, zzplVar, zzrVar, 10));
    }

    @Override // defpackage.n13
    public final void h(zzr zzrVar, zzoo zzooVar, c23 c23Var) {
        e(zzrVar);
        String str = zzrVar.a;
        gu2.o(str);
        this.a.e().N(new yk(this, str, zzooVar, c23Var, 1, false));
    }

    @Override // defpackage.n13
    public final zzao i(zzr zzrVar) {
        e(zzrVar);
        String str = zzrVar.a;
        gu2.l(str);
        if3 if3Var = this.a;
        try {
            return (zzao) if3Var.e().M(new b63(this, zzrVar, 1)).get(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            if3Var.d().f.c(c33.M(str), e, "Failed to get consent. appId");
            return new zzao((Bundle) null);
        }
    }

    @Override // defpackage.n13
    public final void j(Bundle bundle, zzr zzrVar) {
        e(zzrVar);
        String str = zzrVar.a;
        gu2.o(str);
        E(new yk(this, bundle, str, zzrVar, 3, false));
    }

    @Override // defpackage.n13
    public final void l(long j, String str, String str2, String str3) {
        E(new az1(this, str2, str3, str, j, 1));
    }

    @Override // defpackage.n13
    public final void m(zzr zzrVar) {
        String str = zzrVar.a;
        gu2.l(str);
        D(str, false);
        E(new d63(this, zzrVar, 3));
    }

    @Override // defpackage.n13
    public final void n(zzr zzrVar) {
        e(zzrVar);
        E(new d63(this, zzrVar, 0));
    }

    @Override // defpackage.n13
    public final List p(String str, String str2, String str3) {
        D(str, true);
        if3 if3Var = this.a;
        try {
            return (List) if3Var.e().L(new l63(this, str, str2, str3, 3)).get();
        } catch (InterruptedException | ExecutionException e) {
            if3Var.d().f.b(e, "Failed to get conditional user properties as");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // defpackage.n13
    public final void q(zzr zzrVar) {
        e(zzrVar);
        E(new d63(this, zzrVar, 1));
    }

    @Override // defpackage.n13
    public final List t(String str, String str2, boolean z, zzr zzrVar) {
        e(zzrVar);
        String str3 = zzrVar.a;
        gu2.o(str3);
        if3 if3Var = this.a;
        try {
            List<of3> list = (List) if3Var.e().L(new l63(this, str3, str, str2, 0)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (of3 of3Var : list) {
                if (z || !qf3.i0(of3Var.c)) {
                    arrayList.add(new zzpl(of3Var));
                }
            }
            return arrayList;
        } catch (InterruptedException e) {
            e = e;
            if3Var.d().f.c(c33.M(str3), e, "Failed to query user properties. appId");
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e2) {
            e = e2;
            if3Var.d().f.c(c33.M(str3), e, "Failed to query user properties. appId");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // defpackage.n13
    public final byte[] u(zzbh zzbhVar, String str) {
        gu2.l(str);
        gu2.o(zzbhVar);
        D(str, true);
        if3 if3Var = this.a;
        z23 z23Var = if3Var.d().Z;
        y53 y53Var = if3Var.Y;
        p23 p23Var = y53Var.W;
        String str2 = zzbhVar.a;
        z23Var.b(p23Var.a(str2), "Log and bundle. event");
        if3Var.g().getClass();
        long jNanoTime = System.nanoTime() / 1000000;
        try {
            byte[] bArr = (byte[]) if3Var.e().M(new a20(this, zzbhVar, str)).get();
            if (bArr == null) {
                if3Var.d().f.b(c33.M(str), "Log and bundle returned null. appId");
                bArr = new byte[0];
            }
            if3Var.g().getClass();
            if3Var.d().Z.d("Log and bundle processed. event, size, time_ms", y53Var.W.a(str2), Integer.valueOf(bArr.length), Long.valueOf((System.nanoTime() / 1000000) - jNanoTime));
            return bArr;
        } catch (InterruptedException e) {
            e = e;
            if3Var.d().f.d("Failed to log and bundle. appId, event, error", c33.M(str), y53Var.W.a(str2), e);
            return null;
        } catch (ExecutionException e2) {
            e = e2;
            if3Var.d().f.d("Failed to log and bundle. appId, event, error", c33.M(str), y53Var.W.a(str2), e);
            return null;
        }
    }

    @Override // defpackage.n13
    public final void v(zzr zzrVar) {
        gu2.l(zzrVar.a);
        gu2.o(zzrVar.f0);
        d(new d63(this, zzrVar, 6));
    }

    @Override // defpackage.n13
    public final void w(zzbh zzbhVar, zzr zzrVar) {
        gu2.o(zzbhVar);
        e(zzrVar);
        E(new gc(this, zzbhVar, zzrVar, 8));
    }

    @Override // defpackage.n13
    public final String x(zzr zzrVar) {
        e(zzrVar);
        if3 if3Var = this.a;
        try {
            return (String) if3Var.e().L(new b63(if3Var, zzrVar)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            if3Var.d().f.c(c33.M(zzrVar.a), e, "Failed to get app instance id. appId");
            return null;
        }
    }

    @Override // defpackage.n13
    public final List y(String str, String str2, zzr zzrVar) {
        e(zzrVar);
        String str3 = zzrVar.a;
        gu2.o(str3);
        if3 if3Var = this.a;
        try {
            return (List) if3Var.e().L(new l63(this, str3, str, str2, 2)).get();
        } catch (InterruptedException | ExecutionException e) {
            if3Var.d().f.b(e, "Failed to get conditional user properties");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // defpackage.n13
    public final void z(zzr zzrVar, Bundle bundle, v13 v13Var) {
        e(zzrVar);
        String str = zzrVar.a;
        gu2.o(str);
        this.a.e().N(new a73(this, zzrVar, bundle, v13Var, str));
    }
}
