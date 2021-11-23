package com.inteligenceCenter.SecretAgent.Mission;

import com.inteligenceCenter.SecretAgent.ReportingAgent.Agent;
import com.inteligenceCenter.SecretAgent.ReportingAgent.Informer;
import com.inteligenceCenter.SecretAgent.Status;

import java.util.Calendar;
import java.util.Set;

public class Mission {

    private String codeName;
    private Calendar deadLine;
    private Agent agent;
    private MissionType missionType;


    public Mission(String codeName, Calendar deadLine, MissionType missionType) {
        this.codeName = codeName;
        this.deadLine = deadLine;
        this.missionType = missionType;
    }

    public MissionType getMissionType() {
        return missionType;
    }

    public void setMissionType(MissionType missionType) {
        this.missionType = missionType;
    }

    public void completAMission(){
        this.missionType = MissionType.COMPLETED;
        agent.setStatus(Status.INACTIVE);
        Set<Informer> informers = agent.getInformers();
        for (Informer informer : informers) {
            informer.setStatus(Status.INACTIVE);
        }
    }

    public void setAgent(Agent agent) {
        this.agent = agent;
    }
}
