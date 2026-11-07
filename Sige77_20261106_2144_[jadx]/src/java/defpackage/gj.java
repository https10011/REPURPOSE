package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.a;
import com.bumptech.glide.load.ImageHeaderParser;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class gj implements si1 {
    public static final br0 f = new br0(4);
    public static final gk1 g = new gk1(5);
    public final Context a;
    public final ArrayList b;
    public final md2 e;
    public final br0 d = f;
    public final gk1 c = g;

    public gj(Context context, ArrayList arrayList, mh mhVar, v01 v01Var) {
        this.a = context.getApplicationContext();
        this.b = arrayList;
        this.e = new md2(mhVar, v01Var);
    }

    public static int d(si0 si0Var, int i, int i2) {
        int iMin = Math.min(si0Var.g / i2, si0Var.f / i);
        int iMax = Math.max(1, iMin == 0 ? 0 : Integer.highestOneBit(iMin));
        if (Log.isLoggable("BufferGifDecoder", 2) && iMax > 1) {
            Log.v("BufferGifDecoder", "Downsampling GIF, sampleSize: " + iMax + ", target dimens: [" + i + "x" + i2 + "], actual dimens: [" + si0Var.f + "x" + si0Var.g + "]");
        }
        return iMax;
    }

    @Override // defpackage.si1
    public final pi1 a(Object obj, int i, int i2, da1 da1Var) {
        ti0 ti0Var;
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        gk1 gk1Var = this.c;
        synchronized (gk1Var) {
            try {
                ti0 ti0Var2 = (ti0) ((ArrayDeque) gk1Var.b).poll();
                if (ti0Var2 == null) {
                    ti0Var2 = new ti0();
                }
                ti0Var = ti0Var2;
                ti0Var.b = null;
                Arrays.fill(ti0Var.a, (byte) 0);
                ti0Var.c = new si0();
                ti0Var.d = 0;
                ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                ti0Var.b = byteBufferAsReadOnlyBuffer;
                byteBufferAsReadOnlyBuffer.position(0);
                ti0Var.b.order(ByteOrder.LITTLE_ENDIAN);
            } catch (Throwable th) {
                throw th;
            }
        }
        try {
            return c(byteBuffer, i, i2, ti0Var, da1Var);
        } finally {
            this.c.v(ti0Var);
        }
    }

    @Override // defpackage.si1
    public final boolean b(Object obj, da1 da1Var) {
        return !((Boolean) da1Var.c(ui0.b)).booleanValue() && qt.n(this.b, (ByteBuffer) obj) == ImageHeaderParser.ImageType.GIF;
    }

    /* JADX WARN: Undo finally extract visitor
    java.lang.NullPointerException: Attempt to invoke virtual method 'int java.lang.Object.hashCode()' on a null object reference
    	at jadx.core.utils.Pair.hashCode(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:9)
    	at java.util.HashMap.hash(HashMap.java:337)
    	at java.util.HashMap.getNode(HashMap.java:576)
    	at java.util.HashMap.containsKey(HashMap.java:602)
    	at jadx.core.dex.visitors.finaly.traverser.state.TraverserGlobalCommonState.hasBlocksBeenCached(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:8)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.MergePathActivePathTraverserHandler.handle(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:171)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.AbstractActivePathTraverserHandler.process(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.processHandlerImplementations(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:40)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.advance(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:205)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.process(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:12)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.findCommonInsns(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:140)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.extractFinally(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:30)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.processTryBlock(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:110)
     */
    public final mi0 c(ByteBuffer byteBuffer, int i, int i2, ti0 ti0Var, da1 da1Var) {
        StringBuilder sb;
        int i3 = e01.b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            si0 si0VarB = ti0Var.b();
            if (si0VarB.c > 0 && si0VarB.b == 0) {
                Bitmap.Config config = da1Var.c(ui0.a) == gy.b ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                int iD = d(si0VarB, i, i2);
                br0 br0Var = this.d;
                md2 md2Var = this.e;
                br0Var.getClass();
                gt1 gt1Var = new gt1(md2Var, si0VarB, byteBuffer, iD);
                gt1Var.c(config);
                gt1Var.k = (gt1Var.k + 1) % gt1Var.l.c;
                Bitmap bitmapB = gt1Var.b();
                if (bitmapB == null) {
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        sb = new StringBuilder("Decoded GIF from stream in ");
                        sb.append(e01.a(jElapsedRealtimeNanos));
                        Log.v("BufferGifDecoder", sb.toString());
                        return null;
                    }
                    return null;
                }
                mi0 mi0Var = new mi0(new li0(new y6(new ri0(a.a(this.a), gt1Var, i, i2, bitmapB), 1)), 0);
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    Log.v("BufferGifDecoder", "Decoded GIF from stream in " + e01.a(jElapsedRealtimeNanos));
                }
                return mi0Var;
            }
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                sb = new StringBuilder("Decoded GIF from stream in ");
                sb.append(e01.a(jElapsedRealtimeNanos));
                Log.v("BufferGifDecoder", sb.toString());
                return null;
            }
            return null;
        } catch (Throwable th) {
            if (!Log.isLoggable("BufferGifDecoder", 2)) {
                throw th;
            }
            Log.v("BufferGifDecoder", "Decoded GIF from stream in " + e01.a(jElapsedRealtimeNanos));
            throw th;
        }
    }
}
