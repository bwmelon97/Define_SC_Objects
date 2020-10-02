package sc_obj.resource;

import sc_obj.*;
import sc_obj.resource.Resource;

public class Mineral extends Resource {

    public Mineral(Position ps) {
        this(ps, 1500);
    }

    public Mineral(Position ps, final int initAmount) {
        super(ps, initAmount);
        Size size = new Size(20, 10);
        this.size = size;
    }

	@Override
	public void beExhausted() {
		super.expire();
	}
}