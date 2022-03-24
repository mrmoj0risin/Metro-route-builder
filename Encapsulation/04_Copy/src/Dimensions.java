public class Dimensions {
    private final int lenght;
    private final int height;
    private final int depth;


    Dimensions(int lenght, int height, int depth){
        this.lenght = lenght;
        this.height = height;
        this.depth = depth;

    }

    public int getVolume() {
        return lenght * height * depth;
    }

}
