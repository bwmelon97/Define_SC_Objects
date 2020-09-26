package sc_obj;

/* 해당 SC_Object를 생성하는 데 필요한 비용 */
public final class ProducingCost {
    final private int mineral, gas, ptime;

    public ProducingCost(final int mineral, final int gas, final int ptime) {
        this.mineral = mineral;
        this.gas = gas;
        this.ptime = ptime;
    }

    public int getMineral() { return mineral; }
    public int getGas() { return gas; }
    public int getPTime() { return ptime; }
}