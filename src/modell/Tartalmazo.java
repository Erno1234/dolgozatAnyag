package modell;

import java.util.ArrayList;

public class Tartalmazo {
    private EgyikKonkretOs e;
    private MasikKonkretOs m;
    private ArrayList<AbstractOs> lista;

    public Tartalmazo() {
        e = new EgyikKonkretOs();
        m = new MasikKonkretOs();
        /* ha ez nincs, akkor NullPointerException: */
        lista = new ArrayList<>();
        
        lista.add(e);
        lista.add(m);
        lista.add(new EgyikKonkretOs(true));
        lista.add(new EgyikKonkretOs(false, "egy konkrét ős"));
        kiiras();
    }

    private void kiiras() {
        for (AbstractOs os : lista) {
            os.konkretMetodus();
            os.abstractMetodus();
        }
    }
    
    
}
