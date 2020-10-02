package sc_obj.resource;

import sc_obj.*;

public abstract class Resource extends SC_Object {
    
    private int amount;          // 자원량

    public Resource(final Position ps, final int initAmount) {
        super(0, ps);
        this.pc = null;
        this.amount = initAmount;
    }

    public int getAmount() { return amount; }

    public abstract void beExhausted();     // 자원 고갈 메서드
}