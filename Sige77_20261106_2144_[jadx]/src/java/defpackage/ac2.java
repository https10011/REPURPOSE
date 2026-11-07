package defpackage;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ClipDescription;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.AudioAttributes;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.PersistableBundle;
import android.os.Process;
import android.os.SystemClock;
import android.os.Trace;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.graphics.drawable.IconCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.a;
import com.facebook.Profile;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.hjq.toast.BuildConfig;
import com.transsion.athena.data.AppIdData;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.Adler32;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ac2 implements bj1, yb1, jq0 {
    public static ac2 X;
    public static volatile ac2 Z;
    public static volatile ac2 e;
    public static volatile ac2 f;
    public static ac2 w;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;
    public static final Object i = new Object();
    public static final k42 v = new k42(3);
    public static final xn W = new xn(6);
    public static final sh1 Y = new sh1(8);
    public static final byte[] a0 = new byte[0];

    public ac2(ud2 ud2Var, qh1 qh1Var, xy xyVar, Set set) {
        this.a = 21;
        this.b = qh1Var;
        this.c = ud2Var;
        this.d = xyVar;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            M(str, 0, str.length(), 1, true, new vy2(str, 3));
        }
    }

    public static ac2 D(Context context) {
        if (f == null) {
            synchronized (i) {
                try {
                    if (f == null) {
                        f = new ac2(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f;
    }

    public static ac2 i(Context context) {
        if (e == null) {
            synchronized (ac2.class) {
                try {
                    if (e == null) {
                        ac2 ac2Var = new ac2(0);
                        try {
                            ac2Var.b = context;
                            ac2Var.c = rc2.h(context);
                            ac2Var.d = context.getFilesDir().getPath();
                        } catch (Exception e2) {
                            b81 b81Var = cc2.a;
                            cc2.c(Log.getStackTraceString(e2));
                        }
                        e = ac2Var;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return e;
    }

    public static boolean t(Editable editable, KeyEvent keyEvent, boolean z) {
        c22[] c22VarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (c22VarArr = (c22[]) editable.getSpans(selectionStart, selectionEnd, c22.class)) != null && c22VarArr.length > 0) {
                for (c22 c22Var : c22VarArr) {
                    int spanStart = editable.getSpanStart(c22Var);
                    int spanEnd = editable.getSpanEnd(c22Var);
                    if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public View A(int i2) {
        return ((RecyclerView) ((wa) this.b).b).getChildAt(E(i2));
    }

    public int B() {
        return ((RecyclerView) ((wa) this.b).b).getChildCount() - ((ArrayList) this.d).size();
    }

    public ImageHeaderParser.ImageType C() throws Throwable {
        switch (this.a) {
            case 25:
                return qt.n((List) this.c, kj.c((ByteBuffer) this.b));
            case 26:
                List list = (List) this.d;
                nf1 nf1Var = (nf1) ((wa) this.b).b;
                nf1Var.reset();
                return qt.m(list, nf1Var, (v01) this.c);
            default:
                List list2 = (List) this.c;
                a aVar = (a) this.d;
                v01 v01Var = (v01) this.b;
                int size = list2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    rn0 rn0Var = (rn0) list2.get(i2);
                    nf1 nf1Var2 = null;
                    try {
                        nf1 nf1Var3 = new nf1(new FileInputStream(aVar.a().getFileDescriptor()), v01Var);
                        try {
                            ImageHeaderParser.ImageType imageTypeF = rn0Var.f(nf1Var3);
                            nf1Var3.b();
                            aVar.a();
                            if (imageTypeF != ImageHeaderParser.ImageType.UNKNOWN) {
                                return imageTypeF;
                            }
                        } catch (Throwable th) {
                            th = th;
                            nf1Var2 = nf1Var3;
                            if (nf1Var2 != null) {
                                nf1Var2.b();
                            }
                            aVar.a();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                return ImageHeaderParser.ImageType.UNKNOWN;
        }
    }

    public int E(int i2) {
        jm jmVar = (jm) this.c;
        if (i2 < 0) {
            return -1;
        }
        int childCount = ((RecyclerView) ((wa) this.b).b).getChildCount();
        int i3 = i2;
        while (i3 < childCount) {
            int iB = i2 - (i3 - jmVar.b(i3));
            if (iB == 0) {
                while (jmVar.d(i3)) {
                    i3++;
                }
                return i3;
            }
            i3 += iB;
        }
        return -1;
    }

    public View F(int i2) {
        return ((RecyclerView) ((wa) this.b).b).getChildAt(i2);
    }

    public int G() {
        return ((RecyclerView) ((wa) this.b).b).getChildCount();
    }

    /* JADX WARN: Code duplicated, block: B:101:0x024a  */
    /* JADX WARN: Code duplicated, block: B:102:0x024c  */
    /* JADX WARN: Code duplicated, block: B:107:0x0277  */
    /* JADX WARN: Code duplicated, block: B:110:0x027f  */
    /* JADX WARN: Code duplicated, block: B:111:0x029c  */
    /* JADX WARN: Code duplicated, block: B:114:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:115:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:117:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:120:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:121:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:123:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:124:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:126:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:129:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:130:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:133:0x0315  */
    /* JADX WARN: Code duplicated, block: B:139:0x0335  */
    /* JADX WARN: Code duplicated, block: B:143:0x0344  */
    /* JADX WARN: Code duplicated, block: B:147:0x035d  */
    /* JADX WARN: Code duplicated, block: B:148:0x035f  */
    /* JADX WARN: Code duplicated, block: B:150:0x038d  */
    /* JADX WARN: Code duplicated, block: B:156:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:161:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:163:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:166:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:169:0x0407  */
    /* JADX WARN: Code duplicated, block: B:170:0x0409  */
    /* JADX WARN: Code duplicated, block: B:176:0x042f  */
    /* JADX WARN: Code duplicated, block: B:179:0x043d  */
    /* JADX WARN: Code duplicated, block: B:180:0x043f  */
    /* JADX WARN: Code duplicated, block: B:186:0x0469  */
    /* JADX WARN: Code duplicated, block: B:189:0x0477  */
    /* JADX WARN: Code duplicated, block: B:190:0x0479  */
    /* JADX WARN: Code duplicated, block: B:192:0x047f  */
    /* JADX WARN: Code duplicated, block: B:194:0x0498  */
    /* JADX WARN: Code duplicated, block: B:197:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:200:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:203:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:207:0x04d7  */
    /* JADX WARN: Code duplicated, block: B:211:0x04ec  */
    /* JADX WARN: Code duplicated, block: B:214:0x04f6  */
    /* JADX WARN: Code duplicated, block: B:217:0x0500  */
    /* JADX WARN: Code duplicated, block: B:221:0x0516  */
    /* JADX WARN: Code duplicated, block: B:226:0x0545  */
    /* JADX WARN: Code duplicated, block: B:227:0x0548 A[Catch: ExecutionException -> 0x055b, TimeoutException -> 0x055d, InterruptedException -> 0x0566, TryCatch #8 {InterruptedException -> 0x0566, ExecutionException -> 0x055b, TimeoutException -> 0x055d, blocks: (B:224:0x052c, B:228:0x0550, B:227:0x0548), top: B:253:0x052c }] */
    /* JADX WARN: Code duplicated, block: B:237:0x0592  */
    /* JADX WARN: Code duplicated, block: B:247:0x03c4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:251:0x039d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:253:0x052c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:49:0x012e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0135  */
    /* JADX WARN: Code duplicated, block: B:53:0x013b  */
    /* JADX WARN: Code duplicated, block: B:56:0x0146  */
    /* JADX WARN: Code duplicated, block: B:58:0x0158  */
    /* JADX WARN: Code duplicated, block: B:59:0x0160  */
    /* JADX WARN: Code duplicated, block: B:98:0x023d  */
    /* JADX WARN: Instruction removed from duplicated block: B:192:0x047f, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:221:0x0516, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v104 */
    /* JADX WARN: Type inference failed for: r0v105, types: [int] */
    /* JADX WARN: Type inference failed for: r0v179 */
    /* JADX WARN: Type inference failed for: r0v180 */
    /* JADX WARN: Type inference failed for: r0v181 */
    /* JADX WARN: Type inference failed for: r0v182 */
    public boolean H() {
        pn0 pn0Var;
        Bundle bundle;
        int identifier;
        String string;
        int identifier2;
        String strK;
        Uri defaultUri;
        String strK2;
        String strK3;
        Uri uri;
        Intent launchIntentForPackage;
        Bundle bundle2;
        PendingIntent activity;
        PendingIntent broadcast;
        String strK4;
        Integer numValueOf;
        String strK5;
        Integer numD;
        Integer numD2;
        Integer numD3;
        Long lI;
        long[] jArrL;
        int[] iArrF;
        boolean zB;
        ?? r0;
        ?? r1;
        Notification notification;
        String strK6;
        Bitmap bitmap;
        IconCompat iconCompat;
        boolean z;
        int i2;
        int i3;
        int i4;
        int i5 = 1;
        if (((kj0) this.d).B("gcm.n.noui")) {
            return true;
        }
        FirebaseMessagingService firebaseMessagingService = (FirebaseMessagingService) this.c;
        if (!((KeyguardManager) firebaseMessagingService.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            int iMyPid = Process.myPid();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) firebaseMessagingService.getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.pid == iMyPid) {
                        if (runningAppProcessInfo.importance != 100) {
                            break;
                        }
                        return false;
                    }
                }
            }
        }
        String strK7 = ((kj0) this.d).K("gcm.n.image");
        if (TextUtils.isEmpty(strK7)) {
            pn0Var = null;
        } else {
            try {
                pn0Var = new pn0(new URL(strK7));
            } catch (MalformedURLException unused) {
                Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + strK7);
                pn0Var = null;
            }
        }
        if (pn0Var != null) {
            ExecutorService executorService = (ExecutorService) this.b;
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            pn0Var.b = executorService.submit(new x4(29, pn0Var, taskCompletionSource));
            pn0Var.c = taskCompletionSource.getTask();
        }
        FirebaseMessagingService firebaseMessagingService2 = (FirebaseMessagingService) this.c;
        kj0 kj0Var = (kj0) this.d;
        AtomicInteger atomicInteger = zo.a;
        try {
            ApplicationInfo applicationInfo = firebaseMessagingService2.getPackageManager().getApplicationInfo(firebaseMessagingService2.getPackageName(), 128);
            if (applicationInfo == null || (bundle = applicationInfo.metaData) == null) {
                bundle = Bundle.EMPTY;
            }
        } catch (PackageManager.NameNotFoundException e2) {
            Log.w("FirebaseMessaging", "Couldn't get own application info: " + e2);
        }
        Bundle bundle3 = bundle;
        String strK8 = kj0Var.K("gcm.n.android_channel_id");
        if (Build.VERSION.SDK_INT < 26) {
            strK8 = null;
        } else {
            try {
                if (firebaseMessagingService2.getPackageManager().getApplicationInfo(firebaseMessagingService2.getPackageName(), 0).targetSdkVersion < 26) {
                    strK8 = null;
                } else {
                    NotificationManager notificationManager = (NotificationManager) firebaseMessagingService2.getSystemService(NotificationManager.class);
                    if (TextUtils.isEmpty(strK8)) {
                        strK8 = bundle3.getString("com.google.firebase.messaging.default_notification_channel_id");
                        if (!TextUtils.isEmpty(strK8)) {
                            Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
                        } else if (notificationManager.getNotificationChannel(strK8) == null) {
                            Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
                        }
                        if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                            identifier = firebaseMessagingService2.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", firebaseMessagingService2.getPackageName());
                            if (identifier == 0) {
                                Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                                string = "Misc";
                            } else {
                                string = firebaseMessagingService2.getString(identifier);
                            }
                            notificationManager.createNotificationChannel(m2.d(string));
                        }
                        strK8 = "fcm_fallback_notification_channel";
                    } else if (notificationManager.getNotificationChannel(strK8) == null) {
                        Log.w("FirebaseMessaging", "Notification Channel requested (" + strK8 + ") has not been created by the app. Manifest configuration, or default, value will be used.");
                        strK8 = bundle3.getString("com.google.firebase.messaging.default_notification_channel_id");
                        if (!TextUtils.isEmpty(strK8)) {
                            Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
                        } else if (notificationManager.getNotificationChannel(strK8) == null) {
                            Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
                        }
                        if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                            identifier = firebaseMessagingService2.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", firebaseMessagingService2.getPackageName());
                            if (identifier == 0) {
                                Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                                string = "Misc";
                            } else {
                                string = firebaseMessagingService2.getString(identifier);
                            }
                            notificationManager.createNotificationChannel(m2.d(string));
                        }
                        strK8 = "fcm_fallback_notification_channel";
                    }
                }
            } catch (PackageManager.NameNotFoundException unused2) {
            }
        }
        AtomicInteger atomicInteger2 = zo.a;
        String packageName = firebaseMessagingService2.getPackageName();
        Resources resources = firebaseMessagingService2.getResources();
        PackageManager packageManager = firebaseMessagingService2.getPackageManager();
        m71 m71Var = new m71(firebaseMessagingService2, strK8);
        String strJ = kj0Var.J(resources, packageName, "gcm.n.title");
        if (!TextUtils.isEmpty(strJ)) {
            m71Var.e = m71.b(strJ);
        }
        String strJ2 = kj0Var.J(resources, packageName, "gcm.n.body");
        if (!TextUtils.isEmpty(strJ2)) {
            m71Var.f = m71.b(strJ2);
            l71 l71Var = new l71();
            l71Var.b = m71.b(strJ2);
            m71Var.e(l71Var);
        }
        String strK9 = kj0Var.K("gcm.n.icon");
        if (!TextUtils.isEmpty(strK9)) {
            identifier2 = resources.getIdentifier(strK9, "drawable", packageName);
            if ((identifier2 == 0 || !zo.a(resources, identifier2)) && ((identifier2 = resources.getIdentifier(strK9, "mipmap", packageName)) == 0 || !zo.a(resources, identifier2))) {
                Log.w("FirebaseMessaging", "Icon resource " + strK9 + " not found. Notification will use default icon.");
            } else {
                i5 = 1;
            }
            m71Var.s.icon = identifier2;
            strK = kj0Var.K("gcm.n.sound2");
            if (TextUtils.isEmpty(strK)) {
                strK = kj0Var.K("gcm.n.sound");
            }
            if (TextUtils.isEmpty(strK)) {
                defaultUri = null;
            } else if (!"default".equals(strK) || resources.getIdentifier(strK, "raw", packageName) == 0) {
                defaultUri = RingtoneManager.getDefaultUri(2);
            } else {
                defaultUri = Uri.parse("android.resource://" + packageName + "/raw/" + strK);
            }
            if (defaultUri != null) {
                Notification notification2 = m71Var.s;
                notification2.sound = defaultUri;
                notification2.audioStreamType = -1;
                notification2.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
            }
            strK2 = kj0Var.K("gcm.n.click_action");
            if (TextUtils.isEmpty(strK2)) {
                strK3 = kj0Var.K("gcm.n.link_android");
                if (TextUtils.isEmpty(strK3)) {
                    strK3 = kj0Var.K("gcm.n.link");
                }
                if (TextUtils.isEmpty(strK3)) {
                    uri = null;
                } else {
                    uri = Uri.parse(strK3);
                }
                if (uri != null) {
                    launchIntentForPackage = new Intent("android.intent.action.VIEW");
                    launchIntentForPackage.setPackage(packageName);
                    launchIntentForPackage.setData(uri);
                } else {
                    launchIntentForPackage = packageManager.getLaunchIntentForPackage(packageName);
                    if (launchIntentForPackage == null) {
                        Log.w("FirebaseMessaging", "No activity found to launch app");
                    }
                }
            } else {
                launchIntentForPackage = new Intent(strK2);
                launchIntentForPackage.setPackage(packageName);
                launchIntentForPackage.setFlags(268435456);
            }
            if (launchIntentForPackage == null) {
                activity = null;
            } else {
                launchIntentForPackage.addFlags(67108864);
                Bundle bundle4 = (Bundle) kj0Var.b;
                bundle2 = new Bundle(bundle4);
                for (String str : bundle4.keySet()) {
                    if (str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.")) {
                        bundle2.remove(str);
                    }
                }
                launchIntentForPackage.putExtras(bundle2);
                if (kj0Var.B("google.c.a.e")) {
                    launchIntentForPackage.putExtra("gcm.n.analytics_data", kj0Var.O());
                }
                activity = PendingIntent.getActivity(firebaseMessagingService2, atomicInteger2.incrementAndGet(), launchIntentForPackage, 1140850688);
            }
            m71Var.g = activity;
            if (kj0Var.B("google.c.a.e")) {
                broadcast = PendingIntent.getBroadcast(firebaseMessagingService2, atomicInteger2.incrementAndGet(), new Intent("com.google.android.c2dm.intent.RECEIVE").setPackage(firebaseMessagingService2.getPackageName()).putExtra("wrapped_intent", new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(kj0Var.O())), 1140850688);
            } else {
                broadcast = null;
            }
            if (broadcast != null) {
                m71Var.s.deleteIntent = broadcast;
            }
            strK4 = kj0Var.K("gcm.n.color");
            if (TextUtils.isEmpty(strK4)) {
                i4 = bundle3.getInt("com.google.firebase.messaging.default_notification_color", 0);
                if (i4 != 0) {
                    numValueOf = Integer.valueOf(firebaseMessagingService2.getColor(i4));
                } else {
                    numValueOf = null;
                }
            } else {
                try {
                    numValueOf = Integer.valueOf(Color.parseColor(strK4));
                } catch (IllegalArgumentException unused3) {
                    Log.w("FirebaseMessaging", "Color is invalid: " + strK4 + ". Notification will use default color.");
                    i4 = bundle3.getInt("com.google.firebase.messaging.default_notification_color", 0);
                    if (i4 != 0) {
                        try {
                            numValueOf = Integer.valueOf(firebaseMessagingService2.getColor(i4));
                        } catch (Resources.NotFoundException unused4) {
                            Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
                            numValueOf = null;
                        }
                    } else {
                        numValueOf = null;
                    }
                }
            }
            if (numValueOf != null) {
                m71Var.o = numValueOf.intValue();
            }
            m71Var.c(!kj0Var.B("gcm.n.sticky"));
            m71Var.m = kj0Var.B("gcm.n.local_only");
            strK5 = kj0Var.K("gcm.n.ticker");
            if (strK5 != null) {
                m71Var.s.tickerText = m71.b(strK5);
            }
            numD = kj0Var.D("gcm.n.notification_priority");
            if (numD == null) {
                numD = null;
            } else if (numD.intValue() >= -2 || numD.intValue() > 2) {
                Log.w("FirebaseMessaging", "notificationPriority is invalid " + numD + ". Skipping setting notificationPriority.");
                numD = null;
            }
            if (numD != null) {
                m71Var.j = numD.intValue();
            }
            numD2 = kj0Var.D("gcm.n.visibility");
            if (numD2 == null) {
                numD2 = null;
            } else if (numD2.intValue() >= -1 || numD2.intValue() > i5) {
                Log.w("NotificationParams", "visibility is invalid: " + numD2 + ". Skipping setting visibility.");
                numD2 = null;
            }
            if (numD2 != null) {
                m71Var.p = numD2.intValue();
            }
            numD3 = kj0Var.D("gcm.n.notification_count");
            if (numD3 != null) {
                numD3 = null;
            } else if (numD3.intValue() < 0) {
                Log.w("FirebaseMessaging", "notificationCount is invalid: " + numD3 + ". Skipping setting notificationCount.");
                numD3 = null;
            }
            if (numD3 != null) {
                m71Var.i = numD3.intValue();
            }
            lI = kj0Var.I();
            if (lI != null) {
                m71Var.k = true;
                m71Var.s.when = lI.longValue();
            }
            jArrL = kj0Var.L();
            if (jArrL != null) {
                m71Var.s.vibrate = jArrL;
            }
            iArrF = kj0Var.F();
            if (iArrF != null) {
                int i6 = iArrF[0];
                i2 = iArrF[1];
                int i7 = iArrF[2];
                Notification notification3 = m71Var.s;
                notification3.ledARGB = i6;
                notification3.ledOnMS = i2;
                notification3.ledOffMS = i7;
                if (i2 != 0 || i7 == 0) {
                    i3 = 0;
                } else {
                    i3 = 1;
                }
                notification3.flags = i3 | ((-2) & notification3.flags);
            }
            zB = kj0Var.B("gcm.n.default_sound");
            r0 = zB;
            if (kj0Var.B("gcm.n.default_vibrate_timings")) {
                r0 = (zB ? 1 : 0) | 2;
            }
            r1 = r0;
            if (kj0Var.B("gcm.n.default_light_settings")) {
                r1 = (r0 == true ? 1 : 0) | 4;
            }
            notification = m71Var.s;
            notification.defaults = r1;
            if ((r1 & 4) != 0) {
                notification.flags |= 1;
            }
            strK6 = kj0Var.K("gcm.n.tag");
            if (TextUtils.isEmpty(strK6)) {
                strK6 = "FCM-Notification:" + SystemClock.uptimeMillis();
            }
            String str2 = strK6;
            if (pn0Var != null) {
                try {
                    Task task = pn0Var.c;
                    gu2.o(task);
                    bitmap = (Bitmap) Tasks.await(task, 5L, TimeUnit.SECONDS);
                    m71Var.d(bitmap);
                    k71 k71Var = new k71();
                    if (bitmap == null) {
                        iconCompat = null;
                        z = true;
                    } else {
                        z = true;
                        iconCompat = new IconCompat(1);
                        iconCompat.b = bitmap;
                    }
                    k71Var.b = iconCompat;
                    k71Var.c = null;
                    k71Var.d = z;
                    m71Var.e(k71Var);
                } catch (InterruptedException unused5) {
                    Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
                    pn0Var.close();
                    Thread.currentThread().interrupt();
                } catch (ExecutionException e3) {
                    Log.w("FirebaseMessaging", "Failed to download image: " + e3.getCause());
                } catch (TimeoutException unused6) {
                    Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
                    pn0Var.close();
                }
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Showing notification");
            }
            ((NotificationManager) ((FirebaseMessagingService) this.c).getSystemService("notification")).notify(str2, 0, m71Var.a());
            return true;
        }
        int i8 = bundle3.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i8 == 0 || !zo.a(resources, i8)) {
            try {
                i8 = packageManager.getApplicationInfo(packageName, 0).icon;
            } catch (PackageManager.NameNotFoundException e4) {
                Log.w("FirebaseMessaging", "Couldn't get own application info: " + e4);
            }
        }
        identifier2 = (i8 == 0 || !zo.a(resources, i8)) ? 17301651 : i8;
        m71Var.s.icon = identifier2;
        strK = kj0Var.K("gcm.n.sound2");
        if (TextUtils.isEmpty(strK)) {
            strK = kj0Var.K("gcm.n.sound");
        }
        if (TextUtils.isEmpty(strK)) {
            defaultUri = null;
        } else if ("default".equals(strK)) {
            defaultUri = RingtoneManager.getDefaultUri(2);
        } else {
            defaultUri = RingtoneManager.getDefaultUri(2);
        }
        if (defaultUri != null) {
            Notification notification4 = m71Var.s;
            notification4.sound = defaultUri;
            notification4.audioStreamType = -1;
            notification4.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
        }
        strK2 = kj0Var.K("gcm.n.click_action");
        if (TextUtils.isEmpty(strK2)) {
            launchIntentForPackage = new Intent(strK2);
            launchIntentForPackage.setPackage(packageName);
            launchIntentForPackage.setFlags(268435456);
        } else {
            strK3 = kj0Var.K("gcm.n.link_android");
            if (TextUtils.isEmpty(strK3)) {
                strK3 = kj0Var.K("gcm.n.link");
            }
            if (TextUtils.isEmpty(strK3)) {
                uri = Uri.parse(strK3);
            } else {
                uri = null;
            }
            if (uri != null) {
                launchIntentForPackage = new Intent("android.intent.action.VIEW");
                launchIntentForPackage.setPackage(packageName);
                launchIntentForPackage.setData(uri);
            } else {
                launchIntentForPackage = packageManager.getLaunchIntentForPackage(packageName);
                if (launchIntentForPackage == null) {
                    Log.w("FirebaseMessaging", "No activity found to launch app");
                }
            }
        }
        if (launchIntentForPackage == null) {
            activity = null;
        } else {
            launchIntentForPackage.addFlags(67108864);
            Bundle bundle5 = (Bundle) kj0Var.b;
            bundle2 = new Bundle(bundle5);
            while (r14.hasNext()) {
                if (str.startsWith("google.c.")) {
                    bundle2.remove(str);
                } else {
                    bundle2.remove(str);
                }
            }
            launchIntentForPackage.putExtras(bundle2);
            if (kj0Var.B("google.c.a.e")) {
                launchIntentForPackage.putExtra("gcm.n.analytics_data", kj0Var.O());
            }
            activity = PendingIntent.getActivity(firebaseMessagingService2, atomicInteger2.incrementAndGet(), launchIntentForPackage, 1140850688);
        }
        m71Var.g = activity;
        if (kj0Var.B("google.c.a.e")) {
            broadcast = null;
        } else {
            broadcast = PendingIntent.getBroadcast(firebaseMessagingService2, atomicInteger2.incrementAndGet(), new Intent("com.google.android.c2dm.intent.RECEIVE").setPackage(firebaseMessagingService2.getPackageName()).putExtra("wrapped_intent", new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(kj0Var.O())), 1140850688);
        }
        if (broadcast != null) {
            m71Var.s.deleteIntent = broadcast;
        }
        strK4 = kj0Var.K("gcm.n.color");
        if (TextUtils.isEmpty(strK4)) {
            numValueOf = Integer.valueOf(Color.parseColor(strK4));
        } else {
            i4 = bundle3.getInt("com.google.firebase.messaging.default_notification_color", 0);
            if (i4 != 0) {
                numValueOf = Integer.valueOf(firebaseMessagingService2.getColor(i4));
            } else {
                numValueOf = null;
            }
        }
        if (numValueOf != null) {
            m71Var.o = numValueOf.intValue();
        }
        m71Var.c(!kj0Var.B("gcm.n.sticky"));
        m71Var.m = kj0Var.B("gcm.n.local_only");
        strK5 = kj0Var.K("gcm.n.ticker");
        if (strK5 != null) {
            m71Var.s.tickerText = m71.b(strK5);
        }
        numD = kj0Var.D("gcm.n.notification_priority");
        if (numD == null) {
            if (numD.intValue() >= -2) {
            }
            Log.w("FirebaseMessaging", "notificationPriority is invalid " + numD + ". Skipping setting notificationPriority.");
            numD = null;
        } else {
            numD = null;
        }
        if (numD != null) {
            m71Var.j = numD.intValue();
        }
        numD2 = kj0Var.D("gcm.n.visibility");
        if (numD2 == null) {
            if (numD2.intValue() >= -1) {
            }
            Log.w("NotificationParams", "visibility is invalid: " + numD2 + ". Skipping setting visibility.");
            numD2 = null;
        } else {
            numD2 = null;
        }
        if (numD2 != null) {
            m71Var.p = numD2.intValue();
        }
        numD3 = kj0Var.D("gcm.n.notification_count");
        if (numD3 != null) {
            numD3 = null;
        } else if (numD3.intValue() < 0) {
            Log.w("FirebaseMessaging", "notificationCount is invalid: " + numD3 + ". Skipping setting notificationCount.");
            numD3 = null;
        }
        if (numD3 != null) {
            m71Var.i = numD3.intValue();
        }
        lI = kj0Var.I();
        if (lI != null) {
            m71Var.k = true;
            m71Var.s.when = lI.longValue();
        }
        jArrL = kj0Var.L();
        if (jArrL != null) {
            m71Var.s.vibrate = jArrL;
        }
        iArrF = kj0Var.F();
        if (iArrF != null) {
            int i9 = iArrF[0];
            i2 = iArrF[1];
            int i10 = iArrF[2];
            Notification notification5 = m71Var.s;
            notification5.ledARGB = i9;
            notification5.ledOnMS = i2;
            notification5.ledOffMS = i10;
            if (i2 != 0) {
                i3 = 0;
            } else {
                i3 = 0;
            }
            notification5.flags = i3 | ((-2) & notification5.flags);
        }
        zB = kj0Var.B("gcm.n.default_sound");
        r0 = zB;
        if (kj0Var.B("gcm.n.default_vibrate_timings")) {
            r0 = (zB ? 1 : 0) | 2;
        }
        r1 = r0;
        if (kj0Var.B("gcm.n.default_light_settings")) {
            r1 = (r0 == true ? 1 : 0) | 4;
        }
        notification = m71Var.s;
        notification.defaults = r1;
        if ((r1 & 4) != 0) {
            notification.flags |= 1;
        }
        strK6 = kj0Var.K("gcm.n.tag");
        if (TextUtils.isEmpty(strK6)) {
            strK6 = "FCM-Notification:" + SystemClock.uptimeMillis();
        }
        String str3 = strK6;
        if (pn0Var != null) {
            Task task2 = pn0Var.c;
            gu2.o(task2);
            bitmap = (Bitmap) Tasks.await(task2, 5L, TimeUnit.SECONDS);
            m71Var.d(bitmap);
            k71 k71Var2 = new k71();
            if (bitmap == null) {
                iconCompat = null;
                z = true;
            } else {
                z = true;
                iconCompat = new IconCompat(1);
                iconCompat.b = bitmap;
            }
            k71Var2.b = iconCompat;
            k71Var2.c = null;
            k71Var2.d = z;
            m71Var.e(k71Var2);
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        ((NotificationManager) ((FirebaseMessagingService) this.c).getSystemService("notification")).notify(str3, 0, m71Var.a());
        return true;
    }

    public boolean I(CharSequence charSequence, int i2, int i3, b22 b22Var) {
        if ((b22Var.c & 3) == 0) {
            xy xyVar = (xy) this.d;
            s41 s41VarB = b22Var.b();
            int iA = s41VarB.a(8);
            if (iA != 0) {
                ((ByteBuffer) s41VarB.d).getShort(iA + s41VarB.a);
            }
            xyVar.getClass();
            ThreadLocal threadLocal = xy.b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i2 < i3) {
                sb.append(charSequence.charAt(i2));
                i2++;
            }
            boolean zHasGlyph = xyVar.a.hasGlyph(sb.toString());
            int i4 = b22Var.c & 4;
            b22Var.c = zHasGlyph ? i4 | 2 : i4 | 1;
        }
        return (b22Var.c & 3) == 2;
    }

    public boolean J() {
        switch (this.a) {
            case 25:
                List list = (List) this.c;
                ByteBuffer byteBufferC = kj.c((ByteBuffer) this.b);
                v01 v01Var = (v01) this.d;
                if (byteBufferC == null) {
                    return false;
                }
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    try {
                        boolean zC = ((rn0) list.get(i2)).c(byteBufferC, v01Var);
                        if (zC) {
                            return true;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return false;
            case 26:
                List list2 = (List) this.d;
                nf1 nf1Var = (nf1) ((wa) this.b).b;
                nf1Var.reset();
                v01 v01Var2 = (v01) this.c;
                nf1Var.mark(5242880);
                int size2 = list2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    try {
                        boolean zE = ((rn0) list2.get(i3)).e(nf1Var, v01Var2);
                        nf1Var.reset();
                        if (zE) {
                            return true;
                        }
                    } catch (Throwable th2) {
                        nf1Var.reset();
                        throw th2;
                    }
                }
                return false;
            default:
                List list3 = (List) this.c;
                a aVar = (a) this.d;
                v01 v01Var3 = (v01) this.b;
                int size3 = list3.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    rn0 rn0Var = (rn0) list3.get(i4);
                    nf1 nf1Var2 = null;
                    try {
                        nf1 nf1Var3 = new nf1(new FileInputStream(aVar.a().getFileDescriptor()), v01Var3);
                        try {
                            boolean zE2 = rn0Var.e(nf1Var3, v01Var3);
                            nf1Var3.b();
                            aVar.a();
                            if (zE2) {
                                return true;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            nf1Var2 = nf1Var3;
                            if (nf1Var2 != null) {
                                nf1Var2.b();
                            }
                            aVar.a();
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                }
                return false;
        }
    }

    public void K(View view) {
        ((ArrayList) this.d).add(view);
        wa waVar = (wa) this.b;
        kg1 kg1VarI = RecyclerView.I(view);
        if (kg1VarI != null) {
            View view2 = kg1VarI.a;
            RecyclerView recyclerView = (RecyclerView) waVar.b;
            int i2 = kg1VarI.q;
            if (i2 != -1) {
                kg1VarI.p = i2;
            } else {
                WeakHashMap weakHashMap = x52.a;
                kg1VarI.p = view2.getImportantForAccessibility();
            }
            if (recyclerView.L()) {
                kg1VarI.q = 4;
                recyclerView.d1.add(kg1VarI);
            } else {
                WeakHashMap weakHashMap2 = x52.a;
                view2.setImportantForAccessibility(4);
            }
        }
    }

    public boolean L(int i2, hr hrVar, qr qrVar) {
        ah ahVar = (ah) this.c;
        int[] iArr = qrVar.o0;
        int[] iArr2 = qrVar.s;
        ahVar.a = iArr[0];
        ahVar.b = iArr[1];
        ahVar.c = qrVar.n();
        ahVar.d = qrVar.k();
        ahVar.i = false;
        ahVar.j = i2;
        boolean z = ahVar.a == 3;
        boolean z2 = ahVar.b == 3;
        boolean z3 = z && qrVar.V > 0.0f;
        boolean z4 = z2 && qrVar.V > 0.0f;
        if (z3 && iArr2[0] == 4) {
            ahVar.a = 1;
        }
        if (z4 && iArr2[1] == 4) {
            ahVar.b = 1;
        }
        hrVar.b(qrVar, ahVar);
        qrVar.J(ahVar.e);
        qrVar.G(ahVar.f);
        qrVar.D = ahVar.h;
        qrVar.D(ahVar.g);
        ahVar.j = 0;
        return ahVar.i;
    }

    public Object M(CharSequence charSequence, int i2, int i3, int i4, boolean z, n50 n50Var) {
        int i5;
        char c;
        o50 o50Var = new o50((v41) ((ud2) this.c).c);
        int iCodePointAt = Character.codePointAt(charSequence, i2);
        int i6 = 0;
        boolean zC = true;
        int iCharCount = i2;
        loop0: while (true) {
            i5 = iCharCount;
            while (true) {
                if (iCharCount < i3 && i6 < i4 && zC) {
                    SparseArray sparseArray = ((v41) o50Var.f).a;
                    v41 v41Var = sparseArray == null ? null : (v41) sparseArray.get(iCodePointAt);
                    if (o50Var.b == 2) {
                        if (v41Var != null) {
                            o50Var.f = v41Var;
                            o50Var.d++;
                        } else {
                            if (iCodePointAt == 65038) {
                                o50Var.a();
                            } else if (iCodePointAt != 65039) {
                                v41 v41Var2 = (v41) o50Var.f;
                                if (v41Var2.b != null) {
                                    if (o50Var.d != 1) {
                                        o50Var.g = v41Var2;
                                        o50Var.a();
                                    } else if (o50Var.b()) {
                                        o50Var.g = (v41) o50Var.f;
                                        o50Var.a();
                                    } else {
                                        o50Var.a();
                                    }
                                    c = 3;
                                } else {
                                    o50Var.a();
                                }
                            }
                            c = 1;
                        }
                        c = 2;
                    } else if (v41Var == null) {
                        o50Var.a();
                        c = 1;
                    } else {
                        o50Var.b = 2;
                        o50Var.f = v41Var;
                        o50Var.d = 1;
                        c = 2;
                    }
                    o50Var.c = iCodePointAt;
                    if (c == 1) {
                        iCharCount = Character.charCount(Character.codePointAt(charSequence, i5)) + i5;
                        if (iCharCount >= i3) {
                            break;
                        }
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                        break;
                    }
                    if (c == 2) {
                        int iCharCount2 = Character.charCount(iCodePointAt) + iCharCount;
                        if (iCharCount2 < i3) {
                            iCodePointAt = Character.codePointAt(charSequence, iCharCount2);
                        }
                        iCharCount = iCharCount2;
                    } else if (c == 3) {
                        if (!z && I(charSequence, i5, iCharCount, ((v41) o50Var.g).b)) {
                            break;
                        }
                        zC = n50Var.c(charSequence, i5, iCharCount, ((v41) o50Var.g).b);
                        i6++;
                        break;
                    }
                } else {
                    break loop0;
                }
            }
        }
        if (o50Var.b == 2 && ((v41) o50Var.f).b != null && ((o50Var.d > 1 || o50Var.b()) && i6 < i4 && zC && (z || !I(charSequence, i5, iCharCount, ((v41) o50Var.f).b)))) {
            n50Var.c(charSequence, i5, iCharCount, ((v41) o50Var.f).b);
        }
        return n50Var.a();
    }

    public void N(ge geVar, int i2, boolean z) {
        ce ceVar = (ce) this.d;
        Context context = (Context) this.b;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        String str = geVar.a;
        adler32.update(str.getBytes(Charset.forName("UTF-8")));
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        uc1 uc1Var = geVar.c;
        adler32.update(byteBufferAllocate.putInt(xc1.a(uc1Var)).array());
        byte[] bArr = geVar.b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z) {
            for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
                int i3 = jobInfo.getExtras().getInt("attemptNumber");
                if (jobInfo.getId() == value) {
                    if (i3 < i2) {
                        break;
                    }
                    d42.g("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", geVar);
                    return;
                }
            }
        }
        Cursor cursorRawQuery = ((bl1) this.c).a().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str, String.valueOf(xc1.a(uc1Var))});
        try {
            Cursor cursor = cursorRawQuery;
            Long lValueOf = cursor.moveToNext() ? Long.valueOf(cursor.getLong(0)) : 0L;
            cursorRawQuery.close();
            long jLongValue = lValueOf.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            builder.setMinimumLatency(ceVar.a(uc1Var, jLongValue, i2));
            Set set = ((de) ceVar.b.get(uc1Var)).c;
            if (set.contains(yl1.a)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(yl1.c)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(yl1.b)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i2);
            persistableBundle.putString("backendName", str);
            persistableBundle.putInt("priority", xc1.a(uc1Var));
            if (bArr != null) {
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            }
            builder.setExtras(persistableBundle);
            Object[] objArr = {geVar, Integer.valueOf(value), Long.valueOf(ceVar.a(uc1Var, jLongValue, i2)), lValueOf, Integer.valueOf(i2)};
            String strS = d42.s("JobInfoScheduler");
            if (Log.isLoggable(strS, 3)) {
                Log.d(strS, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th) {
            cursorRawQuery.close();
            throw th;
        }
    }

    public void O(String str) {
        if (str != null) {
            this.d = str;
        } else {
            uq1.h("Null backendName");
        }
    }

    public void P(Profile profile, boolean z) {
        boolean zAreEqual;
        Parcelable parcelable = (Profile) this.d;
        this.d = profile;
        if (z) {
            SharedPreferences sharedPreferences = ((x1) this.c).a;
            if (profile != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", profile.a);
                    jSONObject.put("first_name", profile.b);
                    jSONObject.put("middle_name", profile.c);
                    jSONObject.put("last_name", profile.d);
                    jSONObject.put("name", profile.e);
                    Uri uri = profile.f;
                    if (uri != null) {
                        jSONObject.put("link_uri", uri.toString());
                    }
                    Uri uri2 = profile.i;
                    if (uri2 != null) {
                        jSONObject.put("picture_uri", uri2.toString());
                    }
                } catch (JSONException unused) {
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    sharedPreferences.edit().putString("com.facebook.ProfileManager.CachedProfile", jSONObject.toString()).apply();
                }
            } else {
                sharedPreferences.edit().remove("com.facebook.ProfileManager.CachedProfile").apply();
            }
        }
        if (parcelable == null) {
            zAreEqual = profile == null;
        } else {
            zAreEqual = Intrinsics.areEqual(parcelable, profile);
        }
        if (zAreEqual) {
            return;
        }
        Intent intent = new Intent("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_PROFILE", parcelable);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_PROFILE", (Parcelable) profile);
        ((co) this.b).G(intent);
    }

    public void Q(rr rrVar, int i2, int i3, int i4) {
        int i5 = rrVar.a0;
        int i6 = rrVar.b0;
        rrVar.a0 = 0;
        rrVar.b0 = 0;
        rrVar.J(i3);
        rrVar.G(i4);
        if (i5 < 0) {
            rrVar.a0 = 0;
        } else {
            rrVar.a0 = i5;
        }
        if (i6 < 0) {
            rrVar.b0 = 0;
        } else {
            rrVar.b0 = i6;
        }
        rr rrVar2 = (rr) this.d;
        rrVar2.s0 = i2;
        rrVar2.P();
    }

    public void T(View view) {
        if (((ArrayList) this.d).remove(view)) {
            wa waVar = (wa) this.b;
            kg1 kg1VarI = RecyclerView.I(view);
            if (kg1VarI != null) {
                RecyclerView recyclerView = (RecyclerView) waVar.b;
                int i2 = kg1VarI.p;
                if (recyclerView.L()) {
                    kg1VarI.q = i2;
                    recyclerView.d1.add(kg1VarI);
                } else {
                    View view2 = kg1VarI.a;
                    WeakHashMap weakHashMap = x52.a;
                    view2.setImportantForAccessibility(i2);
                }
                kg1VarI.p = 0;
            }
        }
    }

    public void U(rr rrVar) {
        ArrayList arrayList = (ArrayList) this.b;
        arrayList.clear();
        int size = rrVar.p0.size();
        for (int i2 = 0; i2 < size; i2++) {
            qr qrVar = (qr) rrVar.p0.get(i2);
            int[] iArr = qrVar.o0;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(qrVar);
            }
        }
        rrVar.r0.b = true;
    }

    @Override // defpackage.jq0
    public ClipDescription a() {
        return (ClipDescription) this.c;
    }

    @Override // defpackage.yb1
    public boolean b(Object obj) {
        if (obj instanceof o90) {
            ((o90) obj).c().a = true;
        }
        ((p90) this.c).d(obj);
        return ((ac1) this.d).b(obj);
    }

    @Override // defpackage.jq0
    public Object c() {
        return null;
    }

    @Override // defpackage.jq0
    public Uri d() {
        return (Uri) this.b;
    }

    @Override // defpackage.bj1
    public pi1 f(pi1 pi1Var, da1 da1Var) {
        Drawable drawable = (Drawable) pi1Var.get();
        if (drawable instanceof BitmapDrawable) {
            return ((f6) this.c).f(nh.c((mh) this.b, ((BitmapDrawable) drawable).getBitmap()), da1Var);
        }
        if (drawable instanceof li0) {
            return ((k42) this.d).f(pi1Var, da1Var);
        }
        return null;
    }

    @Override // defpackage.jq0
    public Uri g() {
        return (Uri) this.d;
    }

    @Override // defpackage.yb1
    public Object h() {
        Object objH = ((ac1) this.d).h();
        if (objH == null) {
            objH = ((n90) this.b).j();
            if (Log.isLoggable("FactoryPools", 2)) {
                Log.v("FactoryPools", "Created new " + objH.getClass());
            }
        }
        if (objH instanceof o90) {
            ((o90) objH).c().a = false;
        }
        return objH;
    }

    public synchronized void j(long j, uq1 uq1Var) {
        try {
            String str = ((String) this.d) + File.separator + ze2.j;
            if (new File(str).exists()) {
                ArrayList arrayList = new ArrayList();
                nj2.f(str, arrayList, String.valueOf(j));
                if (arrayList.size() > 0) {
                    Collections.sort(arrayList, new rs(10));
                }
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    File file = (File) obj;
                    if (!file.getName().contains("upload")) {
                        if (file.getName().startsWith("f_") || file.getName().startsWith("r_")) {
                            File file2 = new File(file.getPath() + "upload" + System.currentTimeMillis());
                            file = !file.renameTo(file2) ? null : file2;
                        }
                    }
                    if (file != null) {
                        hd2.a().b(new gg2(j, file, ld2.f().c(j)));
                    }
                }
            }
            String str2 = ((String) this.d) + File.separator + ze2.k;
            if (new File(str2).exists()) {
                try {
                    nj2.e((Context) this.b, str2);
                } catch (Exception e2) {
                    cc2.c(Log.getStackTraceString(e2));
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void k(pd2 pd2Var, boolean z) {
        try {
            ((rc2) this.c).n(pd2Var, z);
        } catch (oc2 e2) {
            int i2 = oc2.c;
            gf2.b.a(e2);
        }
    }

    public void l(AppIdData appIdData) {
        try {
            ((rc2) this.c).o(appIdData);
        } catch (oc2 e2) {
            int i2 = oc2.c;
            gf2.b.a(e2);
        }
    }

    public synchronized void m(ArrayList arrayList, boolean z, uq1 uq1Var) {
        if (z) {
            try {
                String str = ((String) this.d) + File.separator + ze2.j;
                if (new File(str).exists()) {
                    ArrayList arrayList2 = new ArrayList();
                    nj2.f(str, arrayList2, null);
                    if (arrayList2.size() > 0) {
                        try {
                            Collections.sort(arrayList2, new rs(9));
                        } catch (Exception e2) {
                            cc2.c(Log.getStackTraceString(e2));
                        }
                    }
                    int size = arrayList2.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj = arrayList2.get(i2);
                        i2++;
                        File file = (File) obj;
                        String name = file.getName();
                        if (!name.startsWith("f_") && !name.startsWith("r_")) {
                            cc2.a("cleanupEvents deleteFile " + name + " " + nj2.n((Context) this.b, file));
                        } else if (arrayList.contains(Long.valueOf(Long.parseLong(name.substring(2, name.indexOf(45)))))) {
                            cc2.a("cleanupEvents deleteFile " + name + " " + nj2.n((Context) this.b, file));
                        }
                    }
                }
                String str2 = ((String) this.d) + File.separator + ze2.k;
                if (new File(str2).exists()) {
                    try {
                        nj2.e((Context) this.b, str2);
                    } catch (Exception e3) {
                        cc2.c(Log.getStackTraceString(e3));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        try {
            ((rc2) this.c).q(arrayList, uq1Var);
        } catch (oc2 e4) {
            int i3 = oc2.c;
            gf2.b.a(e4);
        }
    }

    public synchronized void n(List list) {
        try {
            ((rc2) this.c).t(list);
        } catch (oc2 e2) {
            int i2 = oc2.c;
            gf2.b.a(e2);
        }
    }

    public synchronized void o() {
        rc2 rc2Var = (rc2) this.c;
        rc2Var.getClass();
        cc2.a("deleteDB");
        try {
            ed2 ed2Var = (ed2) rc2Var.b;
            ed2Var.close();
            if (ed2Var.a.delete()) {
                cc2.a("mDatabaseFile deleted");
                try {
                    Context context = (Context) this.b;
                    StringBuilder sb = new StringBuilder();
                    sb.append((String) this.d);
                    String str = File.separator;
                    sb.append(str);
                    sb.append(ze2.j);
                    nj2.e(context, sb.toString());
                    nj2.e((Context) this.b, ((String) this.d) + str + ze2.k);
                } catch (Exception e2) {
                    cc2.c(Log.getStackTraceString(e2));
                }
            } else {
                Context context2 = (Context) this.b;
                StringBuilder sb2 = new StringBuilder();
                sb2.append((String) this.d);
                String str2 = File.separator;
                sb2.append(str2);
                sb2.append(ze2.j);
                nj2.e(context2, sb2.toString());
                nj2.e((Context) this.b, ((String) this.d) + str2 + ze2.k);
            }
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        throw th;
    }

    public void p(View view, int i2, boolean z) {
        RecyclerView recyclerView = (RecyclerView) ((wa) this.b).b;
        int childCount = i2 < 0 ? recyclerView.getChildCount() : E(i2);
        ((jm) this.c).e(childCount, z);
        if (z) {
            K(view);
        }
        recyclerView.addView(view, childCount);
        RecyclerView.I(view);
    }

    public void q(View view, int i2, ViewGroup.LayoutParams layoutParams, boolean z) {
        RecyclerView recyclerView = (RecyclerView) ((wa) this.b).b;
        int childCount = i2 < 0 ? recyclerView.getChildCount() : E(i2);
        ((jm) this.c).e(childCount, z);
        if (z) {
            K(view);
        }
        kg1 kg1VarI = RecyclerView.I(view);
        if (kg1VarI != null) {
            if (!kg1VarI.j() && !kg1VarI.o()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + kg1VarI + recyclerView.y());
            }
            kg1VarI.j &= -257;
        }
        RecyclerView.a(recyclerView, view, childCount, layoutParams);
    }

    public ge r() {
        String strConcat = ((String) this.d) == null ? " backendName" : BuildConfig.FLAVOR;
        if (((uc1) this.c) == null) {
            strConcat = strConcat.concat(" priority");
        }
        if (strConcat.isEmpty()) {
            return new ge((String) this.d, (byte[]) this.b, (uc1) this.c);
        }
        uq1.q("Missing required properties:".concat(strConcat));
        return null;
    }

    public Bitmap s(BitmapFactory.Options options) throws Throwable {
        switch (this.a) {
            case 25:
                return g93.n(new ij(kj.c((ByteBuffer) this.b)), options, this);
            case 26:
                nf1 nf1Var = (nf1) ((wa) this.b).b;
                nf1Var.reset();
                return g93.n(nf1Var, options, this);
            default:
                FileDescriptor fileDescriptor = ((a) this.d).a().getFileDescriptor();
                Bitmap bitmapD = null;
                if (Build.VERSION.SDK_INT != 34 || !nj2.g(options) || !g93.u(this)) {
                    return BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
                }
                am2.n(BuildConfig.FLAVOR, options.inPreferredConfig == Bitmap.Config.HARDWARE);
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                try {
                    Bitmap bitmapDecodeFileDescriptor = BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
                    if (bitmapDecodeFileDescriptor == null) {
                        if (bitmapDecodeFileDescriptor != null) {
                        }
                        options.inPreferredConfig = Bitmap.Config.HARDWARE;
                        return bitmapD;
                    }
                    try {
                        bitmapD = g93.D(bitmapDecodeFileDescriptor);
                    } catch (Throwable th) {
                        th = th;
                        bitmapD = bitmapDecodeFileDescriptor;
                        if (bitmapD != null) {
                            bitmapD.recycle();
                        }
                        options.inPreferredConfig = Bitmap.Config.HARDWARE;
                        throw th;
                    }
                    break;
                    bitmapDecodeFileDescriptor.recycle();
                    options.inPreferredConfig = Bitmap.Config.HARDWARE;
                    return bitmapD;
                } catch (Throwable th2) {
                    th = th2;
                }
                break;
        }
    }

    public String toString() {
        switch (this.a) {
            case 11:
                return ((jm) this.c).toString() + ", hidden list:" + ((ArrayList) this.d).size();
            default:
                return super.toString();
        }
    }

    public void u(int i2) {
        kg1 kg1VarI;
        int iE = E(i2);
        ((jm) this.c).f(iE);
        RecyclerView recyclerView = (RecyclerView) ((wa) this.b).b;
        View childAt = recyclerView.getChildAt(iE);
        if (childAt != null && (kg1VarI = RecyclerView.I(childAt)) != null) {
            if (kg1VarI.j() && !kg1VarI.o()) {
                throw new IllegalArgumentException("called detach on an already detached child " + kg1VarI + recyclerView.y());
            }
            kg1VarI.a(256);
        }
        RecyclerView.c(recyclerView, iE);
    }

    public void v(Bundle bundle) {
        HashSet hashSet = (HashSet) this.d;
        String string = ((Context) this.b).getString(2131886118);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (dq0.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    w((Class) it.next(), hashSet2);
                }
            } catch (ClassNotFoundException e2) {
                throw new xp(5, e2);
            }
        }
    }

    public Object w(Class cls, HashSet hashSet) {
        Object objB;
        HashMap map = (HashMap) this.c;
        if (rq0.w()) {
            try {
                rq0.n(cls.getSimpleName());
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        if (map.containsKey(cls)) {
            objB = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                dq0 dq0Var = (dq0) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listA = dq0Var.a();
                if (!listA.isEmpty()) {
                    for (Class cls2 : listA) {
                        if (!map.containsKey(cls2)) {
                            w(cls2, hashSet);
                        }
                    }
                }
                objB = dq0Var.b((Context) this.b);
                hashSet.remove(cls);
                map.put(cls, objB);
            } catch (Throwable th2) {
                throw new xp(5, th2);
            }
        }
        Trace.endSection();
        return objB;
    }

    public String x(long j) {
        return ((dc2) this.c).E((Context) this.b, String.valueOf(j));
    }

    public String y(String str) {
        return ((dc2) this.c).E((Context) this.b, str);
    }

    public er0 z() {
        long jLongValue;
        long jLongValue2;
        dc2 dc2Var = (dc2) this.c;
        Context context = (Context) this.b;
        String str = (String) this.d;
        SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
        try {
            String string = sharedPreferences.getString("accessToken", null);
            String strO = string == null ? null : dc2Var.o(context, string);
            String string2 = sharedPreferences.getString("expiresIn", null);
            if (string2 == null) {
                jLongValue = -1;
            } else {
                try {
                    jLongValue = Long.valueOf(dc2Var.o(context, string2)).longValue();
                } catch (NumberFormatException unused) {
                    jLongValue = -1;
                }
            }
            String string3 = sharedPreferences.getString("issuedClientTime", null);
            if (string3 == null) {
                jLongValue2 = -1;
            } else {
                try {
                    jLongValue2 = Long.valueOf(dc2Var.o(context, string3)).longValue();
                } catch (NumberFormatException unused2) {
                    jLongValue2 = -1;
                }
            }
            if (TextUtils.isEmpty(strO) || jLongValue == -1 || jLongValue2 == -1) {
                return null;
            }
            String string4 = sharedPreferences.getString("refreshToken", null);
            String strO2 = string4 != null ? dc2Var.o(context, string4) : null;
            if (strO2 == null) {
                strO2 = BuildConfig.FLAVOR;
            }
            return new er0(jLongValue, jLongValue2, strO, strO2);
        } catch (m60 e2) {
            context.getSharedPreferences(str, 0).edit().clear().apply();
            throw e2;
        }
    }

    private final void R() {
    }

    private final void S() {
    }

    @Override // defpackage.jq0
    public void e() {
    }

    public /* synthetic */ ac2(Object obj, Object obj2, Object obj3, int i2) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public ac2(co coVar, x1 x1Var) {
        this.a = 4;
        coVar.getClass();
        this.b = coVar;
        this.c = x1Var;
    }

    public ac2(byte[] bArr, byte[] bArr2, BigInteger bigInteger, pa3 pa3Var) {
        this.a = 5;
        this.d = BigInteger.ZERO;
        this.c = bigInteger;
        this.b = pa3Var;
    }

    public ac2(co coVar, kj0 kj0Var) {
        this.a = 2;
        coVar.getClass();
        this.b = coVar;
        this.c = kj0Var;
    }

    public ac2(HashMap map, HashMap map2, HashMap map3, String str, String str2, String str3) {
        this.a = 3;
        this.b = map;
        this.c = map2;
        this.d = map3;
    }

    public ac2(Context context, String str) {
        this.a = 6;
        Context applicationContext = context.getApplicationContext();
        dc2 dc2Var = n60.a;
        this.b = applicationContext;
        this.d = ts.j("com.linecorp.linesdk.accesstoken.", str);
        this.c = dc2Var;
    }

    public ac2(wa waVar) {
        this.a = 11;
        this.b = waVar;
        this.c = new jm();
        this.d = new ArrayList();
    }

    public ac2(FirebaseMessagingService firebaseMessagingService, kj0 kj0Var, ExecutorService executorService) {
        this.a = 19;
        this.b = executorService;
        this.c = firebaseMessagingService;
        this.d = kj0Var;
    }

    public ac2(rr rrVar) {
        this.a = 8;
        this.b = new ArrayList();
        this.c = new ah();
        this.d = rrVar;
    }

    public ac2(Context context) {
        this.a = 1;
        this.b = context.getApplicationContext();
        this.d = new HashSet();
        this.c = new HashMap();
    }

    public /* synthetic */ ac2(int i2) {
        this.a = i2;
    }

    public ac2(ac1 ac1Var, n90 n90Var, p90 p90Var) {
        this.a = 24;
        this.d = ac1Var;
        this.b = n90Var;
        this.c = p90Var;
    }

    public ac2(x11 x11Var, ArrayList arrayList, v01 v01Var) {
        this.a = 26;
        am2.p(v01Var, "Argument must not be null");
        this.c = v01Var;
        am2.p(arrayList, "Argument must not be null");
        this.d = arrayList;
        this.b = new wa(x11Var, v01Var);
    }

    public ac2(ParcelFileDescriptor parcelFileDescriptor, ArrayList arrayList, v01 v01Var) {
        this.a = 27;
        am2.p(v01Var, "Argument must not be null");
        this.b = v01Var;
        am2.p(arrayList, "Argument must not be null");
        this.c = arrayList;
        this.d = new a(parcelFileDescriptor);
    }

    public ac2(s60 s60Var, er1 er1Var, w60 w60Var) {
        this.a = 22;
        this.d = s60Var;
        this.c = er1Var;
        this.b = w60Var;
    }
}
