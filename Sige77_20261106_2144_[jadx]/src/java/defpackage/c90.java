package defpackage;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import com.facebook.AccessToken;
import java.util.Arrays;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc90;", "Lq10;", "<init>", "()V", "facebook-common_release"}, k = 1, mv = {1, oc1.BYTES_FIELD_NUMBER, 0}, xi = 48)
public final class c90 extends q10 {
    public Dialog a1;

    public final void C() {
        ((Fragment) this).r0 = true;
        Dialog dialog = this.a1;
        if (dialog instanceof d82) {
            dialog.getClass();
            ((d82) dialog).d();
        }
    }

    @Override // defpackage.q10
    public final Dialog Q(Bundle bundle) {
        Dialog dialog = this.a1;
        if (dialog != null) {
            return dialog;
        }
        c cVarG = g();
        if (cVarG != null) {
            Intent intent = cVarG.getIntent();
            intent.getClass();
            cVarG.setResult(-1, l61.e(intent, null, null));
            cVarG.finish();
        }
        this.R0 = false;
        return super.Q(bundle);
    }

    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        ((Fragment) this).r0 = true;
        Dialog dialog = this.a1;
        if (!(dialog instanceof d82) || ((Fragment) this).a < 7) {
            return;
        }
        dialog.getClass();
        ((d82) dialog).d();
    }

    @Override // defpackage.q10
    public final void v(Bundle bundle) {
        c cVarG;
        d82 d82Var;
        super.v(bundle);
        if (this.a1 == null && (cVarG = g()) != null) {
            Intent intent = cVarG.getIntent();
            intent.getClass();
            Bundle bundleI = l61.i(intent);
            final int i = 0;
            String string = null;
            if (bundleI != null ? bundleI.getBoolean("is_fallback", false) : false) {
                string = bundleI != null ? bundleI.getString("url") : null;
                if (h42.x(string)) {
                    i90 i90Var = i90.a;
                    cVarG.finish();
                    return;
                }
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                final int i2 = 1;
                String str = String.format("fb%s://bridge/", Arrays.copyOf(new Object[]{i90.b()}, 1));
                int i3 = l90.b0;
                string.getClass();
                d82.b(cVarG);
                l90 l90Var = new l90(cVarG, string);
                l90Var.b = str;
                l90Var.c = new y72(this) { // from class: b90
                    public final /* synthetic */ c90 b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.y72
                    public final void a(Bundle bundle2, d90 d90Var) {
                        int i4 = i2;
                        c90 c90Var = this.b;
                        switch (i4) {
                            case 0:
                                c cVarG2 = c90Var.g();
                                if (cVarG2 != null) {
                                    Intent intent2 = cVarG2.getIntent();
                                    intent2.getClass();
                                    cVarG2.setResult(d90Var != null ? 0 : -1, l61.e(intent2, bundle2, d90Var));
                                    cVarG2.finish();
                                    break;
                                }
                                break;
                            default:
                                c cVarG3 = c90Var.g();
                                if (cVarG3 != null) {
                                    Intent intent3 = new Intent();
                                    if (bundle2 == null) {
                                        bundle2 = new Bundle();
                                    }
                                    intent3.putExtras(bundle2);
                                    cVarG3.setResult(-1, intent3);
                                    cVarG3.finish();
                                    break;
                                }
                                break;
                        }
                    }
                };
                d82Var = l90Var;
            } else {
                String string2 = bundleI != null ? bundleI.getString("action") : null;
                Bundle bundle2 = bundleI != null ? bundleI.getBundle("params") : null;
                if (h42.x(string2)) {
                    i90 i90Var2 = i90.a;
                    cVarG.finish();
                    return;
                }
                string2.getClass();
                Date date = AccessToken.Y;
                AccessToken accessTokenT = aj0.t();
                if (!aj0.v()) {
                    int i4 = dw0.i;
                    string = i90.b();
                }
                if (bundle2 == null) {
                    bundle2 = new Bundle();
                }
                y72 y72Var = new y72(this) { // from class: b90
                    public final /* synthetic */ c90 b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.y72
                    public final void a(Bundle bundle3, d90 d90Var) {
                        int i5 = i;
                        c90 c90Var = this.b;
                        switch (i5) {
                            case 0:
                                c cVarG2 = c90Var.g();
                                if (cVarG2 != null) {
                                    Intent intent2 = cVarG2.getIntent();
                                    intent2.getClass();
                                    cVarG2.setResult(d90Var != null ? 0 : -1, l61.e(intent2, bundle3, d90Var));
                                    cVarG2.finish();
                                    break;
                                }
                                break;
                            default:
                                c cVarG3 = c90Var.g();
                                if (cVarG3 != null) {
                                    Intent intent3 = new Intent();
                                    if (bundle3 == null) {
                                        bundle3 = new Bundle();
                                    }
                                    intent3.putExtras(bundle3);
                                    cVarG3.setResult(-1, intent3);
                                    cVarG3.finish();
                                    break;
                                }
                                break;
                        }
                    }
                };
                if (accessTokenT != null) {
                    bundle2.putString("app_id", accessTokenT.v);
                    bundle2.putString("access_token", accessTokenT.e);
                } else {
                    bundle2.putString("app_id", string);
                }
                d82.b(cVarG);
                d82Var = new d82(cVarG, string2, bundle2, 1, y72Var);
            }
            this.a1 = d82Var;
        }
    }

    @Override // defpackage.q10
    public final void y() {
        Dialog dialog = this.V0;
        if (dialog != null) {
            ng0 ng0Var = og0.a;
            ji0 ji0Var = new ji0(this, "Attempting to get retain instance for fragment " + this);
            og0.c(ji0Var);
            ng0 ng0VarA = og0.a(this);
            if (ng0VarA.a.contains(mg0.f) && og0.e(ng0VarA, c90.class, ji0.class)) {
                og0.b(ng0VarA, ji0Var);
            }
            if (((Fragment) this).n0) {
                dialog.setDismissMessage(null);
            }
        }
        super.y();
    }
}
