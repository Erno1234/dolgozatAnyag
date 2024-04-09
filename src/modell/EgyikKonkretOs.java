package modell;

import java.util.Objects;
import java.util.UUID;

public class EgyikKonkretOs extends AbstractOs{
    private UUID id;
    private boolean van;
    private String info;

    public EgyikKonkretOs() {
        /* kostr. hívási lánc: */
        this(false);
    }

    public EgyikKonkretOs(boolean van) {
//        setId();
//        this.van = van;
//        info = "nincs infó";
        /* kostr. hívási lánc: */
        this(van, "nincs infó");
    }

    public EgyikKonkretOs(boolean van, String info) throws SajatException {
        setId();
        this.van = van;
        if(info.length() < 3){
            throw new SajatException("info.length < 3");
            /* ha ez a sor lefutott, akkor innen kiugrik,
            nem fut tovább a metódus
            */
        }
        this.info = info;
    }

    public UUID getId() {
        return id;
    }

    /* beszédesebb név: ujIdGeneralas() */
    public void setId() {
        this.id = UUID.randomUUID();
    }

    public boolean isVan() {
        return van;
    }

    public void setVan(boolean van) {
        this.van = van;
    }

    public String mitTud(){
        return "Konkrét ős vagyok";
    }
    
    @Override
    public String toString() {
        return "KonkretOs{" + "id=" + id + ", van=" + van + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final EgyikKonkretOs other = (EgyikKonkretOs) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public void abstractMetodus() {
        System.out.println("EgyikKonkretOs abstract metódusa,"
                + "törzse a konkrét, megvalósító osztályban van!");
    
    }
    
    
}
