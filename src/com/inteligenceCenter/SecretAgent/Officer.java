package com.inteligenceCenter.SecretAgent;

import com.inteligenceCenter.IntelligenceCenter;
import com.inteligenceCenter.SecretAgent.Mission.Mission;
import com.inteligenceCenter.SecretAgent.ReportingAgent.Agent;
import com.inteligenceCenter.SecretAgent.ReportingAgent.Informer;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Officer extends SecretAgent{

    private Aliasprovider intelligenceCenter;
    private List<Mission> missions = new ArrayList<>();
    private Set<Agent> agents = new HashSet<>();

    public Officer(String alias, String name, IntelligenceCenter intelligenceCenter) {
        super(alias, name);
        this.status = Status.ACTIVE;
        this.intelligenceCenter = intelligenceCenter;
    }

    public Aliasprovider getIntelligenceCenter() {
        return intelligenceCenter;
    }

    public void addMissionToOfficer(Mission mission){
        this.missions.add(mission);
    }

    public void addAgents(Agent agent){
        if(agent.getSuperior() == null || agent.getSuperior().equals(this)){
            this.agents.add(agent);
            System.out.println("hozzáadva");
        }
        else{
            System.out.println("addAgent HIBA !!!");
        }
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


}
