package sc_obj.common_traits;

import sc_obj.common_traits.Supplier;

public class SupplierImpl implements Supplier {
    
    final int SUPPLY_AMOUNT;

    public SupplierImpl (final int SUPPLY_AMOUNT) {
        this.SUPPLY_AMOUNT = SUPPLY_AMOUNT;
    }

    @Override
    public void supply () {
        /* supply 구현 */
    }
}