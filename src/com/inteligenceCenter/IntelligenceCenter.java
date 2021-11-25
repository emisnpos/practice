package com.inteligenceCenter;

import com.inteligenceCenter.SecretAgent.Aliasprovider;
import com.inteligenceCenter.SecretAgent.SecretAgent;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class IntelligenceCenter implements Aliasprovider {

    private Set<SecretAgent> agents = new HashSet<>();


    public void addAgent(SecretAgent secretAgent){
        this.agents.add(secretAgent);
    };

    //TO DO
    public void listCompletedMission(){};

    //TO DO
    public void listInProgressOrOverDeadline(){};

    //TO DO
    public void listAgentWhoGoRetirement(){};

    //TO DO
    public void listMostWantedOfficer(){};

    //TO DO
    public Set<String> getAllAliases(){
        return null;
    }

    public Set<SecretAgent> getAgents() {
        return agents;
    }

    @Override
    public void sendMessage(String alias, String message) {
        for (SecretAgent agent : agents) {
            if(agent.getAlias().equals(alias)){
                agent.sendMessage(message);
            }

        }

    }
}
