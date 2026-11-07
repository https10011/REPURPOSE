package com.hjq.toast;

import android.app.Application;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import defpackage.e;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class NormalToast extends Toast {
    private TextView mMessageView;

    public NormalToast(Application application) {
        super(application);
    }

    public static TextView findMessageView(View view) {
        TextView textViewFindTextView;
        if (view instanceof TextView) {
            return (TextView) view;
        }
        if (view.findViewById(android.R.id.message) instanceof TextView) {
            return (TextView) view.findViewById(android.R.id.message);
        }
        if ((view instanceof ViewGroup) && (textViewFindTextView = findTextView((ViewGroup) view)) != null) {
            return textViewFindTextView;
        }
        e.g("The layout must contain a TextView");
        return null;
    }

    private static TextView findTextView(ViewGroup viewGroup) {
        TextView textViewFindTextView;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof TextView) {
                return (TextView) childAt;
            }
            if ((childAt instanceof ViewGroup) && (textViewFindTextView = findTextView((ViewGroup) childAt)) != null) {
                return textViewFindTextView;
            }
        }
        return null;
    }

    public void setMessageView(TextView textView) {
        this.mMessageView = textView;
    }

    @Override // android.widget.Toast
    public void setText(CharSequence charSequence) {
        this.mMessageView.setText(charSequence);
    }

    @Override // android.widget.Toast
    public void setView(View view) {
        super.setView(view);
        setMessageView(findMessageView(view));
    }
}
