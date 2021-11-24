package com.inteligenceCenter.SecretAgent.ReportingAgent;

public class Informer extends ReportingAgent{

    public Informer(String alias, String name) {
        super(alias, name);
    }


    public void setSuperior(Agent agent) {
        this.superior = agent;
        agent.addInformer(this);
    }





}
