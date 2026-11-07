package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.os.Trace;
import android.util.Log;
import androidx.lifecycle.a;
import androidx.savedstate.Recreator;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class ir1 implements ij0 {
    public static volatile ir1 e;
    public static final ir1 f = new ir1(true, (String) null, (Exception) null);
    public final /* synthetic */ int a;
    public boolean b;
    public final Object c;
    public final Object d;

    public ir1(int i) {
        this.a = i;
        switch (i) {
            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                this.c = new ArrayList();
                this.d = new HashMap();
                this.b = false;
                break;
            default:
                this.c = Collections.newSetFromMap(new WeakHashMap());
                this.d = new HashSet();
                break;
        }
    }

    public static String a(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (!Modifier.isAbstract(modifiers)) {
            return null;
        }
        return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("r8-abstract-class");
    }

    public static ir1 d(Context context) {
        if (e == null) {
            synchronized (ir1.class) {
                try {
                    if (e == null) {
                        e = new ir1(context.getApplicationContext());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return e;
    }

    public static ir1 j(String str) {
        return new ir1(false, str, (Exception) null);
    }

    public static ir1 k(String str, Exception exc) {
        return new ir1(false, str, exc);
    }

    public boolean b(xh1 xh1Var) {
        boolean z = true;
        if (xh1Var == null) {
            return true;
        }
        boolean zRemove = ((Set) this.c).remove(xh1Var);
        if (!((HashSet) this.d).remove(xh1Var) && !zRemove) {
            z = false;
        }
        if (z) {
            xh1Var.clear();
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0107  */
    /* JADX WARN: Code duplicated, block: B:58:0x010f  */
    /* JADX WARN: Code duplicated, block: B:59:0x0115  */
    /* JADX WARN: Code duplicated, block: B:61:0x011d  */
    /* JADX WARN: Code duplicated, block: B:62:0x0123  */
    /* JADX WARN: Code duplicated, block: B:64:0x012b  */
    /* JADX WARN: Code duplicated, block: B:65:0x0133  */
    /* JADX WARN: Code duplicated, block: B:67:0x013b  */
    public v71 c(s12 s12Var, boolean z) {
        v71 v71Var;
        String str;
        v71 nz2Var;
        final Type type = s12Var.b;
        Class cls = s12Var.a;
        Map map = (Map) this.c;
        v71 eVar = null;
        if (map.get(type) != null) {
            ur.a();
            return null;
        }
        if (map.get(cls) != null) {
            ur.a();
            return null;
        }
        final int i = 1;
        final int i2 = 0;
        if (EnumSet.class.isAssignableFrom(cls)) {
            v71Var = new v71() { // from class: tr
                @Override // defpackage.v71
                public final Object e() {
                    int i3 = i2;
                    Type type2 = type;
                    switch (i3) {
                        case 0:
                            if (!(type2 instanceof ParameterizedType)) {
                                throw new wt0("Invalid EnumSet type: " + type2, 4);
                            }
                            Type type3 = ((ParameterizedType) type2).getActualTypeArguments()[0];
                            if (type3 instanceof Class) {
                                return EnumSet.noneOf((Class) type3);
                            }
                            throw new wt0("Invalid EnumSet type: " + type2, 4);
                        default:
                            if (!(type2 instanceof ParameterizedType)) {
                                throw new wt0("Invalid EnumMap type: " + type2, 4);
                            }
                            Type type4 = ((ParameterizedType) type2).getActualTypeArguments()[0];
                            if (type4 instanceof Class) {
                                return new EnumMap((Class) type4);
                            }
                            throw new wt0("Invalid EnumMap type: " + type2, 4);
                    }
                }
            };
        } else {
            v71Var = cls == EnumMap.class ? new v71() { // from class: tr
                @Override // defpackage.v71
                public final Object e() {
                    int i3 = i;
                    Type type2 = type;
                    switch (i3) {
                        case 0:
                            if (!(type2 instanceof ParameterizedType)) {
                                throw new wt0("Invalid EnumSet type: " + type2, 4);
                            }
                            Type type3 = ((ParameterizedType) type2).getActualTypeArguments()[0];
                            if (type3 instanceof Class) {
                                return EnumSet.noneOf((Class) type3);
                            }
                            throw new wt0("Invalid EnumSet type: " + type2, 4);
                        default:
                            if (!(type2 instanceof ParameterizedType)) {
                                throw new wt0("Invalid EnumMap type: " + type2, 4);
                            }
                            Type type4 = ((ParameterizedType) type2).getActualTypeArguments()[0];
                            if (type4 instanceof Class) {
                                return new EnumMap((Class) type4);
                            }
                            throw new wt0("Invalid EnumMap type: " + type2, 4);
                    }
                }
            } : null;
        }
        if (v71Var != null) {
            return v71Var;
        }
        ia.e((List) this.d);
        int i3 = 2;
        if (Modifier.isAbstract(cls.getModifiers())) {
            nz2Var = null;
        } else {
            try {
                Constructor declaredConstructor = cls.getDeclaredConstructor(null);
                ta taVar = rg1.a;
                try {
                    declaredConstructor.setAccessible(true);
                    str = null;
                } catch (Exception e2) {
                    str = "Failed making constructor '" + rg1.b(declaredConstructor) + "' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: " + e2.getMessage() + rg1.e(e2);
                }
                nz2Var = str != null ? new nz2(str, i3) : new ab(declaredConstructor, 4);
            } catch (NoSuchMethodException unused) {
                nz2Var = null;
            }
        }
        if (nz2Var != null) {
            return nz2Var;
        }
        if (Collection.class.isAssignableFrom(cls)) {
            if (cls.isAssignableFrom(ArrayList.class)) {
                eVar = new e(23);
            } else if (cls.isAssignableFrom(LinkedHashSet.class)) {
                eVar = new e(26);
            } else if (cls.isAssignableFrom(TreeSet.class)) {
                eVar = new e(27);
            } else if (cls.isAssignableFrom(ArrayDeque.class)) {
                eVar = new e(28);
            }
        } else if (Map.class.isAssignableFrom(cls)) {
            if (cls.isAssignableFrom(fy0.class)) {
                if (type instanceof ParameterizedType) {
                    Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
                    if (actualTypeArguments.length == 0 || am2.y(actualTypeArguments[0]) != String.class) {
                        if (cls.isAssignableFrom(LinkedHashMap.class)) {
                            eVar = new ur(i2);
                        } else if (cls.isAssignableFrom(TreeMap.class)) {
                            eVar = new ur(i);
                        } else if (cls.isAssignableFrom(ConcurrentHashMap.class)) {
                            eVar = new e(24);
                        } else if (cls.isAssignableFrom(ConcurrentSkipListMap.class)) {
                            eVar = new e(25);
                        }
                    }
                }
                eVar = new e(29);
            } else if (cls.isAssignableFrom(LinkedHashMap.class)) {
                eVar = new ur(i2);
            } else if (cls.isAssignableFrom(TreeMap.class)) {
                eVar = new ur(i);
            } else if (cls.isAssignableFrom(ConcurrentHashMap.class)) {
                eVar = new e(24);
            } else if (cls.isAssignableFrom(ConcurrentSkipListMap.class)) {
                eVar = new e(25);
            }
        }
        if (eVar != null) {
            return eVar;
        }
        String strA = a(cls);
        if (strA != null) {
            return new nz2(strA, i3);
        }
        if (!z) {
            return new nz2("Unable to create instance of " + cls + "; Register an InstanceCreator or a TypeAdapter for this type.", i3);
        }
        if (this.b) {
            return new ab(cls, 5);
        }
        String strConcat = "Unable to create instance of " + cls + "; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem.";
        if (cls.getDeclaredConstructors().length == 0) {
            strConcat = strConcat.concat(" Or adjust your R8 configuration to keep the no-args constructor of the class.");
        }
        return new nz2(strConcat, i3);
    }

    public void e() {
        if (this.b || ((HashSet) this.d).isEmpty()) {
            return;
        }
        hc hcVar = (hc) this.c;
        bk0 bk0Var = (bk0) hcVar.c;
        boolean z = false;
        hcVar.a = ((ConnectivityManager) bk0Var.get()).getActiveNetwork() != null;
        try {
            ((ConnectivityManager) bk0Var.get()).registerDefaultNetworkCallback((hr1) hcVar.d);
            z = true;
        } catch (RuntimeException e2) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to register callback", e2);
            }
        }
        this.b = z;
    }

    public void f() {
        vl1 vl1Var = (vl1) this.c;
        a lifecycle = vl1Var.getLifecycle();
        if (lifecycle.c != lw0.b) {
            uq1.q("Restarter must be created only during owner's initialization stage");
            return;
        }
        lifecycle.a(new Recreator(vl1Var));
        final ul1 ul1Var = (ul1) this.d;
        ul1Var.getClass();
        if (ul1Var.b) {
            uq1.q("SavedStateRegistry was already attached.");
            return;
        }
        lifecycle.a(new sw0() { // from class: rl1
            @Override // defpackage.sw0
            public final void a(ww0 ww0Var, kw0 kw0Var) {
                ul1 ul1Var2 = ul1Var;
                ul1Var2.getClass();
                if (kw0Var == kw0.ON_START) {
                    ul1Var2.f = true;
                } else if (kw0Var == kw0.ON_STOP) {
                    ul1Var2.f = false;
                }
            }
        });
        ul1Var.b = true;
        this.b = true;
    }

    public void g(Bundle bundle) {
        if (!this.b) {
            f();
        }
        a lifecycle = ((vl1) this.c).getLifecycle();
        if (lifecycle.c.compareTo(lw0.d) >= 0) {
            sm0.w(lifecycle.c, "performRestore cannot be called when owner is ");
            return;
        }
        ul1 ul1Var = (ul1) this.d;
        if (!ul1Var.b) {
            uq1.q("You must call performAttach() before calling performRestore(Bundle).");
        } else if (ul1Var.d) {
            uq1.q("SavedStateRegistry was already restored.");
        } else {
            ul1Var.c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
            ul1Var.d = true;
        }
    }

    @Override // defpackage.ij0
    public Object get() {
        if (this.b) {
            uq1.q("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
            return null;
        }
        rq0.n("Glide registry");
        this.b = true;
        try {
            return jw.f((com.bumptech.glide.a) this.c, (ArrayList) this.d);
        } finally {
            this.b = false;
            Trace.endSection();
        }
    }

    public void h(Bundle bundle) {
        bundle.getClass();
        ul1 ul1Var = (ul1) this.d;
        ul1Var.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = ul1Var.c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        kl1 kl1Var = ul1Var.a;
        kl1Var.getClass();
        il1 il1Var = new il1(kl1Var);
        kl1Var.c.put(il1Var, Boolean.FALSE);
        while (il1Var.hasNext()) {
            Map.Entry entry = (Map.Entry) il1Var.next();
            bundle2.putBundle((String) entry.getKey(), ((tl1) entry.getValue()).a());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    public String i() {
        return (String) this.c;
    }

    public String toString() {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                return ((Map) obj).toString();
            case oc1.LONG_FIELD_NUMBER /* 4 */:
            default:
                return super.toString();
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                return super.toString() + "{numRequests=" + ((Set) obj).size() + ", isPaused=" + this.b + "}";
        }
    }

    public ir1(boolean z, String str, Exception exc) {
        this.a = 1;
        this.b = z;
        this.c = str;
        this.d = exc;
    }

    public ir1(vl1 vl1Var) {
        this.a = 6;
        this.c = vl1Var;
        this.d = new ul1();
    }

    public ir1(Map map, boolean z, List list) {
        this.a = 3;
        this.c = map;
        this.b = z;
        this.d = list;
    }

    public ir1(Context context) {
        this.a = 0;
        this.d = new HashSet();
        this.c = new hc(new bk0(new na1(context, 1)), new fr1(this));
    }

    public ir1(Intent intent, String str, boolean z) {
        this.a = 2;
        this.c = intent;
        this.d = str;
        this.b = z;
    }

    public ir1(com.bumptech.glide.a aVar, ArrayList arrayList, g93 g93Var) {
        this.a = 4;
        this.c = aVar;
        this.d = arrayList;
    }
}
