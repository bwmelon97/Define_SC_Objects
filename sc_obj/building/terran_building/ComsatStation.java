package sc_obj.building.terran_building;

import java.util.ArrayList;

import non_obj.magic.Magic;
import non_obj.magic.location_magic.ScannerSweep;
import sc_obj.*;
import sc_obj.building.building_traits.*;
import sc_obj.building.terran_building.TerranBuilding;
import sc_obj.common_traits.*;


public final class ComsatStation extends TerranBuilding 
implements Addon, Magician, Repairable
{
    public static final int MAX_HP = 500;
    public static final ProducingCost pc = new ProducingCost(50, 50, 40);
    public static final Size size = Addon.ADDON_SIZE;

    MagicianImpl m = new MagicianImpl();

    /* Consturctor */
    public ComsatStation ( Position ps ) {
        super(ps);
        m.addMagicList(new ScannerSweep());
    }

    public static boolean isBuildable( Position ps ) {
        return Addon.isBuildable(ps);
    }

    @Override
    public int getCurMP() { return m.getCurMP(); }
    public ArrayList<Magic> getMagicList() { return m.getMagicList(); }
    public void addMagicList(Magic magic) { m.addMagicList(magic); }
    public void fillMP() { m.fillMP(); }
    public boolean useMagic(Magic magic) { return m.useMagic(magic); }
}
