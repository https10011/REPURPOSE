package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.internal.ParcelableSparseArray;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.stateful.ExtendableSavedState;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class w implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ int a;

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.a) {
            case 0:
                if (parcel.readParcelable(classLoader) == null) {
                    return AbsSavedState.b;
                }
                uq1.q("superState must be null");
                return null;
            case 1:
                return new DrawerLayout.SavedState(parcel, classLoader);
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return new ExtendableSavedState(parcel, classLoader);
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                return new NavigationView.SavedState(parcel, classLoader);
            default:
                return new ParcelableSparseArray(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new AbsSavedState[i];
            case 1:
                return new DrawerLayout.SavedState[i];
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return new ExtendableSavedState[i];
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                return new NavigationView.SavedState[i];
            default:
                return new ParcelableSparseArray[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                if (parcel.readParcelable(null) == null) {
                    return AbsSavedState.b;
                }
                uq1.q("superState must be null");
                return null;
            case 1:
                return new DrawerLayout.SavedState(parcel, (ClassLoader) null);
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return new ExtendableSavedState(parcel, (ClassLoader) null);
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                return new NavigationView.SavedState(parcel, (ClassLoader) null);
            default:
                return new ParcelableSparseArray(parcel, (ClassLoader) null);
        }
    }
}
