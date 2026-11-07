package defpackage;

import android.util.Log;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Objects;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class g01 extends Writer {
    public final /* synthetic */ int a;
    public final StringBuilder b;
    public final CharSequence c;

    public g01() {
        this.a = 0;
        this.b = new StringBuilder(128);
        this.c = "FragmentManager";
    }

    public void a() {
        StringBuilder sb = this.b;
        if (sb.length() > 0) {
            Log.d((String) this.c, sb.toString());
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence) {
        switch (this.a) {
            case 1:
                this.b.append(charSequence);
                return this;
            default:
                return super.append(charSequence);
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.a) {
            case 0:
                a();
                break;
            default:
                CharSequence charSequence = this.b;
                if (charSequence instanceof Closeable) {
                    ((Closeable) charSequence).close();
                }
                break;
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() throws IOException {
        switch (this.a) {
            case 0:
                a();
                break;
            default:
                CharSequence charSequence = this.b;
                if (charSequence instanceof Flushable) {
                    ((Flushable) charSequence).flush();
                }
                break;
        }
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        int i3 = this.a;
        StringBuilder sb = this.b;
        switch (i3) {
            case 0:
                for (int i4 = 0; i4 < i2; i4++) {
                    char c = cArr[i + i4];
                    if (c == '\n') {
                        a();
                    } else {
                        sb.append(c);
                    }
                }
                break;
            default:
                eu1 eu1Var = (eu1) this.c;
                eu1Var.a = cArr;
                eu1Var.b = null;
                sb.append((CharSequence) eu1Var, i, i2 + i);
                break;
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Appendable append(CharSequence charSequence) {
        switch (this.a) {
            case 1:
                this.b.append(charSequence);
                return this;
            default:
                return super.append(charSequence);
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence, int i, int i2) {
        switch (this.a) {
            case 1:
                this.b.append(charSequence, i, i2);
                return this;
            default:
                return super.append(charSequence, i, i2);
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Appendable append(CharSequence charSequence, int i, int i2) {
        switch (this.a) {
            case 1:
                this.b.append(charSequence, i, i2);
                return this;
            default:
                return super.append(charSequence, i, i2);
        }
    }

    public g01(StringBuilder sb) {
        this.a = 1;
        this.c = new eu1();
        this.b = sb;
    }

    @Override // java.io.Writer
    public void write(int i) throws IOException {
        switch (this.a) {
            case 1:
                this.b.append((char) i);
                break;
            default:
                super.write(i);
                break;
        }
    }

    @Override // java.io.Writer
    public void write(String str, int i, int i2) throws IOException {
        switch (this.a) {
            case 1:
                Objects.requireNonNull(str);
                this.b.append((CharSequence) str, i, i2 + i);
                break;
            default:
                super.write(str, i, i2);
                break;
        }
    }
}
