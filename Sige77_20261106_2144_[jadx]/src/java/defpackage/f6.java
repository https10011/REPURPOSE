package defpackage;

import android.R;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.ByteArrayOutputStream;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class f6 implements bj1, h3, ea3, ac {
    public final /* synthetic */ int a;
    public int b;
    public Object c;

    public f6(int i, byte b) {
        this.a = i;
        switch (i) {
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                this.b = 1;
                this.c = Collections.singletonList(null);
                break;
            default:
                this.c = Bitmap.CompressFormat.JPEG;
                this.b = 100;
                break;
        }
    }

    public g6 a() {
        b6 b6Var = (b6) this.c;
        g6 g6Var = new g6(b6Var.a, this.b);
        View view = b6Var.f;
        e6 e6Var = g6Var.f;
        if (view != null) {
            e6Var.v = view;
        } else {
            CharSequence charSequence = b6Var.e;
            if (charSequence != null) {
                e6Var.d = charSequence;
                TextView textView = e6Var.t;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = b6Var.d;
            if (drawable != null) {
                e6Var.r = drawable;
                e6Var.q = 0;
                ImageView imageView = e6Var.s;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    e6Var.s.setImageDrawable(drawable);
                }
            }
            int i = b6Var.c;
            if (i != 0) {
                e6Var.r = null;
                e6Var.q = i;
                ImageView imageView2 = e6Var.s;
                if (imageView2 != null) {
                    if (i != 0) {
                        imageView2.setVisibility(0);
                        e6Var.s.setImageResource(e6Var.q);
                    } else {
                        imageView2.setVisibility(8);
                    }
                }
            }
        }
        CharSequence charSequence2 = b6Var.g;
        if (charSequence2 != null) {
            e6Var.e = charSequence2;
            TextView textView2 = e6Var.u;
            if (textView2 != null) {
                textView2.setText(charSequence2);
            }
        }
        CharSequence charSequence3 = b6Var.h;
        if (charSequence3 != null) {
            e6Var.b(-1, charSequence3, b6Var.i);
        }
        CharSequence charSequence4 = b6Var.j;
        if (charSequence4 != null) {
            e6Var.b(-2, charSequence4, b6Var.k);
        }
        CharSequence charSequence5 = b6Var.l;
        if (charSequence5 != null) {
            e6Var.b(-3, charSequence5, b6Var.m);
        }
        if (b6Var.r != null || b6Var.s != null) {
            AlertController.RecycleListView recycleListViewInflate = b6Var.b.inflate(e6Var.z, (ViewGroup) null);
            int i2 = b6Var.u ? e6Var.A : e6Var.B;
            ListAdapter d6Var = b6Var.s;
            if (d6Var == null) {
                d6Var = new d6(b6Var.a, i2, R.id.text1, b6Var.r);
            }
            e6Var.w = d6Var;
            e6Var.x = b6Var.v;
            if (b6Var.t != null) {
                recycleListViewInflate.setOnItemClickListener(new a6(b6Var, e6Var));
            }
            if (b6Var.u) {
                recycleListViewInflate.setChoiceMode(1);
            }
            e6Var.f = recycleListViewInflate;
        }
        g6Var.setCancelable(b6Var.n);
        if (b6Var.n) {
            g6Var.setCanceledOnTouchOutside(true);
        }
        g6Var.setOnCancelListener(b6Var.o);
        g6Var.setOnDismissListener(b6Var.p);
        j31 j31Var = b6Var.q;
        if (j31Var != null) {
            g6Var.setOnKeyListener(j31Var);
        }
        return g6Var;
    }

    public void b(int i, ec ecVar) {
        while (true) {
            int i2 = i >> 1;
            if (i2 == 0) {
                break;
            }
            ec ecVar2 = ((ec[]) this.c)[i2];
            ecVar2.getClass();
            if (Intrinsics.compare(0L, ecVar.g - ecVar2.g) <= 0) {
                break;
            }
            ecVar2.f = i;
            ((ec[]) this.c)[i] = ecVar2;
            i = i2;
        }
        ((ec[]) this.c)[i] = ecVar;
        ecVar.f = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ea3
    public byte[] c(int i, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrC0;
        byte[] bArrB;
        int i2 = 12;
        Object[] objArr = 0;
        switch (this.a) {
            case 10:
                yy2 yy2Var = (yy2) this.c;
                if (bArr2.length < i) {
                    tv2.f("ciphertext too short");
                    return null;
                }
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, i, bArr2.length);
                byte[] bArrCopyOf = Arrays.copyOf(bArr, yy2Var.a);
                int i3 = yy2Var.a;
                byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, i3, yy2Var.b + i3);
                ep1 ep1Var = new ep1(i2, (boolean) (objArr == true ? 1 : 0));
                ep1Var.c = null;
                ep1Var.d = null;
                ep1Var.e = null;
                ep1Var.b = yy2Var;
                ep1Var.c = new ox1(tr3.a(bArrCopyOf));
                ep1Var.d = new ox1(tr3.a(bArrCopyOfRange2));
                return xq3.a(ep1Var.C()).g(bArrCopyOfRange, dw0.e);
            default:
                if (bArr2.length < i) {
                    tv2.f("ciphertext too short");
                    return null;
                }
                byte[] bArrCopyOfRange3 = Arrays.copyOfRange(bArr2, i, bArr2.length);
                u23 u23Var = new u23(1);
                u23Var.c = null;
                u23Var.d = null;
                u23Var.b = (r73) this.c;
                u23Var.c = new ox1(tr3.a(bArr));
                k73 k73VarE = u23Var.e();
                oq3 oq3Var = new oq3(((tr3) k73VarE.g.a).b(), k73VarE.h);
                byte[][] bArr3 = {dw0.e};
                int length = bArrCopyOfRange3.length;
                byte[] bArr4 = oq3Var.c;
                if (length < bArr4.length + 16) {
                    tv2.f("Ciphertext too short.");
                    return null;
                }
                if (!kg3.b(bArr4, bArrCopyOfRange3)) {
                    tv2.f("Decryption failed (OutputPrefix mismatch).");
                    return null;
                }
                Cipher cipher = (Cipher) oq3.f.get();
                byte[] bArrCopyOfRange4 = Arrays.copyOfRange(bArrCopyOfRange3, bArr4.length, bArr4.length + 16);
                byte[] bArr5 = (byte[]) bArrCopyOfRange4.clone();
                bArr5[8] = (byte) (bArr5[8] & 127);
                bArr5[12] = (byte) (bArr5[12] & 127);
                cipher.init(2, new SecretKeySpec(oq3Var.b, "AES"), new IvParameterSpec(bArr5));
                int length2 = bArr4.length + 16;
                int length3 = bArrCopyOfRange3.length - length2;
                byte[] bArrDoFinal = cipher.doFinal(bArrCopyOfRange3, length2, length3);
                if (length3 == 0 && bArrDoFinal == null && "The Android Project".equals(System.getProperty("java.vendor"))) {
                    bArrDoFinal = new byte[0];
                }
                byte[][] bArr6 = (byte[][]) Arrays.copyOf(bArr3, 2);
                bArr6[1] = bArrDoFinal;
                int length4 = bArr6.length;
                uh3 uh3Var = oq3Var.a;
                if (length4 == 0) {
                    bArrB = uh3Var.b(oq3.e, 16);
                } else {
                    byte[] bArrB2 = uh3Var.b(oq3.d, 16);
                    for (int i4 = 0; i4 < bArr6.length - 1; i4++) {
                        byte[] bArr7 = bArr6[i4];
                        if (bArr7 == null) {
                            bArr7 = new byte[0];
                        }
                        bArrB2 = nj2.c0(zi0.G(bArrB2), uh3Var.b(bArr7, 16));
                    }
                    byte[] bArr8 = bArr6[bArr6.length - 1];
                    if (bArr8.length >= 16) {
                        if (bArr8.length < bArrB2.length) {
                            e.g("xorEnd requires a.length >= b.length");
                            return null;
                        }
                        int length5 = bArr8.length - bArrB2.length;
                        bArrC0 = Arrays.copyOf(bArr8, bArr8.length);
                        for (int i5 = 0; i5 < bArrB2.length; i5++) {
                            int i6 = length5 + i5;
                            bArrC0[i6] = (byte) (bArrC0[i6] ^ bArrB2[i5]);
                        }
                    } else {
                        if (bArr8.length >= 16) {
                            e.g("x must be smaller than a block.");
                            return null;
                        }
                        byte[] bArrCopyOf2 = Arrays.copyOf(bArr8, 16);
                        bArrCopyOf2[bArr8.length] = -128;
                        bArrC0 = nj2.c0(bArrCopyOf2, zi0.G(bArrB2));
                    }
                    bArrB = uh3Var.b(bArrC0, 16);
                }
                if (MessageDigest.isEqual(bArrCopyOfRange4, bArrB)) {
                    return bArrDoFinal;
                }
                throw new AEADBadTagException("Integrity check failed.");
        }
    }

    @Override // defpackage.ac
    public /* synthetic */ ListenableFuture call() {
        return ((qp0) this.c).B(this.b);
    }

    public void d(ec ecVar) {
        ec ecVar2;
        int i = ecVar.f;
        if (i == -1) {
            e.g("Failed requirement.");
            return;
        }
        int i2 = this.b;
        ec ecVar3 = ((ec[]) this.c)[i2];
        ecVar3.getClass();
        ecVar.f = -1;
        ((ec[]) this.c)[i2] = null;
        this.b = i2 - 1;
        if (ecVar == ecVar3) {
            return;
        }
        int iCompare = Intrinsics.compare(0L, ecVar3.g - ecVar.g);
        if (iCompare == 0) {
            ((ec[]) this.c)[i] = ecVar3;
            ecVar3.f = i;
            return;
        }
        if (iCompare >= 0) {
            b(i, ecVar3);
            return;
        }
        while (true) {
            int i3 = i << 1;
            int i4 = i3 + 1;
            int i5 = this.b;
            if (i4 > i5) {
                if (i3 > i5) {
                    break;
                }
                ecVar2 = ((ec[]) this.c)[i3];
                ecVar2.getClass();
            } else {
                ecVar2 = ((ec[]) this.c)[i3];
                ecVar2.getClass();
                ec ecVar4 = ((ec[]) this.c)[i4];
                ecVar4.getClass();
                if (Intrinsics.compare(0L, ecVar4.g - ecVar2.g) >= 0) {
                    ecVar2 = ecVar4;
                }
            }
            if (Intrinsics.compare(0L, ecVar2.g - ecVar3.g) <= 0) {
                break;
            }
            int i6 = ecVar2.f;
            ecVar2.f = i;
            ((ec[]) this.c)[i] = ecVar2;
            i = i6;
        }
        ((ec[]) this.c)[i] = ecVar3;
        ecVar3.f = i;
    }

    @Override // defpackage.bj1
    public pi1 f(pi1 pi1Var, da1 da1Var) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) pi1Var.get()).compress((Bitmap.CompressFormat) this.c, this.b, byteArrayOutputStream);
        pi1Var.e();
        return new u6(byteArrayOutputStream.toByteArray());
    }

    @Override // defpackage.h3
    public boolean l(View view) {
        ((BottomSheetBehavior) this.c).C(this.b);
        return true;
    }

    public String toString() {
        String str;
        switch (this.a) {
            case oc1.BYTES_FIELD_NUMBER /* 8 */:
                StringBuilder sb = new StringBuilder("SendMessageResponse{receiverId='");
                sb.append((String) this.c);
                sb.append("', status='");
                int i = this.b;
                if (i != 1) {
                    str = i != 2 ? "null" : "DISCARDED";
                } else {
                    str = "OK";
                }
                sb.append(str);
                sb.append("'}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // defpackage.ea3
    public int zza() {
        switch (this.a) {
            case 10:
                break;
        }
        return this.b;
    }

    public /* synthetic */ f6(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }

    public f6(yy2 yy2Var) {
        this.a = 10;
        this.c = yy2Var;
        this.b = yy2Var.a + yy2Var.b;
    }

    public f6(r73 r73Var) {
        this.a = 11;
        this.c = r73Var;
        this.b = r73Var.a;
    }

    public /* synthetic */ f6(char c, int i) {
        this.a = i;
    }

    public f6(int i) {
        this.a = 1;
        this.c = new byte[i];
        this.b = 0;
    }

    public f6(int i, u61[] u61VarArr) {
        this.a = 9;
        this.b = i;
        this.c = u61VarArr;
    }

    public f6(Context context) {
        this.a = 0;
        int iF = g6.f(context, 0);
        this.c = new b6(new ContextThemeWrapper(context, g6.f(context, iF)));
        this.b = iF;
    }

    public f6(ArrayList arrayList) {
        this.a = 6;
        this.b = 0;
        this.c = arrayList;
    }
}
