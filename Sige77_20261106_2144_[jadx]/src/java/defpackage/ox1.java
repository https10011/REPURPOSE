package defpackage;

import android.app.Application;
import android.app.PendingIntent;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Looper;
import android.preference.PreferenceManager;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.firebase-auth-api.zzahd;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.auth.zzc;
import com.hjq.toast.BuildConfig;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ox1 implements px1, a41, hf, yj, s81, j52, gf, OnFailureListener, pf3, h33 {
    public static final String[] b = {"_data"};
    public static final Object c = new Object();
    public static ByteBuffer d;
    public final Object a;

    /* JADX WARN: Code duplicated, block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00b2 A[Catch: IOException -> 0x00ae, TRY_LEAVE, TryCatch #9 {IOException -> 0x00ae, blocks: (B:39:0x00aa, B:43:0x00b2), top: B:93:0x00aa }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00d9 A[Catch: IOException -> 0x00d5, TRY_LEAVE, TryCatch #3 {IOException -> 0x00d5, blocks: (B:53:0x00d1, B:57:0x00d9), top: B:85:0x00d1 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x00e6 A[Catch: IOException -> 0x00ea, TRY_ENTER, TRY_LEAVE, TryCatch #1 {IOException -> 0x00ea, blocks: (B:47:0x00bf, B:61:0x00e6), top: B:83:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x00ff A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x0101 A[Catch: IOException -> 0x00fd, TRY_LEAVE, TryCatch #8 {IOException -> 0x00fd, blocks: (B:68:0x00f9, B:72:0x0101), top: B:91:0x00f9 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x010e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x00f9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.nio.channels.spi.AbstractInterruptibleChannel] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.RandomAccessFile] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.nio.channels.spi.AbstractInterruptibleChannel] */
    public ox1(String str) throws Throwable {
        ?? r0;
        ?? r1;
        Exception e;
        ?? r6;
        RandomAccessFile randomAccessFile;
        Object obj;
        FileChannel channel;
        RandomAccessFile randomAccessFile2;
        FileLock fileLock;
        File file = new File(str);
        this.a = file;
        if (!file.exists()) {
            try {
                if (file.createNewFile()) {
                    cc2.e("EncryptFile created");
                }
            } catch (Exception e2) {
                cc2.c(Log.getStackTraceString(e2));
            }
        }
        if (d == null) {
            d = ByteBuffer.allocate(32808);
        }
        FileLock fileLockLock = null;
        try {
            try {
                try {
                    if (((File) this.a).length() < 8192) {
                        RandomAccessFile randomAccessFile3 = new RandomAccessFile((File) this.a, "rw");
                        try {
                            channel = randomAccessFile3.getChannel();
                            try {
                                fileLockLock = channel.lock();
                                d.putInt(0, 0);
                                d.putInt(4, ((Integer) ld2.f().a.d().first).intValue());
                                for (int i = 0; i < 8192; i += 4) {
                                    d.putInt((i + 10) * 4, i);
                                }
                                randomAccessFile3.seek(0L);
                                randomAccessFile3.write(d.array());
                                randomAccessFile2 = randomAccessFile3;
                            } catch (Exception e3) {
                                e = e3;
                                FileLock fileLock2 = fileLockLock;
                                fileLockLock = channel;
                                fileLock = fileLock2;
                                FileLock fileLock3 = fileLockLock;
                                fileLockLock = fileLock;
                                r6 = fileLock3;
                                randomAccessFile = randomAccessFile3;
                                cc2.c(Log.getStackTraceString(e));
                                if (fileLockLock != null) {
                                    try {
                                        fileLockLock.release();
                                        if (r6 != 0) {
                                            r6.close();
                                        }
                                    } catch (IOException e4) {
                                        cc2.c(Log.getStackTraceString(e4));
                                        if (randomAccessFile == null) {
                                            randomAccessFile.close();
                                        }
                                        return;
                                    }
                                } else if (r6 != 0) {
                                    r6.close();
                                }
                                if (randomAccessFile == null) {
                                    return;
                                } else {
                                    randomAccessFile.close();
                                }
                            }
                        } catch (Exception e5) {
                            e = e5;
                            fileLock = null;
                        } catch (Throwable th) {
                            th = th;
                            this = null;
                            obj = randomAccessFile3;
                            Object obj2 = obj;
                            r0 = this;
                            th = th;
                            r1 = obj2;
                            if (0 != 0) {
                                try {
                                    fileLockLock.release();
                                    if (r0 != 0) {
                                        r0.close();
                                    }
                                } catch (IOException e6) {
                                    cc2.c(Log.getStackTraceString(e6));
                                    if (r1 == 0) {
                                        throw th;
                                    }
                                    try {
                                        r1.close();
                                        throw th;
                                    } catch (IOException e7) {
                                        cc2.c(Log.getStackTraceString(e7));
                                        throw th;
                                    }
                                }
                            } else if (r0 != 0) {
                                r0.close();
                            }
                            if (r1 == 0) {
                                throw th;
                            }
                            r1.close();
                            throw th;
                        }
                    } else {
                        channel = null;
                        randomAccessFile2 = null;
                    }
                    if (fileLockLock != null) {
                        try {
                            fileLockLock.release();
                            if (channel != null) {
                                channel.close();
                            }
                        } catch (IOException e8) {
                            cc2.c(Log.getStackTraceString(e8));
                        }
                    } else if (channel != null) {
                        channel.close();
                    }
                    if (randomAccessFile2 != null) {
                        randomAccessFile2.close();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    obj = file;
                }
            } catch (Exception e9) {
                e = e9;
                r6 = 0;
                randomAccessFile = null;
            } catch (Throwable th3) {
                th = th3;
                r0 = 0;
                r1 = 0;
                if (0 != 0) {
                    fileLockLock.release();
                    if (r0 != 0) {
                        r0.close();
                    }
                } else if (r0 != 0) {
                    r0.close();
                }
                if (r1 == 0) {
                    throw th;
                }
                r1.close();
                throw th;
            }
        } catch (IOException e10) {
            cc2.c(Log.getStackTraceString(e10));
        }
    }

    public static ox1 r() {
        Pattern patternCompile = Pattern.compile("[.-]");
        md3 md3Var = new md3(patternCompile);
        Matcher matcher = patternCompile.matcher(BuildConfig.FLAVOR);
        matcher.getClass();
        if (matcher.matches()) {
            e.g(xi0.D("The pattern may not match the empty string: %s", md3Var));
            return null;
        }
        bf3 bf3Var = new bf3();
        bf3Var.a = md3Var;
        return new ox1(bf3Var);
    }

    public static ox1 s(int i) {
        return new ox1(tr3.a(xf3.a(i)));
    }

    public static void w(ox1 ox1Var, rd2 rd2Var, bq2 bq2Var, qp0 qp0Var) {
        qq qqVar = (qq) ox1Var.a;
        p11 p11Var = new p11(ox1Var, rd2Var, qp0Var);
        qqVar.getClass();
        wm2 wm2Var = (wm2) qqVar.a;
        sp0.K(wm2Var.q("/signupNewUser", (String) qqVar.f), bq2Var, p11Var, new zp2(), (ep1) wm2Var.b);
    }

    public static void x(ox1 ox1Var, mq2 mq2Var, rd2 rd2Var, mn2 mn2Var) {
        if (!mq2Var.a && TextUtils.isEmpty(mq2Var.Y)) {
            ox1Var.z(new zzahd(mq2Var.c, mq2Var.b, Long.valueOf(mq2Var.d)), mq2Var.i, mq2Var.f, Boolean.valueOf(mq2Var.v), mq2Var.a(), rd2Var, mn2Var);
            return;
        }
        rd2Var.c(new ep1(mq2Var.a ? new Status(17012, (String) null, (PendingIntent) null, (ConnectionResult) null) : kv.m0(mq2Var.Y), mq2Var.a(), mq2Var.e, mq2Var.a0));
    }

    public void A(String str, mn2 mn2Var) {
        gu2.l(str);
        zzahd zzahdVarR = zzahd.R(str);
        if (zzahdVarR.zzg()) {
            mn2Var.s(zzahdVarR);
            return;
        }
        wy2 wy2Var = new wy2(zzahdVarR.a);
        qq qqVar = (qq) this.a;
        pv2 pv2Var = new pv2();
        pv2Var.a = mn2Var;
        wm2 wm2Var = (wm2) qqVar.c;
        sp0.K(wm2Var.q("/token", (String) qqVar.f), wy2Var, pv2Var, new zzahd(), (ep1) wm2Var.b);
    }

    public void B(mo2 mo2Var, rd2 rd2Var) {
        qq qqVar = (qq) this.a;
        dc2 dc2Var = new dc2(this, rd2Var, false);
        qqVar.getClass();
        wm2 wm2Var = (wm2) qqVar.a;
        sp0.K(wm2Var.q("/emailLinkSignin", (String) qqVar.f), mo2Var, dc2Var, new oo2(), (ep1) wm2Var.b);
    }

    @Override // defpackage.gf
    public void a(ConnectionResult connectionResult) {
        ((tj0) this.a).a(connectionResult);
    }

    @Override // defpackage.pf3
    public void b(String str, String str2, Bundle bundle) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        w93 w93Var = (w93) this.a;
        if (zIsEmpty) {
            w93Var.I("auto", "_err", bundle);
        } else {
            w93Var.getClass();
            uq1.q("Unexpected call on client side");
        }
    }

    @Override // defpackage.hf
    public void c(ConnectionResult connectionResult) {
        boolean z = connectionResult.b == 0;
        jf jfVar = (jf) this.a;
        if (z) {
            jfVar.j(null, jfVar.k());
            return;
        }
        gf gfVar = jfVar.p;
        if (gfVar != null) {
            gfVar.a(connectionResult);
        }
    }

    @Override // defpackage.h33
    public /* synthetic */ void d(String str, int i, Throwable th, byte[] bArr, Map map) {
        ((if3) this.a).B(str, i, th, bArr, map);
    }

    @Override // defpackage.j52
    public int e() {
        xf1 xf1Var = (xf1) this.a;
        return xf1Var.n - xf1Var.F();
    }

    @Override // defpackage.a41
    public void f(i31 i31Var, boolean z) {
        j8 j8Var;
        k8 k8Var = (k8) this.a;
        i31 i31VarK = i31Var.k();
        int i = 0;
        boolean z2 = i31VarK != i31Var;
        if (z2) {
            i31Var = i31VarK;
        }
        j8[] j8VarArr = k8Var.y0;
        int length = j8VarArr != null ? j8VarArr.length : 0;
        while (true) {
            if (i < length) {
                j8Var = j8VarArr[i];
                if (j8Var != null && j8Var.h == i31Var) {
                    break;
                } else {
                    i++;
                }
            } else {
                j8Var = null;
                break;
            }
        }
        if (j8Var != null) {
            if (!z2) {
                k8Var.t(j8Var, z);
            } else {
                k8Var.r(j8Var.a, j8Var, i31VarK);
                k8Var.t(j8Var, true);
            }
        }
    }

    @Override // defpackage.j52
    public int g(View view) {
        return (view.getLeft() - ((yf1) view.getLayoutParams()).b.left) - ((ViewGroup.MarginLayoutParams) ((yf1) view.getLayoutParams())).leftMargin;
    }

    @Override // defpackage.yj
    public Type h() {
        return (Type) this.a;
    }

    @Override // defpackage.px1
    public Cursor i(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        return ((ContentResolver) this.a).query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, b, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, null);
    }

    /* JADX WARN: Code duplicated, block: B:107:0x013f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x011d A[Catch: IOException -> 0x0119, TRY_LEAVE, TryCatch #0 {IOException -> 0x0119, blocks: (B:64:0x0115, B:68:0x011d), top: B:92:0x0115 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x012a A[Catch: IOException -> 0x00eb, TRY_ENTER, TRY_LEAVE, TryCatch #5 {IOException -> 0x00eb, blocks: (B:44:0x00e7, B:72:0x012a), top: B:101:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x0145 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x0147 A[Catch: IOException -> 0x0143, TRY_LEAVE, TryCatch #10 {IOException -> 0x0143, blocks: (B:79:0x013f, B:83:0x0147), top: B:107:0x013f }] */
    /* JADX WARN: Code duplicated, block: B:98:0x0154 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public String j() throws Throwable {
        FileChannel fileChannel;
        FileLock fileLock;
        RandomAccessFile randomAccessFile;
        FileChannel channel;
        FileLock fileLock2;
        byte[] bArr;
        File file = (File) this.a;
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = ((hf2) ((f91) ld2.f().a.b).b).l;
        if (rq0.h(arrayList)) {
            cc2.a("readBuffer passwords is empty");
            return BuildConfig.FLAVOR;
        }
        RandomAccessFile randomAccessFile2 = null;
        fileLockLock = null;
        FileLock fileLockLock = null;
        fileChannel = null;
        FileChannel fileChannel2 = null;
        FileChannel fileChannel3 = null;
        try {
            try {
                randomAccessFile = new RandomAccessFile(file, "rw");
                try {
                    channel = randomAccessFile.getChannel();
                    try {
                        try {
                            fileLockLock = channel.lock();
                            randomAccessFile.seek(0L);
                            randomAccessFile.read(d.array(), 0, 32808);
                            byte[] bArr2 = (byte[]) arrayList.get(d.getInt(4));
                            if (bArr2 != null) {
                                nl1 nl1Var = new nl1(bArr2);
                                boolean z = true;
                                for (int i = 0; i < d.getInt(0); i++) {
                                    if (i == 0) {
                                        int i2 = d.getInt((i + 10) * 4);
                                        bArr = new byte[i2];
                                        randomAccessFile.read(bArr, 0, i2);
                                    } else {
                                        int i3 = d.getInt((i + 10) * 4) - d.getInt((i + 9) * 4);
                                        bArr = new byte[i3];
                                        randomAccessFile.read(bArr, 0, i3);
                                    }
                                    String str = new String(nl1Var.d(bArr));
                                    try {
                                        try {
                                            JSONObject jSONObject = new JSONObject(str);
                                            if (jSONObject.has("tid") && jSONObject.has("event")) {
                                                if (!z) {
                                                    sb.append("\n");
                                                }
                                                sb.append(str);
                                                z = false;
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            if (fileLockLock != null) {
                                                try {
                                                    fileLockLock.release();
                                                    if (channel != null) {
                                                        channel.close();
                                                    }
                                                } catch (IOException e) {
                                                    cc2.c(Log.getStackTraceString(e));
                                                    if (randomAccessFile == null) {
                                                        throw th;
                                                    }
                                                    try {
                                                        randomAccessFile.close();
                                                        throw th;
                                                    } catch (IOException e2) {
                                                        cc2.c(Log.getStackTraceString(e2));
                                                        throw th;
                                                    }
                                                }
                                            } else if (channel != null) {
                                                channel.close();
                                            }
                                            if (randomAccessFile == null) {
                                                throw th;
                                            }
                                            randomAccessFile.close();
                                            throw th;
                                        }
                                    } catch (Exception e3) {
                                        cc2.c(Log.getStackTraceString(e3));
                                    }
                                }
                            }
                            if (fileLockLock != null) {
                                try {
                                    fileLockLock.release();
                                } catch (IOException e4) {
                                    cc2.c(Log.getStackTraceString(e4));
                                }
                            }
                            channel.close();
                            randomAccessFile.close();
                        } catch (Exception e5) {
                            e = e5;
                            fileLock = fileLockLock;
                            fileChannel3 = channel;
                            try {
                                cc2.c(Log.getStackTraceString(e));
                                if (file.delete()) {
                                    cc2.e("file deleted");
                                }
                                if (fileLock != null) {
                                    try {
                                        fileLock.release();
                                        if (fileChannel3 != null) {
                                            fileChannel3.close();
                                        }
                                    } catch (IOException e6) {
                                        cc2.c(Log.getStackTraceString(e6));
                                        if (randomAccessFile != null) {
                                            randomAccessFile.close();
                                        }
                                        return sb.toString();
                                    }
                                } else if (fileChannel3 != null) {
                                    fileChannel3.close();
                                }
                                if (randomAccessFile != null) {
                                    randomAccessFile.close();
                                }
                                return sb.toString();
                            } catch (Throwable th2) {
                                th = th2;
                                fileChannel = fileChannel3;
                                randomAccessFile2 = randomAccessFile;
                                randomAccessFile = randomAccessFile2;
                                fileLockLock = fileLock;
                                channel = fileChannel;
                                if (fileLockLock != null) {
                                    fileLockLock.release();
                                    if (channel != null) {
                                        channel.close();
                                    }
                                } else if (channel != null) {
                                    channel.close();
                                }
                                if (randomAccessFile == null) {
                                    throw th;
                                }
                                randomAccessFile.close();
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        fileLock2 = fileLockLock;
                        fileChannel2 = channel;
                        channel = fileChannel2;
                        fileLockLock = fileLock2;
                        if (fileLockLock != null) {
                            fileLockLock.release();
                            if (channel != null) {
                                channel.close();
                            }
                        } else if (channel != null) {
                            channel.close();
                        }
                        if (randomAccessFile == null) {
                            throw th;
                        }
                        randomAccessFile.close();
                        throw th;
                    }
                } catch (Exception e7) {
                    e = e7;
                    fileLock = null;
                } catch (Throwable th4) {
                    th = th4;
                    fileLock2 = null;
                }
            } catch (IOException e8) {
                cc2.c(Log.getStackTraceString(e8));
            }
        } catch (Exception e9) {
            e = e9;
            randomAccessFile = null;
            fileLock = null;
        } catch (Throwable th5) {
            th = th5;
            fileChannel = null;
            fileLock = null;
            randomAccessFile = randomAccessFile2;
            fileLockLock = fileLock;
            channel = fileChannel;
            if (fileLockLock != null) {
                fileLockLock.release();
                if (channel != null) {
                    channel.close();
                }
            } else if (channel != null) {
                channel.close();
            }
            if (randomAccessFile == null) {
                throw th;
            }
            randomAccessFile.close();
            throw th;
        }
        return sb.toString();
    }

    @Override // defpackage.s81
    public u92 k(View view, u92 u92Var) {
        r92 r92Var = u92Var.a;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.a;
        if (!Objects.equals(coordinatorLayout.d0, u92Var)) {
            coordinatorLayout.d0 = u92Var;
            boolean z = u92Var.d() > 0;
            coordinatorLayout.e0 = z;
            coordinatorLayout.setWillNotDraw(!z && coordinatorLayout.getBackground() == null);
            if (!r92Var.q()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    WeakHashMap weakHashMap = x52.a;
                    if (childAt.getFitsSystemWindows() && ((qs) childAt.getLayoutParams()).a != null && r92Var.q()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return u92Var;
    }

    @Override // defpackage.yj
    public Object l(l81 l81Var) {
        rp rpVar = new rp(l81Var);
        l81Var.w(new kj0(rpVar, 7));
        return rpVar;
    }

    @Override // defpackage.j52
    public View m(int i) {
        return ((xf1) this.a).u(i);
    }

    public void n(int i, boolean z) {
        ff2 ff2Var = (ff2) this.a;
        try {
            if (i > 0) {
                ff2.z(ff2Var, i, z);
            } else {
                ff2Var.d = ((hf2) ((f91) ld2.f().a.b).b).p * 1000;
                ff2Var.J();
            }
        } catch (Exception e) {
            cc2.d("onConfigChanged exception : %s", e.getMessage());
        }
    }

    @Override // defpackage.j52
    public int o() {
        return ((xf1) this.a).E();
    }

    public void onFailure(Exception exc) {
        long j;
        if (exc instanceof wc0) {
            h01 h01Var = wt2.e;
            h01Var.j("Failure to refresh token; scheduling refresh after failure", new Object[0]);
            wt2 wt2Var = (wt2) ((bh0) this.a).c;
            int i = (int) wt2Var.b;
            if (i == 30 || i == 60 || i == 120 || i == 240 || i == 480) {
                j = 2 * wt2Var.b;
            } else {
                j = i != 960 ? 30L : 960L;
            }
            wt2Var.b = j;
            wt2Var.a = (wt2Var.b * 1000) + System.currentTimeMillis();
            h01Var.j(ck1.t("Scheduling refresh for ", wt2Var.a), new Object[0]);
            wt2Var.c.postDelayed(wt2Var.d, wt2Var.b * 1000);
        }
    }

    @Override // defpackage.j52
    public int p(View view) {
        return view.getRight() + ((yf1) view.getLayoutParams()).b.right + ((ViewGroup.MarginLayoutParams) ((yf1) view.getLayoutParams())).rightMargin;
    }

    public void q(String str, Bundle bundle) {
        i90 i90Var = i90.a;
        if (x32.c()) {
            ((pa) this.a).g(str, bundle);
        }
    }

    public synchronized yd2 t() {
        yd2 yd2VarO;
        ri2 ri2Var = (ri2) this.a;
        synchronized (ri2Var) {
            yd2VarO = yd2.o((go3) ((fo3) ri2Var.a).d());
        }
        return yd2VarO;
    }

    public List u(String str) {
        str.getClass();
        Iterator itA = ((hr3) this.a).a(this, str);
        ArrayList arrayList = new ArrayList();
        while (true) {
            so3 so3Var = (so3) itA;
            if (!so3Var.hasNext()) {
                return Collections.unmodifiableList(arrayList);
            }
            arrayList.add((String) so3Var.next());
        }
    }

    public void v(int i, String str, List list, boolean z, boolean z2) {
        z23 z23Var;
        f53 f53Var = (f53) this.a;
        int i2 = i - 1;
        if (i2 == 0) {
            c33 c33Var = ((y53) f53Var.a).f;
            y53.l(c33Var);
            z23Var = c33Var.Z;
        } else if (i2 != 1) {
            if (i2 == 3) {
                c33 c33Var2 = ((y53) f53Var.a).f;
                y53.l(c33Var2);
                z23Var = c33Var2.a0;
            } else if (i2 != 4) {
                c33 c33Var3 = ((y53) f53Var.a).f;
                y53.l(c33Var3);
                z23Var = c33Var3.Y;
            } else if (z) {
                c33 c33Var4 = ((y53) f53Var.a).f;
                y53.l(c33Var4);
                z23Var = c33Var4.W;
            } else if (z2) {
                c33 c33Var5 = ((y53) f53Var.a).f;
                y53.l(c33Var5);
                z23Var = c33Var5.w;
            } else {
                c33 c33Var6 = ((y53) f53Var.a).f;
                y53.l(c33Var6);
                z23Var = c33Var6.X;
            }
        } else if (z) {
            c33 c33Var7 = ((y53) f53Var.a).f;
            y53.l(c33Var7);
            z23Var = c33Var7.i;
        } else if (z2) {
            c33 c33Var8 = ((y53) f53Var.a).f;
            y53.l(c33Var8);
            z23Var = c33Var8.f;
        } else {
            c33 c33Var9 = ((y53) f53Var.a).f;
            y53.l(c33Var9);
            z23Var = c33Var9.v;
        }
        int size = list.size();
        if (size == 1) {
            z23Var.b(list.get(0), str);
            return;
        }
        if (size == 2) {
            z23Var.c(list.get(0), list.get(1), str);
        } else if (size != 3) {
            z23Var.a(str);
        } else {
            z23Var.d(str, list.get(0), list.get(1), list.get(2));
        }
    }

    @Override // defpackage.a41
    public boolean y(i31 i31Var) {
        Window.Callback callback;
        k8 k8Var = (k8) this.a;
        if (i31Var != i31Var.k() || !k8Var.s0 || (callback = k8Var.Y.getCallback()) == null || k8Var.D0) {
            return true;
        }
        callback.onMenuOpened(108, i31Var);
        return true;
    }

    public void z(zzahd zzahdVar, String str, String str2, Boolean bool, zzc zzcVar, rd2 rd2Var, mn2 mn2Var) {
        String str3 = zzahdVar.b;
        dz2 dz2Var = new dz2(4);
        gu2.l(str3);
        dz2Var.b = str3;
        qq qqVar = (qq) this.a;
        uy1 uy1Var = new uy1();
        uy1Var.a = mn2Var;
        uy1Var.b = str2;
        uy1Var.c = str;
        uy1Var.d = bool;
        uy1Var.e = zzcVar;
        uy1Var.f = rd2Var;
        uy1Var.i = zzahdVar;
        qqVar.getClass();
        wm2 wm2Var = (wm2) qqVar.a;
        sp0.K(wm2Var.q("/getAccountInfo", (String) qqVar.f), dz2Var, uy1Var, new wo2(), (ep1) wm2Var.b);
    }

    public ox1(jf jfVar) {
        Objects.requireNonNull(jfVar);
        this.a = jfVar;
    }

    public /* synthetic */ ox1(Object obj) {
        this.a = obj;
    }

    public ox1(vj vjVar) {
        Context context = (Context) vjVar.a;
        String str = (String) vjVar.b;
        String str2 = (String) vjVar.c;
        if (str != null) {
            Context applicationContext = context.getApplicationContext();
            if (str2 == null) {
                PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
            } else {
                applicationContext.getSharedPreferences(str2, 0).edit();
            }
            this.a = (ri2) vjVar.h;
            return;
        }
        e.g("keysetName cannot be null");
        throw null;
    }

    public ox1(Context context) {
        this.a = new pa(context, (String) null);
    }

    public ox1(Context context, String str) {
        this.a = new pa(context, str);
    }

    public ox1(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            zr1 zr1Var = new zr1(view, 20);
            zr1Var.i = view;
            this.a = zr1Var;
            return;
        }
        this.a = new kj0(view, 20);
    }

    public ox1() {
        this.a = new Bundle();
    }

    public ox1(hc0 hc0Var) {
        hc0Var.a();
        Context context = hc0Var.a;
        wt2 wt2Var = new wt2();
        wt2.e.j("Initializing TokenRefresher", new Object[0]);
        HandlerThread handlerThread = new HandlerThread("TokenRefresher", 10);
        handlerThread.start();
        th2 th2Var = new th2(handlerThread.getLooper());
        Looper.getMainLooper();
        wt2Var.c = th2Var;
        hc0Var.a();
        wt2Var.d = new bh0(wt2Var, hc0Var.b);
        this.a = wt2Var;
        se.b((Application) context.getApplicationContext());
        se.e.a(new qg2(this, 1));
    }
}
