package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class wf2 extends Number {
    public final String a;

    public wf2(String str) {
        this.a = str;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.a);
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.a);
    }

    @Override // java.lang.Number
    public final int intValue() {
        Integer numValueOf;
        String str = this.a;
        if (str.startsWith("0x")) {
            numValueOf = Integer.valueOf(Integer.parseInt(str.substring(2), 16));
        } else {
            numValueOf = (str.length() > 1 && str.charAt(0) == '0' && Character.isDigit(str.charAt(1))) ? Integer.valueOf(Integer.parseInt(str.substring(1), 8)) : Integer.valueOf(Integer.parseInt(str));
        }
        return numValueOf.intValue();
    }

    @Override // java.lang.Number
    public final long longValue() {
        Long lValueOf;
        String str = this.a;
        if (str.startsWith("0x")) {
            lValueOf = Long.valueOf(Long.parseLong(str.substring(2), 16));
        } else {
            lValueOf = (str.length() > 1 && str.charAt(0) == '0' && Character.isDigit(str.charAt(1))) ? Long.valueOf(Long.parseLong(str.substring(1), 8)) : Long.valueOf(Long.parseLong(str));
        }
        return lValueOf.longValue();
    }
}
