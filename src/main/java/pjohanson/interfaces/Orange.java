package pjohanson.interfaces;

public class Orange implements WithTaste, Comparable {
    int sweetness;
    int sourness;
    int peelNutrientIndex;

    public Orange(int sweetness, int sourness, int peelNutrientIndex) {
        this.sweetness = sweetness;
        this.sourness = sourness;
        this.peelNutrientIndex = peelNutrientIndex;
    }

    public int getSweetness() {
        return sweetness;
    }

    public int getSourness() {
        return sourness;
    }


    public int getPeelNutrientIndex() {
        return peelNutrientIndex;
    }

    @Override
    public int getValueAsInt() {
        return getSweetness() + getPeelNutrientIndex() - getSourness();
    }

    public String toString() {
        return "Sweetness: " + getSweetness() +
                ", Sourness: " + getSourness() +
                ", Peel nutrient index: " + getPeelNutrientIndex();
    }
}
