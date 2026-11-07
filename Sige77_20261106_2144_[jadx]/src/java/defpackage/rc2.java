package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.graphics.Rect;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.Pair;
import android.util.SparseArray;
import android.widget.ProgressBar;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.internal.firebase-auth-api.zzahd;
import com.hjq.toast.BuildConfig;
import com.transsion.athena.data.AppIdData;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class rc2 implements n50, mn2, uu2, uh3 {
    public static volatile rc2 d;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public rc2(byte[] bArr, Provider provider) throws GeneralSecurityException {
        this.a = 13;
        if (!ck1.i(1)) {
            tv2.f("Cannot use AES-CMAC in FIPS-mode, as BoringCrypto module is not available");
            throw null;
        }
        this.b = new SecretKeySpec(bArr, "AES");
        this.c = provider;
    }

    public static hd2 D() {
        hd2 hd2Var = new hd2(12);
        hd2Var.b = new HashMap();
        hd2Var.c = new HashMap();
        return hd2Var;
    }

    public static synchronized rc2 h(Context context) {
        try {
            if (d == null) {
                synchronized (rc2.class) {
                    try {
                        if (d == null) {
                            rc2 rc2Var = new rc2(0);
                            try {
                                rc2Var.c = context;
                                ed2 ed2Var = new ed2(context);
                                rc2Var.b = ed2Var;
                                ed2Var.setWriteAheadLoggingEnabled(true);
                            } catch (Exception e) {
                                cc2.c(e.getMessage());
                            }
                            d = rc2Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return d;
    }

    public void A(ae aeVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", aeVar.a);
            jSONObject.put("Status", ts.v(aeVar.b));
            jSONObject.put("AuthToken", aeVar.c);
            jSONObject.put("RefreshToken", aeVar.d);
            jSONObject.put("TokenCreationEpochInSecs", aeVar.f);
            jSONObject.put("ExpiresInSecs", aeVar.e);
            jSONObject.put("FisError", aeVar.g);
            hc0 hc0Var = (hc0) this.c;
            hc0Var.a();
            File fileCreateTempFile = File.createTempFile("PersistedInstallation", "tmp", hc0Var.a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (fileCreateTempFile.renameTo(y())) {
            } else {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    public ae B() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(y());
            while (true) {
                try {
                    int i = fileInputStream.read(bArr, 0, 16384);
                    if (i < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String strOptString = jSONObject.optString("Fid", null);
        int iOptInt = jSONObject.optInt("Status", 0);
        String strOptString2 = jSONObject.optString("AuthToken", null);
        String strOptString3 = jSONObject.optString("RefreshToken", null);
        long jOptLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long jOptLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String strOptString4 = jSONObject.optString("FisError", null);
        int i2 = ae.h;
        byte b = (byte) (((byte) (0 | 2)) | 1);
        int i3 = ts.A(5)[iOptInt];
        if (i3 == 0) {
            uq1.h("Null registrationStatus");
            return null;
        }
        byte b2 = (byte) (((byte) (b | 2)) | 1);
        if (b2 == 3 && i3 != 0) {
            return new ae(strOptString, i3, strOptString2, strOptString3, jOptLong2, jOptLong, strOptString4);
        }
        StringBuilder sb = new StringBuilder();
        if (i3 == 0) {
            sb.append(" registrationStatus");
        }
        if ((b2 & 1) == 0) {
            sb.append(" expiresInSecs");
        }
        if ((b2 & 2) == 0) {
            sb.append(" tokenCreationEpochInSecs");
        }
        ur.c(sb, "Missing required properties:");
        return null;
    }

    public void C(int i, int i2, int i3, int i4) {
        CardView cardView = (CardView) this.c;
        cardView.d.set(i, i2, i3, i4);
        Rect rect = cardView.c;
        CardView.a(cardView, i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
    }

    public Enum E(Object obj) throws GeneralSecurityException {
        Enum r1 = (Enum) ((Map) this.c).get(obj);
        if (r1 != null) {
            return r1;
        }
        throw new GeneralSecurityException("Unable to convert object enum: ".concat(String.valueOf(obj)));
    }

    public Object F(Enum r2) throws GeneralSecurityException {
        Object obj = ((Map) this.b).get(r2);
        if (obj != null) {
            return obj;
        }
        throw new GeneralSecurityException("Unable to convert proto enum: ".concat(String.valueOf(r2)));
    }

    public r73 G() {
        Integer num = (Integer) this.b;
        if (num == null) {
            tv2.f("Key size is not set");
            return null;
        }
        if (((q73) this.c) != null) {
            return new r73(num.intValue(), (q73) this.c);
        }
        tv2.f("Variant is not set");
        return null;
    }

    public void H(int i) {
        if (i != 32 && i != 48 && i != 64) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 32-byte, 48-byte and 64-byte AES-SIV keys are supported", Integer.valueOf(i)));
        }
        this.b = Integer.valueOf(i);
    }

    @Override // defpackage.n50
    public Object a() {
        return (x22) this.b;
    }

    @Override // defpackage.uh3
    public byte[] b(byte[] bArr, int i) throws NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        if (i > 16) {
            throw new InvalidAlgorithmParameterException("outputLength must not be larger than 16");
        }
        Mac mac = Mac.getInstance("AESCMAC", (Provider) this.c);
        mac.init((SecretKeySpec) this.b);
        byte[] bArrDoFinal = mac.doFinal(bArr);
        return i == bArrDoFinal.length ? bArrDoFinal : Arrays.copyOf(bArrDoFinal, i);
    }

    @Override // defpackage.n50
    public boolean c(CharSequence charSequence, int i, int i2, b22 b22Var) {
        if ((b22Var.c & 4) > 0) {
            return true;
        }
        if (((x22) this.b) == null) {
            this.b = new x22(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((qh1) this.c).getClass();
        ((x22) this.b).setSpan(new c22(b22Var), i, i2, 33);
        return true;
    }

    @Override // defpackage.uu2
    public ep1 d(qt2 qt2Var) {
        ep1 ep1VarK = ((ep1) this.b).K();
        ep1VarK.P((String) this.c, qt2Var);
        return ep1VarK;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0224 A[Catch: all -> 0x0197, Exception -> 0x019c, SQLiteException -> 0x01a1, TRY_LEAVE, TryCatch #16 {SQLiteException -> 0x01a1, Exception -> 0x019c, all -> 0x0197, blocks: (B:76:0x017b, B:77:0x0180, B:80:0x018e, B:89:0x01ac, B:106:0x0224, B:117:0x0240, B:119:0x025f, B:121:0x027c, B:130:0x029a, B:131:0x029f, B:134:0x02a5, B:136:0x02b0, B:137:0x02b5, B:138:0x02b9, B:87:0x01a6, B:91:0x01c9), top: B:195:0x017b }] */
    /* JADX WARN: Code duplicated, block: B:150:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:167:0x0334 A[Catch: all -> 0x02ef, TryCatch #14 {all -> 0x02ef, blocks: (B:140:0x02e3, B:142:0x02e9, B:161:0x0315, B:162:0x0323, B:165:0x032b, B:167:0x0334, B:168:0x0337, B:169:0x0343), top: B:185:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:171:0x0346  */
    /* JADX WARN: Code duplicated, block: B:174:0x034f  */
    /* JADX WARN: Code duplicated, block: B:195:0x017b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:203:0x01c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x00a6 A[Catch: all -> 0x0098, Exception -> 0x009c, SQLiteException -> 0x00a0, TryCatch #20 {all -> 0x0098, blocks: (B:22:0x008d, B:51:0x00e1, B:59:0x011c, B:62:0x0126, B:67:0x0150, B:33:0x00a6, B:35:0x00af, B:34:0x00a9), top: B:188:0x008d }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00a9 A[Catch: all -> 0x0098, Exception -> 0x009c, SQLiteException -> 0x00a0, TryCatch #20 {all -> 0x0098, blocks: (B:22:0x008d, B:51:0x00e1, B:59:0x011c, B:62:0x0126, B:67:0x0150, B:33:0x00a6, B:35:0x00af, B:34:0x00a9), top: B:188:0x008d }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0163 A[Catch: all -> 0x01eb, Exception -> 0x01ef, SQLiteException -> 0x01f3, TRY_ENTER, TRY_LEAVE, TryCatch #12 {all -> 0x01eb, blocks: (B:16:0x006e, B:18:0x0074, B:55:0x010c, B:73:0x0163), top: B:183:0x006e }] */
    /* JADX WARN: Code duplicated, block: B:80:0x018e A[Catch: all -> 0x0197, Exception -> 0x019c, SQLiteException -> 0x01a1, TRY_ENTER, TryCatch #16 {SQLiteException -> 0x01a1, Exception -> 0x019c, all -> 0x0197, blocks: (B:76:0x017b, B:77:0x0180, B:80:0x018e, B:89:0x01ac, B:106:0x0224, B:117:0x0240, B:119:0x025f, B:121:0x027c, B:130:0x029a, B:131:0x029f, B:134:0x02a5, B:136:0x02b0, B:137:0x02b5, B:138:0x02b9, B:87:0x01a6, B:91:0x01c9), top: B:195:0x017b }] */
    /* JADX WARN: Code duplicated, block: B:87:0x01a6 A[Catch: all -> 0x0197, Exception -> 0x019c, SQLiteException -> 0x01a1, TryCatch #16 {SQLiteException -> 0x01a1, Exception -> 0x019c, all -> 0x0197, blocks: (B:76:0x017b, B:77:0x0180, B:80:0x018e, B:89:0x01ac, B:106:0x0224, B:117:0x0240, B:119:0x025f, B:121:0x027c, B:130:0x029a, B:131:0x029f, B:134:0x02a5, B:136:0x02b0, B:137:0x02b5, B:138:0x02b9, B:87:0x01a6, B:91:0x01c9), top: B:195:0x017b }] */
    /* JADX WARN: Code duplicated, block: B:89:0x01ac A[Catch: all -> 0x0197, Exception -> 0x019c, SQLiteException -> 0x01a1, TryCatch #16 {SQLiteException -> 0x01a1, Exception -> 0x019c, all -> 0x0197, blocks: (B:76:0x017b, B:77:0x0180, B:80:0x018e, B:89:0x01ac, B:106:0x0224, B:117:0x0240, B:119:0x025f, B:121:0x027c, B:130:0x029a, B:131:0x029f, B:134:0x02a5, B:136:0x02b0, B:137:0x02b5, B:138:0x02b9, B:87:0x01a6, B:91:0x01c9), top: B:195:0x017b }] */
    /* JADX WARN: Code duplicated, block: B:98:0x01f7  */
    /* JADX WARN: Instruction removed from duplicated block: B:89:0x01ac, please report this as an issue */
    public int e(dz1 dz1Var, int i) throws Throwable {
        String str;
        ed2 ed2Var;
        Cursor cursor;
        Cursor cursorRawQuery;
        Cursor cursorRawQuery2;
        long j;
        String str2;
        int i2;
        boolean z;
        byte[] bArr;
        String str3;
        boolean zContains;
        long j2;
        JSONObject jSONObject;
        String string;
        String strG;
        byte[] bArr2;
        byte[] bArr3;
        int i3;
        String str4 = "_eid";
        ed2 ed2Var2 = (ed2) this.b;
        long j3 = dz1Var.d;
        JSONObject jSONObject2 = dz1Var.b;
        ArrayList arrayList = ((hf2) ((f91) ld2.f().a.b).b).l;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseX = x();
                if (sQLiteDatabaseX == null) {
                    if (!ed2Var2.a()) {
                        return -1;
                    }
                    cc2.c("There is not enough space left");
                    return -1;
                }
                String str5 = "pi";
                str = "There is not enough space left";
                ed2Var = ed2Var2;
                if (i == 1) {
                    try {
                        cursorRawQuery2 = sQLiteDatabaseX.rawQuery("SELECT * FROM events WHERE tid=" + j3 + " AND et=" + i, null);
                        byte[] bArr4 = null;
                        String str6 = null;
                        String str7 = null;
                        while (true) {
                            if (cursorRawQuery2 != null) {
                                try {
                                    try {
                                        if (cursorRawQuery2.moveToNext()) {
                                            int i4 = cursorRawQuery2.getInt(cursorRawQuery2.getColumnIndex(str5));
                                            byte[] bArr5 = bArr4;
                                            String string2 = cursorRawQuery2.getString(cursorRawQuery2.getColumnIndex("event"));
                                            String str8 = str6;
                                            if (i4 != -1) {
                                                if (i4 != 0) {
                                                    try {
                                                        try {
                                                            if (rq0.l(arrayList)) {
                                                                if (i4 == 0) {
                                                                    bArr3 = ze2.m;
                                                                } else {
                                                                    bArr3 = (byte[]) arrayList.get(i4);
                                                                }
                                                                byte[] bArr6 = bArr3;
                                                                strG = x91.g(bArr3, string2);
                                                                bArr2 = bArr6;
                                                            } else {
                                                                strG = string2;
                                                                bArr2 = bArr5;
                                                            }
                                                        } catch (Throwable th) {
                                                            th = th;
                                                            cursor = cursorRawQuery2;
                                                        }
                                                    } catch (SQLiteException e) {
                                                        e = e;
                                                        cursorRawQuery = cursorRawQuery2;
                                                        cc2.c(Log.getStackTraceString(e));
                                                        if (cursorRawQuery != null) {
                                                            cursorRawQuery.close();
                                                        }
                                                        m(e);
                                                        throw new oc2("addJSON_sql", e);
                                                    } catch (Exception e2) {
                                                        e = e2;
                                                        cc2.c(Log.getStackTraceString(e));
                                                        throw new oc2("addJSON", e);
                                                    }
                                                } else {
                                                    if (i4 == 0) {
                                                        bArr3 = ze2.m;
                                                    } else {
                                                        bArr3 = (byte[]) arrayList.get(i4);
                                                    }
                                                    byte[] bArr7 = bArr3;
                                                    strG = x91.g(bArr3, string2);
                                                    bArr2 = bArr7;
                                                }
                                                if (bArr2 == null || strG == null) {
                                                    cursorRawQuery2.close();
                                                    if (ed2Var.a()) {
                                                        cc2.c(str);
                                                    }
                                                    return -1;
                                                }
                                                String str9 = strG;
                                                bArr = bArr2;
                                                string2 = str9;
                                            } else {
                                                bArr = bArr5;
                                            }
                                            String str10 = str7;
                                            ArrayList arrayList2 = arrayList;
                                            if (str8 == null) {
                                                j = j3;
                                                try {
                                                    str3 = "\"event\":\"" + jSONObject2.getString("event") + "\"";
                                                } catch (Exception unused) {
                                                    cursorRawQuery2 = cursorRawQuery2;
                                                    str2 = str5;
                                                    str7 = str10;
                                                }
                                            } else {
                                                j = j3;
                                                str3 = str8;
                                            }
                                            try {
                                                boolean zContains2 = string2.contains(str3);
                                                str8 = str3;
                                                if (zContains2) {
                                                    str2 = str5;
                                                    try {
                                                        if ("ev_athena".equals(dz1Var.a)) {
                                                            if (str10 == null) {
                                                                str7 = "\"" + str4 + "\":\"" + jSONObject2.getJSONObject("_eparam").optString(str4) + "\"";
                                                            } else {
                                                                str7 = str10;
                                                            }
                                                            try {
                                                                zContains = string2.contains(str7);
                                                            } catch (Exception unused2) {
                                                                cursorRawQuery2 = cursorRawQuery2;
                                                            }
                                                        }
                                                        if (zContains) {
                                                            j2 = cursorRawQuery2.getLong(cursorRawQuery2.getColumnIndex("_id"));
                                                            cursorRawQuery2 = cursorRawQuery2;
                                                            if (string2.length() < 131072) {
                                                                try {
                                                                    jSONObject = new JSONObject(string2);
                                                                    try {
                                                                        rq0.g(jSONObject2.getJSONObject("_eparam"), jSONObject.getJSONObject("_eparam"));
                                                                        i2 = -1;
                                                                        if (i4 != -1) {
                                                                            string = x91.c(bArr, jSONObject.toString());
                                                                        } else {
                                                                            string = jSONObject.toString();
                                                                        }
                                                                        if (string != null) {
                                                                            ContentValues contentValues = new ContentValues();
                                                                            contentValues.put("event", string);
                                                                            sQLiteDatabaseX.update("events", contentValues, "_id=" + j2, null);
                                                                        }
                                                                        z = false;
                                                                        if (cursorRawQuery2 != null) {
                                                                            cursorRawQuery2.close();
                                                                        }
                                                                    } catch (JSONException unused3) {
                                                                        bArr4 = bArr;
                                                                        str6 = str8;
                                                                        arrayList = arrayList2;
                                                                        j3 = j;
                                                                        cursorRawQuery2 = cursorRawQuery2;
                                                                        str5 = str2;
                                                                        str4 = str4;
                                                                    }
                                                                } catch (SQLiteException e3) {
                                                                    e = e3;
                                                                    cursorRawQuery = cursorRawQuery2;
                                                                    cc2.c(Log.getStackTraceString(e));
                                                                    if (cursorRawQuery != null) {
                                                                        cursorRawQuery.close();
                                                                    }
                                                                    m(e);
                                                                    throw new oc2("addJSON_sql", e);
                                                                } catch (Exception e4) {
                                                                    e = e4;
                                                                    cc2.c(Log.getStackTraceString(e));
                                                                    throw new oc2("addJSON", e);
                                                                } catch (Throwable th2) {
                                                                    th = th2;
                                                                    cursor = cursorRawQuery2;
                                                                    if (cursor != null) {
                                                                        cursor.close();
                                                                    }
                                                                    if (ed2Var.a()) {
                                                                        cc2.c(str);
                                                                    }
                                                                    throw th;
                                                                }
                                                            } else {
                                                                i2 = -1;
                                                                ContentValues contentValues2 = new ContentValues();
                                                                contentValues2.put("et", (Integer) 2);
                                                                sQLiteDatabaseX.update("events", contentValues2, "_id=" + j2, null);
                                                                z = true;
                                                                if (cursorRawQuery2 != null) {
                                                                    cursorRawQuery2.close();
                                                                }
                                                            }
                                                        } else {
                                                            cursorRawQuery2 = cursorRawQuery2;
                                                        }
                                                    } catch (Exception unused4) {
                                                        str7 = str10;
                                                    }
                                                    bArr4 = bArr;
                                                    str6 = str8;
                                                    arrayList = arrayList2;
                                                    j3 = j;
                                                    cursorRawQuery2 = cursorRawQuery2;
                                                    str5 = str2;
                                                    str4 = str4;
                                                } else {
                                                    str2 = str5;
                                                }
                                                str7 = str10;
                                                zContains = zContains2;
                                                if (zContains) {
                                                    j2 = cursorRawQuery2.getLong(cursorRawQuery2.getColumnIndex("_id"));
                                                    cursorRawQuery2 = cursorRawQuery2;
                                                    if (string2.length() < 131072) {
                                                        jSONObject = new JSONObject(string2);
                                                        rq0.g(jSONObject2.getJSONObject("_eparam"), jSONObject.getJSONObject("_eparam"));
                                                        i2 = -1;
                                                        if (i4 != -1) {
                                                            string = x91.c(bArr, jSONObject.toString());
                                                        } else {
                                                            string = jSONObject.toString();
                                                        }
                                                        if (string != null) {
                                                            ContentValues contentValues3 = new ContentValues();
                                                            contentValues3.put("event", string);
                                                            sQLiteDatabaseX.update("events", contentValues3, "_id=" + j2, null);
                                                        }
                                                        z = false;
                                                        if (cursorRawQuery2 != null) {
                                                            cursorRawQuery2.close();
                                                        }
                                                    } else {
                                                        i2 = -1;
                                                        ContentValues contentValues4 = new ContentValues();
                                                        contentValues4.put("et", (Integer) 2);
                                                        sQLiteDatabaseX.update("events", contentValues4, "_id=" + j2, null);
                                                        z = true;
                                                        if (cursorRawQuery2 != null) {
                                                            cursorRawQuery2.close();
                                                        }
                                                    }
                                                } else {
                                                    cursorRawQuery2 = cursorRawQuery2;
                                                }
                                            } catch (Exception unused5) {
                                                str8 = str3;
                                                str2 = str5;
                                            }
                                            bArr4 = bArr;
                                            str6 = str8;
                                            arrayList = arrayList2;
                                            j3 = j;
                                            cursorRawQuery2 = cursorRawQuery2;
                                            str5 = str2;
                                            str4 = str4;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        cursorRawQuery2 = cursorRawQuery2;
                                        cursor = cursorRawQuery2;
                                    }
                                } catch (SQLiteException e5) {
                                    e = e5;
                                    cursorRawQuery2 = cursorRawQuery2;
                                    cursorRawQuery = cursorRawQuery2;
                                    cc2.c(Log.getStackTraceString(e));
                                    if (cursorRawQuery != null) {
                                        cursorRawQuery.close();
                                    }
                                    m(e);
                                    throw new oc2("addJSON_sql", e);
                                } catch (Exception e6) {
                                    e = e6;
                                    cursorRawQuery2 = cursorRawQuery2;
                                    cc2.c(Log.getStackTraceString(e));
                                    throw new oc2("addJSON", e);
                                }
                                if (cursor != null) {
                                    cursor.close();
                                }
                                if (ed2Var.a()) {
                                    cc2.c(str);
                                }
                                throw th;
                            }
                            cursorRawQuery2 = cursorRawQuery2;
                            j = j3;
                            str2 = str5;
                            i2 = -1;
                            z = true;
                            if (cursorRawQuery2 != null) {
                                cursorRawQuery2.close();
                            }
                        }
                    } catch (SQLiteException e7) {
                        e = e7;
                        cursorRawQuery = null;
                    } catch (Exception e8) {
                        e = e8;
                    } catch (Throwable th4) {
                        th = th4;
                        cursor = null;
                    }
                } else {
                    j = j3;
                    str2 = "pi";
                    i2 = -1;
                    z = true;
                    cursorRawQuery2 = null;
                }
                if (z) {
                    Pair pairD = ld2.f().a.d();
                    Integer num = (Integer) pairD.first;
                    num.getClass();
                    String strC = x91.c((byte[]) pairD.second, jSONObject2.toString());
                    if (strC != null) {
                        ContentValues contentValues5 = new ContentValues();
                        contentValues5.put("tid", Long.valueOf(j));
                        contentValues5.put("event", strC);
                        contentValues5.put("et", Integer.valueOf(i));
                        contentValues5.put(str2, num);
                        contentValues5.put("created_at", Long.valueOf(dz1Var.f));
                        String str11 = sc2.a;
                        if (j > 999 && j <= 9999) {
                            contentValues5.put("ext", dz1Var.a);
                        }
                        if (dz1Var.h != null) {
                            contentValues5.put("er_ts", Long.valueOf(dz1Var.g));
                            contentValues5.put("boot_id", dz1Var.h);
                        }
                        sQLiteDatabaseX.insert("events", null, contentValues5);
                    }
                }
                cursorRawQuery = sQLiteDatabaseX.rawQuery("SELECT COUNT(*) FROM events WHERE tid=" + j, null);
                if (cursorRawQuery != null) {
                    try {
                        if (cursorRawQuery.moveToNext()) {
                            i3 = cursorRawQuery.getInt(0);
                        } else {
                            i3 = i2;
                        }
                    } catch (SQLiteException e9) {
                        e = e9;
                        cc2.c(Log.getStackTraceString(e));
                        if (cursorRawQuery != null) {
                            cursorRawQuery.close();
                        }
                        m(e);
                        throw new oc2("addJSON_sql", e);
                    } catch (Exception e10) {
                        e = e10;
                        cc2.c(Log.getStackTraceString(e));
                        throw new oc2("addJSON", e);
                    }
                } else {
                    i3 = i2;
                }
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                if (!ed2Var.a()) {
                    return i3;
                }
                cc2.c(str);
                return -2;
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (SQLiteException e11) {
            e = e11;
            cursorRawQuery = null;
        } catch (Exception e12) {
            e = e12;
        } catch (Throwable th6) {
            th = th6;
            str = "There is not enough space left";
            ed2Var = ed2Var2;
            cursor = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00ba  */
    public int f(ef2 ef2Var) {
        LongSparseArray longSparseArray = new LongSparseArray();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseX = x();
                if (sQLiteDatabaseX == null) {
                    return 0;
                }
                Cursor cursorRawQuery = sQLiteDatabaseX.rawQuery("SELECT _id,tid FROM events ORDER BY _id LIMIT 1000", null);
                long j = 0;
                while (cursorRawQuery != null && cursorRawQuery.moveToNext()) {
                    long j2 = cursorRawQuery.getLong(cursorRawQuery.getColumnIndex("tid"));
                    longSparseArray.put(j2, Integer.valueOf(((Integer) longSparseArray.get(j2, 0)).intValue() + 1));
                    j = cursorRawQuery.getLong(cursorRawQuery.getColumnIndex("_id"));
                }
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                int iDelete = sQLiteDatabaseX.delete("events", "_id<=" + j + " AND CAST(tid AS TEXT) NOT LIKE ?", new String[]{"9999%"});
                if (longSparseArray.size() > 0) {
                    ef2Var.f(longSparseArray.toString());
                }
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                return iDelete;
            } catch (SQLiteException e) {
                cc2.c(Log.getStackTraceString(e));
                if (0 != 0) {
                    cursor.close();
                }
                m(e);
                throw new oc2("cleanupEvents_oom_sql", e);
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
        if (0 != 0) {
            cursor.close();
        }
        throw th;
    }

    /* JADX WARN: Code duplicated, block: B:143:0x0287  */
    /* JADX WARN: Code duplicated, block: B:149:0x01c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:181:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x01a4 A[Catch: all -> 0x00eb, Exception -> 0x0195, PHI: r4 r6
      0x01a4: PHI (r4v15 java.lang.Object) = (r4v7 java.lang.Object), (r4v7 java.lang.Object), (r4v9 java.lang.Object) binds: [B:62:0x015b, B:64:0x0161, B:174:0x01a4] A[DONT_GENERATE, DONT_INLINE]
      0x01a4: PHI (r6v9 java.lang.String) = (r6v1 java.lang.String), (r6v1 java.lang.String), (r6v5 java.lang.String) binds: [B:62:0x015b, B:64:0x0161, B:174:0x01a4] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #6 {Exception -> 0x0195, blocks: (B:72:0x0187, B:79:0x01a4, B:81:0x01b9), top: B:151:0x0187 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x01dc  */
    public qc2 g(long j, long j2, String str, int i, int i2) throws Throwable {
        Cursor cursor;
        Cursor cursor2;
        Object obj;
        Cursor cursor3;
        Cursor cursorRawQuery;
        String str2;
        int i3;
        String str3;
        String str4;
        String str5;
        int iIntValue;
        int length;
        String str6 = "_eparam";
        String str7 = "net";
        String str8 = "event";
        ArrayList arrayList = ((hf2) ((f91) ld2.f().a.b).b).l;
        try {
            if (rq0.h(arrayList)) {
                return null;
            }
            try {
                SQLiteDatabase sQLiteDatabaseX = x();
                if (sQLiteDatabaseX == null) {
                    return null;
                }
                if (TextUtils.isEmpty(str)) {
                    try {
                        str2 = "SELECT * FROM events WHERE tid=" + j + " AND created_at<=" + j2 + " ORDER BY _id LIMIT " + i2;
                    } catch (SQLiteException e) {
                        e = e;
                        cursorRawQuery = null;
                    } catch (Exception e2) {
                        e = e2;
                        cc2.c(Log.getStackTraceString(e));
                        throw new oc2("queryEventList", e);
                    } catch (Throwable th) {
                        th = th;
                        cursor = null;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                } else {
                    str2 = "SELECT * FROM events WHERE tid=" + j + " AND uid='" + str + "' ORDER BY _id";
                }
                try {
                    cursorRawQuery = sQLiteDatabaseX.rawQuery(str2, null);
                    if (cursorRawQuery != null) {
                        try {
                            if (cursorRawQuery.getCount() != 0) {
                                int count = cursorRawQuery.getCount();
                                ArrayList arrayList2 = new ArrayList();
                                String str9 = BuildConfig.FLAVOR;
                                int i4 = 0;
                                long j3 = 0;
                                int i5 = 0;
                                int i6 = 0;
                                long j4 = 0;
                                while (true) {
                                    if (!cursorRawQuery.moveToNext()) {
                                        i3 = i6;
                                        break;
                                    }
                                    String string = cursorRawQuery.getString(cursorRawQuery.getColumnIndex(str8));
                                    long j5 = cursorRawQuery.getLong(cursorRawQuery.getColumnIndex("created_at"));
                                    int i7 = cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("pi"));
                                    int i8 = cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("et"));
                                    if (i7 != -1) {
                                        string = x91.g((byte[]) arrayList.get(i7), string);
                                    }
                                    if (j3 == 0) {
                                        j3 = cursorRawQuery.getLong(cursorRawQuery.getColumnIndex("_id"));
                                    }
                                    if (string != null) {
                                        if (i8 != 0) {
                                            string = string.replace("&add", BuildConfig.FLAVOR).replace("&append", BuildConfig.FLAVOR);
                                        }
                                        try {
                                            JSONObject jSONObject = new JSONObject(string);
                                            String str10 = (String) jSONObject.remove(str8);
                                            try {
                                                if (jSONObject.has(str7)) {
                                                    try {
                                                        iIntValue = ((Integer) jSONObject.remove(str7)).intValue();
                                                    } catch (Exception e3) {
                                                        e = e3;
                                                        str9 = str10;
                                                        str3 = str6;
                                                        str4 = str7;
                                                        str5 = str8;
                                                        e.printStackTrace();
                                                        i4++;
                                                    }
                                                } else {
                                                    iIntValue = 0;
                                                }
                                                str3 = str6;
                                                str4 = str7;
                                                Object objRemove = jSONObject.has(str6) ? jSONObject.remove(str6) : new JSONObject();
                                                try {
                                                    if (objRemove instanceof JSONObject) {
                                                        try {
                                                            if (jSONObject.length() > 0) {
                                                                Iterator<String> itKeys = jSONObject.keys();
                                                                while (itKeys.hasNext()) {
                                                                    objRemove = objRemove;
                                                                    String next = itKeys.next();
                                                                    itKeys = itKeys;
                                                                    if (next.startsWith("_")) {
                                                                        str5 = str8;
                                                                        try {
                                                                            ((JSONObject) objRemove).put(next, jSONObject.get(next));
                                                                            str8 = str5;
                                                                        } catch (Exception e4) {
                                                                            e = e4;
                                                                            str9 = str10;
                                                                            e.printStackTrace();
                                                                            i4++;
                                                                            j4 = cursorRawQuery.getLong(cursorRawQuery.getColumnIndex("_id"));
                                                                            str6 = str3;
                                                                            str7 = str4;
                                                                            str8 = str5;
                                                                        }
                                                                    }
                                                                }
                                                                str5 = str8;
                                                                String string2 = objRemove.toString();
                                                                try {
                                                                    pc2 pc2Var = new pc2();
                                                                    pc2Var.a = str10;
                                                                    pc2Var.b = j5;
                                                                    pc2Var.d = iIntValue;
                                                                    pc2Var.c = string2;
                                                                    arrayList2.add(pc2Var);
                                                                    i5++;
                                                                    length = i6 + string.length();
                                                                    if (length >= i) {
                                                                        try {
                                                                            j4 = cursorRawQuery.getLong(cursorRawQuery.getColumnIndex("_id"));
                                                                            i3 = length;
                                                                            str9 = str10;
                                                                            break;
                                                                        } catch (Exception e5) {
                                                                            e = e5;
                                                                            i6 = length;
                                                                            str9 = str10;
                                                                            e.printStackTrace();
                                                                            i4++;
                                                                            j4 = cursorRawQuery.getLong(cursorRawQuery.getColumnIndex("_id"));
                                                                            str6 = str3;
                                                                            str7 = str4;
                                                                            str8 = str5;
                                                                        }
                                                                    } else {
                                                                        i6 = length;
                                                                        str9 = str10;
                                                                    }
                                                                } catch (Exception e6) {
                                                                    e = e6;
                                                                    str9 = str10;
                                                                    e.printStackTrace();
                                                                    i4++;
                                                                    j4 = cursorRawQuery.getLong(cursorRawQuery.getColumnIndex("_id"));
                                                                    str6 = str3;
                                                                    str7 = str4;
                                                                    str8 = str5;
                                                                }
                                                            } else {
                                                                str5 = str8;
                                                                String string3 = objRemove.toString();
                                                                pc2 pc2Var2 = new pc2();
                                                                pc2Var2.a = str10;
                                                                pc2Var2.b = j5;
                                                                pc2Var2.d = iIntValue;
                                                                pc2Var2.c = string3;
                                                                arrayList2.add(pc2Var2);
                                                                i5++;
                                                                length = i6 + string.length();
                                                                if (length >= i) {
                                                                    j4 = cursorRawQuery.getLong(cursorRawQuery.getColumnIndex("_id"));
                                                                    i3 = length;
                                                                    str9 = str10;
                                                                    break;
                                                                }
                                                                i6 = length;
                                                                str9 = str10;
                                                            }
                                                        } catch (Exception e7) {
                                                            e = e7;
                                                            str5 = str8;
                                                            str9 = str10;
                                                            e.printStackTrace();
                                                            i4++;
                                                            j4 = cursorRawQuery.getLong(cursorRawQuery.getColumnIndex("_id"));
                                                            str6 = str3;
                                                            str7 = str4;
                                                            str8 = str5;
                                                        }
                                                    } else {
                                                        str5 = str8;
                                                        String string4 = objRemove.toString();
                                                        pc2 pc2Var3 = new pc2();
                                                        pc2Var3.a = str10;
                                                        pc2Var3.b = j5;
                                                        pc2Var3.d = iIntValue;
                                                        pc2Var3.c = string4;
                                                        arrayList2.add(pc2Var3);
                                                        i5++;
                                                        length = i6 + string.length();
                                                        if (length >= i) {
                                                            j4 = cursorRawQuery.getLong(cursorRawQuery.getColumnIndex("_id"));
                                                            i3 = length;
                                                            str9 = str10;
                                                            break;
                                                        }
                                                        i6 = length;
                                                        str9 = str10;
                                                    }
                                                } catch (Exception e8) {
                                                    e = e8;
                                                    str5 = str8;
                                                }
                                            } catch (Exception e9) {
                                                e = e9;
                                                str3 = str6;
                                                str4 = str7;
                                            }
                                        } catch (Exception e10) {
                                            e = e10;
                                        }
                                        j4 = cursorRawQuery.getLong(cursorRawQuery.getColumnIndex("_id"));
                                        str6 = str3;
                                        str7 = str4;
                                        str8 = str5;
                                    } else {
                                        str3 = str6;
                                        str4 = str7;
                                        str5 = str8;
                                    }
                                    i4++;
                                    j4 = cursorRawQuery.getLong(cursorRawQuery.getColumnIndex("_id"));
                                    str6 = str3;
                                    str7 = str4;
                                    str8 = str5;
                                }
                                long j6 = j3;
                                int i9 = i5;
                                cursorRawQuery.close();
                                if (i9 > 0) {
                                    int i10 = i4 + i9;
                                    qc2 qc2Var = new qc2(j, str9, arrayList2, j6, j4, i9, i3, count <= i10 && !(count == i2 && count == i10));
                                    cursorRawQuery.close();
                                    return qc2Var;
                                }
                            } else if (cursorRawQuery == null) {
                                return null;
                            }
                        } catch (SQLiteException e11) {
                            e = e11;
                        } catch (Exception e12) {
                            e = e12;
                            cc2.c(Log.getStackTraceString(e));
                            throw new oc2("queryEventList", e);
                        }
                    } else if (cursorRawQuery == null) {
                        return null;
                    }
                    cursorRawQuery.close();
                    return null;
                } catch (SQLiteException e13) {
                    e = e13;
                    cursor3 = null;
                    cursorRawQuery = cursor3;
                } catch (Exception e14) {
                    e = e14;
                    obj = null;
                    cc2.c(Log.getStackTraceString(e));
                    throw new oc2("queryEventList", e);
                } catch (Throwable th2) {
                    th = th2;
                    cursor2 = null;
                    cursor = cursor2;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e15) {
                e = e15;
                cursor3 = null;
            } catch (Exception e16) {
                e = e16;
                obj = null;
            } catch (Throwable th3) {
                th = th3;
                cursor2 = null;
            }
            cursorRawQuery = cursor3;
            cc2.c(Log.getStackTraceString(e));
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            m(e);
            throw new oc2("queryEventList_sql", e);
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public Object i(Class cls, String str) {
        HashMap map = (HashMap) this.c;
        co coVar = new co(7);
        HashMap map2 = (HashMap) this.b;
        for (Class cls2 : map2.keySet()) {
            ((HashMap) coVar.e).put(cls2, (jb2) map2.get(cls2));
        }
        for (cg2 cg2Var : map.keySet()) {
            ((HashMap) coVar.d).put(cg2Var, (jb2) map.get(cg2Var));
        }
        return coVar.j(new tf2(str).f(), cls);
    }

    public ArrayList j() {
        ArrayList arrayList = new ArrayList();
        Cursor cursorRawQuery = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseX = x();
                if (sQLiteDatabaseX != null) {
                    cursorRawQuery = sQLiteDatabaseX.rawQuery("SELECT * FROM ".concat("appidconfig"), null);
                    while (cursorRawQuery != null && cursorRawQuery.moveToNext()) {
                        AppIdData appIdData = new AppIdData();
                        appIdData.a = cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("appid"));
                        appIdData.b = cursorRawQuery.getString(cursorRawQuery.getColumnIndex("base"));
                        appIdData.c = cursorRawQuery.getString(cursorRawQuery.getColumnIndex("uid"));
                        appIdData.d = cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("try"));
                        arrayList.add(appIdData);
                    }
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                }
                return arrayList;
            } catch (SQLiteException e) {
                cc2.c(Log.getStackTraceString(e));
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                m(e);
                throw new oc2("getAppIdList_sql", e);
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    public void k(int i, List list) throws oc2 {
        StringBuilder sb = new StringBuilder();
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AppIdData appIdData = (AppIdData) it.next();
                rq0.f(sb, Integer.valueOf(appIdData.a));
                appIdData.d = i;
            }
            SQLiteDatabase sQLiteDatabaseX = x();
            if (sQLiteDatabaseX == null) {
                return;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("try", Integer.valueOf(i));
            sQLiteDatabaseX.update("appidconfig", contentValues, "appid IN (" + sb.toString() + ")", null);
        } catch (SQLiteException e) {
            cc2.c(Log.getStackTraceString(e));
            m(e);
            throw new oc2("updateEvents_sql", e);
        }
    }

    public void l(uq1 uq1Var) throws Throwable {
        pd2 pd2VarA;
        SparseArray sparseArray = new SparseArray();
        Cursor cursorRawQuery = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseX = x();
                if (sQLiteDatabaseX == null) {
                    return;
                }
                Cursor cursorRawQuery2 = sQLiteDatabaseX.rawQuery("SELECT * FROM appidconfig", null);
                while (cursorRawQuery2 != null) {
                    try {
                        if (!cursorRawQuery2.moveToNext()) {
                            break;
                        }
                        String string = cursorRawQuery2.getString(cursorRawQuery2.getColumnIndex("cfg"));
                        if (!TextUtils.isEmpty(string) && (pd2VarA = pd2.a(string)) != null) {
                            int i = cursorRawQuery2.getInt(cursorRawQuery2.getColumnIndex("appid"));
                            pd2VarA.a = i;
                            sparseArray.put(i, pd2VarA);
                        }
                    } catch (SQLiteException e) {
                        e = e;
                        cursorRawQuery = cursorRawQuery2;
                    } catch (Throwable th) {
                        th = th;
                        cursorRawQuery = cursorRawQuery2;
                        if (cursorRawQuery != null) {
                            cursorRawQuery.close();
                        }
                        throw th;
                    }
                }
                if (cursorRawQuery2 != null) {
                    cursorRawQuery2.close();
                }
                cursorRawQuery = sQLiteDatabaseX.rawQuery("SELECT * FROM tidconfig", null);
                while (cursorRawQuery != null && cursorRawQuery.moveToNext()) {
                    long j = cursorRawQuery.getLong(cursorRawQuery.getColumnIndex("tid"));
                    String string2 = cursorRawQuery.getString(cursorRawQuery.getColumnIndex("ev"));
                    qb2 qb2Var = new qb2();
                    qb2Var.i = cursorRawQuery.getLong(cursorRawQuery.getColumnIndex("pt"));
                    qb2Var.a(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("cf")));
                    pd2 pd2Var = (pd2) sparseArray.get(sc2.a(j));
                    if (pd2Var != null) {
                        rx1 rx1Var = new rx1();
                        rx1Var.a = j;
                        rx1Var.b = string2;
                        rx1Var.c = qb2Var;
                        pd2Var.f.add(rx1Var);
                    }
                }
                uq1Var.f(sparseArray);
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                    return;
                }
                return;
            } catch (SQLiteException e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        cc2.c(Log.getStackTraceString(e));
        if (cursorRawQuery != null) {
            cursorRawQuery.close();
        }
        m(e);
        throw new oc2("getAPPIDApp_sql", e);
    }

    public void m(SQLiteException sQLiteException) {
        ed2 ed2Var = (ed2) this.b;
        try {
            if (sQLiteException instanceof SQLiteFullException) {
                ed2Var.close();
                return;
            }
            ed2Var.close();
            ed2Var.close();
            if (ed2Var.a.delete()) {
                cc2.a("mDatabaseFile deleted");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: Code duplicated, block: B:65:0x0163  */
    /* JADX WARN: Code duplicated, block: B:67:0x0168  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v6 */
    public void n(pd2 pd2Var, boolean z) throws Throwable {
        SQLiteDatabase sQLiteDatabaseX;
        Cursor cursorRawQuery;
        ?? r5 = 0;
        r5 = 0;
        SQLiteDatabase sQLiteDatabase = null;
        try {
            try {
                sQLiteDatabaseX = x();
                if (sQLiteDatabaseX == null) {
                    if (sQLiteDatabaseX != null) {
                        sQLiteDatabaseX.endTransaction();
                        return;
                    }
                    return;
                }
                try {
                    sQLiteDatabaseX.beginTransaction();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("cfg", pd2Var.d());
                    sQLiteDatabaseX.update("appidconfig", contentValues, "appid=" + pd2Var.a, null);
                    if (z != 0) {
                        sQLiteDatabaseX.delete("tidconfig", "CAST(tid AS TEXT) LIKE ?", new String[]{pd2Var.a + "%"});
                        CopyOnWriteArrayList<rx1> copyOnWriteArrayList = pd2Var.f;
                        HashMap map = new HashMap();
                        for (rx1 rx1Var : copyOnWriteArrayList) {
                            qb2 qb2Var = rx1Var.c;
                            contentValues.clear();
                            contentValues.put("tid", Long.valueOf(rx1Var.a));
                            contentValues.put("ev", rx1Var.b);
                            contentValues.put("pt", Long.valueOf(qb2Var.i));
                            contentValues.put("cf", qb2Var.c());
                            sQLiteDatabaseX.insert("tidconfig", null, contentValues);
                            String str = rx1Var.b;
                            if (str != null) {
                                map.put(str, Long.valueOf(rx1Var.a));
                            }
                        }
                        cursorRawQuery = sQLiteDatabaseX.rawQuery("SELECT DISTINCT ext FROM events WHERE tid=" + pd2Var.a, null);
                        while (cursorRawQuery != null) {
                            try {
                                if (!cursorRawQuery.moveToNext()) {
                                    break;
                                }
                                String string = cursorRawQuery.getString(cursorRawQuery.getColumnIndex("ext"));
                                if (map.containsKey(string)) {
                                    contentValues.clear();
                                    contentValues.put("tid", (Long) map.get(string));
                                    sQLiteDatabaseX.update("events", contentValues, "tid=" + pd2Var.a + " AND ext=?", new String[]{string});
                                }
                            } catch (SQLiteException e) {
                                e = e;
                                z = cursorRawQuery;
                                cc2.c(Log.getStackTraceString(e));
                                if (z != 0) {
                                    z.close();
                                }
                                if (sQLiteDatabaseX != null) {
                                    sQLiteDatabaseX.endTransaction();
                                } else {
                                    sQLiteDatabase = sQLiteDatabaseX;
                                }
                                try {
                                    m(e);
                                    throw new oc2("updateAppConfig_sql", e);
                                } catch (Throwable th) {
                                    th = th;
                                    sQLiteDatabaseX = sQLiteDatabase;
                                    r5 = z;
                                    if (r5 != 0) {
                                        r5.close();
                                    }
                                    if (sQLiteDatabaseX != null) {
                                        sQLiteDatabaseX.endTransaction();
                                    }
                                    throw th;
                                }
                            }
                        }
                        if (cursorRawQuery != null) {
                            cursorRawQuery.close();
                        }
                    } else {
                        cursorRawQuery = null;
                    }
                    sQLiteDatabaseX.setTransactionSuccessful();
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                    sQLiteDatabaseX.endTransaction();
                } catch (SQLiteException e2) {
                    e = e2;
                    z = 0;
                } catch (Throwable th2) {
                    th = th2;
                    if (r5 != 0) {
                        r5.close();
                    }
                    if (sQLiteDatabaseX != null) {
                        sQLiteDatabaseX.endTransaction();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                r5 = z;
                if (r5 != 0) {
                    r5.close();
                }
                if (sQLiteDatabaseX != null) {
                    sQLiteDatabaseX.endTransaction();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            z = 0;
            sQLiteDatabaseX = null;
        } catch (Throwable th4) {
            th = th4;
            sQLiteDatabaseX = null;
        }
    }

    public void o(AppIdData appIdData) {
        try {
            SQLiteDatabase sQLiteDatabaseX = x();
            if (sQLiteDatabaseX == null) {
                return;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("appid", Integer.valueOf(appIdData.a));
            contentValues.put("base", appIdData.b);
            if (sQLiteDatabaseX.update("appidconfig", contentValues, "appid=" + appIdData.a, null) != 1) {
                sQLiteDatabaseX.insert("appidconfig", null, contentValues);
            }
        } catch (SQLiteException e) {
            cc2.c(Log.getStackTraceString(e));
            m(e);
            throw new oc2("addAppId_sql", e);
        }
    }

    public void p(String str, long j) throws oc2 {
        try {
            SQLiteDatabase sQLiteDatabaseX = x();
            if (sQLiteDatabaseX == null) {
                return;
            }
            sQLiteDatabaseX.execSQL("UPDATE events SET created_at = er_ts + " + j + ", boot_id = '' WHERE boot_id = '" + str + "'");
        } catch (SQLiteException e) {
            cc2.c(Log.getStackTraceString(e));
            m(e);
            throw new oc2("updateEvents_sql", e);
        }
    }

    public void q(ArrayList arrayList, uq1 uq1Var) throws Throwable {
        String strB = rq0.b(arrayList, ",");
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseX = x();
                if (sQLiteDatabaseX == null) {
                    return;
                }
                LongSparseArray longSparseArray = new LongSparseArray();
                Cursor cursorRawQuery = sQLiteDatabaseX.rawQuery("SELECT tid FROM events WHERE tid IN (" + strB + ")", null);
                while (cursorRawQuery != null) {
                    try {
                        if (!cursorRawQuery.moveToNext()) {
                            break;
                        }
                        long j = cursorRawQuery.getLong(0);
                        longSparseArray.put(j, Integer.valueOf(((Integer) longSparseArray.get(j, 0)).intValue() + 1));
                    } catch (SQLiteException e) {
                        e = e;
                        cursor = cursorRawQuery;
                    } catch (Throwable th) {
                        th = th;
                        cursor = cursorRawQuery;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                sQLiteDatabaseX.delete("events", "tid IN (" + strB + ")", null);
                if (longSparseArray.size() > 0) {
                    uq1Var.f(longSparseArray.toString());
                }
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                    return;
                }
                return;
            } catch (SQLiteException e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        cc2.c(Log.getStackTraceString(e));
        if (cursor != null) {
            cursor.close();
        }
        m(e);
        throw new oc2("cleanupEvents_off_sql", e);
    }

    public void r(LinkedList linkedList, String str) throws Throwable {
        SQLiteDatabase sQLiteDatabaseX;
        StringBuilder sb = new StringBuilder();
        SQLiteDatabase sQLiteDatabase = null;
        try {
            try {
                sQLiteDatabaseX = x();
                if (sQLiteDatabaseX == null) {
                    if (sQLiteDatabaseX != null) {
                        sQLiteDatabaseX.endTransaction();
                        return;
                    }
                    return;
                }
                try {
                    try {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("uid", str);
                        sQLiteDatabaseX.beginTransaction();
                        Iterator it = linkedList.iterator();
                        while (true) {
                            int i = 0;
                            if (!it.hasNext()) {
                                contentValues.put("try", (Integer) 0);
                                sQLiteDatabaseX.update("appidconfig", contentValues, "appid IN (" + sb.toString() + ")", null);
                                sQLiteDatabaseX.setTransactionSuccessful();
                                sQLiteDatabaseX.endTransaction();
                                return;
                            }
                            AppIdData appIdData = (AppIdData) it.next();
                            ArrayList arrayList = appIdData.e;
                            int size = arrayList.size();
                            while (i < size) {
                                Object obj = arrayList.get(i);
                                i++;
                                qc2 qc2Var = (qc2) obj;
                                sQLiteDatabaseX.update("events", contentValues, "tid=" + qc2Var.a + " AND _id>=" + qc2Var.d + " AND _id<=" + qc2Var.e, null);
                            }
                            rq0.f(sb, Integer.valueOf(appIdData.a));
                            th = th;
                            sQLiteDatabase = sQLiteDatabaseX;
                            if (sQLiteDatabase != null) {
                                sQLiteDatabase.endTransaction();
                            }
                            throw th;
                        }
                    } catch (SQLiteException e) {
                        e = e;
                        cc2.c(Log.getStackTraceString(e));
                        if (sQLiteDatabaseX != null) {
                            sQLiteDatabaseX.endTransaction();
                        } else {
                            sQLiteDatabase = sQLiteDatabaseX;
                        }
                        m(e);
                        throw new oc2("updateEvents_sql", e);
                    }
                } catch (Throwable th) {
                    th = th;
                    sQLiteDatabase = sQLiteDatabaseX;
                }
            } catch (SQLiteException e2) {
                e = e2;
                sQLiteDatabaseX = null;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // defpackage.mn2
    public void s(an2 an2Var) {
        tq2 tq2Var = (tq2) an2Var;
        ((ox1) this.c).z(new zzahd(tq2Var.b, tq2Var.a, Long.valueOf(tq2Var.c)), null, null, Boolean.valueOf(tq2Var.d), null, (rd2) this.b, this);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00af  */
    public void t(List list) throws Throwable {
        SQLiteDatabase sQLiteDatabaseX;
        StringBuilder sb = new StringBuilder();
        SQLiteDatabase sQLiteDatabase = null;
        try {
            try {
                sQLiteDatabaseX = x();
                if (sQLiteDatabaseX == null) {
                    if (sQLiteDatabaseX != null) {
                        sQLiteDatabaseX.endTransaction();
                        return;
                    }
                    return;
                }
                try {
                    try {
                        sQLiteDatabaseX.beginTransaction();
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("uid", BuildConfig.FLAVOR);
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            AppIdData appIdData = (AppIdData) it.next();
                            sQLiteDatabaseX.update("events", contentValues, "CAST(tid AS TEXT) LIKE ? AND uid=?", new String[]{appIdData.a + "%", appIdData.c});
                            rq0.f(sb, Integer.valueOf(appIdData.a));
                        }
                        contentValues.put("try", (Integer) 0);
                        sQLiteDatabaseX.update("appidconfig", contentValues, "appid IN (" + sb.toString() + ")", null);
                        sQLiteDatabaseX.setTransactionSuccessful();
                        sQLiteDatabaseX.endTransaction();
                    } catch (SQLiteException e) {
                        e = e;
                        cc2.c(Log.getStackTraceString(e));
                        if (sQLiteDatabaseX != null) {
                            sQLiteDatabaseX.endTransaction();
                        }
                        m(e);
                        throw new oc2("updateAppIdList_sql", e);
                    }
                } catch (Throwable th) {
                    th = th;
                    sQLiteDatabase = sQLiteDatabaseX;
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.endTransaction();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.endTransaction();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            sQLiteDatabaseX = null;
        }
    }

    public String toString() {
        switch (this.a) {
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                StringBuilder sb = new StringBuilder("GetFriendsResponse{friends=");
                sb.append((ArrayList) this.b);
                sb.append(", nextPageRequestToken='");
                return ts.l(sb, (String) this.c, "'}");
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0262 A[Catch: all -> 0x017b, TryCatch #11 {all -> 0x017b, blocks: (B:53:0x0120, B:55:0x0151, B:57:0x0158, B:63:0x0188, B:103:0x0259, B:105:0x0262, B:107:0x0267, B:68:0x01a2, B:70:0x01b9, B:72:0x01bd, B:75:0x01c8, B:77:0x01cc, B:80:0x01d5, B:83:0x0200, B:85:0x0209, B:87:0x0224, B:81:0x01ee, B:74:0x01c3, B:90:0x0235), top: B:122:0x0120 }] */
    /* JADX WARN: Code duplicated, block: B:107:0x0267 A[Catch: all -> 0x017b, TRY_LEAVE, TryCatch #11 {all -> 0x017b, blocks: (B:53:0x0120, B:55:0x0151, B:57:0x0158, B:63:0x0188, B:103:0x0259, B:105:0x0262, B:107:0x0267, B:68:0x01a2, B:70:0x01b9, B:72:0x01bd, B:75:0x01c8, B:77:0x01cc, B:80:0x01d5, B:83:0x0200, B:85:0x0209, B:87:0x0224, B:81:0x01ee, B:74:0x01c3, B:90:0x0235), top: B:122:0x0120 }] */
    /* JADX WARN: Code duplicated, block: B:110:0x026e  */
    /* JADX WARN: Code duplicated, block: B:116:0x0281  */
    /* JADX WARN: Code duplicated, block: B:118:0x0286  */
    public void u(List list, long j, String str, uq1 uq1Var) throws Throwable {
        Cursor cursor;
        SQLiteDatabase sQLiteDatabaseX;
        Cursor cursor2;
        SQLiteDatabase sQLiteDatabase;
        String str2;
        String str3;
        int i;
        String str4 = "_id";
        String str5 = " AND ";
        StringBuilder sb = new StringBuilder();
        SparseArray sparseArray = new SparseArray();
        Cursor cursor3 = null;
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                try {
                    rq0.f(sb, Integer.valueOf(((AppIdData) it.next()).a));
                } catch (SQLiteException e) {
                    e = e;
                    sQLiteDatabaseX = null;
                    cursor = null;
                    cursor2 = cursor;
                    cc2.c(Log.getStackTraceString(e));
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    if (sQLiteDatabaseX != null) {
                        sQLiteDatabaseX.endTransaction();
                        sQLiteDatabase = cursor;
                    } else {
                        sQLiteDatabase = sQLiteDatabaseX;
                    }
                    try {
                        m(e);
                        throw new oc2("cleanupEvents_sql", e);
                    } catch (Throwable th) {
                        th = th;
                        sQLiteDatabaseX = sQLiteDatabase;
                        cursor3 = cursor2;
                        if (cursor3 != null) {
                            cursor3.close();
                        }
                        if (sQLiteDatabaseX != null) {
                            sQLiteDatabaseX.endTransaction();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    sQLiteDatabaseX = null;
                    if (cursor3 != null) {
                        cursor3.close();
                    }
                    if (sQLiteDatabaseX != null) {
                        sQLiteDatabaseX.endTransaction();
                    }
                    throw th;
                }
            }
            sQLiteDatabaseX = x();
            if (sQLiteDatabaseX == null) {
                if (sQLiteDatabaseX != null) {
                    sQLiteDatabaseX.endTransaction();
                    return;
                }
                return;
            }
            try {
                sQLiteDatabaseX.beginTransaction();
                Cursor cursorRawQuery = sQLiteDatabaseX.rawQuery("SELECT * FROM appidconfig WHERE appid IN (" + ((Object) sb) + ")", null);
                while (true) {
                    str2 = "ext";
                    if (cursorRawQuery == null) {
                        break;
                    }
                    try {
                        try {
                            if (!cursorRawQuery.moveToNext()) {
                                break;
                            }
                            int i2 = cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("appid"));
                            if (i2 != 9999 && i2 != 1031 && i2 != 1041) {
                                int i3 = cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("cnt"));
                                String string = cursorRawQuery.getString(cursorRawQuery.getColumnIndex("date"));
                                String string2 = cursorRawQuery.getString(cursorRawQuery.getColumnIndex("ext"));
                                if (TextUtils.isEmpty(string2)) {
                                    i = 0;
                                } else {
                                    try {
                                        i = Integer.parseInt(string2);
                                    } catch (Exception e2) {
                                        e2.printStackTrace();
                                        i = 0;
                                    }
                                }
                                df2 df2Var = new df2();
                                df2Var.a = i2;
                                df2Var.b = string;
                                df2Var.c = i3;
                                df2Var.d = i;
                                sparseArray.put(i2, df2Var);
                            }
                        } catch (SQLiteException e3) {
                            e = e3;
                            cursor2 = cursorRawQuery;
                            cursor = cursor3;
                            cc2.c(Log.getStackTraceString(e));
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            if (sQLiteDatabaseX != null) {
                                sQLiteDatabaseX.endTransaction();
                                sQLiteDatabase = cursor;
                            } else {
                                sQLiteDatabase = sQLiteDatabaseX;
                            }
                            m(e);
                            throw new oc2("cleanupEvents_sql", e);
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        cursor3 = cursorRawQuery;
                        if (cursor3 != null) {
                            cursor3.close();
                        }
                        if (sQLiteDatabaseX != null) {
                            sQLiteDatabaseX.endTransaction();
                        }
                        throw th;
                    }
                }
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                try {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        AppIdData appIdData = (AppIdData) it2.next();
                        ArrayList arrayList = appIdData.e;
                        try {
                            int size = arrayList.size();
                            Iterator it3 = it2;
                            int i4 = 0;
                            int i5 = 0;
                            while (i4 < size) {
                                Object obj = arrayList.get(i4);
                                int i6 = i4 + 1;
                                qc2 qc2Var = (qc2) obj;
                                int i7 = size;
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("tid=");
                                cursor2 = cursorRawQuery;
                                String str6 = str2;
                                try {
                                    try {
                                        sb2.append(qc2Var.a);
                                        sb2.append(str5);
                                        sb2.append(str4);
                                        sb2.append(">=");
                                        sb2.append(qc2Var.d);
                                        sb2.append(str5);
                                        sb2.append(str4);
                                        sb2.append("<=");
                                        sb2.append(qc2Var.e);
                                        sQLiteDatabaseX.delete("events", sb2.toString(), null);
                                        if (qc2Var.h) {
                                            ContentValues contentValues = new ContentValues();
                                            contentValues.put("pt", Long.valueOf(j));
                                            sQLiteDatabaseX.update("tidconfig", contentValues, "tid=" + qc2Var.a, null);
                                        }
                                        i5 += qc2Var.f;
                                        size = i7;
                                        i4 = i6;
                                        cursorRawQuery = cursor2;
                                        str2 = str6;
                                        str4 = str4;
                                        str5 = str5;
                                    } catch (SQLiteException e4) {
                                        e = e4;
                                        cursor = null;
                                        cc2.c(Log.getStackTraceString(e));
                                        if (cursor2 != null) {
                                            cursor2.close();
                                        }
                                        if (sQLiteDatabaseX != null) {
                                            sQLiteDatabaseX.endTransaction();
                                            sQLiteDatabase = cursor;
                                        } else {
                                            sQLiteDatabase = sQLiteDatabaseX;
                                        }
                                        m(e);
                                        throw new oc2("cleanupEvents_sql", e);
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    cursor3 = cursor2;
                                    if (cursor3 != null) {
                                        cursor3.close();
                                    }
                                    if (sQLiteDatabaseX != null) {
                                        sQLiteDatabaseX.endTransaction();
                                    }
                                    throw th;
                                }
                            }
                            String str7 = str4;
                            String str8 = str5;
                            cursor2 = cursorRawQuery;
                            String str9 = str2;
                            ContentValues contentValues2 = new ContentValues();
                            df2 df2Var2 = (df2) sparseArray.get(appIdData.a);
                            if (df2Var2 != null) {
                                String str10 = df2Var2.b;
                                if (str10 == null || str10.equals(str)) {
                                    sparseArray.remove(appIdData.a);
                                }
                                String str11 = df2Var2.b;
                                if (str11 == null || !str11.equals(str)) {
                                    str3 = str9;
                                    contentValues2.put("date", str);
                                    contentValues2.put("cnt", Integer.valueOf(i5));
                                    contentValues2.put(str3, "1");
                                } else {
                                    contentValues2.put("cnt", Integer.valueOf(df2Var2.c + i5));
                                    str3 = str9;
                                    contentValues2.put(str3, String.valueOf(df2Var2.d + 1));
                                }
                            } else {
                                str3 = str9;
                            }
                            contentValues2.put("uid", BuildConfig.FLAVOR);
                            contentValues2.put("try", (Integer) 0);
                            cursor = null;
                            try {
                                sQLiteDatabaseX.update("appidconfig", contentValues2, "appid=" + appIdData.a, null);
                                str2 = str3;
                                cursor3 = null;
                                cursorRawQuery = cursor2;
                                str4 = str7;
                                str5 = str8;
                                it2 = it3;
                            } catch (SQLiteException e5) {
                                e = e5;
                                cc2.c(Log.getStackTraceString(e));
                                if (cursor2 != null) {
                                    cursor2.close();
                                }
                                if (sQLiteDatabaseX != null) {
                                    sQLiteDatabaseX.endTransaction();
                                    sQLiteDatabase = cursor;
                                } else {
                                    sQLiteDatabase = sQLiteDatabaseX;
                                }
                                m(e);
                                throw new oc2("cleanupEvents_sql", e);
                            }
                        } catch (SQLiteException e6) {
                            e = e6;
                            cursor2 = cursorRawQuery;
                        }
                    }
                    cursor2 = cursorRawQuery;
                    cursor = cursor3;
                    sQLiteDatabaseX.setTransactionSuccessful();
                    uq1Var.f(sparseArray);
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    sQLiteDatabaseX.endTransaction();
                } catch (Throwable th5) {
                    th = th5;
                    cursor2 = cursorRawQuery;
                    cursor3 = cursor2;
                    if (cursor3 != null) {
                        cursor3.close();
                    }
                    if (sQLiteDatabaseX != null) {
                        sQLiteDatabaseX.endTransaction();
                    }
                    throw th;
                }
            } catch (SQLiteException e7) {
                e = e7;
                cursor = null;
                cursor2 = cursor;
                cc2.c(Log.getStackTraceString(e));
                if (cursor2 != null) {
                    cursor2.close();
                }
                if (sQLiteDatabaseX != null) {
                    sQLiteDatabaseX.endTransaction();
                    sQLiteDatabase = cursor;
                } else {
                    sQLiteDatabase = sQLiteDatabaseX;
                }
                m(e);
                throw new oc2("cleanupEvents_sql", e);
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (SQLiteException e8) {
            e = e8;
            cursor = null;
            sQLiteDatabaseX = null;
            cursor2 = null;
        } catch (Throwable th7) {
            th = th7;
        }
    }

    public boolean v(int i) throws oc2 {
        try {
            SQLiteDatabase sQLiteDatabaseX = x();
            if (sQLiteDatabaseX == null) {
                return false;
            }
            sQLiteDatabaseX.delete("events", "CAST(tid AS TEXT) LIKE ?", new String[]{i + "%"});
            return true;
        } catch (SQLiteException e) {
            cc2.c(Log.getStackTraceString(e));
            m(e);
            throw new oc2("cleanupEvents_del_sql", e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:137:0x01ec A[Catch: all -> 0x01f0, TryCatch #8 {all -> 0x01f0, blocks: (B:135:0x01e3, B:137:0x01ec, B:141:0x01f7), top: B:154:0x01e3 }] */
    /* JADX WARN: Code duplicated, block: B:141:0x01f7 A[Catch: all -> 0x01f0, TRY_LEAVE, TryCatch #8 {all -> 0x01f0, blocks: (B:135:0x01e3, B:137:0x01ec, B:141:0x01f7), top: B:154:0x01e3 }] */
    /* JADX WARN: Code duplicated, block: B:143:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:147:0x020a  */
    /* JADX WARN: Code duplicated, block: B:149:0x020f  */
    /* JADX WARN: Code duplicated, block: B:152:0x0218  */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0158: MOVE (r17 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:345), block:B:81:0x0158 */
    public int w(ArrayList arrayList, h51 h51Var) throws Throwable {
        Cursor cursor;
        SQLiteDatabase sQLiteDatabase;
        Cursor cursor2;
        SQLiteDatabase sQLiteDatabaseX;
        Cursor cursorRawQuery;
        SQLiteDatabase sQLiteDatabase2;
        SQLiteDatabase sQLiteDatabase3;
        int i;
        Cursor cursor3;
        SQLiteDatabase sQLiteDatabase4;
        ed2 ed2Var = (ed2) this.b;
        HashSet hashSet = new HashSet();
        try {
            try {
                sQLiteDatabaseX = x();
                int i2 = 0;
                if (sQLiteDatabaseX == null) {
                    if (sQLiteDatabaseX != null) {
                        sQLiteDatabaseX.endTransaction();
                    }
                    if (ed2Var.a()) {
                        cc2.c("There is not enough space left");
                    }
                    return 0;
                }
                try {
                    sQLiteDatabaseX.beginTransaction();
                    ContentValues contentValues = new ContentValues();
                    int size = arrayList.size();
                    int i3 = 0;
                    while (i3 < size) {
                        try {
                            try {
                                Object obj = arrayList.get(i3);
                                i3++;
                                dz1 dz1Var = (dz1) obj;
                                JSONObject jSONObject = dz1Var.b;
                                try {
                                    Pair pairD = ld2.f().a.d();
                                    int i4 = i2;
                                    Integer num = (Integer) pairD.first;
                                    num.getClass();
                                    String strC = x91.c((byte[]) pairD.second, jSONObject.toString());
                                    if (strC != null) {
                                        contentValues.clear();
                                        sQLiteDatabase = sQLiteDatabaseX;
                                        try {
                                            contentValues.put("tid", Long.valueOf(dz1Var.d));
                                            contentValues.put("event", strC);
                                            contentValues.put("et", Integer.valueOf(i4));
                                            contentValues.put("pi", num);
                                            contentValues.put("created_at", Long.valueOf(dz1Var.f));
                                            if (dz1Var.h != null) {
                                                try {
                                                    contentValues.put("er_ts", Long.valueOf(dz1Var.g));
                                                    contentValues.put("boot_id", dz1Var.h);
                                                } catch (SQLiteException e) {
                                                    e = e;
                                                    sQLiteDatabaseX = sQLiteDatabase;
                                                    cursorRawQuery = null;
                                                    cursor2 = null;
                                                    try {
                                                        cc2.c(Log.getStackTraceString(e));
                                                        if (cursorRawQuery != null) {
                                                            cursorRawQuery.close();
                                                        }
                                                        if (sQLiteDatabaseX != null) {
                                                            sQLiteDatabaseX.endTransaction();
                                                        }
                                                        m(e);
                                                        throw new oc2("addJSON_sql", e);
                                                    } catch (Throwable th) {
                                                        th = th;
                                                        sQLiteDatabase = sQLiteDatabaseX;
                                                        cursor = cursorRawQuery;
                                                        if (cursor != null) {
                                                            cursor.close();
                                                        }
                                                        if (sQLiteDatabase != null) {
                                                            sQLiteDatabase.endTransaction();
                                                        }
                                                        if (ed2Var.a()) {
                                                            cc2.c("There is not enough space left");
                                                        }
                                                        throw th;
                                                    }
                                                } catch (Exception e2) {
                                                    e = e2;
                                                    cursor = null;
                                                    try {
                                                        cc2.c(Log.getStackTraceString(e));
                                                        throw new oc2("addJSON", e);
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        if (cursor != null) {
                                                            cursor.close();
                                                        }
                                                        if (sQLiteDatabase != null) {
                                                            sQLiteDatabase.endTransaction();
                                                        }
                                                        if (ed2Var.a()) {
                                                            cc2.c("There is not enough space left");
                                                        }
                                                        throw th;
                                                    }
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    cursor = null;
                                                    if (cursor != null) {
                                                        cursor.close();
                                                    }
                                                    if (sQLiteDatabase != null) {
                                                        sQLiteDatabase.endTransaction();
                                                    }
                                                    if (ed2Var.a()) {
                                                        cc2.c("There is not enough space left");
                                                    }
                                                    throw th;
                                                }
                                            }
                                            sQLiteDatabase4 = sQLiteDatabase;
                                            try {
                                                if (sQLiteDatabase4.insert("events", null, contentValues) > 0) {
                                                    hashSet.add(Long.valueOf(dz1Var.d));
                                                }
                                                sQLiteDatabaseX = sQLiteDatabase4;
                                            } catch (SQLiteException e3) {
                                                e = e3;
                                                sQLiteDatabaseX = sQLiteDatabase4;
                                                cursorRawQuery = null;
                                                cursor2 = null;
                                                cc2.c(Log.getStackTraceString(e));
                                                if (cursorRawQuery != null) {
                                                    cursorRawQuery.close();
                                                }
                                                if (sQLiteDatabaseX != null) {
                                                    sQLiteDatabaseX.endTransaction();
                                                }
                                                m(e);
                                                throw new oc2("addJSON_sql", e);
                                            } catch (Exception e4) {
                                                e = e4;
                                                sQLiteDatabase = sQLiteDatabase4;
                                                cursor = null;
                                                cc2.c(Log.getStackTraceString(e));
                                                throw new oc2("addJSON", e);
                                            } catch (Throwable th4) {
                                                th = th4;
                                                sQLiteDatabase = sQLiteDatabase4;
                                                cursor = null;
                                                if (cursor != null) {
                                                    cursor.close();
                                                }
                                                if (sQLiteDatabase != null) {
                                                    sQLiteDatabase.endTransaction();
                                                }
                                                if (ed2Var.a()) {
                                                    cc2.c("There is not enough space left");
                                                }
                                                throw th;
                                            }
                                        } catch (SQLiteException e5) {
                                            e = e5;
                                            sQLiteDatabase4 = sQLiteDatabase;
                                        } catch (Exception e6) {
                                            e = e6;
                                        } catch (Throwable th5) {
                                            th = th5;
                                        }
                                    }
                                    i2 = i4;
                                } catch (SQLiteException e7) {
                                    e = e7;
                                    sQLiteDatabase4 = sQLiteDatabaseX;
                                }
                            } catch (SQLiteException e8) {
                                e = e8;
                            }
                        } catch (Exception e9) {
                            e = e9;
                            sQLiteDatabase4 = sQLiteDatabaseX;
                        } catch (Throwable th6) {
                            th = th6;
                            sQLiteDatabase4 = sQLiteDatabaseX;
                        }
                    }
                    sQLiteDatabase3 = sQLiteDatabaseX;
                    int i5 = i2;
                    try {
                        if (hashSet.size() > 0) {
                            LongSparseArray longSparseArray = new LongSparseArray();
                            cursor2 = null;
                            try {
                                cursorRawQuery = sQLiteDatabase3.rawQuery("SELECT tid,COUNT(*) FROM events WHERE tid IN (" + rq0.b(hashSet, ",") + ") GROUP BY tid", null);
                                int i6 = i5;
                                while (cursorRawQuery != null) {
                                    try {
                                        if (!cursorRawQuery.moveToNext()) {
                                            break;
                                        }
                                        int i7 = i5;
                                        longSparseArray.put(cursorRawQuery.getLong(i7), Integer.valueOf(cursorRawQuery.getInt(1)));
                                        i6++;
                                        i5 = i7;
                                    } catch (SQLiteException e10) {
                                        e = e10;
                                        sQLiteDatabaseX = sQLiteDatabase3;
                                        cc2.c(Log.getStackTraceString(e));
                                        if (cursorRawQuery != null) {
                                            cursorRawQuery.close();
                                        }
                                        if (sQLiteDatabaseX != null) {
                                            sQLiteDatabaseX.endTransaction();
                                        }
                                        m(e);
                                        throw new oc2("addJSON_sql", e);
                                    } catch (Exception e11) {
                                        e = e11;
                                        sQLiteDatabase = sQLiteDatabase3;
                                        cursor = cursorRawQuery;
                                        cc2.c(Log.getStackTraceString(e));
                                        throw new oc2("addJSON", e);
                                    }
                                }
                                if (longSparseArray.size() > 0) {
                                    h51Var.f(longSparseArray);
                                }
                                cursor3 = cursorRawQuery;
                                i = i6;
                            } catch (SQLiteException e12) {
                                e = e12;
                                sQLiteDatabaseX = sQLiteDatabase3;
                                cursorRawQuery = cursor2;
                                cc2.c(Log.getStackTraceString(e));
                                if (cursorRawQuery != null) {
                                    cursorRawQuery.close();
                                }
                                if (sQLiteDatabaseX != null) {
                                    sQLiteDatabaseX.endTransaction();
                                }
                                m(e);
                                throw new oc2("addJSON_sql", e);
                            } catch (Exception e13) {
                                e = e13;
                                sQLiteDatabase = sQLiteDatabase3;
                                cursor = cursor2;
                                cc2.c(Log.getStackTraceString(e));
                                throw new oc2("addJSON", e);
                            } catch (Throwable th7) {
                                th = th7;
                                sQLiteDatabase = sQLiteDatabase3;
                                cursor = cursor2;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                if (sQLiteDatabase != null) {
                                    sQLiteDatabase.endTransaction();
                                }
                                if (ed2Var.a()) {
                                    cc2.c("There is not enough space left");
                                }
                                throw th;
                            }
                        } else {
                            cursor2 = null;
                            i = i5;
                            cursor3 = null;
                        }
                        try {
                            sQLiteDatabase3.setTransactionSuccessful();
                            if (cursor3 != null) {
                                cursor3.close();
                            }
                            sQLiteDatabase3.endTransaction();
                            if (!ed2Var.a()) {
                                return i;
                            }
                            cc2.c("There is not enough space left");
                            return -2;
                        } catch (SQLiteException e14) {
                            e = e14;
                            cursorRawQuery = cursor3;
                            sQLiteDatabaseX = sQLiteDatabase3;
                            cc2.c(Log.getStackTraceString(e));
                            if (cursorRawQuery != null) {
                                cursorRawQuery.close();
                            }
                            if (sQLiteDatabaseX != null) {
                                sQLiteDatabaseX.endTransaction();
                            }
                            m(e);
                            throw new oc2("addJSON_sql", e);
                        } catch (Exception e15) {
                            e = e15;
                            sQLiteDatabase = sQLiteDatabase3;
                            cursor = cursor3;
                            cc2.c(Log.getStackTraceString(e));
                            throw new oc2("addJSON", e);
                        } catch (Throwable th8) {
                            th = th8;
                            sQLiteDatabase = sQLiteDatabase3;
                            cursor = cursor3;
                            if (cursor != null) {
                                cursor.close();
                            }
                            if (sQLiteDatabase != null) {
                                sQLiteDatabase.endTransaction();
                            }
                            if (ed2Var.a()) {
                                cc2.c("There is not enough space left");
                            }
                            throw th;
                        }
                    } catch (SQLiteException e16) {
                        e = e16;
                        cursor2 = null;
                    } catch (Exception e17) {
                        e = e17;
                        cursor2 = null;
                        sQLiteDatabase = sQLiteDatabase3;
                        cursor = cursor2;
                        cc2.c(Log.getStackTraceString(e));
                        throw new oc2("addJSON", e);
                    } catch (Throwable th9) {
                        th = th9;
                        cursor2 = null;
                        sQLiteDatabase = sQLiteDatabase3;
                        cursor = cursor2;
                        if (cursor != null) {
                            cursor.close();
                        }
                        if (sQLiteDatabase != null) {
                            sQLiteDatabase.endTransaction();
                        }
                        if (ed2Var.a()) {
                            cc2.c("There is not enough space left");
                        }
                        throw th;
                    }
                } catch (SQLiteException e18) {
                    e = e18;
                    cursor2 = null;
                } catch (Exception e19) {
                    e = e19;
                    sQLiteDatabase3 = sQLiteDatabaseX;
                } catch (Throwable th10) {
                    th = th10;
                    sQLiteDatabase3 = sQLiteDatabaseX;
                }
            } catch (Throwable th11) {
                th = th11;
                sQLiteDatabase = sQLiteDatabase2;
                cursor = cursorRawQuery;
                if (cursor != null) {
                    cursor.close();
                }
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.endTransaction();
                }
                if (ed2Var.a()) {
                    cc2.c("There is not enough space left");
                }
                throw th;
            }
        } catch (SQLiteException e20) {
            e = e20;
            cursor2 = null;
            sQLiteDatabaseX = null;
            cursorRawQuery = null;
        } catch (Exception e21) {
            e = e21;
            cursor = null;
            sQLiteDatabase = null;
        } catch (Throwable th12) {
            th = th12;
            cursor = null;
            sQLiteDatabase = null;
        }
    }

    public SQLiteDatabase x() {
        ed2 ed2Var = (ed2) this.b;
        try {
            if (!((Context) this.c).getDatabasePath("athena.db").exists()) {
                ed2Var.close();
            }
            return ed2Var.getWritableDatabase();
        } catch (SQLiteException e) {
            cc2.c(Log.getStackTraceString(e));
            return null;
        }
    }

    public File y() {
        if (((File) this.b) == null) {
            synchronized (this) {
                try {
                    if (((File) this.b) == null) {
                        String str = "PersistedInstallation." + ((hc0) this.c).f() + ".json";
                        hc0 hc0Var = (hc0) this.c;
                        hc0Var.a();
                        File file = new File(hc0Var.a.getNoBackupFilesDir(), str);
                        this.b = file;
                        if (file.exists()) {
                            return (File) this.b;
                        }
                        hc0 hc0Var2 = (hc0) this.c;
                        hc0Var2.a();
                        File file2 = new File(hc0Var2.a.getFilesDir(), str);
                        if (file2.exists() && !file2.renameTo((File) this.b)) {
                            Log.e("PersistedInstallation", "Unable to move the file from back up to non back up directory", new IOException("Unable to move the file from back up to non back up directory"));
                            return file2;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return (File) this.b;
    }

    public String z(String str) {
        String str2 = (String) this.c;
        Resources resources = (Resources) this.b;
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    @Override // defpackage.mn2
    public void zza(String str) {
        ((rd2) this.b).a(kv.m0(str));
    }

    public /* synthetic */ rc2(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ rc2(Object obj, int i) {
        this.a = i;
        this.c = obj;
    }

    public rc2() {
        this.a = 8;
        this.b = new HashMap();
        this.c = new HashMap();
    }

    public rc2(ox1 ox1Var, rd2 rd2Var) {
        this.a = 9;
        this.b = rd2Var;
        Objects.requireNonNull(ox1Var);
        this.c = ox1Var;
    }

    public rc2(Context context) {
        this.a = 7;
        gu2.o(context);
        Resources resources = context.getResources();
        this.b = resources;
        this.c = resources.getResourcePackageName(2131886178);
    }

    public /* synthetic */ rc2(int i) {
        this.a = i;
    }

    public rc2(ConstraintLayout constraintLayout, ProgressBar progressBar, Toolbar toolbar) {
        this.a = 1;
        this.b = progressBar;
        this.c = toolbar;
    }
}
