package defpackage;

import android.util.Log;
import java.io.StringReader;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Formatter;
import java.util.Locale;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class b81 {
    public static final char[] c = {'V', 'D', 'I', 'W', 'E', 'A'};
    public static final String d;
    public final kk0 a;
    public int b;

    static {
        System.getProperty("file.separator");
        d = System.getProperty("line.separator");
    }

    public b81(kk0 kk0Var) {
        new SimpleDateFormat("MM-dd HH:mm:ss.SSS ", Locale.getDefault());
        this.b = 0;
        this.a = kk0Var;
    }

    public static String f(int i, Object... objArr) {
        int length = objArr.length;
        String str = d;
        if (length != 1) {
            StringBuilder sb = new StringBuilder();
            int length2 = objArr.length;
            for (int i2 = 0; i2 < length2; i2++) {
                Object obj = objArr[i2];
                sb.append("args[");
                sb.append(i2);
                sb.append("] = ");
                sb.append(obj == null ? "null" : obj.toString());
                sb.append(str);
            }
            return sb.toString();
        }
        Object obj2 = objArr[0];
        String string = obj2 != null ? obj2.toString() : "null";
        if (i == 32) {
            try {
                if (string.startsWith("{")) {
                    string = new JSONObject(string).toString(4);
                } else if (string.startsWith("[")) {
                    string = new JSONArray(string).toString(4);
                }
                return string;
            } catch (JSONException e) {
                e.printStackTrace();
                return string;
            }
        }
        if (i != 48) {
            return string;
        }
        try {
            StreamSource streamSource = new StreamSource(new StringReader(string));
            StreamResult streamResult = new StreamResult(new StringWriter());
            Transformer transformerNewTransformer = TransformerFactory.newInstance().newTransformer();
            transformerNewTransformer.setOutputProperty("indent", "yes");
            transformerNewTransformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            transformerNewTransformer.transform(streamSource, streamResult);
            return streamResult.getWriter().toString().replaceFirst(">", ">" + str);
        } catch (Exception e2) {
            e2.printStackTrace();
            return string;
        }
    }

    public final void a(String str) {
        d((String) this.a.d, 3, str);
    }

    public final void b(Object obj) {
        d((String) this.a.d, 6, obj);
    }

    public final void c(String str) {
        d((String) this.a.d, 4, str);
    }

    public final void d(String str, int i, Object... objArr) {
        try {
            boolean zIsLoggable = Log.isLoggable(str.length() > 23 ? str.substring(0, 23) : str, 3);
            kk0 kk0Var = this.a;
            if (!zIsLoggable) {
                kk0Var.getClass();
                return;
            }
            int i2 = i & 15;
            kk0Var.getClass();
            if (i2 >= 2 || i2 >= 2) {
                String[] strArrG = g(str);
                String strF = f(0, objArr);
                if (i2 >= 2) {
                    e(strArrG[0], i2, strArrG[1], strF);
                }
            }
        } catch (Exception unused) {
        }
    }

    public final void e(String str, int i, String str2, String str3) {
        kk0 kk0Var = this.a;
        kk0Var.getClass();
        Log.println(i, str, "\n" + str2);
        if (kk0Var.c) {
            Log.println(i, str, "|---------------------------------------------------------------------------------------------------");
            if (kk0Var.c) {
                StringBuilder sb = new StringBuilder();
                String str4 = d;
                for (String str5 : str3.split(str4)) {
                    sb.append("| ");
                    sb.append(str5);
                    sb.append(str4);
                }
                str3 = sb.toString();
            }
        }
        int length = str3.length();
        int i2 = length / 4000;
        if (i2 > 0) {
            int i3 = 4000;
            Log.println(i, str, str3.substring(0, 4000));
            int i4 = 1;
            while (i4 < i2) {
                int i5 = i3 + 4000;
                String strSubstring = str3.substring(i3, i5);
                if (kk0Var.c) {
                    strSubstring = "| ".concat(strSubstring);
                }
                Log.println(i, str, strSubstring);
                i4++;
                i3 = i5;
            }
            String strSubstring2 = str3.substring(i3, length);
            if (kk0Var.c) {
                strSubstring2 = "| ".concat(strSubstring2);
            }
            Log.println(i, str, strSubstring2);
        } else {
            Log.println(i, str, str3);
        }
        if (kk0Var.c) {
            Log.println(i, str, "|---------------------------------------------------------------------------------------------------");
        }
    }

    public final String[] g(String str) {
        kk0 kk0Var = this.a;
        boolean z = kk0Var.b;
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[this.b + 5];
        String className = stackTraceElement.getClassName();
        String[] strArrSplit = className.split("\\.");
        if (strArrSplit.length > 0) {
            className = strArrSplit[strArrSplit.length - 1];
        }
        if (className.contains("$")) {
            className = className.split("\\$")[0];
        }
        if (kk0Var.b) {
            if (str == null) {
                str = className;
            } else {
                int length = str.length();
                for (int i = 0; i < length; i++) {
                    if (Character.isWhitespace(str.charAt(i))) {
                    }
                }
                str = className;
            }
        }
        String string = new Formatter().format("%s, %s(%s.java:%d)", Thread.currentThread().getName(), stackTraceElement.getMethodName(), className, Integer.valueOf(stackTraceElement.getLineNumber())).toString();
        StringBuilder sbM = ts.m(string);
        sbM.append(d);
        return new String[]{str, sbM.toString(), ts.k(" [", string, "]: ")};
    }
}
