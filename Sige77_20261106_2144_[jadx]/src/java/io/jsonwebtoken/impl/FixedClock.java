package io.jsonwebtoken.impl;

import io.jsonwebtoken.Clock;
import java.util.Date;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class FixedClock implements Clock {
    private final Date now;

    public FixedClock() {
        this(new Date());
    }

    @Override // io.jsonwebtoken.Clock
    public Date now() {
        return this.now;
    }

    public FixedClock(Date date) {
        this.now = date;
    }
}
