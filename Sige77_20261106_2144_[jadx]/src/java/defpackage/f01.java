package defpackage;

import android.util.Log;
import java.text.SimpleDateFormat;
import java.util.Formatter;
import java.util.Locale;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class f01 {
    public static final String a;

    static {
        System.getProperty("file.separator");
        a = System.getProperty("line.separator");
        new SimpleDateFormat("MM-dd HH:mm:ss.SSS ", Locale.getDefault());
    }

    public static void a(String str) {
        Object[] objArr = {str};
        String str2 = "TAG";
        if (Log.isLoggable("TAG", 3)) {
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[5];
            String className = stackTraceElement.getClassName();
            String[] strArrSplit = className.split("\\.");
            int i = 1;
            if (strArrSplit.length > 0) {
                className = strArrSplit[strArrSplit.length - 1];
            }
            if (className.contains("$")) {
                className = className.split("\\$")[0];
            }
            int i2 = 0;
            while (true) {
                if (i2 >= 3) {
                    str2 = className;
                    break;
                } else if (!Character.isWhitespace("TAG".charAt(i2))) {
                    break;
                } else {
                    i2++;
                }
            }
            String string = new Formatter().format("%s, %s(%s.java:%d)", Thread.currentThread().getName(), stackTraceElement.getMethodName(), className, Integer.valueOf(stackTraceElement.getLineNumber())).toString();
            String str3 = a;
            String[] strArr = {str2, y00.k(string, str3), ts.k(" [", string, "]: ")};
            Object obj = objArr[0];
            String string2 = obj == null ? "null" : obj.toString();
            String str4 = strArr[0];
            Log.println(4, str4, "\n" + strArr[1]);
            Log.println(4, str4, "|---------------------------------------------------------------------------------------------------");
            StringBuilder sb = new StringBuilder();
            for (String str5 : string2.split(str3)) {
                sb.append("| ");
                sb.append(str5);
                sb.append(str3);
            }
            String string3 = sb.toString();
            int length = string3.length();
            int i3 = length / 4000;
            if (i3 > 0) {
                int i4 = 4000;
                Log.println(4, str4, string3.substring(0, 4000));
                while (i < i3) {
                    int i5 = i4 + 4000;
                    Log.println(4, str4, "| ".concat(string3.substring(i4, i5)));
                    i++;
                    i4 = i5;
                }
                Log.println(4, str4, "| ".concat(string3.substring(i4, length)));
            } else {
                Log.println(4, str4, string3);
            }
            Log.println(4, str4, "|---------------------------------------------------------------------------------------------------");
        }
    }
}
