package ipc.fdbus;

/* JADX INFO: loaded from: classes.dex */
public class FdbusSimpleBuilder extends FdbusMsgBuilder {
    public FdbusSimpleBuilder(Object obj) {
        super(obj);
    }

    @Override // ipc.fdbus.FdbusMsgBuilder
    public boolean build(boolean z) {
        FdbusSerializer fdbusSerializer = new FdbusSerializer();
        Object obj = this.mMsg;
        if (obj instanceof FdbusParcelable) {
            fdbusSerializer.in((FdbusParcelable) obj);
        } else if (obj instanceof FdbusParcelable[]) {
            fdbusSerializer.in((FdbusParcelable[]) obj);
        } else if (obj instanceof String) {
            fdbusSerializer.inS((String) obj);
        } else {
            if (!(obj instanceof String[])) {
                return false;
            }
            fdbusSerializer.inS((String[]) obj);
        }
        this.mStream = fdbusSerializer.export();
        if (z) {
            FdbusParcelable.TextFormatter textFormatter = new FdbusParcelable.TextFormatter();
            textFormatter.format(this.mMsg);
            this.mText = textFormatter.stream();
        }
        return true;
    }
}
