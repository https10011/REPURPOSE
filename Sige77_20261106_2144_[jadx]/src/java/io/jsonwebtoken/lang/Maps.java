package io.jsonwebtoken.lang;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class Maps {

    public static class HashMapBuilder<K, V> implements MapBuilder<K, V> {
        private final Map<K, V> data;

        private HashMapBuilder() {
            this.data = new HashMap();
        }

        @Override // io.jsonwebtoken.lang.Maps.MapBuilder
        public MapBuilder and(K k, V v) {
            this.data.put(k, v);
            return this;
        }

        @Override // io.jsonwebtoken.lang.Maps.MapBuilder
        public Map<K, V> build() {
            return java.util.Collections.unmodifiableMap(this.data);
        }
    }

    public interface MapBuilder<K, V> {
        MapBuilder and(K k, V v);

        Map<K, V> build();
    }

    private Maps() {
    }

    public static <K, V> MapBuilder<K, V> of(K k, V v) {
        return new HashMapBuilder().and(k, v);
    }
}
