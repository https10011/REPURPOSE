package defpackage;

import android.app.Notification;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class o71 {
    public final Context a;
    public final Notification.Builder b;
    public final m71 c;
    public final Bundle d = new Bundle();
    public final int e;

    /* JADX WARN: Multi-variable type inference failed */
    public o71(m71 m71Var) {
        ArrayList arrayList;
        int i;
        ArrayList arrayList2;
        int i2;
        this.c = m71Var;
        Context context = m71Var.a;
        ArrayList arrayList3 = m71Var.u;
        ArrayList arrayList4 = m71Var.c;
        ArrayList arrayList5 = m71Var.d;
        this.a = context;
        if (Build.VERSION.SDK_INT >= 26) {
            this.b = g7.a(context, m71Var.q);
        } else {
            this.b = new Notification.Builder(context);
        }
        Notification notification = m71Var.s;
        Context context2 = null;
        this.b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(m71Var.e).setContentText(m71Var.f).setContentInfo(null).setContentIntent(m71Var.g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(m71Var.i).setProgress(0, 0, false);
        Notification.Builder builder = this.b;
        IconCompat iconCompat = m71Var.h;
        builder.setLargeIcon(iconCompat == null ? null : iconCompat.f(context));
        this.b.setSubText(null).setUsesChronometer(false).setPriority(m71Var.j);
        ArrayList arrayList6 = m71Var.b;
        int size = arrayList6.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList6.get(i3);
            i3++;
            i71 i71Var = (i71) obj;
            if (i71Var.b == null && (i2 = i71Var.e) != 0) {
                i71Var.b = IconCompat.b(i2);
            }
            IconCompat iconCompat2 = i71Var.b;
            boolean z = i71Var.c;
            Bundle bundle = i71Var.a;
            ArrayList arrayList7 = arrayList6;
            Notification.Action.Builder builder2 = new Notification.Action.Builder(iconCompat2 != null ? iconCompat2.f(context2) : context2, i71Var.f, i71Var.g);
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            bundle2.putBoolean("android.support.allowGeneratedReplies", z);
            builder2.setAllowGeneratedReplies(z);
            bundle2.putInt("android.support.action.semanticAction", 0);
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 28) {
                cs.o(builder2);
            }
            if (i4 >= 29) {
                za.f(builder2);
            }
            if (i4 >= 31) {
                n71.a(builder2);
            }
            bundle2.putBoolean("android.support.action.showsUserInterface", i71Var.d);
            builder2.addExtras(bundle2);
            this.b.addAction(builder2.build());
            arrayList6 = arrayList7;
            context2 = null;
        }
        Bundle bundle3 = m71Var.n;
        if (bundle3 != null) {
            this.d.putAll(bundle3);
        }
        this.b.setShowWhen(m71Var.k);
        this.b.setLocalOnly(m71Var.m);
        this.b.setGroup(null);
        this.b.setSortKey(null);
        this.b.setGroupSummary(false);
        this.e = 0;
        this.b.setCategory(null);
        this.b.setColor(m71Var.o);
        this.b.setVisibility(m71Var.p);
        this.b.setPublicVersion(null);
        this.b.setSound(notification.sound, notification.audioAttributes);
        if (Build.VERSION.SDK_INT < 28) {
            if (arrayList4 == null) {
                arrayList2 = null;
            } else {
                arrayList2 = new ArrayList(arrayList4.size());
                Iterator it = arrayList4.iterator();
                if (it.hasNext()) {
                    throw y00.i(it);
                }
            }
            if (arrayList2 != null) {
                if (arrayList3 == null) {
                    arrayList3 = arrayList2;
                } else {
                    ob obVar = new ob(arrayList3.size() + arrayList2.size());
                    obVar.addAll(arrayList2);
                    obVar.addAll(arrayList3);
                    arrayList3 = new ArrayList(obVar);
                }
            }
        }
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            int size2 = arrayList3.size();
            int i5 = 0;
            while (i5 < size2) {
                Object obj2 = arrayList3.get(i5);
                i5++;
                this.b.addPerson((String) obj2);
            }
        }
        if (arrayList5.size() > 0) {
            if (m71Var.n == null) {
                m71Var.n = new Bundle();
            }
            Bundle bundle4 = m71Var.n.getBundle("android.car.EXTENSIONS");
            bundle4 = bundle4 == null ? new Bundle() : bundle4;
            Bundle bundle5 = new Bundle(bundle4);
            Bundle bundle6 = new Bundle();
            int i6 = 0;
            while (i6 < arrayList5.size()) {
                String string = Integer.toString(i6);
                i71 i71Var2 = (i71) arrayList5.get(i6);
                Bundle bundle7 = new Bundle();
                if (i71Var2.b == null && (i = i71Var2.e) != 0) {
                    i71Var2.b = IconCompat.b(i);
                }
                IconCompat iconCompat3 = i71Var2.b;
                Bundle bundle8 = i71Var2.a;
                ArrayList arrayList8 = arrayList4;
                bundle7.putInt("icon", iconCompat3 != null ? iconCompat3.c() : 0);
                bundle7.putCharSequence("title", i71Var2.f);
                bundle7.putParcelable("actionIntent", i71Var2.g);
                Bundle bundle9 = bundle8 != null ? new Bundle(bundle8) : new Bundle();
                bundle9.putBoolean("android.support.allowGeneratedReplies", i71Var2.c);
                bundle7.putBundle("extras", bundle9);
                bundle7.putParcelableArray("remoteInputs", null);
                bundle7.putBoolean("showsUserInterface", i71Var2.d);
                bundle7.putInt("semanticAction", 0);
                bundle6.putBundle(string, bundle7);
                i6++;
                arrayList4 = arrayList8;
            }
            arrayList = arrayList4;
            bundle4.putBundle("invisible_actions", bundle6);
            bundle5.putBundle("invisible_actions", bundle6);
            if (m71Var.n == null) {
                m71Var.n = new Bundle();
            }
            m71Var.n.putBundle("android.car.EXTENSIONS", bundle4);
            this.d.putBundle("android.car.EXTENSIONS", bundle5);
        } else {
            arrayList = arrayList4;
        }
        this.b.setExtras(m71Var.n);
        this.b.setRemoteInputHistory(null);
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 26) {
            g7.i(this.b);
            g7.o(this.b);
            g7.p(this.b);
            g7.q(this.b);
            g7.k(this.b, 0);
            if (!TextUtils.isEmpty(m71Var.q)) {
                this.b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i7 >= 28) {
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                throw y00.i(it2);
            }
        }
        if (i7 >= 29) {
            za.d(this.b, m71Var.r);
            za.e(this.b);
        }
        if (i7 >= 36) {
            v2.e(this.b);
        }
        if (m71Var.t) {
            this.c.getClass();
            this.e = 1;
            this.b.setVibrate(null);
            this.b.setSound(null);
            int i8 = notification.defaults & (-4);
            notification.defaults = i8;
            this.b.setDefaults(i8);
            if (i7 >= 26) {
                this.c.getClass();
                if (TextUtils.isEmpty(null)) {
                    this.b.setGroup("silent");
                }
                g7.k(this.b, 1);
            }
        }
    }
}
