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

        Agent Bond = new Agent("007", "James Bond");
        intelligenceCenter.addAgent(Bond);

        Informer Levente = new Informer("Szmoki", "Big Levente");
        intelligenceCenter.addAgent(Levente);

        Officer Bence = new Officer("emis","Tailor Bence");
        intelligenceCenter.addAgent(Bence);

        Officer SajtÚr = new Officer("Sajtyy", "Sajtos Pál");
        intelligenceCenter.addAgent(SajtÚr);

        Agent Geroge = new Agent("006", "Smith George");
        intelligenceCenter.addAgent(Geroge);

        Agent Ferenc = new Agent("Ferike", "Kovács Ferenc");
        intelligenceCenter.addAgent(Ferenc);

        Informer Patkány = new Informer("Rat", "Patkány Rat");
        intelligenceCenter.addAgent(Patkány);


        Roli.setSuperior(Bence);
        Levente.setSuperior(Roli);

        System.out.println(Roli.getInformers());
        Patkány.setSuperior(Bond);

        System.out.println(intelligenceCenter.getAgents());

        Mission KillThePa = new Mission("KillThePa",calendar, MissionType.PROGRESS);
        Mission FakeMission = new Mission("FakeMission", calendar, MissionType.FAILED);

        Bence.addMissionToOfficer(KillThePa);
        SajtÚr.addMissionToOfficer(FakeMission);


        Bence.controlAgent(KillThePa, Roli);
        Bence.addAgents(Roli);
        Bence.addAgents(Bond);
        Bond.setCompromised(true);
        Ferenc.setCompromised(true);
        Geroge.setCompromised(true);
        Roli.liquidate(Bond);
        Roli.liquidate(Ferenc);
        System.out.println("első get" + Roli.getNumberOfLiquidate());
        Roli.liquidate(Geroge);

        Roli.getNumberOfLiquidate();

        System.out.println("masodik get" + Roli.getNumberOfLiquidate());

        System.out.println(Roli.getInformers());

        Roli.retire();



        System.out.println(Roli.toString());





        
    }
}
