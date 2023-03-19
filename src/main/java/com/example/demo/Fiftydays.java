package com.example.demo;

import java.util.ArrayList;

public class Fiftydays {

    private final ArrayList<Hymn> fiftyDaysHymns;

    public Fiftydays() {

        this.fiftyDaysHymns = new ArrayList<Hymn>();
        this.fiftyDaysHymns.add(new Hymn("All You Heavenly", "6:32", "soundCloudLink",
                "pathToStorage", "musicNotes"));
        this.fiftyDaysHymns.add(new Hymn("Christ is Risen(Major)", "3:52", "soundCloudLink",
                "pathToStorage", "musicNotes"));
    }

    public ArrayList<Hymn> getFifty_Days() {
        return fiftyDaysHymns;
    }

}
