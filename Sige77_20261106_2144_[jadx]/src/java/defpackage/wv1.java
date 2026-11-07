package defpackage;

import java.util.Map;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public interface wv1 {
    @la1("/wps/collect/log")
    wj<ResponseBody> a(@wh Map<String, Object> map);

    @eh0("/wps/system/domainRoute")
    @tl0({"ModuleId: COMM3", "Accept: application/json"})
    wj<bu0<r20>> b(@ke1("device") Integer num, @ke1("agentName") String str);
}
