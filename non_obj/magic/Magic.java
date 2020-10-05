package non_obj.magic;

import sc_obj.Position;

public abstract class Magic {
    /* private static final int RANGE = 해당 마법을 사용할 수 있는 사거리 */
    protected final int ENERGY_COST; 
    Position castingPoint;

    public Magic (final int ENERGY_COST) {
        this.ENERGY_COST = ENERGY_COST;
    }

    public int getENERGY_COST() { return ENERGY_COST; }

    public abstract void useMagic();
}