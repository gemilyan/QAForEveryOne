package HW_8;

    /* Create a public class called Cube without a constructor
    which gets one single private integer variable Side, a getter GetSide()
    and a setter SetSide(int num) method for this property.
    There's no need to check for negative values! Initialise the side to 0. */

public class Cube {
    private int Side = 0;

    public int getSide() {
        return Side;
    }

    public void setSide(int side) {
        Side = side;
    }
}
