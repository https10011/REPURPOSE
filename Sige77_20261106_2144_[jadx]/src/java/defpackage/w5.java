package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class w5 implements IInterface {
    public final /* synthetic */ int a;
    public IBinder b;

    public w5(IBinder iBinder) {
        this.a = 2;
        iBinder.getClass();
        this.b = iBinder;
    }

    public String D() {
        switch (this.a) {
            case 0:
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    this.b.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            default:
                Parcel parcelObtain3 = Parcel.obtain();
                Parcel parcelObtain4 = Parcel.obtain();
                try {
                    parcelObtain3.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    this.b.transact(1, parcelObtain3, parcelObtain4, 0);
                    parcelObtain4.readException();
                    return parcelObtain4.readString();
                } finally {
                    parcelObtain4.recycle();
                    parcelObtain3.recycle();
                }
        }
    }

    public boolean E() {
        switch (this.a) {
            case 0:
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    parcelObtain.writeInt(1);
                    this.b.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            default:
                Parcel parcelObtain3 = Parcel.obtain();
                Parcel parcelObtain4 = Parcel.obtain();
                try {
                    parcelObtain3.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    parcelObtain3.writeInt(1);
                    this.b.transact(2, parcelObtain3, parcelObtain4, 0);
                    parcelObtain4.readException();
                    return parcelObtain4.readInt() != 0;
                } finally {
                    parcelObtain4.recycle();
                    parcelObtain3.recycle();
                }
        }
    }

    public boolean F() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.getClass();
        Parcel parcelObtain2 = Parcel.obtain();
        parcelObtain2.getClass();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            parcelObtain.writeInt(1);
            this.b.transact(2, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    public String a() {
        switch (this.a) {
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    this.b.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            default:
                Parcel parcelObtain3 = Parcel.obtain();
                Parcel parcelObtain4 = Parcel.obtain();
                try {
                    parcelObtain3.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    this.b.transact(1, parcelObtain3, parcelObtain4, 0);
                    parcelObtain4.readException();
                    return parcelObtain4.readString();
                } finally {
                    parcelObtain4.recycle();
                    parcelObtain3.recycle();
                }
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                break;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                break;
        }
        return this.b;
    }

    public boolean d() {
        switch (this.a) {
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    parcelObtain.writeInt(1);
                    this.b.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            default:
                Parcel parcelObtain3 = Parcel.obtain();
                Parcel parcelObtain4 = Parcel.obtain();
                try {
                    parcelObtain3.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    parcelObtain3.writeInt(1);
                    this.b.transact(2, parcelObtain3, parcelObtain4, 0);
                    parcelObtain4.readException();
                    return parcelObtain4.readInt() != 0;
                } finally {
                    parcelObtain4.recycle();
                    parcelObtain3.recycle();
                }
        }
    }

    public String e() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.getClass();
        Parcel parcelObtain2 = Parcel.obtain();
        parcelObtain2.getClass();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            this.b.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readString();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
