package defpackage;

import android.content.Context;
import android.util.Base64;
import android.util.Pair;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.hjq.toast.BuildConfig;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Proxy;
import java.nio.channels.FileChannel;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class oe2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ LinkedBlockingQueue b;
    public final /* synthetic */ ne2 c;

    public /* synthetic */ oe2(ne2 ne2Var, LinkedBlockingQueue linkedBlockingQueue, int i) {
        this.a = i;
        this.c = ne2Var;
        this.b = linkedBlockingQueue;
    }

    /* JADX WARN: Code duplicated, block: B:81:0x0097 A[EXC_TOP_SPLITTER, PHI: r9
      0x0097: PHI (r9v26 java.nio.channels.FileChannel) = (r9v25 java.nio.channels.FileChannel), (r9v27 java.nio.channels.FileChannel) binds: [B:30:0x0095, B:33:0x009b] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    @Override // java.lang.Runnable
    public final void run() {
        String str;
        Pair pairCreate;
        String str2;
        FileChannel channel;
        String str3;
        byte[] bArrC;
        int i = this.a;
        String str4 = null;
        LinkedBlockingQueue linkedBlockingQueue = this.b;
        ne2 ne2Var = this.c;
        switch (i) {
            case 0:
                h01 h01VarG = ne2Var.G(ne2Var.l().b(true));
                if (ne2Var.l().a && h01VarG == null) {
                    pairCreate = Pair.create("pbR", String.valueOf(false));
                } else {
                    if (h01VarG == null || !h01VarG.c(2)) {
                        str = "pbT";
                        if (h01VarG == null || !h01VarG.c(1)) {
                            pairCreate = Pair.create("pbT", null);
                        } else {
                            str2 = h01VarG.a;
                        }
                    } else {
                        str = "pbH";
                        str2 = h01VarG.b;
                    }
                    pairCreate = Pair.create(str, str2);
                }
                linkedBlockingQueue.offer(pairCreate);
                ne2Var.l().c = false;
                break;
            case 1:
                xb2 xb2Var = ne2Var.e;
                Context context = ne2Var.c;
                xb2Var.getClass();
                try {
                    xb2.c = InstallReferrerClient.Builder.class.getDeclaredMethod("build", null).invoke(InstallReferrerClient.class.getDeclaredMethod("newBuilder", Context.class).invoke(null, context), null);
                    InstallReferrerClient.class.getDeclaredMethod("startConnection", InstallReferrerStateListener.class).invoke(xb2.c, Proxy.newProxyInstance(context.getClassLoader(), new Class[]{InstallReferrerStateListener.class}, new jp0(2)));
                } catch (Throwable unused) {
                    xb2.a.countDown();
                    if (g93.i) {
                        g93.g("InstallReferrerClient Connection Failed", new Object[0]);
                    }
                }
                xb2Var.getClass();
                try {
                    xb2.a.await(3L, TimeUnit.SECONDS);
                    break;
                } catch (InterruptedException unused2) {
                }
                if (g93.i) {
                    g93.b("PlayInstallReferrer getReferrer : %s", xb2.b);
                }
                linkedBlockingQueue.offer(Pair.create("gR", xb2.b));
                break;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                try {
                    channel = new RandomAccessFile(((Context) ((qp0) ne2Var.a).f().a).getApplicationInfo().sourceDir, "r").getChannel();
                    try {
                        vc2 vc2VarA = ye1.a(channel);
                        str3 = BuildConfig.FLAVOR;
                        if (vc2VarA == null || (bArrC = vc2VarA.c()) == null) {
                            try {
                                channel.close();
                                break;
                            } catch (IOException unused3) {
                            }
                        } else {
                            String str5 = new String(Base64.encode(bArrC, 10), vb2.a);
                            try {
                                channel.close();
                                break;
                            } catch (IOException unused4) {
                            }
                            str4 = str5;
                            str3 = str4;
                        }
                    } catch (IOException unused5) {
                        if (channel != null) {
                            try {
                                channel.close();
                                break;
                            } catch (IOException unused6) {
                            }
                        }
                    } catch (Throwable unused7) {
                        if (channel != null) {
                            channel.close();
                        }
                        break;
                    }
                } catch (IOException unused8) {
                    channel = null;
                } catch (Throwable unused9) {
                    channel = null;
                }
                linkedBlockingQueue.offer(Pair.create("aI", str3));
                break;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                linkedBlockingQueue.offer(Pair.create("si", String.valueOf(hs1.a().d(ne2Var.c))));
                break;
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                es1 es1VarA = sp0.a(ne2Var.c);
                if (es1VarA != null && !es1VarA.c) {
                    str4 = es1VarA.b;
                }
                linkedBlockingQueue.offer(Pair.create("ga", str4));
                break;
            default:
                fc2 fc2Var = ne2Var.d;
                fc2Var.a(ne2Var.c);
                linkedBlockingQueue.offer(Pair.create("oa", fc2Var.a));
                break;
        }
    }
}
