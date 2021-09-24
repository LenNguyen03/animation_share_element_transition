package com.se.animation_share_element_transition;

import java.io.Serializable;

public class Person implements Serializable {

    private String namePerson;
    private String nameSong;
    private int image;

    public Person(String namePerson, String nameSong, int image) {
        this.namePerson = namePerson;
        this.nameSong = nameSong;
        this.image = image;
    }

    public String getNamePerson() {
        return namePerson;
    }

    public void setNamePerson(String namePerson) {
        this.namePerson = namePerson;
    }

    public String getNameSong() {
        return nameSong;
    }

    public void setNameSong(String nameSong) {
        this.nameSong = nameSong;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
