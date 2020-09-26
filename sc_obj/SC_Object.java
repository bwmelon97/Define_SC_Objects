package sc_obj;

public class SC_Object {

    /* Props */
    protected final int MAX_HP;         // 최대 체력
    protected int cur_HP;               // 현재 체력
    // 세력
    protected ProducingCost pc;         // 생산 비용
    protected Position ps;              // 위치
    protected Size size;                // 크기

    /* Constructor */
    SC_Object( final int MAX_HP, final ProducingCost pc, final Position ps, final Size size) {
        this.MAX_HP = MAX_HP;
        this.pc = pc;
        this.ps = ps;
        this.size = size;
    }

    /* Static Methods */

    /* Getter, Setter Methods */
    public int getMAX_HP() { return MAX_HP; }
    public int getCur_HP() { return cur_HP; }
    public ProducingCost getPc() { return pc; }
    public Position getPs() { return ps; }
    public Size getSize() { return size; }

    /* Instance Methods */
    
    /* 죽음 메서드 */
    public void expire() {
        /* Commander의 SC_Object_List에서 제거됨 */
    }
    /* 선택되기 메서드 */
    public void beSelected() {
        /* Commnader의 선택된 오브젝트로 들어감 */
    }
}



/* 해당 SC_Object를 생성하는 데 필요한 비용 */
class ProducingCost {
    final private int mineral, gas, ptime;

    ProducingCost(final int mineral, final int gas, final int ptime) {
        this.mineral = mineral;
        this.gas = gas;
        this.ptime = ptime;
    }

    public int getMineral() { return mineral; }
    public int getGas() { return gas; }
    public int getPTime() { return ptime; }
}

/* SC_Object의 위치 값 */
class Position {
    private int x, y;

    Position(final int x, final int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() { return x; }
    public int getY() { return y; }
    public void setX(final int x) { this.x = x; }
    public void setY(final int y) { this.y = y; }
}

/* SC_Object의 크기 */
class Size {
    private final int width, length;

    Size(final int width, final int length) {
        this.width = width;
        this.length = length;
    }

    public int getWidth() { return width; }
    public int getLength() { return length; }
}