package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class fe1 implements lw {
    public static final String[] X = {"_data"};
    public volatile lw W;
    public final Context a;
    public final e51 b;
    public final e51 c;
    public final Uri d;
    public final int e;
    public final int f;
    public final da1 i;
    public final Class v;
    public volatile boolean w;

    public fe1(Context context, e51 e51Var, e51 e51Var2, Uri uri, int i, int i2, da1 da1Var, Class cls) {
        this.a = context.getApplicationContext();
        this.b = e51Var;
        this.c = e51Var2;
        this.d = uri;
        this.e = i;
        this.f = i2;
        this.i = da1Var;
        this.v = cls;
    }

    @Override // defpackage.lw
    public final Class a() {
        return this.v;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:17)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:14)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:101)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:21)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.a(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at pw0.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:44)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:32)
     */
    public final lw b() throws Throwable {
        d51 d51VarB;
        Throwable th;
        boolean zIsExternalStorageLegacy = Environment.isExternalStorageLegacy();
        Cursor cursor = null;
        Context context = this.a;
        da1 da1Var = this.i;
        int i = this.f;
        int i2 = this.e;
        if (zIsExternalStorageLegacy) {
            Uri uri = this.d;
            try {
                Cursor cursorQuery = context.getContentResolver().query(uri, X, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                            if (TextUtils.isEmpty(string)) {
                                throw new FileNotFoundException("File path was empty in media store for: " + uri);
                            }
                            File file = new File(string);
                            cursorQuery.close();
                            d51VarB = this.b.b(file, i2, i, da1Var);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = cursorQuery;
                        if (cursor == null) {
                            throw th;
                        }
                        cursor.close();
                        throw th;
                    }
                }
                throw new FileNotFoundException("Failed to media store entry for: " + uri);
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            int i3 = Build.VERSION.SDK_INT;
            e51 e51Var = this.c;
            Uri requireOriginal = this.d;
            if (i3 >= 30) {
                d51VarB = e51Var.b(requireOriginal, i2, i, da1Var);
            } else {
                if (aj0.w(requireOriginal)) {
                    Iterator<String> it = requireOriginal.getPathSegments().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            String next = it.next();
                            if (next != null && next.startsWith("picker")) {
                                d51VarB = e51Var.b(requireOriginal, i2, i, da1Var);
                            }
                        }
                    }
                }
                if (context.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
                    requireOriginal = MediaStore.setRequireOriginal(requireOriginal);
                }
                d51VarB = e51Var.b(requireOriginal, i2, i, da1Var);
            }
        }
        if (d51VarB != null) {
            return d51VarB.c;
        }
        return null;
    }

    @Override // defpackage.lw
    public final void cancel() {
        this.w = true;
        lw lwVar = this.W;
        if (lwVar != null) {
            lwVar.cancel();
        }
    }

    @Override // defpackage.lw
    public final void h() {
        lw lwVar = this.W;
        if (lwVar != null) {
            lwVar.h();
        }
    }

    @Override // defpackage.lw
    public final void i(vc1 vc1Var, kw kwVar) throws Throwable {
        try {
            lw lwVarB = b();
            if (lwVarB == null) {
                kwVar.b(new IllegalArgumentException("Failed to build fetcher for: " + this.d));
            } else {
                this.W = lwVarB;
                if (this.w) {
                    cancel();
                } else {
                    lwVarB.i(vc1Var, kwVar);
                }
            }
        } catch (FileNotFoundException e) {
            kwVar.b(e);
        }
    }

    @Override // defpackage.lw
    public final int j() {
        return 1;
    }
}
