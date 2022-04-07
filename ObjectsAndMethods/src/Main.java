 class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Milk", 40);
        basket.print("Milk");
        basket.add("Eggs", 200, 2);

        System.out.println("Rounded price " + Basket.calcRoundPrice());

    }
}
