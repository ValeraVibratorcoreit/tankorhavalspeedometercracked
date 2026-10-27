package ipc.fdbus;

import defpackage.Vo;

/* JADX INFO: loaded from: classes.dex */
public class FdbusParcelable {
    public void deserialize(FdbusDeserializer fdbusDeserializer) {
    }

    public void serialize(FdbusSerializer fdbusSerializer) {
    }

    public void toString(TextFormatter textFormatter) {
        textFormatter.format("null");
    }

    public static class TextFormatter {
        private static final int FDB_BYTEARRAY_PRINT_SIZE = 16;
        private String mStream;

        public TextFormatter() {
            this.mStream = new String();
        }

        private void formatOne(Object obj) {
            if (obj instanceof FdbusParcelable) {
                this.mStream = Vo.h(new StringBuilder(), this.mStream, "{");
                ((FdbusParcelable) obj).toString(this);
                this.mStream = Vo.h(new StringBuilder(), this.mStream, "}");
                return;
            }
            if (obj instanceof String) {
                this.mStream = Vo.h(new StringBuilder(), this.mStream, (String) obj);
                return;
            }
            if (obj instanceof Integer) {
                this.mStream += ((Integer) obj).toString();
                return;
            }
            int i = 0;
            if (!(obj instanceof byte[])) {
                if (!(obj instanceof byte[][])) {
                    this.mStream = Vo.h(new StringBuilder(), this.mStream, "error!");
                    return;
                }
                byte[][] bArr = (byte[][]) obj;
                this.mStream = Vo.h(new StringBuilder(), this.mStream, "[");
                while (i < bArr.length) {
                    formatOne(bArr[i]);
                    this.mStream = Vo.h(new StringBuilder(), this.mStream, ",");
                    i++;
                }
                this.mStream = Vo.h(new StringBuilder(), this.mStream, "]");
                return;
            }
            byte[] bArr2 = (byte[]) obj;
            int length = bArr2.length;
            if (length > FDB_BYTEARRAY_PRINT_SIZE) {
                this.mStream += Integer.valueOf(length).toString() + "[";
                length = FDB_BYTEARRAY_PRINT_SIZE;
            } else {
                this.mStream = Vo.h(new StringBuilder(), this.mStream, "[");
            }
            while (i < length) {
                this.mStream += Byte.valueOf(bArr2[i]).toString() + ",";
                i++;
            }
            this.mStream = Vo.h(new StringBuilder(), this.mStream, "]");
        }

        public void append(String str) {
            this.mStream = Vo.h(new StringBuilder(), this.mStream, str);
        }

        public void format(Object obj) {
            if (!(obj instanceof Object[])) {
                formatOne(obj);
                return;
            }
            this.mStream = Vo.h(new StringBuilder(), this.mStream, "[");
            for (Object obj2 : (Object[]) obj) {
                formatOne(obj2);
                this.mStream = Vo.h(new StringBuilder(), this.mStream, ",");
            }
            this.mStream = Vo.h(new StringBuilder(), this.mStream, "]");
        }

        public String stream() {
            return this.mStream;
        }

        public TextFormatter(String str) {
            this.mStream = str;
        }

        public void format(String str, Object obj) {
            this.mStream += str + ":";
            format(obj);
            this.mStream = Vo.h(new StringBuilder(), this.mStream, ",");
        }
    }

    public String toString() {
        TextFormatter textFormatter = new TextFormatter();
        textFormatter.format(this);
        return textFormatter.stream();
    }
}
