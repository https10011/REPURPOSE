package defpackage;

import android.content.Context;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectOutputStream;
import kotlin.Unit;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class ba {
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0046: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:71), block:B:24:0x0046 */
    public static final synchronized ob1 a() {
        ob1 ob1Var;
        String str;
        ob1 ob1Var2;
        Throwable th;
        Context contextA = i90.a();
        ob1 ob1Var3 = null;
        try {
            try {
                try {
                    FileInputStream fileInputStreamOpenFileInput = contextA.openFileInput("AppEventsLogger.persistedevents");
                    fileInputStreamOpenFileInput.getClass();
                    aa aaVar = new aa(new BufferedInputStream(fileInputStreamOpenFileInput));
                    try {
                        Object object = aaVar.readObject();
                        object.getClass();
                        ob1Var2 = (ob1) object;
                        try {
                            Unit unit = Unit.a;
                            aaVar.close();
                            try {
                                contextA.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                            } catch (Exception e) {
                                e = e;
                                str = "ba";
                                Log.w(str, "Got unexpected exception when removing events file: ", e);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                throw th;
                            } catch (Throwable th3) {
                                nj2.q(aaVar, th);
                                throw th3;
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                } catch (Throwable th5) {
                    try {
                        contextA.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                    } catch (Exception e2) {
                        Log.w("ba", "Got unexpected exception when removing events file: ", e2);
                    }
                    throw th5;
                }
            } catch (FileNotFoundException unused) {
                try {
                    contextA.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                } catch (Exception e3) {
                    Log.w("ba", "Got unexpected exception when removing events file: ", e3);
                }
                ob1Var2 = ob1Var3;
            } catch (IOException e4) {
                ob1Var2 = null;
                e = e4;
                Log.w("ba", "Got unexpected exception while reading events: ", e);
                try {
                    contextA.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                } catch (Exception e5) {
                    e = e5;
                    str = "ba";
                    Log.w(str, "Got unexpected exception when removing events file: ", e);
                }
            } catch (ClassNotFoundException e6) {
                ob1Var2 = null;
                e = e6;
                Log.w("ba", "Got unexpected exception while reading events: ", e);
                try {
                    contextA.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                } catch (Exception e7) {
                    e = e7;
                    str = "ba";
                    Log.w(str, "Got unexpected exception when removing events file: ", e);
                }
            }
        } catch (FileNotFoundException unused2) {
            ob1Var3 = ob1Var;
            contextA.getFileStreamPath("AppEventsLogger.persistedevents").delete();
            ob1Var2 = ob1Var3;
        } catch (IOException e8) {
            e = e8;
            Log.w("ba", "Got unexpected exception while reading events: ", e);
            contextA.getFileStreamPath("AppEventsLogger.persistedevents").delete();
        } catch (ClassNotFoundException e9) {
            e = e9;
            Log.w("ba", "Got unexpected exception while reading events: ", e);
            contextA.getFileStreamPath("AppEventsLogger.persistedevents").delete();
        }
        if (ob1Var2 == null) {
            ob1Var2 = new ob1();
        }
        return ob1Var2;
    }

    public static final void b(ob1 ob1Var) {
        Context contextA = i90.a();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new BufferedOutputStream(contextA.openFileOutput("AppEventsLogger.persistedevents", 0)));
            try {
                objectOutputStream.writeObject(ob1Var);
                Unit unit = Unit.a;
                objectOutputStream.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    nj2.q(objectOutputStream, th);
                    throw th2;
                }
            }
        } catch (IOException e) {
            Log.w("ba", "Got unexpected exception while persisting events: ", e);
            try {
                contextA.getFileStreamPath("AppEventsLogger.persistedevents").delete();
            } catch (Exception unused) {
            }
        }
    }
}
