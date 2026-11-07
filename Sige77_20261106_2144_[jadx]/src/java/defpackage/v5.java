package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class v5 implements ServiceConnection {
    public final /* synthetic */ int a;
    public boolean b;
    public final LinkedBlockingQueue c;

    public v5(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = false;
                this.c = new LinkedBlockingQueue(1);
                break;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                this.b = false;
                this.c = new LinkedBlockingQueue(1);
                break;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                this.b = false;
                this.c = new LinkedBlockingQueue(1);
                break;
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                this.b = false;
                this.c = new LinkedBlockingQueue(1);
                break;
            default:
                this.b = false;
                this.c = new LinkedBlockingQueue(1);
                break;
        }
    }

    public IBinder a() {
        switch (this.a) {
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                if (this.b) {
                    uq1.n();
                    return null;
                }
                this.b = true;
                return (IBinder) this.c.poll(10L, TimeUnit.SECONDS);
            default:
                if (this.b) {
                    uq1.n();
                    return null;
                }
                this.b = true;
                return (IBinder) this.c.poll(10L, TimeUnit.SECONDS);
        }
    }

    public IBinder b() {
        switch (this.a) {
            case 0:
                if (this.b) {
                    uq1.n();
                    return null;
                }
                this.b = true;
                return (IBinder) this.c.poll(10L, TimeUnit.SECONDS);
            default:
                if (this.b) {
                    uq1.n();
                    return null;
                }
                this.b = true;
                return (IBinder) this.c.take();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i = this.a;
        LinkedBlockingQueue linkedBlockingQueue = this.c;
        switch (i) {
            case 0:
                try {
                    linkedBlockingQueue.put(iBinder);
                } catch (InterruptedException unused) {
                    return;
                }
                break;
            case 1:
                try {
                    if (linkedBlockingQueue.size() == 0) {
                        linkedBlockingQueue.put(iBinder);
                    }
                } catch (Exception unused2) {
                    return;
                }
                break;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                try {
                    linkedBlockingQueue.put(iBinder);
                } catch (InterruptedException unused3) {
                    return;
                }
                break;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                try {
                    linkedBlockingQueue.put(iBinder);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    Thread.currentThread().interrupt();
                }
                break;
            default:
                try {
                    linkedBlockingQueue.put(iBinder);
                } catch (InterruptedException unused4) {
                    return;
                }
                break;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        switch (this.a) {
            case 1:
                try {
                    this.c.clear();
                } catch (Exception unused) {
                    return;
                }
                break;
        }
    }

    private final void c(ComponentName componentName) {
    }

    private final void d(ComponentName componentName) {
    }

    private final void e(ComponentName componentName) {
    }

    private final void f(ComponentName componentName) {
    }
}
