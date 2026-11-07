package defpackage;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import com.hjq.toast.BuildConfig;
import java.io.DataOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class zc2 extends nc2 {
    public final pd2 c;
    public long d;
    public final int e;
    public final ox1 f;

    public zc2(pd2 pd2Var, long j, ox1 ox1Var) {
        Context context = hc.h;
        StringBuilder sb = new StringBuilder();
        try {
            String strW = nj2.w(context);
            sb.append(Build.MODEL);
            sb.append(Build.BRAND);
            sb.append(nj2.C(context));
            sb.append(Build.VERSION.RELEASE);
            sb.append(nj2.B(context));
            sb.append(nj2.x(context));
            sb.append(Locale.getDefault().getLanguage());
            sb.append(strW == null ? BuildConfig.FLAVOR : strW);
        } catch (Exception e) {
            cc2.c(Log.getStackTraceString(e));
        }
        int iHashCode = sb.toString().hashCode();
        this.e = iHashCode;
        if (pd2Var.d > 0 && iHashCode != pd2Var.e) {
            cc2.e("dimensionChanged, so set appConfig version to 0");
            pd2Var.d = 0L;
        }
        this.c = pd2Var;
        this.d = j;
        this.f = ox1Var;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x029c  */
    /* JADX WARN: Code duplicated, block: B:105:0x02a5 A[Catch: Exception -> 0x0299, TryCatch #3 {Exception -> 0x0299, blocks: (B:97:0x0284, B:99:0x028f, B:103:0x029f, B:105:0x02a5, B:106:0x02ab, B:108:0x02b1, B:109:0x02b7, B:111:0x02bd, B:112:0x02c3, B:114:0x02c9, B:115:0x02cf, B:117:0x02d5, B:119:0x02df, B:120:0x02e9, B:122:0x02ef, B:123:0x0302, B:125:0x0308, B:126:0x0310, B:128:0x0316, B:134:0x033b, B:135:0x034c, B:137:0x0359, B:140:0x0362, B:142:0x0366, B:144:0x0373, B:145:0x0377, B:147:0x0387, B:148:0x038b, B:150:0x039c, B:151:0x03a0, B:153:0x03ae, B:154:0x03b2, B:156:0x03c4, B:157:0x03c8, B:159:0x03d8, B:160:0x03dc, B:162:0x03ed, B:163:0x03f1, B:165:0x040b, B:166:0x040f, B:168:0x041e, B:169:0x0422, B:171:0x0435, B:172:0x0439, B:174:0x044c, B:175:0x0450, B:141:0x0365, B:176:0x0470, B:177:0x0497, B:179:0x049f, B:180:0x04a7, B:182:0x04ad, B:184:0x04c5, B:186:0x04ca, B:189:0x04db, B:196:0x04f8, B:192:0x04e6), top: B:216:0x0284 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x02b1 A[Catch: Exception -> 0x0299, TryCatch #3 {Exception -> 0x0299, blocks: (B:97:0x0284, B:99:0x028f, B:103:0x029f, B:105:0x02a5, B:106:0x02ab, B:108:0x02b1, B:109:0x02b7, B:111:0x02bd, B:112:0x02c3, B:114:0x02c9, B:115:0x02cf, B:117:0x02d5, B:119:0x02df, B:120:0x02e9, B:122:0x02ef, B:123:0x0302, B:125:0x0308, B:126:0x0310, B:128:0x0316, B:134:0x033b, B:135:0x034c, B:137:0x0359, B:140:0x0362, B:142:0x0366, B:144:0x0373, B:145:0x0377, B:147:0x0387, B:148:0x038b, B:150:0x039c, B:151:0x03a0, B:153:0x03ae, B:154:0x03b2, B:156:0x03c4, B:157:0x03c8, B:159:0x03d8, B:160:0x03dc, B:162:0x03ed, B:163:0x03f1, B:165:0x040b, B:166:0x040f, B:168:0x041e, B:169:0x0422, B:171:0x0435, B:172:0x0439, B:174:0x044c, B:175:0x0450, B:141:0x0365, B:176:0x0470, B:177:0x0497, B:179:0x049f, B:180:0x04a7, B:182:0x04ad, B:184:0x04c5, B:186:0x04ca, B:189:0x04db, B:196:0x04f8, B:192:0x04e6), top: B:216:0x0284 }] */
    /* JADX WARN: Code duplicated, block: B:111:0x02bd A[Catch: Exception -> 0x0299, TryCatch #3 {Exception -> 0x0299, blocks: (B:97:0x0284, B:99:0x028f, B:103:0x029f, B:105:0x02a5, B:106:0x02ab, B:108:0x02b1, B:109:0x02b7, B:111:0x02bd, B:112:0x02c3, B:114:0x02c9, B:115:0x02cf, B:117:0x02d5, B:119:0x02df, B:120:0x02e9, B:122:0x02ef, B:123:0x0302, B:125:0x0308, B:126:0x0310, B:128:0x0316, B:134:0x033b, B:135:0x034c, B:137:0x0359, B:140:0x0362, B:142:0x0366, B:144:0x0373, B:145:0x0377, B:147:0x0387, B:148:0x038b, B:150:0x039c, B:151:0x03a0, B:153:0x03ae, B:154:0x03b2, B:156:0x03c4, B:157:0x03c8, B:159:0x03d8, B:160:0x03dc, B:162:0x03ed, B:163:0x03f1, B:165:0x040b, B:166:0x040f, B:168:0x041e, B:169:0x0422, B:171:0x0435, B:172:0x0439, B:174:0x044c, B:175:0x0450, B:141:0x0365, B:176:0x0470, B:177:0x0497, B:179:0x049f, B:180:0x04a7, B:182:0x04ad, B:184:0x04c5, B:186:0x04ca, B:189:0x04db, B:196:0x04f8, B:192:0x04e6), top: B:216:0x0284 }] */
    /* JADX WARN: Code duplicated, block: B:114:0x02c9 A[Catch: Exception -> 0x0299, TryCatch #3 {Exception -> 0x0299, blocks: (B:97:0x0284, B:99:0x028f, B:103:0x029f, B:105:0x02a5, B:106:0x02ab, B:108:0x02b1, B:109:0x02b7, B:111:0x02bd, B:112:0x02c3, B:114:0x02c9, B:115:0x02cf, B:117:0x02d5, B:119:0x02df, B:120:0x02e9, B:122:0x02ef, B:123:0x0302, B:125:0x0308, B:126:0x0310, B:128:0x0316, B:134:0x033b, B:135:0x034c, B:137:0x0359, B:140:0x0362, B:142:0x0366, B:144:0x0373, B:145:0x0377, B:147:0x0387, B:148:0x038b, B:150:0x039c, B:151:0x03a0, B:153:0x03ae, B:154:0x03b2, B:156:0x03c4, B:157:0x03c8, B:159:0x03d8, B:160:0x03dc, B:162:0x03ed, B:163:0x03f1, B:165:0x040b, B:166:0x040f, B:168:0x041e, B:169:0x0422, B:171:0x0435, B:172:0x0439, B:174:0x044c, B:175:0x0450, B:141:0x0365, B:176:0x0470, B:177:0x0497, B:179:0x049f, B:180:0x04a7, B:182:0x04ad, B:184:0x04c5, B:186:0x04ca, B:189:0x04db, B:196:0x04f8, B:192:0x04e6), top: B:216:0x0284 }] */
    /* JADX WARN: Code duplicated, block: B:117:0x02d5 A[Catch: Exception -> 0x0299, TryCatch #3 {Exception -> 0x0299, blocks: (B:97:0x0284, B:99:0x028f, B:103:0x029f, B:105:0x02a5, B:106:0x02ab, B:108:0x02b1, B:109:0x02b7, B:111:0x02bd, B:112:0x02c3, B:114:0x02c9, B:115:0x02cf, B:117:0x02d5, B:119:0x02df, B:120:0x02e9, B:122:0x02ef, B:123:0x0302, B:125:0x0308, B:126:0x0310, B:128:0x0316, B:134:0x033b, B:135:0x034c, B:137:0x0359, B:140:0x0362, B:142:0x0366, B:144:0x0373, B:145:0x0377, B:147:0x0387, B:148:0x038b, B:150:0x039c, B:151:0x03a0, B:153:0x03ae, B:154:0x03b2, B:156:0x03c4, B:157:0x03c8, B:159:0x03d8, B:160:0x03dc, B:162:0x03ed, B:163:0x03f1, B:165:0x040b, B:166:0x040f, B:168:0x041e, B:169:0x0422, B:171:0x0435, B:172:0x0439, B:174:0x044c, B:175:0x0450, B:141:0x0365, B:176:0x0470, B:177:0x0497, B:179:0x049f, B:180:0x04a7, B:182:0x04ad, B:184:0x04c5, B:186:0x04ca, B:189:0x04db, B:196:0x04f8, B:192:0x04e6), top: B:216:0x0284 }] */
    /* JADX WARN: Code duplicated, block: B:119:0x02df A[Catch: Exception -> 0x0299, TryCatch #3 {Exception -> 0x0299, blocks: (B:97:0x0284, B:99:0x028f, B:103:0x029f, B:105:0x02a5, B:106:0x02ab, B:108:0x02b1, B:109:0x02b7, B:111:0x02bd, B:112:0x02c3, B:114:0x02c9, B:115:0x02cf, B:117:0x02d5, B:119:0x02df, B:120:0x02e9, B:122:0x02ef, B:123:0x0302, B:125:0x0308, B:126:0x0310, B:128:0x0316, B:134:0x033b, B:135:0x034c, B:137:0x0359, B:140:0x0362, B:142:0x0366, B:144:0x0373, B:145:0x0377, B:147:0x0387, B:148:0x038b, B:150:0x039c, B:151:0x03a0, B:153:0x03ae, B:154:0x03b2, B:156:0x03c4, B:157:0x03c8, B:159:0x03d8, B:160:0x03dc, B:162:0x03ed, B:163:0x03f1, B:165:0x040b, B:166:0x040f, B:168:0x041e, B:169:0x0422, B:171:0x0435, B:172:0x0439, B:174:0x044c, B:175:0x0450, B:141:0x0365, B:176:0x0470, B:177:0x0497, B:179:0x049f, B:180:0x04a7, B:182:0x04ad, B:184:0x04c5, B:186:0x04ca, B:189:0x04db, B:196:0x04f8, B:192:0x04e6), top: B:216:0x0284 }] */
    /* JADX WARN: Code duplicated, block: B:122:0x02ef A[Catch: Exception -> 0x0299, TryCatch #3 {Exception -> 0x0299, blocks: (B:97:0x0284, B:99:0x028f, B:103:0x029f, B:105:0x02a5, B:106:0x02ab, B:108:0x02b1, B:109:0x02b7, B:111:0x02bd, B:112:0x02c3, B:114:0x02c9, B:115:0x02cf, B:117:0x02d5, B:119:0x02df, B:120:0x02e9, B:122:0x02ef, B:123:0x0302, B:125:0x0308, B:126:0x0310, B:128:0x0316, B:134:0x033b, B:135:0x034c, B:137:0x0359, B:140:0x0362, B:142:0x0366, B:144:0x0373, B:145:0x0377, B:147:0x0387, B:148:0x038b, B:150:0x039c, B:151:0x03a0, B:153:0x03ae, B:154:0x03b2, B:156:0x03c4, B:157:0x03c8, B:159:0x03d8, B:160:0x03dc, B:162:0x03ed, B:163:0x03f1, B:165:0x040b, B:166:0x040f, B:168:0x041e, B:169:0x0422, B:171:0x0435, B:172:0x0439, B:174:0x044c, B:175:0x0450, B:141:0x0365, B:176:0x0470, B:177:0x0497, B:179:0x049f, B:180:0x04a7, B:182:0x04ad, B:184:0x04c5, B:186:0x04ca, B:189:0x04db, B:196:0x04f8, B:192:0x04e6), top: B:216:0x0284 }] */
    /* JADX WARN: Code duplicated, block: B:125:0x0308 A[Catch: Exception -> 0x0299, TryCatch #3 {Exception -> 0x0299, blocks: (B:97:0x0284, B:99:0x028f, B:103:0x029f, B:105:0x02a5, B:106:0x02ab, B:108:0x02b1, B:109:0x02b7, B:111:0x02bd, B:112:0x02c3, B:114:0x02c9, B:115:0x02cf, B:117:0x02d5, B:119:0x02df, B:120:0x02e9, B:122:0x02ef, B:123:0x0302, B:125:0x0308, B:126:0x0310, B:128:0x0316, B:134:0x033b, B:135:0x034c, B:137:0x0359, B:140:0x0362, B:142:0x0366, B:144:0x0373, B:145:0x0377, B:147:0x0387, B:148:0x038b, B:150:0x039c, B:151:0x03a0, B:153:0x03ae, B:154:0x03b2, B:156:0x03c4, B:157:0x03c8, B:159:0x03d8, B:160:0x03dc, B:162:0x03ed, B:163:0x03f1, B:165:0x040b, B:166:0x040f, B:168:0x041e, B:169:0x0422, B:171:0x0435, B:172:0x0439, B:174:0x044c, B:175:0x0450, B:141:0x0365, B:176:0x0470, B:177:0x0497, B:179:0x049f, B:180:0x04a7, B:182:0x04ad, B:184:0x04c5, B:186:0x04ca, B:189:0x04db, B:196:0x04f8, B:192:0x04e6), top: B:216:0x0284 }] */
    /* JADX WARN: Code duplicated, block: B:128:0x0316 A[Catch: Exception -> 0x0299, TryCatch #3 {Exception -> 0x0299, blocks: (B:97:0x0284, B:99:0x028f, B:103:0x029f, B:105:0x02a5, B:106:0x02ab, B:108:0x02b1, B:109:0x02b7, B:111:0x02bd, B:112:0x02c3, B:114:0x02c9, B:115:0x02cf, B:117:0x02d5, B:119:0x02df, B:120:0x02e9, B:122:0x02ef, B:123:0x0302, B:125:0x0308, B:126:0x0310, B:128:0x0316, B:134:0x033b, B:135:0x034c, B:137:0x0359, B:140:0x0362, B:142:0x0366, B:144:0x0373, B:145:0x0377, B:147:0x0387, B:148:0x038b, B:150:0x039c, B:151:0x03a0, B:153:0x03ae, B:154:0x03b2, B:156:0x03c4, B:157:0x03c8, B:159:0x03d8, B:160:0x03dc, B:162:0x03ed, B:163:0x03f1, B:165:0x040b, B:166:0x040f, B:168:0x041e, B:169:0x0422, B:171:0x0435, B:172:0x0439, B:174:0x044c, B:175:0x0450, B:141:0x0365, B:176:0x0470, B:177:0x0497, B:179:0x049f, B:180:0x04a7, B:182:0x04ad, B:184:0x04c5, B:186:0x04ca, B:189:0x04db, B:196:0x04f8, B:192:0x04e6), top: B:216:0x0284 }] */
    /* JADX WARN: Code duplicated, block: B:131:0x032b A[LOOP:2: B:126:0x0310->B:131:0x032b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:134:0x033b A[Catch: Exception -> 0x0299, TryCatch #3 {Exception -> 0x0299, blocks: (B:97:0x0284, B:99:0x028f, B:103:0x029f, B:105:0x02a5, B:106:0x02ab, B:108:0x02b1, B:109:0x02b7, B:111:0x02bd, B:112:0x02c3, B:114:0x02c9, B:115:0x02cf, B:117:0x02d5, B:119:0x02df, B:120:0x02e9, B:122:0x02ef, B:123:0x0302, B:125:0x0308, B:126:0x0310, B:128:0x0316, B:134:0x033b, B:135:0x034c, B:137:0x0359, B:140:0x0362, B:142:0x0366, B:144:0x0373, B:145:0x0377, B:147:0x0387, B:148:0x038b, B:150:0x039c, B:151:0x03a0, B:153:0x03ae, B:154:0x03b2, B:156:0x03c4, B:157:0x03c8, B:159:0x03d8, B:160:0x03dc, B:162:0x03ed, B:163:0x03f1, B:165:0x040b, B:166:0x040f, B:168:0x041e, B:169:0x0422, B:171:0x0435, B:172:0x0439, B:174:0x044c, B:175:0x0450, B:141:0x0365, B:176:0x0470, B:177:0x0497, B:179:0x049f, B:180:0x04a7, B:182:0x04ad, B:184:0x04c5, B:186:0x04ca, B:189:0x04db, B:196:0x04f8, B:192:0x04e6), top: B:216:0x0284 }] */
    /* JADX WARN: Code duplicated, block: B:137:0x0359 A[Catch: Exception -> 0x0299, TryCatch #3 {Exception -> 0x0299, blocks: (B:97:0x0284, B:99:0x028f, B:103:0x029f, B:105:0x02a5, B:106:0x02ab, B:108:0x02b1, B:109:0x02b7, B:111:0x02bd, B:112:0x02c3, B:114:0x02c9, B:115:0x02cf, B:117:0x02d5, B:119:0x02df, B:120:0x02e9, B:122:0x02ef, B:123:0x0302, B:125:0x0308, B:126:0x0310, B:128:0x0316, B:134:0x033b, B:135:0x034c, B:137:0x0359, B:140:0x0362, B:142:0x0366, B:144:0x0373, B:145:0x0377, B:147:0x0387, B:148:0x038b, B:150:0x039c, B:151:0x03a0, B:153:0x03ae, B:154:0x03b2, B:156:0x03c4, B:157:0x03c8, B:159:0x03d8, B:160:0x03dc, B:162:0x03ed, B:163:0x03f1, B:165:0x040b, B:166:0x040f, B:168:0x041e, B:169:0x0422, B:171:0x0435, B:172:0x0439, B:174:0x044c, B:175:0x0450, B:141:0x0365, B:176:0x0470, B:177:0x0497, B:179:0x049f, B:180:0x04a7, B:182:0x04ad, B:184:0x04c5, B:186:0x04ca, B:189:0x04db, B:196:0x04f8, B:192:0x04e6), top: B:216:0x0284 }] */
    /* JADX WARN: Code duplicated, block: B:140:0x0362 A[Catch: Exception -> 0x0299, TryCatch #3 {Exception -> 0x0299, blocks: (B:97:0x0284, B:99:0x028f, B:103:0x029f, B:105:0x02a5, B:106:0x02ab, B:108:0x02b1, B:109:0x02b7, B:111:0x02bd, B:112:0x02c3, B:114:0x02c9, B:115:0x02cf, B:117:0x02d5, B:119:0x02df, B:120:0x02e9, B:122:0x02ef, B:123:0x0302, B:125:0x0308, B:126:0x0310, B:128:0x0316, B:134:0x033b, B:135:0x034c, B:137:0x0359, B:140:0x0362, B:142:0x0366, B:144:0x0373, B:145:0x0377, B:147:0x0387, B:148:0x038b, B:150:0x039c, B:151:0x03a0, B:153:0x03ae, B:154:0x03b2, B:156:0x03c4, B:157:0x03c8, B:159:0x03d8, B:160:0x03dc, B:162:0x03ed, B:163:0x03f1, B:165:0x040b, B:166:0x040f, B:168:0x041e, B:169:0x0422, B:171:0x0435, B:172:0x0439, B:174:0x044c, B:175:0x0450, B:141:0x0365, B:176:0x0470, B:177:0x0497, B:179:0x049f, B:180:0x04a7, B:182:0x04ad, B:184:0x04c5, B:186:0x04ca, B:189:0x04db, B:196:0x04f8, B:192:0x04e6), top: B:216:0x0284 }] */
    /* JADX WARN: Code duplicated, block: B:141:0x0365 A[Catch: Exception -> 0x0299, TryCatch #3 {Exception -> 0x0299, blocks: (B:97:0x0284, B:99:0x028f, B:103:0x029f, B:105:0x02a5, B:106:0x02ab, B:108:0x02b1, B:109:0x02b7, B:111:0x02bd, B:112:0x02c3, B:114:0x02c9, B:115:0x02cf, B:117:0x02d5, B:119:0x02df, B:120:0x02e9, B:122:0x02ef, B:123:0x0302, B:125:0x0308, B:126:0x0310, B:128:0x0316, B:134:0x033b, B:135:0x034c, B:137:0x0359, B:140:0x0362, B:142:0x0366, B:144:0x0373, B:145:0x0377, B:147:0x0387, B:148:0x038b, B:150:0x039c, B:151:0x03a0, B:153:0x03ae, B:154:0x03b2, B:156:0x03c4, B:157:0x03c8, B:159:0x03d8, B:160:0x03dc, B:162:0x03ed, B:163:0x03f1, B:165:0x040b, B:166:0x040f, B:168:0x041e, B:169:0x0422, B:171:0x0435, B:172:0x0439, B:174:0x044c, B:175:0x0450, B:141:0x0365, B:176:0x0470, B:177:0x0497, B:179:0x049f, B:180:0x04a7, B:182:0x04ad, B:184:0x04c5, B:186:0x04ca, B:189:0x04db, B:196:0x04f8, B:192:0x04e6), top: B:216:0x0284 }] */
    /* JADX WARN: Code duplicated, block: B:144:0x0373 A[Catch: Exception -> 0x0299, TryCatch #3 {Exception -> 0x0299, blocks: (B:97:0x0284, B:99:0x028f, B:103:0x029f, B:105:0x02a5, B:106:0x02ab, B:108:0x02b1, B:109:0x02b7, B:111:0x02bd, B:112:0x02c3, B:114:0x02c9, B:115:0x02cf, B:117:0x02d5, B:119:0x02df, B:120:0x02e9, B:122:0x02ef, B:123:0x0302, B:125:0x0308, B:126:0x0310, B:128:0x0316, B:134:0x033b, B:135:0x034c, B:137:0x0359, B:140:0x0362, B:142:0x0366, B:144:0x0373, B:145:0x0377, B:147:0x0387, B:148:0x038b, B:150:0x039c, B:151:0x03a0, B:153:0x03ae, B:154:0x03b2, B:156:0x03c4, B:157:0x03c8, B:159:0x03d8, B:160:0x03dc, B:162:0x03ed, B:163:0x03f1, B:165:0x040b, B:166:0x040f, B:168:0x041e, B:169:0x0422, B:171:0x0435, B:172:0x0439, B:174:0x044c, B:175:0x0450, B:141:0x0365, B:176:0x0470, B:177:0x0497, B:179:0x049f, B:180:0x04a7, B:182:0x04ad, B:184:0x04c5, B:186:0x04ca, B:189:0x04db, B:196:0x04f8, B:192:0x04e6), top: B:216:0x0284 }] */
    /* JADX WARN: Code duplicated, block: B:147:0x0387 A[Catch: Exception -> 0x0299, TryCatch #3 {Exception -> 0x0299, blocks: (B:97:0x0284, B:99:0x028f, B:103:0x029f, B:105:0x02a5, B:106:0x02ab, B:108:0x02b1, B:109:0x02b7, B:111:0x02bd, B:112:0x02c3, B:114:0x02c9, B:115:0x02cf, B:117:0x02d5, B:119:0x02df, B:120:0x02e9, B:122:0x02ef, B:123:0x0302, B:125:0x0308, B:126:0x0310, B:128:0x0316, B:134:0x033b, B:135:0x034c, B:137:0x0359, B:140:0x0362, B:142:0x0366, B:144:0x0373, B:145:0x0377, B:147:0x0387, B:148:0x038b, B:150:0x039c, B:151:0x03a0, B:153:0x03ae, B:154:0x03b2, B:156:0x03c4, B:157:0x03c8, B:159:0x03d8, B:160:0x03dc, B:162:0x03ed, B:163:0x03f1, B:165:0x040b, B:166:0x040f, B:168:0x041e, B:169:0x0422, B:171:0x0435, B:172:0x0439, B:174:0x044c, B:175:0x0450, B:141:0x0365, B:176:0x0470, B:177:0x0497, B:179:0x049f, B:180:0x04a7, B:182:0x04ad, B:184:0x04c5, B:186:0x04ca, B:189:0x04db, B:196:0x04f8, B:192:0x04e6), top: B:216:0x0284 }] */
    /* JADX WARN: Code duplicated, block: B:150:0x039c A[Catch: Exception -> 0x0299, TryCatch #3 {Exception -> 0x0299, blocks: (B:97:0x0284, B:99:0x028f, B:103:0x029f, B:105:0x02a5, B:106:0x02ab, B:108:0x02b1, B:109:0x02b7, B:111:0x02bd, B:112:0x02c3, B:114:0x02c9, B:115:0x02cf, B:117:0x02d5, B:119:0x02df, B:120:0x02e9, B:122:0x02ef, B:123:0x0302, B:125:0x0308, B:126:0x0310, B:128:0x0316, B:134:0x033b, B:135:0x034c, B:137:0x0359, B:140:0x0362, B:142:0x0366, B:144:0x0373, B:145:0x0377, B:147:0x0387, B:148:0x038b, B:150:0x039c, B:151:0x03a0, B:153:0x03ae, B:154:0x03b2, B:156:0x03c4, B:157:0x03c8, B:159:0x03d8, B:160:0x03dc, B:162:0x03ed, B:163:0x03f1, B:165:0x040b, B:166:0x040f, B:168:0x041e, B:169:0x0422, B:171:0x0435, B:172:0x0439, B:174:0x044c, B:175:0x0450, B:141:0x0365, B:176:0x0470, B:177:0x0497, B:179:0x049f, B:180:0x04a7, B:182:0x04ad, B:184:0x04c5, B:186:0x04ca, B:189:0x04db, B:196:0x04f8, B:192:0x04e6), top: B:216:0x0284 }] */
    /* JADX WARN: Code duplicated, block: B:153:0x03ae A[Catch: Exception -> 0x0299, TryCatch #3 {Exception -> 0x0299, blocks: (B:97:0x0284, B:99:0x028f, B:103:0x029f, B:105:0x02a5, B:106:0x02ab, B:108:0x02b1, B:109:0x02b7, B:111:0x02bd, B:112:0x02c3, B:114:0x02c9, B:115:0x02cf, B:117:0x02d5, B:119:0x02df, B:120:0x02e9, B:122:0x02ef, B:123:0x0302, B:125:0x0308, B:126:0x0310, B:128:0x0316, B:134:0x033b, B:135:0x034c, B:137:0x0359, B:140:0x0362, B:142:0x0366, B:144:0x0373, B:145:0x0377, B:147:0x0387, B:148:0x038b, B:150:0x039c, B:151:0x03a0, B:153:0x03ae, B:154:0x03b2, B:156:0x03c4, B:157:0x03c8, B:159:0x03d8, B:160:0x03dc, B:162:0x03ed, B:163:0x03f1, B:165:0x040b, B:166:0x040f, B:168:0x041e, B:169:0x0422, B:171:0x0435, B:172:0x0439, B:174:0x044c, B:175:0x0450, B:141:0x0365, B:176:0x0470, B:177:0x0497, B:179:0x049f, B:180:0x04a7, B:182:0x04ad, B:184:0x04c5, B:186:0x04ca, B:189:0x04db, B:196:0x04f8, B:192:0x04e6), top: B:216:0x0284 }] */
    /* JADX WARN: Code duplicated, block: B:156:0x03c4 A[Catch: Exception -> 0x0299, TryCatch #3 {Exception -> 0x0299, blocks: (B:97:0x0284, B:99:0x028f, B:103:0x029f, B:105:0x02a5, B:106:0x02ab, B:108:0x02b1, B:109:0x02b7, B:111:0x02bd, B:112:0x02c3, B:114:0x02c9, B:115:0x02cf, B:117:0x02d5, B:119:0x02df, B:120:0x02e9, B:122:0x02ef, B:123:0x0302, B:125:0x0308, B:126:0x0310, B:128:0x0316, B:134:0x033b, B:135:0x034c, B:137:0x0359, B:140:0x0362, B:142:0x0366, B:144:0x0373, B:145:0x0377, B:147:0x0387, B:148:0x038b, B:150:0x039c, B:151:0x03a0, B:153:0x03ae, B:154:0x03b2, B:156:0x03c4, B:157:0x03c8, B:159:0x03d8, B:160:0x03dc, B:162:0x03ed, B:163:0x03f1, B:165:0x040b, B:166:0x040f, B:168:0x041e, B:169:0x0422, B:171:0x0435, B:172:0x0439, B:174:0x044c, B:175:0x0450, B:141:0x0365, B:176:0x0470, B:177:0x0497, B:179:0x049f, B:180:0x04a7, B:182:0x04ad, B:184:0x04c5, B:186:0x04ca, B:189:0x04db, B:196:0x04f8, B:192:0x04e6), top: B:216:0x0284 }] */
    /* JADX WARN: Code duplicated, block: B:159:0x03d8 A[Catch: Exception -> 0x0299, TryCatch #3 {Exception -> 0x0299, blocks: (B:97:0x0284, B:99:0x028f, B:103:0x029f, B:105:0x02a5, B:106:0x02ab, B:108:0x02b1, B:109:0x02b7, B:111:0x02bd, B:112:0x02c3, B:114:0x02c9, B:115:0x02cf, B:117:0x02d5, B:119:0x02df, B:120:0x02e9, B:122:0x02ef, B:123:0x0302, B:125:0x0308, B:126:0x0310, B:128:0x0316, B:134:0x033b, B:135:0x034c, B:137:0x0359, B:140:0x0362, B:142:0x0366, B:144:0x0373, B:145:0x0377, B:147:0x0387, B:148:0x038b, B:150:0x039c, B:151:0x03a0, B:153:0x03ae, B:154:0x03b2, B:156:0x03c4, B:157:0x03c8, B:159:0x03d8, B:160:0x03dc, B:162:0x03ed, B:163:0x03f1, B:165:0x040b, B:166:0x040f, B:168:0x041e, B:169:0x0422, B:171:0x0435, B:172:0x0439, B:174:0x044c, B:175:0x0450, B:141:0x0365, B:176:0x0470, B:177:0x0497, B:179:0x049f, B:180:0x04a7, B:182:0x04ad, B:184:0x04c5, B:186:0x04ca, B:189:0x04db, B:196:0x04f8, B:192:0x04e6), top: B:216:0x0284 }] */
    /* JADX WARN: Code duplicated, block: B:162:0x03ed A[Catch: Exception -> 0x0299, TryCatch #3 {Exception -> 0x0299, blocks: (B:97:0x0284, B:99:0x028f, B:103:0x029f, B:105:0x02a5, B:106:0x02ab, B:108:0x02b1, B:109:0x02b7, B:111:0x02bd, B:112:0x02c3, B:114:0x02c9, B:115:0x02cf, B:117:0x02d5, B:119:0x02df, B:120:0x02e9, B:122:0x02ef, B:123:0x0302, B:125:0x0308, B:126:0x0310, B:128:0x0316, B:134:0x033b, B:135:0x034c, B:137:0x0359, B:140:0x0362, B:142:0x0366, B:144:0x0373, B:145:0x0377, B:147:0x0387, B:148:0x038b, B:150:0x039c, B:151:0x03a0, B:153:0x03ae, B:154:0x03b2, B:156:0x03c4, B:157:0x03c8, B:159:0x03d8, B:160:0x03dc, B:162:0x03ed, B:163:0x03f1, B:165:0x040b, B:166:0x040f, B:168:0x041e, B:169:0x0422, B:171:0x0435, B:172:0x0439, B:174:0x044c, B:175:0x0450, B:141:0x0365, B:176:0x0470, B:177:0x0497, B:179:0x049f, B:180:0x04a7, B:182:0x04ad, B:184:0x04c5, B:186:0x04ca, B:189:0x04db, B:196:0x04f8, B:192:0x04e6), top: B:216:0x0284 }] */
    /* JADX WARN: Code duplicated, block: B:165:0x040b A[Catch: Exception -> 0x0299, TryCatch #3 {Exception -> 0x0299, blocks: (B:97:0x0284, B:99:0x028f, B:103:0x029f, B:105:0x02a5, B:106:0x02ab, B:108:0x02b1, B:109:0x02b7, B:111:0x02bd, B:112:0x02c3, B:114:0x02c9, B:115:0x02cf, B:117:0x02d5, B:119:0x02df, B:120:0x02e9, B:122:0x02ef, B:123:0x0302, B:125:0x0308, B:126:0x0310, B:128:0x0316, B:134:0x033b, B:135:0x034c, B:137:0x0359, B:140:0x0362, B:142:0x0366, B:144:0x0373, B:145:0x0377, B:147:0x0387, B:148:0x038b, B:150:0x039c, B:151:0x03a0, B:153:0x03ae, B:154:0x03b2, B:156:0x03c4, B:157:0x03c8, B:159:0x03d8, B:160:0x03dc, B:162:0x03ed, B:163:0x03f1, B:165:0x040b, B:166:0x040f, B:168:0x041e, B:169:0x0422, B:171:0x0435, B:172:0x0439, B:174:0x044c, B:175:0x0450, B:141:0x0365, B:176:0x0470, B:177:0x0497, B:179:0x049f, B:180:0x04a7, B:182:0x04ad, B:184:0x04c5, B:186:0x04ca, B:189:0x04db, B:196:0x04f8, B:192:0x04e6), top: B:216:0x0284 }] */
    /* JADX WARN: Code duplicated, block: B:168:0x041e A[Catch: Exception -> 0x0299, TryCatch #3 {Exception -> 0x0299, blocks: (B:97:0x0284, B:99:0x028f, B:103:0x029f, B:105:0x02a5, B:106:0x02ab, B:108:0x02b1, B:109:0x02b7, B:111:0x02bd, B:112:0x02c3, B:114:0x02c9, B:115:0x02cf, B:117:0x02d5, B:119:0x02df, B:120:0x02e9, B:122:0x02ef, B:123:0x0302, B:125:0x0308, B:126:0x0310, B:128:0x0316, B:134:0x033b, B:135:0x034c, B:137:0x0359, B:140:0x0362, B:142:0x0366, B:144:0x0373, B:145:0x0377, B:147:0x0387, B:148:0x038b, B:150:0x039c, B:151:0x03a0, B:153:0x03ae, B:154:0x03b2, B:156:0x03c4, B:157:0x03c8, B:159:0x03d8, B:160:0x03dc, B:162:0x03ed, B:163:0x03f1, B:165:0x040b, B:166:0x040f, B:168:0x041e, B:169:0x0422, B:171:0x0435, B:172:0x0439, B:174:0x044c, B:175:0x0450, B:141:0x0365, B:176:0x0470, B:177:0x0497, B:179:0x049f, B:180:0x04a7, B:182:0x04ad, B:184:0x04c5, B:186:0x04ca, B:189:0x04db, B:196:0x04f8, B:192:0x04e6), top: B:216:0x0284 }] */
    /* JADX WARN: Code duplicated, block: B:171:0x0435 A[Catch: Exception -> 0x0299, TryCatch #3 {Exception -> 0x0299, blocks: (B:97:0x0284, B:99:0x028f, B:103:0x029f, B:105:0x02a5, B:106:0x02ab, B:108:0x02b1, B:109:0x02b7, B:111:0x02bd, B:112:0x02c3, B:114:0x02c9, B:115:0x02cf, B:117:0x02d5, B:119:0x02df, B:120:0x02e9, B:122:0x02ef, B:123:0x0302, B:125:0x0308, B:126:0x0310, B:128:0x0316, B:134:0x033b, B:135:0x034c, B:137:0x0359, B:140:0x0362, B:142:0x0366, B:144:0x0373, B:145:0x0377, B:147:0x0387, B:148:0x038b, B:150:0x039c, B:151:0x03a0, B:153:0x03ae, B:154:0x03b2, B:156:0x03c4, B:157:0x03c8, B:159:0x03d8, B:160:0x03dc, B:162:0x03ed, B:163:0x03f1, B:165:0x040b, B:166:0x040f, B:168:0x041e, B:169:0x0422, B:171:0x0435, B:172:0x0439, B:174:0x044c, B:175:0x0450, B:141:0x0365, B:176:0x0470, B:177:0x0497, B:179:0x049f, B:180:0x04a7, B:182:0x04ad, B:184:0x04c5, B:186:0x04ca, B:189:0x04db, B:196:0x04f8, B:192:0x04e6), top: B:216:0x0284 }] */
    /* JADX WARN: Code duplicated, block: B:174:0x044c A[Catch: Exception -> 0x0299, TryCatch #3 {Exception -> 0x0299, blocks: (B:97:0x0284, B:99:0x028f, B:103:0x029f, B:105:0x02a5, B:106:0x02ab, B:108:0x02b1, B:109:0x02b7, B:111:0x02bd, B:112:0x02c3, B:114:0x02c9, B:115:0x02cf, B:117:0x02d5, B:119:0x02df, B:120:0x02e9, B:122:0x02ef, B:123:0x0302, B:125:0x0308, B:126:0x0310, B:128:0x0316, B:134:0x033b, B:135:0x034c, B:137:0x0359, B:140:0x0362, B:142:0x0366, B:144:0x0373, B:145:0x0377, B:147:0x0387, B:148:0x038b, B:150:0x039c, B:151:0x03a0, B:153:0x03ae, B:154:0x03b2, B:156:0x03c4, B:157:0x03c8, B:159:0x03d8, B:160:0x03dc, B:162:0x03ed, B:163:0x03f1, B:165:0x040b, B:166:0x040f, B:168:0x041e, B:169:0x0422, B:171:0x0435, B:172:0x0439, B:174:0x044c, B:175:0x0450, B:141:0x0365, B:176:0x0470, B:177:0x0497, B:179:0x049f, B:180:0x04a7, B:182:0x04ad, B:184:0x04c5, B:186:0x04ca, B:189:0x04db, B:196:0x04f8, B:192:0x04e6), top: B:216:0x0284 }] */
    /* JADX WARN: Code duplicated, block: B:179:0x049f A[Catch: Exception -> 0x0299, TryCatch #3 {Exception -> 0x0299, blocks: (B:97:0x0284, B:99:0x028f, B:103:0x029f, B:105:0x02a5, B:106:0x02ab, B:108:0x02b1, B:109:0x02b7, B:111:0x02bd, B:112:0x02c3, B:114:0x02c9, B:115:0x02cf, B:117:0x02d5, B:119:0x02df, B:120:0x02e9, B:122:0x02ef, B:123:0x0302, B:125:0x0308, B:126:0x0310, B:128:0x0316, B:134:0x033b, B:135:0x034c, B:137:0x0359, B:140:0x0362, B:142:0x0366, B:144:0x0373, B:145:0x0377, B:147:0x0387, B:148:0x038b, B:150:0x039c, B:151:0x03a0, B:153:0x03ae, B:154:0x03b2, B:156:0x03c4, B:157:0x03c8, B:159:0x03d8, B:160:0x03dc, B:162:0x03ed, B:163:0x03f1, B:165:0x040b, B:166:0x040f, B:168:0x041e, B:169:0x0422, B:171:0x0435, B:172:0x0439, B:174:0x044c, B:175:0x0450, B:141:0x0365, B:176:0x0470, B:177:0x0497, B:179:0x049f, B:180:0x04a7, B:182:0x04ad, B:184:0x04c5, B:186:0x04ca, B:189:0x04db, B:196:0x04f8, B:192:0x04e6), top: B:216:0x0284 }] */
    /* JADX WARN: Code duplicated, block: B:182:0x04ad A[Catch: Exception -> 0x0299, TryCatch #3 {Exception -> 0x0299, blocks: (B:97:0x0284, B:99:0x028f, B:103:0x029f, B:105:0x02a5, B:106:0x02ab, B:108:0x02b1, B:109:0x02b7, B:111:0x02bd, B:112:0x02c3, B:114:0x02c9, B:115:0x02cf, B:117:0x02d5, B:119:0x02df, B:120:0x02e9, B:122:0x02ef, B:123:0x0302, B:125:0x0308, B:126:0x0310, B:128:0x0316, B:134:0x033b, B:135:0x034c, B:137:0x0359, B:140:0x0362, B:142:0x0366, B:144:0x0373, B:145:0x0377, B:147:0x0387, B:148:0x038b, B:150:0x039c, B:151:0x03a0, B:153:0x03ae, B:154:0x03b2, B:156:0x03c4, B:157:0x03c8, B:159:0x03d8, B:160:0x03dc, B:162:0x03ed, B:163:0x03f1, B:165:0x040b, B:166:0x040f, B:168:0x041e, B:169:0x0422, B:171:0x0435, B:172:0x0439, B:174:0x044c, B:175:0x0450, B:141:0x0365, B:176:0x0470, B:177:0x0497, B:179:0x049f, B:180:0x04a7, B:182:0x04ad, B:184:0x04c5, B:186:0x04ca, B:189:0x04db, B:196:0x04f8, B:192:0x04e6), top: B:216:0x0284 }] */
    /* JADX WARN: Code duplicated, block: B:184:0x04c5 A[Catch: Exception -> 0x0299, TryCatch #3 {Exception -> 0x0299, blocks: (B:97:0x0284, B:99:0x028f, B:103:0x029f, B:105:0x02a5, B:106:0x02ab, B:108:0x02b1, B:109:0x02b7, B:111:0x02bd, B:112:0x02c3, B:114:0x02c9, B:115:0x02cf, B:117:0x02d5, B:119:0x02df, B:120:0x02e9, B:122:0x02ef, B:123:0x0302, B:125:0x0308, B:126:0x0310, B:128:0x0316, B:134:0x033b, B:135:0x034c, B:137:0x0359, B:140:0x0362, B:142:0x0366, B:144:0x0373, B:145:0x0377, B:147:0x0387, B:148:0x038b, B:150:0x039c, B:151:0x03a0, B:153:0x03ae, B:154:0x03b2, B:156:0x03c4, B:157:0x03c8, B:159:0x03d8, B:160:0x03dc, B:162:0x03ed, B:163:0x03f1, B:165:0x040b, B:166:0x040f, B:168:0x041e, B:169:0x0422, B:171:0x0435, B:172:0x0439, B:174:0x044c, B:175:0x0450, B:141:0x0365, B:176:0x0470, B:177:0x0497, B:179:0x049f, B:180:0x04a7, B:182:0x04ad, B:184:0x04c5, B:186:0x04ca, B:189:0x04db, B:196:0x04f8, B:192:0x04e6), top: B:216:0x0284 }] */
    /* JADX WARN: Code duplicated, block: B:189:0x04db A[Catch: Exception -> 0x0299, TryCatch #3 {Exception -> 0x0299, blocks: (B:97:0x0284, B:99:0x028f, B:103:0x029f, B:105:0x02a5, B:106:0x02ab, B:108:0x02b1, B:109:0x02b7, B:111:0x02bd, B:112:0x02c3, B:114:0x02c9, B:115:0x02cf, B:117:0x02d5, B:119:0x02df, B:120:0x02e9, B:122:0x02ef, B:123:0x0302, B:125:0x0308, B:126:0x0310, B:128:0x0316, B:134:0x033b, B:135:0x034c, B:137:0x0359, B:140:0x0362, B:142:0x0366, B:144:0x0373, B:145:0x0377, B:147:0x0387, B:148:0x038b, B:150:0x039c, B:151:0x03a0, B:153:0x03ae, B:154:0x03b2, B:156:0x03c4, B:157:0x03c8, B:159:0x03d8, B:160:0x03dc, B:162:0x03ed, B:163:0x03f1, B:165:0x040b, B:166:0x040f, B:168:0x041e, B:169:0x0422, B:171:0x0435, B:172:0x0439, B:174:0x044c, B:175:0x0450, B:141:0x0365, B:176:0x0470, B:177:0x0497, B:179:0x049f, B:180:0x04a7, B:182:0x04ad, B:184:0x04c5, B:186:0x04ca, B:189:0x04db, B:196:0x04f8, B:192:0x04e6), top: B:216:0x0284 }] */
    /* JADX WARN: Code duplicated, block: B:191:0x04e3  */
    /* JADX WARN: Code duplicated, block: B:192:0x04e6 A[Catch: Exception -> 0x0299, TryCatch #3 {Exception -> 0x0299, blocks: (B:97:0x0284, B:99:0x028f, B:103:0x029f, B:105:0x02a5, B:106:0x02ab, B:108:0x02b1, B:109:0x02b7, B:111:0x02bd, B:112:0x02c3, B:114:0x02c9, B:115:0x02cf, B:117:0x02d5, B:119:0x02df, B:120:0x02e9, B:122:0x02ef, B:123:0x0302, B:125:0x0308, B:126:0x0310, B:128:0x0316, B:134:0x033b, B:135:0x034c, B:137:0x0359, B:140:0x0362, B:142:0x0366, B:144:0x0373, B:145:0x0377, B:147:0x0387, B:148:0x038b, B:150:0x039c, B:151:0x03a0, B:153:0x03ae, B:154:0x03b2, B:156:0x03c4, B:157:0x03c8, B:159:0x03d8, B:160:0x03dc, B:162:0x03ed, B:163:0x03f1, B:165:0x040b, B:166:0x040f, B:168:0x041e, B:169:0x0422, B:171:0x0435, B:172:0x0439, B:174:0x044c, B:175:0x0450, B:141:0x0365, B:176:0x0470, B:177:0x0497, B:179:0x049f, B:180:0x04a7, B:182:0x04ad, B:184:0x04c5, B:186:0x04ca, B:189:0x04db, B:196:0x04f8, B:192:0x04e6), top: B:216:0x0284 }] */
    /* JADX WARN: Code duplicated, block: B:195:0x04f7  */
    /* JADX WARN: Code duplicated, block: B:201:0x050e  */
    /* JADX WARN: Code duplicated, block: B:202:0x0518  */
    /* JADX WARN: Code duplicated, block: B:206:0x0529  */
    /* JADX WARN: Code duplicated, block: B:226:0x0450 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:227:0x032a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:228:0x0332 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:231:0x04c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:232:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e4 A[Catch: all -> 0x00ab, Exception -> 0x00c6, TRY_LEAVE, TryCatch #5 {Exception -> 0x00c6, blocks: (B:26:0x009a, B:36:0x00b3, B:38:0x00b7, B:41:0x00ca, B:49:0x00f5, B:51:0x0104, B:53:0x011e, B:55:0x0136, B:57:0x013f, B:67:0x01a8, B:69:0x01b8, B:70:0x01c1, B:72:0x01c7, B:64:0x0199, B:44:0x00e4), top: B:220:0x009a }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00ed A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f5 A[Catch: all -> 0x00ab, Exception -> 0x00c6, TRY_ENTER, TRY_LEAVE, TryCatch #5 {Exception -> 0x00c6, blocks: (B:26:0x009a, B:36:0x00b3, B:38:0x00b7, B:41:0x00ca, B:49:0x00f5, B:51:0x0104, B:53:0x011e, B:55:0x0136, B:57:0x013f, B:67:0x01a8, B:69:0x01b8, B:70:0x01c1, B:72:0x01c7, B:64:0x0199, B:44:0x00e4), top: B:220:0x009a }] */
    /* JADX WARN: Code duplicated, block: B:67:0x01a8 A[Catch: all -> 0x00ab, Exception -> 0x00c6, TryCatch #5 {Exception -> 0x00c6, blocks: (B:26:0x009a, B:36:0x00b3, B:38:0x00b7, B:41:0x00ca, B:49:0x00f5, B:51:0x0104, B:53:0x011e, B:55:0x0136, B:57:0x013f, B:67:0x01a8, B:69:0x01b8, B:70:0x01c1, B:72:0x01c7, B:64:0x0199, B:44:0x00e4), top: B:220:0x009a }] */
    /* JADX WARN: Code duplicated, block: B:69:0x01b8 A[Catch: all -> 0x00ab, Exception -> 0x00c6, TryCatch #5 {Exception -> 0x00c6, blocks: (B:26:0x009a, B:36:0x00b3, B:38:0x00b7, B:41:0x00ca, B:49:0x00f5, B:51:0x0104, B:53:0x011e, B:55:0x0136, B:57:0x013f, B:67:0x01a8, B:69:0x01b8, B:70:0x01c1, B:72:0x01c7, B:64:0x0199, B:44:0x00e4), top: B:220:0x009a }] */
    /* JADX WARN: Code duplicated, block: B:70:0x01c1 A[Catch: all -> 0x00ab, Exception -> 0x00c6, TryCatch #5 {Exception -> 0x00c6, blocks: (B:26:0x009a, B:36:0x00b3, B:38:0x00b7, B:41:0x00ca, B:49:0x00f5, B:51:0x0104, B:53:0x011e, B:55:0x0136, B:57:0x013f, B:67:0x01a8, B:69:0x01b8, B:70:0x01c1, B:72:0x01c7, B:64:0x0199, B:44:0x00e4), top: B:220:0x009a }] */
    /* JADX WARN: Code duplicated, block: B:72:0x01c7 A[Catch: all -> 0x00ab, Exception -> 0x00c6, TRY_LEAVE, TryCatch #5 {Exception -> 0x00c6, blocks: (B:26:0x009a, B:36:0x00b3, B:38:0x00b7, B:41:0x00ca, B:49:0x00f5, B:51:0x0104, B:53:0x011e, B:55:0x0136, B:57:0x013f, B:67:0x01a8, B:69:0x01b8, B:70:0x01c1, B:72:0x01c7, B:64:0x0199, B:44:0x00e4), top: B:220:0x009a }] */
    /* JADX WARN: Code duplicated, block: B:77:0x01d1 A[Catch: all -> 0x00ab, Exception -> 0x01cf, TryCatch #0 {Exception -> 0x01cf, blocks: (B:74:0x01cb, B:77:0x01d1, B:79:0x01e9), top: B:211:0x01a6 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x01e9 A[Catch: all -> 0x00ab, Exception -> 0x01cf, TRY_LEAVE, TryCatch #0 {Exception -> 0x01cf, blocks: (B:74:0x01cb, B:77:0x01d1, B:79:0x01e9), top: B:211:0x01a6 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x0209  */
    /* JADX WARN: Code duplicated, block: B:91:0x0214  */
    /* JADX WARN: Code duplicated, block: B:93:0x0217  */
    /* JADX WARN: Code duplicated, block: B:94:0x021d  */
    /* JADX WARN: Code duplicated, block: B:96:0x0236  */
    /* JADX WARN: Code duplicated, block: B:99:0x028f A[Catch: Exception -> 0x0299, TryCatch #3 {Exception -> 0x0299, blocks: (B:97:0x0284, B:99:0x028f, B:103:0x029f, B:105:0x02a5, B:106:0x02ab, B:108:0x02b1, B:109:0x02b7, B:111:0x02bd, B:112:0x02c3, B:114:0x02c9, B:115:0x02cf, B:117:0x02d5, B:119:0x02df, B:120:0x02e9, B:122:0x02ef, B:123:0x0302, B:125:0x0308, B:126:0x0310, B:128:0x0316, B:134:0x033b, B:135:0x034c, B:137:0x0359, B:140:0x0362, B:142:0x0366, B:144:0x0373, B:145:0x0377, B:147:0x0387, B:148:0x038b, B:150:0x039c, B:151:0x03a0, B:153:0x03ae, B:154:0x03b2, B:156:0x03c4, B:157:0x03c8, B:159:0x03d8, B:160:0x03dc, B:162:0x03ed, B:163:0x03f1, B:165:0x040b, B:166:0x040f, B:168:0x041e, B:169:0x0422, B:171:0x0435, B:172:0x0439, B:174:0x044c, B:175:0x0450, B:141:0x0365, B:176:0x0470, B:177:0x0497, B:179:0x049f, B:180:0x04a7, B:182:0x04ad, B:184:0x04c5, B:186:0x04ca, B:189:0x04db, B:196:0x04f8, B:192:0x04e6), top: B:216:0x0284 }] */
    @Override // defpackage.nc2
    public final void a() throws Throwable {
        String string;
        String string2;
        HttpURLConnection httpURLConnection;
        int i;
        int i2;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        int i3;
        zc2 zc2Var;
        boolean z;
        JSONObject jSONObject;
        pd2 pd2VarA;
        CopyOnWriteArrayList copyOnWriteArrayList;
        long j;
        JSONObject jSONObject2;
        String strOptString;
        JSONArray jSONArray;
        JSONObject jSONObject3;
        int i4;
        JSONObject jSONObject4;
        JSONArray jSONArray2;
        int i5;
        long j2;
        Iterator it;
        JSONArray jSONArray3;
        String str13;
        JSONArray jSONArray4;
        rx1 rx1Var;
        int iOptInt;
        long j3;
        int iOptInt2;
        String str14;
        int iOptInt3;
        int iOptInt4;
        int iOptInt5;
        String str15;
        int iOptInt6;
        String str16;
        int iOptInt7;
        String str17;
        int iOptInt8;
        String str18;
        int iOptInt9;
        String str19;
        int iOptInt10;
        String str20;
        int iOptInt11;
        String str21;
        int iOptInt12;
        ox1 ox1Var;
        SSLContext sSLContextA;
        byte[] bytes;
        Pair pairD;
        byte[] bArr;
        nl1 nl1Var;
        int responseCode;
        String strA;
        v61 v61Var;
        pd2 pd2Var = this.c;
        try {
            JSONObject jSONObjectE = rq0.e(hc.h);
            jSONObjectE.put("sname", String.valueOf(pd2Var.a));
            int i6 = pd2Var.a;
            ArrayMap arrayMap = ze2.x;
            jSONObjectE.put("sdkver", arrayMap.containsKey(Integer.valueOf(i6)) ? (String) arrayMap.get(Integer.valueOf(i6)) : BuildConfig.FLAVOR);
            string = jSONObjectE.toString();
        } catch (Exception e) {
            cc2.c(e.getMessage());
            string = BuildConfig.FLAVOR;
        }
        String str22 = pd2Var.k;
        CopyOnWriteArrayList<rx1> copyOnWriteArrayList2 = pd2Var.f;
        if (str22 == null) {
            str22 = BuildConfig.FLAVOR;
        }
        String str23 = ze2.a;
        if (TextUtils.isEmpty(str22)) {
            string2 = ze2.a(false) + ze2.e;
        } else {
            StringBuilder sbM = ts.m(str22);
            sbM.append(ze2.e);
            string2 = sbM.toString();
        }
        long j4 = pd2Var.d;
        int i7 = pd2Var.a;
        HttpURLConnection httpURLConnection2 = null;
        v61 v61Var2 = new v61(-1, null);
        try {
            URL url = new URL(kv.y(string2, true));
            httpURLConnection = (HttpURLConnection) url.openConnection();
            try {
                try {
                    if (httpURLConnection instanceof HttpsURLConnection) {
                        try {
                            if (y21.h == null && (sSLContextA = fd2.a()) != null) {
                                y21.h = sSLContextA.getSocketFactory();
                            }
                            SSLSocketFactory sSLSocketFactory = y21.h;
                            if (sSLSocketFactory != null) {
                                ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(sSLSocketFactory);
                                ((HttpsURLConnection) httpURLConnection).setHostnameVerifier(fd2.a);
                            }
                            bytes = string.getBytes();
                            pairD = ld2.f().a.d();
                            bArr = (byte[]) pairD.second;
                            if (bArr == null) {
                                nl1Var = null;
                            } else {
                                nl1Var = new nl1(bArr);
                            }
                            if (nl1Var == null) {
                                byte[] bytes2 = Base64.encodeToString(nl1Var.e(bytes), 2).getBytes();
                                httpURLConnection.setRequestProperty("index", String.valueOf(((Integer) pairD.first).intValue() + 1));
                                httpURLConnection.setRequestProperty("accept", "*/*");
                                httpURLConnection.setRequestProperty("Content-Length", String.valueOf(bytes2.length));
                                httpURLConnection.setRequestProperty("ver", String.valueOf(j4));
                                httpURLConnection.setRequestProperty("vn", "1");
                                httpURLConnection.setRequestProperty("app", String.valueOf(i7));
                                httpURLConnection.setRequestProperty("model", Build.MODEL);
                                httpURLConnection.setRequestMethod("POST");
                                httpURLConnection.setReadTimeout(20000);
                                httpURLConnection.setConnectTimeout(30000);
                                httpURLConnection.setDoInput(true);
                                httpURLConnection.setDoOutput(true);
                                DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                                dataOutputStream.write(bytes2);
                                dataOutputStream.flush();
                                dataOutputStream.close();
                                responseCode = httpURLConnection.getResponseCode();
                                try {
                                    JSONObject jSONObject5 = new JSONObject();
                                    jSONObject5.put("url", url);
                                    jSONObject5.put("params", string);
                                    jSONObject5.put("version", j4);
                                    jSONObject5.put("code", responseCode);
                                    cc2.f("--> request config:%s", jSONObject5.toString());
                                } catch (Exception e2) {
                                    cc2.d("print request config exception:%s", e2.getMessage());
                                }
                                try {
                                    if (responseCode == 200) {
                                        strA = rq0.a(httpURLConnection.getInputStream());
                                        if (TextUtils.equals("{}", strA)) {
                                            v61Var = new v61(1, null);
                                        } else if (TextUtils.isEmpty(strA)) {
                                            v61Var = new v61(-1, null);
                                        } else {
                                            v61Var = new v61(0, new String(rq0.s(Base64.decode(strA, 2)), StandardCharsets.UTF_8));
                                        }
                                        v61Var2 = v61Var;
                                    } else {
                                        v61Var2 = new v61(-1, rq0.a(httpURLConnection.getErrorStream()));
                                    }
                                    httpURLConnection.disconnect();
                                } catch (Exception e3) {
                                    e = e3;
                                    e.printStackTrace();
                                    if (httpURLConnection != null) {
                                        httpURLConnection.disconnect();
                                    }
                                }
                            } else if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                        } catch (Exception e4) {
                            e = e4;
                            e.printStackTrace();
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            i = this.e;
                            i2 = v61Var2.a;
                            if (i2 != 0) {
                                if (i2 != 1) {
                                    pd2Var.c++;
                                } else {
                                    cc2.f("<-- appIdConfig:%s", "NOT_MODIFIED");
                                    pd2Var.e = i;
                                    pd2Var.c(System.currentTimeMillis() + this.d);
                                }
                                zc2Var = this;
                                z = false;
                            } else {
                                String str24 = (String) v61Var2.b;
                                cc2.f("<-- appIdConfig:%s", str24);
                                md2 md2Var = ld2.f().a;
                                md2Var.getClass();
                                str = "cfg";
                                str2 = BuildConfig.FLAVOR;
                                str3 = "gpct";
                                str4 = "upct";
                                str5 = "pr";
                                str6 = "num";
                                str7 = "stats";
                                str8 = "gmax";
                                str9 = "frq";
                                str10 = "gmin";
                                str11 = "ur";
                                str12 = "iw";
                                try {
                                    jSONObject = new JSONObject(str24);
                                    if (jSONObject.has("ver")) {
                                        pd2Var.d = jSONObject.getLong("ver");
                                    }
                                    if (jSONObject.has("url")) {
                                        pd2Var.h = jSONObject.getString("url");
                                    }
                                    if (jSONObject.has("interval")) {
                                        pd2Var.i = jSONObject.getInt("interval");
                                    }
                                    if (jSONObject.has("offline")) {
                                        pd2Var.j = jSONObject.getInt("offline");
                                    }
                                    if (jSONObject.has("url_config")) {
                                        pd2Var.k = jSONObject.getString("url_config");
                                    }
                                    if (jSONObject.has("data")) {
                                        jSONArray = jSONObject.getJSONArray("data");
                                        if (jSONArray.length() > 0) {
                                            jSONObject3 = jSONArray.getJSONObject(0).getJSONObject("cfg");
                                            i4 = 0;
                                            while (i4 < jSONArray.length()) {
                                                jSONObject4 = jSONArray.getJSONObject(i4).getJSONObject(str);
                                                jSONArray2 = jSONArray.getJSONObject(i4).getJSONArray("tids");
                                                i5 = 0;
                                                while (i5 < jSONArray2.length()) {
                                                    j2 = jSONArray2.getLong(i5);
                                                    it = copyOnWriteArrayList2.iterator();
                                                    while (true) {
                                                        if (it.hasNext()) {
                                                            jSONArray3 = jSONArray;
                                                            str13 = str;
                                                            jSONArray4 = jSONArray2;
                                                            rx1Var = null;
                                                            break;
                                                        }
                                                        jSONArray3 = jSONArray;
                                                        rx1Var = (rx1) it.next();
                                                        str13 = str;
                                                        jSONArray4 = jSONArray2;
                                                        if (rx1Var.a == j2) {
                                                            break;
                                                        }
                                                        str = str13;
                                                        jSONArray = jSONArray3;
                                                        jSONArray2 = jSONArray4;
                                                    }
                                                    if (rx1Var == null) {
                                                        rx1Var = new rx1();
                                                        rx1Var.c = new qb2();
                                                        rx1Var.a = j2;
                                                        copyOnWriteArrayList2.add(rx1Var);
                                                    }
                                                    qb2 qb2Var = rx1Var.c;
                                                    iOptInt = jSONObject3.optInt("cv", 0);
                                                    if (jSONObject4.has("cv")) {
                                                        iOptInt = jSONObject4.getInt("cv");
                                                    }
                                                    if (iOptInt > 0) {
                                                        j3 = ((long) iOptInt) * 60000;
                                                    } else {
                                                        j3 = iOptInt;
                                                    }
                                                    qb2Var.d = j3;
                                                    iOptInt2 = jSONObject3.optInt(str10, 0);
                                                    if (jSONObject4.has(str10)) {
                                                        iOptInt2 = jSONObject4.getInt(str10);
                                                    }
                                                    qb2Var.f = iOptInt2;
                                                    str14 = str8;
                                                    iOptInt3 = jSONObject3.optInt(str14, 100);
                                                    if (jSONObject4.has(str14)) {
                                                        iOptInt3 = jSONObject4.getInt(str14);
                                                    }
                                                    qb2Var.g = iOptInt3;
                                                    iOptInt4 = jSONObject3.optInt(str6, 0);
                                                    if (jSONObject4.has(str6)) {
                                                        iOptInt4 = jSONObject4.getInt(str6);
                                                    }
                                                    qb2Var.j = iOptInt4;
                                                    iOptInt5 = jSONObject3.optInt(r1, 10);
                                                    if (jSONObject4.has(r1)) {
                                                        iOptInt5 = jSONObject4.getInt("s");
                                                    }
                                                    qb2Var.l = ((long) iOptInt5) * 60000;
                                                    str15 = str12;
                                                    iOptInt6 = jSONObject3.optInt(str15, 0);
                                                    if (jSONObject4.has(str15)) {
                                                        iOptInt6 = jSONObject4.getInt(str15);
                                                    }
                                                    qb2Var.e = iOptInt6;
                                                    str16 = str11;
                                                    iOptInt7 = jSONObject3.optInt(str16, 100);
                                                    if (jSONObject4.has(str16)) {
                                                        iOptInt7 = jSONObject4.getInt(str16);
                                                    }
                                                    qb2Var.b = iOptInt7;
                                                    str17 = str9;
                                                    int i8 = i4;
                                                    iOptInt8 = jSONObject3.optInt(str17, 0);
                                                    if (jSONObject4.has(str17)) {
                                                        iOptInt8 = jSONObject4.getInt(str17);
                                                    }
                                                    int i9 = iOptInt8 * 60;
                                                    String str25 = str10;
                                                    String str26 = str6;
                                                    qb2Var.m = ((long) i9) * 1000;
                                                    str18 = str7;
                                                    iOptInt9 = jSONObject3.optInt(str18, 0);
                                                    if (jSONObject4.has(str18)) {
                                                        iOptInt9 = jSONObject4.getInt(str18);
                                                    }
                                                    qb2Var.a = iOptInt9;
                                                    str19 = str5;
                                                    iOptInt10 = jSONObject3.optInt(str19, 0);
                                                    if (jSONObject4.has(str19)) {
                                                        iOptInt10 = jSONObject4.getInt(str19);
                                                    }
                                                    qb2Var.n = iOptInt10;
                                                    str7 = str18;
                                                    str20 = str4;
                                                    iOptInt11 = jSONObject3.optInt(str20, 1);
                                                    if (jSONObject4.has(str20)) {
                                                        iOptInt11 = jSONObject4.getInt(str20);
                                                    }
                                                    qb2Var.c = iOptInt11;
                                                    str5 = str19;
                                                    str21 = str3;
                                                    iOptInt12 = jSONObject3.optInt(str21, 1);
                                                    if (jSONObject4.has(str21)) {
                                                        iOptInt12 = jSONObject4.getInt(str21);
                                                    }
                                                    qb2Var.h = iOptInt12;
                                                    i5++;
                                                    str3 = str21;
                                                    str4 = str20;
                                                    str8 = str14;
                                                    i4 = i8;
                                                    str6 = str26;
                                                    str10 = str25;
                                                    jSONArray = jSONArray3;
                                                    jSONArray2 = jSONArray4;
                                                    str9 = str17;
                                                    str12 = str15;
                                                    str11 = str16;
                                                    str = str13;
                                                }
                                                str9 = str9;
                                                str6 = str6;
                                                str = str;
                                                i4++;
                                                str12 = str12;
                                                str11 = str11;
                                                jSONArray = jSONArray;
                                            }
                                        }
                                    }
                                    if (jSONObject.has("table")) {
                                        jSONObject2 = jSONObject.getJSONObject("table");
                                        for (rx1 rx1Var2 : copyOnWriteArrayList2) {
                                            String str27 = str2;
                                            strOptString = jSONObject2.optString(String.valueOf(rx1Var2.a), str27);
                                            if (strOptString.length() > 0) {
                                                rx1Var2.b = strOptString;
                                            }
                                            str2 = str27;
                                        }
                                    }
                                    pd2VarA = ((f91) md2Var.b).a(qd2.a);
                                    if (pd2VarA != null) {
                                        copyOnWriteArrayList = pd2VarA.f;
                                        if (rq0.h(copyOnWriteArrayList)) {
                                            j = 0;
                                        } else {
                                            j = ((rx1) copyOnWriteArrayList.get(0)).c.l;
                                        }
                                        if (j < 30000) {
                                            j = 30000;
                                        }
                                        ze2.o = j;
                                    }
                                } catch (Exception e5) {
                                    cc2.c(Log.getStackTraceString(e5));
                                    oc2.a("updateAppConfig", e5);
                                }
                                pd2Var.e = i;
                                i3 = pd2Var.i;
                                if (i3 > 0) {
                                    zc2Var = this;
                                    zc2Var.d = ((long) i3) * 3600000;
                                } else {
                                    zc2Var = this;
                                }
                                pd2Var.c(System.currentTimeMillis() + zc2Var.d);
                                z = true;
                            }
                            ox1Var = zc2Var.f;
                            if (ox1Var != null) {
                                ox1Var.n(pd2Var.a, z);
                            }
                        }
                    } else {
                        bytes = string.getBytes();
                        pairD = ld2.f().a.d();
                        bArr = (byte[]) pairD.second;
                        if (bArr == null) {
                            nl1Var = null;
                        } else {
                            nl1Var = new nl1(bArr);
                        }
                        if (nl1Var == null) {
                            byte[] bytes3 = Base64.encodeToString(nl1Var.e(bytes), 2).getBytes();
                            httpURLConnection.setRequestProperty("index", String.valueOf(((Integer) pairD.first).intValue() + 1));
                            httpURLConnection.setRequestProperty("accept", "*/*");
                            httpURLConnection.setRequestProperty("Content-Length", String.valueOf(bytes3.length));
                            httpURLConnection.setRequestProperty("ver", String.valueOf(j4));
                            httpURLConnection.setRequestProperty("vn", "1");
                            httpURLConnection.setRequestProperty("app", String.valueOf(i7));
                            httpURLConnection.setRequestProperty("model", Build.MODEL);
                            httpURLConnection.setRequestMethod("POST");
                            httpURLConnection.setReadTimeout(20000);
                            httpURLConnection.setConnectTimeout(30000);
                            httpURLConnection.setDoInput(true);
                            httpURLConnection.setDoOutput(true);
                            DataOutputStream dataOutputStream2 = new DataOutputStream(httpURLConnection.getOutputStream());
                            dataOutputStream2.write(bytes3);
                            dataOutputStream2.flush();
                            dataOutputStream2.close();
                            responseCode = httpURLConnection.getResponseCode();
                            JSONObject jSONObject6 = new JSONObject();
                            jSONObject6.put("url", url);
                            jSONObject6.put("params", string);
                            jSONObject6.put("version", j4);
                            jSONObject6.put("code", responseCode);
                            cc2.f("--> request config:%s", jSONObject6.toString());
                            if (responseCode == 200) {
                                strA = rq0.a(httpURLConnection.getInputStream());
                                if (TextUtils.equals("{}", strA)) {
                                    v61Var = new v61(1, null);
                                } else if (TextUtils.isEmpty(strA)) {
                                    v61Var = new v61(-1, null);
                                } else {
                                    v61Var = new v61(0, new String(rq0.s(Base64.decode(strA, 2)), StandardCharsets.UTF_8));
                                }
                                v61Var2 = v61Var;
                            } else {
                                v61Var2 = new v61(-1, rq0.a(httpURLConnection.getErrorStream()));
                            }
                            httpURLConnection.disconnect();
                        } else if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                    }
                } catch (Exception e6) {
                    e = e6;
                }
            } catch (Throwable th) {
                th = th;
                httpURLConnection2 = httpURLConnection;
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
                throw th;
            }
        } catch (Exception e7) {
            e = e7;
            httpURLConnection = null;
        } catch (Throwable th2) {
            th = th2;
        }
        i = this.e;
        i2 = v61Var2.a;
        if (i2 != 0) {
            if (i2 != 1) {
                pd2Var.c++;
            } else {
                cc2.f("<-- appIdConfig:%s", "NOT_MODIFIED");
                pd2Var.e = i;
                pd2Var.c(System.currentTimeMillis() + this.d);
            }
            zc2Var = this;
            z = false;
        } else {
            String str28 = (String) v61Var2.b;
            cc2.f("<-- appIdConfig:%s", str28);
            md2 md2Var2 = ld2.f().a;
            md2Var2.getClass();
            str = "cfg";
            str2 = BuildConfig.FLAVOR;
            str3 = "gpct";
            str4 = "upct";
            str5 = "pr";
            str6 = "num";
            str7 = "stats";
            str8 = "gmax";
            str9 = "frq";
            str10 = "gmin";
            str11 = "ur";
            str12 = "iw";
            jSONObject = new JSONObject(str28);
            if (jSONObject.has("ver")) {
                pd2Var.d = jSONObject.getLong("ver");
            }
            if (jSONObject.has("url")) {
                pd2Var.h = jSONObject.getString("url");
            }
            if (jSONObject.has("interval")) {
                pd2Var.i = jSONObject.getInt("interval");
            }
            if (jSONObject.has("offline")) {
                pd2Var.j = jSONObject.getInt("offline");
            }
            if (jSONObject.has("url_config")) {
                pd2Var.k = jSONObject.getString("url_config");
            }
            if (jSONObject.has("data")) {
                jSONArray = jSONObject.getJSONArray("data");
                if (jSONArray.length() > 0) {
                    jSONObject3 = jSONArray.getJSONObject(0).getJSONObject("cfg");
                    i4 = 0;
                    while (i4 < jSONArray.length()) {
                        jSONObject4 = jSONArray.getJSONObject(i4).getJSONObject(str);
                        jSONArray2 = jSONArray.getJSONObject(i4).getJSONArray("tids");
                        i5 = 0;
                        while (i5 < jSONArray2.length()) {
                            j2 = jSONArray2.getLong(i5);
                            it = copyOnWriteArrayList2.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    jSONArray3 = jSONArray;
                                    str13 = str;
                                    jSONArray4 = jSONArray2;
                                    rx1Var = null;
                                    break;
                                }
                                jSONArray3 = jSONArray;
                                rx1Var = (rx1) it.next();
                                str13 = str;
                                jSONArray4 = jSONArray2;
                                if (rx1Var.a == j2) {
                                    break;
                                    break;
                                } else {
                                    str = str13;
                                    jSONArray = jSONArray3;
                                    jSONArray2 = jSONArray4;
                                }
                            }
                            if (rx1Var == null) {
                                rx1Var = new rx1();
                                rx1Var.c = new qb2();
                                rx1Var.a = j2;
                                copyOnWriteArrayList2.add(rx1Var);
                            }
                            qb2 qb2Var2 = rx1Var.c;
                            iOptInt = jSONObject3.optInt("cv", 0);
                            if (jSONObject4.has("cv")) {
                                iOptInt = jSONObject4.getInt("cv");
                            }
                            if (iOptInt > 0) {
                                j3 = ((long) iOptInt) * 60000;
                            } else {
                                j3 = iOptInt;
                            }
                            qb2Var2.d = j3;
                            iOptInt2 = jSONObject3.optInt(str10, 0);
                            if (jSONObject4.has(str10)) {
                                iOptInt2 = jSONObject4.getInt(str10);
                            }
                            qb2Var2.f = iOptInt2;
                            str14 = str8;
                            iOptInt3 = jSONObject3.optInt(str14, 100);
                            if (jSONObject4.has(str14)) {
                                iOptInt3 = jSONObject4.getInt(str14);
                            }
                            qb2Var2.g = iOptInt3;
                            iOptInt4 = jSONObject3.optInt(str6, 0);
                            if (jSONObject4.has(str6)) {
                                iOptInt4 = jSONObject4.getInt(str6);
                            }
                            qb2Var2.j = iOptInt4;
                            iOptInt5 = jSONObject3.optInt(r1, 10);
                            if (jSONObject4.has(r1)) {
                                iOptInt5 = jSONObject4.getInt("s");
                            }
                            qb2Var2.l = ((long) iOptInt5) * 60000;
                            str15 = str12;
                            iOptInt6 = jSONObject3.optInt(str15, 0);
                            if (jSONObject4.has(str15)) {
                                iOptInt6 = jSONObject4.getInt(str15);
                            }
                            qb2Var2.e = iOptInt6;
                            str16 = str11;
                            iOptInt7 = jSONObject3.optInt(str16, 100);
                            if (jSONObject4.has(str16)) {
                                iOptInt7 = jSONObject4.getInt(str16);
                            }
                            qb2Var2.b = iOptInt7;
                            str17 = str9;
                            int i10 = i4;
                            iOptInt8 = jSONObject3.optInt(str17, 0);
                            if (jSONObject4.has(str17)) {
                                iOptInt8 = jSONObject4.getInt(str17);
                            }
                            int i11 = iOptInt8 * 60;
                            String str29 = str10;
                            String str210 = str6;
                            qb2Var2.m = ((long) i11) * 1000;
                            str18 = str7;
                            iOptInt9 = jSONObject3.optInt(str18, 0);
                            if (jSONObject4.has(str18)) {
                                iOptInt9 = jSONObject4.getInt(str18);
                            }
                            qb2Var2.a = iOptInt9;
                            str19 = str5;
                            iOptInt10 = jSONObject3.optInt(str19, 0);
                            if (jSONObject4.has(str19)) {
                                iOptInt10 = jSONObject4.getInt(str19);
                            }
                            qb2Var2.n = iOptInt10;
                            str7 = str18;
                            str20 = str4;
                            iOptInt11 = jSONObject3.optInt(str20, 1);
                            if (jSONObject4.has(str20)) {
                                iOptInt11 = jSONObject4.getInt(str20);
                            }
                            qb2Var2.c = iOptInt11;
                            str5 = str19;
                            str21 = str3;
                            iOptInt12 = jSONObject3.optInt(str21, 1);
                            if (jSONObject4.has(str21)) {
                                iOptInt12 = jSONObject4.getInt(str21);
                            }
                            qb2Var2.h = iOptInt12;
                            i5++;
                            str3 = str21;
                            str4 = str20;
                            str8 = str14;
                            i4 = i10;
                            str6 = str210;
                            str10 = str29;
                            jSONArray = jSONArray3;
                            jSONArray2 = jSONArray4;
                            str9 = str17;
                            str12 = str15;
                            str11 = str16;
                            str = str13;
                        }
                        str9 = str9;
                        str6 = str6;
                        str = str;
                        i4++;
                        str12 = str12;
                        str11 = str11;
                        jSONArray = jSONArray;
                    }
                }
            }
            if (jSONObject.has("table")) {
                jSONObject2 = jSONObject.getJSONObject("table");
                while (r1.hasNext()) {
                    String str211 = str2;
                    strOptString = jSONObject2.optString(String.valueOf(rx1Var2.a), str211);
                    if (strOptString.length() > 0) {
                        rx1Var2.b = strOptString;
                    }
                    str2 = str211;
                }
            }
            pd2VarA = ((f91) md2Var2.b).a(qd2.a);
            if (pd2VarA != null) {
                copyOnWriteArrayList = pd2VarA.f;
                if (rq0.h(copyOnWriteArrayList)) {
                    j = 0;
                } else {
                    j = ((rx1) copyOnWriteArrayList.get(0)).c.l;
                }
                if (j < 30000) {
                    j = 30000;
                }
                ze2.o = j;
            }
            pd2Var.e = i;
            i3 = pd2Var.i;
            if (i3 > 0) {
                zc2Var = this;
                zc2Var.d = ((long) i3) * 3600000;
            } else {
                zc2Var = this;
            }
            pd2Var.c(System.currentTimeMillis() + zc2Var.d);
            z = true;
        }
        ox1Var = zc2Var.f;
        if (ox1Var != null) {
            ox1Var.n(pd2Var.a, z);
        }
    }

    @Override // defpackage.nc2
    public final String c() {
        return ts.h(this.c.a, "-Config", new StringBuilder("Retrieve-"));
    }
}
