 class Basket {

    private static int basketCount = 0;
    private String items = "";
    private int totalPrice = 0;
    private double totalWeight = 0;
    private int limit;
    private static int sumPrice;
    private static int itemsCount;

     Basket() {
        increaseCount(1);
        items = "Список товаров:";
        this.limit = 1000000;
    }

     Basket(int limit) {
        this();
        this.limit = limit;
    }


     Basket(String items, int totalPrice) {
        this();
        this.items = this.items + items;
        this.totalPrice = totalPrice;
    }

     static int getBasketCount() {
        return basketCount;
    }

     static int calcSumPrice(int price, int count ){
        return Basket.sumPrice += price * count;
    }

     static int getSumPrice(){ return Basket.sumPrice;}


     static int calcItemsCount(int item){
        return Basket.itemsCount += item;
    }

     static float calcRoundPrice() {return Basket.sumPrice / Basket.itemsCount;}

     static int getItemsCount(){ return Basket.itemsCount;}


     double getTotalWeight() { return totalWeight; }

     static void increaseCount(int count) {
        Basket.basketCount = Basket.basketCount + count;
    }

     void add(String name, int price) {

        add(name, price, 1);
    }

     void add(String name, int price, int count) {
        boolean error = false;
        if (contains(name)) {
            error = true;
        }

        if (totalPrice + count * price >= limit) {
            error = true;
        }

        if (error) {
            System.out.println("Error occured :(");
            return;
        }

        items = items + "\n" + name + " - " +
            count + " шт. - " + price;
        totalPrice = totalPrice + count * price;

        calcSumPrice(price, count);

        calcItemsCount(count);

    }

     void add(String name, int price, int count, double weight) {
        add(name, price, count);

        this.totalWeight += weight;

    }

     void clear() {
        items = "";
        totalPrice = 0;
    }

     int getTotalPrice() {
        return totalPrice;
    }


     boolean contains(String name) {
        return items.contains(name);
    }

     void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
        }
    }
}
