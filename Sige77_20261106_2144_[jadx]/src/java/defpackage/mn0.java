package defpackage;

import com.linecorp.linesdk.LineIdToken;
import com.linecorp.linesdk.b;
import com.linecorp.linesdk.c;
import io.jsonwebtoken.Claims;
import java.util.Date;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class mn0 {
    public static LineIdToken a(String str, Claims claims) {
        LineIdToken.Address address;
        c cVar = new c();
        cVar.a = str;
        cVar.b = claims.getIssuer();
        cVar.c = claims.getSubject();
        cVar.d = claims.getAudience();
        cVar.e = claims.getExpiration();
        cVar.f = claims.getIssuedAt();
        cVar.g = (Date) claims.get("auth_time", Date.class);
        cVar.h = (String) claims.get("nonce", String.class);
        cVar.i = (List) claims.get("amr", List.class);
        cVar.j = (String) claims.get("name", String.class);
        cVar.k = (String) claims.get("picture", String.class);
        cVar.l = (String) claims.get("phone_number", String.class);
        cVar.m = (String) claims.get("email", String.class);
        cVar.n = (String) claims.get("gender", String.class);
        cVar.o = (String) claims.get("birthdate", String.class);
        Map map = (Map) claims.get("address", Map.class);
        if (map == null) {
            address = null;
        } else {
            b bVar = new b();
            bVar.a = (String) map.get("street_address");
            bVar.b = (String) map.get("locality");
            bVar.c = (String) map.get("region");
            bVar.d = (String) map.get("postal_code");
            bVar.e = (String) map.get("country");
            address = new LineIdToken.Address(bVar);
        }
        cVar.p = address;
        cVar.q = (String) claims.get("given_name", String.class);
        cVar.r = (String) claims.get("given_name_pronunciation", String.class);
        cVar.s = (String) claims.get("middle_name", String.class);
        cVar.t = (String) claims.get("family_name", String.class);
        cVar.u = (String) claims.get("family_name_pronunciation", String.class);
        return new LineIdToken(cVar);
    }
}
