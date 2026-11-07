package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class aq3 {
    public static final wp3 f;
    public static final wp3 h;
    public static final pq3 a = new pq3("cause", Throwable.class, false, false);
    public static final pq3 b = new pq3("ratelimit_count", Integer.class, false, false);
    public static final pq3 c = new pq3("sampling_count", Integer.class, false, false);
    public static final pq3 d = new pq3("ratelimit_period", dw0.class, false, false);
    public static final pq3 e = new pq3("skipped", Integer.class, false, false);
    public static final pq3 g = new pq3("forced", Boolean.class, false, false);
    public static final pq3 i = new pq3("stack_size", br3.class, false, false);

    static {
        boolean z = true;
        f = new wp3("group_by", Object.class, z, z, 0);
        h = new wp3("tags", ek2.class, false, z, 1);
    }
}
