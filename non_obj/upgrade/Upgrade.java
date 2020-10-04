package non_obj.upgrade;

import sc_obj.ProducingCost;

public abstract class Upgrade {
    private ProducingCost cost;
    private int MAX_COUNT;
    /* Commander */

    public Upgrade(ProducingCost cost, int MAX_COUNT) {
        this.cost = cost;
        this.MAX_COUNT = MAX_COUNT;
    }

    public ProducingCost getCost() { return cost; }
    public int getMAX_COUNT() { return MAX_COUNT; }

    abstract public void completeUpgrade(); 
}