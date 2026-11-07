package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class rl2 extends ne3 {
    public String d;
    public HashSet e;
    public mb f;
    public Long i;
    public Long v;

    /* JADX WARN: Code duplicated, block: B:102:0x0242 A[LOOP:20: B:85:0x01f2->B:102:0x0242, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:117:0x0274  */
    /* JADX WARN: Code duplicated, block: B:121:0x027e  */
    /* JADX WARN: Code duplicated, block: B:123:0x0289  */
    /* JADX WARN: Code duplicated, block: B:125:0x0294  */
    /* JADX WARN: Code duplicated, block: B:131:0x02c2 A[Catch: all -> 0x02dd, SQLiteException -> 0x02df, LOOP:11: B:131:0x02c2->B:568:?, LOOP_START, TryCatch #10 {SQLiteException -> 0x02df, blocks: (B:129:0x02bc, B:131:0x02c2, B:133:0x02d3, B:139:0x02e1, B:142:0x02f6), top: B:483:0x02bc }] */
    /* JADX WARN: Code duplicated, block: B:133:0x02d3 A[Catch: all -> 0x02dd, SQLiteException -> 0x02df, TryCatch #10 {SQLiteException -> 0x02df, blocks: (B:129:0x02bc, B:131:0x02c2, B:133:0x02d3, B:139:0x02e1, B:142:0x02f6), top: B:483:0x02bc }] */
    /* JADX WARN: Code duplicated, block: B:142:0x02f6 A[Catch: all -> 0x02dd, SQLiteException -> 0x02df, TRY_ENTER, TRY_LEAVE, TryCatch #10 {SQLiteException -> 0x02df, blocks: (B:129:0x02bc, B:131:0x02c2, B:133:0x02d3, B:139:0x02e1, B:142:0x02f6), top: B:483:0x02bc }] */
    /* JADX WARN: Code duplicated, block: B:159:0x0335  */
    /* JADX WARN: Code duplicated, block: B:162:0x0343  */
    /* JADX WARN: Code duplicated, block: B:164:0x035a  */
    /* JADX WARN: Code duplicated, block: B:190:0x045f  */
    /* JADX WARN: Code duplicated, block: B:194:0x0470  */
    /* JADX WARN: Code duplicated, block: B:196:0x0490  */
    /* JADX WARN: Code duplicated, block: B:202:0x04a7  */
    /* JADX WARN: Code duplicated, block: B:206:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:207:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:211:0x04da  */
    /* JADX WARN: Code duplicated, block: B:217:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:223:0x0527  */
    /* JADX WARN: Code duplicated, block: B:226:0x0530  */
    /* JADX WARN: Code duplicated, block: B:228:0x053c  */
    /* JADX WARN: Code duplicated, block: B:230:0x055e  */
    /* JADX WARN: Code duplicated, block: B:231:0x0562  */
    /* JADX WARN: Code duplicated, block: B:236:0x057b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:247:0x059a  */
    /* JADX WARN: Code duplicated, block: B:249:0x05b6  */
    /* JADX WARN: Code duplicated, block: B:252:0x05c8  */
    /* JADX WARN: Code duplicated, block: B:255:0x05d5  */
    /* JADX WARN: Code duplicated, block: B:262:0x061d  */
    /* JADX WARN: Code duplicated, block: B:265:0x0631  */
    /* JADX WARN: Code duplicated, block: B:271:0x0664  */
    /* JADX WARN: Code duplicated, block: B:275:0x06a5  */
    /* JADX WARN: Code duplicated, block: B:282:0x06cd  */
    /* JADX WARN: Code duplicated, block: B:288:0x06dc  */
    /* JADX WARN: Code duplicated, block: B:299:0x0709 A[LOOP:3: B:276:0x06a7->B:299:0x0709, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:300:0x070c  */
    /* JADX WARN: Code duplicated, block: B:315:0x073c  */
    /* JADX WARN: Code duplicated, block: B:320:0x0747  */
    /* JADX WARN: Code duplicated, block: B:322:0x074b  */
    /* JADX WARN: Code duplicated, block: B:326:0x075d  */
    /* JADX WARN: Code duplicated, block: B:332:0x078c  */
    /* JADX WARN: Code duplicated, block: B:334:0x07b7  */
    /* JADX WARN: Code duplicated, block: B:336:0x07be  */
    /* JADX WARN: Code duplicated, block: B:339:0x07cf A[LOOP:5: B:330:0x0786->B:339:0x07cf, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:343:0x07e9  */
    /* JADX WARN: Code duplicated, block: B:346:0x07f6  */
    /* JADX WARN: Code duplicated, block: B:349:0x07fe  */
    /* JADX WARN: Code duplicated, block: B:352:0x080d  */
    /* JADX WARN: Code duplicated, block: B:354:0x0820  */
    /* JADX WARN: Code duplicated, block: B:358:0x085b  */
    /* JADX WARN: Code duplicated, block: B:365:0x0883  */
    /* JADX WARN: Code duplicated, block: B:371:0x0894  */
    /* JADX WARN: Code duplicated, block: B:382:0x08c3 A[LOOP:7: B:359:0x085d->B:382:0x08c3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:385:0x08ca  */
    /* JADX WARN: Code duplicated, block: B:400:0x08fe  */
    /* JADX WARN: Code duplicated, block: B:404:0x0908  */
    /* JADX WARN: Code duplicated, block: B:406:0x090c  */
    /* JADX WARN: Code duplicated, block: B:410:0x091c  */
    /* JADX WARN: Code duplicated, block: B:414:0x093d  */
    /* JADX WARN: Code duplicated, block: B:417:0x094e  */
    /* JADX WARN: Code duplicated, block: B:419:0x0965  */
    /* JADX WARN: Code duplicated, block: B:421:0x0973  */
    /* JADX WARN: Code duplicated, block: B:423:0x097e  */
    /* JADX WARN: Code duplicated, block: B:425:0x09a9  */
    /* JADX WARN: Code duplicated, block: B:428:0x09b3  */
    /* JADX WARN: Code duplicated, block: B:441:0x0a1e  */
    /* JADX WARN: Code duplicated, block: B:442:0x0a27  */
    /* JADX WARN: Code duplicated, block: B:446:0x0a3a A[PHI: r16 r20 r21
      0x0a3a: PHI (r16v2 java.util.Map) = (r16v3 java.util.Map), (r16v4 java.util.Map) binds: [B:445:0x0a38, B:443:0x0a28] A[DONT_GENERATE, DONT_INLINE]
      0x0a3a: PHI (r20v9 wq1) = (r20v10 wq1), (r2v41 wq1) binds: [B:445:0x0a38, B:443:0x0a28] A[DONT_GENERATE, DONT_INLINE]
      0x0a3a: PHI (r21v8 java.util.Iterator) = (r21v9 java.util.Iterator), (r3v56 java.util.Iterator) binds: [B:445:0x0a38, B:443:0x0a28] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:451:0x0a63  */
    /* JADX WARN: Code duplicated, block: B:464:0x0ae9  */
    /* JADX WARN: Code duplicated, block: B:467:0x0af1  */
    /* JADX WARN: Code duplicated, block: B:536:0x063f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:537:0x0656 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:539:0x062b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:540:0x062b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:542:0x0704 A[EDGE_INSN: B:542:0x0704->B:298:0x0704 BREAK  A[LOOP:3: B:276:0x06a7->B:299:0x0709], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:543:0x077b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:544:0x076f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:548:0x07dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:549:0x07e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:553:0x08be A[EDGE_INSN: B:553:0x08be->B:381:0x08be BREAK  A[LOOP:7: B:359:0x085d->B:382:0x08c3], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:554:0x092e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:556:0x0a3f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:557:0x0a32 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:558:0x0a0a A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:562:0x0abf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:564:0x0a5d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:571:0x04b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:573:0x04a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:576:0x04fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:579:0x04eb A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:587:0x05dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:590:0x0360 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:604:0x023e A[EDGE_INSN: B:604:0x023e->B:101:0x023e BREAK  A[LOOP:20: B:85:0x01f2->B:102:0x0242], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x018e  */
    /* JADX WARN: Code duplicated, block: B:67:0x0195  */
    /* JADX WARN: Code duplicated, block: B:74:0x01d1 A[Catch: all -> 0x01dd, SQLiteException -> 0x01e0, TRY_LEAVE, TryCatch #9 {SQLiteException -> 0x01e0, blocks: (B:72:0x01cb, B:74:0x01d1, B:83:0x01eb), top: B:481:0x01cb }] */
    /* JADX WARN: Code duplicated, block: B:83:0x01eb A[Catch: all -> 0x01dd, SQLiteException -> 0x01e0, TRY_ENTER, TRY_LEAVE, TryCatch #9 {SQLiteException -> 0x01e0, blocks: (B:72:0x01cb, B:74:0x01d1, B:83:0x01eb), top: B:481:0x01cb }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v206 */
    /* JADX WARN: Type inference failed for: r0v207 */
    /* JADX WARN: Type inference failed for: r0v31, types: [mb, wq1] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v54 */
    /* JADX WARN: Type inference failed for: r0v55 */
    /* JADX WARN: Type inference failed for: r0v57, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v20, types: [mb, wq1] */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2, types: [y53] */
    /* JADX WARN: Type inference failed for: r17v21 */
    /* JADX WARN: Type inference failed for: r17v22 */
    /* JADX WARN: Type inference failed for: r17v23 */
    /* JADX WARN: Type inference failed for: r17v24, types: [y53] */
    /* JADX WARN: Type inference failed for: r17v30 */
    /* JADX WARN: Type inference failed for: r17v31 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v8 */
    /* JADX WARN: Type inference failed for: r18v29 */
    /* JADX WARN: Type inference failed for: r18v30 */
    /* JADX WARN: Type inference failed for: r18v31 */
    /* JADX WARN: Type inference failed for: r18v32 */
    /* JADX WARN: Type inference failed for: r18v34 */
    /* JADX WARN: Type inference failed for: r18v35 */
    /* JADX WARN: Type inference failed for: r18v36 */
    /* JADX WARN: Type inference failed for: r18v37 */
    /* JADX WARN: Type inference failed for: r18v38, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r18v42 */
    /* JADX WARN: Type inference failed for: r18v43 */
    /* JADX WARN: Type inference failed for: r18v44 */
    /* JADX WARN: Type inference failed for: r18v45 */
    /* JADX WARN: Type inference failed for: r18v46 */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r21v18 */
    /* JADX WARN: Type inference failed for: r3v69, types: [z23] */
    /* JADX WARN: Type inference failed for: r3v83, types: [z23] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v37, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v53 */
    /* JADX WARN: Type inference failed for: r5v54 */
    /* JADX WARN: Type inference failed for: r5v55 */
    /* JADX WARN: Type inference failed for: r5v56 */
    /* JADX WARN: Type inference failed for: r5v57 */
    /* JADX WARN: Type inference failed for: r5v58 */
    /* JADX WARN: Type inference failed for: r5v59 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v64 */
    /* JADX WARN: Type inference failed for: r7v65 */
    /* JADX WARN: Type inference failed for: r7v66, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v67, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v68, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v69 */
    /* JADX WARN: Type inference failed for: r7v70 */
    /* JADX WARN: Type inference failed for: r7v71 */
    /* JADX WARN: Type inference failed for: r7v72 */
    /* JADX WARN: Type inference failed for: r7v73, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v75 */
    /* JADX WARN: Type inference failed for: r7v80 */
    /* JADX WARN: Type inference failed for: r7v81 */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public final ArrayList I(String str, List list, List list2, Long l, Long l2, boolean z) throws Throwable {
        boolean z2;
        boolean z3;
        String str2;
        Map map;
        Object obj;
        ?? r5;
        Cursor cursorQuery;
        ?? r17;
        String str3;
        Object obj2;
        ?? r21;
        Map map2;
        String str4;
        y53 y53Var;
        Map map3;
        Map map4;
        Map map5;
        String str5;
        i63 i63Var;
        BitSet bitSet;
        BitSet bitSet2;
        mb mbVar;
        i63 i63Var2;
        mb mbVar2;
        List<n03> list3;
        long jLongValue;
        Integer numValueOf;
        int i;
        boolean z4;
        Iterator it;
        m63 m63Var;
        Long lValueOf;
        bu2 bu2VarG0;
        String str6;
        ?? mbVar3;
        ?? r7;
        Cursor cursorRawQuery;
        ?? r0;
        mb mbVar4;
        Iterator it2;
        Integer num;
        i63 i63Var3;
        List list4;
        ?? r18;
        Iterator it3;
        y53 y53Var2;
        Integer numValueOf2;
        List arrayList;
        String str7;
        ArrayList arrayList2;
        bu2 bu2VarG1;
        y53 y53Var3;
        String str8;
        ContentValues contentValues;
        Iterator it4;
        wq1 wq1Var;
        String strV;
        Map map6;
        Iterator it5;
        Iterator it6;
        wq1 wq1Var2;
        Integer num2;
        int iIntValue;
        Iterator it7;
        boolean zB;
        wq1 wq1Var3;
        Map map7;
        w03 w03Var;
        Integer numValueOf3;
        gj2 gj2Var;
        int i2;
        Integer numValueOf4;
        y53 y53Var4;
        String str9;
        mb mbVar5;
        Cursor cursor;
        y53 y53Var5;
        String str10;
        Cursor cursorQuery2;
        Integer numValueOf5;
        List list5;
        List arrayList3;
        ir3 ir3Var;
        ?? mbVar6;
        Iterator it8;
        d53 d53Var;
        d53 d53VarA;
        tu2 tu2VarO0;
        long j;
        String strY;
        Map map8;
        int iIntValue2;
        Iterator it9;
        boolean zA;
        Map map9;
        ir3 ir3Var2;
        Integer num3;
        gj2 gj2Var2;
        int iU;
        eq3 eq3Var;
        boolean z5;
        String str11;
        mb mbVar7;
        Cursor cursor2;
        String str12;
        Cursor cursor3;
        Cursor cursorQuery3;
        Cursor cursor4;
        Integer numValueOf6;
        List list6;
        List arrayList4;
        mb mbVar8;
        int i3;
        ?? r6;
        Object obj3;
        ?? r8;
        ?? r19;
        ?? r110;
        List arrayList5;
        y53 y53Var6 = (y53) this.a;
        gu2.l(str);
        gu2.o(list);
        gu2.o(list2);
        this.d = str;
        this.e = new HashSet();
        this.f = new mb();
        this.i = l;
        this.v = l2;
        Iterator it10 = list.iterator();
        while (true) {
            if (!it10.hasNext()) {
                z2 = false;
                break;
            }
            if ("_s".equals(((d53) it10.next()).y())) {
                z2 = true;
                break;
            }
        }
        sp2.a();
        boolean zP = y53Var6.d.P(this.d, h13.F0);
        sp2.a();
        boolean zP2 = y53Var6.d.P(this.d, h13.E0);
        if3 if3Var = this.b;
        if (z2) {
            bu2 bu2VarG2 = if3Var.g0();
            String str13 = this.d;
            bu2VarG2.F();
            bu2VarG2.D();
            gu2.l(str13);
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("current_session_count", (Integer) 0);
            try {
                bu2VarG2.v0().update("events", contentValues2, "app_id = ?", new String[]{str13});
            } catch (SQLiteException e) {
                ((y53) bu2VarG2.a).d().I().c(c33.M(str13), e, "Error resetting session-scoped event counts. appId");
            }
        }
        Map map10 = Collections.EMPTY_MAP;
        String str14 = "Failed to merge filter. appId";
        Object objM = "Database error querying filters. appId";
        String str15 = "audience_id";
        try {
            try {
                try {
                    if (zP2 && zP) {
                        bu2 bu2VarG3 = if3Var.g0();
                        y53 y53Var7 = (y53) bu2VarG3.a;
                        String str16 = this.d;
                        gu2.l(str16);
                        z3 = z2;
                        mb mbVar9 = new mb();
                        try {
                            ?? Query = bu2VarG3.v0().query("event_filters", new String[]{"audience_id", "data"}, "app_id=?", new String[]{str16}, null, null, null);
                            try {
                                try {
                                    if (Query.moveToFirst()) {
                                        str2 = "data";
                                        Query = Query;
                                        ?? r111 = "event_filters";
                                        while (true) {
                                            try {
                                                try {
                                                    n03 n03Var = (n03) ((l03) lf3.p0(n03.F(), Query.getBlob(1))).g();
                                                    if (n03Var.z()) {
                                                        Integer numValueOf7 = Integer.valueOf(Query.getInt(0));
                                                        List list7 = (List) mbVar9.get(numValueOf7);
                                                        if (list7 == null) {
                                                            arrayList5 = new ArrayList();
                                                            mbVar9.put(numValueOf7, arrayList5);
                                                        } else {
                                                            arrayList5 = list7;
                                                        }
                                                        arrayList5.add(n03Var);
                                                        r111 = Query;
                                                    } else {
                                                        r111 = Query;
                                                    }
                                                } catch (IOException e2) {
                                                    r111 = Query;
                                                    y53Var7.d().I().c(c33.M(str16), e2, "Failed to merge filter. appId");
                                                }
                                                try {
                                                    if (!r111.moveToNext()) {
                                                        break;
                                                    }
                                                    Query = r111;
                                                    r111 = r111;
                                                } catch (SQLiteException e3) {
                                                    e = e3;
                                                    r110 = r111;
                                                    r8 = r110;
                                                    try {
                                                        y53Var7.d().I().c(c33.M(str16), e, "Database error querying filters. appId");
                                                        map10 = Collections.EMPTY_MAP;
                                                        if (r8 != 0) {
                                                            r8.close();
                                                        }
                                                        map = map10;
                                                    } catch (Throwable th) {
                                                        th = th;
                                                        if (r8 != 0) {
                                                            r8.close();
                                                        }
                                                        throw th;
                                                    }
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    r19 = r111;
                                                    r8 = r19;
                                                    if (r8 != 0) {
                                                        r8.close();
                                                    }
                                                    throw th;
                                                }
                                            } catch (SQLiteException e4) {
                                                e = e4;
                                                r110 = Query;
                                                r8 = r110;
                                                y53Var7.d().I().c(c33.M(str16), e, "Database error querying filters. appId");
                                                map10 = Collections.EMPTY_MAP;
                                                if (r8 != 0) {
                                                    r8.close();
                                                }
                                                map = map10;
                                                bu2 bu2VarG4 = if3Var.g0();
                                                obj = (y53) bu2VarG4.a;
                                                r5 = this.d;
                                                bu2VarG4.F();
                                                bu2VarG4.D();
                                                gu2.l(r5);
                                                cursorQuery = bu2VarG4.v0().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{r5}, null, null, null);
                                                if (cursorQuery.moveToFirst()) {
                                                    mbVar8 = new mb();
                                                    r17 = obj;
                                                    r21 = r5;
                                                    while (true) {
                                                        try {
                                                            i3 = cursorQuery.getInt(0);
                                                            try {
                                                                i63 i63Var4 = (i63) ((g63) lf3.p0(i63.B(), cursorQuery.getBlob(1))).g();
                                                                Object objValueOf = Integer.valueOf(i3);
                                                                mbVar8.put(objValueOf, i63Var4);
                                                                str3 = str14;
                                                                obj2 = objM;
                                                                obj3 = objValueOf;
                                                                r6 = r21;
                                                            } catch (IOException e5) {
                                                                z23 z23VarI = r17.d().I();
                                                                str3 = str14;
                                                                str14 = "Failed to merge filter results. appId, audienceId, error";
                                                                obj2 = objM;
                                                                try {
                                                                    objM = c33.M(r21);
                                                                    Integer numValueOf8 = Integer.valueOf(i3);
                                                                    z23VarI.d("Failed to merge filter results. appId, audienceId, error", objM, numValueOf8, e5);
                                                                    obj3 = z23VarI;
                                                                    r6 = numValueOf8;
                                                                } catch (SQLiteException e6) {
                                                                    e = e6;
                                                                    r21 = r21;
                                                                    r17.d().I().c(c33.M(r21), e, "Database error querying filter results. appId");
                                                                    Map map11 = Collections.EMPTY_MAP;
                                                                    if (cursorQuery != null) {
                                                                        cursorQuery.close();
                                                                    }
                                                                    map2 = map11;
                                                                    if (map2.isEmpty()) {
                                                                        str5 = "audience_id";
                                                                        y53Var = y53Var6;
                                                                    } else {
                                                                        HashSet<Integer> hashSet = new HashSet(map2.keySet());
                                                                        if (z3) {
                                                                            String str17 = this.d;
                                                                            bu2VarG0 = if3Var.g0();
                                                                            str6 = this.d;
                                                                            bu2VarG0.F();
                                                                            bu2VarG0.D();
                                                                            gu2.l(str6);
                                                                            mbVar3 = new mb();
                                                                            try {
                                                                                try {
                                                                                    cursorRawQuery = bu2VarG0.v0().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str6, str6});
                                                                                    try {
                                                                                        if (cursorRawQuery.moveToFirst()) {
                                                                                            do {
                                                                                                numValueOf2 = Integer.valueOf(cursorRawQuery.getInt(0));
                                                                                                arrayList = (List) mbVar3.get(numValueOf2);
                                                                                                if (arrayList == null) {
                                                                                                    arrayList = new ArrayList();
                                                                                                    mbVar3.put(numValueOf2, arrayList);
                                                                                                }
                                                                                                arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                                                                            } while (cursorRawQuery.moveToNext());
                                                                                        } else {
                                                                                            mbVar3 = Collections.EMPTY_MAP;
                                                                                        }
                                                                                    } catch (SQLiteException e7) {
                                                                                        e = e7;
                                                                                        ((y53) bu2VarG0.a).d().I().c(c33.M(str6), e, "Database error querying scoped filters. appId");
                                                                                        mbVar3 = Collections.EMPTY_MAP;
                                                                                        r0 = mbVar3;
                                                                                        if (cursorRawQuery != null) {
                                                                                        }
                                                                                        gu2.l(str17);
                                                                                        mbVar4 = new mb();
                                                                                        if (!map2.isEmpty()) {
                                                                                            it2 = map2.keySet().iterator();
                                                                                            while (it2.hasNext()) {
                                                                                                num = (Integer) it2.next();
                                                                                                num.getClass();
                                                                                                i63Var3 = (i63) map2.get(num);
                                                                                                list4 = (List) r0.get(num);
                                                                                                if (list4 != null) {
                                                                                                }
                                                                                                r18 = r0;
                                                                                                it3 = it2;
                                                                                                y53Var2 = y53Var6;
                                                                                                mbVar4.put(num, i63Var3);
                                                                                                r0 = r18;
                                                                                                it2 = it3;
                                                                                                str15 = str15;
                                                                                                y53Var6 = y53Var2;
                                                                                            }
                                                                                        }
                                                                                        str4 = str15;
                                                                                        y53Var = y53Var6;
                                                                                        map3 = mbVar4;
                                                                                        map5 = map3;
                                                                                        map4 = map2;
                                                                                        for (Integer num4 : hashSet) {
                                                                                            num4.getClass();
                                                                                            i63Var = (i63) map5.get(num4);
                                                                                            bitSet = new BitSet();
                                                                                            bitSet2 = new BitSet();
                                                                                            mbVar = new mb();
                                                                                            if (i63Var != null) {
                                                                                                for (z43 z43Var : i63Var.x()) {
                                                                                                    if (z43Var.t()) {
                                                                                                        i63 i63Var5 = i63Var;
                                                                                                        Integer numValueOf9 = Integer.valueOf(z43Var.u());
                                                                                                        if (z43Var.v()) {
                                                                                                            lValueOf = Long.valueOf(z43Var.w());
                                                                                                        } else {
                                                                                                            lValueOf = null;
                                                                                                        }
                                                                                                        mbVar.put(numValueOf9, lValueOf);
                                                                                                        i63Var = i63Var5;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            i63Var2 = i63Var;
                                                                                            mbVar2 = new mb();
                                                                                            if (i63Var2 != null) {
                                                                                                it = i63Var2.z().iterator();
                                                                                                while (it.hasNext()) {
                                                                                                    m63Var = (m63) it.next();
                                                                                                    if (!m63Var.t()) {
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            Map map12 = map5;
                                                                                            if (i63Var2 != null) {
                                                                                                i = 0;
                                                                                                while (i < i63Var2.u() * 64) {
                                                                                                    if (lf3.j0((tm2) i63Var2.t(), i)) {
                                                                                                        z4 = zP;
                                                                                                        y53Var.d().L().c(num4, Integer.valueOf(i), "Filter already evaluated. audience ID, filter ID");
                                                                                                        bitSet2.set(i);
                                                                                                        if (lf3.j0((tm2) i63Var2.v(), i)) {
                                                                                                            bitSet.set(i);
                                                                                                        }
                                                                                                        i++;
                                                                                                        zP = z4;
                                                                                                    } else {
                                                                                                        z4 = zP;
                                                                                                    }
                                                                                                    mbVar.remove(Integer.valueOf(i));
                                                                                                    i++;
                                                                                                    zP = z4;
                                                                                                }
                                                                                            }
                                                                                            boolean z6 = zP;
                                                                                            i63 i63Var6 = (i63) map4.get(num4);
                                                                                            if (zP2) {
                                                                                                for (n03 n03Var2 : list3) {
                                                                                                    int iU2 = n03Var2.u();
                                                                                                    Integer num5 = num4;
                                                                                                    jLongValue = this.v.longValue() / 1000;
                                                                                                    if (n03Var2.C()) {
                                                                                                        jLongValue = this.i.longValue() / 1000;
                                                                                                    }
                                                                                                    numValueOf = Integer.valueOf(iU2);
                                                                                                    if (mbVar.containsKey(numValueOf)) {
                                                                                                        mbVar.put(numValueOf, Long.valueOf(jLongValue));
                                                                                                    }
                                                                                                    if (mbVar2.containsKey(numValueOf)) {
                                                                                                        mbVar2.put(numValueOf, Long.valueOf(jLongValue));
                                                                                                    }
                                                                                                    num4 = num5;
                                                                                                }
                                                                                            }
                                                                                            this.f.put(num4, new eq3(this, this.d, i63Var6, bitSet, bitSet2, mbVar, mbVar2));
                                                                                            obj2 = obj2;
                                                                                            map = map;
                                                                                            str2 = str2;
                                                                                            zP = z6;
                                                                                            map5 = map12;
                                                                                            map4 = map4;
                                                                                            zP2 = zP2;
                                                                                        }
                                                                                        str5 = str4;
                                                                                        str7 = str2;
                                                                                        String str18 = str3;
                                                                                        ?? r10 = obj2;
                                                                                        if (!list.isEmpty()) {
                                                                                            ir3Var = new ir3(this);
                                                                                            mbVar6 = new mb();
                                                                                            it8 = list.iterator();
                                                                                            while (it8.hasNext()) {
                                                                                                d53Var = (d53) it8.next();
                                                                                                d53VarA = ir3Var.a(this.d, d53Var);
                                                                                                if (d53VarA != null) {
                                                                                                    tu2VarO0 = if3Var.g0().o0(this.d, d53Var, d53VarA.y());
                                                                                                    if3Var.g0().f0("events", tu2VarO0);
                                                                                                    if (z) {
                                                                                                        continue;
                                                                                                    } else {
                                                                                                        j = tu2VarO0.c;
                                                                                                        strY = d53VarA.y();
                                                                                                        map8 = (Map) mbVar6.get(strY);
                                                                                                        if (map8 == null) {
                                                                                                            bu2 bu2VarG5 = if3Var.g0();
                                                                                                            y53 y53Var8 = (y53) bu2VarG5.a;
                                                                                                            str11 = this.d;
                                                                                                            bu2VarG5.F();
                                                                                                            bu2VarG5.D();
                                                                                                            gu2.l(str11);
                                                                                                            gu2.l(strY);
                                                                                                            mbVar7 = new mb();
                                                                                                            try {
                                                                                                                cursorQuery3 = bu2VarG5.v0().query("event_filters", new String[]{str5, str7}, "app_id=? AND event_name=?", new String[]{str11, strY}, null, null, null);
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        if (cursorQuery3.moveToFirst()) {
                                                                                                                            str12 = str11;
                                                                                                                            while (true) {
                                                                                                                                try {
                                                                                                                                    try {
                                                                                                                                        n03 n03Var3 = (n03) ((l03) lf3.p0(n03.F(), cursorQuery3.getBlob(1))).g();
                                                                                                                                        numValueOf6 = Integer.valueOf(cursorQuery3.getInt(0));
                                                                                                                                        list6 = (List) mbVar7.get(numValueOf6);
                                                                                                                                        if (list6 == null) {
                                                                                                                                            cursor4 = cursorQuery3;
                                                                                                                                            try {
                                                                                                                                                arrayList4 = new ArrayList();
                                                                                                                                                mbVar7.put(numValueOf6, arrayList4);
                                                                                                                                            } catch (SQLiteException e8) {
                                                                                                                                                e = e8;
                                                                                                                                                cursor3 = cursor4;
                                                                                                                                                try {
                                                                                                                                                    y53Var8.d().I().c(c33.M(str12), e, r10);
                                                                                                                                                    map8 = Collections.EMPTY_MAP;
                                                                                                                                                    if (cursor3 != null) {
                                                                                                                                                        cursor3.close();
                                                                                                                                                    }
                                                                                                                                                } catch (Throwable th3) {
                                                                                                                                                    th = th3;
                                                                                                                                                    cursor2 = cursor3;
                                                                                                                                                    if (cursor2 != null) {
                                                                                                                                                        cursor2.close();
                                                                                                                                                    }
                                                                                                                                                    throw th;
                                                                                                                                                }
                                                                                                                                            } catch (Throwable th4) {
                                                                                                                                                th = th4;
                                                                                                                                                cursor2 = cursor4;
                                                                                                                                                if (cursor2 != null) {
                                                                                                                                                    cursor2.close();
                                                                                                                                                }
                                                                                                                                                throw th;
                                                                                                                                            }
                                                                                                                                        } else {
                                                                                                                                            cursor4 = cursorQuery3;
                                                                                                                                            arrayList4 = list6;
                                                                                                                                        }
                                                                                                                                        arrayList4.add(n03Var3);
                                                                                                                                    } catch (IOException e9) {
                                                                                                                                        cursor4 = cursorQuery3;
                                                                                                                                        y53Var8.d().I().c(c33.M(str12), e9, str18);
                                                                                                                                    }
                                                                                                                                    if (!cursor4.moveToNext()) {
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    cursorQuery3 = cursor4;
                                                                                                                                } catch (SQLiteException e10) {
                                                                                                                                    e = e10;
                                                                                                                                    cursor4 = cursorQuery3;
                                                                                                                                    cursor3 = cursor4;
                                                                                                                                    y53Var8.d().I().c(c33.M(str12), e, r10);
                                                                                                                                    map8 = Collections.EMPTY_MAP;
                                                                                                                                    if (cursor3 != null) {
                                                                                                                                        cursor3.close();
                                                                                                                                    }
                                                                                                                                    mbVar6.put(strY, map8);
                                                                                                                                    for (Integer num6 : map8.keySet()) {
                                                                                                                                        iIntValue2 = num6.intValue();
                                                                                                                                        if (this.e.contains(num6)) {
                                                                                                                                            y53Var.d().L().b(num6, "Skipping failed audience ID");
                                                                                                                                        } else {
                                                                                                                                            it9 = ((List) map8.get(num6)).iterator();
                                                                                                                                            zA = true;
                                                                                                                                            while (true) {
                                                                                                                                                if (!it9.hasNext()) {
                                                                                                                                                    map9 = map8;
                                                                                                                                                    ir3Var2 = ir3Var;
                                                                                                                                                    num3 = num6;
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                                n03 n03Var4 = (n03) it9.next();
                                                                                                                                                ir3Var2 = ir3Var;
                                                                                                                                                num3 = num6;
                                                                                                                                                map9 = map8;
                                                                                                                                                gj2Var2 = new gj2(this, this.d, iIntValue2, n03Var4, 0);
                                                                                                                                                Long l3 = this.i;
                                                                                                                                                Long l4 = this.v;
                                                                                                                                                iU = n03Var4.u();
                                                                                                                                                eq3Var = (eq3) this.f.get(num3);
                                                                                                                                                if (eq3Var == null) {
                                                                                                                                                    z5 = false;
                                                                                                                                                } else {
                                                                                                                                                    z5 = eq3Var.d.get(iU);
                                                                                                                                                }
                                                                                                                                                zA = gj2Var2.a(l3, l4, d53VarA, j, tu2VarO0, z5);
                                                                                                                                                if (!zA) {
                                                                                                                                                    this.e.add(num3);
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                                J(num3).a(gj2Var2);
                                                                                                                                                num6 = num3;
                                                                                                                                                map8 = map9;
                                                                                                                                                ir3Var = ir3Var2;
                                                                                                                                            }
                                                                                                                                            if (!zA) {
                                                                                                                                                this.e.add(num3);
                                                                                                                                            }
                                                                                                                                            ir3Var = ir3Var2;
                                                                                                                                            map8 = map9;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                            cursor4.close();
                                                                                                                            map8 = mbVar7;
                                                                                                                        } else {
                                                                                                                            map8 = Collections.EMPTY_MAP;
                                                                                                                            cursorQuery3.close();
                                                                                                                        }
                                                                                                                    } catch (SQLiteException e11) {
                                                                                                                        e = e11;
                                                                                                                        str12 = str11;
                                                                                                                    }
                                                                                                                } catch (Throwable th5) {
                                                                                                                    th = th5;
                                                                                                                    cursor4 = cursorQuery3;
                                                                                                                }
                                                                                                            } catch (SQLiteException e12) {
                                                                                                                e = e12;
                                                                                                                str12 = str11;
                                                                                                                cursor3 = null;
                                                                                                            } catch (Throwable th6) {
                                                                                                                th = th6;
                                                                                                                cursor2 = null;
                                                                                                            }
                                                                                                            mbVar6.put(strY, map8);
                                                                                                        }
                                                                                                        while (r18.hasNext()) {
                                                                                                            iIntValue2 = num6.intValue();
                                                                                                            if (this.e.contains(num6)) {
                                                                                                                y53Var.d().L().b(num6, "Skipping failed audience ID");
                                                                                                            } else {
                                                                                                                it9 = ((List) map8.get(num6)).iterator();
                                                                                                                zA = true;
                                                                                                                while (true) {
                                                                                                                    if (!it9.hasNext()) {
                                                                                                                        map9 = map8;
                                                                                                                        ir3Var2 = ir3Var;
                                                                                                                        num3 = num6;
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    n03 n03Var5 = (n03) it9.next();
                                                                                                                    ir3Var2 = ir3Var;
                                                                                                                    num3 = num6;
                                                                                                                    map9 = map8;
                                                                                                                    gj2Var2 = new gj2(this, this.d, iIntValue2, n03Var5, 0);
                                                                                                                    Long l5 = this.i;
                                                                                                                    Long l6 = this.v;
                                                                                                                    iU = n03Var5.u();
                                                                                                                    eq3Var = (eq3) this.f.get(num3);
                                                                                                                    if (eq3Var == null) {
                                                                                                                        z5 = false;
                                                                                                                    } else {
                                                                                                                        z5 = eq3Var.d.get(iU);
                                                                                                                    }
                                                                                                                    zA = gj2Var2.a(l5, l6, d53VarA, j, tu2VarO0, z5);
                                                                                                                    if (!zA) {
                                                                                                                        this.e.add(num3);
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    J(num3).a(gj2Var2);
                                                                                                                    num6 = num3;
                                                                                                                    map8 = map9;
                                                                                                                    ir3Var = ir3Var2;
                                                                                                                }
                                                                                                                if (!zA) {
                                                                                                                    this.e.add(num3);
                                                                                                                }
                                                                                                                ir3Var = ir3Var2;
                                                                                                                map8 = map9;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        if (!z) {
                                                                                            return new ArrayList();
                                                                                        }
                                                                                        if (!list2.isEmpty()) {
                                                                                            mb mbVar10 = new mb();
                                                                                            it4 = list2.iterator();
                                                                                            wq1Var = mbVar10;
                                                                                            while (it4.hasNext()) {
                                                                                                u63 u63Var = (u63) it4.next();
                                                                                                strV = u63Var.v();
                                                                                                map6 = (Map) wq1Var.get(strV);
                                                                                                if (map6 == null) {
                                                                                                    bu2 bu2VarG6 = if3Var.g0();
                                                                                                    y53Var4 = (y53) bu2VarG6.a;
                                                                                                    str9 = this.d;
                                                                                                    bu2VarG6.F();
                                                                                                    bu2VarG6.D();
                                                                                                    gu2.l(str9);
                                                                                                    gu2.l(strV);
                                                                                                    mbVar5 = new mb();
                                                                                                    try {
                                                                                                        cursorQuery2 = bu2VarG6.v0().query("property_filters", new String[]{str5, str7}, "app_id=? AND property_name=?", new String[]{str9, strV}, null, null, null);
                                                                                                        try {
                                                                                                            try {
                                                                                                                if (cursorQuery2.moveToFirst()) {
                                                                                                                    it5 = it4;
                                                                                                                    while (true) {
                                                                                                                        try {
                                                                                                                            try {
                                                                                                                                w03 w03Var2 = (w03) ((v03) lf3.p0(w03.B(), cursorQuery2.getBlob(1))).g();
                                                                                                                                numValueOf5 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                                                                                list5 = (List) mbVar5.get(numValueOf5);
                                                                                                                                if (list5 == null) {
                                                                                                                                    y53Var5 = y53Var4;
                                                                                                                                    try {
                                                                                                                                        arrayList3 = new ArrayList();
                                                                                                                                        mbVar5.put(numValueOf5, arrayList3);
                                                                                                                                    } catch (SQLiteException e13) {
                                                                                                                                        e = e13;
                                                                                                                                        str10 = str9;
                                                                                                                                        cursor = cursorQuery2;
                                                                                                                                        try {
                                                                                                                                            y53Var5.d().I().c(c33.M(str10), e, r10);
                                                                                                                                            map6 = Collections.EMPTY_MAP;
                                                                                                                                            if (cursor != null) {
                                                                                                                                                cursor.close();
                                                                                                                                            }
                                                                                                                                            wq1Var.put(strV, map6);
                                                                                                                                            it6 = map6.keySet().iterator();
                                                                                                                                            wq1Var2 = wq1Var;
                                                                                                                                            while (it6.hasNext()) {
                                                                                                                                                num2 = (Integer) it6.next();
                                                                                                                                                iIntValue = num2.intValue();
                                                                                                                                                if (this.e.contains(num2)) {
                                                                                                                                                    y53Var.d().L().b(num2, "Skipping failed audience ID");
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                                it7 = ((List) map6.get(num2)).iterator();
                                                                                                                                                zB = true;
                                                                                                                                                wq1Var3 = wq1Var2;
                                                                                                                                                while (true) {
                                                                                                                                                    if (it7.hasNext()) {
                                                                                                                                                        w03Var = (w03) it7.next();
                                                                                                                                                        map7 = map6;
                                                                                                                                                        if (Log.isLoggable(y53Var.d().O(), 2)) {
                                                                                                                                                            z23 z23VarL = y53Var.d().L();
                                                                                                                                                            if (w03Var.t()) {
                                                                                                                                                                numValueOf4 = Integer.valueOf(w03Var.u());
                                                                                                                                                            } else {
                                                                                                                                                                numValueOf4 = null;
                                                                                                                                                            }
                                                                                                                                                            z23VarL.d("Evaluating filter. audience, filter, property", num2, numValueOf4, y53Var.m().c(w03Var.v()));
                                                                                                                                                            y53Var.d().L().b(if3Var.j0().g0(w03Var), "Filter definition");
                                                                                                                                                        }
                                                                                                                                                        if (w03Var.t()) {
                                                                                                                                                        }
                                                                                                                                                        z23 z23VarJ = y53Var.d().J();
                                                                                                                                                        b33 b33VarM = c33.M(this.d);
                                                                                                                                                        if (w03Var.t()) {
                                                                                                                                                            numValueOf3 = Integer.valueOf(w03Var.u());
                                                                                                                                                        } else {
                                                                                                                                                            numValueOf3 = null;
                                                                                                                                                        }
                                                                                                                                                        z23VarJ.c(b33VarM, String.valueOf(numValueOf3), "Invalid property filter ID. appId, id");
                                                                                                                                                        this.e.add(num2);
                                                                                                                                                        map6 = map7;
                                                                                                                                                        wq1Var2 = wq1Var3;
                                                                                                                                                        it6 = it6;
                                                                                                                                                    } else {
                                                                                                                                                        map7 = map6;
                                                                                                                                                        wq1Var3 = wq1Var3;
                                                                                                                                                        it6 = it6;
                                                                                                                                                    }
                                                                                                                                                    if (!zB) {
                                                                                                                                                        this.e.add(num2);
                                                                                                                                                    }
                                                                                                                                                    map6 = map7;
                                                                                                                                                    wq1Var2 = wq1Var3;
                                                                                                                                                    it6 = it6;
                                                                                                                                                    J(num2).a(gj2Var);
                                                                                                                                                    iIntValue = i2;
                                                                                                                                                    map6 = map7;
                                                                                                                                                    wq1Var3 = wq1Var3;
                                                                                                                                                    it6 = it6;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            it4 = it5;
                                                                                                                                            wq1Var = wq1Var2;
                                                                                                                                        } catch (Throwable th7) {
                                                                                                                                            th = th7;
                                                                                                                                            if (cursor != null) {
                                                                                                                                                cursor.close();
                                                                                                                                            }
                                                                                                                                            throw th;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    y53Var5 = y53Var4;
                                                                                                                                    arrayList3 = list5;
                                                                                                                                }
                                                                                                                                arrayList3.add(w03Var2);
                                                                                                                                str10 = str9;
                                                                                                                            } catch (IOException e14) {
                                                                                                                                y53Var5 = y53Var4;
                                                                                                                                str10 = str9;
                                                                                                                                y53Var5.d().I().c(c33.M(str10), e14, "Failed to merge filter");
                                                                                                                            }
                                                                                                                            try {
                                                                                                                                if (!cursorQuery2.moveToNext()) {
                                                                                                                                    break;
                                                                                                                                }
                                                                                                                                y53Var4 = y53Var5;
                                                                                                                                str9 = str10;
                                                                                                                            } catch (SQLiteException e15) {
                                                                                                                                e = e15;
                                                                                                                                cursor = cursorQuery2;
                                                                                                                                y53Var5.d().I().c(c33.M(str10), e, r10);
                                                                                                                                map6 = Collections.EMPTY_MAP;
                                                                                                                                if (cursor != null) {
                                                                                                                                    cursor.close();
                                                                                                                                }
                                                                                                                            }
                                                                                                                        } catch (SQLiteException e16) {
                                                                                                                            e = e16;
                                                                                                                            y53Var5 = y53Var4;
                                                                                                                            str10 = str9;
                                                                                                                            cursor = cursorQuery2;
                                                                                                                            y53Var5.d().I().c(c33.M(str10), e, r10);
                                                                                                                            map6 = Collections.EMPTY_MAP;
                                                                                                                            if (cursor != null) {
                                                                                                                                cursor.close();
                                                                                                                            }
                                                                                                                            wq1Var.put(strV, map6);
                                                                                                                            it6 = map6.keySet().iterator();
                                                                                                                            wq1Var2 = wq1Var;
                                                                                                                            while (it6.hasNext()) {
                                                                                                                                num2 = (Integer) it6.next();
                                                                                                                                iIntValue = num2.intValue();
                                                                                                                                if (this.e.contains(num2)) {
                                                                                                                                    y53Var.d().L().b(num2, "Skipping failed audience ID");
                                                                                                                                    break;
                                                                                                                                    break;
                                                                                                                                }
                                                                                                                                it7 = ((List) map6.get(num2)).iterator();
                                                                                                                                zB = true;
                                                                                                                                wq1Var3 = wq1Var2;
                                                                                                                                while (true) {
                                                                                                                                    if (it7.hasNext()) {
                                                                                                                                        w03Var = (w03) it7.next();
                                                                                                                                        map7 = map6;
                                                                                                                                        if (Log.isLoggable(y53Var.d().O(), 2)) {
                                                                                                                                            z23 z23VarL2 = y53Var.d().L();
                                                                                                                                            if (w03Var.t()) {
                                                                                                                                                numValueOf4 = Integer.valueOf(w03Var.u());
                                                                                                                                            } else {
                                                                                                                                                numValueOf4 = null;
                                                                                                                                            }
                                                                                                                                            z23VarL2.d("Evaluating filter. audience, filter, property", num2, numValueOf4, y53Var.m().c(w03Var.v()));
                                                                                                                                            y53Var.d().L().b(if3Var.j0().g0(w03Var), "Filter definition");
                                                                                                                                        }
                                                                                                                                        if (w03Var.t()) {
                                                                                                                                        }
                                                                                                                                        z23 z23VarJ2 = y53Var.d().J();
                                                                                                                                        b33 b33VarM2 = c33.M(this.d);
                                                                                                                                        if (w03Var.t()) {
                                                                                                                                            numValueOf3 = Integer.valueOf(w03Var.u());
                                                                                                                                        } else {
                                                                                                                                            numValueOf3 = null;
                                                                                                                                        }
                                                                                                                                        z23VarJ2.c(b33VarM2, String.valueOf(numValueOf3), "Invalid property filter ID. appId, id");
                                                                                                                                        this.e.add(num2);
                                                                                                                                        map6 = map7;
                                                                                                                                        wq1Var2 = wq1Var3;
                                                                                                                                        it6 = it6;
                                                                                                                                    } else {
                                                                                                                                        map7 = map6;
                                                                                                                                        wq1Var3 = wq1Var3;
                                                                                                                                        it6 = it6;
                                                                                                                                    }
                                                                                                                                    if (!zB) {
                                                                                                                                        this.e.add(num2);
                                                                                                                                    }
                                                                                                                                    map6 = map7;
                                                                                                                                    wq1Var2 = wq1Var3;
                                                                                                                                    it6 = it6;
                                                                                                                                    J(num2).a(gj2Var);
                                                                                                                                    iIntValue = i2;
                                                                                                                                    map6 = map7;
                                                                                                                                    wq1Var3 = wq1Var3;
                                                                                                                                    it6 = it6;
                                                                                                                                }
                                                                                                                            }
                                                                                                                            it4 = it5;
                                                                                                                            wq1Var = wq1Var2;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    cursorQuery2.close();
                                                                                                                    map6 = mbVar5;
                                                                                                                } else {
                                                                                                                    it5 = it4;
                                                                                                                    map6 = Collections.EMPTY_MAP;
                                                                                                                    cursorQuery2.close();
                                                                                                                }
                                                                                                            } catch (SQLiteException e17) {
                                                                                                                e = e17;
                                                                                                                it5 = it4;
                                                                                                            }
                                                                                                        } catch (Throwable th8) {
                                                                                                            th = th8;
                                                                                                            cursor = cursorQuery2;
                                                                                                            if (cursor != null) {
                                                                                                                cursor.close();
                                                                                                            }
                                                                                                            throw th;
                                                                                                        }
                                                                                                    } catch (SQLiteException e18) {
                                                                                                        e = e18;
                                                                                                        it5 = it4;
                                                                                                        y53Var5 = y53Var4;
                                                                                                        str10 = str9;
                                                                                                        cursor = null;
                                                                                                    } catch (Throwable th9) {
                                                                                                        th = th9;
                                                                                                        cursor = null;
                                                                                                    }
                                                                                                    wq1Var.put(strV, map6);
                                                                                                } else {
                                                                                                    it5 = it4;
                                                                                                }
                                                                                                it6 = map6.keySet().iterator();
                                                                                                wq1Var2 = wq1Var;
                                                                                                while (it6.hasNext()) {
                                                                                                    num2 = (Integer) it6.next();
                                                                                                    iIntValue = num2.intValue();
                                                                                                    if (this.e.contains(num2)) {
                                                                                                        y53Var.d().L().b(num2, "Skipping failed audience ID");
                                                                                                        break;
                                                                                                        break;
                                                                                                    }
                                                                                                    it7 = ((List) map6.get(num2)).iterator();
                                                                                                    zB = true;
                                                                                                    wq1Var3 = wq1Var2;
                                                                                                    while (true) {
                                                                                                        if (it7.hasNext()) {
                                                                                                            w03Var = (w03) it7.next();
                                                                                                            map7 = map6;
                                                                                                            if (Log.isLoggable(y53Var.d().O(), 2)) {
                                                                                                                z23 z23VarL3 = y53Var.d().L();
                                                                                                                if (w03Var.t()) {
                                                                                                                    numValueOf4 = Integer.valueOf(w03Var.u());
                                                                                                                } else {
                                                                                                                    numValueOf4 = null;
                                                                                                                }
                                                                                                                z23VarL3.d("Evaluating filter. audience, filter, property", num2, numValueOf4, y53Var.m().c(w03Var.v()));
                                                                                                                y53Var.d().L().b(if3Var.j0().g0(w03Var), "Filter definition");
                                                                                                            }
                                                                                                            if (w03Var.t()) {
                                                                                                            }
                                                                                                            z23 z23VarJ3 = y53Var.d().J();
                                                                                                            b33 b33VarM3 = c33.M(this.d);
                                                                                                            if (w03Var.t()) {
                                                                                                                numValueOf3 = Integer.valueOf(w03Var.u());
                                                                                                            } else {
                                                                                                                numValueOf3 = null;
                                                                                                            }
                                                                                                            z23VarJ3.c(b33VarM3, String.valueOf(numValueOf3), "Invalid property filter ID. appId, id");
                                                                                                            this.e.add(num2);
                                                                                                            map6 = map7;
                                                                                                            wq1Var2 = wq1Var3;
                                                                                                            it6 = it6;
                                                                                                        } else {
                                                                                                            map7 = map6;
                                                                                                            wq1Var3 = wq1Var3;
                                                                                                            it6 = it6;
                                                                                                        }
                                                                                                        if (!zB) {
                                                                                                            this.e.add(num2);
                                                                                                        }
                                                                                                        map6 = map7;
                                                                                                        wq1Var2 = wq1Var3;
                                                                                                        it6 = it6;
                                                                                                        J(num2).a(gj2Var);
                                                                                                        iIntValue = i2;
                                                                                                        map6 = map7;
                                                                                                        wq1Var3 = wq1Var3;
                                                                                                        it6 = it6;
                                                                                                    }
                                                                                                }
                                                                                                it4 = it5;
                                                                                                wq1Var = wq1Var2;
                                                                                            }
                                                                                        }
                                                                                        arrayList2 = new ArrayList();
                                                                                        jb<Integer> jbVar = (jb) this.f.keySet();
                                                                                        jbVar.removeAll(this.e);
                                                                                        for (Integer num7 : jbVar) {
                                                                                            int iIntValue3 = num7.intValue();
                                                                                            eq3 eq3Var2 = (eq3) this.f.get(num7);
                                                                                            gu2.o(eq3Var2);
                                                                                            e43 e43VarB = eq3Var2.b(iIntValue3);
                                                                                            arrayList2.add(e43VarB);
                                                                                            bu2VarG1 = if3Var.g0();
                                                                                            y53Var3 = (y53) bu2VarG1.a;
                                                                                            str8 = this.d;
                                                                                            i63 i63VarV = e43VarB.v();
                                                                                            bu2VarG1.F();
                                                                                            bu2VarG1.D();
                                                                                            gu2.l(str8);
                                                                                            gu2.o(i63VarV);
                                                                                            byte[] bArrA = i63VarV.a();
                                                                                            contentValues = new ContentValues();
                                                                                            contentValues.put("app_id", str8);
                                                                                            contentValues.put(str5, num7);
                                                                                            contentValues.put("current_results", bArrA);
                                                                                            try {
                                                                                                try {
                                                                                                    if (bu2VarG1.v0().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                                                                        y53Var3.d().I().b(c33.M(str8), "Failed to insert filter results (got -1). appId");
                                                                                                    }
                                                                                                } catch (SQLiteException e19) {
                                                                                                    e = e19;
                                                                                                    y53Var3.d().I().c(c33.M(str8), e, "Error storing filter results. appId");
                                                                                                }
                                                                                            } catch (SQLiteException e20) {
                                                                                                e = e20;
                                                                                            }
                                                                                        }
                                                                                        return arrayList2;
                                                                                    }
                                                                                } catch (SQLiteException e21) {
                                                                                    e = e21;
                                                                                    cursorRawQuery = null;
                                                                                } catch (Throwable th10) {
                                                                                    th = th10;
                                                                                    r7 = 0;
                                                                                    if (r7 != 0) {
                                                                                        r7.close();
                                                                                    }
                                                                                    throw th;
                                                                                }
                                                                                cursorRawQuery.close();
                                                                                r0 = mbVar3;
                                                                                gu2.l(str17);
                                                                                mbVar4 = new mb();
                                                                                if (!map2.isEmpty()) {
                                                                                    it2 = map2.keySet().iterator();
                                                                                    while (it2.hasNext()) {
                                                                                        num = (Integer) it2.next();
                                                                                        num.getClass();
                                                                                        i63Var3 = (i63) map2.get(num);
                                                                                        list4 = (List) r0.get(num);
                                                                                        if (list4 != null) {
                                                                                        }
                                                                                        r18 = r0;
                                                                                        it3 = it2;
                                                                                        y53Var2 = y53Var6;
                                                                                        mbVar4.put(num, i63Var3);
                                                                                        r0 = r18;
                                                                                        it2 = it3;
                                                                                        str15 = str15;
                                                                                        y53Var6 = y53Var2;
                                                                                    }
                                                                                }
                                                                                str4 = str15;
                                                                                y53Var = y53Var6;
                                                                                map3 = mbVar4;
                                                                            } catch (Throwable th11) {
                                                                                th = th11;
                                                                                r7 = hashSet;
                                                                            }
                                                                        } else {
                                                                            str4 = "audience_id";
                                                                            y53Var = y53Var6;
                                                                            map3 = map2;
                                                                        }
                                                                        map5 = map3;
                                                                        map4 = map2;
                                                                        while (r17.hasNext()) {
                                                                            num4.getClass();
                                                                            i63Var = (i63) map5.get(num4);
                                                                            bitSet = new BitSet();
                                                                            bitSet2 = new BitSet();
                                                                            mbVar = new mb();
                                                                            if (i63Var != null) {
                                                                                while (r3.hasNext()) {
                                                                                    if (z43Var.t()) {
                                                                                        i63 i63Var7 = i63Var;
                                                                                        Integer numValueOf10 = Integer.valueOf(z43Var.u());
                                                                                        if (z43Var.v()) {
                                                                                            lValueOf = Long.valueOf(z43Var.w());
                                                                                        } else {
                                                                                            lValueOf = null;
                                                                                        }
                                                                                        mbVar.put(numValueOf10, lValueOf);
                                                                                        i63Var = i63Var7;
                                                                                    }
                                                                                }
                                                                            }
                                                                            i63Var2 = i63Var;
                                                                            mbVar2 = new mb();
                                                                            if (i63Var2 != null) {
                                                                                it = i63Var2.z().iterator();
                                                                                while (it.hasNext()) {
                                                                                    m63Var = (m63) it.next();
                                                                                    if (!m63Var.t()) {
                                                                                    }
                                                                                }
                                                                            }
                                                                            Map map13 = map5;
                                                                            if (i63Var2 != null) {
                                                                                i = 0;
                                                                                while (i < i63Var2.u() * 64) {
                                                                                    if (lf3.j0((tm2) i63Var2.t(), i)) {
                                                                                        z4 = zP;
                                                                                        y53Var.d().L().c(num4, Integer.valueOf(i), "Filter already evaluated. audience ID, filter ID");
                                                                                        bitSet2.set(i);
                                                                                        if (lf3.j0((tm2) i63Var2.v(), i)) {
                                                                                            bitSet.set(i);
                                                                                        }
                                                                                        i++;
                                                                                        zP = z4;
                                                                                    } else {
                                                                                        z4 = zP;
                                                                                    }
                                                                                    mbVar.remove(Integer.valueOf(i));
                                                                                    i++;
                                                                                    zP = z4;
                                                                                }
                                                                            }
                                                                            boolean z7 = zP;
                                                                            i63 i63Var8 = (i63) map4.get(num4);
                                                                            if (zP2) {
                                                                                while (r2.hasNext()) {
                                                                                    int iU3 = n03Var2.u();
                                                                                    Integer num8 = num4;
                                                                                    jLongValue = this.v.longValue() / 1000;
                                                                                    if (n03Var2.C()) {
                                                                                        jLongValue = this.i.longValue() / 1000;
                                                                                    }
                                                                                    numValueOf = Integer.valueOf(iU3);
                                                                                    if (mbVar.containsKey(numValueOf)) {
                                                                                        mbVar.put(numValueOf, Long.valueOf(jLongValue));
                                                                                    }
                                                                                    if (mbVar2.containsKey(numValueOf)) {
                                                                                        mbVar2.put(numValueOf, Long.valueOf(jLongValue));
                                                                                    }
                                                                                    num4 = num8;
                                                                                }
                                                                            }
                                                                            this.f.put(num4, new eq3(this, this.d, i63Var8, bitSet, bitSet2, mbVar, mbVar2));
                                                                            obj2 = obj2;
                                                                            map = map;
                                                                            str2 = str2;
                                                                            zP = z7;
                                                                            map5 = map13;
                                                                            map4 = map4;
                                                                            zP2 = zP2;
                                                                        }
                                                                        str5 = str4;
                                                                    }
                                                                    str7 = str2;
                                                                    String str19 = str3;
                                                                    ?? r11 = obj2;
                                                                    if (!list.isEmpty()) {
                                                                        ir3Var = new ir3(this);
                                                                        mbVar6 = new mb();
                                                                        it8 = list.iterator();
                                                                        while (it8.hasNext()) {
                                                                            d53Var = (d53) it8.next();
                                                                            d53VarA = ir3Var.a(this.d, d53Var);
                                                                            if (d53VarA != null) {
                                                                                tu2VarO0 = if3Var.g0().o0(this.d, d53Var, d53VarA.y());
                                                                                if3Var.g0().f0("events", tu2VarO0);
                                                                                if (z) {
                                                                                    j = tu2VarO0.c;
                                                                                    strY = d53VarA.y();
                                                                                    map8 = (Map) mbVar6.get(strY);
                                                                                    if (map8 == null) {
                                                                                        bu2 bu2VarG7 = if3Var.g0();
                                                                                        y53 y53Var9 = (y53) bu2VarG7.a;
                                                                                        str11 = this.d;
                                                                                        bu2VarG7.F();
                                                                                        bu2VarG7.D();
                                                                                        gu2.l(str11);
                                                                                        gu2.l(strY);
                                                                                        mbVar7 = new mb();
                                                                                        cursorQuery3 = bu2VarG7.v0().query("event_filters", new String[]{str5, str7}, "app_id=? AND event_name=?", new String[]{str11, strY}, null, null, null);
                                                                                        if (cursorQuery3.moveToFirst()) {
                                                                                            str12 = str11;
                                                                                            while (true) {
                                                                                                n03 n03Var6 = (n03) ((l03) lf3.p0(n03.F(), cursorQuery3.getBlob(1))).g();
                                                                                                numValueOf6 = Integer.valueOf(cursorQuery3.getInt(0));
                                                                                                list6 = (List) mbVar7.get(numValueOf6);
                                                                                                if (list6 == null) {
                                                                                                    cursor4 = cursorQuery3;
                                                                                                    arrayList4 = new ArrayList();
                                                                                                    mbVar7.put(numValueOf6, arrayList4);
                                                                                                } else {
                                                                                                    cursor4 = cursorQuery3;
                                                                                                    arrayList4 = list6;
                                                                                                }
                                                                                                arrayList4.add(n03Var6);
                                                                                                if (!cursor4.moveToNext()) {
                                                                                                    break;
                                                                                                    break;
                                                                                                }
                                                                                                cursorQuery3 = cursor4;
                                                                                            }
                                                                                            cursor4.close();
                                                                                            map8 = mbVar7;
                                                                                        } else {
                                                                                            map8 = Collections.EMPTY_MAP;
                                                                                            cursorQuery3.close();
                                                                                        }
                                                                                        mbVar6.put(strY, map8);
                                                                                    }
                                                                                    while (r18.hasNext()) {
                                                                                        iIntValue2 = num6.intValue();
                                                                                        if (this.e.contains(num6)) {
                                                                                            y53Var.d().L().b(num6, "Skipping failed audience ID");
                                                                                        } else {
                                                                                            it9 = ((List) map8.get(num6)).iterator();
                                                                                            zA = true;
                                                                                            while (true) {
                                                                                                if (!it9.hasNext()) {
                                                                                                    map9 = map8;
                                                                                                    ir3Var2 = ir3Var;
                                                                                                    num3 = num6;
                                                                                                    break;
                                                                                                }
                                                                                                n03 n03Var7 = (n03) it9.next();
                                                                                                ir3Var2 = ir3Var;
                                                                                                num3 = num6;
                                                                                                map9 = map8;
                                                                                                gj2Var2 = new gj2(this, this.d, iIntValue2, n03Var7, 0);
                                                                                                Long l7 = this.i;
                                                                                                Long l8 = this.v;
                                                                                                iU = n03Var7.u();
                                                                                                eq3Var = (eq3) this.f.get(num3);
                                                                                                if (eq3Var == null) {
                                                                                                    z5 = false;
                                                                                                } else {
                                                                                                    z5 = eq3Var.d.get(iU);
                                                                                                }
                                                                                                zA = gj2Var2.a(l7, l8, d53VarA, j, tu2VarO0, z5);
                                                                                                if (!zA) {
                                                                                                    this.e.add(num3);
                                                                                                    break;
                                                                                                }
                                                                                                J(num3).a(gj2Var2);
                                                                                                num6 = num3;
                                                                                                map8 = map9;
                                                                                                ir3Var = ir3Var2;
                                                                                            }
                                                                                            if (!zA) {
                                                                                                this.e.add(num3);
                                                                                            }
                                                                                            ir3Var = ir3Var2;
                                                                                            map8 = map9;
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    continue;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    if (!z) {
                                                                        return new ArrayList();
                                                                    }
                                                                    if (!list2.isEmpty()) {
                                                                        mb mbVar11 = new mb();
                                                                        it4 = list2.iterator();
                                                                        wq1Var = mbVar11;
                                                                        while (it4.hasNext()) {
                                                                            u63 u63Var2 = (u63) it4.next();
                                                                            strV = u63Var2.v();
                                                                            map6 = (Map) wq1Var.get(strV);
                                                                            if (map6 == null) {
                                                                                bu2 bu2VarG8 = if3Var.g0();
                                                                                y53Var4 = (y53) bu2VarG8.a;
                                                                                str9 = this.d;
                                                                                bu2VarG8.F();
                                                                                bu2VarG8.D();
                                                                                gu2.l(str9);
                                                                                gu2.l(strV);
                                                                                mbVar5 = new mb();
                                                                                cursorQuery2 = bu2VarG8.v0().query("property_filters", new String[]{str5, str7}, "app_id=? AND property_name=?", new String[]{str9, strV}, null, null, null);
                                                                                if (cursorQuery2.moveToFirst()) {
                                                                                    it5 = it4;
                                                                                    while (true) {
                                                                                        w03 w03Var3 = (w03) ((v03) lf3.p0(w03.B(), cursorQuery2.getBlob(1))).g();
                                                                                        numValueOf5 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                                        list5 = (List) mbVar5.get(numValueOf5);
                                                                                        if (list5 == null) {
                                                                                            y53Var5 = y53Var4;
                                                                                            arrayList3 = new ArrayList();
                                                                                            mbVar5.put(numValueOf5, arrayList3);
                                                                                        } else {
                                                                                            y53Var5 = y53Var4;
                                                                                            arrayList3 = list5;
                                                                                        }
                                                                                        arrayList3.add(w03Var3);
                                                                                        str10 = str9;
                                                                                        if (!cursorQuery2.moveToNext()) {
                                                                                            break;
                                                                                            break;
                                                                                        }
                                                                                        y53Var4 = y53Var5;
                                                                                        str9 = str10;
                                                                                    }
                                                                                    cursorQuery2.close();
                                                                                    map6 = mbVar5;
                                                                                } else {
                                                                                    it5 = it4;
                                                                                    map6 = Collections.EMPTY_MAP;
                                                                                    cursorQuery2.close();
                                                                                }
                                                                                wq1Var.put(strV, map6);
                                                                            } else {
                                                                                it5 = it4;
                                                                            }
                                                                            it6 = map6.keySet().iterator();
                                                                            wq1Var2 = wq1Var;
                                                                            while (it6.hasNext()) {
                                                                                num2 = (Integer) it6.next();
                                                                                iIntValue = num2.intValue();
                                                                                if (this.e.contains(num2)) {
                                                                                    y53Var.d().L().b(num2, "Skipping failed audience ID");
                                                                                    break;
                                                                                    break;
                                                                                }
                                                                                it7 = ((List) map6.get(num2)).iterator();
                                                                                zB = true;
                                                                                wq1Var3 = wq1Var2;
                                                                                while (true) {
                                                                                    if (it7.hasNext()) {
                                                                                        w03Var = (w03) it7.next();
                                                                                        map7 = map6;
                                                                                        if (Log.isLoggable(y53Var.d().O(), 2)) {
                                                                                            z23 z23VarL4 = y53Var.d().L();
                                                                                            if (w03Var.t()) {
                                                                                                numValueOf4 = Integer.valueOf(w03Var.u());
                                                                                            } else {
                                                                                                numValueOf4 = null;
                                                                                            }
                                                                                            z23VarL4.d("Evaluating filter. audience, filter, property", num2, numValueOf4, y53Var.m().c(w03Var.v()));
                                                                                            y53Var.d().L().b(if3Var.j0().g0(w03Var), "Filter definition");
                                                                                        }
                                                                                        if (w03Var.t()) {
                                                                                        }
                                                                                        z23 z23VarJ4 = y53Var.d().J();
                                                                                        b33 b33VarM4 = c33.M(this.d);
                                                                                        if (w03Var.t()) {
                                                                                            numValueOf3 = Integer.valueOf(w03Var.u());
                                                                                        } else {
                                                                                            numValueOf3 = null;
                                                                                        }
                                                                                        z23VarJ4.c(b33VarM4, String.valueOf(numValueOf3), "Invalid property filter ID. appId, id");
                                                                                        this.e.add(num2);
                                                                                        map6 = map7;
                                                                                        wq1Var2 = wq1Var3;
                                                                                        it6 = it6;
                                                                                    } else {
                                                                                        map7 = map6;
                                                                                        wq1Var3 = wq1Var3;
                                                                                        it6 = it6;
                                                                                    }
                                                                                    if (!zB) {
                                                                                        this.e.add(num2);
                                                                                    }
                                                                                    map6 = map7;
                                                                                    wq1Var2 = wq1Var3;
                                                                                    it6 = it6;
                                                                                    J(num2).a(gj2Var);
                                                                                    iIntValue = i2;
                                                                                    map6 = map7;
                                                                                    wq1Var3 = wq1Var3;
                                                                                    it6 = it6;
                                                                                }
                                                                            }
                                                                            it4 = it5;
                                                                            wq1Var = wq1Var2;
                                                                        }
                                                                    }
                                                                    arrayList2 = new ArrayList();
                                                                    jb<Integer> jbVar2 = (jb) this.f.keySet();
                                                                    jbVar2.removeAll(this.e);
                                                                    while (r3.hasNext()) {
                                                                        int iIntValue4 = num7.intValue();
                                                                        eq3 eq3Var3 = (eq3) this.f.get(num7);
                                                                        gu2.o(eq3Var3);
                                                                        e43 e43VarB2 = eq3Var3.b(iIntValue4);
                                                                        arrayList2.add(e43VarB2);
                                                                        bu2VarG1 = if3Var.g0();
                                                                        y53Var3 = (y53) bu2VarG1.a;
                                                                        str8 = this.d;
                                                                        i63 i63VarV2 = e43VarB2.v();
                                                                        bu2VarG1.F();
                                                                        bu2VarG1.D();
                                                                        gu2.l(str8);
                                                                        gu2.o(i63VarV2);
                                                                        byte[] bArrA2 = i63VarV2.a();
                                                                        contentValues = new ContentValues();
                                                                        contentValues.put("app_id", str8);
                                                                        contentValues.put(str5, num7);
                                                                        contentValues.put("current_results", bArrA2);
                                                                        if (bu2VarG1.v0().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                                            y53Var3.d().I().b(c33.M(str8), "Failed to insert filter results (got -1). appId");
                                                                        }
                                                                    }
                                                                    return arrayList2;
                                                                }
                                                            }
                                                            try {
                                                                if (!cursorQuery.moveToNext()) {
                                                                    break;
                                                                }
                                                                str14 = str3;
                                                                objM = obj2;
                                                                r21 = r21;
                                                            } catch (SQLiteException e22) {
                                                                e = e22;
                                                                r17.d().I().c(c33.M(r21), e, "Database error querying filter results. appId");
                                                                Map map14 = Collections.EMPTY_MAP;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                map2 = map14;
                                                            }
                                                        } catch (SQLiteException e23) {
                                                            e = e23;
                                                            r21 = r21;
                                                            r17 = r17;
                                                            str3 = str14;
                                                            obj2 = objM;
                                                            r21 = r21;
                                                            r17.d().I().c(c33.M(r21), e, "Database error querying filter results. appId");
                                                            Map map15 = Collections.EMPTY_MAP;
                                                            if (cursorQuery != null) {
                                                                cursorQuery.close();
                                                            }
                                                            map2 = map15;
                                                            if (map2.isEmpty()) {
                                                                str5 = "audience_id";
                                                                y53Var = y53Var6;
                                                            } else {
                                                                HashSet<Integer> hashSet2 = new HashSet(map2.keySet());
                                                                if (z3) {
                                                                    String str110 = this.d;
                                                                    bu2VarG0 = if3Var.g0();
                                                                    str6 = this.d;
                                                                    bu2VarG0.F();
                                                                    bu2VarG0.D();
                                                                    gu2.l(str6);
                                                                    mbVar3 = new mb();
                                                                    cursorRawQuery = bu2VarG0.v0().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str6, str6});
                                                                    if (cursorRawQuery.moveToFirst()) {
                                                                        do {
                                                                            numValueOf2 = Integer.valueOf(cursorRawQuery.getInt(0));
                                                                            arrayList = (List) mbVar3.get(numValueOf2);
                                                                            if (arrayList == null) {
                                                                                arrayList = new ArrayList();
                                                                                mbVar3.put(numValueOf2, arrayList);
                                                                            }
                                                                            arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                                                        } while (cursorRawQuery.moveToNext());
                                                                    } else {
                                                                        mbVar3 = Collections.EMPTY_MAP;
                                                                    }
                                                                    cursorRawQuery.close();
                                                                    r0 = mbVar3;
                                                                    gu2.l(str110);
                                                                    mbVar4 = new mb();
                                                                    if (!map2.isEmpty()) {
                                                                        it2 = map2.keySet().iterator();
                                                                        while (it2.hasNext()) {
                                                                            num = (Integer) it2.next();
                                                                            num.getClass();
                                                                            i63Var3 = (i63) map2.get(num);
                                                                            list4 = (List) r0.get(num);
                                                                            if (list4 != null) {
                                                                            }
                                                                            r18 = r0;
                                                                            it3 = it2;
                                                                            y53Var2 = y53Var6;
                                                                            mbVar4.put(num, i63Var3);
                                                                            r0 = r18;
                                                                            it2 = it3;
                                                                            str15 = str15;
                                                                            y53Var6 = y53Var2;
                                                                        }
                                                                    }
                                                                    str4 = str15;
                                                                    y53Var = y53Var6;
                                                                    map3 = mbVar4;
                                                                } else {
                                                                    str4 = "audience_id";
                                                                    y53Var = y53Var6;
                                                                    map3 = map2;
                                                                }
                                                                map5 = map3;
                                                                map4 = map2;
                                                                while (r17.hasNext()) {
                                                                    num4.getClass();
                                                                    i63Var = (i63) map5.get(num4);
                                                                    bitSet = new BitSet();
                                                                    bitSet2 = new BitSet();
                                                                    mbVar = new mb();
                                                                    if (i63Var != null) {
                                                                        while (r3.hasNext()) {
                                                                            if (z43Var.t()) {
                                                                                i63 i63Var9 = i63Var;
                                                                                Integer numValueOf11 = Integer.valueOf(z43Var.u());
                                                                                if (z43Var.v()) {
                                                                                    lValueOf = Long.valueOf(z43Var.w());
                                                                                } else {
                                                                                    lValueOf = null;
                                                                                }
                                                                                mbVar.put(numValueOf11, lValueOf);
                                                                                i63Var = i63Var9;
                                                                            }
                                                                        }
                                                                    }
                                                                    i63Var2 = i63Var;
                                                                    mbVar2 = new mb();
                                                                    if (i63Var2 != null) {
                                                                        it = i63Var2.z().iterator();
                                                                        while (it.hasNext()) {
                                                                            m63Var = (m63) it.next();
                                                                            if (!m63Var.t()) {
                                                                            }
                                                                        }
                                                                    }
                                                                    Map map16 = map5;
                                                                    if (i63Var2 != null) {
                                                                        i = 0;
                                                                        while (i < i63Var2.u() * 64) {
                                                                            if (lf3.j0((tm2) i63Var2.t(), i)) {
                                                                                z4 = zP;
                                                                                y53Var.d().L().c(num4, Integer.valueOf(i), "Filter already evaluated. audience ID, filter ID");
                                                                                bitSet2.set(i);
                                                                                if (lf3.j0((tm2) i63Var2.v(), i)) {
                                                                                    bitSet.set(i);
                                                                                }
                                                                                i++;
                                                                                zP = z4;
                                                                            } else {
                                                                                z4 = zP;
                                                                            }
                                                                            mbVar.remove(Integer.valueOf(i));
                                                                            i++;
                                                                            zP = z4;
                                                                        }
                                                                    }
                                                                    boolean z8 = zP;
                                                                    i63 i63Var10 = (i63) map4.get(num4);
                                                                    if (zP2) {
                                                                        while (r2.hasNext()) {
                                                                            int iU4 = n03Var2.u();
                                                                            Integer num9 = num4;
                                                                            jLongValue = this.v.longValue() / 1000;
                                                                            if (n03Var2.C()) {
                                                                                jLongValue = this.i.longValue() / 1000;
                                                                            }
                                                                            numValueOf = Integer.valueOf(iU4);
                                                                            if (mbVar.containsKey(numValueOf)) {
                                                                                mbVar.put(numValueOf, Long.valueOf(jLongValue));
                                                                            }
                                                                            if (mbVar2.containsKey(numValueOf)) {
                                                                                mbVar2.put(numValueOf, Long.valueOf(jLongValue));
                                                                            }
                                                                            num4 = num9;
                                                                        }
                                                                    }
                                                                    this.f.put(num4, new eq3(this, this.d, i63Var10, bitSet, bitSet2, mbVar, mbVar2));
                                                                    obj2 = obj2;
                                                                    map = map;
                                                                    str2 = str2;
                                                                    zP = z8;
                                                                    map5 = map16;
                                                                    map4 = map4;
                                                                    zP2 = zP2;
                                                                }
                                                                str5 = str4;
                                                            }
                                                            str7 = str2;
                                                            String str111 = str3;
                                                            ?? r12 = obj2;
                                                            if (!list.isEmpty()) {
                                                                ir3Var = new ir3(this);
                                                                mbVar6 = new mb();
                                                                it8 = list.iterator();
                                                                while (it8.hasNext()) {
                                                                    d53Var = (d53) it8.next();
                                                                    d53VarA = ir3Var.a(this.d, d53Var);
                                                                    if (d53VarA != null) {
                                                                        tu2VarO0 = if3Var.g0().o0(this.d, d53Var, d53VarA.y());
                                                                        if3Var.g0().f0("events", tu2VarO0);
                                                                        if (z) {
                                                                            j = tu2VarO0.c;
                                                                            strY = d53VarA.y();
                                                                            map8 = (Map) mbVar6.get(strY);
                                                                            if (map8 == null) {
                                                                                bu2 bu2VarG9 = if3Var.g0();
                                                                                y53 y53Var10 = (y53) bu2VarG9.a;
                                                                                str11 = this.d;
                                                                                bu2VarG9.F();
                                                                                bu2VarG9.D();
                                                                                gu2.l(str11);
                                                                                gu2.l(strY);
                                                                                mbVar7 = new mb();
                                                                                cursorQuery3 = bu2VarG9.v0().query("event_filters", new String[]{str5, str7}, "app_id=? AND event_name=?", new String[]{str11, strY}, null, null, null);
                                                                                if (cursorQuery3.moveToFirst()) {
                                                                                    str12 = str11;
                                                                                    while (true) {
                                                                                        n03 n03Var8 = (n03) ((l03) lf3.p0(n03.F(), cursorQuery3.getBlob(1))).g();
                                                                                        numValueOf6 = Integer.valueOf(cursorQuery3.getInt(0));
                                                                                        list6 = (List) mbVar7.get(numValueOf6);
                                                                                        if (list6 == null) {
                                                                                            cursor4 = cursorQuery3;
                                                                                            arrayList4 = new ArrayList();
                                                                                            mbVar7.put(numValueOf6, arrayList4);
                                                                                        } else {
                                                                                            cursor4 = cursorQuery3;
                                                                                            arrayList4 = list6;
                                                                                        }
                                                                                        arrayList4.add(n03Var8);
                                                                                        if (!cursor4.moveToNext()) {
                                                                                            break;
                                                                                            break;
                                                                                        }
                                                                                        cursorQuery3 = cursor4;
                                                                                    }
                                                                                    cursor4.close();
                                                                                    map8 = mbVar7;
                                                                                } else {
                                                                                    map8 = Collections.EMPTY_MAP;
                                                                                    cursorQuery3.close();
                                                                                }
                                                                                mbVar6.put(strY, map8);
                                                                            }
                                                                            while (r18.hasNext()) {
                                                                                iIntValue2 = num6.intValue();
                                                                                if (this.e.contains(num6)) {
                                                                                    y53Var.d().L().b(num6, "Skipping failed audience ID");
                                                                                } else {
                                                                                    it9 = ((List) map8.get(num6)).iterator();
                                                                                    zA = true;
                                                                                    while (true) {
                                                                                        if (!it9.hasNext()) {
                                                                                            map9 = map8;
                                                                                            ir3Var2 = ir3Var;
                                                                                            num3 = num6;
                                                                                            break;
                                                                                        }
                                                                                        n03 n03Var9 = (n03) it9.next();
                                                                                        ir3Var2 = ir3Var;
                                                                                        num3 = num6;
                                                                                        map9 = map8;
                                                                                        gj2Var2 = new gj2(this, this.d, iIntValue2, n03Var9, 0);
                                                                                        Long l9 = this.i;
                                                                                        Long l10 = this.v;
                                                                                        iU = n03Var9.u();
                                                                                        eq3Var = (eq3) this.f.get(num3);
                                                                                        if (eq3Var == null) {
                                                                                            z5 = false;
                                                                                        } else {
                                                                                            z5 = eq3Var.d.get(iU);
                                                                                        }
                                                                                        zA = gj2Var2.a(l9, l10, d53VarA, j, tu2VarO0, z5);
                                                                                        if (!zA) {
                                                                                            this.e.add(num3);
                                                                                            break;
                                                                                        }
                                                                                        J(num3).a(gj2Var2);
                                                                                        num6 = num3;
                                                                                        map8 = map9;
                                                                                        ir3Var = ir3Var2;
                                                                                    }
                                                                                    if (!zA) {
                                                                                        this.e.add(num3);
                                                                                    }
                                                                                    ir3Var = ir3Var2;
                                                                                    map8 = map9;
                                                                                }
                                                                            }
                                                                        } else {
                                                                            continue;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            if (!z) {
                                                                return new ArrayList();
                                                            }
                                                            if (!list2.isEmpty()) {
                                                                mb mbVar12 = new mb();
                                                                it4 = list2.iterator();
                                                                wq1Var = mbVar12;
                                                                while (it4.hasNext()) {
                                                                    u63 u63Var3 = (u63) it4.next();
                                                                    strV = u63Var3.v();
                                                                    map6 = (Map) wq1Var.get(strV);
                                                                    if (map6 == null) {
                                                                        bu2 bu2VarG10 = if3Var.g0();
                                                                        y53Var4 = (y53) bu2VarG10.a;
                                                                        str9 = this.d;
                                                                        bu2VarG10.F();
                                                                        bu2VarG10.D();
                                                                        gu2.l(str9);
                                                                        gu2.l(strV);
                                                                        mbVar5 = new mb();
                                                                        cursorQuery2 = bu2VarG10.v0().query("property_filters", new String[]{str5, str7}, "app_id=? AND property_name=?", new String[]{str9, strV}, null, null, null);
                                                                        if (cursorQuery2.moveToFirst()) {
                                                                            it5 = it4;
                                                                            while (true) {
                                                                                w03 w03Var4 = (w03) ((v03) lf3.p0(w03.B(), cursorQuery2.getBlob(1))).g();
                                                                                numValueOf5 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                                list5 = (List) mbVar5.get(numValueOf5);
                                                                                if (list5 == null) {
                                                                                    y53Var5 = y53Var4;
                                                                                    arrayList3 = new ArrayList();
                                                                                    mbVar5.put(numValueOf5, arrayList3);
                                                                                } else {
                                                                                    y53Var5 = y53Var4;
                                                                                    arrayList3 = list5;
                                                                                }
                                                                                arrayList3.add(w03Var4);
                                                                                str10 = str9;
                                                                                if (!cursorQuery2.moveToNext()) {
                                                                                    break;
                                                                                    break;
                                                                                }
                                                                                y53Var4 = y53Var5;
                                                                                str9 = str10;
                                                                            }
                                                                            cursorQuery2.close();
                                                                            map6 = mbVar5;
                                                                        } else {
                                                                            it5 = it4;
                                                                            map6 = Collections.EMPTY_MAP;
                                                                            cursorQuery2.close();
                                                                        }
                                                                        wq1Var.put(strV, map6);
                                                                    } else {
                                                                        it5 = it4;
                                                                    }
                                                                    it6 = map6.keySet().iterator();
                                                                    wq1Var2 = wq1Var;
                                                                    while (it6.hasNext()) {
                                                                        num2 = (Integer) it6.next();
                                                                        iIntValue = num2.intValue();
                                                                        if (this.e.contains(num2)) {
                                                                            y53Var.d().L().b(num2, "Skipping failed audience ID");
                                                                            break;
                                                                            break;
                                                                        }
                                                                        it7 = ((List) map6.get(num2)).iterator();
                                                                        zB = true;
                                                                        wq1Var3 = wq1Var2;
                                                                        while (true) {
                                                                            if (it7.hasNext()) {
                                                                                w03Var = (w03) it7.next();
                                                                                map7 = map6;
                                                                                if (Log.isLoggable(y53Var.d().O(), 2)) {
                                                                                    z23 z23VarL5 = y53Var.d().L();
                                                                                    if (w03Var.t()) {
                                                                                        numValueOf4 = Integer.valueOf(w03Var.u());
                                                                                    } else {
                                                                                        numValueOf4 = null;
                                                                                    }
                                                                                    z23VarL5.d("Evaluating filter. audience, filter, property", num2, numValueOf4, y53Var.m().c(w03Var.v()));
                                                                                    y53Var.d().L().b(if3Var.j0().g0(w03Var), "Filter definition");
                                                                                }
                                                                                if (w03Var.t()) {
                                                                                }
                                                                                z23 z23VarJ5 = y53Var.d().J();
                                                                                b33 b33VarM5 = c33.M(this.d);
                                                                                if (w03Var.t()) {
                                                                                    numValueOf3 = Integer.valueOf(w03Var.u());
                                                                                } else {
                                                                                    numValueOf3 = null;
                                                                                }
                                                                                z23VarJ5.c(b33VarM5, String.valueOf(numValueOf3), "Invalid property filter ID. appId, id");
                                                                                this.e.add(num2);
                                                                                map6 = map7;
                                                                                wq1Var2 = wq1Var3;
                                                                                it6 = it6;
                                                                            } else {
                                                                                map7 = map6;
                                                                                wq1Var3 = wq1Var3;
                                                                                it6 = it6;
                                                                            }
                                                                            if (!zB) {
                                                                                this.e.add(num2);
                                                                            }
                                                                            map6 = map7;
                                                                            wq1Var2 = wq1Var3;
                                                                            it6 = it6;
                                                                            J(num2).a(gj2Var);
                                                                            iIntValue = i2;
                                                                            map6 = map7;
                                                                            wq1Var3 = wq1Var3;
                                                                            it6 = it6;
                                                                        }
                                                                    }
                                                                    it4 = it5;
                                                                    wq1Var = wq1Var2;
                                                                }
                                                            }
                                                            arrayList2 = new ArrayList();
                                                            jb<Integer> jbVar3 = (jb) this.f.keySet();
                                                            jbVar3.removeAll(this.e);
                                                            while (r3.hasNext()) {
                                                                int iIntValue5 = num7.intValue();
                                                                eq3 eq3Var4 = (eq3) this.f.get(num7);
                                                                gu2.o(eq3Var4);
                                                                e43 e43VarB3 = eq3Var4.b(iIntValue5);
                                                                arrayList2.add(e43VarB3);
                                                                bu2VarG1 = if3Var.g0();
                                                                y53Var3 = (y53) bu2VarG1.a;
                                                                str8 = this.d;
                                                                i63 i63VarV3 = e43VarB3.v();
                                                                bu2VarG1.F();
                                                                bu2VarG1.D();
                                                                gu2.l(str8);
                                                                gu2.o(i63VarV3);
                                                                byte[] bArrA3 = i63VarV3.a();
                                                                contentValues = new ContentValues();
                                                                contentValues.put("app_id", str8);
                                                                contentValues.put(str5, num7);
                                                                contentValues.put("current_results", bArrA3);
                                                                if (bu2VarG1.v0().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                                    y53Var3.d().I().b(c33.M(str8), "Failed to insert filter results (got -1). appId");
                                                                }
                                                            }
                                                            return arrayList2;
                                                        }
                                                    }
                                                    cursorQuery.close();
                                                    obj = obj3;
                                                    r5 = r6;
                                                    map2 = mbVar8;
                                                } else {
                                                    Map map17 = Collections.EMPTY_MAP;
                                                    cursorQuery.close();
                                                    map2 = map17;
                                                    str3 = "Failed to merge filter. appId";
                                                    obj2 = "Database error querying filters. appId";
                                                    obj = obj;
                                                    r5 = r5;
                                                }
                                                if (map2.isEmpty()) {
                                                    str5 = "audience_id";
                                                    y53Var = y53Var6;
                                                } else {
                                                    HashSet<Integer> hashSet3 = new HashSet(map2.keySet());
                                                    if (z3) {
                                                        String str112 = this.d;
                                                        bu2VarG0 = if3Var.g0();
                                                        str6 = this.d;
                                                        bu2VarG0.F();
                                                        bu2VarG0.D();
                                                        gu2.l(str6);
                                                        mbVar3 = new mb();
                                                        cursorRawQuery = bu2VarG0.v0().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str6, str6});
                                                        if (cursorRawQuery.moveToFirst()) {
                                                            do {
                                                                numValueOf2 = Integer.valueOf(cursorRawQuery.getInt(0));
                                                                arrayList = (List) mbVar3.get(numValueOf2);
                                                                if (arrayList == null) {
                                                                    arrayList = new ArrayList();
                                                                    mbVar3.put(numValueOf2, arrayList);
                                                                }
                                                                arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                                            } while (cursorRawQuery.moveToNext());
                                                        } else {
                                                            mbVar3 = Collections.EMPTY_MAP;
                                                        }
                                                        cursorRawQuery.close();
                                                        r0 = mbVar3;
                                                        gu2.l(str112);
                                                        mbVar4 = new mb();
                                                        if (!map2.isEmpty()) {
                                                            it2 = map2.keySet().iterator();
                                                            while (it2.hasNext()) {
                                                                num = (Integer) it2.next();
                                                                num.getClass();
                                                                i63Var3 = (i63) map2.get(num);
                                                                list4 = (List) r0.get(num);
                                                                if (list4 != null) {
                                                                }
                                                                r18 = r0;
                                                                it3 = it2;
                                                                y53Var2 = y53Var6;
                                                                mbVar4.put(num, i63Var3);
                                                                r0 = r18;
                                                                it2 = it3;
                                                                str15 = str15;
                                                                y53Var6 = y53Var2;
                                                            }
                                                        }
                                                        str4 = str15;
                                                        y53Var = y53Var6;
                                                        map3 = mbVar4;
                                                    } else {
                                                        str4 = "audience_id";
                                                        y53Var = y53Var6;
                                                        map3 = map2;
                                                    }
                                                    map5 = map3;
                                                    map4 = map2;
                                                    while (r17.hasNext()) {
                                                        num4.getClass();
                                                        i63Var = (i63) map5.get(num4);
                                                        bitSet = new BitSet();
                                                        bitSet2 = new BitSet();
                                                        mbVar = new mb();
                                                        if (i63Var != null) {
                                                            while (r3.hasNext()) {
                                                                if (z43Var.t()) {
                                                                    i63 i63Var11 = i63Var;
                                                                    Integer numValueOf12 = Integer.valueOf(z43Var.u());
                                                                    if (z43Var.v()) {
                                                                        lValueOf = Long.valueOf(z43Var.w());
                                                                    } else {
                                                                        lValueOf = null;
                                                                    }
                                                                    mbVar.put(numValueOf12, lValueOf);
                                                                    i63Var = i63Var11;
                                                                }
                                                            }
                                                        }
                                                        i63Var2 = i63Var;
                                                        mbVar2 = new mb();
                                                        if (i63Var2 != null) {
                                                            it = i63Var2.z().iterator();
                                                            while (it.hasNext()) {
                                                                m63Var = (m63) it.next();
                                                                if (!m63Var.t()) {
                                                                }
                                                            }
                                                        }
                                                        Map map18 = map5;
                                                        if (i63Var2 != null) {
                                                            i = 0;
                                                            while (i < i63Var2.u() * 64) {
                                                                if (lf3.j0((tm2) i63Var2.t(), i)) {
                                                                    z4 = zP;
                                                                    y53Var.d().L().c(num4, Integer.valueOf(i), "Filter already evaluated. audience ID, filter ID");
                                                                    bitSet2.set(i);
                                                                    if (lf3.j0((tm2) i63Var2.v(), i)) {
                                                                        bitSet.set(i);
                                                                    }
                                                                    i++;
                                                                    zP = z4;
                                                                } else {
                                                                    z4 = zP;
                                                                }
                                                                mbVar.remove(Integer.valueOf(i));
                                                                i++;
                                                                zP = z4;
                                                            }
                                                        }
                                                        boolean z9 = zP;
                                                        i63 i63Var12 = (i63) map4.get(num4);
                                                        if (zP2) {
                                                            while (r2.hasNext()) {
                                                                int iU5 = n03Var2.u();
                                                                Integer num10 = num4;
                                                                jLongValue = this.v.longValue() / 1000;
                                                                if (n03Var2.C()) {
                                                                    jLongValue = this.i.longValue() / 1000;
                                                                }
                                                                numValueOf = Integer.valueOf(iU5);
                                                                if (mbVar.containsKey(numValueOf)) {
                                                                    mbVar.put(numValueOf, Long.valueOf(jLongValue));
                                                                }
                                                                if (mbVar2.containsKey(numValueOf)) {
                                                                    mbVar2.put(numValueOf, Long.valueOf(jLongValue));
                                                                }
                                                                num4 = num10;
                                                            }
                                                        }
                                                        this.f.put(num4, new eq3(this, this.d, i63Var12, bitSet, bitSet2, mbVar, mbVar2));
                                                        obj2 = obj2;
                                                        map = map;
                                                        str2 = str2;
                                                        zP = z9;
                                                        map5 = map18;
                                                        map4 = map4;
                                                        zP2 = zP2;
                                                    }
                                                    str5 = str4;
                                                }
                                                str7 = str2;
                                                String str113 = str3;
                                                ?? r13 = obj2;
                                                if (!list.isEmpty()) {
                                                    ir3Var = new ir3(this);
                                                    mbVar6 = new mb();
                                                    it8 = list.iterator();
                                                    while (it8.hasNext()) {
                                                        d53Var = (d53) it8.next();
                                                        d53VarA = ir3Var.a(this.d, d53Var);
                                                        if (d53VarA != null) {
                                                            tu2VarO0 = if3Var.g0().o0(this.d, d53Var, d53VarA.y());
                                                            if3Var.g0().f0("events", tu2VarO0);
                                                            if (z) {
                                                                j = tu2VarO0.c;
                                                                strY = d53VarA.y();
                                                                map8 = (Map) mbVar6.get(strY);
                                                                if (map8 == null) {
                                                                    bu2 bu2VarG11 = if3Var.g0();
                                                                    y53 y53Var11 = (y53) bu2VarG11.a;
                                                                    str11 = this.d;
                                                                    bu2VarG11.F();
                                                                    bu2VarG11.D();
                                                                    gu2.l(str11);
                                                                    gu2.l(strY);
                                                                    mbVar7 = new mb();
                                                                    cursorQuery3 = bu2VarG11.v0().query("event_filters", new String[]{str5, str7}, "app_id=? AND event_name=?", new String[]{str11, strY}, null, null, null);
                                                                    if (cursorQuery3.moveToFirst()) {
                                                                        str12 = str11;
                                                                        while (true) {
                                                                            n03 n03Var10 = (n03) ((l03) lf3.p0(n03.F(), cursorQuery3.getBlob(1))).g();
                                                                            numValueOf6 = Integer.valueOf(cursorQuery3.getInt(0));
                                                                            list6 = (List) mbVar7.get(numValueOf6);
                                                                            if (list6 == null) {
                                                                                cursor4 = cursorQuery3;
                                                                                arrayList4 = new ArrayList();
                                                                                mbVar7.put(numValueOf6, arrayList4);
                                                                            } else {
                                                                                cursor4 = cursorQuery3;
                                                                                arrayList4 = list6;
                                                                            }
                                                                            arrayList4.add(n03Var10);
                                                                            if (!cursor4.moveToNext()) {
                                                                                break;
                                                                                break;
                                                                            }
                                                                            cursorQuery3 = cursor4;
                                                                        }
                                                                        cursor4.close();
                                                                        map8 = mbVar7;
                                                                    } else {
                                                                        map8 = Collections.EMPTY_MAP;
                                                                        cursorQuery3.close();
                                                                    }
                                                                    mbVar6.put(strY, map8);
                                                                }
                                                                while (r18.hasNext()) {
                                                                    iIntValue2 = num6.intValue();
                                                                    if (this.e.contains(num6)) {
                                                                        y53Var.d().L().b(num6, "Skipping failed audience ID");
                                                                    } else {
                                                                        it9 = ((List) map8.get(num6)).iterator();
                                                                        zA = true;
                                                                        while (true) {
                                                                            if (!it9.hasNext()) {
                                                                                map9 = map8;
                                                                                ir3Var2 = ir3Var;
                                                                                num3 = num6;
                                                                                break;
                                                                            }
                                                                            n03 n03Var11 = (n03) it9.next();
                                                                            ir3Var2 = ir3Var;
                                                                            num3 = num6;
                                                                            map9 = map8;
                                                                            gj2Var2 = new gj2(this, this.d, iIntValue2, n03Var11, 0);
                                                                            Long l11 = this.i;
                                                                            Long l12 = this.v;
                                                                            iU = n03Var11.u();
                                                                            eq3Var = (eq3) this.f.get(num3);
                                                                            if (eq3Var == null) {
                                                                                z5 = false;
                                                                            } else {
                                                                                z5 = eq3Var.d.get(iU);
                                                                            }
                                                                            zA = gj2Var2.a(l11, l12, d53VarA, j, tu2VarO0, z5);
                                                                            if (!zA) {
                                                                                this.e.add(num3);
                                                                                break;
                                                                            }
                                                                            J(num3).a(gj2Var2);
                                                                            num6 = num3;
                                                                            map8 = map9;
                                                                            ir3Var = ir3Var2;
                                                                        }
                                                                        if (!zA) {
                                                                            this.e.add(num3);
                                                                        }
                                                                        ir3Var = ir3Var2;
                                                                        map8 = map9;
                                                                    }
                                                                }
                                                            } else {
                                                                continue;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (!z) {
                                                    return new ArrayList();
                                                }
                                                if (!list2.isEmpty()) {
                                                    mb mbVar13 = new mb();
                                                    it4 = list2.iterator();
                                                    wq1Var = mbVar13;
                                                    while (it4.hasNext()) {
                                                        u63 u63Var4 = (u63) it4.next();
                                                        strV = u63Var4.v();
                                                        map6 = (Map) wq1Var.get(strV);
                                                        if (map6 == null) {
                                                            bu2 bu2VarG12 = if3Var.g0();
                                                            y53Var4 = (y53) bu2VarG12.a;
                                                            str9 = this.d;
                                                            bu2VarG12.F();
                                                            bu2VarG12.D();
                                                            gu2.l(str9);
                                                            gu2.l(strV);
                                                            mbVar5 = new mb();
                                                            cursorQuery2 = bu2VarG12.v0().query("property_filters", new String[]{str5, str7}, "app_id=? AND property_name=?", new String[]{str9, strV}, null, null, null);
                                                            if (cursorQuery2.moveToFirst()) {
                                                                it5 = it4;
                                                                while (true) {
                                                                    w03 w03Var5 = (w03) ((v03) lf3.p0(w03.B(), cursorQuery2.getBlob(1))).g();
                                                                    numValueOf5 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                    list5 = (List) mbVar5.get(numValueOf5);
                                                                    if (list5 == null) {
                                                                        y53Var5 = y53Var4;
                                                                        arrayList3 = new ArrayList();
                                                                        mbVar5.put(numValueOf5, arrayList3);
                                                                    } else {
                                                                        y53Var5 = y53Var4;
                                                                        arrayList3 = list5;
                                                                    }
                                                                    arrayList3.add(w03Var5);
                                                                    str10 = str9;
                                                                    if (!cursorQuery2.moveToNext()) {
                                                                        break;
                                                                        break;
                                                                    }
                                                                    y53Var4 = y53Var5;
                                                                    str9 = str10;
                                                                }
                                                                cursorQuery2.close();
                                                                map6 = mbVar5;
                                                            } else {
                                                                it5 = it4;
                                                                map6 = Collections.EMPTY_MAP;
                                                                cursorQuery2.close();
                                                            }
                                                            wq1Var.put(strV, map6);
                                                        } else {
                                                            it5 = it4;
                                                        }
                                                        it6 = map6.keySet().iterator();
                                                        wq1Var2 = wq1Var;
                                                        while (it6.hasNext()) {
                                                            num2 = (Integer) it6.next();
                                                            iIntValue = num2.intValue();
                                                            if (this.e.contains(num2)) {
                                                                y53Var.d().L().b(num2, "Skipping failed audience ID");
                                                                break;
                                                                break;
                                                            }
                                                            it7 = ((List) map6.get(num2)).iterator();
                                                            zB = true;
                                                            wq1Var3 = wq1Var2;
                                                            while (true) {
                                                                if (it7.hasNext()) {
                                                                    w03Var = (w03) it7.next();
                                                                    map7 = map6;
                                                                    if (Log.isLoggable(y53Var.d().O(), 2)) {
                                                                        z23 z23VarL6 = y53Var.d().L();
                                                                        if (w03Var.t()) {
                                                                            numValueOf4 = Integer.valueOf(w03Var.u());
                                                                        } else {
                                                                            numValueOf4 = null;
                                                                        }
                                                                        z23VarL6.d("Evaluating filter. audience, filter, property", num2, numValueOf4, y53Var.m().c(w03Var.v()));
                                                                        y53Var.d().L().b(if3Var.j0().g0(w03Var), "Filter definition");
                                                                    }
                                                                    if (w03Var.t()) {
                                                                    }
                                                                    z23 z23VarJ6 = y53Var.d().J();
                                                                    b33 b33VarM6 = c33.M(this.d);
                                                                    if (w03Var.t()) {
                                                                        numValueOf3 = Integer.valueOf(w03Var.u());
                                                                    } else {
                                                                        numValueOf3 = null;
                                                                    }
                                                                    z23VarJ6.c(b33VarM6, String.valueOf(numValueOf3), "Invalid property filter ID. appId, id");
                                                                    this.e.add(num2);
                                                                    map6 = map7;
                                                                    wq1Var2 = wq1Var3;
                                                                    it6 = it6;
                                                                } else {
                                                                    map7 = map6;
                                                                    wq1Var3 = wq1Var3;
                                                                    it6 = it6;
                                                                }
                                                                if (!zB) {
                                                                    this.e.add(num2);
                                                                }
                                                                map6 = map7;
                                                                wq1Var2 = wq1Var3;
                                                                it6 = it6;
                                                                J(num2).a(gj2Var);
                                                                iIntValue = i2;
                                                                map6 = map7;
                                                                wq1Var3 = wq1Var3;
                                                                it6 = it6;
                                                            }
                                                        }
                                                        it4 = it5;
                                                        wq1Var = wq1Var2;
                                                    }
                                                }
                                                arrayList2 = new ArrayList();
                                                jb<Integer> jbVar4 = (jb) this.f.keySet();
                                                jbVar4.removeAll(this.e);
                                                while (r3.hasNext()) {
                                                    int iIntValue6 = num7.intValue();
                                                    eq3 eq3Var5 = (eq3) this.f.get(num7);
                                                    gu2.o(eq3Var5);
                                                    e43 e43VarB4 = eq3Var5.b(iIntValue6);
                                                    arrayList2.add(e43VarB4);
                                                    bu2VarG1 = if3Var.g0();
                                                    y53Var3 = (y53) bu2VarG1.a;
                                                    str8 = this.d;
                                                    i63 i63VarV4 = e43VarB4.v();
                                                    bu2VarG1.F();
                                                    bu2VarG1.D();
                                                    gu2.l(str8);
                                                    gu2.o(i63VarV4);
                                                    byte[] bArrA4 = i63VarV4.a();
                                                    contentValues = new ContentValues();
                                                    contentValues.put("app_id", str8);
                                                    contentValues.put(str5, num7);
                                                    contentValues.put("current_results", bArrA4);
                                                    if (bu2VarG1.v0().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                        y53Var3.d().I().b(c33.M(str8), "Failed to insert filter results (got -1). appId");
                                                    }
                                                }
                                                return arrayList2;
                                            }
                                        }
                                        r111.close();
                                        map = mbVar9;
                                    } else {
                                        str2 = "data";
                                        Query.close();
                                    }
                                } catch (Throwable th12) {
                                    th = th12;
                                    r19 = Query;
                                }
                            } catch (SQLiteException e24) {
                                e = e24;
                                str2 = "data";
                            }
                        } catch (SQLiteException e25) {
                            e = e25;
                            str2 = "data";
                            r8 = 0;
                        } catch (Throwable th13) {
                            th = th13;
                            r8 = 0;
                        }
                        bu2 bu2VarG13 = if3Var.g0();
                        obj = (y53) bu2VarG13.a;
                        r5 = this.d;
                        bu2VarG13.F();
                        bu2VarG13.D();
                        gu2.l(r5);
                        cursorQuery = bu2VarG13.v0().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{r5}, null, null, null);
                        if (cursorQuery.moveToFirst()) {
                            Map map19 = Collections.EMPTY_MAP;
                            cursorQuery.close();
                            map2 = map19;
                            str3 = "Failed to merge filter. appId";
                            obj2 = "Database error querying filters. appId";
                            obj = obj;
                            r5 = r5;
                        } else {
                            mbVar8 = new mb();
                            r17 = obj;
                            r21 = r5;
                            while (true) {
                                i3 = cursorQuery.getInt(0);
                                i63 i63Var13 = (i63) ((g63) lf3.p0(i63.B(), cursorQuery.getBlob(1))).g();
                                Object objValueOf2 = Integer.valueOf(i3);
                                mbVar8.put(objValueOf2, i63Var13);
                                str3 = str14;
                                obj2 = objM;
                                obj3 = objValueOf2;
                                r6 = r21;
                                if (!cursorQuery.moveToNext()) {
                                    break;
                                    break;
                                }
                                str14 = str3;
                                objM = obj2;
                                r21 = r21;
                            }
                            cursorQuery.close();
                            obj = obj3;
                            r5 = r6;
                            map2 = mbVar8;
                        }
                        if (map2.isEmpty()) {
                            str5 = "audience_id";
                            y53Var = y53Var6;
                        } else {
                            HashSet<Integer> hashSet4 = new HashSet(map2.keySet());
                            if (z3) {
                                String str114 = this.d;
                                bu2VarG0 = if3Var.g0();
                                str6 = this.d;
                                bu2VarG0.F();
                                bu2VarG0.D();
                                gu2.l(str6);
                                mbVar3 = new mb();
                                cursorRawQuery = bu2VarG0.v0().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str6, str6});
                                if (cursorRawQuery.moveToFirst()) {
                                    do {
                                        numValueOf2 = Integer.valueOf(cursorRawQuery.getInt(0));
                                        arrayList = (List) mbVar3.get(numValueOf2);
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                            mbVar3.put(numValueOf2, arrayList);
                                        }
                                        arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                    } while (cursorRawQuery.moveToNext());
                                } else {
                                    mbVar3 = Collections.EMPTY_MAP;
                                }
                                cursorRawQuery.close();
                                r0 = mbVar3;
                                gu2.l(str114);
                                mbVar4 = new mb();
                                if (!map2.isEmpty()) {
                                    it2 = map2.keySet().iterator();
                                    while (it2.hasNext()) {
                                        num = (Integer) it2.next();
                                        num.getClass();
                                        i63Var3 = (i63) map2.get(num);
                                        list4 = (List) r0.get(num);
                                        if (list4 != null || list4.isEmpty()) {
                                            r18 = r0;
                                            it3 = it2;
                                            y53Var2 = y53Var6;
                                            mbVar4.put(num, i63Var3);
                                            r0 = r18;
                                            it2 = it3;
                                            str15 = str15;
                                            y53Var6 = y53Var2;
                                        } else {
                                            ?? r112 = r0;
                                            it3 = it2;
                                            List listL0 = if3Var.j0().l0((tm2) i63Var3.v(), list4);
                                            if (listL0.isEmpty()) {
                                                r0 = r112;
                                                it2 = it3;
                                            } else {
                                                g63 g63Var = (g63) i63Var3.k();
                                                g63Var.k();
                                                g63Var.d();
                                                ((i63) g63Var.b).F(listL0);
                                                List listL1 = if3Var.j0().l0((tm2) i63Var3.t(), list4);
                                                g63Var.j();
                                                g63Var.d();
                                                ((i63) g63Var.b).D(listL1);
                                                ArrayList arrayList6 = new ArrayList();
                                                Iterator it11 = i63Var3.x().iterator();
                                                while (it11.hasNext()) {
                                                    Iterator it12 = it11;
                                                    z43 z43Var2 = (z43) it11.next();
                                                    y53 y53Var12 = y53Var6;
                                                    if (!list4.contains(Integer.valueOf(z43Var2.u()))) {
                                                        arrayList6.add(z43Var2);
                                                    }
                                                    it11 = it12;
                                                    y53Var6 = y53Var12;
                                                }
                                                y53Var2 = y53Var6;
                                                g63Var.l();
                                                g63Var.d();
                                                ((i63) g63Var.b).H(arrayList6);
                                                ArrayList arrayList7 = new ArrayList();
                                                for (m63 m63Var2 : i63Var3.z()) {
                                                    if (!list4.contains(Integer.valueOf(m63Var2.u()))) {
                                                        arrayList7.add(m63Var2);
                                                    }
                                                }
                                                g63Var.m();
                                                g63Var.d();
                                                ((i63) g63Var.b).J(arrayList7);
                                                mbVar4.put(num, (i63) g63Var.g());
                                                r18 = r112;
                                                r0 = r18;
                                                it2 = it3;
                                                str15 = str15;
                                                y53Var6 = y53Var2;
                                            }
                                        }
                                    }
                                }
                                str4 = str15;
                                y53Var = y53Var6;
                                map3 = mbVar4;
                            } else {
                                str4 = "audience_id";
                                y53Var = y53Var6;
                                map3 = map2;
                            }
                            map5 = map3;
                            map4 = map2;
                            while (r17.hasNext()) {
                                num4.getClass();
                                i63Var = (i63) map5.get(num4);
                                bitSet = new BitSet();
                                bitSet2 = new BitSet();
                                mbVar = new mb();
                                if (i63Var != null && i63Var.y() != 0) {
                                    while (r3.hasNext()) {
                                        if (z43Var.t()) {
                                            i63 i63Var14 = i63Var;
                                            Integer numValueOf13 = Integer.valueOf(z43Var.u());
                                            if (z43Var.v()) {
                                                lValueOf = Long.valueOf(z43Var.w());
                                            } else {
                                                lValueOf = null;
                                            }
                                            mbVar.put(numValueOf13, lValueOf);
                                            i63Var = i63Var14;
                                        }
                                    }
                                }
                                i63Var2 = i63Var;
                                mbVar2 = new mb();
                                if (i63Var2 != null && i63Var2.A() != 0) {
                                    it = i63Var2.z().iterator();
                                    while (it.hasNext()) {
                                        m63Var = (m63) it.next();
                                        if (!m63Var.t() && m63Var.w() > 0) {
                                            mbVar2.put(Integer.valueOf(m63Var.u()), Long.valueOf(m63Var.x(m63Var.w() - 1)));
                                            it = it;
                                            map5 = map5;
                                        }
                                    }
                                }
                                Map map110 = map5;
                                if (i63Var2 != null) {
                                    i = 0;
                                    while (i < i63Var2.u() * 64) {
                                        if (lf3.j0((tm2) i63Var2.t(), i)) {
                                            z4 = zP;
                                            y53Var.d().L().c(num4, Integer.valueOf(i), "Filter already evaluated. audience ID, filter ID");
                                            bitSet2.set(i);
                                            if (lf3.j0((tm2) i63Var2.v(), i)) {
                                                bitSet.set(i);
                                            }
                                            i++;
                                            zP = z4;
                                        } else {
                                            z4 = zP;
                                        }
                                        mbVar.remove(Integer.valueOf(i));
                                        i++;
                                        zP = z4;
                                    }
                                }
                                boolean z10 = zP;
                                i63 i63Var15 = (i63) map4.get(num4);
                                if (zP2 && z10 && (list3 = (List) map.get(num4)) != null && this.v != null && this.i != null) {
                                    while (r2.hasNext()) {
                                        int iU6 = n03Var2.u();
                                        Integer num11 = num4;
                                        jLongValue = this.v.longValue() / 1000;
                                        if (n03Var2.C()) {
                                            jLongValue = this.i.longValue() / 1000;
                                        }
                                        numValueOf = Integer.valueOf(iU6);
                                        if (mbVar.containsKey(numValueOf)) {
                                            mbVar.put(numValueOf, Long.valueOf(jLongValue));
                                        }
                                        if (mbVar2.containsKey(numValueOf)) {
                                            mbVar2.put(numValueOf, Long.valueOf(jLongValue));
                                        }
                                        num4 = num11;
                                    }
                                }
                                this.f.put(num4, new eq3(this, this.d, i63Var15, bitSet, bitSet2, mbVar, mbVar2));
                                obj2 = obj2;
                                map = map;
                                str2 = str2;
                                zP = z10;
                                map5 = map110;
                                map4 = map4;
                                zP2 = zP2;
                            }
                            str5 = str4;
                        }
                        str7 = str2;
                        String str115 = str3;
                        ?? r14 = obj2;
                        if (!list.isEmpty()) {
                            ir3Var = new ir3(this);
                            mbVar6 = new mb();
                            it8 = list.iterator();
                            while (it8.hasNext()) {
                                d53Var = (d53) it8.next();
                                d53VarA = ir3Var.a(this.d, d53Var);
                                if (d53VarA != null) {
                                    tu2VarO0 = if3Var.g0().o0(this.d, d53Var, d53VarA.y());
                                    if3Var.g0().f0("events", tu2VarO0);
                                    if (z) {
                                        j = tu2VarO0.c;
                                        strY = d53VarA.y();
                                        map8 = (Map) mbVar6.get(strY);
                                        if (map8 == null) {
                                            bu2 bu2VarG14 = if3Var.g0();
                                            y53 y53Var13 = (y53) bu2VarG14.a;
                                            str11 = this.d;
                                            bu2VarG14.F();
                                            bu2VarG14.D();
                                            gu2.l(str11);
                                            gu2.l(strY);
                                            mbVar7 = new mb();
                                            cursorQuery3 = bu2VarG14.v0().query("event_filters", new String[]{str5, str7}, "app_id=? AND event_name=?", new String[]{str11, strY}, null, null, null);
                                            if (cursorQuery3.moveToFirst()) {
                                                str12 = str11;
                                                while (true) {
                                                    n03 n03Var12 = (n03) ((l03) lf3.p0(n03.F(), cursorQuery3.getBlob(1))).g();
                                                    numValueOf6 = Integer.valueOf(cursorQuery3.getInt(0));
                                                    list6 = (List) mbVar7.get(numValueOf6);
                                                    if (list6 == null) {
                                                        cursor4 = cursorQuery3;
                                                        arrayList4 = new ArrayList();
                                                        mbVar7.put(numValueOf6, arrayList4);
                                                    } else {
                                                        cursor4 = cursorQuery3;
                                                        arrayList4 = list6;
                                                    }
                                                    arrayList4.add(n03Var12);
                                                    if (!cursor4.moveToNext()) {
                                                        break;
                                                        break;
                                                    }
                                                    cursorQuery3 = cursor4;
                                                }
                                                cursor4.close();
                                                map8 = mbVar7;
                                            } else {
                                                map8 = Collections.EMPTY_MAP;
                                                cursorQuery3.close();
                                            }
                                            mbVar6.put(strY, map8);
                                        }
                                        while (r18.hasNext()) {
                                            iIntValue2 = num6.intValue();
                                            if (this.e.contains(num6)) {
                                                y53Var.d().L().b(num6, "Skipping failed audience ID");
                                            } else {
                                                it9 = ((List) map8.get(num6)).iterator();
                                                zA = true;
                                                while (true) {
                                                    if (!it9.hasNext()) {
                                                        map9 = map8;
                                                        ir3Var2 = ir3Var;
                                                        num3 = num6;
                                                        break;
                                                    }
                                                    n03 n03Var13 = (n03) it9.next();
                                                    ir3Var2 = ir3Var;
                                                    num3 = num6;
                                                    map9 = map8;
                                                    gj2Var2 = new gj2(this, this.d, iIntValue2, n03Var13, 0);
                                                    Long l13 = this.i;
                                                    Long l14 = this.v;
                                                    iU = n03Var13.u();
                                                    eq3Var = (eq3) this.f.get(num3);
                                                    if (eq3Var == null) {
                                                        z5 = false;
                                                    } else {
                                                        z5 = eq3Var.d.get(iU);
                                                    }
                                                    zA = gj2Var2.a(l13, l14, d53VarA, j, tu2VarO0, z5);
                                                    if (!zA) {
                                                        this.e.add(num3);
                                                        break;
                                                    }
                                                    J(num3).a(gj2Var2);
                                                    num6 = num3;
                                                    map8 = map9;
                                                    ir3Var = ir3Var2;
                                                }
                                                if (!zA) {
                                                    this.e.add(num3);
                                                }
                                                ir3Var = ir3Var2;
                                                map8 = map9;
                                            }
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                        }
                        if (!z) {
                            return new ArrayList();
                        }
                        if (!list2.isEmpty()) {
                            mb mbVar14 = new mb();
                            it4 = list2.iterator();
                            wq1Var = mbVar14;
                            while (it4.hasNext()) {
                                u63 u63Var5 = (u63) it4.next();
                                strV = u63Var5.v();
                                map6 = (Map) wq1Var.get(strV);
                                if (map6 == null) {
                                    bu2 bu2VarG15 = if3Var.g0();
                                    y53Var4 = (y53) bu2VarG15.a;
                                    str9 = this.d;
                                    bu2VarG15.F();
                                    bu2VarG15.D();
                                    gu2.l(str9);
                                    gu2.l(strV);
                                    mbVar5 = new mb();
                                    cursorQuery2 = bu2VarG15.v0().query("property_filters", new String[]{str5, str7}, "app_id=? AND property_name=?", new String[]{str9, strV}, null, null, null);
                                    if (cursorQuery2.moveToFirst()) {
                                        it5 = it4;
                                        while (true) {
                                            w03 w03Var6 = (w03) ((v03) lf3.p0(w03.B(), cursorQuery2.getBlob(1))).g();
                                            numValueOf5 = Integer.valueOf(cursorQuery2.getInt(0));
                                            list5 = (List) mbVar5.get(numValueOf5);
                                            if (list5 == null) {
                                                y53Var5 = y53Var4;
                                                arrayList3 = new ArrayList();
                                                mbVar5.put(numValueOf5, arrayList3);
                                            } else {
                                                y53Var5 = y53Var4;
                                                arrayList3 = list5;
                                            }
                                            arrayList3.add(w03Var6);
                                            str10 = str9;
                                            if (!cursorQuery2.moveToNext()) {
                                                break;
                                                break;
                                            }
                                            y53Var4 = y53Var5;
                                            str9 = str10;
                                        }
                                        cursorQuery2.close();
                                        map6 = mbVar5;
                                    } else {
                                        it5 = it4;
                                        map6 = Collections.EMPTY_MAP;
                                        cursorQuery2.close();
                                    }
                                    wq1Var.put(strV, map6);
                                } else {
                                    it5 = it4;
                                }
                                it6 = map6.keySet().iterator();
                                wq1Var2 = wq1Var;
                                while (it6.hasNext()) {
                                    num2 = (Integer) it6.next();
                                    iIntValue = num2.intValue();
                                    if (this.e.contains(num2)) {
                                        y53Var.d().L().b(num2, "Skipping failed audience ID");
                                        break;
                                        break;
                                    }
                                    it7 = ((List) map6.get(num2)).iterator();
                                    zB = true;
                                    wq1Var3 = wq1Var2;
                                    while (true) {
                                        if (it7.hasNext()) {
                                            w03Var = (w03) it7.next();
                                            map7 = map6;
                                            if (Log.isLoggable(y53Var.d().O(), 2)) {
                                                z23 z23VarL7 = y53Var.d().L();
                                                if (w03Var.t()) {
                                                    numValueOf4 = Integer.valueOf(w03Var.u());
                                                } else {
                                                    numValueOf4 = null;
                                                }
                                                z23VarL7.d("Evaluating filter. audience, filter, property", num2, numValueOf4, y53Var.m().c(w03Var.v()));
                                                y53Var.d().L().b(if3Var.j0().g0(w03Var), "Filter definition");
                                            }
                                            if (w03Var.t() || w03Var.u() > 256) {
                                                z23 z23VarJ7 = y53Var.d().J();
                                                b33 b33VarM7 = c33.M(this.d);
                                                if (w03Var.t()) {
                                                    numValueOf3 = Integer.valueOf(w03Var.u());
                                                } else {
                                                    numValueOf3 = null;
                                                }
                                                z23VarJ7.c(b33VarM7, String.valueOf(numValueOf3), "Invalid property filter ID. appId, id");
                                                this.e.add(num2);
                                                map6 = map7;
                                                wq1Var2 = wq1Var3;
                                                it6 = it6;
                                            } else {
                                                i2 = iIntValue;
                                                gj2Var = new gj2(this, this.d, i2, w03Var, 1);
                                                Long l15 = this.i;
                                                Long l16 = this.v;
                                                int iU7 = w03Var.u();
                                                eq3 eq3Var6 = (eq3) this.f.get(num2);
                                                zB = gj2Var.b(l15, l16, u63Var5, eq3Var6 == null ? false : eq3Var6.d.get(iU7));
                                                if (zB) {
                                                    J(num2).a(gj2Var);
                                                    iIntValue = i2;
                                                    map6 = map7;
                                                    wq1Var3 = wq1Var3;
                                                    it6 = it6;
                                                } else {
                                                    this.e.add(num2);
                                                    wq1Var3 = wq1Var3;
                                                }
                                            }
                                        } else {
                                            map7 = map6;
                                            wq1Var3 = wq1Var3;
                                            it6 = it6;
                                        }
                                        if (!zB) {
                                            this.e.add(num2);
                                        }
                                        map6 = map7;
                                        wq1Var2 = wq1Var3;
                                        it6 = it6;
                                    }
                                }
                                it4 = it5;
                                wq1Var = wq1Var2;
                            }
                        }
                        arrayList2 = new ArrayList();
                        jb<Integer> jbVar5 = (jb) this.f.keySet();
                        jbVar5.removeAll(this.e);
                        while (r3.hasNext()) {
                            int iIntValue7 = num7.intValue();
                            eq3 eq3Var7 = (eq3) this.f.get(num7);
                            gu2.o(eq3Var7);
                            e43 e43VarB5 = eq3Var7.b(iIntValue7);
                            arrayList2.add(e43VarB5);
                            bu2VarG1 = if3Var.g0();
                            y53Var3 = (y53) bu2VarG1.a;
                            str8 = this.d;
                            i63 i63VarV5 = e43VarB5.v();
                            bu2VarG1.F();
                            bu2VarG1.D();
                            gu2.l(str8);
                            gu2.o(i63VarV5);
                            byte[] bArrA5 = i63VarV5.a();
                            contentValues = new ContentValues();
                            contentValues.put("app_id", str8);
                            contentValues.put(str5, num7);
                            contentValues.put("current_results", bArrA5);
                            if (bu2VarG1.v0().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                y53Var3.d().I().b(c33.M(str8), "Failed to insert filter results (got -1). appId");
                            }
                        }
                        return arrayList2;
                    }
                    z3 = z2;
                    str2 = "data";
                    if (cursorQuery.moveToFirst()) {
                        Map map111 = Collections.EMPTY_MAP;
                        cursorQuery.close();
                        map2 = map111;
                        str3 = "Failed to merge filter. appId";
                        obj2 = "Database error querying filters. appId";
                        obj = obj;
                        r5 = r5;
                    } else {
                        mbVar8 = new mb();
                        r17 = obj;
                        r21 = r5;
                        while (true) {
                            i3 = cursorQuery.getInt(0);
                            i63 i63Var16 = (i63) ((g63) lf3.p0(i63.B(), cursorQuery.getBlob(1))).g();
                            Object objValueOf3 = Integer.valueOf(i3);
                            mbVar8.put(objValueOf3, i63Var16);
                            str3 = str14;
                            obj2 = objM;
                            obj3 = objValueOf3;
                            r6 = r21;
                            if (!cursorQuery.moveToNext()) {
                                break;
                                break;
                            }
                            str14 = str3;
                            objM = obj2;
                            r21 = r21;
                        }
                        cursorQuery.close();
                        obj = obj3;
                        r5 = r6;
                        map2 = mbVar8;
                    }
                } catch (SQLiteException e26) {
                    e = e26;
                    r17 = obj;
                    r21 = r5;
                }
            } catch (Throwable th14) {
                th = th14;
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                throw th;
            }
            cursorQuery = bu2VarG13.v0().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{r5}, null, null, null);
        } catch (SQLiteException e27) {
            e = e27;
            r17 = obj;
            str3 = "Failed to merge filter. appId";
            obj2 = "Database error querying filters. appId";
            r21 = r5;
            cursorQuery = null;
        } catch (Throwable th15) {
            th = th15;
            cursorQuery = null;
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
        map = map10;
        bu2 bu2VarG16 = if3Var.g0();
        obj = (y53) bu2VarG16.a;
        r5 = this.d;
        bu2VarG16.F();
        bu2VarG16.D();
        gu2.l(r5);
        if (map2.isEmpty()) {
            str5 = "audience_id";
            y53Var = y53Var6;
        } else {
            HashSet<Integer> hashSet5 = new HashSet(map2.keySet());
            if (z3) {
                String str116 = this.d;
                bu2VarG0 = if3Var.g0();
                str6 = this.d;
                bu2VarG0.F();
                bu2VarG0.D();
                gu2.l(str6);
                mbVar3 = new mb();
                cursorRawQuery = bu2VarG0.v0().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str6, str6});
                if (cursorRawQuery.moveToFirst()) {
                    do {
                        numValueOf2 = Integer.valueOf(cursorRawQuery.getInt(0));
                        arrayList = (List) mbVar3.get(numValueOf2);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            mbVar3.put(numValueOf2, arrayList);
                        }
                        arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                    } while (cursorRawQuery.moveToNext());
                } else {
                    mbVar3 = Collections.EMPTY_MAP;
                }
                cursorRawQuery.close();
                r0 = mbVar3;
                gu2.l(str116);
                mbVar4 = new mb();
                if (!map2.isEmpty()) {
                    it2 = map2.keySet().iterator();
                    while (it2.hasNext()) {
                        num = (Integer) it2.next();
                        num.getClass();
                        i63Var3 = (i63) map2.get(num);
                        list4 = (List) r0.get(num);
                        if (list4 != null) {
                        }
                        r18 = r0;
                        it3 = it2;
                        y53Var2 = y53Var6;
                        mbVar4.put(num, i63Var3);
                        r0 = r18;
                        it2 = it3;
                        str15 = str15;
                        y53Var6 = y53Var2;
                    }
                }
                str4 = str15;
                y53Var = y53Var6;
                map3 = mbVar4;
            } else {
                str4 = "audience_id";
                y53Var = y53Var6;
                map3 = map2;
            }
            map5 = map3;
            map4 = map2;
            while (r17.hasNext()) {
                num4.getClass();
                i63Var = (i63) map5.get(num4);
                bitSet = new BitSet();
                bitSet2 = new BitSet();
                mbVar = new mb();
                if (i63Var != null) {
                    while (r3.hasNext()) {
                        if (z43Var.t()) {
                            i63 i63Var17 = i63Var;
                            Integer numValueOf14 = Integer.valueOf(z43Var.u());
                            if (z43Var.v()) {
                                lValueOf = Long.valueOf(z43Var.w());
                            } else {
                                lValueOf = null;
                            }
                            mbVar.put(numValueOf14, lValueOf);
                            i63Var = i63Var17;
                        }
                    }
                }
                i63Var2 = i63Var;
                mbVar2 = new mb();
                if (i63Var2 != null) {
                    it = i63Var2.z().iterator();
                    while (it.hasNext()) {
                        m63Var = (m63) it.next();
                        if (!m63Var.t()) {
                        }
                    }
                }
                Map map112 = map5;
                if (i63Var2 != null) {
                    i = 0;
                    while (i < i63Var2.u() * 64) {
                        if (lf3.j0((tm2) i63Var2.t(), i)) {
                            z4 = zP;
                            y53Var.d().L().c(num4, Integer.valueOf(i), "Filter already evaluated. audience ID, filter ID");
                            bitSet2.set(i);
                            if (lf3.j0((tm2) i63Var2.v(), i)) {
                                bitSet.set(i);
                            }
                            i++;
                            zP = z4;
                        } else {
                            z4 = zP;
                        }
                        mbVar.remove(Integer.valueOf(i));
                        i++;
                        zP = z4;
                    }
                }
                boolean z11 = zP;
                i63 i63Var18 = (i63) map4.get(num4);
                if (zP2) {
                    while (r2.hasNext()) {
                        int iU8 = n03Var2.u();
                        Integer num12 = num4;
                        jLongValue = this.v.longValue() / 1000;
                        if (n03Var2.C()) {
                            jLongValue = this.i.longValue() / 1000;
                        }
                        numValueOf = Integer.valueOf(iU8);
                        if (mbVar.containsKey(numValueOf)) {
                            mbVar.put(numValueOf, Long.valueOf(jLongValue));
                        }
                        if (mbVar2.containsKey(numValueOf)) {
                            mbVar2.put(numValueOf, Long.valueOf(jLongValue));
                        }
                        num4 = num12;
                    }
                }
                this.f.put(num4, new eq3(this, this.d, i63Var18, bitSet, bitSet2, mbVar, mbVar2));
                obj2 = obj2;
                map = map;
                str2 = str2;
                zP = z11;
                map5 = map112;
                map4 = map4;
                zP2 = zP2;
            }
            str5 = str4;
        }
        str7 = str2;
        String str117 = str3;
        ?? r15 = obj2;
        if (!list.isEmpty()) {
            ir3Var = new ir3(this);
            mbVar6 = new mb();
            it8 = list.iterator();
            while (it8.hasNext()) {
                d53Var = (d53) it8.next();
                d53VarA = ir3Var.a(this.d, d53Var);
                if (d53VarA != null) {
                    tu2VarO0 = if3Var.g0().o0(this.d, d53Var, d53VarA.y());
                    if3Var.g0().f0("events", tu2VarO0);
                    if (z) {
                        j = tu2VarO0.c;
                        strY = d53VarA.y();
                        map8 = (Map) mbVar6.get(strY);
                        if (map8 == null) {
                            bu2 bu2VarG17 = if3Var.g0();
                            y53 y53Var14 = (y53) bu2VarG17.a;
                            str11 = this.d;
                            bu2VarG17.F();
                            bu2VarG17.D();
                            gu2.l(str11);
                            gu2.l(strY);
                            mbVar7 = new mb();
                            cursorQuery3 = bu2VarG17.v0().query("event_filters", new String[]{str5, str7}, "app_id=? AND event_name=?", new String[]{str11, strY}, null, null, null);
                            if (cursorQuery3.moveToFirst()) {
                                str12 = str11;
                                while (true) {
                                    n03 n03Var14 = (n03) ((l03) lf3.p0(n03.F(), cursorQuery3.getBlob(1))).g();
                                    numValueOf6 = Integer.valueOf(cursorQuery3.getInt(0));
                                    list6 = (List) mbVar7.get(numValueOf6);
                                    if (list6 == null) {
                                        cursor4 = cursorQuery3;
                                        arrayList4 = new ArrayList();
                                        mbVar7.put(numValueOf6, arrayList4);
                                    } else {
                                        cursor4 = cursorQuery3;
                                        arrayList4 = list6;
                                    }
                                    arrayList4.add(n03Var14);
                                    if (!cursor4.moveToNext()) {
                                        break;
                                        break;
                                    }
                                    cursorQuery3 = cursor4;
                                }
                                cursor4.close();
                                map8 = mbVar7;
                            } else {
                                map8 = Collections.EMPTY_MAP;
                                cursorQuery3.close();
                            }
                            mbVar6.put(strY, map8);
                        }
                        while (r18.hasNext()) {
                            iIntValue2 = num6.intValue();
                            if (this.e.contains(num6)) {
                                y53Var.d().L().b(num6, "Skipping failed audience ID");
                            } else {
                                it9 = ((List) map8.get(num6)).iterator();
                                zA = true;
                                while (true) {
                                    if (!it9.hasNext()) {
                                        map9 = map8;
                                        ir3Var2 = ir3Var;
                                        num3 = num6;
                                        break;
                                    }
                                    n03 n03Var15 = (n03) it9.next();
                                    ir3Var2 = ir3Var;
                                    num3 = num6;
                                    map9 = map8;
                                    gj2Var2 = new gj2(this, this.d, iIntValue2, n03Var15, 0);
                                    Long l17 = this.i;
                                    Long l18 = this.v;
                                    iU = n03Var15.u();
                                    eq3Var = (eq3) this.f.get(num3);
                                    if (eq3Var == null) {
                                        z5 = false;
                                    } else {
                                        z5 = eq3Var.d.get(iU);
                                    }
                                    zA = gj2Var2.a(l17, l18, d53VarA, j, tu2VarO0, z5);
                                    if (!zA) {
                                        this.e.add(num3);
                                        break;
                                    }
                                    J(num3).a(gj2Var2);
                                    num6 = num3;
                                    map8 = map9;
                                    ir3Var = ir3Var2;
                                }
                                if (!zA) {
                                    this.e.add(num3);
                                }
                                ir3Var = ir3Var2;
                                map8 = map9;
                            }
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        if (!z) {
            return new ArrayList();
        }
        if (!list2.isEmpty()) {
            mb mbVar15 = new mb();
            it4 = list2.iterator();
            wq1Var = mbVar15;
            while (it4.hasNext()) {
                u63 u63Var6 = (u63) it4.next();
                strV = u63Var6.v();
                map6 = (Map) wq1Var.get(strV);
                if (map6 == null) {
                    bu2 bu2VarG18 = if3Var.g0();
                    y53Var4 = (y53) bu2VarG18.a;
                    str9 = this.d;
                    bu2VarG18.F();
                    bu2VarG18.D();
                    gu2.l(str9);
                    gu2.l(strV);
                    mbVar5 = new mb();
                    cursorQuery2 = bu2VarG18.v0().query("property_filters", new String[]{str5, str7}, "app_id=? AND property_name=?", new String[]{str9, strV}, null, null, null);
                    if (cursorQuery2.moveToFirst()) {
                        it5 = it4;
                        while (true) {
                            w03 w03Var7 = (w03) ((v03) lf3.p0(w03.B(), cursorQuery2.getBlob(1))).g();
                            numValueOf5 = Integer.valueOf(cursorQuery2.getInt(0));
                            list5 = (List) mbVar5.get(numValueOf5);
                            if (list5 == null) {
                                y53Var5 = y53Var4;
                                arrayList3 = new ArrayList();
                                mbVar5.put(numValueOf5, arrayList3);
                            } else {
                                y53Var5 = y53Var4;
                                arrayList3 = list5;
                            }
                            arrayList3.add(w03Var7);
                            str10 = str9;
                            if (!cursorQuery2.moveToNext()) {
                                break;
                                break;
                            }
                            y53Var4 = y53Var5;
                            str9 = str10;
                        }
                        cursorQuery2.close();
                        map6 = mbVar5;
                    } else {
                        it5 = it4;
                        map6 = Collections.EMPTY_MAP;
                        cursorQuery2.close();
                    }
                    wq1Var.put(strV, map6);
                } else {
                    it5 = it4;
                }
                it6 = map6.keySet().iterator();
                wq1Var2 = wq1Var;
                while (it6.hasNext()) {
                    num2 = (Integer) it6.next();
                    iIntValue = num2.intValue();
                    if (this.e.contains(num2)) {
                        y53Var.d().L().b(num2, "Skipping failed audience ID");
                        break;
                        break;
                    }
                    it7 = ((List) map6.get(num2)).iterator();
                    zB = true;
                    wq1Var3 = wq1Var2;
                    while (true) {
                        if (it7.hasNext()) {
                            w03Var = (w03) it7.next();
                            map7 = map6;
                            if (Log.isLoggable(y53Var.d().O(), 2)) {
                                z23 z23VarL8 = y53Var.d().L();
                                if (w03Var.t()) {
                                    numValueOf4 = Integer.valueOf(w03Var.u());
                                } else {
                                    numValueOf4 = null;
                                }
                                z23VarL8.d("Evaluating filter. audience, filter, property", num2, numValueOf4, y53Var.m().c(w03Var.v()));
                                y53Var.d().L().b(if3Var.j0().g0(w03Var), "Filter definition");
                            }
                            if (w03Var.t()) {
                            }
                            z23 z23VarJ8 = y53Var.d().J();
                            b33 b33VarM8 = c33.M(this.d);
                            if (w03Var.t()) {
                                numValueOf3 = Integer.valueOf(w03Var.u());
                            } else {
                                numValueOf3 = null;
                            }
                            z23VarJ8.c(b33VarM8, String.valueOf(numValueOf3), "Invalid property filter ID. appId, id");
                            this.e.add(num2);
                            map6 = map7;
                            wq1Var2 = wq1Var3;
                            it6 = it6;
                        } else {
                            map7 = map6;
                            wq1Var3 = wq1Var3;
                            it6 = it6;
                        }
                        if (!zB) {
                            this.e.add(num2);
                        }
                        map6 = map7;
                        wq1Var2 = wq1Var3;
                        it6 = it6;
                        J(num2).a(gj2Var);
                        iIntValue = i2;
                        map6 = map7;
                        wq1Var3 = wq1Var3;
                        it6 = it6;
                    }
                }
                it4 = it5;
                wq1Var = wq1Var2;
            }
        }
        arrayList2 = new ArrayList();
        jb<Integer> jbVar6 = (jb) this.f.keySet();
        jbVar6.removeAll(this.e);
        while (r3.hasNext()) {
            int iIntValue8 = num7.intValue();
            eq3 eq3Var8 = (eq3) this.f.get(num7);
            gu2.o(eq3Var8);
            e43 e43VarB6 = eq3Var8.b(iIntValue8);
            arrayList2.add(e43VarB6);
            bu2VarG1 = if3Var.g0();
            y53Var3 = (y53) bu2VarG1.a;
            str8 = this.d;
            i63 i63VarV6 = e43VarB6.v();
            bu2VarG1.F();
            bu2VarG1.D();
            gu2.l(str8);
            gu2.o(i63VarV6);
            byte[] bArrA6 = i63VarV6.a();
            contentValues = new ContentValues();
            contentValues.put("app_id", str8);
            contentValues.put(str5, num7);
            contentValues.put("current_results", bArrA6);
            if (bu2VarG1.v0().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                y53Var3.d().I().b(c33.M(str8), "Failed to insert filter results (got -1). appId");
            }
        }
        return arrayList2;
    }

    public final eq3 J(Integer num) {
        if (this.f.containsKey(num)) {
            return (eq3) this.f.get(num);
        }
        eq3 eq3Var = new eq3(this, this.d);
        this.f.put(num, eq3Var);
        return eq3Var;
    }

    @Override // defpackage.ne3
    public final void H() {
    }
}
