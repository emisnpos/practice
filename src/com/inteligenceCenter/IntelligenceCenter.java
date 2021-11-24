package com.inteligenceCenter;

import com.inteligenceCenter.SecretAgent.SecretAgent;

import java.util.HashSet;
import java.util.Set;

public class IntelligenceCenter {

    private Set<SecretAgent> agents = new HashSet<>();

    public void addAgent(SecretAgent secretAgent){
        this.agents.add(secretAgent);
    };

    public void listCompletedMission(){};

    public void listInProgressOrOverDeadline(){};

    public void listAgentWhoGoRetirement(){};

    public void listMostWantedOfficer(){};

    public Set<String> getAllAliases(){
        return null;
    }

    public Set<SecretAgent> getAgents() {
        return agents;
    }
}
