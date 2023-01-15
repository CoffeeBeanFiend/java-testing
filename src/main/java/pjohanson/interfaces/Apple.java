package pjohanson.interfaces;

public class Apple implements WithTaste, Comparable {
    int sweetness;
    int sourness;

    public Apple(int sweetness, int sourness) {
        this.sweetness = sweetness;
        this.sourness = sourness;
    }

    public int getSweetness() {
        return sweetness;
    }

    public int getSourness() {
        return sourness;
    }

    public int getValueAsInt() {
        return getSweetness() - getSourness();
    }

    public String toString() {
        return "Sweetness: " + getSweetness() +
                ", Sourness: " + getSourness();
    }
}
