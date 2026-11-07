package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class sy0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vy0 b;

    public /* synthetic */ sy0(vy0 vy0Var, int i) {
        this.a = i;
        this.b = vy0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        vy0 vy0Var = this.b;
        switch (i) {
            case 0:
                o30 o30Var = vy0Var.c;
                if (o30Var != null) {
                    o30Var.setListSelectionHidden(true);
                    o30Var.requestLayout();
                }
                break;
            default:
                o30 o30Var2 = vy0Var.c;
                if (o30Var2 != null && o30Var2.isAttachedToWindow() && vy0Var.c.getCount() > vy0Var.c.getChildCount() && vy0Var.c.getChildCount() <= vy0Var.Z) {
                    vy0Var.m0.setInputMethodMode(2);
                    vy0Var.c();
                    break;
                }
                break;
        }
    }
}
