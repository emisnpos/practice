package com.inteligenceCenter;

import com.inteligenceCenter.SecretAgent.Mission.Mission;
import com.inteligenceCenter.SecretAgent.Mission.MissionType;
import com.inteligenceCenter.SecretAgent.Officer;
import com.inteligenceCenter.SecretAgent.ReportingAgent.Agent;
import com.inteligenceCenter.SecretAgent.ReportingAgent.Informer;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {

        IntelligenceCenter intelligenceCenter = new IntelligenceCenter();

        Calendar calendar = new GregorianCalendar(2013,1,28,13,24,56);

        Agent Roli = new Agent("Troll", "Fisher Roland");
        intelligenceCenter.addAgent(Roli);

        Informer Levente = new Informer("Szmoki", "Big Levente");
        intelligenceCenter.addAgent(Levente);

        Officer Bence = new Officer("emis","Tailor Bence");
        intelligenceCenter.addAgent(Bence);

        Officer SajtÚr = new Officer("Sajtyy", "Sajtos Pál");
        intelligenceCenter.addAgent(SajtÚr);



        Roli.setSuperior(Bence);
        Levente.setSuperior(Roli);

        Mission KillThePa = new Mission("KillThePa",calendar, MissionType.PROGRESS);
        Mission FakeMission = new Mission("FakeMission", calendar, MissionType.FAILED);

        Bence.addMissionToOfficer(KillThePa);
        SajtÚr.addMissionToOfficer(FakeMission);


        Bence.controlAgent(KillThePa, Roli);
        System.out.println(Bence.toString());

        System.out.println(Roli.toString());





        
    }
}
