package fruit;

public class Fruit implements  FruitInterface{
    private int weight;
    private int price ; //
    private float discount ; //折扣

    public Fruit(int weight, int price) {
        this.weight = weight;
        this.price = price;
    }
    public Fruit(int weight, int price,float discount) {
        this.weight = weight;
        this.price = price;
        this.discount = discount;
    }

    @Override
    public float getTotalPrice() {
        return discount==0 ?  weight*price : weight*price*discount;
    }
}
