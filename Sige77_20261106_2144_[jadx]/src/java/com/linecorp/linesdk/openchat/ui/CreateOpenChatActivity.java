package com.linecorp.linesdk.openchat.ui;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import androidx.lifecycle.b;
import com.linecorp.linesdk.openchat.OpenChatRoomInfo;
import com.linecorp.linesdk.openchat.ui.CreateOpenChatActivity;
import defpackage.aw0;
import defpackage.cd1;
import defpackage.e71;
import defpackage.g81;
import defpackage.kv;
import defpackage.m91;
import defpackage.md2;
import defpackage.o62;
import defpackage.oc1;
import defpackage.p11;
import defpackage.p7;
import defpackage.pe;
import defpackage.q62;
import defpackage.r91;
import defpackage.rc2;
import defpackage.ts;
import defpackage.uq1;
import defpackage.uv1;
import defpackage.vt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/linecorp/linesdk/openchat/ui/CreateOpenChatActivity;", "Lp7;", "<init>", "()V", "line-sdk_release"}, k = 1, mv = {1, oc1.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
public final class CreateOpenChatActivity extends p7 {
    public static final /* synthetic */ int r0 = 0;
    public rc2 n0;
    public r91 p0;
    public final uv1 o0 = aw0.a(new vt(this, 0));
    public final int q0 = 1;

