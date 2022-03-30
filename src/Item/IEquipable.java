package Item;

import Inventory.Equipment;

public interface IEquipable {
    int powerAttack();

    int protection();

    int slotSpace();

    void equipBy(Equipment equipment);

    int weigthEquip();
}
