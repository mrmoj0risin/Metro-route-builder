public class Arithmetic {
    private int x;
    private int y;

    public Arithmetic(int x, int y) {

        this.x = x;
        this.y = y;


    }

    public int getSum(){
        return this.y + this.x;
    }

    public int getMulti(){
        return this.y * this.x;
    }

    public int getMax(){
        return Math.max(this.y, this.x);
    }

    public int getMin(){
        return Math.min(this.y, this.x);
    }
}
