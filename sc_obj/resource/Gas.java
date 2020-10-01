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

        Size size = new Size(200, 100);

        this.size = size;
        this.isExhausted = false;
        this.hasStation = false;
        /* this.owner = null */
    }

    public boolean isExhausted() { return isExhausted; }
    public boolean hasStation() { return hasStation; }

    @Override
    public void beExhausted() {
        this.isExhausted = true;
    }

    public void buildStation( /* Commander commander */ ) { 
        this.hasStation = true; 
        /* this.owner = commander */
    }

    public void destroyStation() { 
        this.hasStation = false;
        /* this.owner = null */ 
    }
}