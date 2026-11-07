package defpackage;

import java.io.File;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class lb0 extends ib0 {
    public boolean b;
    public File[] c;
    public int d;
    public final /* synthetic */ mb0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lb0(mb0 mb0Var, File file) {
        super(file);
        file.getClass();
        this.e = mb0Var;
    }

    @Override // defpackage.nb0
    public final File a() {
        Function2 function2;
        ob0 ob0Var = this.e.d;
        boolean z = this.b;
        File file = this.a;
        if (z) {
            File[] fileArr = this.c;
            if (fileArr == null || this.d < fileArr.length) {
                if (fileArr == null) {
                    File[] fileArrListFiles = file.listFiles();
                    this.c = fileArrListFiles;
                    if (fileArrListFiles == null && (function2 = ob0Var.e) != null) {
                        File file2 = this.a;
                        function2.invoke(file2, new u1(file2, null, "Cannot list files in a directory", 2, null));
                    }
                    File[] fileArr2 = this.c;
                    if (fileArr2 == null || fileArr2.length == 0) {
                        Function1 function1 = ob0Var.d;
                        if (function1 != null) {
                            function1.invoke(file);
                        }
                    }
                }
                File[] fileArr3 = this.c;
                fileArr3.getClass();
                int i = this.d;
                this.d = i + 1;
                return fileArr3[i];
            }
            Function1 function3 = ob0Var.d;
            if (function3 != null) {
                function3.invoke(file);
                return null;
            }
        } else {
            Function1 function4 = ob0Var.c;
            if (function4 == null || ((Boolean) function4.invoke(file)).booleanValue()) {
                this.b = true;
                return file;
            }
        }
        return null;
    }
}
