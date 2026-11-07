package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.hjq.toast.BuildConfig;
import com.transsion.athena.aidl.AthenaTrackService;
import com.transsion.athena.data.TrackData;
import com.transsion.athena.data.TrackDataWrapper;
import java.io.File;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class hc {
    public static volatile hc e = null;
    public static volatile int f = -1;
    public static volatile long g;
    public static Context h;
    public static id2 i;
    public boolean a;
    public Object b;
    public Object c;
    public final Object d;

    public hc(d20 d20Var, c20 c20Var) {
        this.d = d20Var;
        this.b = c20Var;
        this.c = c20Var.e ? null : new boolean[d20Var.i];
    }

    public static boolean e() {
        if (h == null || e == null) {
            return false;
        }
        String str = ze2.a;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f7  */
    /* JADX WARN: Instruction removed from duplicated block: B:40:0x00f7, please report this as an issue */
    public static hc g(long j) {
        CopyOnWriteArrayList copyOnWriteArrayList;
        int i2 = 1;
        if (e == null) {
            synchronized (hc.class) {
                try {
                    if (e == null) {
                        e = new hc();
                        if (f == 0) {
                            h8 h8VarD = e.d();
                            Handler handler = new Handler(Looper.getMainLooper());
                            h8VarD.d(new y1(h8VarD, 4));
                            i4 i4Var = new i4();
                            i4Var.b = h8VarD;
                            h8VarD.e(i4Var, 3000L);
                            h8VarD.e(new g(9), 6000L);
                            handler.postDelayed(new g(8), 6000L);
                            handler.postDelayed(new gc(handler), 3600000L);
                            h8VarD.d(new g(10));
                        } else {
                            hc hcVar = e;
                            Context context = h;
                            hcVar.getClass();
                            try {
                                cc2.e("AthenaAnalytics bindTrackService");
                                Intent intent = new Intent(context, (Class<?>) AthenaTrackService.class);
                                intent.setPackage(context.getApplicationInfo().packageName);
                                context.bindService(intent, new wb2(hcVar, i2), 1);
                            } catch (Exception e2) {
                                cc2.c(Log.getStackTraceString(e2));
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        String str = sc2.a;
        if (j > 999 && j <= 9999) {
            int i3 = (int) j;
            if (f == 0) {
                CopyOnWriteArrayList copyOnWriteArrayList2 = qd2.b;
                if (!copyOnWriteArrayList2.contains(Integer.valueOf(i3)) ? copyOnWriteArrayList2.add(Integer.valueOf(i3)) : false) {
                    Message message = new Message();
                    message.what = 400;
                    message.arg1 = i3;
                    e.d().c(message, 0L);
                } else if (f == 1) {
                    copyOnWriteArrayList = qd2.b;
                    if (copyOnWriteArrayList.contains(Integer.valueOf(i3)) ? false : copyOnWriteArrayList.add(Integer.valueOf(i3))) {
                        cc2.a("multi process appid " + i3 + " register successful");
                    }
                }
            } else if (f == 1) {
                copyOnWriteArrayList = qd2.b;
                if (copyOnWriteArrayList.contains(Integer.valueOf(i3)) ? false : copyOnWriteArrayList.add(Integer.valueOf(i3))) {
                    cc2.a("multi process appid " + i3 + " register successful");
                }
            }
        }
        return e;
    }

    public static boolean h() {
        if (Build.VERSION.SDK_INT >= 29) {
            String str = ze2.a;
            return h.checkCallingOrSelfPermission("android.permission.READ_PRIVILEGED_PHONE_STATE") == 0;
        }
        String str2 = ze2.a;
        return false;
    }

    public void a(String str, TrackData trackData, long j) {
        if (f == 0) {
            d().f(str, trackData, j);
            return;
        }
        if (h != null) {
            String str2 = ze2.a;
            try {
                if (!TextUtils.isEmpty(BuildConfig.FLAVOR)) {
                    trackData.a.put("scode", BuildConfig.FLAVOR);
                }
                c(str, trackData, j);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public void b() {
        d20.a((d20) this.d, this, false);
    }

    public void c(String str, TrackData trackData, long j) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.d;
        try {
            if (((jd2) this.c) != null && this.a) {
                if (trackData.f() >= 524288) {
                    cc2.c("TrackByAidl trackData size is too large, ignored !!");
                    return;
                }
                cc2.a(String.format(Locale.getDefault(), "TrackByAidl tid : %d, eventName : %s", Long.valueOf(j), str));
                ((jd2) this.c).r(str, trackData, j);
                return;
            }
            if (copyOnWriteArrayList.size() < 100) {
                TrackDataWrapper trackDataWrapper = new TrackDataWrapper();
                trackDataWrapper.a = str;
                trackDataWrapper.b = trackData;
                trackDataWrapper.c = j;
                copyOnWriteArrayList.add(trackDataWrapper);
            }
        } catch (Exception e2) {
            cc2.c(Log.getStackTraceString(e2));
        }
    }

    public h8 d() {
        Context context;
        if (((h8) this.b) == null && (context = h) != null) {
            if (ff2.o == null) {
                synchronized (ff2.class) {
                    try {
                        if (ff2.o == null) {
                            ff2.o = new ff2(context);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            this.b = ff2.o;
        }
        return (h8) this.b;
    }

    public File f() {
        File file;
        synchronized (((d20) this.d)) {
            try {
                c20 c20Var = (c20) this.b;
                if (c20Var.f != this) {
                    throw new IllegalStateException();
                }
                if (!c20Var.e) {
                    ((boolean[]) this.c)[0] = true;
                }
                file = c20Var.d[0];
                ((d20) this.d).a.mkdirs();
            } catch (Throwable th) {
                throw th;
            }
        }
        return file;
    }

    public void i(String str, TrackData trackData, long j) {
        String str2 = sc2.a;
        int length = String.valueOf(j).length();
        if ((length != 8 && length != 12 && length != 4) || TextUtils.isEmpty(str)) {
            cc2.a("The parameter tid : " + j + " or event name : " + str + " is illegal.");
            return;
        }
        if (!qd2.b.contains(Integer.valueOf(sc2.a(j)))) {
            cc2.a("The tid " + j + " is not belong the app");
            return;
        }
        try {
            if (trackData != null) {
                a(str, trackData, j);
            } else {
                a(str, new TrackData(), j);
            }
        } catch (Exception e2) {
            cc2.c(Log.getStackTraceString(e2));
        }
    }

    public String j() {
        if (!this.a) {
            this.a = true;
            h43 h43Var = (h43) this.d;
            this.c = h43Var.I().getString((String) this.b, null);
        }
        return (String) this.c;
    }

    public void k(String str) {
        SharedPreferences.Editor editorEdit = ((h43) this.d).I().edit();
        editorEdit.putString((String) this.b, str);
        editorEdit.apply();
        this.c = str;
    }

    public hc(h43 h43Var, String str) {
        this.d = h43Var;
        gu2.l(str);
        this.b = str;
    }

    public hc(bk0 bk0Var, fr1 fr1Var) {
        this.d = new hr1(this);
        this.c = bk0Var;
        this.b = fr1Var;
    }

    public hc() {
        this.d = new CopyOnWriteArrayList();
    }
}
