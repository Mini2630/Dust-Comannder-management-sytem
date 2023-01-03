package Livestock_Register;

import java.util.List;

public class DustCommanderFarm {

    private List<Livestock> livestock;
    private List<Lineage> lineage;
    private int immunizations;
    private int births;

    /**
     *
     * @param livestock
     * @param lineage
     */

    public DustCommanderFarm(List<Livestock> livestock, List<Lineage> lineage) {
        this.livestock = livestock;
        this.lineage = lineage;
        immunizations = 0;
        births = 0;
    }


    public List<Livestock> getLivestock() {
        return livestock;
    }

    /**
     * adds the livestock
     * @param livestock is added
     */
    public void addLivestock(Livestock livestock){
        livestock.add(livestock);
    }

    public List<Lineage> getLineage() {
        return lineage;
    }

    /**
     * adds tp livestock lineage
     * @param lineage adds to the lineage class
     */
    public void addLineage(Lineage lineage) {
        lineage.add(lineage);
    }

    public int getImmunizations() {
        return immunizations;
    }

    public void updateImmunizations(int immunized) {
        immunizations += immunized;
    }

    public int getBirths() {
        return births;
    }

    public void updateBirths(int delivery) {
        births += delivery;
    }
}


