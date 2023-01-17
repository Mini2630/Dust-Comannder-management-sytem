package Livestock_Register;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class DustCommanderFarm {

    private HashMap<Integer, Livestock> livestockInfo;
    
    public DustCommanderFarm(){
        livestockInfo = new HashMap<>();
    }

    /**
     * @return Collection of all livestock
     */
    public Collection<Livestock> getLivestock() {
        return livestockInfo.values();
    }

    /**
     * @param livestockId
     * @return Livestock Object found with matching ID else it will return null
     */
    public Livestock getLivestockById(int livestockId) {
        return livestockInfo.containsKey(livestockId) ? livestockInfo.get(livestockId) : null;
    }

    /**
     * adds the livestock
     * @param livestock to be added
     */
    public void addLivestock(Livestock livestock){
        this.livestockInfo.put(livestock.getId(), livestock);
    }

    /**
     * @param lineageID
     * @return a list of livestock that have the same lineage
     */
    public List<Livestock> getLineage(int lineageID) {
        return this.livestockInfo.values().stream().filter(LiveStock -> LiveStock.getLineageID() == lineageID).toList();
    }

}


