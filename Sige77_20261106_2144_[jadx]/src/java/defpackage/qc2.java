package defpackage;

import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class qc2 {
    public final long a;
    public final String b;
    public final ArrayList c;
    public final long d;
    public final long e;
    public final int f;
    public final int g;
    public final boolean h;

    public qc2(long j, String str, ArrayList arrayList, long j2, long j3, int i, int i2, boolean z) {
        this.a = j;
        this.c = arrayList;
        this.b = str;
        this.d = j2;
        this.e = j3;
        this.f = i;
        this.g = i2;
        this.h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof qc2) {
            if (this.a == ((qc2) obj).a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), this.c, Long.valueOf(this.d), Long.valueOf(this.e), Integer.valueOf(this.f), Integer.valueOf(this.g), Boolean.valueOf(this.h));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            sb.append(((pc2) obj).toString());
        }
        return "TidEventSet{tid=" + this.a + ", event='" + this.b + "', eventList=" + ((Object) sb) + ", eventCount=" + this.f + '}';
    }
}
