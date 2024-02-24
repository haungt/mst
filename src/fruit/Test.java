package fruit;

//题目
//1、有一家超市，出售苹果和草莓。其中苹果 8 元/斤，草莓 13 元/斤。
//现在顾客 A 在超市购买了若干斤苹果和草莓，需要计算一共多少钱？
//请编写函数，对于 A 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。
//
//2、超市增加了一种水果芒果，其定价为 20 元/斤。
//现在顾客 B 在超市购买了若干斤苹果、 草莓和芒果，需计算一共需要多少钱？
//请编写函数，对于 B 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。
//
//3、超市做促销活动，草莓限时打 8 折。
//现在顾客 C 在超市购买了若干斤苹果、 草莓和芒果，需计算一共需要多少钱？
//请编写函数，对于 C 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。
//
//4、促销活动效果明显，超市继续加大促销力度，购物满 100 减 10 块。
//现在顾客 D 在超市购买了若干斤苹果、 草莓和芒果，需计算一共需要多少钱？
//请编写函数，对于 D 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。

public class Test {
    public static void main(String[] args) {
        //第一题 苹果 2 斤 草莓 3 斤
        Fruit apple1 = new Fruit(2,8);
        Fruit strawberry1 = new Fruit(3,13);
        Group group1 = new Group();
        group1.addFruit(apple1);
        group1.addFruit(strawberry1);
        System.out.println("第一题的总价："+group1.getTotalPrice());

        //第二题 苹果 2 斤 草莓 3 斤  芒果 5 斤
        Fruit apple2 = new Fruit(2,8);
        Fruit strawberry2 = new Fruit(3,13);
        Fruit mango2 = new Fruit(5,20);
        Group group2 = new Group();
        group2.addFruit(apple1);
        group2.addFruit(strawberry1);
        group2.addFruit(mango2);
        System.out.println("第二题的总价："+group2.getTotalPrice());

        //第三题 苹果 2 斤 草莓 3 斤  芒果 5 斤
        Fruit apple3 = new Fruit(2,8);
        Fruit strawberry3 = new Fruit(3,13,(float) 0.8);
        Fruit mango3 = new Fruit(5,20);
        Group group3 = new Group();
        group3.addFruit(apple3);
        group3.addFruit(strawberry3);
        group3.addFruit(mango3);
        System.out.println("第三题的总价："+group3.getTotalPrice());

        //第四题 苹果 2 斤 草莓 3 斤  芒果 5 斤
        Fruit apple4 = new Fruit(2,8);
        Fruit strawberry4 = new Fruit(3,13);
        Fruit mango4 = new Fruit(5,20);
        Group group4 = new Group(10,100);
        group4.addFruit(apple4);
        group4.addFruit(strawberry4);
        group4.addFruit(mango4);
        System.out.println("第四题的总价："+group4.getTotalPrice());
    }
}
