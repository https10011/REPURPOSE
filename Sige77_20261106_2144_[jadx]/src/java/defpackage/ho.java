package defpackage;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ho extends l02 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public ho(h12 h12Var, Class cls) {
        this.a = 2;
        this.c = h12Var;
        this.b = cls;
    }

    @Override // defpackage.l02
    public final Object b(au0 au0Var) throws IOException {
        int i = this.a;
        Collection collection = null;
        LocalDateTime localDateTimeJ = null;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                if (au0Var.R() == 9) {
                    au0Var.D();
                } else {
                    collection = (Collection) ((v71) obj).e();
                    au0Var.a();
                    while (au0Var.p()) {
                        collection.add(((rs0) obj2).c.b(au0Var));
                    }
                    au0Var.j();
                }
                return collection;
            case 1:
                au0Var.b();
                ZoneOffset zoneOffsetN = null;
                while (au0Var.R() != 4) {
                    String strB = au0Var.B();
                    if (strB.equals("offset")) {
                        zoneOffsetN = ps0.n(((l02) obj).b(au0Var));
                    } else if (strB.equals("dateTime")) {
                        localDateTimeJ = ps0.j(((k02) obj2).b(au0Var));
                    } else {
                        au0Var.X();
                    }
                }
                au0Var.l();
                qs0.a(localDateTimeJ, "dateTime", au0Var);
                LocalDateTime localDateTimeT = ps0.t(localDateTimeJ);
                qs0.a(zoneOffsetN, "offset", au0Var);
                return OffsetDateTime.of(localDateTimeT, ps0.v(zoneOffsetN));
            default:
                Class cls = (Class) obj2;
                Object objB = ((h12) obj).c.b(au0Var);
                if (objB == null || cls.isInstance(objB)) {
                    return objB;
                }
                throw new wt0("Expected a " + cls.getName() + " but was " + objB.getClass().getName() + "; at path " + au0Var.n(true), 4);
        }
    }

    @Override // defpackage.l02
    public final void c(eu0 eu0Var, Object obj) throws IOException {
        int i = this.a;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                Collection collection = (Collection) obj;
                if (collection != null) {
                    eu0Var.b();
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        ((rs0) obj2).c(eu0Var, it.next());
                    }
                    eu0Var.j();
                } else {
                    eu0Var.p();
                }
                break;
            case 1:
                OffsetDateTime offsetDateTimeN = ss0.n(obj);
                eu0Var.e();
                eu0Var.m("dateTime");
                ((k02) obj2).c(eu0Var, offsetDateTimeN.toLocalDateTime());
                eu0Var.m("offset");
                ((l02) obj3).c(eu0Var, offsetDateTimeN.getOffset());
                eu0Var.l();
                break;
            default:
                ((h12) obj3).c.c(eu0Var, obj);
                break;
        }
    }

    public /* synthetic */ ho(l02 l02Var, Object obj, int i) {
        this.a = i;
        this.b = l02Var;
        this.c = obj;
    }
}
