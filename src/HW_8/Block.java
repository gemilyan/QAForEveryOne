package HW_8;

    /* Write a class Block that creates a block. The constructor should take an array
     as an argument, this will contain 3 integers of the form [width, length, height]
     from which the Block should be created.
        Define these methods:
        `getWidth()` return the width of the `Block`
        `getLength()` return the length of the `Block`
        `getHeight()` return the height of the `Block`
        `getVolume()` return the volume of the `Block`
        `getSurfaceArea()` return the surface area of the `Block` */

public class Block {
    private int width;
    private int length;
    private int height;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getVolume() {
        return width * length * height;
    }

    public int getSurfaceArea() {
        return 2*(width * length) + 2*(width * height) + 2*(length * height);
    }

    public Block(int[] ints) {
        this.width = ints[0];
        this.length = ints[1];
        this.height = ints[2];
    }

    public static void main(String[] args) {
        Block vahe =  new Block(new int[]{2,2,2});
        System.out.println(vahe.getVolume());
        System.out.println(vahe.getSurfaceArea());
    }
}
