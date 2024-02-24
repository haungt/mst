package fruit;


import java.util.ArrayList;
import java.util.List;

public class Group implements FruitInterface {
    private List<FruitInterface> list = new ArrayList<>();
    private  float fullReduction ; //满减的折扣
    private  float full; //满减的基数

    public Group() {
    }

    public Group(float fullReduction, float full) {
        this.fullReduction = fullReduction;
        this.full = full;
    }

    public void  addFruit(FruitInterface fruitInterface ){
        list.add(fruitInterface);
    }
    public void  delFruit(FruitInterface fruitInterface ){
        list.remove(fruitInterface);
    }
    @Override
    public float getTotalPrice() {
        float tatal =  0 ;
        for(FruitInterface fruitInterface : list){
            tatal += fruitInterface.getTotalPrice();
        }
        if (full!=0&&fullReduction!=0){
            tatal = tatal >= full ? tatal - fullReduction : tatal;
        }
        return tatal;
    }
}
