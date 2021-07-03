import java.awt.Rectangle;

/**
 * Štvorec, s ktorým možno pohybovať a nakreslí sa na plátno.
 * z projektu tvaryV2
 * 
 * Trieda Policko je prerobená trieda Stvorec z projektu tvaryv2 na moodli,
 * zmenil som konštruktor tak aby sa dala zadávať strana štvorca, odstránil
 * som metódy na zmenu strany štvorca a posun štvorca a pridal som atribút
 * navstivene,getter a setter na atribut navstivene a metody getLavyHornyX()
 * a getLavyHornyY().
 * 
 * @author  Michael Kolling and David J. Barnes
 * @version 1.0  (15 July 2000)
 */

public class Policko {
    private int strana;
    private int lavyHornyX;
    private int lavyHornyY;
    
    private String farba;
    
    private boolean jeViditelny;
    private boolean navstivene;
    /**
     * Vytvor nový štvorec preddefinovanej farby na preddefinovanej pozícii.
     * @param strana
     * @param lavyHornyX
     * @param lavyHornyY
     * @param farba
     */
    public Policko(int strana, int lavyHornyX, int lavyHornyY, String farba) {
        this.strana = strana;
        this.lavyHornyX = lavyHornyX;
        this.lavyHornyY = lavyHornyY;
        this.farba = farba;
        this.jeViditelny = true;
        this.navstivene = false;
    }

    /**
     * (Štvorec) Zmeň farbu na hodnotu danú parametrom.
     * Nazov farby musí byť po anglicky.
     * Možné farby sú tieto:
     * červená - "red"
     * žltá    - "yellow"
     * modrá   - "blue"
     * zelená  - "green"
     * fialová - "magenta"
     * čierna  - "black"
     */
    public void zmenFarbu(String farba) {
        this.farba = farba;
        this.nakresli();
    }

    /*
     * Draw the square with current specifications on screen.
     */
    private void nakresli() {
        if (this.jeViditelny) {
            Platno canvas = Platno.dajPlatno();
            canvas.draw(this, this.farba,
                        new Rectangle(this.lavyHornyX, this.lavyHornyY, this.strana, this.strana));
        }
    }

    /*
     * Erase the square on screen.
     */
    private void zmaz() {
        if (this.jeViditelny) {
            Platno canvas = Platno.dajPlatno();
            canvas.erase(this);
        }
    }
    
    /**
     * (Štvorec) Zobraz sa.
     */
    public void zobraz() {
        this.jeViditelny = true;
        this.nakresli();
    }
    
    /**
     * (Štvorec) Skry sa.
     */
    public void skry() {
        this.zmaz();
        this.jeViditelny = false;
    }
    
    /**
     * @return vráti ľavý horný X políčka
     */
    public int getLavyHornyX() {
        return this.lavyHornyX;
    }
    
    /**
     * @return vráti ľavý horný Y políčka
     */
    public int getLavyHornyY() {
        return this.lavyHornyY;
    }
    
    /**
     * nastaví atribút políčka "navstivene" na true a zmení jeho farbu
     */
    public void setNavstivene() {
        this.navstivene = true;
        this.zmenFarbu("magenta");
    }
    
    /**
     * @return Vráti true ak bolo políčko navštívené a false ak nie
     */
    public boolean getNavstivene() {
        return this.navstivene;
    }
}
