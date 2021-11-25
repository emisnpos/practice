package com.inteligenceCenter.SecretAgent;

import java.util.UUID;

public abstract class SecretAgent {


    protected Status status;
    private UUID id = UUID.randomUUID();
    private String alias;
    private String name;


    public SecretAgent(String alias, String name) {
        this.alias = alias;
        this.name = name;
    }

    public String getAlias() {
        return alias;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "SecretAgent{" +
                "status=" + status +
                ", id=" + id +
                ", alias='" + alias + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public void sendMessage(String message) {
        System.out.println("Message to: " + alias + message);

    }
}

