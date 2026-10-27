package com.jcraft.jsch;

/* JADX INFO: loaded from: classes.dex */
public interface ConfigRepository {
    public static final Config defaultConfig = new Config() { // from class: com.jcraft.jsch.ConfigRepository.1
        @Override // com.jcraft.jsch.ConfigRepository.Config
        public String getHostname() {
            return null;
        }

        @Override // com.jcraft.jsch.ConfigRepository.Config
        public int getPort() {
            return -1;
        }

        @Override // com.jcraft.jsch.ConfigRepository.Config
        public String getUser() {
            return null;
        }

        @Override // com.jcraft.jsch.ConfigRepository.Config
        public String getValue(String str) {
            return null;
        }

        @Override // com.jcraft.jsch.ConfigRepository.Config
        public String[] getValues(String str) {
            return null;
        }
    };
    public static final ConfigRepository nullConfig = new ConfigRepository() { // from class: com.jcraft.jsch.ConfigRepository.2
        @Override // com.jcraft.jsch.ConfigRepository
        public Config getConfig(String str) {
            return ConfigRepository.defaultConfig;
        }
    };

    public interface Config {
        String getHostname();

        int getPort();

        String getUser();

        String getValue(String str);

        String[] getValues(String str);
    }

    Config getConfig(String str);
}
