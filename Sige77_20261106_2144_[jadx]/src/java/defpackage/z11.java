package defpackage;

import java.util.Iterator;
import java.util.regex.Matcher;
import kotlin.ranges.IntRange;
import kotlin.ranges.a;
import kotlin.text.MatchGroup;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class z11 extends d0 {
    public final /* synthetic */ p11 a;

    public z11(p11 p11Var) {
        this.a = p11Var;
    }

    @Override // defpackage.d0
    public final int a() {
        return ((Matcher) this.a.b).groupCount() + 1;
    }

    public final MatchGroup b(int i) {
        Matcher matcher = (Matcher) this.a.b;
        IntRange intRangeB = hf1.b(matcher.start(i), matcher.end(i));
        if (((a) intRangeB).a < 0) {
            return null;
        }
        String strGroup = matcher.group(i);
        strGroup.getClass();
        return new MatchGroup(strGroup, intRangeB);
    }

    @Override // defpackage.d0, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null ? true : obj instanceof MatchGroup) {
            return super.contains((MatchGroup) obj);
        }
        return false;
    }

    @Override // defpackage.d0, java.util.Collection
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new kz1(new wb0(new vb(new IntRange(0, a() - 1, 1), 1), new c0(this, 4), 2));
    }
}
