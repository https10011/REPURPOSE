package com.hjq.toast;

import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.widget.Toast;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class ToastStrategy extends Handler implements IToastStrategy {
    private static final int DELAY_TIMEOUT = 200;
    private static final int MAX_TOAST_CAPACITY = 3;
    private static final int TYPE_CANCEL = 3;
    private static final int TYPE_CONTINUE = 2;
    private static final int TYPE_SHOW = 1;
    private volatile Queue<CharSequence> mQueue;
    private volatile boolean mShow;
    private Toast mToast;

    public ToastStrategy() {
        super(Looper.getMainLooper());
        this.mQueue = getToastQueue();
    }

    private static boolean areNotificationsEnabled(Context context) {
        return ((NotificationManager) context.getSystemService(NotificationManager.class)).areNotificationsEnabled();
    }

    @Override // com.hjq.toast.IToastStrategy
    public void bind(Toast toast) {
        this.mToast = toast;
    }

    @Override // com.hjq.toast.IToastStrategy
    public void cancel() {
        if (this.mShow) {
            this.mShow = false;
            sendEmptyMessage(3);
        }
    }

    @Override // com.hjq.toast.IToastStrategy
    public Toast create(Application application) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            return new CustomToast(application);
        }
        if (i == 25) {
            return new SafeToast(application);
        }
        return (i >= 29 || areNotificationsEnabled(application) || "xiaomi".equals(Build.MANUFACTURER.toLowerCase())) ? new NormalToast(application) : new CustomToast(application);
    }

    public int getToastDuration(CharSequence charSequence) {
        return charSequence.length() > 20 ? IToastStrategy.LONG_DURATION_TIMEOUT : IToastStrategy.SHORT_DURATION_TIMEOUT;
    }

    public Queue<CharSequence> getToastQueue() {
        return new ArrayBlockingQueue(3);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            CharSequence charSequencePeek = this.mQueue.peek();
            if (charSequencePeek == null) {
                this.mShow = false;
                return;
            }
            this.mToast.setText(charSequencePeek);
            this.mToast.show();
            sendEmptyMessageDelayed(2, getToastDuration(charSequencePeek) + DELAY_TIMEOUT);
            return;
        }
        if (i != 2) {
            if (i != 3) {
                return;
            }
            this.mShow = false;
            this.mQueue.clear();
            this.mToast.cancel();
            return;
        }
        this.mQueue.poll();
        if (this.mQueue.isEmpty()) {
            this.mShow = false;
        } else {
            sendEmptyMessage(1);
        }
    }

    @Override // com.hjq.toast.IToastStrategy
    public void show(CharSequence charSequence) {
        if ((this.mQueue.isEmpty() || !this.mQueue.contains(charSequence)) && !this.mQueue.offer(charSequence)) {
            this.mQueue.poll();
            this.mQueue.offer(charSequence);
        }
        if (this.mShow) {
            return;
        }
        this.mShow = true;
        sendEmptyMessageDelayed(1, 200L);
    }
}
