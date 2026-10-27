package com.jcraft.jsch;

import java.util.Vector;

/* JADX INFO: loaded from: classes.dex */
public interface IdentityRepository {
    public static final int NOTRUNNING = 1;
    public static final int RUNNING = 2;
    public static final int UNAVAILABLE = 0;

    public static class Wrapper implements IdentityRepository {
        private Vector cache;
        private IdentityRepository ir;
        private boolean keep_in_cache;

        public Wrapper(IdentityRepository identityRepository) {
            this(identityRepository, false);
        }

        @Override // com.jcraft.jsch.IdentityRepository
        public boolean add(byte[] bArr) {
            return this.ir.add(bArr);
        }

        public void check() {
            if (this.cache.size() > 0) {
                for (Object obj : this.cache.toArray()) {
                    Identity identity = (Identity) obj;
                    this.cache.removeElement(identity);
                    add(identity);
                }
            }
        }

        @Override // com.jcraft.jsch.IdentityRepository
        public Vector getIdentities() {
            Vector vector = new Vector();
            for (int i = 0; i < this.cache.size(); i++) {
                vector.add((Identity) this.cache.elementAt(i));
            }
            Vector identities = this.ir.getIdentities();
            for (int i2 = 0; i2 < identities.size(); i2++) {
                vector.add(identities.elementAt(i2));
            }
            return vector;
        }

        @Override // com.jcraft.jsch.IdentityRepository
        public String getName() {
            return this.ir.getName();
        }

        @Override // com.jcraft.jsch.IdentityRepository
        public int getStatus() {
            return this.ir.getStatus();
        }

        @Override // com.jcraft.jsch.IdentityRepository
        public boolean remove(byte[] bArr) {
            return this.ir.remove(bArr);
        }

        @Override // com.jcraft.jsch.IdentityRepository
        public void removeAll() {
            this.cache.removeAllElements();
            this.ir.removeAll();
        }

        public Wrapper(IdentityRepository identityRepository, boolean z) {
            this.cache = new Vector();
            this.ir = identityRepository;
            this.keep_in_cache = z;
        }

        public void add(Identity identity) {
            if (this.keep_in_cache || identity.isEncrypted() || !(identity instanceof IdentityFile)) {
                this.cache.addElement(identity);
            } else {
                try {
                    this.ir.add(((IdentityFile) identity).getKeyPair().forSSHAgent());
                } catch (JSchException unused) {
                }
            }
        }
    }

    boolean add(byte[] bArr);

    Vector getIdentities();

    String getName();

    int getStatus();

    boolean remove(byte[] bArr);

    void removeAll();
}
