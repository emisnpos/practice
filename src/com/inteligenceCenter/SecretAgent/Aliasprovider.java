package com.inteligenceCenter.SecretAgent;

import java.util.Set;

public interface Aliasprovider {

    Set<String> getAllAliases();
    void sendMessage(String alias, String message);
}
