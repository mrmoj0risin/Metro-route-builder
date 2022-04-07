package ru.skillbox;

 class ArithmeticCalculator {

    private int x;
    private int y;
    private Operation operation;

    public ArithmeticCalculator(int x, int y) {
        this.x = x;
        this.y = y;
    }

     int calculate(Operation operation){

        switch (operation) {
            case ADD -> {
                int res = this.x + this.y;
                System.out.println(res);
                return res;

            }
            case SUBTRACT -> {
                int res = this.x - this.y;
                System.out.println(res);
                return res;
            }
            case MULTIPLY -> {
                int res = this.x * this.y;
                System.out.println(res);
                return res;
            }
            default -> {
                System.out.println("wrong operation");
                return 0;

            }
        }


    }
}
