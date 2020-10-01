package upgrade.stack_upgrade;

import upgrade.Upgrade;

import sc_obj.ProducingCost;

public abstract class StackUpgrade extends Upgrade {
    
    private int curStack;

    public StackUpgrade(ProducingCost cost) {
        super(cost, 3);
        this.curStack = 0;
    }

    public int getCurStack() { return curStack; }
}