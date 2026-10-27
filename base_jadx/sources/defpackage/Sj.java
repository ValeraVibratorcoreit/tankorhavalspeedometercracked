package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class Sj extends AbstractC0293jg implements InterfaceC0445od {
    public final /* synthetic */ int b;
    public final /* synthetic */ C0021ak c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Sj(C0021ak c0021ak, int i) {
        super(1);
        this.b = i;
        this.c = c0021ak;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0060  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v5 java.lang.Object, still in use, count: 2, list:
          (r1v5 java.lang.Object) from 0x005a: PHI (r1 I:??) = (r1v2 java.lang.Object), (r1v5 java.lang.Object) binds: [B:22:0x0059, B:32:0x005a] A[DONT_GENERATE, DONT_INLINE]
          (r1v5 java.lang.Object) from 0x0052: CHECK_CAST (Hc) (r1v5 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // defpackage.InterfaceC0445od
    public final java.lang.Object c(java.lang.Object r4) {
        /*
            r3 = this;
            int r0 = r3.b
            switch(r0) {
                case 0: goto L34;
                default: goto L5;
            }
        L5:
            r3 r4 = (defpackage.C0527r3) r4
            java.lang.String r0 = "backEvent"
            defpackage.Tf.j(r0, r4)
            ak r4 = r3.c
            Hc r0 = r4.c
            if (r0 != 0) goto L31
            Z2 r4 = r4.b
            int r0 = r4.size()
            java.util.ListIterator r4 = r4.listIterator(r0)
        L1c:
            boolean r0 = r4.hasPrevious()
            if (r0 == 0) goto L2e
            java.lang.Object r0 = r4.previous()
            r1 = r0
            Hc r1 = (defpackage.Hc) r1
            boolean r1 = r1.a
            if (r1 == 0) goto L1c
            goto L2f
        L2e:
            r0 = 0
        L2f:
            Hc r0 = (defpackage.Hc) r0
        L31:
            pa r4 = defpackage.C0473pa.m
            return r4
        L34:
            r3 r4 = (defpackage.C0527r3) r4
            java.lang.String r0 = "backEvent"
            defpackage.Tf.j(r0, r4)
            ak r4 = r3.c
            Z2 r0 = r4.b
            int r1 = r0.size()
            java.util.ListIterator r0 = r0.listIterator(r1)
        L47:
            boolean r1 = r0.hasPrevious()
            if (r1 == 0) goto L59
            java.lang.Object r1 = r0.previous()
            r2 = r1
            Hc r2 = (defpackage.Hc) r2
            boolean r2 = r2.a
            if (r2 == 0) goto L47
            goto L5a
        L59:
            r1 = 0
        L5a:
            Hc r1 = (defpackage.Hc) r1
            Hc r0 = r4.c
            if (r0 == 0) goto L63
            r4.a()
        L63:
            r4.c = r1
            pa r4 = defpackage.C0473pa.m
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Sj.c(java.lang.Object):java.lang.Object");
    }
}
