package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.a;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class jo extends a {
    public static ArrayList c(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new db(objArr, true));
    }

    public static List d(Object... objArr) {
        if (objArr.length <= 0) {
            return x50.a;
        }
        List listAsList = Arrays.asList(objArr);
        listAsList.getClass();
        return listAsList;
    }

    public static ArrayList e(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new db(objArr, true));
    }

    public static final List f(List list) {
        int size = list.size();
        if (size != 0) {
            return size != 1 ? list : a.a(list.get(0));
        }
        return x50.a;
    }

    public static void g() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
