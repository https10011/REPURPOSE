package defpackage;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class p50 extends ea {
    public final TextView i;
    public final l50 j;
    public boolean k = true;

    public p50(TextView textView) {
        this.i = textView;
        this.j = new l50(textView);
    }

    public final void F() {
        TextView textView = this.i;
        TransformationMethod transformationMethod = textView.getTransformationMethod();
        if (this.k) {
            if (!(transformationMethod instanceof t50) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                transformationMethod = new t50(transformationMethod);
            }
        } else if (transformationMethod instanceof t50) {
            transformationMethod = ((t50) transformationMethod).a;
        }
        textView.setTransformationMethod(transformationMethod);
    }

    @Override // defpackage.ea
    public final InputFilter[] j(InputFilter[] inputFilterArr) {
        if (!this.k) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof l50) {
                    sparseArray.put(i, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                if (sparseArray.indexOfKey(i3) < 0) {
                    inputFilterArr2[i2] = inputFilterArr[i3];
                    i2++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i4 = 0;
        while (true) {
            l50 l50Var = this.j;
            if (i4 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = l50Var;
                return inputFilterArr3;
            }
            if (inputFilterArr[i4] == l50Var) {
                return inputFilterArr;
            }
            i4++;
        }
    }

    @Override // defpackage.ea
    public final boolean p() {
        return this.k;
    }

    @Override // defpackage.ea
    public final void y(boolean z) {
        if (z) {
            F();
        }
    }

    @Override // defpackage.ea
    public final void z(boolean z) {
        this.k = z;
        F();
        TextView textView = this.i;
        textView.setFilters(j(textView.getFilters()));
    }
}
