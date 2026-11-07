package defpackage;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.TimePicker;
import com.hjq.toast.BuildConfig;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class g62 {
    public static final g62 a = new g62();
    public static WeakReference b = new WeakReference(null);
    public static Method c;

    public static final View a(View view) {
        if (!mt.a.contains(g62.class)) {
            while (view != null) {
                try {
                    g62 g62Var = a;
                    boolean zAreEqual = false;
                    if (!mt.a.contains(g62Var)) {
                        try {
                            zAreEqual = Intrinsics.areEqual(view.getClass().getName(), "com.facebook.react.ReactRootView");
                        } catch (Throwable th) {
                            mt.a(g62Var, th);
                        }
                    }
                    if (!zAreEqual) {
                        Object parent = view.getParent();
                        if (!(parent instanceof View)) {
                            break;
                        }
                        view = (View) parent;
                    } else {
                        return view;
                    }
                } catch (Throwable th2) {
                    mt.a(g62.class, th2);
                }
            }
        }
        return null;
    }

    public static final ArrayList b(View view) {
        if (mt.a.contains(g62.class)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (view instanceof ViewGroup) {
                int childCount = ((ViewGroup) view).getChildCount();
                for (int i = 0; i < childCount; i++) {
                    arrayList.add(((ViewGroup) view).getChildAt(i));
                }
            }
            return arrayList;
        } catch (Throwable th) {
            mt.a(g62.class, th);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0050 A[Catch: all -> 0x004e, TRY_LEAVE, TryCatch #3 {all -> 0x004e, blocks: (B:16:0x0027, B:19:0x0030, B:28:0x0047, B:33:0x0050, B:41:0x0062, B:39:0x005d, B:26:0x0041, B:23:0x003b), top: B:84:0x0027, outer: #2, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0059  */
    /* JADX WARN: Code duplicated, block: B:41:0x0062 A[Catch: all -> 0x004e, TRY_LEAVE, TryCatch #3 {all -> 0x004e, blocks: (B:16:0x0027, B:19:0x0030, B:28:0x0047, B:33:0x0050, B:41:0x0062, B:39:0x005d, B:26:0x0041, B:23:0x003b), top: B:84:0x0027, outer: #2, inners: #4 }] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public static final int c(View view) {
        Class<?> cls;
        Class cls2;
        Set set = mt.a;
        if (set.contains(g62.class)) {
            return 0;
        }
        try {
            view.getClass();
            int i = view instanceof ImageView ? 2 : 0;
            if (view.isClickable()) {
                i |= 32;
            }
            boolean zContains = set.contains(g62.class);
            g62 g62Var = a;
            if (!zContains) {
                try {
                    ViewParent parent = view.getParent();
                    if (!(parent instanceof AdapterView)) {
                        if (set.contains(g62Var)) {
                            cls = null;
                            if (cls != null || !cls.isInstance(parent)) {
                                cls2 = mt.a.contains(g62Var) ? null : q61.class;
                                if (cls2 != null && cls2.isInstance(parent)) {
                                }
                            }
                        } else {
                            try {
                                cls = Class.forName("android.support.v4.view.NestedScrollingChild");
                            } catch (ClassNotFoundException unused) {
                                cls = null;
                            } catch (Throwable th) {
                                mt.a(g62Var, th);
                                cls = null;
                            }
                            if (cls != null) {
                                if (mt.a.contains(g62Var)) {
                                }
                                if (cls2 != null) {
                                }
                            } else {
                                if (mt.a.contains(g62Var)) {
                                }
                                if (cls2 != null) {
                                }
                            }
                        }
                    }
                    i |= 512;
                } catch (Throwable th2) {
                    mt.a(g62.class, th2);
                }
            }
            if (!(view instanceof TextView)) {
                if (!(view instanceof Spinner) && !(view instanceof DatePicker)) {
                    if (view instanceof RatingBar) {
                        return i | 65536;
                    }
                    if (view instanceof RadioGroup) {
                        return i | 16384;
                    }
                    return ((view instanceof ViewGroup) && g62Var.m(view, (View) b.get())) ? i | 64 : i;
                }
                return i | 4096;
            }
            int i2 = i | 1025;
            if (view instanceof Button) {
                i2 = i | 1029;
                if (view instanceof Switch) {
                    i2 = i | 9221;
                } else if (view instanceof CheckBox) {
                    i2 = 33797 | i;
                }
            }
            int i3 = i2;
            return view instanceof EditText ? i3 | 2048 : i3;
        } catch (Throwable th3) {
            mt.a(g62.class, th3);
            return 0;
        }
    }

    public static final JSONObject d(View view) {
        if (mt.a.contains(g62.class)) {
            return null;
        }
        try {
            view.getClass();
            if (Intrinsics.areEqual(view.getClass().getName(), "com.facebook.react.ReactRootView")) {
                b = new WeakReference(view);
            }
            JSONObject jSONObject = new JSONObject();
            try {
                n(view, jSONObject);
                JSONArray jSONArray = new JSONArray();
                ArrayList arrayListB = b(view);
                int size = arrayListB.size();
                for (int i = 0; i < size; i++) {
                    jSONArray.put(d((View) arrayListB.get(i)));
                }
                jSONObject.put("childviews", jSONArray);
                return jSONObject;
            } catch (JSONException e) {
                Log.e("g62", "Failed to create JSONObject for view.", e);
                return jSONObject;
            }
        } catch (Throwable th) {
            mt.a(g62.class, th);
            return null;
        }
    }

    public static final View.OnClickListener f(View view) {
        Field declaredField;
        if (mt.a.contains(g62.class)) {
            return null;
        }
        try {
            Field declaredField2 = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
            if (declaredField2 != null) {
                declaredField2.setAccessible(true);
            }
            Object obj = declaredField2.get(view);
            if (obj == null || (declaredField = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener")) == null) {
                return null;
            }
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(obj);
            obj2.getClass();
            return (View.OnClickListener) obj2;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            return null;
        } catch (Throwable th) {
            mt.a(g62.class, th);
            return null;
        }
    }

    public static final View.OnTouchListener g(View view) {
        Field declaredField;
        try {
            if (!mt.a.contains(g62.class)) {
                try {
                    Field declaredField2 = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
                    if (declaredField2 != null) {
                        declaredField2.setAccessible(true);
                    }
                    Object obj = declaredField2.get(view);
                    if (obj != null && (declaredField = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnTouchListener")) != null) {
                        declaredField.setAccessible(true);
                        Object obj2 = declaredField.get(obj);
                        obj2.getClass();
                        return (View.OnTouchListener) obj2;
                    }
                } catch (ClassNotFoundException unused) {
                    i90 i90Var = i90.a;
                } catch (IllegalAccessException unused2) {
                    i90 i90Var2 = i90.a;
                } catch (NoSuchFieldException unused3) {
                    i90 i90Var3 = i90.a;
                }
            }
            return null;
        } catch (Throwable th) {
            mt.a(g62.class, th);
            return null;
        }
    }

    public static final String h(View view) {
        CharSequence hint;
        String string;
        if (mt.a.contains(g62.class)) {
            return null;
        }
        try {
            if (view instanceof EditText) {
                hint = ((EditText) view).getHint();
            } else {
                hint = view instanceof TextView ? ((TextView) view).getHint() : null;
            }
            return (hint == null || (string = hint.toString()) == null) ? BuildConfig.FLAVOR : string;
        } catch (Throwable th) {
            mt.a(g62.class, th);
            return null;
        }
    }

    public static final ViewGroup i(View view) {
        if (!mt.a.contains(g62.class)) {
            try {
                ViewParent parent = view.getParent();
                if (parent instanceof ViewGroup) {
                    return (ViewGroup) parent;
                }
            } catch (Throwable th) {
                mt.a(g62.class, th);
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00f8 A[EDGE_INSN: B:42:0x00f8->B:43:0x00f9 BREAK  A[LOOP:0: B:32:0x00cc->B:38:0x00e6]] */
    public static final String j(View view) {
        CharSequence charSequenceValueOf;
        Object selectedItem;
        String string;
        if (mt.a.contains(g62.class)) {
            return null;
        }
        try {
            if (!(view instanceof TextView)) {
                if (!(view instanceof Spinner)) {
                    if (!(view instanceof DatePicker)) {
                        if (!(view instanceof TimePicker)) {
                            if (!(view instanceof RadioGroup)) {
                                if (!(view instanceof RatingBar)) {
                                    charSequenceValueOf = null;
                                    break;
                                }
                                charSequenceValueOf = String.valueOf(((RatingBar) view).getRating());
                            } else {
                                int checkedRadioButtonId = ((RadioGroup) view).getCheckedRadioButtonId();
                                int childCount = ((RadioGroup) view).getChildCount();
                                int i = 0;
                                while (true) {
                                    if (i >= childCount) {
                                        charSequenceValueOf = null;
                                        break;
                                    }
                                    View childAt = ((RadioGroup) view).getChildAt(i);
                                    if (childAt.getId() == checkedRadioButtonId && (childAt instanceof RadioButton)) {
                                        charSequenceValueOf = ((RadioButton) childAt).getText();
                                        break;
                                    }
                                    i++;
                                }
                            }
                        } else {
                            Integer currentHour = ((TimePicker) view).getCurrentHour();
                            currentHour.getClass();
                            int iIntValue = currentHour.intValue();
                            Integer currentMinute = ((TimePicker) view).getCurrentMinute();
                            currentMinute.getClass();
                            int iIntValue2 = currentMinute.intValue();
                            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                            charSequenceValueOf = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2)}, 2));
                        }
                    } else {
                        int year = ((DatePicker) view).getYear();
                        int month = ((DatePicker) view).getMonth();
                        int dayOfMonth = ((DatePicker) view).getDayOfMonth();
                        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                        charSequenceValueOf = String.format("%04d-%02d-%02d", Arrays.copyOf(new Object[]{Integer.valueOf(year), Integer.valueOf(month), Integer.valueOf(dayOfMonth)}, 3));
                    }
                } else {
                    if (((Spinner) view).getCount() <= 0 || (selectedItem = ((Spinner) view).getSelectedItem()) == null) {
                        charSequenceValueOf = null;
                        break;
                    }
                    charSequenceValueOf = selectedItem.toString();
                }
            } else {
                charSequenceValueOf = ((TextView) view).getText();
                if (view instanceof Switch) {
                    charSequenceValueOf = ((Switch) view).isChecked() ? "1" : "0";
                }
            }
            return (charSequenceValueOf == null || (string = charSequenceValueOf.toString()) == null) ? BuildConfig.FLAVOR : string;
        } catch (Throwable th) {
            mt.a(g62.class, th);
            return null;
        }
    }

    public static final void n(View view, JSONObject jSONObject) {
        if (mt.a.contains(g62.class)) {
            return;
        }
        try {
            view.getClass();
            try {
                String strJ = j(view);
                String strH = h(view);
                Object tag = view.getTag();
                CharSequence contentDescription = view.getContentDescription();
                jSONObject.put("classname", view.getClass().getCanonicalName());
                jSONObject.put("classtypebitmask", c(view));
                jSONObject.put("id", view.getId());
                if (mo1.o(view)) {
                    jSONObject.put("text", BuildConfig.FLAVOR);
                    jSONObject.put("is_user_input", true);
                } else {
                    jSONObject.put("text", h42.d(h42.H(strJ)));
                }
                jSONObject.put("hint", h42.d(h42.H(strH)));
                if (tag != null) {
                    jSONObject.put("tag", h42.d(h42.H(tag.toString())));
                }
                if (contentDescription != null) {
                    jSONObject.put("description", h42.d(h42.H(contentDescription.toString())));
                }
                jSONObject.put("dimension", a.e(view));
            } catch (JSONException unused) {
                i90 i90Var = i90.a;
            }
        } catch (Throwable th) {
            mt.a(g62.class, th);
        }
    }

    public final JSONObject e(View view) {
        if (mt.a.contains(this)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("top", view.getTop());
                jSONObject.put("left", view.getLeft());
                jSONObject.put("width", view.getWidth());
                jSONObject.put("height", view.getHeight());
                jSONObject.put("scrollx", view.getScrollX());
                jSONObject.put("scrolly", view.getScrollY());
                jSONObject.put("visibility", view.getVisibility());
                return jSONObject;
            } catch (JSONException e) {
                Log.e("g62", "Failed to create JSONObject for dimension.", e);
                return jSONObject;
            }
        } catch (Throwable th) {
            mt.a(this, th);
            return null;
        }
    }

    public final View k(float[] fArr, View view) {
        if (!mt.a.contains(this)) {
            try {
                l();
                Method method = c;
                if (method != null && view != null) {
                    try {
                        Object objInvoke = method.invoke(null, fArr, view);
                        objInvoke.getClass();
                        View view2 = (View) objInvoke;
                        if (view2.getId() > 0) {
                            Object parent = view2.getParent();
                            parent.getClass();
                            return (View) parent;
                        }
                    } catch (IllegalAccessException unused) {
                        i90 i90Var = i90.a;
                    } catch (InvocationTargetException unused2) {
                        i90 i90Var2 = i90.a;
                    }
                }
            } catch (Throwable th) {
                mt.a(this, th);
                return null;
            }
        }
        return null;
    }

    public final void l() {
        if (mt.a.contains(this)) {
            return;
        }
        try {
            if (c != null) {
                return;
            }
            try {
                Method declaredMethod = Class.forName("com.facebook.react.uimanager.TouchTargetHelper").getDeclaredMethod("findTouchTargetView", float[].class, ViewGroup.class);
                c = declaredMethod;
                if (declaredMethod == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                declaredMethod.setAccessible(true);
            } catch (ClassNotFoundException unused) {
                i90 i90Var = i90.a;
            } catch (NoSuchMethodException unused2) {
                i90 i90Var2 = i90.a;
            }
        } catch (Throwable th) {
            mt.a(this, th);
        }
    }

    public final boolean m(View view, View view2) {
        Set set = mt.a;
        if (set.contains(this)) {
            return false;
        }
        try {
            view.getClass();
            if (!Intrinsics.areEqual(view.getClass().getName(), "com.facebook.react.views.view.ReactViewGroup")) {
                return false;
            }
            float[] fArr = null;
            if (!set.contains(this)) {
                try {
                    int[] iArr = new int[2];
                    view.getLocationOnScreen(iArr);
                    fArr = new float[]{iArr[0], iArr[1]};
                } catch (Throwable th) {
                    mt.a(this, th);
                }
            }
            View viewK = k(fArr, view2);
            return viewK != null && viewK.getId() == view.getId();
        } catch (Throwable th2) {
            mt.a(this, th2);
            return false;
        }
    }
}
