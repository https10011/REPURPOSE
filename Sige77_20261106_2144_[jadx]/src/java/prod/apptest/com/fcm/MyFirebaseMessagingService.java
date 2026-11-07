package prod.apptest.com.fcm;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.AudioAttributes;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.hjq.toast.BuildConfig;
import defpackage.ea;
import defpackage.k71;
import defpackage.l71;
import defpackage.m71;
import defpackage.w01;
import defpackage.yg;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class MyFirebaseMessagingService extends FirebaseMessagingService {
    /* JADX WARN: Multi-variable type inference failed */
    public final void onMessageReceived(RemoteMessage remoteMessage) {
        Bitmap bitmapDecodeStream;
        String string = getApplicationContext().getSharedPreferences(getString(2131886122), 0).getString("JS_merchant", BuildConfig.FLAVOR);
        if (remoteMessage.S() != null) {
            Object obj = remoteMessage.S().c;
            String string2 = getString(2131886193);
            String str = (String) remoteMessage.S().c;
            String str2 = (String) remoteMessage.S().b;
            boolean zEquals = "1".equals(remoteMessage.R().get("mute"));
            String str3 = (String) remoteMessage.S().d;
            Uri uri = str3 != null ? Uri.parse(str3) : null;
            if (uri == null) {
                bitmapDecodeStream = null;
            } else {
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri.toString()).openConnection();
                    httpURLConnection.setDoInput(true);
                    httpURLConnection.connect();
                    bitmapDecodeStream = BitmapFactory.decodeStream(httpURLConnection.getInputStream());
                } catch (Exception unused) {
                    bitmapDecodeStream = null;
                }
            }
            Intent intent = new Intent((Context) this, (Class<?>) yg.class);
            intent.addFlags(67108864);
            PendingIntent activity = PendingIntent.getActivity(this, 0, intent, 1140850688);
            Uri defaultUri = RingtoneManager.getDefaultUri(2);
            if (!ea.q(string) || string.equals(remoteMessage.R().get("merchant"))) {
                m71 m71Var = new m71(this, string2);
                m71Var.o = getResources().getColor(2131099703, null);
                Notification notification = m71Var.s;
                notification.icon = 2131230930;
                m71Var.e = m71.b(str2);
                m71Var.f = m71.b(str);
                l71 l71Var = new l71();
                l71Var.b = m71.b(str);
                m71Var.e(l71Var);
                m71Var.c(true);
                notification.sound = defaultUri;
                notification.audioStreamType = -1;
                notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
                m71Var.t = zEquals;
                m71Var.j = 1;
                m71Var.g = activity;
                if (bitmapDecodeStream != null) {
                    k71 k71Var = new k71();
                    IconCompat iconCompat = new IconCompat(1);
                    iconCompat.b = bitmapDecodeStream;
                    k71Var.b = iconCompat;
                    m71Var.e(k71Var);
                }
                NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
                if (Build.VERSION.SDK_INT >= 26) {
                    notificationManager.createNotificationChannel(w01.b(string2));
                }
                notificationManager.notify(0, m71Var.a());
            }
        }
    }
}
