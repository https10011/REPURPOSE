package defpackage;

import android.R;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.AbsSeekBar;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.cloudmessaging.zzd;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.ComplianceOptions;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.hjq.toast.BuildConfig;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import org.json.JSONObject;
import prod.apptest.com.AppTestApp;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class f91 implements d4, ak, gd0, ph1, cv1, uh3 {
    public static volatile f91 d;
    public static final int[] e = {R.attr.indeterminateDrawable, R.attr.progressDrawable};
    public static f91 f;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public f91(int i) {
        this.a = i;
        switch (i) {
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                this.b = new AtomicReference();
                this.c = new mb(0);
                break;
            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                this.b = new z01(1000L);
                this.c = gb2.I(10, new nk1(8));
                break;
            case oc1.BYTES_FIELD_NUMBER /* 8 */:
                this.b = new hf2();
                this.c = new CopyOnWriteArrayList();
                break;
            case 9:
            default:
                this.b = new rk0(null);
                this.c = new HashMap();
                break;
            case 10:
                this.b = new HashMap();
                this.c = new zt2(6);
                zt2 zt2Var = new zt2(0);
                av2 av2Var = av2.BITWISE_AND;
                ArrayList arrayList = zt2Var.a;
                arrayList.add(av2Var);
                arrayList.add(av2.BITWISE_LEFT_SHIFT);
                arrayList.add(av2.BITWISE_NOT);
                arrayList.add(av2.BITWISE_OR);
                arrayList.add(av2.BITWISE_RIGHT_SHIFT);
                arrayList.add(av2.BITWISE_UNSIGNED_RIGHT_SHIFT);
                arrayList.add(av2.BITWISE_XOR);
                q(zt2Var);
                zt2 zt2Var2 = new zt2(1);
                av2 av2Var2 = av2.EQUALS;
                ArrayList arrayList2 = zt2Var2.a;
                arrayList2.add(av2Var2);
                arrayList2.add(av2.GREATER_THAN);
                arrayList2.add(av2.GREATER_THAN_EQUALS);
                arrayList2.add(av2.IDENTITY_EQUALS);
                arrayList2.add(av2.IDENTITY_NOT_EQUALS);
                arrayList2.add(av2.LESS_THAN);
                arrayList2.add(av2.LESS_THAN_EQUALS);
                arrayList2.add(av2.NOT_EQUALS);
                q(zt2Var2);
                zt2 zt2Var3 = new zt2(2);
                av2 av2Var3 = av2.APPLY;
                ArrayList arrayList3 = zt2Var3.a;
                arrayList3.add(av2Var3);
                arrayList3.add(av2.BLOCK);
                arrayList3.add(av2.BREAK);
                arrayList3.add(av2.CASE);
                arrayList3.add(av2.DEFAULT);
                arrayList3.add(av2.CONTINUE);
                arrayList3.add(av2.DEFINE_FUNCTION);
                arrayList3.add(av2.FN);
                arrayList3.add(av2.IF);
                arrayList3.add(av2.QUOTE);
                arrayList3.add(av2.RETURN);
                arrayList3.add(av2.SWITCH);
                arrayList3.add(av2.TERNARY);
                q(zt2Var3);
                zt2 zt2Var4 = new zt2(3);
                av2 av2Var4 = av2.AND;
                ArrayList arrayList4 = zt2Var4.a;
                arrayList4.add(av2Var4);
                arrayList4.add(av2.NOT);
                arrayList4.add(av2.OR);
                q(zt2Var4);
                zt2 zt2Var5 = new zt2(4);
                av2 av2Var5 = av2.FOR_IN;
                ArrayList arrayList5 = zt2Var5.a;
                arrayList5.add(av2Var5);
                arrayList5.add(av2.FOR_IN_CONST);
                arrayList5.add(av2.FOR_IN_LET);
                arrayList5.add(av2.FOR_LET);
                arrayList5.add(av2.FOR_OF);
                arrayList5.add(av2.FOR_OF_CONST);
                arrayList5.add(av2.FOR_OF_LET);
                arrayList5.add(av2.WHILE);
                q(zt2Var5);
                zt2 zt2Var6 = new zt2(5);
                av2 av2Var6 = av2.ADD;
                ArrayList arrayList6 = zt2Var6.a;
                arrayList6.add(av2Var6);
                arrayList6.add(av2.DIVIDE);
                arrayList6.add(av2.MODULUS);
                arrayList6.add(av2.MULTIPLY);
                arrayList6.add(av2.NEGATE);
                arrayList6.add(av2.POST_DECREMENT);
                arrayList6.add(av2.POST_INCREMENT);
                arrayList6.add(av2.PRE_DECREMENT);
                arrayList6.add(av2.PRE_INCREMENT);
                arrayList6.add(av2.SUBTRACT);
                q(zt2Var6);
                zt2 zt2Var7 = new zt2(7);
                av2 av2Var7 = av2.ASSIGN;
                ArrayList arrayList7 = zt2Var7.a;
                arrayList7.add(av2Var7);
                arrayList7.add(av2.CONST);
                arrayList7.add(av2.CREATE_ARRAY);
                arrayList7.add(av2.CREATE_OBJECT);
                arrayList7.add(av2.EXPRESSION_LIST);
                arrayList7.add(av2.GET);
                arrayList7.add(av2.GET_INDEX);
                arrayList7.add(av2.GET_PROPERTY);
                arrayList7.add(av2.NULL);
                arrayList7.add(av2.SET_PROPERTY);
                arrayList7.add(av2.TYPEOF);
                arrayList7.add(av2.UNDEFINED);
                arrayList7.add(av2.VAR);
                q(zt2Var7);
                break;
        }
    }

    public static void j(AppTestApp appTestApp, int i) {
        if (d == null) {
            synchronized (f91.class) {
                try {
                    if (d == null) {
                        d = new f91(appTestApp);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        f91 f91Var = d;
        Object obj = f91Var.c;
        xe2 xe2Var = (xe2) f91Var.b;
        if (xe2Var == null) {
            return;
        }
        am2.g("Check appId record : " + i);
        HandlerThread handlerThread = xe2Var.b;
        if (handlerThread == null || !handlerThread.isAlive()) {
            return;
        }
        Message messageObtain = Message.obtain(xe2Var.a, 304);
        messageObtain.obj = Integer.valueOf(i);
        boolean z = xe2Var.m.get();
        Handler handler = xe2Var.a;
        if (z) {
            handler.sendMessage(messageObtain);
        } else {
            handler.sendMessageDelayed(messageObtain, 0L);
        }
    }

    public static f91 p(Context context, String str) {
        ox1 ox1VarS;
        f91 f91Var = f;
        if (f91Var == null || !((String) f91Var.b).equals(str)) {
            boolean z = false;
            try {
                gy2.a();
                ox1VarS = s(context, str);
            } catch (IOException | GeneralSecurityException e2) {
                Log.e("FirebearStorageCryptoHelper", "Exception encountered during crypto setup:\n" + e2.getMessage());
                if (e2 instanceof GeneralSecurityException) {
                    context.getSharedPreferences("com.google.firebase.auth.api.crypto.".concat(str), 0).edit().remove("StorageCryptoKeyset").apply();
                    try {
                        ox1VarS = s(context, str);
                    } catch (IOException | GeneralSecurityException e3) {
                        Log.e("FirebearStorageCryptoHelper", "Exception encountered during second attempt to crypto setup:\n" + e3.getMessage());
                        ox1VarS = null;
                    }
                } else {
                    ox1VarS = null;
                }
            }
            f = new f91(11, str, ox1VarS, z);
        }
        return f;
    }

    public static ox1 s(Context context, String str) {
        vj vjVar = new vj();
        String strConcat = "com.google.firebase.auth.api.crypto.".concat(str);
        if (context == null) {
            e.g("need an Android context");
            return null;
        }
        vjVar.a = context;
        vjVar.b = "StorageCryptoKeyset";
        vjVar.c = strConcat;
        vjVar.g = hy2.b;
        String strConcat2 = "android-keystore://firebear_main_key_id_for_storage_crypto.".concat(str);
        if (strConcat2.startsWith("android-keystore://")) {
            vjVar.d = strConcat2;
            return vjVar.a();
        }
        e.g("key URI must start with android-keystore://");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.gd0
    public Object A(id0 id0Var, gs gsVar) {
        rd0 rd0Var;
        td0 td0Var;
        if (gsVar instanceof rd0) {
            rd0Var = (rd0) gsVar;
            int i = rd0Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                rd0Var.b = i - Integer.MIN_VALUE;
            } else {
                rd0Var = new rd0(this, gsVar);
            }
        } else {
            rd0Var = new rd0(this, gsVar);
        }
        Object obj = rd0Var.a;
        ft ftVar = ft.a;
        int i2 = rd0Var.b;
        if (i2 == 0) {
            zi0.B(obj);
            yd2 yd2Var = (yd2) this.b;
            td0 td0Var2 = new td0((fx) this.c, id0Var);
            try {
                rd0Var.d = td0Var2;
                rd0Var.b = 1;
                if (yd2Var.A(td0Var2, rd0Var) == ftVar) {
                    return ftVar;
                }
            } catch (u e2) {
                e = e2;
                td0Var = td0Var2;
                if (e.a != td0Var) {
                    throw e;
                }
            }
        } else {
            if (i2 != 1) {
                uq1.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            td0Var = rd0Var.d;
            try {
                zi0.B(obj);
            } catch (u e3) {
                e = e3;
                if (e.a != td0Var) {
                    throw e;
                }
            }
        }
        return Unit.a;
    }

    public pd2 a(int i) {
        CopyOnWriteArrayList<pd2> copyOnWriteArrayList = (CopyOnWriteArrayList) this.c;
        if (!rq0.l(copyOnWriteArrayList)) {
            return null;
        }
        for (pd2 pd2Var : copyOnWriteArrayList) {
            if (pd2Var.a == i) {
                return pd2Var;
            }
        }
        return null;
    }

    @Override // defpackage.ph1
    public void accept(Object obj, Object obj2) {
        wh2 wh2Var = new wh2((yh2) this.b, (TaskCompletionSource) obj2);
        ti2 ti2Var = (ti2) ((zh2) obj).l();
        BeginSignInRequest beginSignInRequest = (BeginSignInRequest) this.c;
        ApiMetadata apiMetadata = new ApiMetadata(new ComplianceOptions(-1, -1, 0, true), false);
        apiMetadata.c = false;
        Parcel parcelD = ti2Var.d();
        int i = ii2.a;
        parcelD.writeStrongBinder(wh2Var);
        ii2.b(parcelD, beginSignInRequest);
        ii2.b(parcelD, apiMetadata);
        ti2Var.e(parcelD, 1);
    }

    @Override // defpackage.uh3
    public byte[] b(byte[] bArr, int i) {
        return bArr.length <= 64 ? ((wh3) this.b).b(bArr, i) : ((rc2) this.c).b(bArr, i);
    }

    @Override // defpackage.d4
    public boolean c(e4 e4Var, Menu menu) {
        return ((d4) this.b).c(e4Var, menu);
    }

    @Override // defpackage.d4
    public boolean d(e4 e4Var, MenuItem menuItem) {
        return ((d4) this.b).d(e4Var, menuItem);
    }

    @Override // defpackage.d4
    public boolean e(e4 e4Var, Menu menu) {
        ViewGroup viewGroup = ((k8) this.c).n0;
        WeakHashMap weakHashMap = x52.a;
        viewGroup.requestApplyInsets();
        return ((d4) this.b).e(e4Var, menu);
    }

    @Override // defpackage.d4
    public void f(e4 e4Var) {
        ((d4) this.b).f(e4Var);
        k8 k8Var = (k8) this.c;
        if (k8Var.j0 != null) {
            k8Var.Y.getDecorView().removeCallbacks(k8Var.k0);
        }
        if (k8Var.i0 != null) {
            y62 y62Var = k8Var.l0;
            if (y62Var != null) {
                y62Var.b();
            }
            y62 y62VarA = x52.a(k8Var.i0);
            y62VarA.a(0.0f);
            k8Var.l0 = y62VarA;
            y62VarA.d(new a8(this, 2));
        }
        k8Var.a0.onSupportActionModeFinished(k8Var.h0);
        k8Var.h0 = null;
        ViewGroup viewGroup = k8Var.n0;
        WeakHashMap weakHashMap = x52.a;
        viewGroup.requestApplyInsets();
        k8Var.J();
    }

    public String g() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("global_config", ((hf2) this.b).c());
            return jSONObject.toString();
        } catch (Exception e2) {
            cc2.c(Log.getStackTraceString(e2));
            oc2.a("toJSON", e2);
            return BuildConfig.FLAVOR;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.cv1
    public Object get() {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        u23 u23Var = (u23) this.b;
        String str = (String) this.c;
        int i = ol0.a;
        int i2 = b61.d0;
        a61 a61VarC = new a61().c(str.getBytes());
        ByteBuffer byteBuffer = a61VarC.a;
        byteBuffer.put((byte) 0);
        char c = '\b';
        if (byteBuffer.remaining() < 8) {
            a61VarC.a();
        }
        a61 a61VarC2 = a61VarC.c(BuildConfig.FLAVOR.getBytes());
        a61VarC2.a();
        ByteBuffer byteBuffer2 = a61VarC2.a;
        byteBuffer2.flip();
        if (byteBuffer2.remaining() > 0) {
            a61VarC2.f = byteBuffer2.remaining() + a61VarC2.f;
            long j8 = 0;
            switch (byteBuffer2.remaining()) {
                case 1:
                    j = 0;
                    j7 = j ^ ((long) (byteBuffer2.get(0) & 255));
                    a61VarC2.d = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ a61VarC2.d;
                    a61VarC2.e ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                    byteBuffer2.position(byteBuffer2.limit());
                    break;
                case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                    c = '\b';
                    j2 = 0;
                    j = j2 ^ (((long) (byteBuffer2.get(1) & 255)) << c);
                    j7 = j ^ ((long) (byteBuffer2.get(0) & 255));
                    a61VarC2.d = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ a61VarC2.d;
                    a61VarC2.e ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                    byteBuffer2.position(byteBuffer2.limit());
                    break;
                case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                    c = '\b';
                    j3 = 0;
                    j2 = j3 ^ (((long) (byteBuffer2.get(2) & 255)) << 16);
                    j = j2 ^ (((long) (byteBuffer2.get(1) & 255)) << c);
                    j7 = j ^ ((long) (byteBuffer2.get(0) & 255));
                    a61VarC2.d = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ a61VarC2.d;
                    a61VarC2.e ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                    byteBuffer2.position(byteBuffer2.limit());
                    break;
                case oc1.LONG_FIELD_NUMBER /* 4 */:
                    c = '\b';
                    j4 = 0;
                    j3 = j4 ^ (((long) (byteBuffer2.get(3) & 255)) << 24);
                    j2 = j3 ^ (((long) (byteBuffer2.get(2) & 255)) << 16);
                    j = j2 ^ (((long) (byteBuffer2.get(1) & 255)) << c);
                    j7 = j ^ ((long) (byteBuffer2.get(0) & 255));
                    a61VarC2.d = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ a61VarC2.d;
                    a61VarC2.e ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                    byteBuffer2.position(byteBuffer2.limit());
                    break;
                case oc1.STRING_FIELD_NUMBER /* 5 */:
                    j5 = 0;
                    j4 = j5 ^ (((long) (byteBuffer2.get(4) & 255)) << 32);
                    j3 = j4 ^ (((long) (byteBuffer2.get(3) & 255)) << 24);
                    j2 = j3 ^ (((long) (byteBuffer2.get(2) & 255)) << 16);
                    j = j2 ^ (((long) (byteBuffer2.get(1) & 255)) << c);
                    j7 = j ^ ((long) (byteBuffer2.get(0) & 255));
                    a61VarC2.d = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ a61VarC2.d;
                    a61VarC2.e ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                    byteBuffer2.position(byteBuffer2.limit());
                    break;
                case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                    j6 = 0;
                    j5 = (((long) (byteBuffer2.get(5) & 255)) << 40) ^ j6;
                    j4 = j5 ^ (((long) (byteBuffer2.get(4) & 255)) << 32);
                    j3 = j4 ^ (((long) (byteBuffer2.get(3) & 255)) << 24);
                    j2 = j3 ^ (((long) (byteBuffer2.get(2) & 255)) << 16);
                    j = j2 ^ (((long) (byteBuffer2.get(1) & 255)) << c);
                    j7 = j ^ ((long) (byteBuffer2.get(0) & 255));
                    a61VarC2.d = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ a61VarC2.d;
                    a61VarC2.e ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                    byteBuffer2.position(byteBuffer2.limit());
                    break;
                case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                    j6 = ((long) (byteBuffer2.get(6) & 255)) << 48;
                    j5 = (((long) (byteBuffer2.get(5) & 255)) << 40) ^ j6;
                    j4 = j5 ^ (((long) (byteBuffer2.get(4) & 255)) << 32);
                    j3 = j4 ^ (((long) (byteBuffer2.get(3) & 255)) << 24);
                    j2 = j3 ^ (((long) (byteBuffer2.get(2) & 255)) << 16);
                    j = j2 ^ (((long) (byteBuffer2.get(1) & 255)) << c);
                    j7 = j ^ ((long) (byteBuffer2.get(0) & 255));
                    a61VarC2.d = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ a61VarC2.d;
                    a61VarC2.e ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                    byteBuffer2.position(byteBuffer2.limit());
                    break;
                case oc1.BYTES_FIELD_NUMBER /* 8 */:
                    j7 = byteBuffer2.getLong();
                    a61VarC2.d = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ a61VarC2.d;
                    a61VarC2.e ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                    byteBuffer2.position(byteBuffer2.limit());
                    break;
                case 9:
                    j8 ^= (long) (byteBuffer2.get(8) & 255);
                    j7 = byteBuffer2.getLong();
                    a61VarC2.d = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ a61VarC2.d;
                    a61VarC2.e ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                    byteBuffer2.position(byteBuffer2.limit());
                    break;
                case 10:
                    j8 ^= ((long) (byteBuffer2.get(9) & 255)) << 8;
                    j8 ^= (long) (byteBuffer2.get(8) & 255);
                    j7 = byteBuffer2.getLong();
                    a61VarC2.d = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ a61VarC2.d;
                    a61VarC2.e ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                    byteBuffer2.position(byteBuffer2.limit());
                    break;
                case 11:
                    j8 ^= ((long) (byteBuffer2.get(10) & 255)) << 16;
                    j8 ^= ((long) (byteBuffer2.get(9) & 255)) << 8;
                    j8 ^= (long) (byteBuffer2.get(8) & 255);
                    j7 = byteBuffer2.getLong();
                    a61VarC2.d = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ a61VarC2.d;
                    a61VarC2.e ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                    byteBuffer2.position(byteBuffer2.limit());
                    break;
                case 12:
                    j8 ^= ((long) (byteBuffer2.get(11) & 255)) << 24;
                    j8 ^= ((long) (byteBuffer2.get(10) & 255)) << 16;
                    j8 ^= ((long) (byteBuffer2.get(9) & 255)) << 8;
                    j8 ^= (long) (byteBuffer2.get(8) & 255);
                    j7 = byteBuffer2.getLong();
                    a61VarC2.d = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ a61VarC2.d;
                    a61VarC2.e ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                    byteBuffer2.position(byteBuffer2.limit());
                    break;
                case 13:
                    j8 ^= ((long) (byteBuffer2.get(12) & 255)) << 32;
                    j8 ^= ((long) (byteBuffer2.get(11) & 255)) << 24;
                    j8 ^= ((long) (byteBuffer2.get(10) & 255)) << 16;
                    j8 ^= ((long) (byteBuffer2.get(9) & 255)) << 8;
                    j8 ^= (long) (byteBuffer2.get(8) & 255);
                    j7 = byteBuffer2.getLong();
                    a61VarC2.d = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ a61VarC2.d;
                    a61VarC2.e ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                    byteBuffer2.position(byteBuffer2.limit());
                    break;
                case 14:
                    j8 ^= ((long) (byteBuffer2.get(13) & 255)) << 40;
                    j8 ^= ((long) (byteBuffer2.get(12) & 255)) << 32;
                    j8 ^= ((long) (byteBuffer2.get(11) & 255)) << 24;
                    j8 ^= ((long) (byteBuffer2.get(10) & 255)) << 16;
                    j8 ^= ((long) (byteBuffer2.get(9) & 255)) << 8;
                    j8 ^= (long) (byteBuffer2.get(8) & 255);
                    j7 = byteBuffer2.getLong();
                    a61VarC2.d = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ a61VarC2.d;
                    a61VarC2.e ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                    byteBuffer2.position(byteBuffer2.limit());
                    break;
                case 15:
                    j8 = ((long) (byteBuffer2.get(14) & 255)) << 48;
                    j8 ^= ((long) (byteBuffer2.get(13) & 255)) << 40;
                    j8 ^= ((long) (byteBuffer2.get(12) & 255)) << 32;
                    j8 ^= ((long) (byteBuffer2.get(11) & 255)) << 24;
                    j8 ^= ((long) (byteBuffer2.get(10) & 255)) << 16;
                    j8 ^= ((long) (byteBuffer2.get(9) & 255)) << 8;
                    j8 ^= (long) (byteBuffer2.get(8) & 255);
                    j7 = byteBuffer2.getLong();
                    a61VarC2.d = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ a61VarC2.d;
                    a61VarC2.e ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                    byteBuffer2.position(byteBuffer2.limit());
                    break;
                default:
                    e.b("Should never get here.");
                    return null;
            }
        }
        long j9 = a61VarC2.d;
        long j10 = a61VarC2.f;
        long j11 = j9 ^ j10;
        long j12 = j10 ^ a61VarC2.e;
        long j13 = j11 + j12;
        long j14 = j12 + j13;
        long j15 = (j13 ^ (j13 >>> 33)) * (-49064778989728563L);
        long j16 = (j15 ^ (j15 >>> 33)) * (-4265267296055464877L);
        long j17 = (j14 ^ (j14 >>> 33)) * (-49064778989728563L);
        long j18 = (j17 ^ (j17 >>> 33)) * (-4265267296055464877L);
        long j19 = j18 ^ (j18 >>> 33);
        long j20 = (j16 ^ (j16 >>> 33)) + j19;
        a61VarC2.d = j20;
        a61VarC2.e = j19 + j20;
        byte[] bArrArray = ByteBuffer.wrap(new byte[16]).order(ByteOrder.LITTLE_ENDIAN).putLong(a61VarC2.d).putLong(a61VarC2.e).array();
        bArrArray.getClass();
        return ((cf) u23Var.b).a((byte[]) bArrArray.clone());
    }

    public Object h(xb1 xb1Var) {
        HashMap map = (HashMap) this.c;
        rk0 rk0Var = (rk0) map.get(xb1Var);
        if (rk0Var == null) {
            rk0Var = new rk0(xb1Var);
            map.put(xb1Var, rk0Var);
        } else {
            xb1Var.a();
        }
        rk0 rk0Var2 = rk0Var.d;
        rk0Var2.c = rk0Var.c;
        rk0Var.c.d = rk0Var2;
        rk0 rk0Var3 = (rk0) this.b;
        rk0Var.d = rk0Var3;
        rk0 rk0Var4 = rk0Var3.c;
        rk0Var.c = rk0Var4;
        rk0Var4.d = rk0Var;
        rk0Var.d.c = rk0Var;
        ArrayList arrayList = rk0Var.b;
        int size = arrayList != null ? arrayList.size() : 0;
        if (size > 0) {
            return rk0Var.b.remove(size - 1);
        }
        return null;
    }

    public String i(hv0 hv0Var) {
        String str;
        synchronized (((z01) this.b)) {
            str = (String) ((z01) this.b).a(hv0Var);
        }
        if (str == null) {
            ll1 ll1Var = (ll1) ((ac2) this.c).h();
            try {
                hv0Var.b(ll1Var.a);
                byte[] bArrDigest = ll1Var.a.digest();
                char[] cArr = d42.b;
                synchronized (cArr) {
                    for (int i = 0; i < bArrDigest.length; i++) {
                        byte b = bArrDigest[i];
                        int i2 = i * 2;
                        char[] cArr2 = d42.a;
                        cArr[i2] = cArr2[(b & 255) >>> 4];
                        cArr[i2 + 1] = cArr2[b & 15];
                    }
                    str = new String(cArr);
                }
                ((ac2) this.c).b(ll1Var);
            } catch (Throwable th) {
                ((ac2) this.c).b(ll1Var);
                throw th;
            }
        }
        synchronized (((z01) this.b)) {
            ((z01) this.b).d(hv0Var, str);
        }
        return str;
    }

    public void k(AttributeSet attributeSet, int i) {
        AbsSeekBar absSeekBar = (AbsSeekBar) this.b;
        p11 p11VarK = p11.k(absSeekBar.getContext(), attributeSet, e, i);
        Drawable drawableG = p11VarK.g(0);
        if (drawableG != null) {
            if (drawableG instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) drawableG;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                AnimationDrawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i2 = 0; i2 < numberOfFrames; i2++) {
                    Drawable drawableO = o(animationDrawable.getFrame(i2), true);
                    drawableO.setLevel(10000);
                    animationDrawable2.addFrame(drawableO, animationDrawable.getDuration(i2));
                }
                animationDrawable2.setLevel(10000);
                drawableG = animationDrawable2;
            }
            absSeekBar.setIndeterminateDrawable(drawableG);
        }
        Drawable drawableG2 = p11VarK.g(1);
        if (drawableG2 != null) {
            absSeekBar.setProgressDrawable(o(drawableG2, false));
        }
        p11VarK.m();
    }

    public void l(xb1 xb1Var, Object obj) {
        HashMap map = (HashMap) this.c;
        rk0 rk0Var = (rk0) map.get(xb1Var);
        if (rk0Var == null) {
            rk0Var = new rk0(xb1Var);
            rk0Var.d = rk0Var;
            rk0 rk0Var2 = (rk0) this.b;
            rk0Var.d = rk0Var2.d;
            rk0Var.c = rk0Var2;
            rk0Var2.d = rk0Var;
            rk0Var.d.c = rk0Var;
            map.put(xb1Var, rk0Var);
        } else {
            xb1Var.a();
        }
        if (rk0Var.b == null) {
            rk0Var.b = new ArrayList();
        }
        rk0Var.b.add(obj);
    }

    public Object m() {
        rk0 rk0Var = (rk0) this.b;
        rk0 rk0Var2 = rk0Var.d;
        while (true) {
            boolean zEquals = rk0Var2.equals(rk0Var);
            Object obj = rk0Var2.a;
            if (zEquals) {
                return null;
            }
            ArrayList arrayList = rk0Var2.b;
            int size = arrayList != null ? arrayList.size() : 0;
            Object objRemove = size > 0 ? rk0Var2.b.remove(size - 1) : null;
            if (objRemove != null) {
                return objRemove;
            }
            rk0 rk0Var3 = rk0Var2.d;
            rk0Var3.c = rk0Var2.c;
            rk0Var2.c.d = rk0Var3;
            ((HashMap) this.c).remove(obj);
            ((xb1) obj).a();
            rk0Var2 = rk0Var2.d;
        }
    }

    @Override // defpackage.ak
    public void n(wj wjVar, gj1 gj1Var) {
        ((ny) this.c).a.execute(new dg(this, (ak) this.b, gj1Var, 2));
    }

    public Drawable o(Drawable drawable, boolean z) {
        if (!(drawable instanceof LayerDrawable)) {
            if (!(drawable instanceof BitmapDrawable)) {
                return drawable;
            }
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (((Bitmap) this.c) == null) {
                this.c = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        LayerDrawable layerDrawable = (LayerDrawable) drawable;
        int numberOfLayers = layerDrawable.getNumberOfLayers();
        Drawable[] drawableArr = new Drawable[numberOfLayers];
        for (int i = 0; i < numberOfLayers; i++) {
            int id = layerDrawable.getId(i);
            drawableArr[i] = o(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
        }
        LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
        for (int i2 = 0; i2 < numberOfLayers; i2++) {
            layerDrawable2.setId(i2, layerDrawable.getId(i2));
            layerDrawable2.setLayerGravity(i2, layerDrawable.getLayerGravity(i2));
            layerDrawable2.setLayerWidth(i2, layerDrawable.getLayerWidth(i2));
            layerDrawable2.setLayerHeight(i2, layerDrawable.getLayerHeight(i2));
            layerDrawable2.setLayerInsetLeft(i2, layerDrawable.getLayerInsetLeft(i2));
            layerDrawable2.setLayerInsetRight(i2, layerDrawable.getLayerInsetRight(i2));
            layerDrawable2.setLayerInsetTop(i2, layerDrawable.getLayerInsetTop(i2));
            layerDrawable2.setLayerInsetBottom(i2, layerDrawable.getLayerInsetBottom(i2));
            layerDrawable2.setLayerInsetStart(i2, layerDrawable.getLayerInsetStart(i2));
            layerDrawable2.setLayerInsetEnd(i2, layerDrawable.getLayerInsetEnd(i2));
        }
        return layerDrawable2;
    }

    public void q(zt2 zt2Var) {
        ArrayList arrayList = zt2Var.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((HashMap) this.b).put(Integer.valueOf(((av2) obj).a).toString(), zt2Var);
        }
    }

    @Override // defpackage.ak
    public void r(wj wjVar, Throwable th) {
        ((ny) this.c).a.execute(new dg(this, (ak) this.b, th, 3));
    }

    public qt2 t(ep1 ep1Var, qt2 qt2Var) {
        gu2.l0(ep1Var);
        if (!(qt2Var instanceof rt2)) {
            return qt2Var;
        }
        rt2 rt2Var = (rt2) qt2Var;
        ArrayList arrayList = rt2Var.b;
        String str = rt2Var.a;
        HashMap map = (HashMap) this.b;
        return (map.containsKey(str) ? (zt2) map.get(str) : (zt2) this.c).a(str, ep1Var, arrayList);
    }

    public String toString() {
        switch (this.a) {
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
                rk0 rk0Var = (rk0) this.b;
                rk0 rk0Var2 = rk0Var.c;
                boolean z = false;
                while (!rk0Var2.equals(rk0Var)) {
                    sb.append('{');
                    sb.append(rk0Var2.a);
                    sb.append(':');
                    ArrayList arrayList = rk0Var2.b;
                    sb.append(arrayList != null ? arrayList.size() : 0);
                    sb.append("}, ");
                    rk0Var2 = rk0Var2.c;
                    z = true;
                }
                if (z) {
                    sb.delete(sb.length() - 2, sb.length());
                }
                sb.append(" )");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ f91(int i, Object obj, Object obj2, boolean z) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public f91(IBinder iBinder) throws RemoteException {
        this.a = 13;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.b = new Messenger(iBinder);
            this.c = null;
        } else if (Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
            this.c = new zzd(iBinder);
            this.b = null;
        } else {
            Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
            throw new RemoteException();
        }
    }

    public f91(AppTestApp appTestApp) {
        this.a = 0;
        this.c = appTestApp;
        this.b = xe2.a(appTestApp.getApplicationContext());
        Context applicationContext = appTestApp.getApplicationContext();
        if (z32.v != null) {
            return;
        }
        z32.v = applicationContext.getApplicationContext();
    }

    public /* synthetic */ f91(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public f91(AbsSeekBar absSeekBar) {
        this.a = 1;
        this.b = absSeekBar;
    }
}
