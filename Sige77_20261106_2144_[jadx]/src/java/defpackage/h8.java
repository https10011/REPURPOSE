package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Message;
import android.view.MenuItem;
import android.view.View;
import com.transsion.athena.data.TrackData;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.LinkedHashSet;
import javax.crypto.AEADBadTagException;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class h8 {
    public Object a;
    public Object b;

    public h8(String str, Bundle bundle) {
        str.getClass();
        bundle.getClass();
        this.a = str;
        this.b = bundle;
    }

    public static byte[] t(byte[] bArr, ByteBuffer byteBuffer) {
        int length = bArr.length % 16 == 0 ? bArr.length : (bArr.length + 16) - (bArr.length % 16);
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining % 16;
        int i2 = (i == 0 ? iRemaining : (iRemaining + 16) - i) + length;
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(i2 + 16).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.put(bArr);
        byteBufferOrder.position(length);
        byteBufferOrder.put(byteBuffer);
        byteBufferOrder.position(i2);
        byteBufferOrder.putLong(bArr.length);
        byteBufferOrder.putLong(iRemaining);
        return byteBufferOrder.array();
    }

    public abstract void c(Message message, long j);

    public abstract void d(Runnable runnable);

    public abstract void e(Runnable runnable, long j);

    public abstract void f(String str, TrackData trackData, long j);

    public void g() {
        xh xhVar = (xh) this.a;
        if (xhVar != null) {
            try {
                ((k8) this.b).X.unregisterReceiver(xhVar);
            } catch (IllegalArgumentException unused) {
            }
            this.a = null;
        }
    }

    public void h() {
        ms1 ms1Var = (ms1) this.a;
        rk rkVar = (rk) this.b;
        LinkedHashSet linkedHashSet = ms1Var.e;
        if (linkedHashSet.remove(rkVar) && linkedHashSet.isEmpty()) {
            ms1Var.b();
        }
    }

    public abstract IntentFilter i();

    public abstract void j();

    public abstract int k();

    public MenuItem l(MenuItem menuItem) {
        if (!(menuItem instanceof lv1)) {
            return menuItem;
        }
        lv1 lv1Var = (lv1) menuItem;
        if (((wq1) this.b) == null) {
            this.b = new wq1(0);
        }
        MenuItem menuItem2 = (MenuItem) ((wq1) this.b).get(lv1Var);
        if (menuItem2 != null) {
            return menuItem2;
        }
        s31 s31Var = new s31((Context) this.a, lv1Var);
        ((wq1) this.b).put(lv1Var, s31Var);
        return s31Var;
    }

    public boolean m() {
        ms1 ms1Var = (ms1) this.a;
        View view = ms1Var.c.t0;
        view.getClass();
        int i = 4;
        if (view.getAlpha() != 0.0f || view.getVisibility() != 0) {
            int visibility = view.getVisibility();
            if (visibility == 0) {
                i = 2;
            } else if (visibility != 4) {
                if (visibility != 8) {
                    e.g(ck1.r(visibility, "Unknown visibility "));
                    return false;
                }
                i = 3;
            }
        }
        int i2 = ms1Var.a;
        if (i != i2) {
            return (i == 2 || i2 == 2) ? false : true;
        }
        return true;
    }

    public abstract void n();

    public void o() {
        g();
        IntentFilter intentFilterI = i();
        if (intentFilterI.countActions() == 0) {
            return;
        }
        if (((xh) this.a) == null) {
            this.a = new xh(this, 1);
        }
        ((k8) this.b).X.registerReceiver((xh) this.a, intentFilterI);
    }

    public abstract sn p(byte[] bArr, int i);

    public String q(String str, String str2) {
        return ((String) this.a) + str + "?key=" + str2;
    }

    public void r(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (byteBuffer.remaining() < bArr2.length + 16) {
            e.g("Given ByteBuffer output is too small");
            return;
        }
        int iPosition = byteBuffer.position();
        sn snVar = (sn) this.a;
        snVar.getClass();
        if (byteBuffer.remaining() < bArr2.length) {
            e.g("Given ByteBuffer output is too small");
            return;
        }
        snVar.E(bArr, byteBuffer, ByteBuffer.wrap(bArr2));
        byteBuffer.position(iPosition);
        byteBuffer.limit(byteBuffer.limit() - 16);
        if (bArr3 == null) {
            bArr3 = new byte[0];
        }
        ByteBuffer byteBufferC = ((sn) this.b).C(bArr, 0);
        byte[] bArr4 = new byte[32];
        byteBufferC.get(bArr4);
        byte[] bArrK = dw0.K(bArr4, t(bArr3, byteBuffer));
        byteBuffer.limit(byteBuffer.limit() + 16);
        byteBuffer.put(bArrK);
    }

    public byte[] s(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (byteBuffer.remaining() < 16) {
            tv2.f("ciphertext too short");
            return null;
        }
        int iPosition = byteBuffer.position();
        byte[] bArr3 = new byte[16];
        byteBuffer.position(byteBuffer.limit() - 16);
        byteBuffer.get(bArr3);
        byteBuffer.position(iPosition);
        byteBuffer.limit(byteBuffer.limit() - 16);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        try {
            byte[] bArr4 = new byte[32];
            ((sn) this.b).C(bArr, 0).get(bArr4);
            if (!MessageDigest.isEqual(dw0.K(bArr4, t(bArr2, byteBuffer)), bArr3)) {
                throw new GeneralSecurityException("invalid MAC");
            }
            byteBuffer.position(iPosition);
            sn snVar = (sn) this.a;
            snVar.getClass();
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
            snVar.E(bArr, byteBufferAllocate, byteBuffer);
            return byteBufferAllocate.array();
        } catch (GeneralSecurityException e) {
            throw new AEADBadTagException(e.toString());
        }
    }

    public /* synthetic */ h8(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public /* synthetic */ h8(Context context) {
        this.a = context;
    }

    public h8(k8 k8Var) {
        this.b = k8Var;
    }
}
