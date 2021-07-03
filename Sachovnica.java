
/**
 * Vytvorí šachovnicu podľa zadaného počtu riadkov a stĺpcov (nemusí byť
 * len štvorcová)
 * 
 * @author Adam Parimucha
 * @version 1.0 (1.12.2019)
 */
public class Sachovnica {
    private Policko[][] policka; // dvojrozmerné pole objektov triedy Policko
    /**
     * Vykreslí novú šachovnicu so zadaným počtom riadkov a stĺpcov
     * @param pocetRiadkov počet riadkov šachovnice
     * @param pocetStlpcov počet stĺpcov šachovnice
     */
    public Sachovnica(int pocetRiadkov, int pocetStlpcov) {
        this.policka = new Policko[pocetRiadkov][pocetStlpcov];
        String farba;
        for (int i = 0; i < pocetRiadkov; i++) {
            for (int j = 0; j < pocetStlpcov; j++) {
                if (i % 2 == 0) { //párne riadky začínajú bielou farbou, číslovanie riadkov začína od 0
                    if (j % 2 == 0) {
                        farba = "white";    
                    } else {
                        farba = "black";
                    }
                } else {
                    if (j % 2 == 0) { // nepárne riadky začínajú čiernou farbou
                        farba = "black";    
                    } else {
                        farba = "white";
                    }
                }
                this.policka[i][j] = new Policko(50, j * 50, i * 50, farba);
                this.policka[i][j].zobraz();
            }
        }
    }
    
    /**
     * @return ľavý horný X políčka na pozícii [riadok,stlpec]
     * @param riadok riadok pozície na šachovnici, ktorej X treba zistiť
     * @param stlpec stĺpec pozície na šachovnici, ktorej X treba zistiť
     * 
     */
    public int getLavyHornyX(int riadok, int stlpec) {
        return this.policka[riadok][stlpec].getLavyHornyX();
    }
    
    /**
     * @return ľavý horný Y políčka na pozícii [riadok,stlpec]
     * @param riadok riadok pozície na šachovnici, ktorej Y treba zistiť
     * @param stlpec stĺpec pozície na šachovnici, ktorej Y treba zistiť
     */
    public int getLavyHornyY(int riadok, int stlpec) {
        return this.policka[riadok][stlpec].getLavyHornyY();
    }
    
    /**
     * @return booleanovská hodnota atribútu "navstivene" políčka na pozícii [riadok,stlpec]
     * @param riadok riadok pozície na šachovnici, ktorej navštívenosť treba zistiť
     * @param stlpec stĺpec pozície na šachovnici, ktorej navštívenosť treba zistiť
     */
    public boolean getNavstivene(int riadok, int stlpec) {
        return this.policka[riadok][stlpec].getNavstivene();
    }
    
    /**
     * zmení hodnotu atribútu "navstivene" políčka na pozícii [riadok,stlpec] na true
     * @param riadok riadok pozície na šachovnici, ktorej navštívenosť treba zmeniť
     * @param stlpec stĺpec pozície na šachovnici, ktorej navštívenosť treba zmeniť
     */
    public void setNavstivene(int riadok, int stlpec) {
        this.policka[riadok][stlpec].setNavstivene();
    }
    
    
}
