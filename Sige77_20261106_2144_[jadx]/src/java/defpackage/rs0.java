package defpackage;

import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Map;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class rs0 extends l02 {
    public final /* synthetic */ int a;
    public final Object b;
    public final l02 c;
    public final Object d;

    public rs0(io ioVar, rs0 rs0Var, rs0 rs0Var2, v71 v71Var) {
        this.a = 1;
        this.b = rs0Var;
        this.c = rs0Var2;
        this.d = v71Var;
    }

    @Override // defpackage.l02
    public final Object b(au0 au0Var) throws IOException {
        LocalDateTime localDateTimeJ = null;
        Map map = null;
        switch (this.a) {
            case 0:
                au0Var.b();
                ZoneOffset zoneOffsetN = null;
                ZoneId zoneIdL = null;
                while (au0Var.R() != 4) {
                    switch (au0Var.B()) {
                        case "offset":
                            zoneOffsetN = ps0.n(this.c.b(au0Var));
                            break;
                        case "zone":
                            zoneIdL = ps0.l(((l02) this.d).b(au0Var));
                            break;
                        case "dateTime":
                            localDateTimeJ = ps0.j(((k02) this.b).b(au0Var));
                            break;
                        default:
                            au0Var.X();
                            break;
                    }
                }
                au0Var.l();
                qs0.a(localDateTimeJ, "dateTime", au0Var);
                LocalDateTime localDateTimeT = ps0.t(localDateTimeJ);
                qs0.a(zoneOffsetN, "offset", au0Var);
                ZoneOffset zoneOffsetV = ps0.v(zoneOffsetN);
                qs0.a(zoneIdL, "zone", au0Var);
                return ZonedDateTime.ofInstant(localDateTimeT, zoneOffsetV, ps0.u(zoneIdL));
            case 1:
                int iR = au0Var.R();
                if (iR == 9) {
                    au0Var.D();
                } else {
                    map = (Map) ((v71) this.d).e();
                    if (iR == 1) {
                        au0Var.a();
                        while (au0Var.p()) {
                            au0Var.a();
                            Object objB = ((rs0) this.b).c.b(au0Var);
                            Object objB2 = ((rs0) this.c).c.b(au0Var);
                            if (map.containsKey(objB)) {
                                throw new wt0("duplicate key: " + objB, 4);
                            }
                            map.put(objB, objB2);
                            au0Var.j();
                        }
                        au0Var.j();
                    } else {
                        au0Var.b();
                        while (au0Var.p()) {
                            br0.i.getClass();
                            int i = au0Var.i;
                            if (i == 0) {
                                i = au0Var.i();
                            }
                            if (i == 13) {
                                au0Var.i = 9;
                            } else if (i == 12) {
                                au0Var.i = 8;
                            } else {
                                if (i != 14) {
                                    throw au0Var.Z("a name");
                                }
                                au0Var.i = 10;
                            }
                            Object objB3 = ((rs0) this.b).c.b(au0Var);
                            Object objB4 = ((rs0) this.c).c.b(au0Var);
                            if (map.containsKey(objB3)) {
                                throw new wt0("duplicate key: " + objB3, 4);
                            }
                            map.put(objB3, objB4);
                        }
                        au0Var.l();
                    }
                }
                return map;
            default:
                return this.c.b(au0Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0045  */
    @Override // defpackage.l02
    public final void c(eu0 eu0Var, Object obj) throws IOException {
        l02 l02VarD;
        int i = this.a;
        Object obj2 = this.b;
        Object obj3 = this.d;
        l02 l02Var = this.c;
        switch (i) {
            case 0:
                ZonedDateTime zonedDateTimeP = ps0.p(obj);
                if (zonedDateTimeP == null) {
                    eu0Var.p();
                } else {
                    eu0Var.e();
                    eu0Var.m("dateTime");
                    ((k02) obj2).c(eu0Var, zonedDateTimeP.toLocalDateTime());
                    eu0Var.m("offset");
                    l02Var.c(eu0Var, zonedDateTimeP.getOffset());
                    eu0Var.m("zone");
                    ((l02) obj3).c(eu0Var, zonedDateTimeP.getZone());
                    eu0Var.l();
                }
                break;
            case 1:
                Map map = (Map) obj;
                if (map == null) {
                    eu0Var.p();
                } else {
                    eu0Var.e();
                    for (Map.Entry entry : map.entrySet()) {
                        eu0Var.m(String.valueOf(entry.getKey()));
                        ((rs0) l02Var).c(eu0Var, entry.getValue());
                    }
                    eu0Var.l();
                }
                break;
            default:
                Type type = (Type) obj3;
                Type type2 = (obj == null || !((type instanceof Class) || (type instanceof TypeVariable))) ? type : obj.getClass();
                if (type2 != type) {
                    l02 l02VarB = ((uk0) obj2).b(new s12(type2));
                    if (l02VarB instanceof ug1) {
                        l02 l02Var2 = l02Var;
                        while ((l02Var2 instanceof xo1) && (l02VarD = ((xo1) l02Var2).d()) != l02Var2) {
                            l02Var2 = l02VarD;
                        }
                        if (l02Var2 instanceof ug1) {
                            l02Var = l02VarB;
                        }
                    } else {
                        l02Var = l02VarB;
                    }
                }
                l02Var.c(eu0Var, obj);
                break;
        }
    }

    public /* synthetic */ rs0(Object obj, l02 l02Var, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = l02Var;
        this.d = obj2;
    }
}
