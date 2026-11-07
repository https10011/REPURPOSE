package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class nc0 extends Exception {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nc0(String str, int i) {
        super(str);
        this.a = i;
        switch (i) {
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                super(str);
                break;
            default:
                gu2.m(str, "Detail message must not be empty");
                break;
        }
    }

    @Override // java.lang.Throwable
    public synchronized Throwable fillInStackTrace() {
        switch (this.a) {
            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                synchronized (this) {
                    setStackTrace(new StackTraceElement[0]);
                }
                return this;
            default:
                return super.fillInStackTrace();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nc0(String str, Throwable th) {
        super(str, th);
        this.a = 6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nc0(Throwable th) {
        super(th);
        this.a = 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nc0(String str, String str2) {
        super(str2 != null ? str2.toString() : null);
        this.a = 3;
    }
}
