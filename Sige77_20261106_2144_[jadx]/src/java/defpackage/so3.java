package defpackage;

import java.util.Iterator;
import java.util.regex.Matcher;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class so3 implements Iterator {
    public String b;
    public final CharSequence c;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object i;
    public int a = 2;
    public int d = 0;
    public int e = Integer.MAX_VALUE;

    public so3(ox1 ox1Var, CharSequence charSequence, Object obj, int i) {
        this.f = i;
        this.i = obj;
        this.c = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String string;
        int iEnd;
        int i = this.a;
        if (i == 4) {
            uq1.n();
            return false;
        }
        int i2 = i - 1;
        if (i2 == 0) {
            return true;
        }
        if (i2 != 2) {
            this.a = 4;
            int i3 = this.d;
            while (true) {
                int iStart = this.d;
                if (iStart != -1) {
                    int i4 = this.f;
                    CharSequence charSequence = this.c;
                    Object obj = this.i;
                    switch (i4) {
                        case 0:
                            Matcher matcher = (Matcher) ((m83) obj).a;
                            iStart = !matcher.find(iStart) ? -1 : matcher.start();
                            break;
                        default:
                            p33 p33Var = (p33) obj;
                            int length = charSequence.length();
                            if (iStart >= 0 && iStart <= length) {
                                while (true) {
                                    if (iStart < length) {
                                        if (!(charSequence.charAt(iStart) == p33Var.a)) {
                                            iStart++;
                                        }
                                    }
                                }
                            } else {
                                e.c(y21.C(iStart, length, "index"));
                                iStart = 0;
                            }
                            break;
                    }
                    if (iStart == -1) {
                        iStart = charSequence.length();
                        this.d = -1;
                    } else {
                        switch (i4) {
                            case 0:
                                iEnd = ((Matcher) ((m83) obj).a).end();
                                break;
                            default:
                                iEnd = iStart + 1;
                                break;
                        }
                        this.d = iEnd;
                    }
                    int i5 = this.d;
                    if (i5 == i3) {
                        int i6 = i5 + 1;
                        this.d = i6;
                        if (i6 > charSequence.length()) {
                            this.d = -1;
                        }
                    } else {
                        if (i3 < iStart) {
                            charSequence.charAt(i3);
                        }
                        if (iStart > i3) {
                            charSequence.charAt(iStart - 1);
                        }
                        int i7 = this.e;
                        if (i7 == 1) {
                            iStart = charSequence.length();
                            this.d = -1;
                            if (iStart > i3) {
                                charSequence.charAt(iStart - 1);
                            }
                        } else {
                            this.e = i7 - 1;
                        }
                        string = charSequence.subSequence(i3, iStart).toString();
                    }
                } else {
                    this.a = 3;
                    string = null;
                }
            }
            this.b = string;
            if (this.a != 3) {
                this.a = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            uq1.a();
            return null;
        }
        this.a = 2;
        String str = this.b;
        this.b = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
