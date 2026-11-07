package defpackage;

import java.io.File;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class jb0 extends ib0 {
    public boolean b;
    public File[] c;
    public int d;
    public boolean e;
    public final /* synthetic */ mb0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jb0(mb0 mb0Var, File file) {
        super(file);
        file.getClass();
        this.f = mb0Var;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0057  */
    /* JADX WARN: Code duplicated, block: B:27:0x005a  */
    /* JADX WARN: Code duplicated, block: B:29:0x005e  */
    @Override // defpackage.nb0
    public final File a() {
        File[] fileArr;
        Function1 function1;
        ob0 ob0Var = this.f.d;
        boolean z = this.e;
        File file = this.a;
        if (z || this.c != null) {
            fileArr = this.c;
            if (fileArr == null && this.d < fileArr.length) {
                fileArr.getClass();
                int i = this.d;
                this.d = i + 1;
                return fileArr[i];
            }
            if (!this.b) {
                this.b = true;
                return file;
            }
            function1 = ob0Var.d;
            if (function1 != null) {
                function1.invoke(file);
            }
        } else {
            Function1 function2 = ob0Var.c;
            if (function2 == null || ((Boolean) function2.invoke(file)).booleanValue()) {
                File[] fileArrListFiles = file.listFiles();
                this.c = fileArrListFiles;
                if (fileArrListFiles == null) {
                    Function2 function3 = ob0Var.e;
                    if (function3 != null) {
                        File file2 = this.a;
                        function3.invoke(file2, new u1(file2, null, "Cannot list files in a directory", 2, null));
                    }
                    this.e = true;
                }
                fileArr = this.c;
                if (fileArr == null) {
                }
                if (!this.b) {
                    this.b = true;
                    return file;
                }
                function1 = ob0Var.d;
                if (function1 != null) {
                    function1.invoke(file);
                }
            }
        }
        return null;
    }
}
