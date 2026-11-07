package defpackage;

import android.view.ViewGroup;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class gr extends ViewGroup.MarginLayoutParams {
    public int A;
    public int B;
    public int C;
    public float D;
    public float E;
    public String F;
    public float G;
    public float H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public float Q;
    public float R;
    public int S;
    public int T;
    public int U;
    public boolean V;
    public boolean W;
    public String X;
    public int Y;
    public boolean Z;
    public int a;
    public boolean a0;
    public int b;
    public boolean b0;
    public float c;
    public boolean c0;
    public int d;
    public boolean d0;
    public int e;
    public int e0;
    public int f;
    public int f0;
    public int g;
    public int g0;
    public int h;
    public int h0;
    public int i;
    public int i0;
    public int j;
    public int j0;
    public int k;
    public float k0;
    public int l;
    public int l0;
    public int m;
    public int m0;
    public int n;
    public float n0;
    public int o;
    public qr o0;
    public int p;
    public float q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;

    public final void a() {
        this.c0 = false;
        this.Z = true;
        this.a0 = true;
        int i = ((ViewGroup.MarginLayoutParams) this).width;
        if (i == -2 && this.V) {
            this.Z = false;
            if (this.K == 0) {
                this.K = 1;
            }
        }
        int i2 = ((ViewGroup.MarginLayoutParams) this).height;
        if (i2 == -2 && this.W) {
            this.a0 = false;
            if (this.L == 0) {
                this.L = 1;
            }
        }
        if (i == 0 || i == -1) {
            this.Z = false;
            if (i == 0 && this.K == 1) {
                ((ViewGroup.MarginLayoutParams) this).width = -2;
                this.V = true;
            }
        }
        if (i2 == 0 || i2 == -1) {
            this.a0 = false;
            if (i2 == 0 && this.L == 1) {
                ((ViewGroup.MarginLayoutParams) this).height = -2;
                this.W = true;
            }
        }
        if (this.c == -1.0f && this.a == -1 && this.b == -1) {
            return;
        }
        this.c0 = true;
        this.Z = true;
        this.a0 = true;
        if (!(this.o0 instanceof cl0)) {
            this.o0 = new cl0();
        }
        ((cl0) this.o0).N(this.U);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004a  */
    /* JADX WARN: Code duplicated, block: B:19:0x0051  */
    /* JADX WARN: Code duplicated, block: B:22:0x0058  */
    /* JADX WARN: Code duplicated, block: B:25:0x005e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0064  */
    /* JADX WARN: Code duplicated, block: B:35:0x0076  */
    /* JADX WARN: Code duplicated, block: B:36:0x007e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x0080  */
    /* JADX WARN: Code duplicated, block: B:38:0x0087 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x0089  */
    @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
    public final void resolveLayoutDirection(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
        int i7 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
        super.resolveLayoutDirection(i);
        boolean z = false;
        boolean z2 = 1 == getLayoutDirection();
        this.g0 = -1;
        this.h0 = -1;
        this.e0 = -1;
        this.f0 = -1;
        this.i0 = this.v;
        this.j0 = this.x;
        float f = this.D;
        this.k0 = f;
        int i8 = this.a;
        this.l0 = i8;
        int i9 = this.b;
        this.m0 = i9;
        float f2 = this.c;
        this.n0 = f2;
        int i10 = this.r;
        if (z2) {
            if (i10 != -1) {
                this.g0 = i10;
            } else {
                int i11 = this.s;
                if (i11 != -1) {
                    this.h0 = i11;
                } else {
                    i2 = this.t;
                    if (i2 != -1) {
                        this.f0 = i2;
                        z = true;
                    }
                    i3 = this.u;
                    if (i3 != -1) {
                        this.e0 = i3;
                        z = true;
                    }
                    i4 = this.z;
                    if (i4 != Integer.MIN_VALUE) {
                        this.j0 = i4;
                    }
                    i5 = this.A;
                    if (i5 != Integer.MIN_VALUE) {
                        this.i0 = i5;
                    }
                    if (z) {
                        this.k0 = 1.0f - f;
                    }
                    if (this.c0 && this.U == 1) {
                        if (f2 != -1.0f) {
                            this.n0 = 1.0f - f2;
                            this.l0 = -1;
                            this.m0 = -1;
                        } else if (i8 != -1) {
                            this.m0 = i8;
                            this.l0 = -1;
                            this.n0 = -1.0f;
                        } else if (i9 != -1) {
                            this.l0 = i9;
                            this.m0 = -1;
                            this.n0 = -1.0f;
                        }
                    }
                }
            }
            z = true;
            i2 = this.t;
            if (i2 != -1) {
                this.f0 = i2;
                z = true;
            }
            i3 = this.u;
            if (i3 != -1) {
                this.e0 = i3;
                z = true;
            }
            i4 = this.z;
            if (i4 != Integer.MIN_VALUE) {
                this.j0 = i4;
            }
            i5 = this.A;
            if (i5 != Integer.MIN_VALUE) {
                this.i0 = i5;
            }
            if (z) {
                this.k0 = 1.0f - f;
            }
            if (this.c0) {
                if (f2 != -1.0f) {
                    this.n0 = 1.0f - f2;
                    this.l0 = -1;
                    this.m0 = -1;
                } else if (i8 != -1) {
                    this.m0 = i8;
                    this.l0 = -1;
                    this.n0 = -1.0f;
                } else if (i9 != -1) {
                    this.l0 = i9;
                    this.m0 = -1;
                    this.n0 = -1.0f;
                }
            }
        } else {
            if (i10 != -1) {
                this.f0 = i10;
            }
            int i12 = this.s;
            if (i12 != -1) {
                this.e0 = i12;
            }
            int i13 = this.t;
            if (i13 != -1) {
                this.g0 = i13;
            }
            int i14 = this.u;
            if (i14 != -1) {
                this.h0 = i14;
            }
            int i15 = this.z;
            if (i15 != Integer.MIN_VALUE) {
                this.i0 = i15;
            }
            int i16 = this.A;
            if (i16 != Integer.MIN_VALUE) {
                this.j0 = i16;
            }
        }
        if (this.t == -1 && this.u == -1 && this.s == -1 && i10 == -1) {
            int i17 = this.f;
            if (i17 != -1) {
                this.g0 = i17;
                if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                    ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                }
            } else {
                int i18 = this.g;
                if (i18 != -1) {
                    this.h0 = i18;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                    }
                }
            }
            int i19 = this.d;
            if (i19 != -1) {
                this.e0 = i19;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
                return;
            }
            int i20 = this.e;
            if (i20 != -1) {
                this.f0 = i20;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
            }
        }
    }
}
