package Inventory;

import Character.Pj;
import Item.IEquipable;

public class EquipmentMock extends Equipment {
    public EquipmentMock(Pj pj) {
        super(pj);
    }

    public boolean callEquipIEquipable = false;
    public boolean callUnEquipIEquipable = false;

    @Override

    public void equipIEquipable(IEquipable eqipable) {
        super.equipIEquipable(eqipable);
        callEquipIEquipable = true;
    }

    @Override
    public void unEquipIEquipable(IEquipable eqipable) {
        super.unEquipIEquipable(eqipable);
        callUnEquipIEquipable = true;
    }
}
