package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ja {
    public final int a;
    public final int b;

    public ja(int i, int i2) {
        if (i2 == 0) {
            throw null;
        }
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ja)) {
            return false;
        }
        ja jaVar = (ja) obj;
        return this.a == jaVar.a && this.b == jaVar.b;
    }

    public final int hashCode() {
        int i = this.a;
        return ts.v(this.b) + ((i == 0 ? 0 : ts.v(i)) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("SectionCustomEventFieldMapping(section=");
        sb.append(ts.x(this.a));
        sb.append(", field=");
        switch (this.b) {
            case 1:
                str = "VALUE_TO_SUM";
                break;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                str = "EVENT_TIME";
                break;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                str = "EVENT_NAME";
                break;
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                str = "CONTENT_IDS";
                break;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                str = "CONTENTS";
                break;
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                str = "CONTENT_TYPE";
                break;
            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                str = "DESCRIPTION";
                break;
            case oc1.BYTES_FIELD_NUMBER /* 8 */:
                str = "LEVEL";
                break;
            case 9:
                str = "MAX_RATING_VALUE";
                break;
            case 10:
                str = "NUM_ITEMS";
                break;
            case 11:
                str = "PAYMENT_INFO_AVAILABLE";
                break;
            case 12:
                str = "REGISTRATION_METHOD";
                break;
            case 13:
                str = "SEARCH_STRING";
                break;
            case 14:
                str = "SUCCESS";
                break;
            case 15:
                str = "ORDER_ID";
                break;
            case 16:
                str = "AD_TYPE";
                break;
            case 17:
                str = "CURRENCY";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append(')');
        return sb.toString();
    }
}
