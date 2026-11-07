package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class vd1 implements x71 {
    public static final Charset f = Charset.forName("UTF-8");
    public static final oa0 g = new oa0("key", ts.p(ts.o(sd1.class, new fc(1))));
    public static final oa0 h = new oa0("value", ts.p(ts.o(sd1.class, new fc(2))));
    public static final qt0 i = new qt0(1);
    public OutputStream a;
    public final HashMap b;
    public final HashMap c;
    public final w71 d;
    public final wd1 e = new wd1(this);

    public vd1(ByteArrayOutputStream byteArrayOutputStream, HashMap map, HashMap map2, w71 w71Var) {
        this.a = byteArrayOutputStream;
        this.b = map;
        this.c = map2;
        this.d = w71Var;
    }

    public static int h(oa0 oa0Var) {
        sd1 sd1Var = (sd1) ((Annotation) oa0Var.b.get(sd1.class));
        if (sd1Var != null) {
            return sd1Var.tag();
        }
        throw new l60("Field has no @Protobuf config");
    }

    @Override // defpackage.x71
    public final x71 a(oa0 oa0Var, Object obj) {
        f(oa0Var, obj, true);
        return this;
    }

    public final void b(oa0 oa0Var, int i2, boolean z) {
        if (z && i2 == 0) {
            return;
        }
        sd1 sd1Var = (sd1) ((Annotation) oa0Var.b.get(sd1.class));
        if (sd1Var == null) {
            throw new l60("Field has no @Protobuf config");
        }
        int iOrdinal = sd1Var.intEncoding().ordinal();
        if (iOrdinal == 0) {
            i(sd1Var.tag() << 3);
            i(i2);
        } else if (iOrdinal == 1) {
            i(sd1Var.tag() << 3);
            i((i2 << 1) ^ (i2 >> 31));
        } else {
            if (iOrdinal != 2) {
                return;
            }
            i((sd1Var.tag() << 3) | 5);
            this.a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i2).array());
        }
    }

    public final void c(oa0 oa0Var, long j, boolean z) throws IOException {
        if (z && j == 0) {
            return;
        }
        sd1 sd1Var = (sd1) ((Annotation) oa0Var.b.get(sd1.class));
        if (sd1Var == null) {
            throw new l60("Field has no @Protobuf config");
        }
        int iOrdinal = sd1Var.intEncoding().ordinal();
        if (iOrdinal == 0) {
            i(sd1Var.tag() << 3);
            j(j);
        } else if (iOrdinal == 1) {
            i(sd1Var.tag() << 3);
            j((j >> 63) ^ (j << 1));
        } else {
            if (iOrdinal != 2) {
                return;
            }
            i((sd1Var.tag() << 3) | 1);
            this.a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j).array());
        }
    }

    @Override // defpackage.x71
    public final x71 d(oa0 oa0Var, int i2) {
        b(oa0Var, i2, true);
        return this;
    }

    @Override // defpackage.x71
    public final x71 e(oa0 oa0Var, long j) throws IOException {
        c(oa0Var, j, true);
        return this;
    }

    public final void f(oa0 oa0Var, Object obj, boolean z) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return;
            }
            i((h(oa0Var) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f);
            i(bytes.length);
            this.a.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                f(oa0Var, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                g(i, oa0Var, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (z && dDoubleValue == 0.0d) {
                return;
            }
            i((h(oa0Var) << 3) | 1);
            this.a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(dDoubleValue).array());
            return;
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (z && fFloatValue == 0.0f) {
                return;
            }
            i((h(oa0Var) << 3) | 5);
            this.a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(fFloatValue).array());
            return;
        }
        if (obj instanceof Number) {
            c(oa0Var, ((Number) obj).longValue(), z);
            return;
        }
        if (obj instanceof Boolean) {
            b(oa0Var, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return;
            }
            i((h(oa0Var) << 3) | 2);
            i(bArr.length);
            this.a.write(bArr);
            return;
        }
        w71 w71Var = (w71) this.b.get(obj.getClass());
        if (w71Var != null) {
            g(w71Var, oa0Var, obj, z);
            return;
        }
        l42 l42Var = (l42) this.c.get(obj.getClass());
        if (l42Var != null) {
            wd1 wd1Var = this.e;
            wd1Var.a = false;
            wd1Var.c = oa0Var;
            wd1Var.b = z;
            l42Var.a(obj, wd1Var);
            return;
        }
        if (obj instanceof qd1) {
            b(oa0Var, ((qd1) obj).a(), true);
        } else if (obj instanceof Enum) {
            b(oa0Var, ((Enum) obj).ordinal(), true);
        } else {
            g(this.d, oa0Var, obj, z);
        }
    }

    public final void g(w71 w71Var, oa0 oa0Var, Object obj, boolean z) throws IOException {
        gw0 gw0Var = new gw0();
        gw0Var.a = 0L;
        try {
            OutputStream outputStream = this.a;
            this.a = gw0Var;
            try {
                w71Var.a(obj, this);
                this.a = outputStream;
                long j = gw0Var.a;
                gw0Var.close();
                if (z && j == 0) {
                    return;
                }
                i((h(oa0Var) << 3) | 2);
                j(j);
                w71Var.a(obj, this);
            } catch (Throwable th) {
                this.a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                gw0Var.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void i(int i2) throws IOException {
        while (true) {
            long j = i2 & (-128);
            OutputStream outputStream = this.a;
            if (j == 0) {
                outputStream.write(i2 & 127);
                return;
            } else {
                outputStream.write((i2 & 127) | 128);
                i2 >>>= 7;
            }
        }
    }

    public final void j(long j) throws IOException {
        while (true) {
            long j2 = (-128) & j;
            OutputStream outputStream = this.a;
            if (j2 == 0) {
                outputStream.write(((int) j) & 127);
                return;
            } else {
                outputStream.write((((int) j) & 127) | 128);
                j >>>= 7;
            }
        }
    }
}
