public class TransportOrder {
    private final Dimensions dimensions;
    private final int weight;
    private final String adress;
    private final boolean isRolling = false;
    private final boolean isFragile = true;
    private final int regNumber;

    public TransportOrder(Dimensions dimensions, int weight, String adress, int regNumber) {
        this.dimensions = dimensions;
        this.weight = weight;
        this.adress = adress;
        this.regNumber = regNumber;
    }

    private TransportOrder setAdress(String adress){
        return new TransportOrder(dimensions, weight, adress, regNumber);
    }

    private TransportOrder setDimension(Dimensions dimensions){
        return new TransportOrder(dimensions, weight, adress, regNumber);
    }

    private TransportOrder setWeight(int weight){
        return new TransportOrder(dimensions, weight, adress, regNumber);
    }
}
