package app.servises;

import app.entities.ScientificPublication;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortClass {

    public void sortByAge(List<ScientificPublication> publicationListList) {
        Collections.sort(model, Comparator.comparingInt(ScientificPublication::getAgeOfPublic));

    }
}
