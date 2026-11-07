package defpackage;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class qi0 implements Handler.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qi0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        ComponentName componentName = null;
        switch (this.a) {
            case 0:
                ri0 ri0Var = (ri0) this.b;
                int i = message.what;
                if (i == 1) {
                    ri0Var.b((pi0) message.obj);
                    return true;
                }
                if (i == 2) {
                    ri0Var.d.l((pi0) message.obj);
                }
                return false;
            case 1:
                if (message.what == 0) {
                    i5 i5Var = (i5) this.b;
                    if (message.obj == null) {
                        synchronized (i5Var.a) {
                            try {
                                throw null;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    ur.a();
                }
                return false;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                int i2 = message.arg1;
                if (Log.isLoggable("MessengerIpcClient", 3)) {
                    Log.d("MessengerIpcClient", "Received response to request: " + i2);
                }
                xe3 xe3Var = (xe3) this.b;
                synchronized (xe3Var) {
                    try {
                        xg3 xg3Var = (xg3) xe3Var.e.get(i2);
                        if (xg3Var != null) {
                            xe3Var.e.remove(i2);
                            xe3Var.c();
                            Bundle data = message.getData();
                            if (!data.getBoolean("unsupported", false)) {
                                switch (xg3Var.e) {
                                    case 0:
                                        if (!data.getBoolean("ack", false)) {
                                            xg3Var.b(new nc0("Invalid response to one way request", (Throwable) null));
                                        } else {
                                            xg3Var.c(null);
                                        }
                                        break;
                                    default:
                                        Bundle bundle = data.getBundle("data");
                                        if (bundle == null) {
                                            bundle = Bundle.EMPTY;
                                        }
                                        xg3Var.c(bundle);
                                        break;
                                }
                            } else {
                                xg3Var.b(new nc0("Not supported by GmsCore", (Throwable) null));
                            }
                        } else {
                            Log.w("MessengerIpcClient", "Received response for unknown request: " + i2);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return true;
            default:
                int i3 = message.what;
                if (i3 == 0) {
                    yf3 yf3Var = (yf3) this.b;
                    synchronized (yf3Var.a) {
                        try {
                            yb3 yb3Var = (yb3) message.obj;
                            ld3 ld3Var = (ld3) yf3Var.a.get(yb3Var);
                            if (ld3Var != null && ld3Var.a.isEmpty()) {
                                if (ld3Var.c) {
                                    yb3 yb3Var2 = ld3Var.e;
                                    yf3 yf3Var2 = ld3Var.i;
                                    yf3Var2.c.removeMessages(1, yb3Var2);
                                    yf3Var2.d.c(yf3Var2.b, ld3Var);
                                    ld3Var.c = false;
                                    ld3Var.b = 2;
                                }
                                yf3Var.a.remove(yb3Var);
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                        break;
                    }
                    return true;
                }
                if (i3 != 1) {
                    return false;
                }
                yf3 yf3Var3 = (yf3) this.b;
                synchronized (yf3Var3.a) {
                    try {
                        yb3 yb3Var3 = (yb3) message.obj;
                        ld3 ld3Var2 = (ld3) yf3Var3.a.get(yb3Var3);
                        if (ld3Var2 != null && ld3Var2.b == 3) {
                            String strValueOf = String.valueOf(yb3Var3);
                            StringBuilder sb = new StringBuilder(strValueOf.length() + 47);
                            sb.append("Timeout waiting for ServiceConnection callback ");
                            sb.append(strValueOf);
                            Log.e("GmsClientSupervisor", sb.toString(), new Exception());
                            ComponentName componentName2 = ld3Var2.f;
                            if (componentName2 == null) {
                                yb3Var3.getClass();
                            } else {
                                componentName = componentName2;
                            }
                            if (componentName == null) {
                                String str = yb3Var3.b;
                                gu2.o(str);
                                componentName = new ComponentName(str, "unknown");
                            }
                            ld3Var2.onServiceDisconnected(componentName);
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                    break;
                }
                return true;
        }
    }
}
