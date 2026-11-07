package defpackage;

import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TimeZone;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.TypeReference;
import kotlin.reflect.KTypeProjection;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.cache.DiskLruCache;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final /* synthetic */ class c0 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c0(h61 h61Var, g61 g61Var) {
        this.a = 5;
        this.b = h61Var;
    }

    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = 1;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return obj == ((d0) obj2) ? "(this Collection)" : String.valueOf(obj);
            case 1:
                hu huVar = (hu) obj2;
                di0 di0Var = (di0) obj;
                di0Var.getClass();
                huVar.e().execute(new gu(huVar, di0Var, i2));
                return Unit.a;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                String str = DiskLruCache.g0;
                ((IOException) obj).getClass();
                TimeZone timeZone = _UtilJvmKt.a;
                ((DiskLruCache) obj2).X = true;
                return Unit.a;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                zl0 zl0Var = (zl0) obj2;
                d61 d61Var = (d61) obj;
                fc1 fc1Var = zl0.c;
                Map mapA = d61Var.a();
                LinkedHashMap linkedHashMap = d61Var.a;
                long j = 0;
                for (Map.Entry entry : mapA.entrySet()) {
                    if (entry.getValue() instanceof Set) {
                        fc1 fc1Var2 = (fc1) entry.getKey();
                        Set set = (Set) entry.getValue();
                        String strB = zl0Var.b(System.currentTimeMillis());
                        if (set.contains(strB)) {
                            Object[] objArr = {strB};
                            HashSet hashSet = new HashSet(1);
                            Object obj3 = objArr[0];
                            Objects.requireNonNull(obj3);
                            if (!hashSet.add(obj3)) {
                                ur.g(obj3, "duplicate element: ");
                                return null;
                            }
                            d61Var.c(fc1Var2, Collections.unmodifiableSet(hashSet));
                            j++;
                        } else {
                            fc1Var2.getClass();
                            d61Var.b();
                            linkedHashMap.remove(fc1Var2);
                        }
                    }
                }
                if (j == 0) {
                    fc1Var.getClass();
                    d61Var.b();
                    linkedHashMap.remove(fc1Var);
                } else {
                    d61Var.c(fc1Var, Long.valueOf(j));
                }
                return null;
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                return ((z11) obj2).b(((Integer) obj).intValue());
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                ((h61) obj2).g(null);
                return Unit.a;
            default:
                return TypeReference.a((TypeReference) obj2, (KTypeProjection) obj);
        }
    }

    public /* synthetic */ c0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
