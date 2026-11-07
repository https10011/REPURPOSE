package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.linecorp.linesdk.ManifestParser;
import com.linecorp.linesdk.api.LineEnvConfig;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class nx0 implements zm2 {
    public Object a;
    public boolean b;
    public Object c;
    public Object d;
    public Object e;

    /* JADX WARN: Code duplicated, block: B:116:0x0294  */
    /* JADX WARN: Code duplicated, block: B:117:0x0297  */
    /* JADX WARN: Code duplicated, block: B:120:0x029d  */
    /* JADX WARN: Code duplicated, block: B:122:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:124:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:125:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:127:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:128:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:130:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:131:0x0301  */
    /* JADX WARN: Code duplicated, block: B:133:0x0305  */
    /* JADX WARN: Code duplicated, block: B:166:0x031f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x010a  */
    public nx0(dc3 dc3Var, u61 u61Var) {
        lh1 lh1VarC;
        char c;
        long j;
        long j2;
        String str;
        int i = 1;
        this.b = true;
        vb3 vb3Var = dc3Var.a;
        sb3 sb3Var = dc3Var.b;
        if (vb3Var.a.isEmpty()) {
            sb3.A().equals(sb3Var);
        }
        this.a = sb3Var.t();
        this.c = sb3Var.u();
        sb3Var.getClass();
        sb3Var.getClass();
        Map mapY = sb3Var.x() == 0 ? null : sb3Var.y();
        if (mapY != null) {
            Set setKeySet = mapY.keySet();
            if (!(setKeySet instanceof wo0) || (setKeySet instanceof SortedSet) || ((wo0) setKeySet).f()) {
                Object[] array = setKeySet.toArray();
                wo0.i(array.length, array);
            }
        } else {
            Object[] objArr = mh1.w;
        }
        int iX = sb3Var.x();
        vb3 vb3Var2 = dc3Var.a;
        char c2 = 3;
        if (iX > 0) {
            Collection<ib3> collectionValues = sb3Var.y().values();
            if (collectionValues == null) {
                lh1VarC = lh1.i;
            } else {
                q8 q8Var = new q8(4);
                for (ib3 ib3Var : collectionValues) {
                    int iH = ib3Var.H();
                    int i2 = iH - 1;
                    if (iH == 0) {
                        throw null;
                    }
                    if (i2 == 0) {
                        q8Var.h(ib3Var.t(), Long.valueOf(ib3Var.u()));
                    } else if (i2 == 1) {
                        q8Var.h(ib3Var.t(), Boolean.valueOf(ib3Var.v()));
                    } else if (i2 == 2) {
                        q8Var.h(ib3Var.t(), Double.valueOf(ib3Var.w()));
                    } else if (i2 == 3) {
                        q8Var.h(ib3Var.t(), ib3Var.x());
                    } else {
                        if (i2 != 4) {
                            uq1.q("Could not serialize Flag for override: ".concat(String.valueOf(ib3Var.t())));
                            throw null;
                        }
                        q8Var.h(ib3Var.t(), ib3Var.y().k());
                    }
                }
                lh1VarC = q8Var.c(false);
            }
            if (!lh1VarC.isEmpty()) {
                HashMap map = new HashMap(lh1VarC);
                zo0 zo0Var = vb3Var2.a;
                xo0 xo0Var = new xo0(n61.a);
                bs0 it = zo0Var.iterator();
                while (true) {
                    no0 no0Var = (no0) it;
                    if (!no0Var.hasNext()) {
                        for (String str2 : map.keySet()) {
                            Object obj = map.get(str2);
                            int length = str2.length();
                            if (length <= 19) {
                                if (length == 0) {
                                    c = c2;
                                } else {
                                    c = c2;
                                    long jCharAt = str2.charAt(0) - '0';
                                    if (jCharAt >= 1) {
                                        if (jCharAt <= 9) {
                                            int i3 = i;
                                            while (true) {
                                                if (i3 >= length) {
                                                    j = 0;
                                                    if (jCharAt >= 0 && jCharAt <= 2305843009213693951L) {
                                                        j2 = jCharAt;
                                                        break;
                                                    }
                                                    break;
                                                }
                                                int iCharAt = str2.charAt(i3) - '0';
                                                j = 0;
                                                if (!((iCharAt < 0) | (iCharAt > 9))) {
                                                    jCharAt = (jCharAt * 10) + ((long) iCharAt);
                                                    i3++;
                                                }
                                            }
                                        }
                                        if (j2 == j) {
                                            str = str2;
                                        } else {
                                            str = null;
                                        }
                                        if (obj instanceof String) {
                                            xo0Var.a(new ub3(j2, str, 4, 0L, obj));
                                        } else if (obj instanceof byte[]) {
                                            xo0Var.a(new ub3(j2, str, 5, 0L, obj));
                                        } else if (obj instanceof Boolean) {
                                            xo0Var.a(new ub3(j2, str, ((Boolean) obj).booleanValue() ? 1 : 0, 0L, null));
                                        } else if (obj instanceof Long) {
                                            xo0Var.a(new ub3(j2, str, 2, ((Long) obj).longValue(), null));
                                        } else {
                                            if (obj instanceof Double) {
                                                String strValueOf = String.valueOf(obj);
                                                StringBuilder sb = new StringBuilder(str2.length() + 28 + strValueOf.length());
                                                sb.append("Cannot serialize override ");
                                                sb.append(str2);
                                                sb.append(": ");
                                                sb.append(strValueOf);
                                                throw new IllegalStateException(sb.toString());
                                            }
                                            xo0Var.a(new ub3(j2, str, 3, Double.doubleToRawLongBits(((Double) obj).doubleValue()), null));
                                        }
                                        c2 = c;
                                        i = 1;
                                    }
                                    j2 = j;
                                    if (j2 == j) {
                                        str = str2;
                                    } else {
                                        str = null;
                                    }
                                    if (obj instanceof String) {
                                        xo0Var.a(new ub3(j2, str, 4, 0L, obj));
                                    } else if (obj instanceof byte[]) {
                                        xo0Var.a(new ub3(j2, str, 5, 0L, obj));
                                    } else if (obj instanceof Boolean) {
                                        xo0Var.a(new ub3(j2, str, ((Boolean) obj).booleanValue() ? 1 : 0, 0L, null));
                                    } else if (obj instanceof Long) {
                                        xo0Var.a(new ub3(j2, str, 2, ((Long) obj).longValue(), null));
                                    } else {
                                        if (obj instanceof Double) {
                                            String strValueOf2 = String.valueOf(obj);
                                            StringBuilder sb2 = new StringBuilder(str2.length() + 28 + strValueOf2.length());
                                            sb2.append("Cannot serialize override ");
                                            sb2.append(str2);
                                            sb2.append(": ");
                                            sb2.append(strValueOf2);
                                            throw new IllegalStateException(sb2.toString());
                                        }
                                        xo0Var.a(new ub3(j2, str, 3, Double.doubleToRawLongBits(((Double) obj).doubleValue()), null));
                                    }
                                    c2 = c;
                                    i = 1;
                                }
                                j = 0;
                                j2 = 0;
                                if (j2 == j) {
                                    str = str2;
                                } else {
                                    str = null;
                                }
                                if (obj instanceof String) {
                                    xo0Var.a(new ub3(j2, str, 4, 0L, obj));
                                } else if (obj instanceof byte[]) {
                                    xo0Var.a(new ub3(j2, str, 5, 0L, obj));
                                } else if (obj instanceof Boolean) {
                                    xo0Var.a(new ub3(j2, str, ((Boolean) obj).booleanValue() ? 1 : 0, 0L, null));
                                } else if (obj instanceof Long) {
                                    xo0Var.a(new ub3(j2, str, 2, ((Long) obj).longValue(), null));
                                } else {
                                    if (obj instanceof Double) {
                                        String strValueOf3 = String.valueOf(obj);
                                        StringBuilder sb3 = new StringBuilder(str2.length() + 28 + strValueOf3.length());
                                        sb3.append("Cannot serialize override ");
                                        sb3.append(str2);
                                        sb3.append(": ");
                                        sb3.append(strValueOf3);
                                        throw new IllegalStateException(sb3.toString());
                                    }
                                    xo0Var.a(new ub3(j2, str, 3, Double.doubleToRawLongBits(((Double) obj).doubleValue()), null));
                                }
                                c2 = c;
                                i = 1;
                            } else {
                                c = c2;
                            }
                            j = 0;
                            j2 = j;
                            if (j2 == j) {
                                str = str2;
                            } else {
                                str = null;
                            }
                            if (obj instanceof String) {
                                xo0Var.a(new ub3(j2, str, 4, 0L, obj));
                            } else if (obj instanceof byte[]) {
                                xo0Var.a(new ub3(j2, str, 5, 0L, obj));
                            } else if (obj instanceof Boolean) {
                                xo0Var.a(new ub3(j2, str, ((Boolean) obj).booleanValue() ? 1 : 0, 0L, null));
                            } else if (obj instanceof Long) {
                                xo0Var.a(new ub3(j2, str, 2, ((Long) obj).longValue(), null));
                            } else {
                                if (obj instanceof Double) {
                                    String strValueOf4 = String.valueOf(obj);
                                    StringBuilder sb4 = new StringBuilder(str2.length() + 28 + strValueOf4.length());
                                    sb4.append("Cannot serialize override ");
                                    sb4.append(str2);
                                    sb4.append(": ");
                                    sb4.append(strValueOf4);
                                    throw new IllegalStateException(sb4.toString());
                                }
                                xo0Var.a(new ub3(j2, str, 3, Double.doubleToRawLongBits(((Double) obj).doubleValue()), null));
                            }
                            c2 = c;
                            i = 1;
                        }
                        vb3Var2 = new vb3(xo0Var.e());
                        break;
                    }
                    ub3 ub3Var = (ub3) no0Var.next();
                    Object obj2 = ub3Var.b;
                    long j3 = ub3Var.a;
                    Object objRemove = map.remove(obj2 == null ? Long.toString(j3) : obj2);
                    if (objRemove == null) {
                        xo0Var.a(ub3Var);
                    } else if (objRemove instanceof String) {
                        xo0Var.a(new ub3(ub3Var.a, ub3Var.b, 4, 0L, objRemove));
                    } else if (objRemove instanceof byte[]) {
                        xo0Var.a(new ub3(ub3Var.a, ub3Var.b, 5, 0L, objRemove));
                    } else if (objRemove instanceof Boolean) {
                        xo0Var.a(new ub3(ub3Var.a, ub3Var.b, ((Boolean) objRemove).booleanValue() ? 1 : 0, 0L, null));
                    } else if (objRemove instanceof Long) {
                        xo0Var.a(new ub3(ub3Var.a, ub3Var.b, 2, ((Long) objRemove).longValue(), null));
                    } else {
                        if (!(objRemove instanceof Double)) {
                            String string = ub3Var.b;
                            string = string == null ? Long.toString(j3) : string;
                            String string2 = objRemove.toString();
                            StringBuilder sb5 = new StringBuilder(String.valueOf(string).length() + 46 + string2.length());
                            sb5.append("Cannot serialize override for existing flag ");
                            sb5.append(string);
                            sb5.append(": ");
                            sb5.append(string2);
                            throw new IllegalStateException(sb5.toString());
                        }
                        xo0Var.a(new ub3(ub3Var.a, ub3Var.b, 3, Double.doubleToRawLongBits(((Double) objRemove).doubleValue()), null));
                    }
                }
            }
        }
        int size = ((nh1) vb3Var2.a).i.size() + 3;
        gu2.k(size, "expectedSize");
        q8 q8Var2 = new q8(size);
        bs0 it2 = vb3Var2.a.iterator();
        while (true) {
            no0 no0Var2 = (no0) it2;
            if (!no0Var2.hasNext()) {
                q8Var2.h("__phenotype_server_token", sb3Var.v());
                q8Var2.h("__phenotype_snapshot_token", sb3Var.t());
                q8Var2.h("__phenotype_configuration_version", Long.valueOf(sb3Var.w()));
                this.d = q8Var2.c(false);
                this.e = u61Var;
                return;
            }
            ub3 ub3Var2 = (ub3) no0Var2.next();
            String string3 = ub3Var2.b;
            if (string3 == null) {
                string3 = Long.toString(ub3Var2.a);
            }
            q8Var2.h(string3, ub3Var2.a());
        }
    }

    @Override // defpackage.zm2
    public String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("email", (String) this.a);
        jSONObject.put("password", (String) this.c);
        jSONObject.put("returnSecureToken", this.b);
        String str = (String) this.d;
        if (str != null) {
            jSONObject.put("tenantId", str);
        }
        String str2 = (String) this.e;
        if (str2 != null) {
            am2.e0(jSONObject, "captchaResponse", str2);
        } else {
            jSONObject.put("clientType", "CLIENT_TYPE_ANDROID");
        }
        return jSONObject.toString();
    }

    public nx0(ug3 ug3Var, u61 u61Var) {
        this.b = false;
        ug3.A().equals(ug3Var);
        this.a = ug3Var.t();
        this.c = ug3Var.u();
        int i = wo0.c;
        Object[] objArr = mh1.w;
        int iY = ug3Var.y() + 3;
        gu2.k(iY, "expectedSize");
        q8 q8Var = new q8(iY);
        for (wg3 wg3Var : ug3Var.x()) {
            int iG = wg3Var.G();
            int i2 = iG - 1;
            if (iG == 0) {
                throw null;
            }
            if (i2 == 0) {
                q8Var.h(wg3Var.t(), Long.valueOf(wg3Var.u()));
            } else if (i2 == 1) {
                q8Var.h(wg3Var.t(), Boolean.valueOf(wg3Var.v()));
            } else if (i2 == 2) {
                q8Var.h(wg3Var.t(), Double.valueOf(wg3Var.w()));
            } else if (i2 == 3) {
                q8Var.h(wg3Var.t(), wg3Var.x());
            } else if (i2 == 4) {
                q8Var.h(wg3Var.t(), wg3Var.y().k());
            }
        }
        q8Var.h("__phenotype_server_token", ug3Var.v());
        q8Var.h("__phenotype_snapshot_token", ug3Var.t());
        q8Var.h("__phenotype_configuration_version", Long.valueOf(ug3Var.w()));
        this.d = q8Var.c(false);
        this.e = u61Var;
    }

    public nx0(Context context, String str) {
        ManifestParser manifestParser = new ManifestParser();
        if (!TextUtils.isEmpty(str)) {
            this.a = str;
            LineEnvConfig qx0Var = context != null ? manifestParser.parse(context) : null;
            qx0Var = qx0Var == null ? new qx0() : qx0Var;
            this.c = Uri.parse(qx0Var.getOpenIdDiscoveryDocumentUrl());
            this.d = Uri.parse(qx0Var.getApiServerBaseUri());
            this.e = Uri.parse(qx0Var.getWebLoginPageUrl());
            return;
        }
        e.g("channelId is empty.");
        throw null;
    }
}
