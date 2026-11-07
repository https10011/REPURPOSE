package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class y23 extends d33 {
    public final int d;
    public final int e;

    public y23(byte[] bArr, int i, int i2) {
        super(bArr);
        d33.g(i, i + i2, bArr.length);
        this.d = i;
        this.e = i2;
    }

    /*  JADX ERROR: ConcurrentModificationException in pass: ConstructorVisitor
        java.util.ConcurrentModificationException
        	at java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1112)
        	at java.util.ArrayList$Itr.next(ArrayList.java:1065)
        	at jadx.core.dex.visitors.ConstructorVisitor.insertPhiInsn(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:40)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:124)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:60)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:8)
        */
    @Override // defpackage.d33
    public final byte a(
    /*  JADX ERROR: ConcurrentModificationException in pass: ConstructorVisitor
        java.util.ConcurrentModificationException
        	at java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1112)
        	at java.util.ArrayList$Itr.next(ArrayList.java:1065)
        	at jadx.core.dex.visitors.ConstructorVisitor.insertPhiInsn(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:40)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:124)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:60)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r4v0 ??
        	at p61.o(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:16)
        	at jadx.core.codegen.MethodGen.addMethodArguments(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:77)
        	at jadx.core.codegen.MethodGen.addDefinition(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:335)
        	at jadx.core.codegen.ClassGen.addMethodCode(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:62)
        	at jadx.core.codegen.ClassGen.addMethod(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:23)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
        	at jadx.core.codegen.ClassGen.b(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
        	at qx.accept(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:18)
        	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
        	at java.util.stream.SortedOps$RefSortingSink$$ExternalSyntheticLambda0.accept(D8$$SyntheticClass:0)
        	at java.util.ArrayList.forEach(ArrayList.java:1621)
        	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.util.stream.Sink$ChainedReference.end(Sink.java:263)
        	at java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:301)
        	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:575)
        	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:564)
        	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
        	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:135)
        	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:267)
        	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:657)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:66)
        	at jadx.core.codegen.ClassGen.addClassBody(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:61)
        	at jadx.core.codegen.ClassGen.addClassBody(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:78)
        	at jadx.core.codegen.ClassGen.addClassCode(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:15)
        	at jadx.core.codegen.ClassGen.makeClass(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:26)
        	at py.call(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:155)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
        	at jadx.core.codegen.CodeGen.generateJavaCode(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:12)
        	at jadx.core.codegen.CodeGen.generate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:50)
        	at jadx.core.ProcessClass.process(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:164)
        	at jadx.core.ProcessClass.generateCode(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:93)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:7)
        	at jadx.core.dex.nodes.ClassNode.decompile(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:38)
        	at jadx.core.dex.nodes.ClassNode.getCode(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:2)
        */

    @Override // defpackage.d33
    public final byte b(int i) {
        return this.b[this.d + i];
    }

    @Override // defpackage.d33
    public final int c() {
        return this.d;
    }

    @Override // defpackage.d33
    public final int d() {
        return this.e;
    }

    @Override // defpackage.d33
    public final void e(byte[] bArr, int i) {
        System.arraycopy(this.b, this.d, bArr, 0, i);
    }
}
