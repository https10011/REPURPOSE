package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ka {
    public final int a;
    public final int b;

    public ka(int i, int i2) {
        if (i == 0) {
            throw null;
        }
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ka)) {
            return false;
        }
        ka kaVar = (ka) obj;
        return this.a == kaVar.a && this.b == kaVar.b;
    }

    public final int hashCode() {
        int iV = ts.v(this.a) * 31;
        int i = this.b;
        return iV + (i == 0 ? 0 : ts.v(i));
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("SectionFieldMapping(section=");
        sb.append(ts.x(this.a));
        sb.append(", field=");
        switch (this.b) {
            case 1:
                str = "ANON_ID";
                break;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                str = "FB_LOGIN_ID";
                break;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                str = "MAD_ID";
                break;
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                str = "PAGE_ID";
                break;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                str = "PAGE_SCOPED_USER_ID";
                break;
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                str = "USER_DATA";
                break;
            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                str = "ADV_TE";
                break;
            case oc1.BYTES_FIELD_NUMBER /* 8 */:
                str = "APP_TE";
                break;
            case 9:
                str = "CONSIDER_VIEWS";
                break;
            case 10:
                str = "DEVICE_TOKEN";
                break;
            case 11:
                str = "EXT_INFO";
                break;
            case 12:
                str = "INCLUDE_DWELL_DATA";
                break;
            case 13:
                str = "INCLUDE_VIDEO_DATA";
                break;
            case 14:
                str = "INSTALL_REFERRER";
                break;
            case 15:
                str = "INSTALLER_PACKAGE";
                break;
            case 16:
                str = "RECEIPT_DATA";
                break;
            case 17:
                str = "URL_SCHEMES";
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
