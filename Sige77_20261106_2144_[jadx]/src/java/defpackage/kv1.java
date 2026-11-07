package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class kv1 extends MenuInflater {
    public static final Class[] e;
    public static final Class[] f;
    public final Object[] a;
    public final Object[] b;
    public final Context c;
    public Object d;

    static {
        Class[] clsArr = {Context.class};
        e = clsArr;
        f = clsArr;
    }

    public kv1(Context context) {
        super(context);
        this.c = context;
        Object[] objArr = {context};
        this.a = objArr;
        this.b = objArr;
    }

    public static Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    public final void b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        int i;
        ColorStateList colorStateList;
        int resourceId;
        jv1 jv1Var = new jv1(this, menu);
        int eventType = xmlPullParser.getEventType();
        do {
            i = 2;
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                    break;
                } else {
                    uq1.m("Expecting menu, got ".concat(name));
                    return;
                }
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        boolean z = false;
        boolean z2 = false;
        String str = null;
        while (!z) {
            if (eventType == 1) {
                uq1.m("Unexpected end of document");
                return;
            }
            Menu menu2 = jv1Var.a;
            if (eventType == i) {
                if (!z2) {
                    String name2 = xmlPullParser.getName();
                    boolean zEquals = name2.equals("group");
                    Context context = this.c;
                    if (zEquals) {
                        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, we1.p);
                        jv1Var.b = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                        jv1Var.c = typedArrayObtainStyledAttributes.getInt(3, 0);
                        jv1Var.d = typedArrayObtainStyledAttributes.getInt(4, 0);
                        jv1Var.e = typedArrayObtainStyledAttributes.getInt(5, 0);
                        jv1Var.f = typedArrayObtainStyledAttributes.getBoolean(2, true);
                        jv1Var.g = typedArrayObtainStyledAttributes.getBoolean(0, true);
                        typedArrayObtainStyledAttributes.recycle();
                    } else if (name2.equals("item")) {
                        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, we1.q);
                        jv1Var.i = typedArrayObtainStyledAttributes2.getResourceId(2, 0);
                        jv1Var.j = (typedArrayObtainStyledAttributes2.getInt(5, jv1Var.c) & (-65536)) | (typedArrayObtainStyledAttributes2.getInt(6, jv1Var.d) & 65535);
                        jv1Var.k = typedArrayObtainStyledAttributes2.getText(7);
                        jv1Var.l = typedArrayObtainStyledAttributes2.getText(8);
                        jv1Var.m = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
                        String string = typedArrayObtainStyledAttributes2.getString(9);
                        jv1Var.n = string == null ? (char) 0 : string.charAt(0);
                        jv1Var.o = typedArrayObtainStyledAttributes2.getInt(16, 4096);
                        String string2 = typedArrayObtainStyledAttributes2.getString(10);
                        jv1Var.p = string2 == null ? (char) 0 : string2.charAt(0);
                        jv1Var.q = typedArrayObtainStyledAttributes2.getInt(20, 4096);
                        if (typedArrayObtainStyledAttributes2.hasValue(11)) {
                            jv1Var.r = typedArrayObtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                        } else {
                            jv1Var.r = jv1Var.e;
                        }
                        jv1Var.s = typedArrayObtainStyledAttributes2.getBoolean(3, false);
                        jv1Var.t = typedArrayObtainStyledAttributes2.getBoolean(4, jv1Var.f);
                        jv1Var.u = typedArrayObtainStyledAttributes2.getBoolean(1, jv1Var.g);
                        jv1Var.v = typedArrayObtainStyledAttributes2.getInt(21, -1);
                        jv1Var.y = typedArrayObtainStyledAttributes2.getString(12);
                        jv1Var.w = typedArrayObtainStyledAttributes2.getResourceId(13, 0);
                        jv1Var.x = typedArrayObtainStyledAttributes2.getString(15);
                        String string3 = typedArrayObtainStyledAttributes2.getString(14);
                        boolean z3 = string3 != null;
                        if (z3 && jv1Var.w == 0 && jv1Var.x == null) {
                            jv1Var.z = (p31) jv1Var.a(string3, f, this.b);
                        } else {
                            if (z3) {
                                Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                            }
                            jv1Var.z = null;
                        }
                        jv1Var.A = typedArrayObtainStyledAttributes2.getText(17);
                        jv1Var.B = typedArrayObtainStyledAttributes2.getText(22);
                        if (typedArrayObtainStyledAttributes2.hasValue(19)) {
                            jv1Var.D = i30.b(typedArrayObtainStyledAttributes2.getInt(19, -1), jv1Var.D);
                        } else {
                            jv1Var.D = null;
                        }
                        if (typedArrayObtainStyledAttributes2.hasValue(18)) {
                            if (!typedArrayObtainStyledAttributes2.hasValue(18) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = sp0.k(context, resourceId)) == null) {
                                colorStateList = typedArrayObtainStyledAttributes2.getColorStateList(18);
                            }
                            jv1Var.C = colorStateList;
                        } else {
                            jv1Var.C = null;
                        }
                        typedArrayObtainStyledAttributes2.recycle();
                        jv1Var.h = false;
                        xmlPullParser = xmlPullParser;
                    } else if (name2.equals("menu")) {
                        jv1Var.h = true;
                        SubMenu subMenuAddSubMenu = menu2.addSubMenu(jv1Var.b, jv1Var.i, jv1Var.j, jv1Var.k);
                        jv1Var.b(subMenuAddSubMenu.getItem());
                        xmlPullParser = xmlPullParser;
                        b(xmlPullParser, attributeSet, subMenuAddSubMenu);
                    } else {
                        xmlPullParser = xmlPullParser;
                        str = name2;
                        z2 = true;
                    }
                }
                z = z;
            } else if (eventType != 3) {
                z = z;
            } else {
                String name3 = xmlPullParser.getName();
                if (z2 && name3.equals(str)) {
                    xmlPullParser = xmlPullParser;
                    z2 = false;
                    str = null;
                } else {
                    if (name3.equals("group")) {
                        jv1Var.b = 0;
                        jv1Var.c = 0;
                        jv1Var.d = 0;
                        jv1Var.e = 0;
                        jv1Var.f = true;
                        jv1Var.g = true;
                    } else if (name3.equals("item")) {
                        if (!jv1Var.h) {
                            p31 p31Var = jv1Var.z;
                            if (p31Var == null || !p31Var.b.hasSubMenu()) {
                                jv1Var.h = true;
                                jv1Var.b(menu2.add(jv1Var.b, jv1Var.i, jv1Var.j, jv1Var.k));
                            } else {
                                jv1Var.h = true;
                                jv1Var.b(menu2.addSubMenu(jv1Var.b, jv1Var.i, jv1Var.j, jv1Var.k).getItem());
                            }
                        }
                    } else if (name3.equals("menu")) {
                        z = true;
                    }
                    z = z;
                }
            }
            eventType = xmlPullParser.next();
            i = 2;
            z = z;
            z2 = z2;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof i31)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z = false;
        try {
            try {
                layout = this.c.getResources().getLayout(i);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof i31) {
                    i31 i31Var = (i31) menu;
                    if (!i31Var.p) {
                        i31Var.w();
                        z = true;
                    }
                }
                b(layout, attributeSetAsAttributeSet, menu);
                if (z) {
                    ((i31) menu).v();
                }
                layout.close();
            } catch (IOException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            } catch (XmlPullParserException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } catch (Throwable th) {
            if (z) {
                ((i31) menu).v();
            }
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}
