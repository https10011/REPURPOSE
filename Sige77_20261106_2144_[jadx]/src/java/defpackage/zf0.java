package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import androidx.fragment.app.f;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class zf0 implements LayoutInflater.Factory2 {
    public final e a;

    public zf0(e eVar) {
        this.a = eVar;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean zIsAssignableFrom;
        f fVarF;
        boolean zEquals = FragmentContainerView.class.getName().equals(str);
        e eVar = this.a;
        if (zEquals) {
            return new FragmentContainerView(context, attributeSet, eVar);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, se1.a);
            if (attributeValue == null) {
                attributeValue = typedArrayObtainStyledAttributes.getString(0);
            }
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
            String string = typedArrayObtainStyledAttributes.getString(2);
            typedArrayObtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    zIsAssignableFrom = Fragment.class.isAssignableFrom(eg0.b(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    zIsAssignableFrom = false;
                }
                if (zIsAssignableFrom) {
                    int id = view != null ? view.getId() : 0;
                    if (id == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    Fragment fragmentB = resourceId != -1 ? eVar.B(resourceId) : null;
                    if (fragmentB == null && string != null) {
                        fragmentB = eVar.C(string);
                    }
                    if (fragmentB == null && id != -1) {
                        fragmentB = eVar.B(id);
                    }
                    if (fragmentB == null) {
                        eg0 eg0VarE = eVar.E();
                        context.getClassLoader();
                        fragmentB = eg0VarE.a(attributeValue);
                        fragmentB.Z = true;
                        fragmentB.i0 = resourceId != 0 ? resourceId : id;
                        fragmentB.j0 = id;
                        fragmentB.k0 = string;
                        fragmentB.a0 = true;
                        fragmentB.e0 = eVar;
                        wf0 wf0Var = eVar.u;
                        fragmentB.f0 = wf0Var;
                        c cVar = wf0Var.Y;
                        fragmentB.r0 = true;
                        if ((wf0Var == null ? null : wf0Var.X) != null) {
                            fragmentB.r0 = true;
                        }
                        fVarF = eVar.a(fragmentB);
                        if (e.H(2)) {
                            Log.v("FragmentManager", "Fragment " + fragmentB + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else {
                        if (fragmentB.a0) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                        }
                        fragmentB.a0 = true;
                        fragmentB.e0 = eVar;
                        wf0 wf0Var2 = eVar.u;
                        fragmentB.f0 = wf0Var2;
                        c cVar2 = wf0Var2.Y;
                        fragmentB.r0 = true;
                        if ((wf0Var2 == null ? null : wf0Var2.X) != null) {
                            fragmentB.r0 = true;
                        }
                        fVarF = eVar.f(fragmentB);
                        if (e.H(2)) {
                            Log.v("FragmentManager", "Retained Fragment " + fragmentB + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    ng0 ng0Var = og0.a;
                    pg0 pg0Var = new pg0(fragmentB, "Attempting to use <fragment> tag to add fragment " + fragmentB + " to container " + viewGroup);
                    og0.c(pg0Var);
                    ng0 ng0VarA = og0.a(fragmentB);
                    if (ng0VarA.a.contains(mg0.d) && og0.e(ng0VarA, fragmentB.getClass(), pg0.class)) {
                        og0.b(ng0VarA, pg0Var);
                    }
                    fragmentB.s0 = viewGroup;
                    fVarF.k();
                    fVarF.j();
                    View view2 = fragmentB.t0;
                    if (view2 == null) {
                        uq1.q(ts.k("Fragment ", attributeValue, " did not create a view."));
                        return null;
                    }
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (fragmentB.t0.getTag() == null) {
                        fragmentB.t0.setTag(string);
                    }
                    fragmentB.t0.addOnAttachStateChangeListener(new yf0(this, fVarF));
                    return fragmentB.t0;
                }
            }
        }
        return null;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
