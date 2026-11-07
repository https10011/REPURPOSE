package defpackage;

import android.text.SpannableStringBuilder;
import com.hjq.toast.BuildConfig;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class dh {
    public static final String b;
    public static final String c;
    public static final dh d;
    public static final dh e;
    public final boolean a;

    static {
        ci ciVar = ww1.c;
        b = Character.toString((char) 8206);
        c = Character.toString((char) 8207);
        d = new dh(false);
        e = new dh(true);
    }

    public dh(boolean z) {
        ci ciVar = ww1.a;
        this.a = z;
    }

    public static int a(CharSequence charSequence) {
        byte directionality;
        ch chVar = new ch(charSequence);
        chVar.c = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = chVar.c;
            if (i4 < chVar.b && i == 0) {
                CharSequence charSequence2 = chVar.a;
                char cCharAt = charSequence2.charAt(i4);
                chVar.d = cCharAt;
                boolean zIsHighSurrogate = Character.isHighSurrogate(cCharAt);
                int i5 = chVar.c;
                if (zIsHighSurrogate) {
                    int iCodePointAt = Character.codePointAt(charSequence2, i5);
                    chVar.c = Character.charCount(iCodePointAt) + chVar.c;
                    directionality = Character.getDirectionality(iCodePointAt);
                } else {
                    chVar.c = i5 + 1;
                    char c2 = chVar.d;
                    directionality = c2 < 1792 ? ch.e[c2] : Character.getDirectionality(c2);
                }
                if (directionality != 0) {
                    if (directionality == 1 || directionality == 2) {
                        if (i3 == 0) {
                            return 1;
                        }
                    } else if (directionality != 9) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                i3++;
                                i2 = -1;
                                continue;
                            case 16:
                            case 17:
                                i3++;
                                i2 = 1;
                                continue;
                            case 18:
                                i3--;
                                i2 = 0;
                                continue;
                        }
                    }
                } else if (i3 == 0) {
                    return -1;
                }
                i = i3;
            }
        }
        if (i != 0) {
            if (i2 == 0) {
                while (chVar.c > 0) {
                    switch (chVar.a()) {
                        case 14:
                        case 15:
                            if (i == i3) {
                                return -1;
                            }
                            i3--;
                            break;
                        case 16:
                        case 17:
                            if (i == i3) {
                                return 1;
                            }
                            i3--;
                            break;
                        case 18:
                            i3++;
                            break;
                        default:
                            break;
                    }
                }
            } else {
                return i2;
            }
        }
        return 0;
    }

    public static int b(CharSequence charSequence) {
        ch chVar = new ch(charSequence);
        chVar.c = chVar.b;
        int i = 0;
        while (true) {
            int i2 = i;
            while (chVar.c > 0) {
                byte bA = chVar.a();
                if (bA == 0) {
                    if (i == 0) {
                        return -1;
                    }
                    if (i2 == 0) {
                    }
                } else if (bA == 1 || bA == 2) {
                    if (i == 0) {
                        return 1;
                    }
                    if (i2 == 0) {
                    }
                } else if (bA != 9) {
                    switch (bA) {
                        case 14:
                        case 15:
                            if (i2 == i) {
                                return -1;
                            }
                            i--;
                            break;
                        case 16:
                        case 17:
                            if (i2 == i) {
                                return 1;
                            }
                            i--;
                            break;
                        case 18:
                            i++;
                            break;
                        default:
                            if (i2 != 0) {
                            }
                            break;
                    }
                } else {
                    continue;
                }
            }
            return 0;
        }
    }

    public final SpannableStringBuilder c(CharSequence charSequence) {
        String str;
        ci ciVar = ww1.c;
        if (charSequence == null) {
            return null;
        }
        boolean zB = ciVar.b(charSequence, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean zB2 = (zB ? ww1.b : ww1.a).b(charSequence, charSequence.length());
        String str2 = BuildConfig.FLAVOR;
        String str3 = c;
        String str4 = b;
        boolean z = this.a;
        if (z || !(zB2 || a(charSequence) == 1)) {
            str = (!z || (zB2 && a(charSequence) != -1)) ? BuildConfig.FLAVOR : str3;
        } else {
            str = str4;
        }
        spannableStringBuilder.append((CharSequence) str);
        if (zB != z) {
            spannableStringBuilder.append(zB ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        boolean zB3 = (zB ? ww1.b : ww1.a).b(charSequence, charSequence.length());
        if (!z && (zB3 || b(charSequence) == 1)) {
            str2 = str4;
        } else if (z && (!zB3 || b(charSequence) == -1)) {
            str2 = str3;
        }
        spannableStringBuilder.append((CharSequence) str2);
        return spannableStringBuilder;
    }
}
