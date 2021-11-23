package com.inteligenceCenter.SecretAgent.ReportingAgent;
import com.inteligenceCenter.SecretAgent.SecretAgent;
import com.inteligenceCenter.SecretAgent.Status;

public abstract class ReportingAgent extends SecretAgent {


    protected SecretAgent superior;
    private String profession;


    public ReportingAgent(String alias, String name) {
        super(alias, name);
        this.status = Status.INACTIVE;
    }

    public SecretAgent getSuperior() {
        return superior;
    }
}
