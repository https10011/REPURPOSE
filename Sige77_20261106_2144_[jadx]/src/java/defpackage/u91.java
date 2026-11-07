package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class u91 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final ArrayList e;
    public final ArrayList f;
    public final ArrayList g;

    public u91(uy1 uy1Var) {
        this.a = (String) uy1Var.a;
        this.b = (String) uy1Var.b;
        this.c = (String) uy1Var.c;
        this.d = (String) uy1Var.d;
        this.e = (ArrayList) uy1Var.e;
        this.f = (ArrayList) uy1Var.f;
        this.g = (ArrayList) uy1Var.i;
    }

    public final String toString() {
        return "OpenIdDiscoveryDocument{issuer='" + this.a + "', authorizationEndpoint='" + this.b + "', tokenEndpoint='" + this.c + "', jwksUri='" + this.d + "', responseTypesSupported=" + this.e + ", subjectTypesSupported=" + this.f + ", idTokenSigningAlgValuesSupported=" + this.g + '}';
    }
}
