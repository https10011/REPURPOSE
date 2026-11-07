package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.c;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final /* synthetic */ class uo implements Function2 {
    public final /* synthetic */ int a;

    public /* synthetic */ uo(int i) {
        this.a = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        c cVar;
        Object obj3;
        switch (this.a) {
            case 0:
                String str = (String) obj;
                CoroutineContext.Element element = (CoroutineContext.Element) obj2;
                str.getClass();
                element.getClass();
                if (str.length() == 0) {
                    return element.toString();
                }
                return str + ", " + element;
            case 1:
                CoroutineContext coroutineContext = (CoroutineContext) obj;
                CoroutineContext.Element element2 = (CoroutineContext.Element) obj2;
                coroutineContext.getClass();
                element2.getClass();
                CoroutineContext coroutineContextMinusKey = coroutineContext.minusKey(element2.getKey());
                CoroutineContext coroutineContext2 = g.a;
                if (coroutineContextMinusKey == coroutineContext2) {
                    return element2;
                }
                hs hsVar = d.M;
                d dVar = coroutineContextMinusKey.get(hsVar);
                if (dVar == null) {
                    cVar = new c(element2, coroutineContextMinusKey);
                } else {
                    CoroutineContext coroutineContextMinusKey2 = coroutineContextMinusKey.minusKey(hsVar);
                    if (coroutineContextMinusKey2 == coroutineContext2) {
                        return new c(dVar, element2);
                    }
                    cVar = new c(dVar, new c(element2, coroutineContextMinusKey2));
                }
                return cVar;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                obj3 = bool;
                break;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                return ((CoroutineContext) obj).plus((CoroutineContext.Element) obj2);
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                return ((CoroutineContext) obj).plus((CoroutineContext.Element) obj2);
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                return obj;
            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                if (obj == null) {
                    return null;
                }
                ur.a();
                return null;
            default:
                obj3 = (lx1) obj;
                break;
        }
        return obj3;
    }
}
