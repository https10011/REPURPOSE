package io.jsonwebtoken.impl;

import io.jsonwebtoken.Clock;
import java.util.Date;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class DefaultClock implements Clock {
    public static final Clock INSTANCE = new DefaultClock();

    @Override // io.jsonwebtoken.Clock
    public Date now() {
        return new Date();
    }
}
