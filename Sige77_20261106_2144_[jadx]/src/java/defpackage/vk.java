package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class vk extends vf1 {
    public final Paint a;
    public final List b;

    public vk() {
        Paint paint = new Paint();
        this.a = paint;
        this.b = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // defpackage.vf1
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        int iF;
        Canvas canvas2;
        int iD;
        float dimension = recyclerView.getResources().getDimension(2131165446);
        Paint paint = this.a;
        paint.setStrokeWidth(dimension);
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((kv0) it.next()).getClass();
            ThreadLocal threadLocal = so.a;
            float f = 1.0f - 0.0f;
            paint.setColor(Color.argb((int) ((Color.alpha(-16776961) * 0.0f) + (Color.alpha(-65281) * f)), (int) ((Color.red(-16776961) * 0.0f) + (Color.red(-65281) * f)), (int) ((Color.green(-16776961) * 0.0f) + (Color.green(-65281) * f)), (int) ((Color.blue(-16776961) * 0.0f) + (Color.blue(-65281) * f))));
            int iE = 0;
            if (recyclerView.getLayoutManager().C0()) {
                wk wkVar = recyclerView.getLayoutManager().q;
                switch (wkVar.b) {
                    case 0:
                        break;
                    default:
                        iE = wkVar.c.G();
                        break;
                }
                float f2 = iE;
                wk wkVar2 = recyclerView.getLayoutManager().q;
                switch (wkVar2.b) {
                    case 0:
                        iD = wkVar2.c.o;
                        break;
                    default:
                        CarouselLayoutManager carouselLayoutManager = wkVar2.c;
                        iD = carouselLayoutManager.o - carouselLayoutManager.D();
                        break;
                }
                float f3 = iD;
                canvas2 = canvas;
                canvas2.drawLine(0.0f, f2, 0.0f, f3, paint);
            } else {
                wk wkVar3 = recyclerView.getLayoutManager().q;
                switch (wkVar3.b) {
                    case 0:
                        iE = wkVar3.c.E();
                        break;
                }
                float f4 = iE;
                wk wkVar4 = recyclerView.getLayoutManager().q;
                switch (wkVar4.b) {
                    case 0:
                        CarouselLayoutManager carouselLayoutManager2 = wkVar4.c;
                        iF = carouselLayoutManager2.n - carouselLayoutManager2.F();
                        break;
                    default:
                        iF = wkVar4.c.n;
                        break;
                }
                canvas2 = canvas;
                canvas2.drawLine(f4, 0.0f, iF, 0.0f, paint);
            }
            canvas = canvas2;
        }
    }
}
