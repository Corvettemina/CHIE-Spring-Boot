package com.example.demo;

public class Hymn {

    public String Title;
    public String Length;
    public String soundCloudLink;
    public String pathToStorage;
    public String musicNotes;

    public Hymn(String Title, String Length, String soundCloudLink,
            String pathToStorage, String musicNotes) {
        this.Title = Title;
        this.Length = Length;
        this.soundCloudLink = soundCloudLink;
        this.pathToStorage = pathToStorage;
        this.musicNotes = musicNotes;

    }

}
