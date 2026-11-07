package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.hjq.toast.BuildConfig;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ph3 implements xi3 {
    public final Context a;
    public String d;
    public final Object c = new Object();
    public final vh3 b = new vh3();

    public ph3(aa3 aa3Var) {
        this.a = aa3Var.a;
    }

    @Override // defpackage.xi3
    public final ei3 a(Uri uri) throws yh3, tn {
        if (h(uri)) {
            throw new yh3("Android backend cannot perform remote operations without a remote backend");
        }
        File fileL = bj0.L(g(uri));
        return new ei3(new FileInputStream(fileL), fileL);
    }

    @Override // defpackage.xi3
    public final boolean b(Uri uri) throws yh3 {
        if (h(uri)) {
            throw new yh3("Android backend cannot perform remote operations without a remote backend");
        }
        return bj0.L(g(uri)).exists();
    }

    @Override // defpackage.xi3
    public final OutputStream c(Uri uri) {
        return this.b.c(g(uri));
    }

    @Override // defpackage.xi3
    public final void d(Uri uri) throws IOException {
        this.b.d(g(uri));
    }

    @Override // defpackage.xi3
    public final void e(Uri uri, Uri uri2) throws IOException {
        this.b.e(g(uri), g(uri2));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:53:0x010f  */
    /* JADX WARN: Code duplicated, block: B:57:0x0116 A[Catch: all -> 0x0129, TryCatch #0 {all -> 0x0129, blocks: (B:55:0x0112, B:57:0x0116, B:60:0x012b, B:61:0x012d), top: B:80:0x0112 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0139  */
    /* JADX WARN: Code duplicated, block: B:80:0x0112 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.xi3
    public final File f(Uri uri) throws IOException {
        File externalFilesDir;
        Account account;
        File file;
        String str;
        if (h(uri)) {
            uq1.o("operation is not permitted in other authorities.");
            return null;
        }
        Context context = this.a;
        if (!uri.getScheme().equals("android")) {
            throw new tn("Scheme must be 'android'");
        }
        if (uri.getPathSegments().isEmpty()) {
            throw new tn(String.format("Path must start with a valid logical location: %s", uri));
        }
        if (!TextUtils.isEmpty(uri.getQuery())) {
            throw new tn("Did not expect uri to have query");
        }
        ArrayList arrayList = new ArrayList(uri.getPathSegments());
        String str2 = (String) arrayList.get(0);
        switch (str2.hashCode()) {
            case -1820761141:
                if (str2.equals("external")) {
                    externalFilesDir = context.getExternalFilesDir(null);
                    file = new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                    if (!g93.S(context)) {
                        synchronized (this.c) {
                            try {
                                if (this.d == null) {
                                    this.d = aj0.U(context.createDeviceProtectedStorageContext()).getParentFile().getAbsolutePath();
                                }
                                str = this.d;
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                        if (!file.getAbsolutePath().startsWith(str)) {
                            throw new yh3("Cannot access credential-protected data from direct boot");
                        }
                    }
                    return file;
                }
                throw new tn(String.format("Path must start with a valid logical location: %s", uri));
            case 94416770:
                if (str2.equals("cache")) {
                    externalFilesDir = context.getCacheDir();
                    file = new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                    if (!g93.S(context)) {
                        synchronized (this.c) {
                            if (this.d == null) {
                                this.d = aj0.U(context.createDeviceProtectedStorageContext()).getParentFile().getAbsolutePath();
                            }
                            str = this.d;
                            if (!file.getAbsolutePath().startsWith(str)) {
                                throw new yh3("Cannot access credential-protected data from direct boot");
                            }
                        }
                    }
                    return file;
                }
                throw new tn(String.format("Path must start with a valid logical location: %s", uri));
            case 97434231:
                if (str2.equals("files")) {
                    externalFilesDir = aj0.U(context);
                    file = new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                    if (!g93.S(context)) {
                        synchronized (this.c) {
                            if (this.d == null) {
                                this.d = aj0.U(context.createDeviceProtectedStorageContext()).getParentFile().getAbsolutePath();
                            }
                            str = this.d;
                            if (!file.getAbsolutePath().startsWith(str)) {
                                throw new yh3("Cannot access credential-protected data from direct boot");
                            }
                        }
                    }
                    return file;
                }
                throw new tn(String.format("Path must start with a valid logical location: %s", uri));
            case 835260319:
                if (str2.equals("managed")) {
                    File file2 = new File(aj0.U(context), "managed");
                    if (arrayList.size() >= 3) {
                        try {
                            String str3 = (String) arrayList.get(2);
                            Account account2 = oh3.a;
                            if ("shared".equals(str3)) {
                                account = oh3.a;
                            } else {
                                int iIndexOf = str3.indexOf(58);
                                sp0.M(iIndexOf >= 0, "Malformed account", new Object[0]);
                                account = new Account(str3.substring(iIndexOf + 1), str3.substring(0, iIndexOf));
                            }
                            if (!oh3.a.equals(account)) {
                                throw new tn("AccountManager cannot be null");
                            }
                        } catch (IllegalArgumentException e) {
                            throw new tn(e);
                        }
                    }
                    externalFilesDir = file2;
                    file = new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                    if (!g93.S(context)) {
                        synchronized (this.c) {
                            if (this.d == null) {
                                this.d = aj0.U(context.createDeviceProtectedStorageContext()).getParentFile().getAbsolutePath();
                            }
                            str = this.d;
                            if (!file.getAbsolutePath().startsWith(str)) {
                                throw new yh3("Cannot access credential-protected data from direct boot");
                            }
                        }
                    }
                    return file;
                }
                throw new tn(String.format("Path must start with a valid logical location: %s", uri));
            case 988548496:
                if (str2.equals("directboot-cache")) {
                    externalFilesDir = context.createDeviceProtectedStorageContext().getCacheDir();
                    file = new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                    if (!g93.S(context)) {
                        synchronized (this.c) {
                            if (this.d == null) {
                                this.d = aj0.U(context.createDeviceProtectedStorageContext()).getParentFile().getAbsolutePath();
                            }
                            str = this.d;
                            if (!file.getAbsolutePath().startsWith(str)) {
                                throw new yh3("Cannot access credential-protected data from direct boot");
                            }
                        }
                    }
                    return file;
                }
                throw new tn(String.format("Path must start with a valid logical location: %s", uri));
            case 991565957:
                if (str2.equals("directboot-files")) {
                    externalFilesDir = context.createDeviceProtectedStorageContext().getFilesDir();
                    file = new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                    if (!g93.S(context)) {
                        synchronized (this.c) {
                            if (this.d == null) {
                                this.d = aj0.U(context.createDeviceProtectedStorageContext()).getParentFile().getAbsolutePath();
                            }
                            str = this.d;
                            if (!file.getAbsolutePath().startsWith(str)) {
                                throw new yh3("Cannot access credential-protected data from direct boot");
                            }
                        }
                    }
                    return file;
                }
                throw new tn(String.format("Path must start with a valid logical location: %s", uri));
            default:
                throw new tn(String.format("Path must start with a valid logical location: %s", uri));
        }
    }

    public final Uri g(Uri uri) throws IOException {
        if (h(uri)) {
            throw new tn("Operation across authorities is not allowed.");
        }
        File fileF = f(uri);
        Uri.Builder builderPath = new Uri.Builder().scheme("file").authority(BuildConfig.FLAVOR).path("/");
        no0 no0Var = ro0.b;
        gu2.k(4, "initialCapacity");
        builderPath.path(fileF.getAbsolutePath());
        return builderPath.encodedFragment(mi3.a(ro0.h(0, new Object[4]))).build();
    }

    public final boolean h(Uri uri) {
        return (TextUtils.isEmpty(uri.getAuthority()) || this.a.getPackageName().equals(uri.getAuthority())) ? false : true;
    }

    @Override // defpackage.xi3
    public final String zzc() {
        return "android";
    }
}
