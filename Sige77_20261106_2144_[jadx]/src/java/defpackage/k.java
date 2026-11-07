package defpackage;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.CollectionsKt;
import org.json.JSONArray;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class k {
    public static final AtomicBoolean a = new AtomicBoolean(false);

    public static final void a() {
        File[] fileArrListFiles;
        if (mt.a.contains(k.class)) {
            return;
        }
        try {
            if (h42.v()) {
                return;
            }
            File fileM = zi0.m();
            int i = 0;
            if (fileM == null) {
                fileArrListFiles = new File[0];
            } else {
                fileArrListFiles = fileM.listFiles(new l70(2));
                if (fileArrListFiles == null) {
                    fileArrListFiles = new File[0];
                }
            }
            ArrayList arrayList = new ArrayList(fileArrListFiles.length);
            for (File file : fileArrListFiles) {
                arrayList.add(yi0.n(file));
            }
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                if (((uq0) obj).a()) {
                    arrayList2.add(obj);
                }
            }
            List listX = CollectionsKt.x(arrayList2, new i(0));
            JSONArray jSONArray = new JSONArray();
            Iterator it = hf1.b(0, Math.min(listX.size(), 5)).iterator();
            while (((zq0) it).c) {
                jSONArray.put(listX.get(((wq0) it).nextInt()));
            }
            zi0.w("anr_reports", jSONArray, new j(i, listX));
        } catch (Throwable th) {
            mt.a(k.class, th);
        }
    }
}
