package sc_obj.resource;

import sc_obj.*;
import sc_obj.resource.Resource;

public class Gas extends Resource {
    
    private static final Size size = new Size(40, 20);  // Gas의 사이즈

    private boolean isExhausted;                        // 고갈되었는지 여부
    private boolean hasStation;                         // GasStation을 갖고 있는지
    /* private Commander owner */

    /* Constructor */
    public Gas(Position ps, final int initAmount) {
        super(ps, initAmount);

        this.isExhausted = false;
        this.hasStation = false;
        /* this.owner = null */
    }

    /* init amount를 설정하지 않는 경우는 기본 5000 */
    public Gas(Position ps) {
        this(ps, 5000);
    }


    /* 가스 영역 사이즈 getter 메서드 */
    public static Size getSize() { return size; }

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