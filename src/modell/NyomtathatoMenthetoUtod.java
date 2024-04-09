package modell;

import java.io.Serializable;

public class NyomtathatoMenthetoUtod 
        extends EgyikKonkretOs 
        implements Nyomtathato, Serializable{
    
    @Override
    public void nyomtat() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public String mitTud(){
        String os = super.mitTud();
        return os + "<-- Nyomtatható, menthető vagyok";
    }
    
    @Override
    public String toString() {
        String os = super.toString();
        return os + "\n   NyomtathatoMenthetoUtod{ " + '}';
    }
}
