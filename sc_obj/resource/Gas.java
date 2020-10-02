package sc_obj.resource;

import sc_obj.*;
import sc_obj.resource.Resource;

public class Gas extends Resource {
    
    private boolean isExhausted;
    private boolean hasStation;
    /* private Commander owner */

    public Gas(Position ps) {
        this(ps, 5000);
    }

    public Gas(Position ps, final int initAmount) {
        super(ps, initAmount);

        Size size = new Size(40, 20);

        this.size = size;
        this.isExhausted = false;
        this.hasStation = false;
        /* this.owner = null */
    }

    public boolean isExhausted() { return isExhausted; }
    public boolean hasStation() { return hasStation; }

    /* 자원 채취됨 메서드 */
    @Override
    public int beExtracted() {
        if( !this.hasStation ) {
            System.out.println("가스 스테이션을 건설해야 합니다.");
            return 0;
        }

        /* 고갈되지 않은 상태 */
        if ( !this.isExhausted ) {
            this.amount = this.amount - 8;  // 8 감소
            /* 채취 이후 0 이하가 된다면 고갈 시키고 남은 양 만큼만 퍼지도록 함 */
            if ( this.amount <= 0 ) {
                int remain = 8 + this.amount;   // amount는 0 또는 음수
                this.amount = 0;
                this.beExhausted();
                return remain;
            }
            return 8;
        }

        /* 고갈된 상태에서는 2를 채취할 수 있음. */
        return 2;
    }

    /* 자원 고갈됨 메서드 */
    @Override
    public void beExhausted() {
        this.isExhausted = true;
    }

    /* 가스 스테이션이 지어짐 메서드 */
    public void buildStation( /* Commander commander */ ) { 
        this.hasStation = true; 
        /* this.owner = commander */
    }

    /* 가스 스테이션 파괴됨 메서드 */
    public void destroyStation() { 
        this.hasStation = false;
        /* this.owner = null */ 
    }
}