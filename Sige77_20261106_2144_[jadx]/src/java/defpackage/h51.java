package defpackage;

import android.util.LongSparseArray;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlin.text.Charsets;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final /* synthetic */ class h51 implements ua0, ef2 {
    public final /* synthetic */ ArrayList a;

    public /* synthetic */ h51(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // defpackage.ua0
    public void e(File file) {
        HashMap map;
        HashMap map2;
        a51 a51Var;
        HashMap map3;
        file.getClass();
        HashMap map4 = a51.m;
        if (mt.a.contains(k42.class)) {
            map = null;
            break;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            int iAvailable = fileInputStream.available();
            DataInputStream dataInputStream = new DataInputStream(fileInputStream);
            byte[] bArr = new byte[iAvailable];
            dataInputStream.readFully(bArr);
            dataInputStream.close();
            if (iAvailable >= 4) {
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, 0, 4);
                byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
                int i = byteBufferWrap.getInt();
                int i2 = i + 4;
                if (iAvailable >= i2) {
                    JSONObject jSONObject = new JSONObject(new String(bArr, 4, i, Charsets.UTF_8));
                    JSONArray jSONArrayNames = jSONObject.names();
                    int length = jSONArrayNames.length();
                    String[] strArr = new String[length];
                    for (int i3 = 0; i3 < length; i3++) {
                        strArr[i3] = jSONArrayNames.getString(i3);
                    }
                    int i4 = 1;
                    if (length > 1) {
                        Arrays.sort(strArr);
                    }
                    map = new HashMap();
                    int i5 = 0;
                    while (i5 < length) {
                        String str = strArr[i5];
                        if (str != null) {
                            JSONArray jSONArray = jSONObject.getJSONArray(str);
                            int length2 = jSONArray.length();
                            int[] iArr = new int[length2];
                            for (int i6 = 0; i6 < length2; i6++) {
                                int i7 = jSONArray.getInt(i6);
                                iArr[i6] = i7;
                                i4 *= i7;
                            }
                            int i8 = i4 * 4;
                            int i9 = i2 + i8;
                            if (i9 <= iAvailable) {
                                ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(bArr, i2, i8);
                                byteBufferWrap2.order(ByteOrder.LITTLE_ENDIAN);
                                d11 d11Var = new d11(iArr);
                                byteBufferWrap2.asFloatBuffer().get(d11Var.c, 0, i4);
                                map.put(str, d11Var);
                                i2 = i9;
                            }
                        }
                        i5++;
                        i4 = 1;
                    }
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            mt.a(k42.class, th);
        }
        map = null;
        break;
        if (map == null) {
            map2 = null;
            break;
        }
        map2 = new HashMap();
        if (mt.a.contains(a51.class)) {
            map3 = null;
        } else {
            try {
                map3 = a51.m;
            } catch (Throwable th2) {
                mt.a(a51.class, th2);
                map3 = null;
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            if (map3.containsKey(entry.getKey()) && (str2 = (String) map3.get(entry.getKey())) == null) {
                map2 = null;
                break;
            }
            map2.put(str2, entry.getValue());
        }
        if (map2 == null) {
            a51Var = null;
        } else {
            try {
                a51Var = new a51(map2);
            } catch (Exception unused2) {
                a51Var = null;
            }
        }
        if (a51Var != null) {
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                i51 i51Var = (i51) obj;
                StringBuilder sb = new StringBuilder();
                sb.append(i51Var.a);
                sb.append('_');
                String strH = ts.h(i51Var.d, "_rule", sb);
                String str3 = i51Var.c;
                eg egVar = new eg(11, i51Var, a51Var);
                File file2 = new File(k42.h(), strH);
                if (str3 == null || file2.exists()) {
                    egVar.e(file2);
                } else {
                    new va0(str3, file2, egVar).execute(new String[0]);
                }
            }
        }
    }

    @Override // defpackage.ef2
    public void f(Object obj) {
        LongSparseArray longSparseArray = (LongSparseArray) obj;
        cc2.e("saveMemCacheToDb tidCountArray = " + longSparseArray);
        this.a.clear();
        for (int i = 0; i < longSparseArray.size(); i++) {
            long jKeyAt = longSparseArray.keyAt(i);
            rx1 rx1VarE = ld2.f().e(jKeyAt);
            if (rx1VarE != null) {
                rx1VarE.c.k = ((Integer) longSparseArray.valueAt(i)).intValue();
                if ("device".equals(rx1VarE.b) && 9999 == sc2.a(jKeyAt)) {
                    md2 md2Var = ld2.f().a;
                    hf2 hf2Var = (hf2) ((f91) md2Var.b).b;
                    hf2Var.j = nj2.J(hc.h);
                    hf2Var.i = true;
                    ((nd2) md2Var.a).c(((f91) md2Var.b).g());
                }
            }
        }
    }
}
