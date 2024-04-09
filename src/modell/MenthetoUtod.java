package modell;

import java.io.Serializable;

public class MenthetoUtod extends EgyikKonkretOs implements Serializable{
    private String leiras;

    public MenthetoUtod(String leiras) {
        this(leiras, false);
    }
    
    public MenthetoUtod(String leiras, boolean van) {
        super(van);
        this.leiras = leiras;
    }

    public String getLeiras() {
        return leiras;
    }

    public void setLeiras(String leiras) {
        this.leiras = leiras;
    }

    @Override
    public String mitTud(){
        String os = super.mitTud();
        return os + "<-- Menthető vagyok";
    }
    
    @Override
    public String toString() {
        String os = super.toString();
        return os + "\n   MenthetoUtod{" + "leiras=" + leiras + '}';
    }

    
}
