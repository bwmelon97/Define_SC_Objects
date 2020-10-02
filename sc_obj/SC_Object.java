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
    public SC_Object(final int MAX_HP, final Position ps) {
        this.MAX_HP = MAX_HP;
        this.cur_HP = MAX_HP;
        this.ps = ps;
    }

    /* Static Methods */

    /* Getter, Setter Methods */
    public int getMAX_HP() { return MAX_HP; }
    public int getCur_HP() { return cur_HP; }
    public ProducingCost getPc() { return pc; }
    public Position getPs() { return ps; }
    public Size getSize() { return size; }

    public void setCur_HP(int cur_HP) {
        this.cur_HP = cur_HP;
    }

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