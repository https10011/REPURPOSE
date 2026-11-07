package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.measurement.zzjh;
import com.google.android.gms.internal.measurement.zzjj;
import com.google.android.gms.internal.measurement.zzjl;
import com.google.android.gms.internal.measurement.zzjo;
import com.google.android.gms.internal.measurement.zzjs;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class a83 extends dv2 {
    public final /* synthetic */ int a = 1;
    public final Object b;

    public a83(TaskCompletionSource taskCompletionSource) {
        super("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
        this.b = taskCompletionSource;
    }

    @Override // defpackage.dv2
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        switch (this.a) {
            case 0:
                if (i != 2) {
                    return false;
                }
                Status statusA = fv2.a(parcel, Status.CREATOR);
                byte[] bArrCreateByteArray = parcel.createByteArray();
                fv2.d(parcel);
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.b;
                if (statusA.R()) {
                    try {
                        vl2 vl2Var = vl2.b;
                        int i2 = yk2.a;
                        qt.w(statusA, rc3.v(bArrCreateByteArray, vl2.c), taskCompletionSource);
                    } catch (xm2 e) {
                        taskCompletionSource.setException(e);
                    }
                } else {
                    qt.w(statusA, null, taskCompletionSource);
                }
                return true;
            case 1:
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.b;
                switch (i) {
                    case 1:
                        Status statusA2 = fv2.a(parcel, Status.CREATOR);
                        fv2.d(parcel);
                        qt.w(statusA2, null, taskCompletionSource2);
                        break;
                    case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                        Status statusA3 = fv2.a(parcel, Status.CREATOR);
                        fv2.d(parcel);
                        qt.w(statusA3, null, taskCompletionSource2);
                        break;
                    case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                        Status statusA4 = fv2.a(parcel, Status.CREATOR);
                        fv2.d(parcel);
                        qt.w(statusA4, null, taskCompletionSource2);
                        break;
                    case oc1.LONG_FIELD_NUMBER /* 4 */:
                        Status statusA5 = fv2.a(parcel, Status.CREATOR);
                        zzjh zzjhVarA = fv2.a(parcel, zzjh.CREATOR);
                        fv2.d(parcel);
                        qt.w(statusA5, zzjhVarA, taskCompletionSource2);
                        break;
                    case oc1.STRING_FIELD_NUMBER /* 5 */:
                        Status statusA6 = fv2.a(parcel, Status.CREATOR);
                        fv2.d(parcel);
                        qt.w(statusA6, null, taskCompletionSource2);
                        break;
                    case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                        Status statusA7 = fv2.a(parcel, Status.CREATOR);
                        zzjl zzjlVarA = fv2.a(parcel, zzjl.CREATOR);
                        fv2.d(parcel);
                        qt.w(statusA7, zzjlVarA, taskCompletionSource2);
                        break;
                    case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                        Status statusA8 = fv2.a(parcel, Status.CREATOR);
                        zzjj zzjjVarA = fv2.a(parcel, zzjj.CREATOR);
                        fv2.d(parcel);
                        qt.w(statusA8, zzjjVarA, taskCompletionSource2);
                        break;
                    case oc1.BYTES_FIELD_NUMBER /* 8 */:
                        Status statusA9 = fv2.a(parcel, Status.CREATOR);
                        fv2.d(parcel);
                        qt.w(statusA9, null, taskCompletionSource2);
                        break;
                    case 9:
                        Status statusA10 = fv2.a(parcel, Status.CREATOR);
                        zzjo zzjoVarA = fv2.a(parcel, zzjo.CREATOR);
                        fv2.d(parcel);
                        qt.w(statusA10, zzjoVarA, taskCompletionSource2);
                        break;
                    case 10:
                        Status statusA11 = fv2.a(parcel, Status.CREATOR);
                        zzjh zzjhVarA2 = fv2.a(parcel, zzjh.CREATOR);
                        fv2.d(parcel);
                        qt.w(statusA11, zzjhVarA2, taskCompletionSource2);
                        break;
                    case 11:
                        Status statusA12 = fv2.a(parcel, Status.CREATOR);
                        parcel.readLong();
                        fv2.d(parcel);
                        qt.w(statusA12, null, taskCompletionSource2);
                        break;
                    case 12:
                        Status statusA13 = fv2.a(parcel, Status.CREATOR);
                        fv2.d(parcel);
                        qt.w(statusA13, null, taskCompletionSource2);
                        break;
                    case 13:
                        Status statusA14 = fv2.a(parcel, Status.CREATOR);
                        zzjs zzjsVarA = fv2.a(parcel, zzjs.CREATOR);
                        fv2.d(parcel);
                        qt.w(statusA14, zzjsVarA, taskCompletionSource2);
                        break;
                    case 14:
                        Status statusA15 = fv2.a(parcel, Status.CREATOR);
                        fv2.d(parcel);
                        qt.w(statusA15, null, taskCompletionSource2);
                        break;
                    case 15:
                        Status statusA16 = fv2.a(parcel, Status.CREATOR);
                        fv2.d(parcel);
                        qt.w(statusA16, null, taskCompletionSource2);
                        break;
                    case 16:
                        Status statusA17 = fv2.a(parcel, Status.CREATOR);
                        long j = parcel.readLong();
                        fv2.d(parcel);
                        qt.w(statusA17, Long.valueOf(j), taskCompletionSource2);
                        break;
                    default:
                        return false;
                }
                return true;
            default:
                if (i != 2) {
                    return false;
                }
                byte[] bArrCreateByteArray2 = parcel.createByteArray();
                fv2.d(parcel);
                ri2 ri2Var = new ri2();
                ri2Var.a = bArrCreateByteArray2;
                bk0 bk0Var = (bk0) this.b;
                ((ll0) bk0Var.a).execute(new bh0(21, bk0Var, ri2Var));
                return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a83(u83 u83Var, bk0 bk0Var) {
        super("com.google.android.gms.phenotype.internal.IFlagUpdateListener");
        this.b = bk0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a83(u83 u83Var, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.gms.phenotype.internal.IGetStorageInfoCallbacks");
        this.b = taskCompletionSource;
    }
}
