package Item;

import Character.Pj;

public interface IEquipable {
    int powerAttack();

    int protection();

    int slotSpace();

    void equipBy(Pj pj);

    void unEquipBy(Pj pj);

    int weigthEquip();
}
