package defpackage;

import android.os.BadParcelableException;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.identitycredentials.ClearCreationOptionsResponse;
import com.google.android.gms.identitycredentials.ClearCredentialStateResponse;
import com.google.android.gms.identitycredentials.ClearExportResponse;
import com.google.android.gms.identitycredentials.ClearRegistryResponse;
import com.google.android.gms.identitycredentials.CreateCredentialHandle;
import com.google.android.gms.identitycredentials.CreateCredentialResponse;
import com.google.android.gms.identitycredentials.CredentialTransferCapabilities;
import com.google.android.gms.identitycredentials.ExportCredentialsToDeviceSetupResponse;
import com.google.android.gms.identitycredentials.ImportCredentialsForDeviceSetupResponse;
import com.google.android.gms.identitycredentials.PendingGetCredentialHandle;
import com.google.android.gms.identitycredentials.PendingImportCredentialsHandle;
import com.google.android.gms.identitycredentials.RegisterCreationOptionsResponse;
import com.google.android.gms.identitycredentials.RegisterExportResponse;
import com.google.android.gms.identitycredentials.RegistrationResponse;
import com.google.android.gms.identitycredentials.SignalCredentialStateResponse;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class pg2 extends Binder implements IInterface {
    public final /* synthetic */ int a;

    public pg2(String str, int i) {
        this.a = i;
        switch (i) {
            case 1:
                attachInterface(this, str);
                break;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                attachInterface(this, str);
                break;
            default:
                attachInterface(this, str);
                break;
        }
    }

    public static void D(Parcel parcel) {
        int i = zv2.a;
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(ck1.s(iDataAvail, "Parcel data not fully consumed, unread size: ", new StringBuilder(String.valueOf(iDataAvail).length() + 45)));
        }
    }

    public abstract boolean E(int i, Parcel parcel, Parcel parcel2);

    public abstract boolean F(int i, Parcel parcel, Parcel parcel2);

    public boolean G(int i, Parcel parcel, Parcel parcel2) {
        return false;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int i = this.a;
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        boolean zOnTransact;
        switch (this.a) {
            case 0:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return E(i, parcel, parcel2);
            case 1:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return F(i, parcel, parcel2);
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return G(i, parcel, parcel2);
            default:
                if (i > 16777215) {
                    zOnTransact = super.onTransact(i, parcel, parcel2, i2);
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                    zOnTransact = false;
                }
                if (zOnTransact) {
                    return true;
                }
                ir0 ir0Var = (ir0) this;
                switch (i) {
                    case 1:
                        Status statusA = zv2.a(parcel, Status.CREATOR);
                        PendingGetCredentialHandle pendingGetCredentialHandleA = zv2.a(parcel, PendingGetCredentialHandle.CREATOR);
                        D(parcel);
                        statusA.getClass();
                        qt.w(statusA, pendingGetCredentialHandleA, ir0Var.b);
                        return true;
                    case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                        Status statusA2 = zv2.a(parcel, Status.CREATOR);
                        zv2.a(parcel, RegistrationResponse.CREATOR);
                        D(parcel);
                        statusA2.getClass();
                        uq1.k();
                        break;
                    case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                        Status statusA3 = zv2.a(parcel, Status.CREATOR);
                        zv2.a(parcel, ClearRegistryResponse.CREATOR);
                        D(parcel);
                        statusA3.getClass();
                        uq1.k();
                        break;
                    case oc1.LONG_FIELD_NUMBER /* 4 */:
                        Status statusA4 = zv2.a(parcel, Status.CREATOR);
                        zv2.a(parcel, PendingImportCredentialsHandle.CREATOR);
                        D(parcel);
                        statusA4.getClass();
                        uq1.k();
                        break;
                    case oc1.STRING_FIELD_NUMBER /* 5 */:
                        Status statusA5 = zv2.a(parcel, Status.CREATOR);
                        zv2.a(parcel, RegisterExportResponse.CREATOR);
                        D(parcel);
                        statusA5.getClass();
                        uq1.k();
                        break;
                    case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                        Status statusA6 = zv2.a(parcel, Status.CREATOR);
                        zv2.a(parcel, CreateCredentialResponse.CREATOR);
                        D(parcel);
                        statusA6.getClass();
                        uq1.k();
                        break;
                    case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                        Status statusA7 = zv2.a(parcel, Status.CREATOR);
                        zv2.a(parcel, CreateCredentialHandle.CREATOR);
                        D(parcel);
                        statusA7.getClass();
                        throw new UnsupportedOperationException();
                    case oc1.BYTES_FIELD_NUMBER /* 8 */:
                        Status statusA8 = zv2.a(parcel, Status.CREATOR);
                        zv2.a(parcel, RegisterCreationOptionsResponse.CREATOR);
                        D(parcel);
                        statusA8.getClass();
                        uq1.k();
                        break;
                    case 9:
                        Status statusA9 = zv2.a(parcel, Status.CREATOR);
                        zv2.a(parcel, ClearCredentialStateResponse.CREATOR);
                        D(parcel);
                        statusA9.getClass();
                        throw new UnsupportedOperationException();
                    case 10:
                        Status statusA10 = zv2.a(parcel, Status.CREATOR);
                        zv2.a(parcel, SignalCredentialStateResponse.CREATOR);
                        D(parcel);
                        statusA10.getClass();
                        throw new UnsupportedOperationException();
                    case 11:
                        Status statusA11 = zv2.a(parcel, Status.CREATOR);
                        zv2.a(parcel, ClearExportResponse.CREATOR);
                        D(parcel);
                        statusA11.getClass();
                        uq1.k();
                        break;
                    case 12:
                        Status statusA12 = zv2.a(parcel, Status.CREATOR);
                        zv2.a(parcel, ImportCredentialsForDeviceSetupResponse.CREATOR);
                        D(parcel);
                        statusA12.getClass();
                        uq1.k();
                        break;
                    case 13:
                        Status statusA13 = zv2.a(parcel, Status.CREATOR);
                        zv2.a(parcel, ExportCredentialsToDeviceSetupResponse.CREATOR);
                        D(parcel);
                        statusA13.getClass();
                        uq1.k();
                        break;
                    case 14:
                        Status statusA14 = zv2.a(parcel, Status.CREATOR);
                        zv2.a(parcel, CredentialTransferCapabilities.CREATOR);
                        D(parcel);
                        statusA14.getClass();
                        uq1.k();
                        break;
                    case 15:
                        Status statusA15 = zv2.a(parcel, Status.CREATOR);
                        zv2.a(parcel, ClearCreationOptionsResponse.CREATOR);
                        D(parcel);
                        statusA15.getClass();
                        uq1.k();
                        break;
                }
                return false;
        }
    }
}
