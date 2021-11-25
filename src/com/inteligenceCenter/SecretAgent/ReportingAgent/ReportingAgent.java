package com.inteligenceCenter.SecretAgent.ReportingAgent;
import com.inteligenceCenter.SecretAgent.SecretAgent;
import com.inteligenceCenter.SecretAgent.Status;

public abstract class ReportingAgent extends SecretAgent {


    protected SecretAgent superior;
    //TO DO
    private String profession;


    public ReportingAgent(String alias, String name, SecretAgent secretAgent) {
        super(alias, name);
        this.status = Status.INACTIVE;
        this.superior = secretAgent;
    }

    public SecretAgent getSuperior() {
        return superior;
    }
}
