package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import java.io.IOException;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class qt1 {
    public final int a;
    public final op1 b;
    public final int[][] c;
    public final op1[] d;
    public final ot1 e;
    public final ot1 f;
    public final ot1 g;
    public final ot1 h;

    public qt1(pt1 pt1Var) {
        this.a = pt1Var.a;
        this.b = pt1Var.b;
        this.c = pt1Var.c;
        this.d = pt1Var.d;
        this.e = pt1Var.e;
        this.f = pt1Var.f;
        this.g = pt1Var.g;
        this.h = pt1Var.h;
    }

    public static void a(pt1 pt1Var, Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlResourceParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth && xmlResourceParser.getName().equals("item")) {
                Resources resources = context.getResources();
                int[] iArr = ue1.t;
                TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                op1 op1VarC = op1.a(typedArrayObtainAttributes.getResourceId(0, 0), typedArrayObtainAttributes.getResourceId(1, 0), context).c();
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr2 = new int[attributeCount];
                int i = 0;
                for (int i2 = 0; i2 < attributeCount; i2++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i2);
                    if (attributeNameResource != 2130969639 && attributeNameResource != 2130969650) {
                        int i3 = i + 1;
                        if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr2[i] = attributeNameResource;
                        i = i3;
                    }
                }
                pt1Var.a(StateSet.trimStateSet(iArr2, i), op1VarC);
            }
        }
    }

    public static qt1 b(Context context, TypedArray typedArray, int i) {
        int next;
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId == 0 || !Objects.equals(context.getResources().getResourceTypeName(resourceId), "xml")) {
            return null;
        }
        pt1 pt1Var = new pt1();
        pt1Var.b();
        try {
            XmlResourceParser xml = context.getResources().getXml(resourceId);
            try {
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                if (xml.getName().equals("selector")) {
                    a(pt1Var, context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                xml.close();
                if (pt1Var.a == 0) {
                    return null;
                }
                return new qt1(pt1Var);
            } catch (Throwable th) {
                if (xml != null) {
                    try {
                        xml.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
            pt1Var.b();
        }
    }

    public final op1 c() {
        op1 op1Var = this.b;
        ot1 ot1Var = this.h;
        ot1 ot1Var2 = this.g;
        ot1 ot1Var3 = this.f;
        ot1 ot1Var4 = this.e;
        if (ot1Var4 == null && ot1Var3 == null && ot1Var2 == null && ot1Var == null) {
            return op1Var;
        }
        qf2 qf2VarG = op1Var.g();
        if (ot1Var4 != null) {
            qf2VarG.e = ot1Var4.b;
        }
        if (ot1Var3 != null) {
            qf2VarG.f = ot1Var3.b;
        }
        if (ot1Var2 != null) {
            qf2VarG.h = ot1Var2.b;
        }
        if (ot1Var != null) {
            qf2VarG.g = ot1Var.b;
        }
        return qf2VarG.c();
    }

    public final boolean d() {
        ot1 ot1Var;
        ot1 ot1Var2;
        ot1 ot1Var3;
        ot1 ot1Var4;
        return this.a > 1 || ((ot1Var = this.e) != null && ot1Var.a > 1) || (((ot1Var2 = this.f) != null && ot1Var2.a > 1) || (((ot1Var3 = this.g) != null && ot1Var3.a > 1) || ((ot1Var4 = this.h) != null && ot1Var4.a > 1)));
    }
}