    public final int g(int i, boolean z) {
        Fragment m91Var;
        String str;
        e supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        pe peVar = new pe(supportFragmentManager);
        if (z) {
            if (i == 1) {
                str = "ChatroomInfo";
            } else {
                if (i != 2) {
                    throw null;
                }
                str = "UserProfile";
            }
            if (!peVar.h) {
                uq1.q("This FragmentTransaction is not allowed to be added to the back stack.");
                return 0;
            }
            peVar.g = true;
            peVar.i = str;
        }
        int iV = ts.v(i);
        if (iV == 0) {
            m91Var = new m91();
        } else {
            if (iV != 1) {
                throw new e71();
            }
            m91Var = new cd1();
        }
        peVar.e(2131296415, m91Var, null, 2);
        return peVar.d(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        r91 r91Var = null;
        final int i = 0;
        ConstraintLayout constraintLayoutInflate = getLayoutInflater().inflate(2131492892, (ViewGroup) null, false);
        int i2 = 2131296341;
        if (kv.q(constraintLayoutInflate, 2131296341) != null) {
            i2 = 2131296415;
            if (kv.q(constraintLayoutInflate, 2131296415) != null) {
                i2 = 2131296697;
                ProgressBar progressBar = (ProgressBar) kv.q(constraintLayoutInflate, 2131296697);
                if (progressBar != null) {
                    i2 = 2131296825;
                    Toolbar toolbarQ = kv.q(constraintLayoutInflate, 2131296825);
                    if (toolbarQ != null) {
                        ConstraintLayout constraintLayout = constraintLayoutInflate;
                        this.n0 = new rc2(constraintLayout, progressBar, toolbarQ);
                        setContentView((View) constraintLayout);
                        r91 r91Var2 = (r91) new p11((q62) this, (o62) new md2(getSharedPreferences("openchat", 0), this)).c(r91.class);
                        this.p0 = r91Var2;
                        r91Var2.k.e(this, new g81(this) { // from class: st
                            public final /* synthetic */ CreateOpenChatActivity b;

                            {
                                this.b = this;
                            }

                            /* JADX WARN: Type inference failed for: r4v2, types: [tt] */
                            /* JADX WARN: Type inference failed for: r6v1, types: [android.app.Activity, android.content.Context, com.linecorp.linesdk.openchat.ui.CreateOpenChatActivity] */
                            @Override // defpackage.g81
                            public final void a(Object obj) {
                                int i3 = i;
                                final int i4 = 0;
                                final ?? r6 = this.b;
                                switch (i3) {
                                    case 0:
                                        int i5 = CreateOpenChatActivity.r0;
                                        r6.setResult(-1, new Intent().putExtra("arg_open_chatroom_info", (OpenChatRoomInfo) obj));
                                        r6.finish();
                                        break;
                                    case 1:
                                        int i6 = CreateOpenChatActivity.r0;
                                        r6.setResult(-1, new Intent().putExtra("arg_error_result", ((ix0) obj).c));
                                        r6.finish();
                                        break;
                                    case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                                        Boolean bool = (Boolean) obj;
                                        int i7 = CreateOpenChatActivity.r0;
                                        rc2 rc2Var = r6.n0;
                                        if (rc2Var == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                                            rc2Var = null;
                                        }
                                        ProgressBar progressBar2 = (ProgressBar) rc2Var.b;
                                        bool.getClass();
                                        progressBar2.setVisibility(bool.booleanValue() ? 0 : 8);
                                        break;
                                    default:
                                        Boolean bool2 = (Boolean) obj;
                                        int i8 = CreateOpenChatActivity.r0;
                                        bool2.getClass();
                                        if (bool2.booleanValue()) {
                                            final int i9 = 1;
                                            boolean z = kx0.a(r6) != null;
                                            f6 f6Var = new f6((Context) r6);
                                            b6 b6Var = (b6) f6Var.c;
                                            b6Var.g = b6Var.a.getText(2131886356);
                                            b6Var.p = new DialogInterface.OnDismissListener() { // from class: tt
                                                @Override // android.content.DialogInterface.OnDismissListener
                                                public final void onDismiss(DialogInterface dialogInterface) {
                                                    int i10 = CreateOpenChatActivity.r0;
                                                    r6.finish();
                                                }
                                            };
                                            if (z) {
                                                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: ut
                                                    @Override // android.content.DialogInterface.OnClickListener
                                                    public final void onClick(DialogInterface dialogInterface, int i10) {
                                                        int i11 = i4;
                                                        c cVar = r6;
                                                        switch (i11) {
                                                            case 0:
                                                                int i12 = CreateOpenChatActivity.r0;
                                                                cVar.startActivity(cVar.getPackageManager().getLaunchIntentForPackage("jp.naver.line.android"));
                                                                break;
                                                            case 1:
                                                                int i13 = CreateOpenChatActivity.r0;
                                                                cVar.finish();
                                                                break;
                                                            default:
                                                                int i14 = CreateOpenChatActivity.r0;
                                                                cVar.finish();
                                                                break;
                                                        }
                                                    }
                                                };
                                                b6Var.h = b6Var.a.getText(2131886343);
                                                b6Var.i = onClickListener;
                                                DialogInterface.OnClickListener onClickListener2 = new DialogInterface.OnClickListener() { // from class: ut
                                                    @Override // android.content.DialogInterface.OnClickListener
                                                    public final void onClick(DialogInterface dialogInterface, int i10) {
                                                        int i11 = i9;
                                                        c cVar = r6;
                                                        switch (i11) {
                                                            case 0:
                                                                int i12 = CreateOpenChatActivity.r0;
                                                                cVar.startActivity(cVar.getPackageManager().getLaunchIntentForPackage("jp.naver.line.android"));
                                                                break;
                                                            case 1:
                                                                int i13 = CreateOpenChatActivity.r0;
                                                                cVar.finish();
                                                                break;
                                                            default:
                                                                int i14 = CreateOpenChatActivity.r0;
                                                                cVar.finish();
                                                                break;
                                                        }
                                                    }
                                                };
                                                b6Var.j = b6Var.a.getText(2131886168);
                                                b6Var.k = onClickListener2;
                                            } else {
                                                final int i10 = 2;
                                                DialogInterface.OnClickListener onClickListener3 = new DialogInterface.OnClickListener() { // from class: ut
                                                    @Override // android.content.DialogInterface.OnClickListener
                                                    public final void onClick(DialogInterface dialogInterface, int i11) {
                                                        int i12 = i10;
                                                        c cVar = r6;
                                                        switch (i12) {
                                                            case 0:
                                                                int i13 = CreateOpenChatActivity.r0;
                                                                cVar.startActivity(cVar.getPackageManager().getLaunchIntentForPackage("jp.naver.line.android"));
                                                                break;
                                                            case 1:
                                                                int i14 = CreateOpenChatActivity.r0;
                                                                cVar.finish();
                                                                break;
                                                            default:
                                                                int i15 = CreateOpenChatActivity.r0;
                                                                cVar.finish();
                                                                break;
                                                        }
                                                    }
                                                };
                                                b6Var.h = b6Var.a.getText(R.string.ok);
                                                b6Var.i = onClickListener3;
                                            }
                                            f6Var.a().show();
                                        }
                                        break;
                                }
                            }
                        });
                        r91 r91Var3 = this.p0;
                        if (r91Var3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                            r91Var3 = null;
                        }
                        final int i3 = 1;
                        r91Var3.l.e(this, new g81(this) { // from class: st
                            public final /* synthetic */ CreateOpenChatActivity b;

                            {
                                this.b = this;
                            }

                            /* JADX WARN: Type inference failed for: r4v2, types: [tt] */
                            /* JADX WARN: Type inference failed for: r6v1, types: [android.app.Activity, android.content.Context, com.linecorp.linesdk.openchat.ui.CreateOpenChatActivity] */
                            @Override // defpackage.g81
                            public final void a(Object obj) {
                                int i4 = i3;
                                final int i5 = 0;
                                final CreateOpenChatActivity r6 = this.b;
                                switch (i4) {
                                    case 0:
                                        int i6 = CreateOpenChatActivity.r0;
                                        r6.setResult(-1, new Intent().putExtra("arg_open_chatroom_info", (OpenChatRoomInfo) obj));
                                        r6.finish();
                                        break;
                                    case 1:
                                        int i7 = CreateOpenChatActivity.r0;
                                        r6.setResult(-1, new Intent().putExtra("arg_error_result", ((ix0) obj).c));
                                        r6.finish();
                                        break;
                                    case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                                        Boolean bool = (Boolean) obj;
                                        int i8 = CreateOpenChatActivity.r0;
                                        rc2 rc2Var = r6.n0;
                                        if (rc2Var == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                                            rc2Var = null;
                                        }
                                        ProgressBar progressBar2 = (ProgressBar) rc2Var.b;
                                        bool.getClass();
                                        progressBar2.setVisibility(bool.booleanValue() ? 0 : 8);
                                        break;
                                    default:
                                        Boolean bool2 = (Boolean) obj;
                                        int i9 = CreateOpenChatActivity.r0;
                                        bool2.getClass();
                                        if (bool2.booleanValue()) {
                                            final int i10 = 1;
                                            boolean z = kx0.a(r6) != null;
                                            f6 f6Var = new f6((Context) r6);
                                            b6 b6Var = (b6) f6Var.c;
                                            b6Var.g = b6Var.a.getText(2131886356);
                                            b6Var.p = new DialogInterface.OnDismissListener() { // from class: tt
                                                @Override // android.content.DialogInterface.OnDismissListener
                                                public final void onDismiss(DialogInterface dialogInterface) {
                                                    int i11 = CreateOpenChatActivity.r0;
                                                    r6.finish();
                                                }
                                            };
                                            if (z) {
                                                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: ut
                                                    @Override // android.content.DialogInterface.OnClickListener
                                                    public final void onClick(DialogInterface dialogInterface, int i11) {
                                                        int i12 = i5;
                                                        c cVar = r6;
                                                        switch (i12) {
                                                            case 0:
                                                                int i13 = CreateOpenChatActivity.r0;
                                                                cVar.startActivity(cVar.getPackageManager().getLaunchIntentForPackage("jp.naver.line.android"));
                                                                break;
                                                            case 1:
                                                                int i14 = CreateOpenChatActivity.r0;
                                                                cVar.finish();
                                                                break;
                                                            default:
                                                                int i15 = CreateOpenChatActivity.r0;
                                                                cVar.finish();
                                                                break;
                                                        }
                                                    }
                                                };
                                                b6Var.h = b6Var.a.getText(2131886343);
                                                b6Var.i = onClickListener;
                                                DialogInterface.OnClickListener onClickListener2 = new DialogInterface.OnClickListener() { // from class: ut
                                                    @Override // android.content.DialogInterface.OnClickListener
                                                    public final void onClick(DialogInterface dialogInterface, int i11) {
                                                        int i12 = i10;
                                                        c cVar = r6;
                                                        switch (i12) {
                                                            case 0:
                                                                int i13 = CreateOpenChatActivity.r0;
                                                                cVar.startActivity(cVar.getPackageManager().getLaunchIntentForPackage("jp.naver.line.android"));
                                                                break;
                                                            case 1:
                                                                int i14 = CreateOpenChatActivity.r0;
                                                                cVar.finish();
                                                                break;
                                                            default:
                                                                int i15 = CreateOpenChatActivity.r0;
                                                                cVar.finish();
                                                                break;
                                                        }
                                                    }
                                                };
                                                b6Var.j = b6Var.a.getText(2131886168);
                                                b6Var.k = onClickListener2;
                                            } else {
                                                final int i11 = 2;
                                                DialogInterface.OnClickListener onClickListener3 = new DialogInterface.OnClickListener() { // from class: ut
                                                    @Override // android.content.DialogInterface.OnClickListener
                                                    public final void onClick(DialogInterface dialogInterface, int i12) {
                                                        int i13 = i11;
                                                        c cVar = r6;
                                                        switch (i13) {
                                                            case 0:
                                                                int i14 = CreateOpenChatActivity.r0;
                                                                cVar.startActivity(cVar.getPackageManager().getLaunchIntentForPackage("jp.naver.line.android"));
                                                                break;
                                                            case 1:
                                                                int i15 = CreateOpenChatActivity.r0;
                                                                cVar.finish();
                                                                break;
                                                            default:
                                                                int i16 = CreateOpenChatActivity.r0;
                                                                cVar.finish();
                                                                break;
                                                        }
                                                    }
                                                };
                                                b6Var.h = b6Var.a.getText(R.string.ok);
                                                b6Var.i = onClickListener3;
                                            }
                                            f6Var.a().show();
                                        }
                                        break;
                                }
                            }
                        });
                        r91 r91Var4 = this.p0;
                        if (r91Var4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                            r91Var4 = null;
                        }
                        final int i4 = 2;
                        r91Var4.m.e(this, new g81(this) { // from class: st
                            public final /* synthetic */ CreateOpenChatActivity b;

                            {
                                this.b = this;
                            }

                            /* JADX WARN: Type inference failed for: r4v2, types: [tt] */
                            /* JADX WARN: Type inference failed for: r6v1, types: [android.app.Activity, android.content.Context, com.linecorp.linesdk.openchat.ui.CreateOpenChatActivity] */
                            @Override // defpackage.g81
                            public final void a(Object obj) {
                                int i5 = i4;
                                final int i6 = 0;
                                final CreateOpenChatActivity r6 = this.b;
                                switch (i5) {
                                    case 0:
                                        int i7 = CreateOpenChatActivity.r0;
                                        r6.setResult(-1, new Intent().putExtra("arg_open_chatroom_info", (OpenChatRoomInfo) obj));
                                        r6.finish();
                                        break;
                                    case 1:
                                        int i8 = CreateOpenChatActivity.r0;
                                        r6.setResult(-1, new Intent().putExtra("arg_error_result", ((ix0) obj).c));
                                        r6.finish();
                                        break;
                                    case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                                        Boolean bool = (Boolean) obj;
                                        int i9 = CreateOpenChatActivity.r0;
                                        rc2 rc2Var = r6.n0;
                                        if (rc2Var == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                                            rc2Var = null;
                                        }
                                        ProgressBar progressBar2 = (ProgressBar) rc2Var.b;
                                        bool.getClass();
                                        progressBar2.setVisibility(bool.booleanValue() ? 0 : 8);
                                        break;
                                    default:
                                        Boolean bool2 = (Boolean) obj;
                                        int i10 = CreateOpenChatActivity.r0;
                                        bool2.getClass();
                                        if (bool2.booleanValue()) {
                                            final int i11 = 1;
                                            boolean z = kx0.a(r6) != null;
                                            f6 f6Var = new f6((Context) r6);
                                            b6 b6Var = (b6) f6Var.c;
                                            b6Var.g = b6Var.a.getText(2131886356);
                                            b6Var.p = new DialogInterface.OnDismissListener() { // from class: tt
                                                @Override // android.content.DialogInterface.OnDismissListener
                                                public final void onDismiss(DialogInterface dialogInterface) {
                                                    int i12 = CreateOpenChatActivity.r0;
                                                    r6.finish();
                                                }
                                            };
                                            if (z) {
                                                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: ut
                                                    @Override // android.content.DialogInterface.OnClickListener
                                                    public final void onClick(DialogInterface dialogInterface, int i12) {
                                                        int i13 = i6;
                                                        c cVar = r6;
                                                        switch (i13) {
                                                            case 0:
                                                                int i14 = CreateOpenChatActivity.r0;
                                                                cVar.startActivity(cVar.getPackageManager().getLaunchIntentForPackage("jp.naver.line.android"));
                                                                break;
                                                            case 1:
                                                                int i15 = CreateOpenChatActivity.r0;
                                                                cVar.finish();
                                                                break;
                                                            default:
                                                                int i16 = CreateOpenChatActivity.r0;
                                                                cVar.finish();
                                                                break;
                                                        }
                                                    }
                                                };
                                                b6Var.h = b6Var.a.getText(2131886343);
                                                b6Var.i = onClickListener;
                                                DialogInterface.OnClickListener onClickListener2 = new DialogInterface.OnClickListener() { // from class: ut
                                                    @Override // android.content.DialogInterface.OnClickListener
                                                    public final void onClick(DialogInterface dialogInterface, int i12) {
                                                        int i13 = i11;
                                                        c cVar = r6;
                                                        switch (i13) {
                                                            case 0:
                                                                int i14 = CreateOpenChatActivity.r0;
                                                                cVar.startActivity(cVar.getPackageManager().getLaunchIntentForPackage("jp.naver.line.android"));
                                                                break;
                                                            case 1:
                                                                int i15 = CreateOpenChatActivity.r0;
                                                                cVar.finish();
                                                                break;
                                                            default:
                                                                int i16 = CreateOpenChatActivity.r0;
                                                                cVar.finish();
                                                                break;
                                                        }
                                                    }
                                                };
                                                b6Var.j = b6Var.a.getText(2131886168);
                                                b6Var.k = onClickListener2;
                                            } else {
                                                final int i12 = 2;
                                                DialogInterface.OnClickListener onClickListener3 = new DialogInterface.OnClickListener() { // from class: ut
                                                    @Override // android.content.DialogInterface.OnClickListener
                                                    public final void onClick(DialogInterface dialogInterface, int i13) {
                                                        int i14 = i12;
                                                        c cVar = r6;
                                                        switch (i14) {
                                                            case 0:
                                                                int i15 = CreateOpenChatActivity.r0;
                                                                cVar.startActivity(cVar.getPackageManager().getLaunchIntentForPackage("jp.naver.line.android"));
                                                                break;
                                                            case 1:
                                                                int i16 = CreateOpenChatActivity.r0;
                                                                cVar.finish();
                                                                break;
                                                            default:
                                                                int i17 = CreateOpenChatActivity.r0;
                                                                cVar.finish();
                                                                break;
                                                        }
                                                    }
                                                };
                                                b6Var.h = b6Var.a.getText(R.string.ok);
                                                b6Var.i = onClickListener3;
                                            }
                                            f6Var.a().show();
                                        }
                                        break;
                                }
                            }
                        });
                        r91 r91Var5 = this.p0;
                        if (r91Var5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                        } else {
                            r91Var = r91Var5;
                        }
                        b bVar = r91Var.n;
                        final int i5 = 3;
                        bVar.e(this, new g81(this) { // from class: st
                            public final /* synthetic */ CreateOpenChatActivity b;

                            {
                                this.b = this;
                            }

                            /* JADX WARN: Type inference failed for: r4v2, types: [tt] */
                            /* JADX WARN: Type inference failed for: r6v1, types: [android.app.Activity, android.content.Context, com.linecorp.linesdk.openchat.ui.CreateOpenChatActivity] */
                            @Override // defpackage.g81
                            public final void a(Object obj) {
                                int i6 = i5;
                                final int i7 = 0;
                                final CreateOpenChatActivity r6 = this.b;
                                switch (i6) {
                                    case 0:
                                        int i8 = CreateOpenChatActivity.r0;
                                        r6.setResult(-1, new Intent().putExtra("arg_open_chatroom_info", (OpenChatRoomInfo) obj));
                                        r6.finish();
                                        break;
                                    case 1:
                                        int i9 = CreateOpenChatActivity.r0;
                                        r6.setResult(-1, new Intent().putExtra("arg_error_result", ((ix0) obj).c));
                                        r6.finish();
                                        break;
                                    case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                                        Boolean bool = (Boolean) obj;
                                        int i10 = CreateOpenChatActivity.r0;
                                        rc2 rc2Var = r6.n0;
                                        if (rc2Var == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                                            rc2Var = null;
                                        }
                                        ProgressBar progressBar2 = (ProgressBar) rc2Var.b;
                                        bool.getClass();
                                        progressBar2.setVisibility(bool.booleanValue() ? 0 : 8);
                                        break;
                                    default:
                                        Boolean bool2 = (Boolean) obj;
                                        int i11 = CreateOpenChatActivity.r0;
                                        bool2.getClass();
                                        if (bool2.booleanValue()) {
                                            final int i12 = 1;
                                            boolean z = kx0.a(r6) != null;
                                            f6 f6Var = new f6((Context) r6);
                                            b6 b6Var = (b6) f6Var.c;
                                            b6Var.g = b6Var.a.getText(2131886356);
                                            b6Var.p = new DialogInterface.OnDismissListener() { // from class: tt
                                                @Override // android.content.DialogInterface.OnDismissListener
                                                public final void onDismiss(DialogInterface dialogInterface) {
                                                    int i13 = CreateOpenChatActivity.r0;
                                                    r6.finish();
                                                }
                                            };
                                            if (z) {
                                                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: ut
                                                    @Override // android.content.DialogInterface.OnClickListener
                                                    public final void onClick(DialogInterface dialogInterface, int i13) {
                                                        int i14 = i7;
                                                        c cVar = r6;
                                                        switch (i14) {
                                                            case 0:
                                                                int i15 = CreateOpenChatActivity.r0;
                                                                cVar.startActivity(cVar.getPackageManager().getLaunchIntentForPackage("jp.naver.line.android"));
                                                                break;
                                                            case 1:
                                                                int i16 = CreateOpenChatActivity.r0;
                                                                cVar.finish();
                                                                break;
                                                            default:
                                                                int i17 = CreateOpenChatActivity.r0;
                                                                cVar.finish();
                                                                break;
                                                        }
                                                    }
                                                };
                                                b6Var.h = b6Var.a.getText(2131886343);
                                                b6Var.i = onClickListener;
                                                DialogInterface.OnClickListener onClickListener2 = new DialogInterface.OnClickListener() { // from class: ut
                                                    @Override // android.content.DialogInterface.OnClickListener
                                                    public final void onClick(DialogInterface dialogInterface, int i13) {
                                                        int i14 = i12;
                                                        c cVar = r6;
                                                        switch (i14) {
                                                            case 0:
                                                                int i15 = CreateOpenChatActivity.r0;
                                                                cVar.startActivity(cVar.getPackageManager().getLaunchIntentForPackage("jp.naver.line.android"));
                                                                break;
                                                            case 1:
                                                                int i16 = CreateOpenChatActivity.r0;
                                                                cVar.finish();
                                                                break;
                                                            default:
                                                                int i17 = CreateOpenChatActivity.r0;
                                                                cVar.finish();
                                                                break;
                                                        }
                                                    }
                                                };
                                                b6Var.j = b6Var.a.getText(2131886168);
                                                b6Var.k = onClickListener2;
                                            } else {
                                                final int i13 = 2;
                                                DialogInterface.OnClickListener onClickListener3 = new DialogInterface.OnClickListener() { // from class: ut
                                                    @Override // android.content.DialogInterface.OnClickListener
                                                    public final void onClick(DialogInterface dialogInterface, int i14) {
                                                        int i15 = i13;
                                                        c cVar = r6;
                                                        switch (i15) {
                                                            case 0:
                                                                int i16 = CreateOpenChatActivity.r0;
                                                                cVar.startActivity(cVar.getPackageManager().getLaunchIntentForPackage("jp.naver.line.android"));
                                                                break;
                                                            case 1:
                                                                int i17 = CreateOpenChatActivity.r0;
                                                                cVar.finish();
                                                                break;
                                                            default:
                                                                int i18 = CreateOpenChatActivity.r0;
                                                                cVar.finish();
                                                                break;
                                                        }
                                                    }
                                                };
                                                b6Var.h = b6Var.a.getText(R.string.ok);
                                                b6Var.i = onClickListener3;
                                            }
                                            f6Var.a().show();
                                        }
                                        break;
                                }
                            }
                        });
                        g(this.q0, false);
                        return;
                    }
                }
            }
        }
        uq1.h("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i2)));
    }
}
