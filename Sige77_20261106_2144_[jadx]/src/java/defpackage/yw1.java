package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class yw1 extends qh1 {
    public final /* synthetic */ int X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yw1(int i) {
        super(4);
        this.X = i;
    }

    @Override // defpackage.qh1, defpackage.f60
    public void i(i60 i60Var) {
        switch (this.X) {
            case 1:
                StringBuilder sb = new StringBuilder();
                while (i60Var.b()) {
                    char cA = i60Var.a();
                    i60Var.d++;
                    n(cA, sb);
                    if (sb.length() % 3 == 0) {
                        qh1.u(i60Var, sb);
                        if (ga.u(i60Var.a, i60Var.d, 3) != 3) {
                            i60Var.e = 0;
                            r(i60Var, sb);
                            break;
                        }
                    }
                }
                r(i60Var, sb);
                break;
            default:
                super.i(i60Var);
                break;
        }
    }

    @Override // defpackage.qh1
    public final int n(char c, StringBuilder sb) {
        switch (this.X) {
            case 0:
                if (c == ' ') {
                    sb.append((char) 3);
                } else if (c >= '0' && c <= '9') {
                    sb.append((char) (c - ','));
                } else {
                    if (c < 'a' || c > 'z') {
                        if (c < ' ') {
                            sb.append((char) 0);
                            sb.append(c);
                            return 2;
                        }
                        if (c >= '!' && c <= '/') {
                            sb.append((char) 1);
                            sb.append((char) (c - '!'));
                            return 2;
                        }
                        if (c >= ':' && c <= '@') {
                            sb.append((char) 1);
                            sb.append((char) (c - '+'));
                            return 2;
                        }
                        if (c >= '[' && c <= '_') {
                            sb.append((char) 1);
                            sb.append((char) (c - 'E'));
                            return 2;
                        }
                        if (c == '`') {
                            sb.append((char) 2);
                            sb.append((char) (c - '`'));
                            return 2;
                        }
                        if (c >= 'A' && c <= 'Z') {
                            sb.append((char) 2);
                            sb.append((char) (c - '@'));
                            return 2;
                        }
                        if (c < '{' || c > 127) {
                            sb.append("\u0001\u001e");
                            return 2 + n((char) (c - 128), sb);
                        }
                        sb.append((char) 2);
                        sb.append((char) (c - '`'));
                        return 2;
                    }
                    sb.append((char) (c - 'S'));
                }
                return 1;
            default:
                if (c == '\r') {
                    sb.append((char) 0);
                } else if (c == ' ') {
                    sb.append((char) 3);
                } else if (c == '*') {
                    sb.append((char) 1);
                } else if (c == '>') {
                    sb.append((char) 2);
                } else if (c >= '0' && c <= '9') {
                    sb.append((char) (c - ','));
                } else {
                    if (c < 'A' || c > 'Z') {
                        ga.m(c);
                        throw null;
                    }
                    sb.append((char) (c - '3'));
                }
                return 1;
        }
    }

    @Override // defpackage.qh1
    public final int o() {
        switch (this.X) {
            case 0:
                return 2;
            default:
                return 3;
        }
    }

    @Override // defpackage.qh1
    public void r(i60 i60Var, StringBuilder sb) {
        switch (this.X) {
            case 1:
                StringBuilder sb2 = i60Var.c;
                i60Var.c(sb2.length());
                int length = i60Var.f.b - sb2.length();
                i60Var.d -= sb.length();
                String str = i60Var.a;
                if ((str.length() - i60Var.g) - i60Var.d > 1 || length > 1 || (str.length() - i60Var.g) - i60Var.d != length) {
                    i60Var.d((char) 254);
                }
                if (i60Var.e < 0) {
                    i60Var.e = 0;
                }
                break;
            default:
                super.r(i60Var, sb);
                break;
        }
    }
}
