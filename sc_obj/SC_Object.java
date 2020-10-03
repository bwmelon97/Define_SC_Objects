package sc_obj;

public class SC_Object {

    /* Props */
    protected int cur_HP;               // 현재 체력
    protected Position ps;              // 위치
    // 세력

    /* Constructor */
    public SC_Object(final Position ps) {
        this.ps = ps;
    }

    /* Static Methods */

    /* Getter, Setter Methods */
    public int getCur_HP() { return cur_HP; }
    public Position getPs() { return ps; }

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