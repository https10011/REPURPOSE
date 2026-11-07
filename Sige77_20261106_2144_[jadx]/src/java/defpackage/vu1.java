package defpackage;

import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TimePicker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class vu1 {
    public static final vu1 a = new vu1();
    public static final List b = jo.d(Switch.class, Spinner.class, DatePicker.class, TimePicker.class, RadioGroup.class, RatingBar.class, EditText.class, AdapterView.class);

    public static final ArrayList a(View view) {
        if (mt.a.contains(vu1.class)) {
            return null;
        }
        try {
            view.getClass();
            ArrayList arrayList = new ArrayList();
            Iterator it = b.iterator();
            while (it.hasNext()) {
                if (((Class) it.next()).isInstance(view)) {
                    return arrayList;
                }
            }
            if (view.isClickable()) {
                arrayList.add(view);
            }
            ArrayList arrayListB = g62.b(view);
            int size = arrayListB.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayListB.get(i);
                i++;
                arrayList.addAll(a((View) obj));
            }
            return arrayList;
        } catch (Throwable th) {
            mt.a(vu1.class, th);
            return null;
        }
    }

    public static final JSONObject b(View view, View view2) {
        if (mt.a.contains(vu1.class)) {
            return null;
        }
        try {
            view.getClass();
            JSONObject jSONObject = new JSONObject();
            if (view == view2) {
                try {
                    jSONObject.put("is_interacted", true);
                } catch (JSONException unused) {
                }
            }
            e(view, jSONObject);
            JSONArray jSONArray = new JSONArray();
            ArrayList arrayListB = g62.b(view);
            int size = arrayListB.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayListB.get(i);
                i++;
                jSONArray.put(b((View) obj, view2));
            }
            jSONObject.put("childviews", jSONArray);
            return jSONObject;
        } catch (Throwable th) {
            mt.a(vu1.class, th);
            return null;
        }
    }

    public static final String d(View view) {
        if (mt.a.contains(vu1.class)) {
            return null;
        }
        try {
            view.getClass();
            String strJ = g62.j(view);
            if (strJ.length() > 0) {
                return strJ;
            }
            String strJoin = TextUtils.join(" ", a.c(view));
            strJoin.getClass();
            return strJoin;
        } catch (Throwable th) {
            mt.a(vu1.class, th);
            return null;
        }
    }

    public static final void e(View view, JSONObject jSONObject) {
        if (mt.a.contains(vu1.class)) {
            return;
        }
        try {
            view.getClass();
            try {
                String strJ = g62.j(view);
                String strH = g62.h(view);
                jSONObject.put("classname", view.getClass().getSimpleName());
                jSONObject.put("classtypebitmask", g62.c(view));
                if (strJ.length() > 0) {
                    jSONObject.put("text", strJ);
                }
                if (strH.length() > 0) {
                    jSONObject.put("hint", strH);
                }
                if (view instanceof EditText) {
                    jSONObject.put("inputtype", ((EditText) view).getInputType());
                }
            } catch (JSONException unused) {
            }
        } catch (Throwable th) {
            mt.a(vu1.class, th);
        }
    }

    public final ArrayList c(View view) {
        if (mt.a.contains(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayListB = g62.b(view);
            int size = arrayListB.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayListB.get(i);
                i++;
                View view2 = (View) obj;
                String strJ = g62.j(view2);
                if (strJ.length() > 0) {
                    arrayList.add(strJ);
                }
                arrayList.addAll(c(view2));
            }
            return arrayList;
        } catch (Throwable th) {
            mt.a(this, th);
            return null;
        }
    }
}
