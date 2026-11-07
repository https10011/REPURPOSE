package com.linecorp.linesdk;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import defpackage.ed1;
import defpackage.ew;
import defpackage.o91;
import defpackage.uq1;
import defpackage.ur;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class DataBinderMapperImpl extends ew {
    public static final SparseIntArray a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(2);
        a = sparseIntArray;
        sparseIntArray.put(2131492996, 1);
        sparseIntArray.put(2131492997, 2);
    }

    @Override // defpackage.ew
    public final List a() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // defpackage.ew
    public final androidx.databinding.a b(DataBindingComponent dataBindingComponent, View view, int i) {
        int i2 = a.get(i);
        if (i2 > 0) {
            Object tag = view.getTag();
            if (tag == null) {
                uq1.m("view must have a tag");
            } else {
                if (i2 == 1) {
                    if (!"layout/open_chat_info_fragment_0".equals(tag)) {
                        ur.g(tag, "The tag for open_chat_info_fragment is invalid. Received: ");
                        return null;
                    }
                    Object[] objArr = new Object[16];
                    androidx.databinding.a.R(view, objArr, o91.u0, true);
                    TextView textView = (TextView) objArr[10];
                    EditText editText = (EditText) objArr[2];
                    TextView textView2 = (TextView) objArr[6];
                    EditText editText2 = (EditText) objArr[1];
                    TextView textView3 = (TextView) objArr[4];
                    CheckBox checkBox = (CheckBox) objArr[3];
                    ConstraintLayout constraintLayout = (ConstraintLayout) objArr[13];
                    o91 o91Var = new o91(dataBindingComponent, view, textView, editText, textView2, editText2, textView3, checkBox, constraintLayout);
                    o91Var.t0 = -1L;
                    o91Var.l0.setTag(null);
                    ((ScrollView) objArr[0]).setTag(null);
                    o91Var.n0.setTag(null);
                    o91Var.p0.setTag(null);
                    view.setTag(2131296429, o91Var);
                    synchronized (o91Var) {
                        o91Var.t0 = 16L;
                    }
                    o91Var.U();
                    return o91Var;
                }
                if (i2 == 2) {
                    if (!"layout/profile_info_fragment_0".equals(tag)) {
                        ur.g(tag, "The tag for profile_info_fragment is invalid. Received: ");
                        return null;
                    }
                    Object[] objArr2 = new Object[3];
                    androidx.databinding.a.R(view, objArr2, ed1.p0, true);
                    ed1 ed1Var = new ed1(dataBindingComponent, view, (EditText) objArr2[1], (TextView) objArr2[2]);
                    ed1Var.o0 = -1L;
                    ed1Var.k0.setTag(null);
                    ((ConstraintLayout) objArr2[0]).setTag(null);
                    view.setTag(2131296429, ed1Var);
                    synchronized (ed1Var) {
                        ed1Var.o0 = 4L;
                    }
                    ed1Var.U();
                    return ed1Var;
                }
            }
        }
        return null;
    }
}
