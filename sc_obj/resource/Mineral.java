package sc_obj.resource;

import sc_obj.*;
import sc_obj.resource.Resource;

public class Mineral extends Resource {

    private static final Size size = new Size(20, 10);
    
    /* Constructor */
    public Mineral(Position ps, final int initAmount) {
        super(ps, initAmount);
    }
    /* init amount 없는 경우는 1500 */
    public Mineral(Position ps) {
        this(ps, 1500);
    }

    /* Size getter 메서드 */
    public static Size getSize() { return size; }

    /* 자원 채집 메서드 */
    @Override
    public int beExtracted() {
        this.amount = this.amount - 8;      // 현재 양에서 8만큼 줄이기

        /* 8이하 남은 경우 */
        if ( this.amount <= 0 ) {
            int remain = 8 + this.amount;   // amount는 0 또는 음수
            this.amount = 0;
            this.beExhausted();
            return remain;
        }

        return 8;
    }

    /* 자원 고갈됨 메서드 */
	@Override
	public void beExhausted() {
		super.expire();
	}
}