package effectivejava.chapter2.item2.builder;

public class Main {

    public static void main(String[] args) {
        NutritionFacts cocaCola = NutritionFacts.builder(240, 8)
                                                .calories(100)
                                                .sodium(35)
                                                .carbohydrate(27)
                                                .fat(50)
                                                .build();
        System.out.println(cocaCola);
    }

}
