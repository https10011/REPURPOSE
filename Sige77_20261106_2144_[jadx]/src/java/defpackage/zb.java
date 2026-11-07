package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class zb implements e51 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public zb(Context context, u10 u10Var) {
        this.a = 1;
        this.b = context.getApplicationContext();
        this.c = u10Var;
    }

    @Override // defpackage.e51
    public final boolean a(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Uri uri = (Uri) obj;
                return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
            case 1:
                return true;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                ArrayList arrayList = (ArrayList) obj2;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj3 = arrayList.get(i2);
                    i2++;
                    if (((e51) obj3).a(obj)) {
                        return true;
                    }
                }
                return false;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                return true;
            default:
                Uri uri2 = (Uri) obj;
                return "android.resource".equals(uri2.getScheme()) && ((Context) obj2).getPackageName().equals(uri2.getAuthority());
        }
    }

    @Override // defpackage.e51
    public final d51 b(Object obj, int i, int i2, da1 da1Var) {
        ta0 ta0Var;
        d51 d51VarB;
        Uri uri;
        int i3 = this.a;
        d51 d51VarB2 = null;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (i3) {
            case 0:
                Uri uri2 = (Uri) obj;
                String strSubstring = uri2.toString().substring(22);
                y71 y71Var = new y71(uri2);
                AssetManager assetManager = (AssetManager) obj2;
                switch (((yb) obj3).a) {
                    case 0:
                        ta0Var = new ta0(assetManager, strSubstring, 0);
                        break;
                    default:
                        ta0Var = new ta0(assetManager, strSubstring, 1);
                        break;
                }
                return new d51(y71Var, ta0Var);
            case 1:
                Integer num = (Integer) obj;
                Resources.Theme theme = (Resources.Theme) da1Var.c(ui1.b);
                return new d51(new y71(num), new v10(theme, theme != null ? theme.getResources() : ((Context) obj2).getResources(), (u10) obj3, num.intValue()));
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                ArrayList arrayList = (ArrayList) obj2;
                int size = arrayList.size();
                ArrayList arrayList2 = new ArrayList(size);
                hv0 hv0Var = null;
                for (int i4 = 0; i4 < size; i4++) {
                    e51 e51Var = (e51) arrayList.get(i4);
                    if (e51Var.a(obj) && (d51VarB = e51Var.b(obj, i, i2, da1Var)) != null) {
                        hv0Var = d51VarB.a;
                        arrayList2.add(d51VarB.c);
                    }
                }
                if (arrayList2.isEmpty() || hv0Var == null) {
                    return null;
                }
                return new d51(hv0Var, new v51(arrayList2, (yb1) obj3));
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                Integer num2 = (Integer) obj;
                try {
                    uri = Uri.parse("android.resource://" + ((Resources) obj3).getResourcePackageName(num2.intValue()) + '/' + num2);
                    break;
                } catch (Resources.NotFoundException e) {
                    if (Log.isLoggable("ResourceLoader", 5)) {
                        Log.w("ResourceLoader", "Received invalid resource id: " + num2, e);
                    }
                    uri = null;
                }
                if (uri == null) {
                    return null;
                }
                return ((e51) obj2).b(uri, i, i2, da1Var);
            default:
                Uri uri3 = (Uri) obj;
                e51 e51Var2 = (e51) obj3;
                List<String> pathSegments = uri3.getPathSegments();
                if (pathSegments.size() == 1) {
                    try {
                        int i5 = Integer.parseInt(uri3.getPathSegments().get(0));
                        if (i5 != 0) {
                            d51VarB2 = e51Var2.b(Integer.valueOf(i5), i, i2, da1Var);
                        } else if (Log.isLoggable("ResourceUriLoader", 5)) {
                            Log.w("ResourceUriLoader", "Failed to parse a valid non-0 resource id from: " + uri3);
                        }
                        return d51VarB2;
                    } catch (NumberFormatException e2) {
                        if (!Log.isLoggable("ResourceUriLoader", 5)) {
                            return d51VarB2;
                        }
                        Log.w("ResourceUriLoader", "Failed to parse resource id from: " + uri3, e2);
                        return d51VarB2;
                    }
                }
                if (pathSegments.size() != 2) {
                    if (!Log.isLoggable("ResourceUriLoader", 5)) {
                        return null;
                    }
                    Log.w("ResourceUriLoader", "Failed to parse resource uri: " + uri3);
                    return null;
                }
                List<String> pathSegments2 = uri3.getPathSegments();
                Context context = (Context) obj2;
                int identifier = context.getResources().getIdentifier(pathSegments2.get(1), pathSegments2.get(0), context.getPackageName());
                if (identifier != 0) {
                    return e51Var2.b(Integer.valueOf(identifier), i, i2, da1Var);
                }
                if (!Log.isLoggable("ResourceUriLoader", 5)) {
                    return null;
                }
                Log.w("ResourceUriLoader", "Failed to find resource id for: " + uri3);
                return null;
        }
    }

    public String toString() {
        switch (this.a) {
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return "MultiModelLoader{modelLoaders=" + Arrays.toString(((ArrayList) this.b).toArray()) + '}';
            default:
                return super.toString();
        }
    }

    public zb(Resources resources, e51 e51Var) {
        this.a = 3;
        this.c = resources;
        this.b = e51Var;
    }

    public /* synthetic */ zb(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public zb(Context context, e51 e51Var) {
        this.a = 4;
        this.b = context.getApplicationContext();
        this.c = e51Var;
    }
}
