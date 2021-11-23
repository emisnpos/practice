package com.inteligenceCenter.SecretAgent;

import com.inteligenceCenter.IntelligenceCenter;
import com.inteligenceCenter.SecretAgent.Mission.Mission;
import com.inteligenceCenter.SecretAgent.ReportingAgent.Agent;
import com.inteligenceCenter.SecretAgent.ReportingAgent.Informer;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Officer extends SecretAgent implements OfficersAndAgents{

    private IntelligenceCenter intelligenceCenter;
    private List<Mission> missions = new ArrayList<>();
    private Set<Agent> agents = new HashSet<>();

    public Officer(String alias, String name) {
        super(alias, name);
        this.status = Status.ACTIVE;
    }

    public void addMissionToOfficer(Mission mission){
        this.missions.add(mission);
    }

    public void addAgents(Agent agent){
        this.agents.add(agent);
        // superior beállitás officernek adjuk meg az agentet
    }

    public void controlAgent(Mission currentMission, Agent agent){
        for (Mission mission : missions) {
            if(mission.equals(currentMission)){
                currentMission.setAgent(agent);
                agent.setStatus(Status.ACTIVE);
                Set<Informer> informers = agent.getInformers();
                for (Informer informer : informers) {
                    informer.setStatus(Status.ACTIVE);
                }
            }
            else{
                System.out.println("controlAgent HIBA!");
            }
        }
    };

    @Override
    public void sendMessage() {
    }

    @Override
    public void getAliases() {

    }

    @Override
    public void setIntelligenceCenter() {


    }


    @Override
    public String toString() {
        return "Officer{" +
                "intelligenceCenter=" + intelligenceCenter +
                ", missions=" + missions +
                ", agents=" + agents +
                '}';
    }
}
