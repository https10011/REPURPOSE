package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class qp1 {
    public final yp1[] a = new yp1[4];
    public final Matrix[] b = new Matrix[4];
    public final Matrix[] c = new Matrix[4];
    public final PointF d = new PointF();
    public final Path e = new Path();
    public final Path f = new Path();
    public final yp1 g = new yp1();
    public final float[] h = new float[2];
    public final float[] i = new float[2];
    public final Path j = new Path();
    public final Path k = new Path();
    public final boolean l = true;

    public qp1() {
        for (int i = 0; i < 4; i++) {
            this.a[i] = new yp1();
            this.b[i] = new Matrix();
            this.c[i] = new Matrix();
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r10v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v12 ??, new type: yp1
    	at uv1.l(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:80)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.a(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at zn3.accept(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:12)
    	at java.util.ArrayList.forEach(ArrayList.java:1621)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:20)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:14)
    Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.instructions.args.ArgType jadx.core.dex.instructions.args.Typed.getType()' on a null object reference
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:27)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.u(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at ho3.update(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:53)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:39)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	... 9 more
     */
    /* JADX WARN: Failed to calculate best type for var: r10v14 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v14 ??, new type: android.graphics.Matrix
    	at uv1.l(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:80)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.a(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at zn3.accept(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:12)
    	at java.util.ArrayList.forEach(ArrayList.java:1621)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:20)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:14)
    Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.instructions.args.ArgType jadx.core.dex.instructions.args.Typed.getType()' on a null object reference
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:27)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.u(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at ho3.update(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:53)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:39)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	... 9 more
     */
    /* JADX WARN: Failed to calculate best type for var: r10v15 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v15 ??, new type: float
    	at uv1.l(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:80)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.a(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at zn3.accept(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:12)
    	at java.util.ArrayList.forEach(ArrayList.java:1621)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:20)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:14)
    Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.instructions.args.ArgType jadx.core.dex.instructions.args.Typed.getType()' on a null object reference
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:27)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.u(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at ho3.update(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:53)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:39)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	... 9 more
     */
    /* JADX WARN: Failed to calculate best type for var: r10v16 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v16 ??, new type: float
    	at uv1.l(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:80)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.a(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at zn3.accept(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:12)
    	at java.util.ArrayList.forEach(ArrayList.java:1621)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:20)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:14)
    Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.instructions.args.ArgType jadx.core.dex.instructions.args.Typed.getType()' on a null object reference
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:27)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.u(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at ho3.update(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:53)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:39)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	... 9 more
     */
    /* JADX WARN: Failed to calculate best type for var: r10v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v2 ??, new type: yp1
    	at uv1.l(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:80)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.a(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at zn3.accept(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:12)
    	at java.util.ArrayList.forEach(ArrayList.java:1621)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:20)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:14)
    Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.instructions.args.ArgType jadx.core.dex.instructions.args.Typed.getType()' on a null object reference
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:27)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.u(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at ho3.update(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:53)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:39)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	... 9 more
     */
    /* JADX WARN: Failed to calculate best type for var: r10v25 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v25 ??, new type: float
    	at uv1.l(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:80)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.a(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at zn3.accept(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:12)
    	at java.util.ArrayList.forEach(ArrayList.java:1621)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:20)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:14)
    Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.instructions.args.ArgType jadx.core.dex.instructions.args.Typed.getType()' on a null object reference
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:27)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.u(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at ho3.update(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:53)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:39)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	... 9 more
     */
    /* JADX WARN: Failed to calculate best type for var: r10v26 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v26 ??, new type: float
    	at uv1.l(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:80)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.a(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at zn3.accept(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:12)
    	at java.util.ArrayList.forEach(ArrayList.java:1621)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:20)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:14)
    Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.instructions.args.ArgType jadx.core.dex.instructions.args.Typed.getType()' on a null object reference
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:27)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.u(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at ho3.update(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:53)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:39)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	... 9 more
     */
    /* JADX WARN: Failed to calculate best type for var: r10v30 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v30 ??, new type: yp1
    	at uv1.l(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:80)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.a(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at zn3.accept(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:12)
    	at java.util.ArrayList.forEach(ArrayList.java:1621)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:20)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:14)
    Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.instructions.args.ArgType jadx.core.dex.instructions.args.Typed.getType()' on a null object reference
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:27)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.u(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at ho3.update(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:53)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:39)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	... 9 more
     */
    /* JADX WARN: Failed to calculate best type for var: r10v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v4 ??, new type: android.graphics.Matrix
    	at uv1.l(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:80)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.a(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at zn3.accept(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:12)
    	at java.util.ArrayList.forEach(ArrayList.java:1621)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:20)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:14)
    Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.instructions.args.ArgType jadx.core.dex.instructions.args.Typed.getType()' on a null object reference
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:27)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.u(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at ho3.update(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:53)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:39)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	... 9 more
     */
    /* JADX WARN: Failed to calculate best type for var: r10v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v5 ??, new type: yp1
    	at uv1.l(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:80)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.a(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at zn3.accept(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:12)
    	at java.util.ArrayList.forEach(ArrayList.java:1621)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:20)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:14)
    Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.instructions.args.ArgType jadx.core.dex.instructions.args.Typed.getType()' on a null object reference
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:27)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.u(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at ho3.update(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:53)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:39)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	... 9 more
     */
    /* JADX WARN: Failed to calculate best type for var: r10v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v7 ??, new type: android.graphics.Matrix
    	at uv1.l(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:80)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.a(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at zn3.accept(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:12)
    	at java.util.ArrayList.forEach(ArrayList.java:1621)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:20)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:14)
    Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.instructions.args.ArgType jadx.core.dex.instructions.args.Typed.getType()' on a null object reference
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:27)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.u(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at ho3.update(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:53)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:39)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	... 9 more
     */
    /* JADX WARN: Failed to calculate best type for var: r10v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v8 ??, new type: float
    	at uv1.l(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:80)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.a(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at zn3.accept(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:12)
    	at java.util.ArrayList.forEach(ArrayList.java:1621)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:20)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:14)
    Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.instructions.args.ArgType jadx.core.dex.instructions.args.Typed.getType()' on a null object reference
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:27)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.u(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at ho3.update(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:53)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:39)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	... 9 more
     */
    /* JADX WARN: Failed to calculate best type for var: r10v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v9 ??, new type: float
    	at uv1.l(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:80)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.a(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at zn3.accept(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:12)
    	at java.util.ArrayList.forEach(ArrayList.java:1621)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:20)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:14)
    Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.instructions.args.ArgType jadx.core.dex.instructions.args.Typed.getType()' on a null object reference
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:27)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.u(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at ho3.update(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:53)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:39)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	... 9 more
     */
    /* JADX WARN: Failed to calculate best type for var: r11v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v1 ??, new type: float
    	at uv1.l(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:80)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.a(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at zn3.accept(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:12)
    	at java.util.ArrayList.forEach(ArrayList.java:1621)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:20)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:14)
    Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.instructions.args.ArgType jadx.core.dex.instructions.args.Typed.getType()' on a null object reference
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:27)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.u(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at ho3.update(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:53)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:39)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	... 9 more
     */
    /* JADX WARN: Failed to calculate best type for var: r11v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v10 ??, new type: yp1
    	at uv1.l(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:80)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.a(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at zn3.accept(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:12)
    	at java.util.ArrayList.forEach(ArrayList.java:1621)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:20)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:14)
    Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.instructions.args.ArgType jadx.core.dex.instructions.args.Typed.getType()' on a null object reference
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:27)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.u(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at ho3.update(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:53)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:39)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	... 9 more
     */
    /* JADX WARN: Failed to calculate best type for var: r11v13 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v13 ??, new type: android.graphics.Matrix
    	at uv1.l(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:80)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.a(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at zn3.accept(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:12)
    	at java.util.ArrayList.forEach(ArrayList.java:1621)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:20)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:14)
    Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.instructions.args.ArgType jadx.core.dex.instructions.args.Typed.getType()' on a null object reference
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:27)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.u(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at ho3.update(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:53)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:39)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	... 9 more
     */
    /* JADX WARN: Failed to calculate best type for var: r11v15 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v15 ??, new type: float
    	at uv1.l(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:80)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.a(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at zn3.accept(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:12)
    	at java.util.ArrayList.forEach(ArrayList.java:1621)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:20)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:14)
    Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.instructions.args.ArgType jadx.core.dex.instructions.args.Typed.getType()' on a null object reference
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:27)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.u(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at ho3.update(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:53)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:39)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	... 9 more
     */
    /* JADX WARN: Failed to calculate best type for var: r11v17 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v17 ??, new type: d42
    	at uv1.l(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:80)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.a(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at zn3.accept(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:12)
    	at java.util.ArrayList.forEach(ArrayList.java:1621)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:20)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:14)
    Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.instructions.args.ArgType jadx.core.dex.instructions.args.Typed.getType()' on a null object reference
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:27)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.u(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at ho3.update(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:53)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:39)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	... 9 more
     */
    /* JADX WARN: Failed to calculate best type for var: r11v18 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v18 ??, new type: d42
    	at uv1.l(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:80)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.a(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at zn3.accept(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:12)
    	at java.util.ArrayList.forEach(ArrayList.java:1621)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:20)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:14)
    Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.instructions.args.ArgType jadx.core.dex.instructions.args.Typed.getType()' on a null object reference
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:27)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.u(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at ho3.update(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:53)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:39)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	... 9 more
     */
    /* JADX WARN: Failed to calculate best type for var: r11v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v2 ??, new type: android.graphics.Matrix
    	at uv1.l(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:80)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.a(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at zn3.accept(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:12)
    	at java.util.ArrayList.forEach(ArrayList.java:1621)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:20)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:14)
    Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.instructions.args.ArgType jadx.core.dex.instructions.args.Typed.getType()' on a null object reference
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:27)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.u(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at ho3.update(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:53)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:39)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	... 9 more
     */
    /* JADX WARN: Failed to calculate best type for var: r11v22 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v22 ??, new type: d42
    	at uv1.l(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:80)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.a(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at zn3.accept(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:12)
    	at java.util.ArrayList.forEach(ArrayList.java:1621)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:20)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:14)
    Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.instructions.args.ArgType jadx.core.dex.instructions.args.Typed.getType()' on a null object reference
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:27)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.u(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at ho3.update(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:53)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:39)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	... 9 more
     */
    /* JADX WARN: Failed to calculate best type for var: r11v24 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v24 ??, new type: d42
    	at uv1.l(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:80)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.a(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at zn3.accept(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:12)
    	at java.util.ArrayList.forEach(ArrayList.java:1621)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:20)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:14)
    Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.instructions.args.ArgType jadx.core.dex.instructions.args.Typed.getType()' on a null object reference
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:27)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.u(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at ho3.update(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:53)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:39)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	... 9 more
     */
    /* JADX WARN: Failed to calculate best type for var: r11v25 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v25 ??, new type: d42
    	at uv1.l(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:80)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.a(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at zn3.accept(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:12)
    	at java.util.ArrayList.forEach(ArrayList.java:1621)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:20)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:14)
    Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.instructions.args.ArgType jadx.core.dex.instructions.args.Typed.getType()' on a null object reference
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:27)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.u(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at ho3.update(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:53)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:39)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	... 9 more
     */
    /* JADX WARN: Failed to calculate best type for var: r11v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v4 ??, new type: float[]
    	at uv1.l(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:80)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.a(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at zn3.accept(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:12)
    	at java.util.ArrayList.forEach(ArrayList.java:1621)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:20)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:14)
    Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.instructions.args.ArgType jadx.core.dex.instructions.args.Typed.getType()' on a null object reference
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:27)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.u(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at ho3.update(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:53)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:39)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	... 9 more
     */
    /* JADX WARN: Failed to calculate best type for var: r11v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v5 ??, new type: float
    	at uv1.l(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:80)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.a(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at zn3.accept(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:12)
    	at java.util.ArrayList.forEach(ArrayList.java:1621)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:20)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:14)
    Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.instructions.args.ArgType jadx.core.dex.instructions.args.Typed.getType()' on a null object reference
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:27)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.u(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at ho3.update(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:53)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:39)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	... 9 more
     */
    /* JADX WARN: Failed to calculate best type for var: r11v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v6 ??, new type: float
    	at uv1.l(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:80)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.a(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at zn3.accept(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:12)
    	at java.util.ArrayList.forEach(ArrayList.java:1621)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:20)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:14)
    Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.instructions.args.ArgType jadx.core.dex.instructions.args.Typed.getType()' on a null object reference
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:27)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.u(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at ho3.update(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:53)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:39)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	... 9 more
     */
    /* JADX WARN: Failed to calculate best type for var: r11v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v9 ??, new type: float
    	at uv1.l(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:80)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.a(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at zn3.accept(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:12)
    	at java.util.ArrayList.forEach(ArrayList.java:1621)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:20)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:14)
    Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.instructions.args.ArgType jadx.core.dex.instructions.args.Typed.getType()' on a null object reference
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:27)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.u(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at ho3.update(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:53)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:39)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	... 9 more
     */
    /* JADX WARN: Failed to calculate best type for var: r12v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v0 ??, new type: float[]
    	at uv1.l(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:80)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:29)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:22)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.k(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at pw0.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:29)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:32)
    Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.instructions.args.ArgType jadx.core.dex.instructions.args.Typed.getType()' on a null object reference
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:27)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.u(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at ho3.update(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:53)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:39)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	... 8 more
     */
    /* JADX WARN: Failed to calculate best type for var: r12v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v0 ??, new type: float[]
    	at uv1.l(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:80)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.a(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at zn3.accept(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:12)
    	at java.util.ArrayList.forEach(ArrayList.java:1621)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:20)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:14)
    Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.instructions.args.ArgType jadx.core.dex.instructions.args.Typed.getType()' on a null object reference
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:27)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.u(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at ho3.update(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:53)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:39)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	... 9 more
     */
    /* JADX WARN: Failed to calculate best type for var: r12v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v1 ??, new type: float
    	at uv1.l(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:80)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.a(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at zn3.accept(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:12)
    	at java.util.ArrayList.forEach(ArrayList.java:1621)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:20)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:14)
    Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.instructions.args.ArgType jadx.core.dex.instructions.args.Typed.getType()' on a null object reference
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:27)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.u(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at ho3.update(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:53)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:39)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	... 9 more
     */
    /* JADX WARN: Failed to calculate best type for var: r13v13 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v13 ??, new type: float
    	at uv1.l(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:80)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.a(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at zn3.accept(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:12)
    	at java.util.ArrayList.forEach(ArrayList.java:1621)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:20)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:14)
    Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.instructions.args.ArgType jadx.core.dex.instructions.args.Typed.getType()' on a null object reference
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:27)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.u(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at ho3.update(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:53)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:39)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	... 9 more
     */
    /* JADX WARN: Failed to calculate best type for var: r13v19 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v19 ??, new type: android.graphics.Matrix
    	at uv1.l(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:80)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.a(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at zn3.accept(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:12)
    	at java.util.ArrayList.forEach(ArrayList.java:1621)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:20)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:14)
    Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.instructions.args.ArgType jadx.core.dex.instructions.args.Typed.getType()' on a null object reference
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:27)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.u(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at ho3.update(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:53)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:39)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	... 9 more
     */
    /* JADX WARN: Failed to calculate best type for var: r13v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v2 ??, new type: float
    	at uv1.l(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:80)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.a(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at zn3.accept(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:12)
    	at java.util.ArrayList.forEach(ArrayList.java:1621)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:20)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:14)
    Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.instructions.args.ArgType jadx.core.dex.instructions.args.Typed.getType()' on a null object reference
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:27)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.u(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at ho3.update(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:53)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:39)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	... 9 more
     */
    /* JADX WARN: Failed to calculate best type for var: r14v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v0 ??, new type: yp1[]
    	at uv1.l(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:80)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:29)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:22)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.k(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at pw0.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:29)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:32)
    Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.instructions.args.ArgType jadx.core.dex.instructions.args.Typed.getType()' on a null object reference
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:27)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.u(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at ho3.update(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:53)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:39)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	... 8 more
     */
    /* JADX WARN: Failed to calculate best type for var: r14v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v0 ??, new type: yp1[]
    	at uv1.l(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:80)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.a(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at zn3.accept(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:12)
    	at java.util.ArrayList.forEach(ArrayList.java:1621)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:20)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:14)
    Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.instructions.args.ArgType jadx.core.dex.instructions.args.Typed.getType()' on a null object reference
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:27)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.u(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at ho3.update(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:53)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:39)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	... 9 more
     */
    /* JADX WARN: Failed to calculate best type for var: r14v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v5 ??, new type: android.graphics.Matrix
    	at uv1.l(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:80)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.a(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at zn3.accept(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:12)
    	at java.util.ArrayList.forEach(ArrayList.java:1621)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:20)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:14)
    Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.instructions.args.ArgType jadx.core.dex.instructions.args.Typed.getType()' on a null object reference
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:27)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.u(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at ho3.update(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:53)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:39)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	... 9 more
     */
    /* JADX WARN: Failed to calculate best type for var: r14v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v7 ??, new type: yp1[]
    	at uv1.l(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:80)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.a(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at zn3.accept(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:12)
    	at java.util.ArrayList.forEach(ArrayList.java:1621)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:20)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:14)
    Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.instructions.args.ArgType jadx.core.dex.instructions.args.Typed.getType()' on a null object reference
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:27)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.u(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at ho3.update(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:53)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:39)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	... 9 more
     */
    /* JADX WARN: Failed to calculate best type for var: r15v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v0 ??, new type: android.graphics.Matrix[]
    	at uv1.l(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:80)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:29)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:22)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.k(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at pw0.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:29)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:32)
    Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.instructions.args.ArgType jadx.core.dex.instructions.args.Typed.getType()' on a null object reference
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:27)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.u(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at ho3.update(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:53)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:39)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	... 8 more
     */
    /* JADX WARN: Failed to calculate best type for var: r15v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v0 ??, new type: android.graphics.Matrix[]
    	at uv1.l(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:80)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.a(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at zn3.accept(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:12)
    	at java.util.ArrayList.forEach(ArrayList.java:1621)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:20)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:14)
    Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.instructions.args.ArgType jadx.core.dex.instructions.args.Typed.getType()' on a null object reference
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:27)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.u(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at ho3.update(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:53)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:39)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	... 9 more
     */
    /* JADX WARN: Failed to calculate best type for var: r19v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r19v0 ??, new type: float
    	at uv1.l(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:80)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.a(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at zn3.accept(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:12)
    	at java.util.ArrayList.forEach(ArrayList.java:1621)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:20)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:14)
    Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.instructions.args.ArgType jadx.core.dex.instructions.args.Typed.getType()' on a null object reference
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:27)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.u(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at ho3.update(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:53)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:39)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	... 9 more
     */
    /* JADX WARN: Failed to calculate best type for var: r24v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r24v0 ??, new type: android.graphics.RectF
    	at uv1.l(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:80)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.a(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at zn3.accept(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:12)
    	at java.util.ArrayList.forEach(ArrayList.java:1621)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:20)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:14)
    Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.instructions.args.ArgType jadx.core.dex.instructions.args.Typed.getType()' on a null object reference
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:27)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.u(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at ho3.update(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:53)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:39)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	... 9 more
     */
    /* JADX WARN: Failed to calculate best type for var: r26v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r26v0 ??, new type: android.graphics.Path
    	at uv1.l(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:80)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.a(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at zn3.accept(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:12)
    	at java.util.ArrayList.forEach(ArrayList.java:1621)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:20)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:14)
    Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.instructions.args.ArgType jadx.core.dex.instructions.args.Typed.getType()' on a null object reference
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:27)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.u(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at ho3.update(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:53)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:39)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	... 9 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v0 ??, new type: android.graphics.Path
    	at uv1.l(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:80)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:29)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:22)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.k(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at pw0.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:29)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:32)
    Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.instructions.args.ArgType jadx.core.dex.instructions.args.Typed.getType()' on a null object reference
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:27)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.u(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at ho3.update(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:53)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:39)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	... 8 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v0 ??, new type: android.graphics.Path
    	at uv1.l(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:80)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.a(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at zn3.accept(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:12)
    	at java.util.ArrayList.forEach(ArrayList.java:1621)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:20)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:14)
    Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.instructions.args.ArgType jadx.core.dex.instructions.args.Typed.getType()' on a null object reference
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:27)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.u(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at ho3.update(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:53)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:39)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	... 9 more
     */
    /* JADX WARN: Failed to calculate best type for var: r7v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v10 ??, new type: yp1
    	at uv1.l(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:80)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.a(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at zn3.accept(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:12)
    	at java.util.ArrayList.forEach(ArrayList.java:1621)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:20)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:14)
    Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.instructions.args.ArgType jadx.core.dex.instructions.args.Typed.getType()' on a null object reference
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:27)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.u(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at ho3.update(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:53)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:39)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	... 9 more
     */
    /* JADX WARN: Failed to calculate best type for var: r7v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v12 ??, new type: android.graphics.Matrix
    	at uv1.l(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:80)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.a(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at zn3.accept(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:12)
    	at java.util.ArrayList.forEach(ArrayList.java:1621)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:20)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:14)
    Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.instructions.args.ArgType jadx.core.dex.instructions.args.Typed.getType()' on a null object reference
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:27)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.u(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at ho3.update(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:53)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:39)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	... 9 more
     */
    /* JADX WARN: Failed to calculate best type for var: r7v13 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v13 ??, new type: android.graphics.Matrix
    	at uv1.l(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:80)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.a(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at zn3.accept(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:12)
    	at java.util.ArrayList.forEach(ArrayList.java:1621)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:20)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:14)
    Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.instructions.args.ArgType jadx.core.dex.instructions.args.Typed.getType()' on a null object reference
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:27)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.u(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at ho3.update(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:53)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:39)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	... 9 more
     */
    /* JADX WARN: Failed to calculate best type for var: r7v14 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v14 ??, new type: android.graphics.Matrix
    	at uv1.l(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:80)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.a(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at zn3.accept(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:12)
    	at java.util.ArrayList.forEach(ArrayList.java:1621)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:20)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:14)
    Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.instructions.args.ArgType jadx.core.dex.instructions.args.Typed.getType()' on a null object reference
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:27)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.u(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at ho3.update(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:53)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:39)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	... 9 more
     */
    /* JADX WARN: Failed to calculate best type for var: r7v15 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v15 ??, new type: android.graphics.Matrix
    	at uv1.l(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:80)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.a(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at zn3.accept(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:12)
    	at java.util.ArrayList.forEach(ArrayList.java:1621)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:20)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:14)
    Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.instructions.args.ArgType jadx.core.dex.instructions.args.Typed.getType()' on a null object reference
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:27)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.u(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at ho3.update(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:53)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:39)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	... 9 more
     */
    /* JADX WARN: Failed to calculate best type for var: r7v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v8 ??, new type: android.graphics.Matrix
    	at uv1.l(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:80)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.a(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at zn3.accept(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:12)
    	at java.util.ArrayList.forEach(ArrayList.java:1621)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:20)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:14)
    Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.instructions.args.ArgType jadx.core.dex.instructions.args.Typed.getType()' on a null object reference
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:27)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.u(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at ho3.update(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:53)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:39)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	... 9 more
     */
    /* JADX WARN: Failed to calculate best type for var: r7v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v9 ??, new type: android.graphics.Matrix
    	at uv1.l(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:80)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.a(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at zn3.accept(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:12)
    	at java.util.ArrayList.forEach(ArrayList.java:1621)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:20)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:14)
    Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.instructions.args.ArgType jadx.core.dex.instructions.args.Typed.getType()' on a null object reference
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:27)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.u(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at ho3.update(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:53)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:39)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	... 9 more
     */
    /* JADX WARN: Failed to calculate best type for var: r8v13 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v13 ??, new type: android.graphics.Matrix
    	at uv1.l(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:80)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.a(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at zn3.accept(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:12)
    	at java.util.ArrayList.forEach(ArrayList.java:1621)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:20)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:14)
    Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.instructions.args.ArgType jadx.core.dex.instructions.args.Typed.getType()' on a null object reference
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:27)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.u(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at ho3.update(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:53)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:39)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	... 9 more
     */
    /* JADX WARN: Failed to calculate best type for var: r8v14 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v14 ??, new type: float
    	at uv1.l(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:80)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.a(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at zn3.accept(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:12)
    	at java.util.ArrayList.forEach(ArrayList.java:1621)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:20)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:14)
    Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.instructions.args.ArgType jadx.core.dex.instructions.args.Typed.getType()' on a null object reference
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:27)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.u(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at ho3.update(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:53)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:39)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	... 9 more
     */
    /* JADX WARN: Failed to calculate best type for var: r8v15 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v15 ??, new type: android.graphics.Matrix
    	at uv1.l(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:80)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.a(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at zn3.accept(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:12)
    	at java.util.ArrayList.forEach(ArrayList.java:1621)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:20)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:14)
    Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.instructions.args.ArgType jadx.core.dex.instructions.args.Typed.getType()' on a null object reference
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:27)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.u(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at ho3.update(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:53)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:39)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	... 9 more
     */
    /* JADX WARN: Failed to calculate best type for var: r8v17 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v17 ??, new type: yp1
    	at uv1.l(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:80)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.a(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at zn3.accept(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:12)
    	at java.util.ArrayList.forEach(ArrayList.java:1621)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:20)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:14)
    Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.instructions.args.ArgType jadx.core.dex.instructions.args.Typed.getType()' on a null object reference
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:27)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.u(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at ho3.update(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:53)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:39)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	... 9 more
     */
    /* JADX WARN: Failed to calculate best type for var: r8v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v2 ??, new type: yp1
    	at uv1.l(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:80)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:29)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:22)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.k(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at pw0.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:29)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:32)
    Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.instructions.args.ArgType jadx.core.dex.instructions.args.Typed.getType()' on a null object reference
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:27)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.u(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at ho3.update(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:53)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:39)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	... 8 more
     */
    /* JADX WARN: Failed to calculate best type for var: r8v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v2 ??, new type: yp1
    	at uv1.l(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:80)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.a(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at zn3.accept(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:12)
    	at java.util.ArrayList.forEach(ArrayList.java:1621)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:20)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:14)
    Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.instructions.args.ArgType jadx.core.dex.instructions.args.Typed.getType()' on a null object reference
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:27)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.u(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at ho3.update(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:53)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:39)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	... 9 more
     */
    /* JADX WARN: Failed to calculate best type for var: r8v20 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v20 ??, new type: float
    	at uv1.l(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:80)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.a(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at zn3.accept(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:12)
    	at java.util.ArrayList.forEach(ArrayList.java:1621)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:20)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:14)
    Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.instructions.args.ArgType jadx.core.dex.instructions.args.Typed.getType()' on a null object reference
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:27)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.u(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at ho3.update(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:53)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:39)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	... 9 more
     */
    /* JADX WARN: Failed to calculate best type for var: r8v24 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v24 ??, new type: float
    	at uv1.l(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:80)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.a(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at zn3.accept(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:12)
    	at java.util.ArrayList.forEach(ArrayList.java:1621)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:20)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:14)
    Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.instructions.args.ArgType jadx.core.dex.instructions.args.Typed.getType()' on a null object reference
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:27)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.u(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at ho3.update(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:53)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:39)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	... 9 more
     */
    /* JADX WARN: Failed to calculate best type for var: r8v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v4 ??, new type: android.graphics.Matrix
    	at uv1.l(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:80)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:29)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:22)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.k(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at pw0.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:29)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:32)
    Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.instructions.args.ArgType jadx.core.dex.instructions.args.Typed.getType()' on a null object reference
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:27)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.u(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at ho3.update(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:53)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:39)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	... 8 more
     */
    /* JADX WARN: Failed to calculate best type for var: r8v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v4 ??, new type: android.graphics.Matrix
    	at uv1.l(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:80)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.a(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at zn3.accept(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:12)
    	at java.util.ArrayList.forEach(ArrayList.java:1621)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:20)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:14)
    Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.instructions.args.ArgType jadx.core.dex.instructions.args.Typed.getType()' on a null object reference
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:27)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.u(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at ho3.update(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:53)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:39)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	... 9 more
     */
    /* JADX WARN: Failed to calculate best type for var: r8v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v5 ??, new type: float
    	at uv1.l(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:80)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:29)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:22)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.k(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at pw0.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:29)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:32)
    Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.instructions.args.ArgType jadx.core.dex.instructions.args.Typed.getType()' on a null object reference
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:27)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.u(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at ho3.update(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:53)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:39)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	... 8 more
     */
    /* JADX WARN: Failed to calculate best type for var: r8v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v5 ??, new type: float
    	at uv1.l(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:80)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.a(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at zn3.accept(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:12)
    	at java.util.ArrayList.forEach(ArrayList.java:1621)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:20)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:14)
    Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.instructions.args.ArgType jadx.core.dex.instructions.args.Typed.getType()' on a null object reference
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:27)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.u(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at ho3.update(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:53)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:39)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	... 9 more
     */
    /* JADX WARN: Failed to calculate best type for var: r8v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v6 ??, new type: yp1
    	at uv1.l(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:80)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.a(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at zn3.accept(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:12)
    	at java.util.ArrayList.forEach(ArrayList.java:1621)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:20)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:14)
    Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.instructions.args.ArgType jadx.core.dex.instructions.args.Typed.getType()' on a null object reference
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:27)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.u(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at ho3.update(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:53)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:39)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	... 9 more
     */
    /* JADX WARN: Failed to calculate best type for var: r8v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v8 ??, new type: android.graphics.Matrix
    	at uv1.l(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:80)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.a(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at zn3.accept(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:12)
    	at java.util.ArrayList.forEach(ArrayList.java:1621)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:20)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:14)
    Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.instructions.args.ArgType jadx.core.dex.instructions.args.Typed.getType()' on a null object reference
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:27)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.u(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at ho3.update(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:53)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:39)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	... 9 more
     */
    /* JADX WARN: Failed to calculate best type for var: r8v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v9 ??, new type: android.graphics.Matrix
    	at uv1.l(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:80)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.a(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at zn3.accept(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:12)
    	at java.util.ArrayList.forEach(ArrayList.java:1621)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:20)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:14)
    Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.instructions.args.ArgType jadx.core.dex.instructions.args.Typed.getType()' on a null object reference
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:27)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.u(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at ho3.update(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:53)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:39)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	... 9 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v0 ??, new type: android.graphics.Matrix[]
    	at uv1.l(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:80)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:29)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:22)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.k(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at pw0.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:29)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:32)
    Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.instructions.args.ArgType jadx.core.dex.instructions.args.Typed.getType()' on a null object reference
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:27)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.u(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at ho3.update(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:53)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:39)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	... 8 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v0 ??, new type: android.graphics.Matrix[]
    	at uv1.l(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:80)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.a(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at zn3.accept(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:12)
    	at java.util.ArrayList.forEach(ArrayList.java:1621)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:20)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:14)
    Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.instructions.args.ArgType jadx.core.dex.instructions.args.Typed.getType()' on a null object reference
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:27)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.u(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at ho3.update(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:53)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:39)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	... 9 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v12 ??, new type: float
    	at uv1.l(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:80)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.a(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at zn3.accept(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:12)
    	at java.util.ArrayList.forEach(ArrayList.java:1621)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:20)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:14)
    Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.instructions.args.ArgType jadx.core.dex.instructions.args.Typed.getType()' on a null object reference
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:27)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.u(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at ho3.update(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:53)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:39)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	... 9 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v8 ??, new type: android.graphics.Matrix[]
    	at uv1.l(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:80)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.a(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at zn3.accept(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:12)
    	at java.util.ArrayList.forEach(ArrayList.java:1621)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:20)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:14)
    Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.instructions.args.ArgType jadx.core.dex.instructions.args.Typed.getType()' on a null object reference
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:27)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.u(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at ho3.update(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:53)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:39)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	... 9 more
     */
    /* JADX WARN: Failed to set immutable type for var: r24v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r24v0 ??, new type: android.graphics.RectF
    	at uv1.l(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:9)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.c(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at zn3.accept(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:16)
    	at java.util.ArrayList.forEach(ArrayList.java:1621)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:11)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:14)
    Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.instructions.args.ArgType jadx.core.dex.instructions.args.Typed.getType()' on a null object reference
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:27)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.u(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at ho3.update(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:53)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:39)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	... 8 more
     */
    /* JADX WARN: Failed to set immutable type for var: r26v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r26v0 ??, new type: android.graphics.Path
    	at uv1.l(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:9)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.c(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at zn3.accept(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:16)
    	at java.util.ArrayList.forEach(ArrayList.java:1621)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:11)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:14)
    Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.instructions.args.ArgType jadx.core.dex.instructions.args.Typed.getType()' on a null object reference
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:27)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.u(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at ho3.update(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:53)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:39)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	... 8 more
     */
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
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v5 ??, new type: float
        	at uv1.l(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:80)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:31)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:32)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:22)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.k(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
        	at pw0.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:29)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:32)
        Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.instructions.args.ArgType jadx.core.dex.instructions.args.Typed.getType()' on a null object reference
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:27)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.u(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
        	at ho3.update(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:53)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:39)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
        	... 7 more
        */
    public final void a(defpackage.op1 r21, float[] r22, float r23, android.graphics.RectF r24, defpackage.kj0 r25, android.graphics.Path r26) {
        /*
            Method dump skipped, instruction units count: 618
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qp1.a(op1, float[], float, android.graphics.RectF, kj0, android.graphics.Path):void");
    }

    public final boolean b(Path path, int i) {
        Path path2 = this.k;
        path2.reset();
        this.a[i].b(this.b[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }
}
