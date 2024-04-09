package modell;

public abstract class AbstractOs {
    /* itt is lehetne minden, ami a KonkretOs-ben van */
    
    public void konkretMetodus(){
        System.out.println("Ez egy konkrét metódus, törzse az abstract osztályban van!");
    }
    
    public abstract void abstractMetodus();
}
