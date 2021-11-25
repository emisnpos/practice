package com.inteligenceCenter.SecretAgent.ReportingAgent;

import com.inteligenceCenter.SecretAgent.SecretAgent;

public class Informer extends ReportingAgent{


    public Informer(String alias, String name, Agent agent) {
        super(alias, name, agent);
        agent.addInformer(this);
    }

    public void setSuperior(Agent agent) { // ez fölösleges és beletudjuk építeni a constructorba
        this.superior = agent;
        agent.addInformer(this);
    }





}
