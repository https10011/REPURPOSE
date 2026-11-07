package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class cc2 {
    public static final b81 a;

    static {
        kk0 kk0Var = new kk0();
        kk0Var.b("Athena");
        kk0Var.c = false;
        a = new b81(kk0Var);
    }

    public static void a(String str) {
        if (str == null || str.length() == 0) {
            str = "%s";
        }
        b81 b81Var = a;
        b81Var.b = 1;
        b81Var.a(str);
    }

    public static void b(String str, Object... objArr) {
        if (objArr.length != 0) {
            str = String.format(str, objArr);
        }
        b81 b81Var = a;
        b81Var.b = 1;
        b81Var.a(str);
    }

    public static void c(String str) {
        if (str == null || str.length() == 0) {
            str = "%s";
        }
        b81 b81Var = a;
        b81Var.b = 1;
        b81Var.b(str);
    }

    public static void d(String str, Object... objArr) {
        if (objArr.length != 0) {
            str = String.format(str, objArr);
        }
        b81 b81Var = a;
        b81Var.b = 1;
        b81Var.b(str);
    }

    public static void e(String str) {
        if (str.length() == 0) {
            str = "%s";
        }
        b81 b81Var = a;
        b81Var.b = 1;
        b81Var.c(str);
    }

    public static void f(String str, Object... objArr) {
        if (objArr.length != 0) {
            str = String.format(str, objArr);
        }
        b81 b81Var = a;
        b81Var.b = 1;
        b81Var.c(str);
    }
}
