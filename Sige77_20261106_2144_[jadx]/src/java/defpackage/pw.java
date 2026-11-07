package defpackage;

import android.net.Uri;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class pw extends mv1 implements Function2 {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pw(Object obj, Object obj2, fs fsVar, int i) {
        super(2, fsVar);
        this.a = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // defpackage.ze
    public final fs create(Object obj, fs fsVar) {
        int i = this.a;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                pw pwVar = new pw((List) obj2, fsVar, 0);
                pwVar.c = obj;
                return pwVar;
            case 1:
                return new pw((Function2) this.c, (dw) obj2, fsVar, 1);
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                pw pwVar2 = new pw((yx) obj2, fsVar, 2);
                pwVar2.c = obj;
                return pwVar2;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                return new pw((ns0) this.c, (Function1) obj2, fsVar, 3);
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                return new pw((ns0) this.c, (fc1) obj2, fsVar, 4);
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                return new pw((v21) this.c, (Uri) obj2, fsVar, 5);
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                return new pw((r91) this.c, (nx0) obj2, fsVar, 6);
            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                return new pw((ud2) obj2, fsVar, 7);
            default:
                pw pwVar3 = new pw((id0) obj2, fsVar, 8);
                pwVar3.c = obj;
                return pwVar3;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return ((pw) create((eq0) obj, (fs) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((pw) create((et) obj, (fs) obj2)).invokeSuspend(Unit.a);
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return ((pw) create((g41) obj, (fs) obj2)).invokeSuspend(Unit.a);
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                return ((pw) create((et) obj, (fs) obj2)).invokeSuspend(Unit.a);
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                return ((pw) create((et) obj, (fs) obj2)).invokeSuspend(Unit.a);
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                return ((pw) create((et) obj, (fs) obj2)).invokeSuspend(Unit.a);
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                return ((pw) create((et) obj, (fs) obj2)).invokeSuspend(Unit.a);
            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                return ((pw) create((et) obj, (fs) obj2)).invokeSuspend(Unit.a);
            default:
                return ((pw) create(obj, (fs) obj2)).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x007f A[PHI: r2 r9
      0x007f: PHI (r2v2 pw) = (r2v4 pw), (r2v6 pw) binds: [B:24:0x007c, B:20:0x0044] A[DONT_GENERATE, DONT_INLINE]
      0x007f: PHI (r9v40 java.lang.Object) = (r9v48 java.lang.Object), (r9v0 java.lang.Object) binds: [B:24:0x007c, B:20:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0087, code lost:
    
        if (r2.invoke(r9, r8) == r0) goto L28;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0087 -> B:29:0x008b). Please report as a decompilation issue!!! */
    @Override // defpackage.ze
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 576
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pw.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pw(Object obj, fs fsVar, int i) {
        super(2, fsVar);
        this.a = i;
        this.d = obj;
    }
}
