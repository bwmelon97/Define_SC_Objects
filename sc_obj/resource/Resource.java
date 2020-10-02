package sc_obj.resource;

import sc_obj.*;

public abstract class Resource extends SC_Object {
    
    protected int amount;          // 자원량

    public Resource(final Position ps, final int initAmount) {
        super(0, ps);
        this.pc = null;
        this.amount = initAmount;
    }

    public int getAmount() { return amount; }

    public abstract void beExhausted();     // 자원 고갈 메서드
    public abstract int beExtracted();      // 자원 캐짐 메서드 (채집한 자원량 리턴)
}