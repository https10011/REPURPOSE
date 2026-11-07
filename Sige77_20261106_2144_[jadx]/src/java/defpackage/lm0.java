package defpackage;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.http2.Settings;
import okhttp3.internal.platform.Platform;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final /* synthetic */ class lm0 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lm0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public final Object invoke() {
        int i;
        long jA;
        Http2Stream[] http2StreamArr;
        switch (this.a) {
            case 0:
                Http2Connection http2Connection = (Http2Connection) this.b;
                Http2Stream http2Stream = (Http2Stream) this.c;
                try {
                    http2Connection.a.c(http2Stream);
                    break;
                } catch (IOException e) {
                    Platform.a.getClass();
                    Platform.b.j(4, "Http2Connection.Listener failure for " + http2Connection.c, e);
                    try {
                        http2Stream.e(ErrorCode.d, e);
                        break;
                    } catch (IOException unused) {
                    }
                }
                return Unit.a;
            case 1:
                Http2Connection.ReaderRunnable readerRunnable = (Http2Connection.ReaderRunnable) this.b;
                Settings settings = (Settings) this.c;
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                Http2Connection http2Connection2 = readerRunnable.b;
                synchronized (http2Connection2.j0) {
                    synchronized (http2Connection2) {
                        try {
                            Settings settings2 = http2Connection2.e0;
                            Settings settings3 = new Settings();
                            settings2.getClass();
                            for (int i2 = 0; i2 < 10; i2++) {
                                if (((1 << i2) & settings2.a) != 0) {
                                    settings3.b(i2, settings2.b[i2]);
                                }
                            }
                            for (int i3 = 0; i3 < 10; i3++) {
                                if (((1 << i3) & settings.a) != 0) {
                                    settings3.b(i3, settings.b[i3]);
                                }
                            }
                            objectRef.element = settings3;
                            jA = ((long) settings3.a()) - ((long) settings2.a());
                            http2StreamArr = (jA == 0 || http2Connection2.b.isEmpty()) ? null : (Http2Stream[]) http2Connection2.b.values().toArray(new Http2Stream[0]);
                            Settings settings4 = (Settings) objectRef.element;
                            settings4.getClass();
                            http2Connection2.e0 = settings4;
                            TaskQueue.c(http2Connection2.W, http2Connection2.c + " onSettings", new lm0(2, http2Connection2, objectRef), 6);
                            Unit unit = Unit.a;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    try {
                        http2Connection2.j0.a((Settings) objectRef.element);
                    } catch (IOException e2) {
                        ErrorCode errorCode = ErrorCode.d;
                        http2Connection2.a(errorCode, errorCode, e2);
                    }
                    Unit unit2 = Unit.a;
                    break;
                }
                if (http2StreamArr != null) {
                    for (Http2Stream http2Stream2 : http2StreamArr) {
                        synchronized (http2Stream2) {
                            http2Stream2.e += jA;
                            if (jA > 0) {
                                http2Stream2.notifyAll();
                            }
                            Unit unit3 = Unit.a;
                        }
                    }
                }
                return Unit.a;
            default:
                Http2Connection http2Connection3 = (Http2Connection) this.b;
                http2Connection3.a.a(http2Connection3, (Settings) ((Ref.ObjectRef) this.c).element);
                return Unit.a;
        }
    }
}
