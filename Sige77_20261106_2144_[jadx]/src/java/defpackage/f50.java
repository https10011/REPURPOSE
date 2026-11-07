package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class f50 {
    public static final Object j = new Object();
    public static volatile f50 k;
    public final ReentrantReadWriteLock a;
    public final ob b;
    public volatile int c;
    public final Handler d;
    public final b50 e;
    public final e50 f;
    public final qh1 g;
    public final int h;
    public final xy i;

    public f50(de0 de0Var) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.a = reentrantReadWriteLock;
        this.c = 3;
        e50 e50Var = (e50) de0Var.b;
        this.f = e50Var;
        int i = de0Var.a;
        this.h = i;
        this.i = (xy) de0Var.c;
        this.d = new Handler(Looper.getMainLooper());
        this.b = new ob(0);
        this.g = new qh1(5);
        b50 b50Var = new b50(this);
        this.e = b50Var;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.c = 0;
            } catch (Throwable th) {
                this.a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                e50Var.d(new a50(b50Var));
            } catch (Throwable th2) {
                d(th2);
            }
        }
    }

    public static f50 a() {
        f50 f50Var;
        synchronized (j) {
            try {
                f50Var = k;
                if (!(f50Var != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f50Var;
    }

    public final int b() {
        this.a.readLock().lock();
        try {
            return this.c;
        } finally {
            this.a.readLock().unlock();
        }
    }

    public final void c() {
        if (!(this.h == 1)) {
            uq1.q("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
            return;
        }
        if (b() == 1) {
            return;
        }
        this.a.writeLock().lock();
        try {
            if (this.c == 0) {
                this.a.writeLock().unlock();
                return;
            }
            this.c = 0;
            this.a.writeLock().unlock();
            b50 b50Var = this.e;
            f50 f50Var = b50Var.a;
            try {
                f50Var.f.d(new a50(b50Var));
            } catch (Throwable th) {
                f50Var.d(th);
            }
        } catch (Throwable th2) {
            this.a.writeLock().unlock();
            throw th2;
        }
    }

    public final void d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.c = 2;
            arrayList.addAll(this.b);
            this.b.clear();
            this.a.writeLock().unlock();
            this.d.post(new hk(arrayList, this.c, th));
        } catch (Throwable th2) {
            this.a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x009f A[Catch: all -> 0x0082, TryCatch #0 {all -> 0x0082, blocks: (B:33:0x005a, B:36:0x005f, B:38:0x0063, B:40:0x0070, B:47:0x008f, B:49:0x0099, B:51:0x009c, B:53:0x009f, B:55:0x00af, B:56:0x00b2), top: B:95:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00af A[Catch: all -> 0x0082, TryCatch #0 {all -> 0x0082, blocks: (B:33:0x005a, B:36:0x005f, B:38:0x0063, B:40:0x0070, B:47:0x008f, B:49:0x0099, B:51:0x009c, B:53:0x009f, B:55:0x00af, B:56:0x00b2), top: B:95:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:62:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:86:0x0104  */
    public final CharSequence e(CharSequence charSequence, int i, int i2) throws Throwable {
        Throwable th;
        CharSequence charSequence2;
        int i3;
        int i4;
        c22[] c22VarArr;
        int spanStart;
        x22 x22Var = null;
        if (!(b() == 1)) {
            uq1.q("Not initialized yet");
            return null;
        }
        if (i < 0) {
            e.g("start cannot be negative");
            return null;
        }
        if (i2 < 0) {
            e.g("end cannot be negative");
            return null;
        }
        r93.l("start should be <= than end", i <= i2);
        if (charSequence == null) {
            return null;
        }
        r93.l("start should be < than charSequence length", i <= charSequence.length());
        r93.l("end should be < than charSequence length", i2 <= charSequence.length());
        if (charSequence.length() == 0 || i == i2) {
            return charSequence;
        }
        ac2 ac2Var = this.e.b;
        ac2Var.getClass();
        boolean z = charSequence instanceof js1;
        if (z) {
            ((js1) charSequence).a();
        }
        if (z) {
            x22Var = new x22((Spannable) charSequence);
            if (x22Var != null) {
                for (c22 c22Var : c22VarArr) {
                    spanStart = x22Var.b.getSpanStart(c22Var);
                    int spanEnd = x22Var.b.getSpanEnd(c22Var);
                    if (spanStart != i2) {
                        x22Var.removeSpan(c22Var);
                    }
                    i = Math.min(spanStart, i);
                    i2 = Math.max(spanEnd, i2);
                }
            }
            i3 = i;
            i4 = i2;
            if (i3 != i4) {
                charSequence2 = charSequence;
                if (!z) {
                    return charSequence2;
                }
            } else {
                charSequence2 = charSequence;
                if (!z) {
                    return charSequence2;
                }
            }
            ((js1) charSequence2).b();
            return charSequence2;
        }
        try {
            if (charSequence instanceof Spannable) {
                try {
                    x22Var = new x22((Spannable) charSequence);
                } catch (Throwable th2) {
                    th = th2;
                    charSequence2 = charSequence;
                    th = th;
                    if (!z) {
                        throw th;
                    }
                    ((js1) charSequence2).b();
                    throw th;
                }
            } else if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i - 1, i2 + 1, c22.class) <= i2) {
                x22Var = new x22();
                x22Var.a = false;
                x22Var.b = new SpannableString(charSequence);
            }
            if (x22Var != null && (c22VarArr = (c22[]) x22Var.b.getSpans(i, i2, c22.class)) != null && c22VarArr.length > 0) {
                while (i < r2) {
                    spanStart = x22Var.b.getSpanStart(c22Var);
                    int spanEnd2 = x22Var.b.getSpanEnd(c22Var);
                    if (spanStart != i2) {
                        x22Var.removeSpan(c22Var);
                    }
                    i = Math.min(spanStart, i);
                    i2 = Math.max(spanEnd2, i2);
                }
            }
            i3 = i;
            i4 = i2;
            if (i3 != i4 || i3 >= charSequence.length()) {
                charSequence2 = charSequence;
                if (!z) {
                    return charSequence2;
                }
            } else {
                try {
                    charSequence2 = charSequence;
                    try {
                        x22 x22Var2 = (x22) ac2Var.M(charSequence2, i3, i4, Integer.MAX_VALUE, false, new rc2(3, x22Var, (qh1) ac2Var.b));
                        if (x22Var2 != null) {
                            Spannable spannable = x22Var2.b;
                            if (z) {
                                ((js1) charSequence2).b();
                            }
                            return spannable;
                        }
                        if (!z) {
                            return charSequence2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        if (!z) {
                            throw th;
                        }
                        ((js1) charSequence2).b();
                        throw th;
                    }
                } catch (Throwable th4) {
                    charSequence2 = charSequence;
                    th = th4;
                }
            }
            ((js1) charSequence2).b();
            return charSequence2;
        } catch (Throwable th5) {
            th = th5;
            charSequence2 = charSequence;
        }
        if (!z) {
            throw th;
        }
        ((js1) charSequence2).b();
        throw th;
    }

    public final void f(d50 d50Var) {
        r93.n(d50Var, "initCallback cannot be null");
        this.a.writeLock().lock();
        try {
            if (this.c == 1 || this.c == 2) {
                this.d.post(new hk(Arrays.asList(d50Var), this.c, (Throwable) null));
            } else {
                this.b.add(d50Var);
            }
        } finally {
            this.a.writeLock().unlock();
        }
    }
}
