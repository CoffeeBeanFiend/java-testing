package pjohanson.interfaces;

public class Main {
    public static Comparable findMax(Comparable list[]) {
        Comparable maxComparable = null;
        int maxValue = Integer.MIN_VALUE;

        for (int i = 0; i < list.length; i++) {
            Comparable comparable = list[i];
            int currentValue = comparable.getValueAsInt();
            if (currentValue > maxValue) {
                maxValue = currentValue;
                maxComparable = comparable;
            }
        }

        return maxComparable;
    }

    public static void main(String[] args) {
        Comparable[] listOfWordsWithVolume = {
                new StringVolume("hello"),
                new StringVolume("heLLO"),
                new StringVolume("HELLO"),
                new StringVolume("heLoo"),
        };

        Comparable loudestWord = findMax(listOfWordsWithVolume);

        System.out.println("The loudest word was: " + loudestWord);

        Comparable[] applesAndOranges = {
                new Apple(5, 0),
                new Apple(0, 5),
                new Orange(10, 1, 10),
                new Orange(5, 10, 3),
                new Orange(5, 3, 3),
        };

        Comparable maxByValue = findMax(applesAndOranges);

        System.out.println("The best one is " + maxByValue.getClass().getName() + " with " + maxByValue);

        Human foodTaster = new Human();
        Apple anApple = new Apple(5, 0);
        Orange anOrange = new Orange(4, 4, 5);

        System.out.println("Human tastes an Apple");
        System.out.println(foodTaster.taste(anApple));

        System.out.println("Human tastes an Orange");
        System.out.println(foodTaster.taste(anOrange));
    }
}
