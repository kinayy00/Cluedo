package ch.bbw.yw.Cluedo;

public class Person {

    private String name;

    private String anrede;

    private Color haarfarbe;

    private int alter;

    private String merkmal;

 

    public enum Color {

        RED, BLACK, BLONDE, BROWN, BLUE, GREEN,

    }

 

    public Person(String name, String anrede, Color haarfarbe, int alter, String merkmal) {

        this.name = name;

        this.anrede = anrede;

        this.haarfarbe = haarfarbe;

        this.alter = alter;

        this.merkmal = merkmal;

    }

 

    public String getName() {

        return name;

    }

 

    public void setName(String name) {

        this.name = name;

    }

 

    public String getAnrede() {

        return anrede;

    }

 

    public void setAnrede(String anrede) {

        this.anrede = anrede;

    }

 

    public Color getHaarfarbe() {

        return haarfarbe;

    }

 

    public void setHaarfarbe(Color haarfarbe) {

        this.haarfarbe = haarfarbe;

    }

 

    public int getAlter() {

        return alter;

    }

 

    public void setAlter(int alter) {

        this.alter = alter;

    }

 

    public String getMerkmal() {

        return merkmal;

    }

 

    public void setMerkmal(String merkmal) {

        this.merkmal = merkmal;

    }

}