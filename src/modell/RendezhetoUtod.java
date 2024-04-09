package modell;

public class RendezhetoUtod implements Comparable<RendezhetoUtod>{
    private int kor;
    private String nev;

    public RendezhetoUtod(int kor, String nev) {
        this.kor = kor;
        this.nev = nev;
    }

    /* Comparator miatt kell */
    public String getNev() {
        return nev;
    }
    
    @Override
    public String toString() {
        return "RendezhetoUtod{" + "kor=" + kor + ", nev=" + nev + '}';
    }

    @Override
    public int compareTo(RendezhetoUtod masik) {
        return this.kor - masik.kor;
    }
}
