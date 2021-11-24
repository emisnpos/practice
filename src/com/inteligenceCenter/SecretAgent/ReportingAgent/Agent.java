package com.inteligenceCenter.SecretAgent.ReportingAgent;

import com.inteligenceCenter.IntelligenceCenter;
import com.inteligenceCenter.SecretAgent.Officer;
import com.inteligenceCenter.SecretAgent.OfficersAndAgents;

import java.util.HashSet;
import java.util.Set;

public class Agent extends ReportingAgent implements OfficersAndAgents {

    private int numberOfLiquidate;
    private boolean compromised = false;
    private Set<Informer> informers = new HashSet<>();
    private IntelligenceCenter intelligenceCenter;
    private boolean canRetire = false;


    public void addInformer(Informer informer){
        informers.add(informer);
    }

    public Set<Informer> getInformers() {
        return informers;
    }

    public int getNumberOfLiquidate() {
        return numberOfLiquidate;
    }

    public boolean isCompromised() {
        return compromised;
    }

    public void setCompromised(boolean compromised) {
        this.compromised = compromised;
    }

    public Agent(String alias, String name) {
        super(alias, name);
    }

    public void setSuperior(Officer officer) {
        this.superior = officer;
        officer.addAgents(this);

    }

    public void liquidate(Agent agent){
           if(agent.isCompromised()){
               System.out.println(agent + " is dead.");
                numberOfLiquidate += 1;
                transferInformer(agent);
           }
    }

    public void retire(){
        if(numberOfLiquidate == 3){
            canRetire = true;
            System.out.println("Nyugdijba ment: ");
        }
        else {
            System.out.println("retire HIBA!!!");
        }
    }

    public void transferInformer(Agent agent){
        Set <Informer> informersToTransfer = agent.getInformers();
        for (Informer informer : informersToTransfer) {
            informer.setSuperior(this);
            informers.add(informer);
        }

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
