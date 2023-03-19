package com.example.demo;

import java.util.ArrayList;

public class Lent {

    private final ArrayList<Hymn> lentHymns;

    public Lent() {

        this.lentHymns = new ArrayList<Hymn>();
        this.lentHymns.add(new Hymn("Meghalo", "10:32", "soundCloudLink",
                "pathToStorage", "musicNotes"));
        this.lentHymns.add(new Hymn("Onishti", "12:52", "soundCloudLink",
                "pathToStorage", "musicNotes"));
    }

    public ArrayList<Hymn> getLent() {
        return lentHymns;
    }

}