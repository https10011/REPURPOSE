package defpackage;

import com.hjq.toast.BuildConfig;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class tf2 {
    public int a;
    public final Reader b;
    public char c;
    public boolean d;

    public tf2(String str) {
        Reader stringReader = new StringReader(str);
        this.b = stringReader.markSupported() ? stringReader : new BufferedReader(stringReader);
        this.d = false;
        this.a = 0;
    }

    public final xp a(String str) {
        return new xp(str.concat(toString()), 7);
    }

    public final String b(int i) {
        if (i == 0) {
            return BuildConfig.FLAVOR;
        }
        char[] cArr = new char[i];
        int i2 = 0;
        if (this.d) {
            this.d = false;
            cArr[0] = this.c;
            i2 = 1;
        }
        while (i2 < i) {
            try {
                int i3 = this.b.read(cArr, i2, i - i2);
                if (i3 == -1) {
                    break;
                }
                i2 += i3;
            } catch (IOException e) {
                throw new xp(7, e);
            }
        }
        this.a += i2;
        if (i2 < i) {
            throw a("Substring bounds error");
        }
        this.c = cArr[i - 1];
        return new String(cArr);
    }

    public final void c() {
        int i;
        if (this.d || (i = this.a) <= 0) {
            throw new xp("Stepping back two steps is not supported", 7);
        }
        this.a = i - 1;
        this.d = true;
    }

    public final char d() {
        if (this.d) {
            this.d = false;
            char c = this.c;
            if (c != 0) {
                this.a++;
            }
            return c;
        }
        try {
            int i = this.b.read();
            if (i <= 0) {
                this.c = (char) 0;
                return (char) 0;
            }
            this.a++;
            char c2 = (char) i;
            this.c = c2;
            return c2;
        } catch (IOException e) {
            throw new xp(7, e);
        }
    }

    public final char e() {
        char cD;
        do {
            cD = d();
            if (cD == 0) {
                break;
            }
        } while (cD <= ' ');
        return cD;
    }

    public final Serializable f() {
        char c;
        char cE;
        char cE2 = e();
        if (cE2 != '\"') {
            if (cE2 != '[') {
                if (cE2 == '{') {
                    c();
                    HashMap map = new HashMap();
                    if (e() != '{') {
                        throw a("A JSONObject text must begin with '{'");
                    }
                    while (true) {
                        char cE3 = e();
                        if (cE3 == 0) {
                            throw a("A JSONObject text must end with '}'");
                        }
                        if (cE3 != '}') {
                            c();
                            String string = f().toString();
                            char cE4 = e();
                            if (cE4 == '=') {
                                if (d() != '>') {
                                    c();
                                }
                            } else if (cE4 != ':') {
                                throw a("Expected a ':' after a key");
                            }
                            Serializable serializableF = f();
                            if (string != null) {
                                if (map.containsKey(string)) {
                                    throw new xp(ts.k("Duplicate key \"", string, "\""), 7);
                                }
                                map.put(string, serializableF);
                            }
                            char cE5 = e();
                            if (cE5 == ',' || cE5 == ';') {
                                if (e() != '}') {
                                    c();
                                }
                            } else if (cE5 != '}') {
                                throw a("Expected a ',' or '}'");
                            }
                        }
                        return map;
                    }
                }
                if (cE2 != '\'') {
                    if (cE2 != '(') {
                        StringBuilder sb = new StringBuilder();
                        while (cE2 >= ' ' && ",:]}/\\\"[{;=#".indexOf(cE2) < 0) {
                            sb.append(cE2);
                            cE2 = d();
                        }
                        c();
                        String strTrim = sb.toString().trim();
                        if (strTrim.equals(BuildConfig.FLAVOR)) {
                            throw a("Missing value");
                        }
                        if (!strTrim.equals(BuildConfig.FLAVOR)) {
                            if (strTrim.equalsIgnoreCase("true")) {
                                return Boolean.TRUE;
                            }
                            if (strTrim.equalsIgnoreCase("false")) {
                                return Boolean.FALSE;
                            }
                            if (strTrim.equalsIgnoreCase("null")) {
                                return null;
                            }
                            for (int i = 0; i < strTrim.length(); i++) {
                                char cCharAt = strTrim.charAt(i);
                                if (Character.isDigit(cCharAt) || cCharAt == '-' || cCharAt == '.' || cCharAt == '+' || cCharAt == 'e' || cCharAt == 'E') {
                                }
                            }
                            return new wf2(strTrim);
                        }
                        return strTrim;
                    }
                }
            }
            c();
            ArrayList arrayList = new ArrayList();
            char cE6 = e();
            if (cE6 == '[') {
                c = ']';
            } else {
                if (cE6 != '(') {
                    throw a("A JSONArray text must start with '['");
                }
                c = ')';
            }
            if (e() != ']') {
                c();
                while (true) {
                    if (e() == ',') {
                        c();
                        arrayList.add(null);
                    } else {
                        c();
                        arrayList.add(f());
                    }
                    cE = e();
                    if (cE == ')') {
                        break;
                    }
                    if (cE != ',' && cE != ';') {
                        if (cE == ']') {
                            break;
                        }
                        throw a("Expected a ',' or ']'");
                    }
                    if (e() != ']') {
                        c();
                    }
                }
                if (c != cE) {
                    throw a("Expected a '" + c + "'");
                }
            }
            return arrayList;
        }
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            char cD = d();
            if (cD == 0 || cD == '\n' || cD == '\r') {
                break;
            }
            if (cD == '\\') {
                char cD2 = d();
                if (cD2 == 'b') {
                    sb2.append('\b');
                } else if (cD2 == 'f') {
                    sb2.append('\f');
                } else if (cD2 == 'n') {
                    sb2.append('\n');
                } else if (cD2 == 'r') {
                    sb2.append('\r');
                } else if (cD2 == 'x') {
                    sb2.append((char) Integer.parseInt(b(2), 16));
                } else if (cD2 == 't') {
                    sb2.append('\t');
                } else if (cD2 != 'u') {
                    sb2.append(cD2);
                } else {
                    sb2.append((char) Integer.parseInt(b(4), 16));
                }
            } else {
                if (cD == cE2) {
                    return sb2.toString();
                }
                sb2.append(cD);
            }
        }
        throw a("Unterminated string");
    }

    public final String toString() {
        return " at character " + this.a;
    }
}
