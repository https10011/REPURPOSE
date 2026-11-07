package defpackage;

import com.wang.avi.AVLoadingIndicatorView;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class s implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AVLoadingIndicatorView b;

    public /* synthetic */ s(AVLoadingIndicatorView aVLoadingIndicatorView, int i) {
        this.a = i;
        this.b = aVLoadingIndicatorView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        AVLoadingIndicatorView aVLoadingIndicatorView = this.b;
        switch (i) {
            case 0:
                ue ueVar = AVLoadingIndicatorView.W;
                aVLoadingIndicatorView.setVisibility(8);
                break;
            default:
                ue ueVar2 = AVLoadingIndicatorView.W;
                System.currentTimeMillis();
                aVLoadingIndicatorView.setVisibility(0);
                break;
        }
    }
}
