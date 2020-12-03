package com.sammidev.entity;


public enum STATUS {

    A("SANGAT BAIK"),
    B("BAIK"),
    C("LUMAYAN BAIK"),
    D("KURANG BAIK"),
    E("TIDAK BAIK");

    private final String desc;
    STATUS(String desc) {
        this.desc = desc;
    }
}
