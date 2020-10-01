package upgrade.ability_upgrade;

import upgrade.Upgrade;

import sc_obj.ProducingCost;

public abstract class AbilityUpgrade extends Upgrade {
    
    private boolean isDone;

    public AbilityUpgrade(ProducingCost cost) {
        super(cost, 1);
        this.isDone = false;
    }

    public boolean isDone() { return this.isDone; }
}