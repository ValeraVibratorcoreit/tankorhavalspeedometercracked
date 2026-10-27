package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: hs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0245hs {
    public final C0066c3 a;
    public final C0066c3 b;
    public final C0066c3 c;

    public AbstractC0245hs(C0066c3 c0066c3, C0066c3 c0066c4, C0066c3 c0066c5) {
        this.a = c0066c3;
        this.b = c0066c4;
        this.c = c0066c5;
    }

    public abstract C0275is a();

    public final Class b(Class cls) throws ClassNotFoundException {
        String name = cls.getName();
        C0066c3 c0066c3 = this.c;
        Class cls2 = (Class) c0066c3.getOrDefault(name, null);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        c0066c3.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) throws NoSuchMethodException {
        C0066c3 c0066c3 = this.a;
        Method method = (Method) c0066c3.getOrDefault(str, null);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, AbstractC0245hs.class.getClassLoader()).getDeclaredMethod("read", AbstractC0245hs.class);
        c0066c3.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method d(Class cls) throws NoSuchMethodException, ClassNotFoundException {
        String name = cls.getName();
        C0066c3 c0066c3 = this.b;
        Method method = (Method) c0066c3.getOrDefault(name, null);
        if (method != null) {
            return method;
        }
        Class clsB = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsB.getDeclaredMethod("write", cls, AbstractC0245hs.class);
        c0066c3.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e(int i);

    public final Parcelable f(Parcelable parcelable, int i) {
        if (!e(i)) {
            return parcelable;
        }
        return ((C0275is) this).e.readParcelable(C0275is.class.getClassLoader());
    }

    public final InterfaceC0305js g() {
        String string = ((C0275is) this).e.readString();
        if (string == null) {
            return null;
        }
        try {
            return (InterfaceC0305js) c(string).invoke(null, a());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    public abstract void h(int i);

    public final void i(InterfaceC0305js interfaceC0305js) {
        if (interfaceC0305js == null) {
            ((C0275is) this).e.writeString(null);
            return;
        }
        try {
            ((C0275is) this).e.writeString(b(interfaceC0305js.getClass()).getName());
            C0275is c0275isA = a();
            try {
                d(interfaceC0305js.getClass()).invoke(null, interfaceC0305js, c0275isA);
                int i = c0275isA.i;
                if (i >= 0) {
                    int i2 = c0275isA.d.get(i);
                    Parcel parcel = c0275isA.e;
                    int iDataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i2);
                    parcel.writeInt(iDataPosition - i2);
                    parcel.setDataPosition(iDataPosition);
                }
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (!(e4.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
                }
                throw ((RuntimeException) e4.getCause());
            }
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException(interfaceC0305js.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }
}
