package defpackage;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class wz extends h8 {
    public final boolean c;
    public boolean d;
    public hs1 e;

    public wz(ms1 ms1Var, rk rkVar, boolean z) {
        super(ms1Var, rkVar);
        this.c = z;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x002a  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e8 A[Catch: RuntimeException -> 0x00ee, TRY_LEAVE, TryCatch #1 {RuntimeException -> 0x00ee, blocks: (B:78:0x00e2, B:80:0x00e8), top: B:91:0x00e2 }] */
    public final hs1 u(Context context) {
        int i;
        hs1 hs1Var;
        Animator animatorLoadAnimator;
        int iD;
        context.getClass();
        if (this.d) {
            return this.e;
        }
        ms1 ms1Var = (ms1) this.a;
        Fragment fragment = ms1Var.c;
        boolean z = ms1Var.a == 2;
        tf0 tf0Var = fragment.w0;
        int i2 = tf0Var == null ? 0 : tf0Var.f;
        if (this.c) {
            if (z) {
                if (tf0Var == null) {
                    i = 0;
                } else {
                    i = tf0Var.d;
                }
            } else if (tf0Var == null) {
                i = 0;
            } else {
                i = tf0Var.e;
            }
        } else if (z) {
            if (tf0Var == null) {
                i = 0;
            } else {
                i = tf0Var.b;
            }
        } else if (tf0Var == null) {
            i = 0;
        } else {
            i = tf0Var.c;
        }
        fragment.L(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.s0;
        hs1 hs1Var2 = null;
        if (viewGroup != null && viewGroup.getTag(2131296858) != null) {
            fragment.s0.setTag(2131296858, null);
        }
        ViewGroup viewGroup2 = fragment.s0;
        if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
            if (i == 0 && i2 != 0) {
                if (i2 == 4097) {
                    iD = z ? 2130837513 : 2130837514;
                } else if (i2 == 8194) {
                    iD = z ? 2130837509 : 2130837510;
                } else if (i2 == 8197) {
                    iD = z ? ye1.D(context, R.attr.activityCloseEnterAnimation) : ye1.D(context, R.attr.activityCloseExitAnimation);
                } else if (i2 == 4099) {
                    iD = z ? 2130837511 : 2130837512;
                } else if (i2 != 4100) {
                    iD = -1;
                } else {
                    iD = z ? ye1.D(context, R.attr.activityOpenEnterAnimation) : ye1.D(context, R.attr.activityOpenExitAnimation);
                }
                i = iD;
            }
            if (i != 0) {
                boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(i));
                if (zEquals) {
                    try {
                        Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, i);
                        if (animationLoadAnimation != null) {
                            hs1Var = new hs1(animationLoadAnimation);
                            hs1Var2 = hs1Var;
                        }
                    } catch (Resources.NotFoundException e) {
                        throw e;
                    } catch (RuntimeException unused) {
                        try {
                            animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i);
                            if (animatorLoadAnimator != null) {
                                hs1Var = new hs1(animatorLoadAnimator);
                                hs1Var2 = hs1Var;
                            }
                        } catch (RuntimeException e2) {
                            if (zEquals) {
                                throw e2;
                            }
                            Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, i);
                            if (animationLoadAnimation2 != null) {
                                hs1Var2 = new hs1(animationLoadAnimation2);
                            }
                        }
                    }
                } else {
                    animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i);
                    if (animatorLoadAnimator != null) {
                        hs1Var = new hs1(animatorLoadAnimator);
                        hs1Var2 = hs1Var;
                    }
                }
            }
        }
        this.e = hs1Var2;
        this.d = true;
        return hs1Var2;
    }
}
