package modell;

public class NyomtathatoUtod extends EgyikKonkretOs implements Nyomtathato{

    @Override
    public void nyomtat() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public String mitTud(){
        String os = super.mitTud();
        return os + "<-- Nyomtatható vagyok";
    }
    
    @Override
    public String toString() {
        String os = super.toString();
        return os + "\n   NyomtathatoUtod{ " + '}';
    }
}
