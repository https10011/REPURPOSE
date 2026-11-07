package defpackage;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.graphics.ImageDecoder;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import android.view.View;
import com.google.android.gms.measurement.internal.zzoh;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class hd2 implements ac, OnCompleteListener, mn2, uu2, lh3 {
    public static volatile hd2 d;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public hd2(j52 j52Var) {
        this.a = 7;
        this.b = j52Var;
        i52 i52Var = new i52();
        i52Var.a = 0;
        this.c = i52Var;
    }

    public static hd2 a() {
        if (d == null) {
            synchronized (hd2.class) {
                try {
                    if (d == null) {
                        d = new hd2();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return d;
    }

    public static u6 f(ImageDecoder.Source source, int i, int i2, da1 da1Var) throws IOException {
        Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(source, new qz(i, i2, da1Var));
        if (l2.w(drawableDecodeDrawable)) {
            return new u6(l2.h(drawableDecodeDrawable), 0);
        }
        uq1.g(drawableDecodeDrawable, "Received unexpected drawable type for animated image, failing: ");
        return null;
    }

    public synchronized void b(nc2 nc2Var) {
        int i;
        int i2;
        ThreadPoolExecutor threadPoolExecutor;
        String strB = nc2Var.b();
        synchronized (this) {
            try {
                ArrayDeque arrayDeque = (ArrayDeque) this.b;
                if (rq0.h(arrayDeque)) {
                    i = 0;
                } else {
                    Iterator it = arrayDeque.iterator();
                    i = 0;
                    while (it.hasNext()) {
                        if (TextUtils.equals(((nc2) it.next()).b(), strB)) {
                            i++;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i <= 0) {
            synchronized (this) {
                ArrayDeque arrayDeque2 = (ArrayDeque) this.b;
                if (rq0.h(arrayDeque2)) {
                    i2 = 0;
                } else {
                    Iterator it2 = arrayDeque2.iterator();
                    i2 = 0;
                    while (it2.hasNext()) {
                        if (((nc2) it2.next()) instanceof yc2) {
                            i2++;
                        }
                    }
                }
                boolean z = i2 > 0;
                if (!z) {
                    ((ArrayDeque) this.b).add(nc2Var);
                    synchronized (this) {
                        try {
                            if (((ThreadPoolExecutor) this.c) == null) {
                                this.c = new ThreadPoolExecutor(2, 2, 0L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new h4(3));
                            }
                            threadPoolExecutor = (ThreadPoolExecutor) this.c;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            }
            threadPoolExecutor.execute(nc2Var);
        }
    }

    @Override // defpackage.lh3
    public Object c(ep1 ep1Var) throws IOException {
        Uri uri = (Uri) ep1Var.e;
        AtomicLong atomicLong = ti3.a;
        int iMyPid = Process.myPid();
        long id = Thread.currentThread().getId();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long andIncrement = ti3.a.getAndIncrement();
        int length = String.valueOf(iMyPid).length();
        int length2 = String.valueOf(id).length();
        StringBuilder sb = new StringBuilder(length + 15 + length2 + 1 + String.valueOf(jCurrentTimeMillis).length() + 1 + String.valueOf(andIncrement).length());
        sb.append(".mobstore_tmp-");
        sb.append(iMyPid);
        sb.append("-");
        sb.append(id);
        sb.append("-");
        sb.append(jCurrentTimeMillis);
        sb.append("-");
        sb.append(andIncrement);
        Uri uriBuild = uri.buildUpon().path(String.valueOf(uri.getPath()).concat(sb.toString())).build();
        xi3 xi3Var = (xi3) ep1Var.b;
        ArrayList arrayListM = ep1Var.M(xi3Var.c(uriBuild));
        dc2[] dc2VarArr = (dc2[]) this.c;
        if (dc2VarArr != null) {
            dc2VarArr[0].L(arrayListM);
        }
        try {
            OutputStream outputStream = (OutputStream) arrayListM.get(0);
            try {
                ((wk2) this.b).b(outputStream);
                dc2[] dc2VarArr2 = (dc2[]) this.c;
                if (dc2VarArr2 != null) {
                    dc2 dc2Var = dc2VarArr2[0];
                    if (((gi3) dc2Var.b) == null) {
                        throw new tn("Cannot sync underlying stream");
                    }
                    ((OutputStream) dc2Var.a).flush();
                    ((gi3) dc2Var.b).a.getFD().sync();
                }
                outputStream.close();
                xi3Var.e(uriBuild, uri);
                return null;
            } catch (Throwable th) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Exception e) {
            try {
                xi3Var.d(uriBuild);
            } catch (FileNotFoundException unused) {
            }
            if (e instanceof IOException) {
                throw ((IOException) e);
            }
            throw new IOException(e);
        }
    }

    @Override // defpackage.ac
    public ListenableFuture call() {
        f80 f80Var = (f80) this.b;
        int i = f80.e;
        if (f80Var.compareAndSet(e80.a, e80.c)) {
            return ((ac) this.c).call();
        }
        sn0 sn0Var = sn0.v;
        return sn0Var != null ? sn0Var : new sn0();
    }

    @Override // defpackage.uu2
    public ep1 d(qt2 qt2Var) {
        ep1 ep1Var = (ep1) this.b;
        ep1Var.P((String) this.c, qt2Var);
        return ep1Var;
    }

    public synchronized void e(nc2 nc2Var) {
        ((ArrayDeque) this.b).remove(nc2Var);
    }

    public View g(int i, int i2, int i3, int i4) {
        i52 i52Var = (i52) this.c;
        j52 j52Var = (j52) this.b;
        int iO = j52Var.o();
        int iE = j52Var.e();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View viewM = j52Var.m(i);
            int iG = j52Var.g(viewM);
            int iP = j52Var.p(viewM);
            i52Var.b = iO;
            i52Var.c = iE;
            i52Var.d = iG;
            i52Var.e = iP;
            if (i3 != 0) {
                i52Var.a = i3;
                if (i52Var.a()) {
                    return viewM;
                }
            }
            if (i4 != 0) {
                i52Var.a = i4;
                if (i52Var.a()) {
                    view = viewM;
                }
            }
            i += i5;
        }
        return view;
    }

    public boolean h(View view) {
        i52 i52Var = (i52) this.c;
        j52 j52Var = (j52) this.b;
        int iO = j52Var.o();
        int iE = j52Var.e();
        int iG = j52Var.g(view);
        int iP = j52Var.p(view);
        i52Var.b = iO;
        i52Var.c = iE;
        i52Var.d = iG;
        i52Var.e = iP;
        i52Var.a = 24579;
        return i52Var.a();
    }

    public void i(Throwable th) {
        w93 w93Var = (w93) this.c;
        w93Var.D();
        y53 y53Var = (y53) w93Var.a;
        w93Var.w = false;
        w93Var.c0().add((zzoh) this.b);
        if (w93Var.W > ((Integer) h13.v0.a(null)).intValue()) {
            w93Var.W = 1;
            c33 c33Var = y53Var.f;
            y53.l(c33Var);
            c33Var.w.c(c33.M(y53Var.q().K()), c33.M(th.toString()), "registerTriggerAsync failed. May try later. App ID, throwable");
            return;
        }
        c33 c33Var2 = y53Var.f;
        y53.l(c33Var2);
        c33Var2.w.d("registerTriggerAsync failed. App ID, delay in seconds, throwable", c33.M(y53Var.q().K()), c33.M(String.valueOf(w93Var.W)), c33.M(th.toString()));
        int i = w93Var.W;
        if (w93Var.X == null) {
            w93Var.X = new x73(w93Var, y53Var, 1);
        }
        w93Var.X.b(((long) i) * 1000);
        int i2 = w93Var.W;
        w93Var.W = i2 + i2;
    }

    /* JADX WARN: Code duplicated, block: B:112:0x010c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x0105 A[Catch: IOException -> 0x008d, XmlPullParserException -> 0x0090, TryCatch #2 {IOException -> 0x008d, XmlPullParserException -> 0x0090, blocks: (B:19:0x005e, B:96:0x0205, B:27:0x0070, B:28:0x007e, B:30:0x0083, B:37:0x0093, B:45:0x00ad, B:40:0x009c, B:43:0x00a5, B:46:0x00bb, B:50:0x00ca, B:52:0x00d2, B:53:0x00dc, B:62:0x0105, B:63:0x010c, B:64:0x0124, B:56:0x00e5, B:58:0x00ed, B:59:0x00fb, B:65:0x0125, B:67:0x012d, B:68:0x013b, B:71:0x0145, B:72:0x0150, B:73:0x0168, B:74:0x0169, B:77:0x0173, B:78:0x017e, B:79:0x0196, B:80:0x0197, B:82:0x019f, B:83:0x01a8, B:86:0x01b2, B:87:0x01bc, B:88:0x01d4, B:89:0x01d5, B:92:0x01df, B:93:0x01e9, B:94:0x0201, B:95:0x0202), top: B:104:0x005e }] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void j(Context context, XmlResourceParser xmlResourceParser) {
        pr prVar = new pr();
        int attributeCount = xmlResourceParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlResourceParser.getAttributeName(i);
            String attributeValue = xmlResourceParser.getAttributeValue(i);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                try {
                    int eventType = xmlResourceParser.getEventType();
                    kr krVarD = null;
                    while (eventType != 1) {
                        if (eventType == 0) {
                            xmlResourceParser.getName();
                        } else if (eventType == 2) {
                            String name = xmlResourceParser.getName();
                            switch (name.hashCode()) {
                                case -2025855158:
                                    if (name.equals("Layout")) {
                                        if (krVarD == null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        krVarD.d.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    } else {
                                        continue;
                                    }
                                    break;
                                case -1984451626:
                                    if (name.equals("Motion")) {
                                        if (krVarD == null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        krVarD.c.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    } else {
                                        continue;
                                    }
                                    break;
                                case -1962203927:
                                    if (name.equals("ConstraintOverride")) {
                                        krVarD = pr.d(context, Xml.asAttributeSet(xmlResourceParser), true);
                                    }
                                    break;
                                case -1269513683:
                                    if (name.equals("PropertySet")) {
                                        if (krVarD == null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        krVarD.b.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    } else {
                                        continue;
                                    }
                                    break;
                                case -1238332596:
                                    if (name.equals("Transform")) {
                                        if (krVarD == null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        krVarD.e.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    } else {
                                        continue;
                                    }
                                    break;
                                case -71750448:
                                    if (name.equals("Guideline")) {
                                        krVarD = pr.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                        krVarD.d.a = true;
                                    }
                                    break;
                                case 366511058:
                                    if (name.equals("CustomMethod")) {
                                        if (krVarD != null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        dr.a(context, xmlResourceParser, krVarD.f);
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 1331510167:
                                    if (name.equals("Barrier")) {
                                        krVarD = pr.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                        krVarD.d.g0 = 1;
                                    }
                                    break;
                                case 1791837707:
                                    if (name.equals("CustomAttribute")) {
                                        if (krVarD != null) {
                                            throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                        }
                                        dr.a(context, xmlResourceParser, krVarD.f);
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 1803088381:
                                    if (name.equals("Constraint")) {
                                        krVarD = pr.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    }
                                    break;
                            }
                        } else if (eventType == 3) {
                            String lowerCase = xmlResourceParser.getName().toLowerCase(Locale.ROOT);
                            switch (lowerCase.hashCode()) {
                                case -2075718416:
                                    if (lowerCase.equals("guideline")) {
                                        prVar.c.put(Integer.valueOf(krVarD.a), krVarD);
                                        krVarD = null;
                                    }
                                    break;
                                case -190376483:
                                    if (lowerCase.equals("constraint")) {
                                        prVar.c.put(Integer.valueOf(krVarD.a), krVarD);
                                        krVarD = null;
                                    }
                                    break;
                                case 426575017:
                                    if (lowerCase.equals("constraintoverride")) {
                                        prVar.c.put(Integer.valueOf(krVarD.a), krVarD);
                                        krVarD = null;
                                    }
                                    break;
                                case 2146106725:
                                    if (lowerCase.equals("constraintset")) {
                                        ((SparseArray) this.c).put(identifier, prVar);
                                        return;
                                    }
                                    break;
                                    break;
                                default:
                                    break;
                            }
                        }
                        eventType = xmlResourceParser.next();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (XmlPullParserException e2) {
                    e2.printStackTrace();
                }
                ((SparseArray) this.c).put(identifier, prVar);
                return;
            }
        }
    }

    public rc2 k() {
        return new rc2(12, Collections.unmodifiableMap((HashMap) this.b), Collections.unmodifiableMap((HashMap) this.c));
    }

    public void l(Enum r2, Object obj) {
        ((HashMap) this.b).put(r2, obj);
        ((HashMap) this.c).put(obj, r2);
    }

    public void onComplete(Task task) {
        yb2 yb2Var = (yb2) this.b;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.c;
        synchronized (yb2Var.f) {
            yb2Var.e.remove(taskCompletionSource);
        }
    }

    @Override // defpackage.mn2
    public void s(an2 an2Var) {
        rd2 rd2Var = (rd2) this.b;
        mq2 mq2Var = (mq2) an2Var;
        if (TextUtils.isEmpty(mq2Var.c0)) {
            ox1.x((ox1) this.c, mq2Var, rd2Var, this);
        } else {
            rd2Var.z(new p11(mq2Var.c0, mq2Var.b0, mq2Var.a(), 15));
        }
    }

    public String toString() {
        switch (this.a) {
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                return ((ac) this.c).toString();
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                StringBuilder sb = new StringBuilder("GetFriendsResponse{groups=");
                sb.append((ArrayList) this.b);
                sb.append(", nextPageRequestToken='");
                return ts.l(sb, (String) this.c, "'}");
            case oc1.STRING_FIELD_NUMBER /* 5 */:
            default:
                return super.toString();
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                String string = "[ ";
                if (((as1) this.b) != null) {
                    for (int i = 0; i < 9; i++) {
                        StringBuilder sbM = ts.m(string);
                        sbM.append(((as1) this.b).v[i]);
                        sbM.append(" ");
                        string = sbM.toString();
                    }
                }
                return string + "] " + ((as1) this.b);
        }
    }

    @Override // defpackage.mn2
    public void zza(String str) {
        ((rd2) this.b).a(kv.m0(str));
    }

    public /* synthetic */ hd2(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public hd2(wk2 wk2Var) {
        this.a = 13;
        this.b = wk2Var;
    }

    public hd2() {
        this.a = 0;
        this.b = new ArrayDeque();
    }

    public hd2(ox1 ox1Var, rd2 rd2Var) {
        this.a = 9;
        this.b = rd2Var;
        Objects.requireNonNull(ox1Var);
        this.c = ox1Var;
    }

    public hd2(w93 w93Var, zzoh zzohVar) {
        this.a = 11;
        this.b = zzohVar;
        this.c = w93Var;
    }

    public hd2(wc1 wc1Var) {
        this.a = 6;
        this.c = wc1Var;
    }

    public /* synthetic */ hd2(int i) {
        this.a = i;
    }
}
