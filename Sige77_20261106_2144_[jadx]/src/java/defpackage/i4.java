package defpackage;

import android.animation.ValueAnimator;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.animation.AnimationUtils;
import androidx.activity.ComponentActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.lifecycle.b;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.viewpager.widget.ViewPager;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.hjq.toast.BuildConfig;
import com.transsion.athena.data.TrackData;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class i4 implements Runnable {
    public final /* synthetic */ int a;
    public Object b;

    public i4(bh2 bh2Var) {
        this.a = 29;
        Objects.requireNonNull(bh2Var);
        this.b = bh2Var;
    }

    /* JADX INFO: Infinite loop detected, blocks: 15, insns: 0 */
    /* JADX WARN: Code duplicated, block: B:159:0x03ad  */
    @Override // java.lang.Runnable
    public final void run() {
        int i;
        Object obj;
        boolean z;
        boolean z2;
        String str = null;
        boolean z3 = false;
        switch (this.a) {
            case 0:
                ud2 ud2Var = (ud2) this.b;
                while (true) {
                    try {
                        ud2Var.f((j4) ((ReferenceQueue) ud2Var.b).remove());
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
                break;
            case 1:
                h8 h8Var = (h8) this.b;
                String str2 = ze2.a;
                if (!TextUtils.equals("online", "test")) {
                    TextUtils.equals("online", "online");
                    return;
                }
                sc2.d("Athena is in Test mode，should not release this APK（测试模式）[" + hc.h.getPackageName() + "]");
                h8Var.e(this, 60000L);
                return;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                wy0 wy0Var = (wy0) this.b;
                o30 o30Var = wy0Var.c;
                gd gdVar = wy0Var.a;
                if (wy0Var.b0) {
                    if (wy0Var.Z) {
                        wy0Var.Z = false;
                        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        gdVar.e = jCurrentAnimationTimeMillis;
                        gdVar.g = -1L;
                        gdVar.f = jCurrentAnimationTimeMillis;
                        gdVar.h = 0.5f;
                    }
                    if ((gdVar.g > 0 && AnimationUtils.currentAnimationTimeMillis() > gdVar.g + ((long) gdVar.i)) || !wy0Var.e()) {
                        wy0Var.b0 = false;
                        return;
                    }
                    if (wy0Var.a0) {
                        wy0Var.a0 = false;
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                        o30Var.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    if (gdVar.f == 0) {
                        uq1.m("Cannot compute scroll delta before calling start()");
                        return;
                    }
                    long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float fA = gdVar.a(jCurrentAnimationTimeMillis2);
                    long j = jCurrentAnimationTimeMillis2 - gdVar.f;
                    gdVar.f = jCurrentAnimationTimeMillis2;
                    wy0Var.d0.scrollListBy((int) (j * ((fA * 4.0f) + ((-4.0f) * fA * fA)) * gdVar.d));
                    WeakHashMap weakHashMap = x52.a;
                    o30Var.postOnAnimation(this);
                    return;
                }
                return;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                ei eiVar = (ei) this.b;
                eiVar.c = false;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) eiVar.e;
                c62 c62Var = bottomSheetBehavior.O;
                if (c62Var != null && c62Var.f()) {
                    eiVar.c(eiVar.b);
                    return;
                } else {
                    if (bottomSheetBehavior.N == 2) {
                        bottomSheetBehavior.D(eiVar.b);
                        return;
                    }
                    return;
                }
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                try {
                    ComponentActivity.e((ComponentActivity) this.b);
                    return;
                } catch (IllegalStateException e) {
                    if (!TextUtils.equals(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e;
                    }
                    return;
                } catch (NullPointerException e2) {
                    if (!TextUtils.equals(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e2;
                    }
                    return;
                }
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                q10 q10Var = (q10) this.b;
                q10Var.N0.onDismiss(q10Var.V0);
                return;
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                o30 o30Var2 = (o30) this.b;
                o30Var2.b0 = null;
                o30Var2.drawableStateChanged();
                return;
            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                n60.a.I((Context) this.b);
                return;
            case oc1.BYTES_FIELD_NUMBER /* 8 */:
                x90 x90Var = (x90) this.b;
                ValueAnimator valueAnimator = x90Var.z;
                int i2 = x90Var.A;
                if (i2 != 1) {
                    i = 2;
                    if (i2 != 2) {
                        return;
                    }
                } else {
                    i = 2;
                    valueAnimator.cancel();
                }
                x90Var.A = 3;
                float[] fArr = new float[i];
                fArr[0] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fArr[1] = 0.0f;
                valueAnimator.setFloatValues(fArr);
                valueAnimator.setDuration(500L);
                valueAnimator.start();
                return;
            case 9:
                Fragment fragment = (Fragment) this.b;
                if (fragment.w0 != null) {
                    fragment.f().getClass();
                    return;
                }
                return;
            case 10:
                ((e) this.b).y(true);
                return;
            case 11:
                synchronized (((b) this.b).a) {
                    obj = ((b) this.b).f;
                    ((b) this.b).f = b.k;
                    break;
                }
                ((b) this.b).j(obj);
                return;
            case 12:
                RecyclerView recyclerView = (RecyclerView) this.b;
                uf1 uf1Var = recyclerView.y0;
                if (uf1Var != null) {
                    mz mzVar = (mz) uf1Var;
                    long j2 = mzVar.d;
                    ArrayList arrayList = mzVar.h;
                    boolean zIsEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = mzVar.j;
                    boolean zIsEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = mzVar.k;
                    boolean zIsEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = mzVar.i;
                    boolean zIsEmpty4 = arrayList4.isEmpty();
                    if (zIsEmpty && zIsEmpty2 && zIsEmpty4 && zIsEmpty3) {
                        z = false;
                    } else {
                        int size = arrayList.size();
                        int i3 = 0;
                        while (i3 < size) {
                            Object obj2 = arrayList.get(i3);
                            i3++;
                            kg1 kg1Var = (kg1) obj2;
                            View view = kg1Var.a;
                            boolean z4 = zIsEmpty4;
                            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                            mzVar.q.add(kg1Var);
                            viewPropertyAnimatorAnimate.setDuration(j2).alpha(0.0f).setListener(new hz(mzVar, kg1Var, viewPropertyAnimatorAnimate, view)).start();
                            zIsEmpty4 = z4;
                            size = size;
                            arrayList = arrayList;
                        }
                        boolean z5 = zIsEmpty4;
                        arrayList.clear();
                        if (!zIsEmpty2) {
                            ArrayList arrayList5 = new ArrayList();
                            arrayList5.addAll(arrayList2);
                            mzVar.m.add(arrayList5);
                            arrayList2.clear();
                            gz gzVar = new gz(mzVar, arrayList5, 0);
                            if (zIsEmpty) {
                                gzVar.run();
                            } else {
                                View view2 = ((lz) arrayList5.get(0)).a.a;
                                WeakHashMap weakHashMap2 = x52.a;
                                view2.postOnAnimationDelayed(gzVar, j2);
                            }
                        }
                        if (!zIsEmpty3) {
                            ArrayList arrayList6 = new ArrayList();
                            arrayList6.addAll(arrayList3);
                            mzVar.n.add(arrayList6);
                            arrayList3.clear();
                            gz gzVar2 = new gz(mzVar, arrayList6, 1);
                            if (zIsEmpty) {
                                gzVar2.run();
                            } else {
                                View view3 = ((kz) arrayList6.get(0)).a.a;
                                WeakHashMap weakHashMap3 = x52.a;
                                view3.postOnAnimationDelayed(gzVar2, j2);
                            }
                        }
                        if (z5) {
                            z = false;
                        } else {
                            ArrayList arrayList7 = new ArrayList();
                            arrayList7.addAll(arrayList4);
                            mzVar.l.add(arrayList7);
                            arrayList4.clear();
                            gz gzVar3 = new gz(mzVar, arrayList7, 2);
                            if (zIsEmpty && zIsEmpty2 && zIsEmpty3) {
                                gzVar3.run();
                                z = false;
                            } else {
                                if (zIsEmpty) {
                                    j2 = 0;
                                }
                                long jMax = Math.max(!zIsEmpty2 ? mzVar.e : 0L, !zIsEmpty3 ? mzVar.f : 0L) + j2;
                                z = false;
                                View view4 = ((kg1) arrayList7.get(0)).a;
                                WeakHashMap weakHashMap4 = x52.a;
                                view4.postOnAnimationDelayed(gzVar3, jMax);
                            }
                        }
                    }
                } else {
                    z = false;
                }
                recyclerView.W0 = z;
                return;
            case 13:
                ii1 ii1Var = (ii1) this.b;
                ii1Var.c.e(ii1Var);
                return;
            case 14:
                ((StaggeredGridLayoutManager) this.b).B0();
                return;
            case 15:
                CheckableImageButton checkableImageButton = ((TextInputLayout) this.b).c.i;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                return;
            case 16:
                ((Toolbar) this.b).v();
                return;
            case 17:
                ny1 ny1Var = (ny1) this.b;
                Window.Callback callback = ny1Var.b;
                Menu menuP = ny1Var.p();
                i31 i31Var = menuP instanceof i31 ? (i31) menuP : null;
                if (i31Var != null) {
                    i31Var.w();
                }
                try {
                    menuP.clear();
                    if (!callback.onCreatePanelMenu(0, menuP) || !callback.onPreparePanel(0, null, menuP)) {
                        menuP.clear();
                    }
                    if (i31Var != null) {
                        return;
                    } else {
                        return;
                    }
                } finally {
                    if (i31Var != null) {
                        i31Var.v();
                    }
                }
                break;
            case 18:
                synchronized (this) {
                    ((a) this.b).W = false;
                    break;
                }
                while (true) {
                    Reference referencePoll = a.i0.poll();
                    if (referencePoll == null) {
                        boolean zIsAttachedToWindow = ((a) this.b).Y.isAttachedToWindow();
                        a aVar = (a) this.b;
                        if (!zIsAttachedToWindow) {
                            View view5 = aVar.Y;
                            z52 z52Var = a.j0;
                            view5.removeOnAttachStateChangeListener(z52Var);
                            ((a) this.b).Y.addOnAttachStateChangeListener(z52Var);
                            return;
                        }
                        if (aVar.Z) {
                            aVar.U();
                            return;
                        } else {
                            if (aVar.P()) {
                                aVar.Z = true;
                                aVar.O();
                                aVar.Z = false;
                                return;
                            }
                            return;
                        }
                    }
                    if (referencePoll instanceof w72) {
                        ((w72) referencePoll).a();
                    }
                }
                break;
            case 19:
                ((c62) this.b).n(0);
                return;
            case 20:
                ((ViewPager) this.b).setScrollState(0);
                return;
            case 21:
                ((hc2) this.b).c("lifecycle");
                return;
            case 22:
                Context context = hc.h;
                dc2 dc2VarA = dc2.a(context);
                String strN = dc2VarA.n("athena_id");
                try {
                    str = nj2.c(context).b;
                    break;
                } catch (Exception e3) {
                    cc2.b("%s", e3.getMessage());
                }
                if (!TextUtils.isEmpty(str) && !TextUtils.equals(strN, str)) {
                    dc2VarA.l("athena_id", str);
                    if (!TextUtils.isEmpty(strN)) {
                        try {
                            z2 = (sc2.e(context, "android.permission.READ_PHONE_STATE") || sc2.e(context, "android.permission.READ_PRIVILEGED_PHONE_STATE")) ? !sc2.h(context) : false;
                        } catch (Exception unused2) {
                            z2 = true;
                        }
                        if (z2) {
                            if (TextUtils.isEmpty(nj2.o())) {
                                TrackData trackData = new TrackData();
                                trackData.b(2, "en", "device_id_transfer");
                                trackData.a(1, 1, "cnt");
                                hc.g(9999L).i("data_discard", trackData, 9999L);
                            } else {
                                TrackData trackData2 = new TrackData();
                                trackData2.e("pre_gaid", strN);
                                trackData2.e("sn", nj2.o());
                                hc.g(9999L).i("device_id_transfer", trackData2, 9999L);
                            }
                        }
                    }
                    strN = str;
                }
                if (!TextUtils.isEmpty(strN)) {
                    sc2.a = strN;
                }
                if (TextUtils.isEmpty(strN) && TextUtils.isEmpty(nj2.b(context, 0))) {
                    cc2.b("%s", "device gaid and iid are null");
                }
                ((Handler) this.b).postDelayed(this, 7200000L);
                return;
            case 23:
                id2 id2Var = (id2) this.b;
                try {
                    id2Var.w = 0;
                    id2Var.W.clear();
                    id2Var.c = true;
                    id2Var.e = 0L;
                    ze2.q = BuildConfig.FLAVOR;
                    return;
                } catch (Exception unused3) {
                    return;
                }
            case 24:
                System.currentTimeMillis();
                lo2 lo2Var = (lo2) this.b;
                ((Handler) ((qp0) lo2Var.a).f).post(new bh0(18, this, lo2Var.p(), z3));
                System.currentTimeMillis();
                return;
            case 25:
                if (((dg2) this.b).c && ((dg2) this.b).d) {
                    ((dg2) this.b).c = false;
                    dg2 dg2Var = (dg2) this.b;
                    long jUptimeMillis2 = (SystemClock.uptimeMillis() - dg2Var.e) / 1000;
                    p11 p11Var = dg2Var.f;
                    if (jUptimeMillis2 >= 1) {
                        uf2 uf2Var = new uf2(1, null, Long.valueOf(System.currentTimeMillis()), Long.valueOf(jUptimeMillis2), null);
                        uf2Var.a = true;
                        hg2 hg2Var = (hg2) p11Var.d;
                        hg2Var.getClass();
                        Message messageObtain = Message.obtain();
                        messageObtain.what = 21;
                        messageObtain.obj = uf2Var;
                        hg2Var.sendMessage(messageObtain);
                        return;
                    }
                    return;
                }
                return;
            case 26:
                p11 p11Var2 = (p11) this.b;
                int iMin = 100;
                while (true) {
                    try {
                        ((LinkedBlockingQueue) p11Var2.c).poll(iMin, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException unused4) {
                    }
                    hg2 hg2Var2 = (hg2) p11Var2.d;
                    hg2Var2.getClass();
                    Message messageObtain2 = Message.obtain();
                    messageObtain2.what = 23;
                    messageObtain2.obj = null;
                    hg2Var2.sendMessage(messageObtain2);
                    iMin = Math.min(iMin * 10, 10000);
                }
                break;
            case 27:
                ((rg2) this.b).b();
                return;
            case 28:
                rg2 rg2Var = (rg2) ((wa) this.b).b;
                rg2Var.b.d(rg2Var.b.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            default:
                ((bh2) this.b).i.a(new ConnectionResult(4, (PendingIntent) null, (String) null));
                return;
        }
    }

    public /* synthetic */ i4(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public /* synthetic */ i4() {
        this.a = 1;
    }
}
