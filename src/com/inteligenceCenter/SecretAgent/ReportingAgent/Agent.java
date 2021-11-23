package com.inteligenceCenter.SecretAgent.ReportingAgent;

import com.inteligenceCenter.IntelligenceCenter;
import com.inteligenceCenter.SecretAgent.Officer;
import com.inteligenceCenter.SecretAgent.OfficersAndAgents;
import com.inteligenceCenter.SecretAgent.SecretAgent;
import com.inteligenceCenter.SecretAgent.Status;

import java.util.HashSet;
import java.util.Set;

public class Agent extends ReportingAgent implements OfficersAndAgents {

    private int numberOfLiquidate;
    private boolean compromise;
    private Set<Informer> informers = new HashSet<>();
    private IntelligenceCenter intelligenceCenter;

    public Set<Informer> getInformers() {
        return informers;
    }



    public Agent(String alias, String name) {
        super(alias, name);
    }

    public void setSuperior(Officer officer) {
        this.superior = officer;

    }

    public void liquidate(Agent agent){

    }

    @Override
    public void sendMessage() {

    }

    @Override
    public void getAliases() {

    }

    @Override
    public void setIntelligenceCenter() {

    }
}
