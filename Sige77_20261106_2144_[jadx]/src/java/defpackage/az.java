package defpackage;

import android.content.Context;
import android.os.UserManager;
import com.google.android.gms.tasks.Tasks;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class az implements wl0, xl0 {
    public final wv0 a;
    public final Context b;
    public final zd1 c;
    public final Set d;
    public final Executor e;

    public az(Context context, String str, Set set, zd1 zd1Var, Executor executor) {
        this.a = new wv0(new pq(1, context, str));
        this.d = set;
        this.e = executor;
        this.c = zd1Var;
        this.b = context;
    }

    public final void a() {
        if (this.d.size() <= 0) {
            Tasks.forResult((Object) null);
        } else if (!((UserManager) this.b.getSystemService(UserManager.class)).isUserUnlocked()) {
            Tasks.forResult((Object) null);
        } else {
            Tasks.call(this.e, new zy(this, 1));
        }
    }
}
