package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class xe extends er {
    public ye W;
    public int v;
    public int w;

    public boolean getAllowsGoneWidget() {
        return this.W.s0;
    }

    public int getMargin() {
        return this.W.t0;
    }

    public int getType() {
        return this.v;
    }

    @Override // defpackage.er
    public final void h(qr qrVar, boolean z) {
        int i = this.v;
        this.w = i;
        if (z) {
            if (i == 5) {
                this.w = 1;
            } else if (i == 6) {
                this.w = 0;
            }
        } else if (i == 5) {
            this.w = 0;
        } else if (i == 6) {
            this.w = 1;
        }
        if (qrVar instanceof ye) {
            ((ye) qrVar).r0 = this.w;
        }
    }

    public void setAllowsGoneWidget(boolean z) {
        this.W.s0 = z;
    }

    public void setDpMargin(int i) {
        this.W.t0 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.W.t0 = i;
    }

    public void setType(int i) {
        this.v = i;
    }
}
