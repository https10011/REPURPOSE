package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.net.URI;
import java.util.Map;
import kotlin.Unit;
import okhttp3.Call;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Response;
import okhttp3.internal._HeadersCommonKt;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class dp1 {
    /* JADX WARN: Code duplicated, block: B:386:0x0902 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:387:0x0904  */
    /* JADX WARN: Code duplicated, block: B:588:0x091b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:595:0x0906 A[SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
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
    public static rm0 a(yj1 yj1Var, Method method) {
        Type genericReturnType;
        boolean z;
        boolean z2;
        boolean z3;
        rq0 rq0Var;
        int i;
        rq0[] rq0VarArr;
        int i2;
        int i3;
        rq0 ta1Var;
        rq0 ya1Var;
        ta1 ta1Var2;
        ei1 ei1Var = new ei1(yj1Var, method);
        Annotation[] annotationArr = ei1Var.c;
        int length = annotationArr.length;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            String str = "HEAD";
            boolean z4 = true;
            rq0 rq0Var2 = null;
            if (i5 >= length) {
                if (ei1Var.n == null) {
                    throw ta.s(method, null, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
                }
                if (!ei1Var.o) {
                    if (ei1Var.q) {
                        throw ta.s(method, null, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                    if (ei1Var.p) {
                        throw ta.s(method, null, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                }
                Annotation[][] annotationArr2 = ei1Var.d;
                int length2 = annotationArr2.length;
                ei1Var.v = new rq0[length2];
                int i6 = length2 - 1;
                int i7 = 0;
                while (i7 < length2) {
                    rq0[] rq0VarArr2 = ei1Var.v;
                    Type type = ei1Var.e[i7];
                    Annotation[] annotationArr3 = annotationArr2[i7];
                    int i8 = i7 == i6 ? 1 : i4;
                    if (annotationArr3 != null) {
                        int length3 = annotationArr3.length;
                        rq0Var = rq0Var2;
                        int i9 = i4;
                        while (i9 < length3) {
                            Annotation annotation = annotationArr3[i9];
                            Annotation[][] annotationArr4 = annotationArr2;
                            rq0 cb1Var = bb1.W;
                            int i10 = length2;
                            int i11 = i6;
                            if (annotation instanceof r32) {
                                ei1Var.c(i7, type);
                                if (ei1Var.m) {
                                    throw ta.v(method, i7, "Multiple @Url method annotations found.", new Object[0]);
                                }
                                if (ei1Var.i) {
                                    throw ta.v(method, i7, "@Path parameters may not be used with @Url.", new Object[0]);
                                }
                                if (ei1Var.j) {
                                    throw ta.v(method, i7, "A @Url parameter must not come after a @Query.", new Object[0]);
                                }
                                if (ei1Var.k) {
                                    throw ta.v(method, i7, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                                }
                                if (ei1Var.l) {
                                    throw ta.v(method, i7, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                                }
                                if (ei1Var.r != null) {
                                    throw ta.v(method, i7, "@Url cannot be used with @%s URL", ei1Var.n);
                                }
                                ei1Var.m = true;
                                if (type != HttpUrl.class && type != String.class && type != URI.class && (!(type instanceof Class) || !"android.net.Uri".equals(((Class) type).getName()))) {
                                    throw ta.v(method, i7, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
                                }
                                ta1Var = new xa1(method, i7, 1);
                                i = i9;
                            } else {
                                i = i9;
                                boolean z5 = annotation instanceof ib1;
                                yj1 yj1Var2 = ei1Var.a;
                                if (z5) {
                                    ei1Var.c(i7, type);
                                    if (ei1Var.j) {
                                        throw ta.v(method, i7, "A @Path parameter must not come after a @Query.", new Object[0]);
                                    }
                                    if (ei1Var.k) {
                                        throw ta.v(method, i7, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                                    }
                                    if (ei1Var.l) {
                                        throw ta.v(method, i7, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                                    }
                                    if (ei1Var.m) {
                                        throw ta.v(method, i7, "@Path parameters may not be used with @Url.", new Object[0]);
                                    }
                                    if (ei1Var.r == null) {
                                        throw ta.v(method, i7, "@Path can only be used with relative url on @%s", ei1Var.n);
                                    }
                                    ei1Var.i = true;
                                    ib1 ib1Var = (ib1) annotation;
                                    String strValue = ib1Var.value();
                                    if (!ei1.y.matcher(strValue).matches()) {
                                        throw ta.v(method, i7, "@Path parameter name must match %s. Found: %s", ei1.x.pattern(), strValue);
                                    }
                                    if (!ei1Var.u.contains(strValue)) {
                                        throw ta.v(method, i7, "URL \"%s\" does not contain \"{%s}\".", ei1Var.r, strValue);
                                    }
                                    yj1Var2.e(type, annotationArr3);
                                    ta1Var = new za1(ei1Var.b, i7, strValue, ib1Var.encoded());
                                } else {
                                    rq0VarArr = rq0VarArr2;
                                    i2 = i8;
                                    if (annotation instanceof ke1) {
                                        ei1Var.c(i7, type);
                                        ke1 ke1Var = (ke1) annotation;
                                        String strValue2 = ke1Var.value();
                                        boolean zEncoded = ke1Var.encoded();
                                        Class clsM = ta.m(type);
                                        i3 = length3;
                                        ei1Var.j = true;
                                        if (!Iterable.class.isAssignableFrom(clsM)) {
                                            if (clsM.isArray()) {
                                                yj1Var2.e(ei1.a(clsM.getComponentType()), annotationArr3);
                                                ta1Var2 = new ta1(new va1(2, strValue2, zEncoded), 1);
                                            } else {
                                                yj1Var2.e(type, annotationArr3);
                                                ta1Var = new va1(2, strValue2, zEncoded);
                                            }
                                            str = str;
                                        } else {
                                            if (!(type instanceof ParameterizedType)) {
                                                throw ta.v(method, i7, clsM.getSimpleName() + " must include generic type (e.g., " + clsM.getSimpleName() + "<String>)", new Object[0]);
                                            }
                                            yj1Var2.e(ta.l(0, (ParameterizedType) type), annotationArr3);
                                            ta1Var2 = new ta1(new va1(2, strValue2, zEncoded), 0);
                                        }
                                        ta1Var = ta1Var2;
                                        str = str;
                                    } else {
                                        i3 = length3;
                                        if (annotation instanceof me1) {
                                            ei1Var.c(i7, type);
                                            boolean zEncoded2 = ((me1) annotation).encoded();
                                            Class clsM2 = ta.m(type);
                                            ei1Var.k = true;
                                            if (!Iterable.class.isAssignableFrom(clsM2)) {
                                                if (clsM2.isArray()) {
                                                    yj1Var2.e(ei1.a(clsM2.getComponentType()), annotationArr3);
                                                    ta1Var2 = new ta1(new ab1(zEncoded2), 1);
                                                } else {
                                                    yj1Var2.e(type, annotationArr3);
                                                    ta1Var = new ab1(zEncoded2);
                                                }
                                                str = str;
                                            } else {
                                                if (!(type instanceof ParameterizedType)) {
                                                    throw ta.v(method, i7, clsM2.getSimpleName() + " must include generic type (e.g., " + clsM2.getSimpleName() + "<String>)", new Object[0]);
                                                }
                                                yj1Var2.e(ta.l(0, (ParameterizedType) type), annotationArr3);
                                                ta1Var2 = new ta1(new ab1(zEncoded2), 0);
                                            }
                                            ta1Var = ta1Var2;
                                            str = str;
                                        } else {
                                            str = str;
                                            if (annotation instanceof le1) {
                                                ei1Var.c(i7, type);
                                                Class clsM3 = ta.m(type);
                                                ei1Var.l = true;
                                                if (!Map.class.isAssignableFrom(clsM3)) {
                                                    throw ta.v(method, i7, "@QueryMap parameter type must be Map.", new Object[0]);
                                                }
                                                Type typeO = ta.o(type, clsM3);
                                                if (!(typeO instanceof ParameterizedType)) {
                                                    throw ta.v(method, i7, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                }
                                                ParameterizedType parameterizedType = (ParameterizedType) typeO;
                                                Type typeL = ta.l(0, parameterizedType);
                                                if (String.class != typeL) {
                                                    throw ta.v(method, i7, "@QueryMap keys must be of type String: " + typeL, new Object[0]);
                                                }
                                                yj1Var2.e(ta.l(1, parameterizedType), annotationArr3);
                                                cb1Var = new wa1(method, i7, ((le1) annotation).encoded(), 2);
                                            } else if (annotation instanceof pl0) {
                                                ei1Var.c(i7, type);
                                                pl0 pl0Var = (pl0) annotation;
                                                String strValue3 = pl0Var.value();
                                                Class clsM4 = ta.m(type);
                                                if (Iterable.class.isAssignableFrom(clsM4)) {
                                                    if (!(type instanceof ParameterizedType)) {
                                                        throw ta.v(method, i7, clsM4.getSimpleName() + " must include generic type (e.g., " + clsM4.getSimpleName() + "<String>)", new Object[0]);
                                                    }
                                                    yj1Var2.e(ta.l(0, (ParameterizedType) type), annotationArr3);
                                                    ta1Var = new ta1(new va1(1, strValue3, pl0Var.allowUnsafeNonAsciiValues()), 0);
                                                } else if (clsM4.isArray()) {
                                                    yj1Var2.e(ei1.a(clsM4.getComponentType()), annotationArr3);
                                                    ta1Var = new ta1(new va1(1, strValue3, pl0Var.allowUnsafeNonAsciiValues()), 1);
                                                } else {
                                                    yj1Var2.e(type, annotationArr3);
                                                    cb1Var = new va1(1, strValue3, pl0Var.allowUnsafeNonAsciiValues());
                                                }
                                            } else if (annotation instanceof rl0) {
                                                if (type == Headers.class) {
                                                    ta1Var = new xa1(method, i7, 0);
                                                } else {
                                                    ei1Var.c(i7, type);
                                                    Class clsM5 = ta.m(type);
                                                    if (!Map.class.isAssignableFrom(clsM5)) {
                                                        throw ta.v(method, i7, "@HeaderMap parameter type must be Map or Headers.", new Object[0]);
                                                    }
                                                    Type typeO2 = ta.o(type, clsM5);
                                                    if (!(typeO2 instanceof ParameterizedType)) {
                                                        throw ta.v(method, i7, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                    }
                                                    ParameterizedType parameterizedType2 = (ParameterizedType) typeO2;
                                                    Type typeL2 = ta.l(0, parameterizedType2);
                                                    if (String.class != typeL2) {
                                                        throw ta.v(method, i7, "@HeaderMap keys must be of type String: " + typeL2, new Object[0]);
                                                    }
                                                    yj1Var2.e(ta.l(1, parameterizedType2), annotationArr3);
                                                    ta1Var = new wa1(method, i7, ((rl0) annotation).allowUnsafeNonAsciiValues(), 1);
                                                }
                                            } else if (annotation instanceof na0) {
                                                ei1Var.c(i7, type);
                                                if (!ei1Var.p) {
                                                    throw ta.v(method, i7, "@Field parameters can only be used with form encoding.", new Object[0]);
                                                }
                                                na0 na0Var = (na0) annotation;
                                                String strValue4 = na0Var.value();
                                                boolean zEncoded3 = na0Var.encoded();
                                                ei1Var.f = true;
                                                Class clsM6 = ta.m(type);
                                                if (Iterable.class.isAssignableFrom(clsM6)) {
                                                    if (!(type instanceof ParameterizedType)) {
                                                        throw ta.v(method, i7, clsM6.getSimpleName() + " must include generic type (e.g., " + clsM6.getSimpleName() + "<String>)", new Object[0]);
                                                    }
                                                    yj1Var2.e(ta.l(0, (ParameterizedType) type), annotationArr3);
                                                    ta1Var = new ta1(new va1(0, strValue4, zEncoded3), 0);
                                                } else if (clsM6.isArray()) {
                                                    yj1Var2.e(ei1.a(clsM6.getComponentType()), annotationArr3);
                                                    ta1Var = new ta1(new va1(0, strValue4, zEncoded3), 1);
                                                } else {
                                                    yj1Var2.e(type, annotationArr3);
                                                    ya1Var = new va1(0, strValue4, zEncoded3);
                                                    ta1Var = ya1Var;
                                                }
                                            } else if (annotation instanceof pa0) {
                                                ei1Var.c(i7, type);
                                                if (!ei1Var.p) {
                                                    throw ta.v(method, i7, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                                                }
                                                Class clsM7 = ta.m(type);
                                                if (!Map.class.isAssignableFrom(clsM7)) {
                                                    throw ta.v(method, i7, "@FieldMap parameter type must be Map.", new Object[0]);
                                                }
                                                Type typeO3 = ta.o(type, clsM7);
                                                if (!(typeO3 instanceof ParameterizedType)) {
                                                    throw ta.v(method, i7, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                }
                                                ParameterizedType parameterizedType3 = (ParameterizedType) typeO3;
                                                int i12 = 0;
                                                Type typeL3 = ta.l(0, parameterizedType3);
                                                if (String.class != typeL3) {
                                                    throw ta.v(method, i7, "@FieldMap keys must be of type String: " + typeL3, new Object[0]);
                                                }
                                                yj1Var2.e(ta.l(1, parameterizedType3), annotationArr3);
                                                ei1Var.f = true;
                                                ta1Var = new wa1(method, i7, ((pa0) annotation).encoded(), i12);
                                            } else if (annotation instanceof fb1) {
                                                ei1Var.c(i7, type);
                                                if (!ei1Var.q) {
                                                    throw ta.v(method, i7, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                                                }
                                                fb1 fb1Var = (fb1) annotation;
                                                ei1Var.g = true;
                                                String strValue5 = fb1Var.value();
                                                Class clsM8 = ta.m(type);
                                                if (!strValue5.isEmpty()) {
                                                    String[] strArr = {"Content-Disposition", ts.k("form-data; name=\"", strValue5, "\""), "Content-Transfer-Encoding", fb1Var.encoding()};
                                                    Headers.b.getClass();
                                                    Headers headersA = Headers.Companion.a(strArr);
                                                    if (Iterable.class.isAssignableFrom(clsM8)) {
                                                        if (!(type instanceof ParameterizedType)) {
                                                            throw ta.v(method, i7, clsM8.getSimpleName() + " must include generic type (e.g., " + clsM8.getSimpleName() + "<String>)", new Object[0]);
                                                        }
                                                        int i13 = 0;
                                                        Type typeL4 = ta.l(0, (ParameterizedType) type);
                                                        if (MultipartBody.Part.class.isAssignableFrom(ta.m(typeL4))) {
                                                            throw ta.v(method, i7, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                        }
                                                        ta1Var = new ta1(new ya1(method, i7, headersA, yj1Var2.c(typeL4, annotationArr3, annotationArr)), i13);
                                                    } else if (clsM8.isArray()) {
                                                        Class clsA = ei1.a(clsM8.getComponentType());
                                                        if (MultipartBody.Part.class.isAssignableFrom(clsA)) {
                                                            throw ta.v(method, i7, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                        }
                                                        ta1Var = new ta1(new ya1(method, i7, headersA, yj1Var2.c(clsA, annotationArr3, annotationArr)), 1);
                                                    } else {
                                                        if (MultipartBody.Part.class.isAssignableFrom(clsM8)) {
                                                            throw ta.v(method, i7, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                        }
                                                        ya1Var = new ya1(method, i7, headersA, yj1Var2.c(type, annotationArr3, annotationArr));
                                                        ta1Var = ya1Var;
                                                    }
                                                } else if (Iterable.class.isAssignableFrom(clsM8)) {
                                                    if (!(type instanceof ParameterizedType)) {
                                                        throw ta.v(method, i7, clsM8.getSimpleName() + " must include generic type (e.g., " + clsM8.getSimpleName() + "<String>)", new Object[0]);
                                                    }
                                                    int i14 = 0;
                                                    if (!MultipartBody.Part.class.isAssignableFrom(ta.m(ta.l(0, (ParameterizedType) type)))) {
                                                        throw ta.v(method, i7, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                    }
                                                    ta1Var = new ta1(cb1Var, i14);
                                                } else if (clsM8.isArray()) {
                                                    if (!MultipartBody.Part.class.isAssignableFrom(clsM8.getComponentType())) {
                                                        throw ta.v(method, i7, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                    }
                                                    ta1Var = new ta1(cb1Var, 1);
                                                } else if (!MultipartBody.Part.class.isAssignableFrom(clsM8)) {
                                                    throw ta.v(method, i7, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                }
                                            } else if (annotation instanceof gb1) {
                                                ei1Var.c(i7, type);
                                                if (!ei1Var.q) {
                                                    throw ta.v(method, i7, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                                                }
                                                ei1Var.g = true;
                                                Class clsM9 = ta.m(type);
                                                if (!Map.class.isAssignableFrom(clsM9)) {
                                                    throw ta.v(method, i7, "@PartMap parameter type must be Map.", new Object[0]);
                                                }
                                                Type typeO4 = ta.o(type, clsM9);
                                                if (!(typeO4 instanceof ParameterizedType)) {
                                                    throw ta.v(method, i7, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                }
                                                ParameterizedType parameterizedType4 = (ParameterizedType) typeO4;
                                                Type typeL5 = ta.l(0, parameterizedType4);
                                                if (String.class != typeL5) {
                                                    throw ta.v(method, i7, "@PartMap keys must be of type String: " + typeL5, new Object[0]);
                                                }
                                                Type typeL6 = ta.l(1, parameterizedType4);
                                                if (MultipartBody.Part.class.isAssignableFrom(ta.m(typeL6))) {
                                                    throw ta.v(method, i7, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                                                }
                                                cb1Var = new ya1(method, i7, yj1Var2.c(typeL6, annotationArr3, annotationArr), ((gb1) annotation).encoding());
                                            } else if (annotation instanceof wh) {
                                                ei1Var.c(i7, type);
                                                if (ei1Var.p || ei1Var.q) {
                                                    throw ta.v(method, i7, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                                                }
                                                if (ei1Var.h) {
                                                    throw ta.v(method, i7, "Multiple @Body method annotations found.", new Object[0]);
                                                }
                                                try {
                                                    ls lsVarC = yj1Var2.c(type, annotationArr3, annotationArr);
                                                    ei1Var.h = true;
                                                    cb1Var = new ua1(method, i7, lsVarC);
                                                } catch (RuntimeException e) {
                                                    throw ta.w(method, e, i7, "Unable to create @Body converter for %s", type);
                                                }
                                            } else if (annotation instanceof iw1) {
                                                ei1Var.c(i7, type);
                                                Class clsA2 = ei1.a(ta.m(type));
                                                for (int i15 = i7 - 1; i15 >= 0; i15--) {
                                                    rq0 rq0Var3 = ei1Var.v[i15];
                                                    if ((rq0Var3 instanceof cb1) && ((cb1) rq0Var3).W.equals(clsA2)) {
                                                        throw ta.v(method, i7, "@Tag type " + clsA2.getName() + " is duplicate of " + rb1.b.d(method, i15) + " and would always overwrite its value.", new Object[0]);
                                                    }
                                                }
                                                cb1Var = new cb1(clsA2);
                                            } else {
                                                ta1Var = null;
                                            }
                                            ta1Var = cb1Var;
                                        }
                                    }
                                }
                                if (ta1Var != null) {
                                    if (rq0Var == null) {
                                        throw ta.v(method, i7, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                                    }
                                    rq0Var = ta1Var;
                                }
                                i9 = i + 1;
                                annotationArr2 = annotationArr4;
                                length2 = i10;
                                i6 = i11;
                                length3 = i3;
                                rq0VarArr2 = rq0VarArr;
                                i8 = i2;
                                str = str;
                            }
                            rq0VarArr = rq0VarArr2;
                            i2 = i8;
                            i3 = length3;
                            if (ta1Var != null) {
                                if (rq0Var == null) {
                                    throw ta.v(method, i7, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                                }
                                rq0Var = ta1Var;
                            }
                            i9 = i + 1;
                            annotationArr2 = annotationArr4;
                            length2 = i10;
                            i6 = i11;
                            length3 = i3;
                            rq0VarArr2 = rq0VarArr;
                            i8 = i2;
                            str = str;
                        }
                    } else {
                        rq0Var = null;
                    }
                    Annotation[][] annotationArr5 = annotationArr2;
                    int i16 = length2;
                    String str2 = str;
                    int i17 = i6;
                    rq0[] rq0VarArr3 = rq0VarArr2;
                    int i18 = i8;
                    if (rq0Var == null) {
                        if (i18 != 0) {
                            try {
                                if (ta.m(type) == fs.class) {
                                    ei1Var.w = true;
                                    rq0Var = null;
                                }
                            } catch (NoClassDefFoundError unused) {
                            }
                        }
                        throw ta.v(method, i7, "No Retrofit annotation found.", new Object[0]);
                    }
                    rq0VarArr3[i7] = rq0Var;
                    i7++;
                    annotationArr2 = annotationArr5;
                    length2 = i16;
                    i6 = i17;
                    str = str2;
                    i4 = 0;
                    rq0Var2 = null;
                }
                String str3 = str;
                if (ei1Var.r == null && !ei1Var.m) {
                    throw ta.s(method, null, "Missing either @%s URL or @Url parameter.", ei1Var.n);
                }
                boolean z6 = ei1Var.p;
                if (!z6 && !ei1Var.q && !ei1Var.o && ei1Var.h) {
                    throw ta.s(method, null, "Non-body HTTP method cannot contain @Body.", new Object[0]);
                }
                if (z6 && !ei1Var.f) {
                    throw ta.s(method, null, "Form-encoded method must contain at least one @Field.", new Object[0]);
                }
                if (ei1Var.q && !ei1Var.g) {
                    throw ta.s(method, null, "Multipart method must contain at least one @Part.", new Object[0]);
                }
                fi1 fi1Var = new fi1(ei1Var);
                Type genericReturnType2 = method.getGenericReturnType();
                if (ta.p(genericReturnType2)) {
                    throw ta.s(method, null, "Method return type must not include a type variable or wildcard: %s", genericReturnType2);
                }
                if (genericReturnType2 == Void.TYPE) {
                    throw ta.s(method, null, "Service methods cannot return void.", new Object[0]);
                }
                Annotation[] annotations = method.getAnnotations();
                boolean z7 = fi1Var.k;
                if (z7) {
                    Type[] genericParameterTypes = method.getGenericParameterTypes();
                    Type typeL7 = ((ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]).getActualTypeArguments()[0];
                    if (typeL7 instanceof WildcardType) {
                        typeL7 = ((WildcardType) typeL7).getLowerBounds()[0];
                    }
                    if (ta.m(typeL7) == gj1.class && (typeL7 instanceof ParameterizedType)) {
                        typeL7 = ta.l(0, (ParameterizedType) typeL7);
                        z2 = true;
                        z3 = false;
                    } else {
                        if (ta.m(typeL7) == wj.class) {
                            throw ta.s(method, null, "Suspend functions should not return Call, as they already execute asynchronously.\nChange its return type to %s", ta.l(0, (ParameterizedType) typeL7));
                        }
                        z3 = ta.d && typeL7 == Unit.class;
                        z2 = false;
                    }
                    genericReturnType = new zk0((Type) null, (Type) wj.class, new Type[]{typeL7});
                    if (!ta.q(annotations, or1.class)) {
                        Annotation[] annotationArr6 = new Annotation[annotations.length + 1];
                        annotationArr6[0] = pr1.b;
                        System.arraycopy(annotations, 0, annotationArr6, 1, annotations.length);
                        annotations = annotationArr6;
                    }
                    z = z3;
                } else {
                    genericReturnType = method.getGenericReturnType();
                    z = false;
                    z2 = false;
                }
                try {
                    yj yjVarA = yj1Var.a(genericReturnType, annotations);
                    Type typeH = yjVarA.h();
                    if (typeH == Response.class) {
                        throw ta.s(method, null, "'" + ta.m(typeH).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
                    }
                    if (typeH == gj1.class) {
                        throw ta.s(method, null, "Response must include generic type (e.g., Response<String>)", new Object[0]);
                    }
                    if (fi1Var.c.equals(str3) && !Void.class.equals(typeH) && (!ta.d || typeH != Unit.class)) {
                        throw ta.s(method, null, "HEAD method must use Void or Unit as response type.", new Object[0]);
                    }
                    try {
                        ls lsVarD = yj1Var.d(typeH, method.getAnnotations());
                        Call.Factory factory = yj1Var.b;
                        if (z7) {
                            return z2 ? new qm0(fi1Var, factory, lsVarD, yjVarA) : new pm0(fi1Var, factory, lsVarD, yjVarA, z);
                        }
                        return new om0(fi1Var, factory, lsVarD, yjVarA);
                    } catch (RuntimeException e2) {
                        throw ta.s(method, e2, "Unable to create converter for %s", typeH);
                    }
                } catch (RuntimeException e3) {
                    throw ta.s(method, e3, "Unable to create call adapter for %s", genericReturnType);
                }
            }
            Annotation annotation2 = annotationArr[i5];
            if (annotation2 instanceof xv) {
                ei1Var.b("DELETE", ((xv) annotation2).value(), false);
            } else if (annotation2 instanceof eh0) {
                ei1Var.b("GET", ((eh0) annotation2).value(), false);
            } else if (annotation2 instanceof gl0) {
                ei1Var.b("HEAD", ((gl0) annotation2).value(), false);
            } else if (annotation2 instanceof ja1) {
                ei1Var.b("PATCH", ((ja1) annotation2).value(), true);
            } else if (annotation2 instanceof la1) {
                ei1Var.b("POST", ((la1) annotation2).value(), true);
            } else if (annotation2 instanceof ma1) {
                ei1Var.b("PUT", ((ma1) annotation2).value(), true);
            } else if (annotation2 instanceof t71) {
                ei1Var.b("OPTIONS", ((t71) annotation2).value(), false);
            } else if (annotation2 instanceof hl0) {
                hl0 hl0Var = (hl0) annotation2;
                ei1Var.b(hl0Var.method(), hl0Var.path(), hl0Var.hasBody());
            } else if (annotation2 instanceof tl0) {
                tl0 tl0Var = (tl0) annotation2;
                String[] strArrValue = tl0Var.value();
                if (strArrValue.length == 0) {
                    throw ta.s(method, null, "@Headers annotation is empty.", new Object[0]);
                }
                boolean zAllowUnsafeNonAsciiValues = tl0Var.allowUnsafeNonAsciiValues();
                Headers.Builder builder = new Headers.Builder();
                int length4 = strArrValue.length;
                int i19 = 0;
                while (i19 < length4) {
                    String str4 = strArrValue[i19];
                    int iIndexOf = str4.indexOf(58);
                    boolean z8 = z4;
                    if (iIndexOf == -1 || iIndexOf == 0 || iIndexOf == str4.length() - 1) {
                        throw ta.s(method, null, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str4);
                    }
                    String strSubstring = str4.substring(0, iIndexOf);
                    String strTrim = str4.substring(iIndexOf + 1).trim();
                    if ("Content-Type".equalsIgnoreCase(strSubstring)) {
                        try {
                            MediaType.e.getClass();
                            ei1Var.t = MediaType.Companion.a(strTrim);
                        } catch (IllegalArgumentException e4) {
                            throw ta.s(method, e4, "Malformed content type: %s", strTrim);
                        }
                    } else if (zAllowUnsafeNonAsciiValues) {
                        strTrim.getClass();
                        _HeadersCommonKt.b(strSubstring);
                        _HeadersCommonKt.a(builder, strSubstring, strTrim);
                    } else {
                        builder.a(strSubstring, strTrim);
                    }
                    i19++;
                    z4 = z8;
                }
                ei1Var.s = builder.c();
            } else if (annotation2 instanceof y51) {
                if (ei1Var.p) {
                    throw ta.s(method, null, "Only one encoding annotation is allowed.", new Object[0]);
                }
                ei1Var.q = true;
            } else if (!(annotation2 instanceof gf0)) {
                continue;
            } else {
                if (ei1Var.q) {
                    throw ta.s(method, null, "Only one encoding annotation is allowed.", new Object[0]);
                }
                ei1Var.p = true;
            }
            i5++;
        }
    }
}
