package sc_obj.building.building_traits;

import sc_obj.building.building_traits.Liftable;

public class LiftableImpl implements Liftable {
    
    /* 건물을 띄우고 착륙시키는 동작에 걸리는 시간은 고려 X */

    private boolean isLift;     // 건물이 띄워져 있는 지 여부

    public LiftableImpl() {
        this.isLift = false;
    }

    public boolean isLift() { return isLift; }

    /* 띄우기 메서드 */
    @Override
    public void lift() {
        this.isLift = true;
    }

    /* 움직이기 메서드 */
    @Override
    public void move() {
        if ( !this.isLift ) {
            System.out.println("건물이 띄어져 있지 않은 상태에서는 움직일 수 없습니다.");
            return;
        }
        /* move 구현 */
    }

    /* 멈추기 메서드 */
    @Override
    public void stop() {
        if ( !this.isLift ) {
            System.out.println("건물이 띄어져 있지 않습니다.");
            return;
        }
        /* stop 구현 */
    }

    /* 착륙하기 메서드 */
    @Override
    public void land() {
        this.isLift = false;
    }
}