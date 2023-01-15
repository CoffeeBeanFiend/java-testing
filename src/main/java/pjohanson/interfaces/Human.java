package pjohanson.interfaces;

import java.util.ArrayList;

public class Human {
    public String taste(WithTaste objectWithTaste) {
        boolean isSweet = objectWithTaste.getSweetness() > 0;
        boolean isSour = objectWithTaste.getSourness() > 0;

        ArrayList<String> tastes = new ArrayList();

        if (isSweet) {
            tastes.add("sweet");
        }

        if (isSour) {
            tastes.add("sour");
        }

        if (tastes.size() == 0) {
            return "This thing as no taste";
        } else {
            return "This thing is " + String.join(" and ", tastes);
        }
    }
}
