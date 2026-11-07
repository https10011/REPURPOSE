package defpackage;

import android.os.SystemClock;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.zzj;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class vg2 implements OnCompleteListener {
    public final uj0 a;
    public final int b;
    public final j7 c;
    public final long d;
    public final long e;

    public vg2(uj0 uj0Var, int i, j7 j7Var, long j, long j2) {
        this.a = uj0Var;
        this.b = i;
        this.c = j7Var;
        this.d = j;
        this.e = j2;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0031 A[RETURN] */
    public static ConnectionTelemetryConfiguration a(rg2 rg2Var, jf jfVar, int i) {
        zzj zzjVar = jfVar.w;
        ConnectionTelemetryConfiguration connectionTelemetryConfiguration = zzjVar == null ? null : zzjVar.d;
        if (connectionTelemetryConfiguration != null && connectionTelemetryConfiguration.b) {
            int[] iArr = connectionTelemetryConfiguration.d;
            int i2 = 0;
            if (iArr == null) {
                int[] iArr2 = connectionTelemetryConfiguration.f;
                if (iArr2 != null) {
                    while (i2 < iArr2.length) {
                        if (iArr2[i2] != i) {
                            i2++;
                        }
                    }
                    if (rg2Var.m < connectionTelemetryConfiguration.e) {
                        return connectionTelemetryConfiguration;
                    }
                } else if (rg2Var.m < connectionTelemetryConfiguration.e) {
                    return connectionTelemetryConfiguration;
                }
            } else {
                while (i2 < iArr.length) {
                    if (iArr[i2] != i) {
                        i2++;
                    } else if (rg2Var.m < connectionTelemetryConfiguration.e) {
                        return connectionTelemetryConfiguration;
                    }
                }
            }
        }
        return null;
    }

    public final void onComplete(Task task) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        long j;
        long j2;
        uj0 uj0Var = this.a;
        if (uj0Var.g()) {
            RootTelemetryConfiguration rootTelemetryConfiguration = (RootTelemetryConfiguration) gk1.q().b;
            if (rootTelemetryConfiguration == null || rootTelemetryConfiguration.b) {
                rg2 rg2Var = (rg2) uj0Var.j.get(this.c);
                if (rg2Var != null) {
                    nj0 nj0Var = rg2Var.b;
                    if (nj0Var instanceof jf) {
                        nj0 nj0Var2 = nj0Var;
                        long j3 = this.d;
                        int i6 = 0;
                        boolean z = j3 > 0;
                        int i7 = nj0Var2.q;
                        if (rootTelemetryConfiguration != null) {
                            z &= rootTelemetryConfiguration.c;
                            i = rootTelemetryConfiguration.d;
                            i3 = rootTelemetryConfiguration.e;
                            i2 = rootTelemetryConfiguration.a;
                            if (nj0Var2.w != null && !nj0Var2.q()) {
                                ConnectionTelemetryConfiguration connectionTelemetryConfigurationA = a(rg2Var, nj0Var2, this.b);
                                if (connectionTelemetryConfigurationA == null) {
                                    return;
                                }
                                boolean z2 = connectionTelemetryConfigurationA.c && j3 > 0;
                                i3 = connectionTelemetryConfigurationA.e;
                                z = z2;
                            }
                        } else {
                            i = 5000;
                            i2 = 0;
                            i3 = 100;
                        }
                        int i8 = i;
                        int iElapsedRealtime = -1;
                        if (task.isSuccessful()) {
                            i5 = 0;
                        } else if (task.isCanceled()) {
                            i6 = -1;
                            i5 = 100;
                        } else {
                            Exception exception = task.getException();
                            if (exception instanceof i7) {
                                Status status = ((i7) exception).getStatus();
                                i4 = status.a;
                                ConnectionResult connectionResult = status.d;
                                if (connectionResult != null) {
                                    i5 = i4;
                                    i6 = connectionResult.b;
                                }
                            } else {
                                i4 = 101;
                            }
                            i5 = i4;
                            i6 = -1;
                        }
                        if (z) {
                            long j4 = this.e;
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - j4);
                            j2 = jCurrentTimeMillis;
                            j = j3;
                        } else {
                            j = 0;
                            j2 = 0;
                        }
                        wg2 wg2Var = new wg2(new MethodInvocation(this.b, i5, i6, j, j2, (String) null, (String) null, i7, iElapsedRealtime), i2, i8, i3);
                        th2 th2Var = uj0Var.n;
                        th2Var.sendMessage(th2Var.obtainMessage(18, wg2Var));
                    }
                }
            }
        }
    }
}
