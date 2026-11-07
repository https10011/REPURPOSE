package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class lr {
    public static final SparseIntArray o0;
    public float A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public float S;
    public float T;
    public int U;
    public int V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public boolean a;
    public int a0;
    public int b;
    public int b0;
    public int c;
    public float c0;
    public int d;
    public float d0;
    public int e;
    public int e0;
    public float f;
    public int f0;
    public int g;
    public int g0;
    public int h;
    public int[] h0;
    public int i;
    public String i0;
    public int j;
    public String j0;
    public int k;
    public boolean k0;
    public int l;
    public boolean l0;
    public int m;
    public boolean m0;
    public int n;
    public int n0;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public float v;
    public float w;
    public String x;
    public int y;
    public int z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        o0 = sparseIntArray;
        sparseIntArray.append(42, 24);
        sparseIntArray.append(43, 25);
        sparseIntArray.append(45, 28);
        sparseIntArray.append(46, 29);
        sparseIntArray.append(51, 35);
        sparseIntArray.append(50, 34);
        sparseIntArray.append(23, 4);
        sparseIntArray.append(22, 3);
        sparseIntArray.append(18, 1);
        sparseIntArray.append(60, 6);
        sparseIntArray.append(61, 7);
        sparseIntArray.append(30, 17);
        sparseIntArray.append(31, 18);
        sparseIntArray.append(32, 19);
        sparseIntArray.append(0, 26);
        sparseIntArray.append(47, 31);
        sparseIntArray.append(48, 32);
        sparseIntArray.append(29, 10);
        sparseIntArray.append(28, 9);
        sparseIntArray.append(65, 13);
        sparseIntArray.append(68, 16);
        sparseIntArray.append(66, 14);
        sparseIntArray.append(63, 11);
        sparseIntArray.append(67, 15);
        sparseIntArray.append(64, 12);
        sparseIntArray.append(54, 38);
        sparseIntArray.append(40, 37);
        sparseIntArray.append(39, 39);
        sparseIntArray.append(53, 40);
        sparseIntArray.append(38, 20);
        sparseIntArray.append(52, 36);
        sparseIntArray.append(27, 5);
        sparseIntArray.append(41, 76);
        sparseIntArray.append(49, 76);
        sparseIntArray.append(44, 76);
        sparseIntArray.append(21, 76);
        sparseIntArray.append(17, 76);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(5, 27);
        sparseIntArray.append(7, 30);
        sparseIntArray.append(8, 8);
        sparseIntArray.append(4, 33);
        sparseIntArray.append(6, 2);
        sparseIntArray.append(1, 22);
        sparseIntArray.append(2, 21);
        sparseIntArray.append(55, 41);
        sparseIntArray.append(33, 42);
        sparseIntArray.append(16, 41);
        sparseIntArray.append(15, 42);
        sparseIntArray.append(70, 97);
        sparseIntArray.append(24, 61);
        sparseIntArray.append(26, 62);
        sparseIntArray.append(25, 63);
        sparseIntArray.append(59, 69);
        sparseIntArray.append(37, 70);
        sparseIntArray.append(12, 71);
        sparseIntArray.append(10, 72);
        sparseIntArray.append(11, 73);
        sparseIntArray.append(13, 74);
        sparseIntArray.append(9, 75);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, pe1.e);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            SparseIntArray sparseIntArray = o0;
            int i2 = sparseIntArray.get(index);
            if (i2 == 80) {
                this.k0 = typedArrayObtainStyledAttributes.getBoolean(index, this.k0);
            } else if (i2 == 81) {
                this.l0 = typedArrayObtainStyledAttributes.getBoolean(index, this.l0);
            } else if (i2 != 97) {
                switch (i2) {
                    case 1:
                        this.o = pr.f(typedArrayObtainStyledAttributes, index, this.o);
                        break;
                    case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                        this.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.H);
                        break;
                    case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                        this.n = pr.f(typedArrayObtainStyledAttributes, index, this.n);
                        break;
                    case oc1.LONG_FIELD_NUMBER /* 4 */:
                        this.m = pr.f(typedArrayObtainStyledAttributes, index, this.m);
                        break;
                    case oc1.STRING_FIELD_NUMBER /* 5 */:
                        this.x = typedArrayObtainStyledAttributes.getString(index);
                        break;
                    case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                        this.B = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.B);
                        break;
                    case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                        this.C = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.C);
                        break;
                    case oc1.BYTES_FIELD_NUMBER /* 8 */:
                        this.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.I);
                        break;
                    case 9:
                        this.u = pr.f(typedArrayObtainStyledAttributes, index, this.u);
                        break;
                    case 10:
                        this.t = pr.f(typedArrayObtainStyledAttributes, index, this.t);
                        break;
                    case 11:
                        this.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.O);
                        break;
                    case 12:
                        this.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.P);
                        break;
                    case 13:
                        this.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.L);
                        break;
                    case 14:
                        this.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.N);
                        break;
                    case 15:
                        this.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                        break;
                    case 16:
                        this.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.M);
                        break;
                    case 17:
                        this.d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.d);
                        break;
                    case 18:
                        this.e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.e);
                        break;
                    case 19:
                        this.f = typedArrayObtainStyledAttributes.getFloat(index, this.f);
                        break;
                    case 20:
                        this.v = typedArrayObtainStyledAttributes.getFloat(index, this.v);
                        break;
                    case 21:
                        this.c = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.c);
                        break;
                    case 22:
                        this.b = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.b);
                        break;
                    case 23:
                        this.E = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.E);
                        break;
                    case 24:
                        this.g = pr.f(typedArrayObtainStyledAttributes, index, this.g);
                        break;
                    case 25:
                        this.h = pr.f(typedArrayObtainStyledAttributes, index, this.h);
                        break;
                    case 26:
                        this.D = typedArrayObtainStyledAttributes.getInt(index, this.D);
                        break;
                    case 27:
                        this.F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.F);
                        break;
                    case 28:
                        this.i = pr.f(typedArrayObtainStyledAttributes, index, this.i);
                        break;
                    case 29:
                        this.j = pr.f(typedArrayObtainStyledAttributes, index, this.j);
                        break;
                    case 30:
                        this.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.J);
                        break;
                    case 31:
                        this.r = pr.f(typedArrayObtainStyledAttributes, index, this.r);
                        break;
                    case 32:
                        this.s = pr.f(typedArrayObtainStyledAttributes, index, this.s);
                        break;
                    case 33:
                        this.G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.G);
                        break;
                    case 34:
                        this.l = pr.f(typedArrayObtainStyledAttributes, index, this.l);
                        break;
                    case 35:
                        this.k = pr.f(typedArrayObtainStyledAttributes, index, this.k);
                        break;
                    case 36:
                        this.w = typedArrayObtainStyledAttributes.getFloat(index, this.w);
                        break;
                    case 37:
                        this.T = typedArrayObtainStyledAttributes.getFloat(index, this.T);
                        break;
                    case 38:
                        this.S = typedArrayObtainStyledAttributes.getFloat(index, this.S);
                        break;
                    case 39:
                        this.U = typedArrayObtainStyledAttributes.getInt(index, this.U);
                        break;
                    case 40:
                        this.V = typedArrayObtainStyledAttributes.getInt(index, this.V);
                        break;
                    case 41:
                        pr.g(this, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case 42:
                        pr.g(this, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i2) {
                            case 54:
                                this.W = typedArrayObtainStyledAttributes.getInt(index, this.W);
                                break;
                            case 55:
                                this.X = typedArrayObtainStyledAttributes.getInt(index, this.X);
                                break;
                            case 56:
                                this.Y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.Y);
                                break;
                            case 57:
                                this.Z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.Z);
                                break;
                            case 58:
                                this.a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.a0);
                                break;
                            case 59:
                                this.b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.b0);
                                break;
                            default:
                                switch (i2) {
                                    case 61:
                                        this.y = pr.f(typedArrayObtainStyledAttributes, index, this.y);
                                        break;
                                    case 62:
                                        this.z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.z);
                                        break;
                                    case 63:
                                        this.A = typedArrayObtainStyledAttributes.getFloat(index, this.A);
                                        break;
                                    default:
                                        switch (i2) {
                                            case 69:
                                                this.c0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                                break;
                                            case 70:
                                                this.d0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                                break;
                                            case 71:
                                                Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                                break;
                                            case 72:
                                                this.e0 = typedArrayObtainStyledAttributes.getInt(index, this.e0);
                                                break;
                                            case 73:
                                                this.f0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f0);
                                                break;
                                            case 74:
                                                this.i0 = typedArrayObtainStyledAttributes.getString(index);
                                                break;
                                            case 75:
                                                this.m0 = typedArrayObtainStyledAttributes.getBoolean(index, this.m0);
                                                break;
                                            case 76:
                                                Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                                                break;
                                            case 77:
                                                this.j0 = typedArrayObtainStyledAttributes.getString(index);
                                                break;
                                            default:
                                                switch (i2) {
                                                    case 91:
                                                        this.p = pr.f(typedArrayObtainStyledAttributes, index, this.p);
                                                        break;
                                                    case 92:
                                                        this.q = pr.f(typedArrayObtainStyledAttributes, index, this.q);
                                                        break;
                                                    case 93:
                                                        this.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.K);
                                                        break;
                                                    case 94:
                                                        this.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.R);
                                                        break;
                                                    default:
                                                        Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                                                        break;
                                                }
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                        break;
                }
            } else {
                this.n0 = typedArrayObtainStyledAttributes.getInt(index, this.n0);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
