package defpackage;

import android.app.ProgressDialog;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.ImageView;
import com.facebook.AccessToken;
import com.facebook.FacebookRequestError;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class a82 extends AsyncTask {
    public final String a;
    public final Bundle b;
    public Exception[] c = new Exception[0];
    public final /* synthetic */ d82 d;

    public a82(d82 d82Var, String str, Bundle bundle) {
        this.d = d82Var;
        this.a = str;
        this.b = bundle;
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [z72] */
    public final String[] a(Void... voidArr) {
        if (!mt.a.contains(this)) {
            try {
                voidArr.getClass();
                String[] stringArray = this.b.getStringArray("media");
                if (stringArray != null) {
                    final String[] strArr = new String[stringArray.length];
                    this.c = new Exception[stringArray.length];
                    final CountDownLatch countDownLatch = new CountDownLatch(stringArray.length);
                    ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
                    Date date = AccessToken.Y;
                    AccessToken accessTokenT = aj0.t();
                    try {
                        int length = stringArray.length;
                        for (final int i = 0; i < length; i++) {
                            if (isCancelled()) {
                                Iterator it = concurrentLinkedQueue.iterator();
                                while (it.hasNext()) {
                                    ((nk0) it.next()).cancel(true);
                                }
                            } else {
                                Uri uri = Uri.parse(stringArray[i]);
                                if (h42.y(uri)) {
                                    strArr[i] = uri.toString();
                                    countDownLatch.countDown();
                                } else {
                                    ?? r9 = new ik0() { // from class: z72
                                        @Override // defpackage.ik0
                                        public final void a(pk0 pk0Var) {
                                            String[] strArr2 = strArr;
                                            int i2 = i;
                                            pk0Var.getClass();
                                            try {
                                                FacebookRequestError facebookRequestError = pk0Var.c;
                                                String str = "Error staging photo.";
                                                if (facebookRequestError != null) {
                                                    String strA = facebookRequestError.a();
                                                    if (strA != null) {
                                                        str = strA;
                                                    }
                                                    throw new e90(pk0Var, str);
                                                }
                                                JSONObject jSONObject = pk0Var.b;
                                                if (jSONObject == null) {
                                                    throw new d90("Error staging photo.");
                                                }
                                                String strOptString = jSONObject.optString("uri");
                                                if (strOptString == null) {
                                                    throw new d90("Error staging photo.");
                                                }
                                                strArr2[i2] = strOptString;
                                                countDownLatch.countDown();
                                            } catch (Exception e) {
                                                this.c[i2] = e;
                                            }
                                        }
                                    };
                                    uri.getClass();
                                    concurrentLinkedQueue.add(z32.z(accessTokenT, uri, r9).d());
                                }
                            }
                        }
                        countDownLatch.await();
                        return strArr;
                    } catch (Exception unused) {
                        Iterator it2 = concurrentLinkedQueue.iterator();
                        while (it2.hasNext()) {
                            ((nk0) it2.next()).cancel(true);
                        }
                    }
                }
            } catch (Throwable th) {
                mt.a(this, th);
                return null;
            }
        }
        return null;
    }

    public final void b(String[] strArr) {
        Bundle bundle = this.b;
        d82 d82Var = this.d;
        if (mt.a.contains(this)) {
            return;
        }
        try {
            ProgressDialog progressDialog = d82Var.e;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
            for (Exception exc : this.c) {
                if (exc != null) {
                    d82Var.e(exc);
                    return;
                }
            }
            if (strArr == null) {
                d82Var.e(new d90("Failed to stage photos for web dialog"));
                return;
            }
            List listAsList = Arrays.asList(strArr);
            listAsList.getClass();
            if (listAsList.contains(null)) {
                d82Var.e(new d90("Failed to stage photos for web dialog"));
                return;
            }
            h42.D(bundle, new JSONArray((Collection) listAsList));
            d82Var.a = h42.a(yv2.y(), i90.d() + "/dialog/" + this.a, bundle).toString();
            ImageView imageView = d82Var.f;
            if (imageView == null) {
                throw new IllegalStateException("Required value was null.");
            }
            d82Var.f((imageView.getDrawable().getIntrinsicWidth() / 2) + 1);
        } catch (Throwable th) {
            mt.a(this, th);
        }
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        if (mt.a.contains(this)) {
            return null;
        }
        try {
            return a((Void[]) objArr);
        } catch (Throwable th) {
            mt.a(this, th);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        if (mt.a.contains(this)) {
            return;
        }
        try {
            b((String[]) obj);
        } catch (Throwable th) {
            mt.a(this, th);
        }
    }
}
