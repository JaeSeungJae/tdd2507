package com.ll;

public class Rq {
    private final String cmd;
    public Rq (String cmd) {
        this.cmd = cmd;
    }

    public String getActionName() {
        String[] tempCmd = cmd.split("\\?");
        return tempCmd[0];
    }
}
