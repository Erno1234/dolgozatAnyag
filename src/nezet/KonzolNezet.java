package nezet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import modell.EgyikKonkretOs;
import modell.MenthetoUtod;
import modell.NevComparator;
import modell.Nyomtathato;
import modell.NyomtathatoMenthetoUtod;
import modell.NyomtathatoUtod;
import modell.RendezhetoUtod;
import modell.SajatException;
import modell.Tartalmazo;

public class KonzolNezet {

    private List<EgyikKonkretOs> mindenki;
    private List<Nyomtathato> nyomtathatoak;
    
    public KonzolNezet() {
        mindenki = new ArrayList<>();
        nyomtathatoak = new ArrayList<>();
        
        feltoltMindenki();
        feltoltNyomtathato();
        
        kivetelKezeles();
        
        rendezesBemutatasa();
        
        tartalmazoBemutatasa();
    }

    private void feltoltMindenki() {
        EgyikKonkretOs ko1 = new EgyikKonkretOs();
        mindenki.add(ko1);
        mindenki.add(new EgyikKonkretOs(true));
        
        mindenki.add(new MenthetoUtod("Menthető-1"));
        mindenki.add(new MenthetoUtod("Menthető-2", true));
        
        mindenki.add(new NyomtathatoUtod());
        mindenki.add(new NyomtathatoUtod());
        
        mindenki.add(new NyomtathatoMenthetoUtod());
        mindenki.add(new NyomtathatoMenthetoUtod());
    }
    
    private void feltoltNyomtathato() {
        for (EgyikKonkretOs ko : mindenki) {
            if(ko instanceof Nyomtathato){
                nyomtathatoak.add((Nyomtathato) ko);
            }
        }
    }

    public void kiirMindenkit(){
        for (EgyikKonkretOs os : mindenki) {
            System.out.println(os);
        }
    }
    
    public void kiirNyomtathatok(){
        for (Nyomtathato ny : nyomtathatoak) {
            System.out.println(((EgyikKonkretOs)ny).mitTud());
        }
    }

    public void kivetelKezeles() {
        EgyikKonkretOs k0 = null;
        EgyikKonkretOs k1=null, k2=null,k3=null;
        try {
            k0 = new EgyikKonkretOs();
            k1 = new EgyikKonkretOs(false);
            k2 = new EgyikKonkretOs(false, "ez az infó szövege");
            
            /* a kivétel kiváltása: */
            k3 = new EgyikKonkretOs(false, "i");
            
            /* a kivétel után nem fut a kód! */
            System.out.println("k0" + k0);
            System.out.println("k1" + k1);
            System.out.println("k2" + k2);
        } catch (SajatException e) {
            System.err.println("Csak akkor van kivétel, ha rossz az info");
            System.err.println("k3 dob kivételt:");
            System.err.println(e.getMessage());
            System.err.println("A k3 nem jött létre!!!");
            /* lehetne hiba kezelése, de
            akkor ne írjuk ki, hogy k3 nem jött létre: */
            //k3 = new KonkretOs();
        }
        finally{
            System.out.println("k0" + k0);
            System.out.println("k1" + k1);
            System.out.println("k2" + k2);
            System.out.println("k3" + k3);
        }
    }

    public void rendezesBemutatasa() {
        RendezhetoUtod r4 = new RendezhetoUtod(4, "Pál");
        RendezhetoUtod r0 = new RendezhetoUtod(0, "Ede");
        RendezhetoUtod r3 = new RendezhetoUtod(3, "Xénia");
        RendezhetoUtod r2 = new RendezhetoUtod(2, "Anna");
        RendezhetoUtod r5 = new RendezhetoUtod(5, "István");
        RendezhetoUtod r1 = new RendezhetoUtod(1, "Peti");
        
        
        List<RendezhetoUtod> utodok = new ArrayList<>();
        utodok.add(r4);
        utodok.add(r0);
        utodok.add(r3);
        utodok.add(r2);
        utodok.add(r5);
        utodok.add(r1);
        listaKiirasa("Eredeti:", utodok);
        rendezesKorSzerint(utodok);
        listaKiirasa("Kor szerint rendezve:", utodok);
        rendezesNevSzerint(utodok);
        listaKiirasa("Név szerint rendezve:", utodok);
    }

    private void rendezesKorSzerint(List<RendezhetoUtod> utodok) {
        Collections.sort(utodok);
    }

    private void listaKiirasa(String cim, List<RendezhetoUtod> utodok) {
        System.out.println(cim);
        for (RendezhetoUtod u : utodok) {
            System.out.println(u);
        }
    }

    private void rendezesNevSzerint(List<RendezhetoUtod> utodok) {
        //Collections.sort(utodok, new NevComparator());
        utodok.sort(new NevComparator());
    }

    public void tartalmazoBemutatasa() {
        System.out.println("Tartalmazó által tartalmazott objektumok és metódusaik:");
        new Tartalmazo();
    }
}
