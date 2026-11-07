package defpackage;

import android.util.Log;
import com.hjq.toast.BuildConfig;
import java.text.SimpleDateFormat;
import java.util.Formatter;
import java.util.Locale;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class a81 {
    public static final char[] b = {'V', 'D', 'I', 'W', 'E', 'A'};
    public static final String c;
    public final z71 a;

    static {
        System.getProperty("file.separator");
        c = System.getProperty("line.separator");
    }

    public a81(z71 z71Var) {
        new SimpleDateFormat("MM-dd HH:mm:ss.SSS ", Locale.getDefault());
        this.a = z71Var;
    }

    public final void a(String str) {
        b(this.a.a, 3, str);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:44:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:49:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:53:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:55:0x0106  */
    /* JADX WARN: Code duplicated, block: B:56:0x0118  */
    /* JADX WARN: Code duplicated, block: B:59:0x0125  */
    /* JADX WARN: Code duplicated, block: B:62:0x012d  */
    /* JADX WARN: Code duplicated, block: B:64:0x013a A[LOOP:0: B:63:0x0138->B:64:0x013a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:68:0x0154  */
    /* JADX WARN: Code duplicated, block: B:70:0x015f  */
    /* JADX WARN: Code duplicated, block: B:72:0x0169  */
    /* JADX WARN: Code duplicated, block: B:76:0x017c  */
    /* JADX WARN: Code duplicated, block: B:78:0x0184  */
    /* JADX WARN: Code duplicated, block: B:81:0x018b  */
    /* JADX WARN: Code duplicated, block: B:86:0x016d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:55:0x0106, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:62:0x012d, please report this as an issue */
    public final void b(String str, int i, Object... objArr) {
        String[] strArr;
        String string;
        StringBuilder sb;
        int length;
        int i2;
        Object obj;
        String string2;
        String str2;
        String str3;
        int length2;
        int i3;
        int i4;
        String strSubstring;
        String strSubstring2;
        StringBuilder sb2;
        int i5;
        Object obj2;
        boolean zIsLoggable = Log.isLoggable(str.length() > 23 ? str.substring(0, 23) : str, 3);
        z71 z71Var = this.a;
        if (!zIsLoggable) {
            z71Var.getClass();
            return;
        }
        int i6 = i & 15;
        z71Var.getClass();
        if (i6 >= 2 || i6 >= 2) {
            boolean z = z71Var.b;
            String str4 = c;
            int i7 = 1;
            if (z || z71Var.c) {
                StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[5];
                String className = stackTraceElement.getClassName();
                String[] strArrSplit = className.split("\\.");
                if (strArrSplit.length > 0) {
                    className = strArrSplit[strArrSplit.length - 1];
                }
                if (className.contains("$")) {
                    className = className.split("\\$")[0];
                }
                if (z71Var.b) {
                    int length3 = str.length();
                    int i8 = 0;
                    while (true) {
                        if (i8 >= length3) {
                            str = className;
                            break;
                        } else if (!Character.isWhitespace(str.charAt(i8))) {
                            break;
                        } else {
                            i8++;
                        }
                    }
                }
                if (z71Var.c) {
                    String string3 = new Formatter().format("%s, %s(%s.java:%d)", Thread.currentThread().getName(), stackTraceElement.getMethodName(), className, Integer.valueOf(stackTraceElement.getLineNumber())).toString();
                    strArr = new String[]{str, y00.k(string3, str4), ts.k(" [", string3, "]: ")};
                }
                string = "null";
                if (objArr.length == 1) {
                    obj2 = objArr[0];
                    if (obj2 != null) {
                        string = obj2.toString();
                    }
                } else {
                    sb = new StringBuilder();
                    length = objArr.length;
                    for (i2 = 0; i2 < length; i2++) {
                        obj = objArr[i2];
                        sb.append("args[");
                        sb.append(i2);
                        sb.append("] = ");
                        if (obj == null) {
                            string2 = "null";
                        } else {
                            string2 = obj.toString();
                        }
                        sb.append(string2);
                        sb.append(str4);
                    }
                    string = sb.toString();
                }
                if (i6 >= 2) {
                    str2 = strArr[0];
                    str3 = strArr[1];
                    if (z71Var.c) {
                        Log.println(i6, str2, "\n" + str3);
                    } else {
                        Log.println(i6, str2, " \n");
                    }
                    if (z71Var.d) {
                        Log.println(i6, str2, "|---------------------------------------------------------------------------------------------------");
                        if (z71Var.d) {
                            sb2 = new StringBuilder();
                            for (String str5 : string.split(str4)) {
                                sb2.append("| ");
                                sb2.append(str5);
                                sb2.append(str4);
                            }
                            string = sb2.toString();
                        }
                    }
                    length2 = string.length();
                    i3 = length2 / 4000;
                    if (i3 > 0) {
                        i4 = 4000;
                        Log.println(i6, str2, string.substring(0, 4000));
                        while (i7 < i3) {
                            int i9 = i4 + 4000;
                            strSubstring2 = string.substring(i4, i9);
                            if (z71Var.d) {
                                strSubstring2 = "| ".concat(strSubstring2);
                            }
                            Log.println(i6, str2, strSubstring2);
                            i7++;
                            i4 = i9;
                        }
                        strSubstring = string.substring(i4, length2);
                        if (z71Var.d) {
                            strSubstring = "| ".concat(strSubstring);
                        }
                        Log.println(i6, str2, strSubstring);
                    } else {
                        Log.println(i6, str2, string);
                    }
                    if (z71Var.d) {
                        Log.println(i6, str2, "|---------------------------------------------------------------------------------------------------");
                    }
                }
            }
            str = z71Var.a;
            strArr = new String[]{str, BuildConfig.FLAVOR, ": "};
            string = "null";
            if (objArr.length == 1) {
                obj2 = objArr[0];
                if (obj2 != null) {
                    string = obj2.toString();
                }
            } else {
                sb = new StringBuilder();
                length = objArr.length;
                while (i2 < length) {
                    obj = objArr[i2];
                    sb.append("args[");
                    sb.append(i2);
                    sb.append("] = ");
                    if (obj == null) {
                        string2 = "null";
                    } else {
                        string2 = obj.toString();
                    }
                    sb.append(string2);
                    sb.append(str4);
                }
                string = sb.toString();
            }
            if (i6 >= 2) {
                str2 = strArr[0];
                str3 = strArr[1];
                if (z71Var.c) {
                    Log.println(i6, str2, "\n" + str3);
                } else {
                    Log.println(i6, str2, " \n");
                }
                if (z71Var.d) {
                    Log.println(i6, str2, "|---------------------------------------------------------------------------------------------------");
                    if (z71Var.d) {
                        sb2 = new StringBuilder();
                        while (i5 < r6) {
                            sb2.append("| ");
                            sb2.append(str5);
                            sb2.append(str4);
                        }
                        string = sb2.toString();
                    }
                }
                length2 = string.length();
                i3 = length2 / 4000;
                if (i3 > 0) {
                    i4 = 4000;
                    Log.println(i6, str2, string.substring(0, 4000));
                    while (i7 < i3) {
                        int i10 = i4 + 4000;
                        strSubstring2 = string.substring(i4, i10);
                        if (z71Var.d) {
                            strSubstring2 = "| ".concat(strSubstring2);
                        }
                        Log.println(i6, str2, strSubstring2);
                        i7++;
                        i4 = i10;
                    }
                    strSubstring = string.substring(i4, length2);
                    if (z71Var.d) {
                        strSubstring = "| ".concat(strSubstring);
                    }
                    Log.println(i6, str2, strSubstring);
                } else {
                    Log.println(i6, str2, string);
                }
                if (z71Var.d) {
                    Log.println(i6, str2, "|---------------------------------------------------------------------------------------------------");
                }
            }
        }
    }
}
