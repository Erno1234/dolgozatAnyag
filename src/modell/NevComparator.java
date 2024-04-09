package modell;

import java.text.Collator;
import java.util.Comparator;

public class NevComparator implements Comparator<RendezhetoUtod>{

    @Override
    public int compare(RendezhetoUtod o1, RendezhetoUtod o2) {
        /* Ékezetekhez: */
        Collator collator = Collator.getInstance();
        return collator.compare(o1.getNev(), o2.getNev());
        
        /* nem jó ékezetek: */
        //return o1.getNev().compareTo(o2.getNev());
    }
    
}
