package com.footballmanager.models;

public class Team {
    private int intTeamID;
    private String strTeamName;

    public Team(int intTeamID, String strTeamName) {
        this.intTeamID = intTeamID;
        this.strTeamName = strTeamName;
    }

    // Getters and setters
    public int getIntTeamID() { return intTeamID; }
    public void setIntTeamID(int intTeamID) { this.intTeamID = intTeamID; }
    public String getStrTeamName() { return strTeamName; }
    public void setStrTeamName(String strTeamName) { this.strTeamName = strTeamName; }
}
