 class Arithmetic {
    private int x;
    private int y;

     Arithmetic(int x, int y) {

        this.x = x;
        this.y = y;


    }

     int getSum(){
        return this.y + this.x;
    }

     int getMulti(){
        return this.y * this.x;
    }

     int getMax(){
        return Math.max(this.y, this.x);
    }

     int getMin(){
        return Math.min(this.y, this.x);
    }
}
