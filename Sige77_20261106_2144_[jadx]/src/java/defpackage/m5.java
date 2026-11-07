package defpackage;

import androidx.activity.result.a;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class m5 extends l5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ j5 c;
    public final /* synthetic */ a d;

    public /* synthetic */ m5(a aVar, String str, j5 j5Var, int i) {
        this.a = i;
        this.d = aVar;
        this.b = str;
        this.c = j5Var;
    }

    @Override // defpackage.l5
    public final void a(Object obj) throws Exception {
        int i = this.a;
        String str = this.b;
        a aVar = this.d;
        j5 j5Var = this.c;
        switch (i) {
            case 0:
                Integer num = (Integer) aVar.b.get(str);
                if (num == null) {
                    sm0.k("Attempting to launch an unregistered ActivityResultLauncher with contract ", j5Var, " and input ", obj, ". You must ensure the ActivityResultLauncher is registered before calling launch().");
                    return;
                }
                aVar.d.add(str);
                try {
                    aVar.b(num.intValue(), j5Var, obj);
                    return;
                } catch (Exception e) {
                    aVar.d.remove(str);
                    throw e;
                }
            default:
                Integer num2 = (Integer) aVar.b.get(str);
                if (num2 == null) {
                    sm0.k("Attempting to launch an unregistered ActivityResultLauncher with contract ", j5Var, " and input ", obj, ". You must ensure the ActivityResultLauncher is registered before calling launch().");
                    return;
                }
                aVar.d.add(str);
                try {
                    aVar.b(num2.intValue(), j5Var, obj);
                    return;
                } catch (Exception e2) {
                    aVar.d.remove(str);
                    throw e2;
                }
        }
    }

    public void b() {
        this.d.f(this.b);
    }
}
