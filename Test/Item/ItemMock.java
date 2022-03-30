package Item;

import Character.Pj;

public class ItemMock extends Item {
    public boolean callPickUpBy = false;
    public boolean callDropBy = false;

    @Override
    public void pickUpBy(Pj pj) {
        callPickUpBy = true;
    }

    @Override
    public void dropBy(Pj pj) {
        callDropBy = true;
    }
}
