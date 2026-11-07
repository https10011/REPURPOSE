package defpackage;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.Http2Connection;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final /* synthetic */ class jm0 implements Function0 {
    public final /* synthetic */ Http2Connection a;
    public final /* synthetic */ int b;
    public final /* synthetic */ ErrorCode c;

    public /* synthetic */ jm0(Http2Connection http2Connection, int i, ErrorCode errorCode) {
        this.a = http2Connection;
        this.b = i;
        this.c = errorCode;
    }

    public final Object invoke() {
        Http2Connection http2Connection = this.a;
        int i = this.b;
        ErrorCode errorCode = this.c;
        Http2Connection.Companion companion = Http2Connection.m0;
        try {
            http2Connection.j0.m(i, errorCode);
        } catch (IOException e) {
            ErrorCode errorCode2 = ErrorCode.d;
            http2Connection.a(errorCode2, errorCode2, e);
        }
        return Unit.a;
    }
}
