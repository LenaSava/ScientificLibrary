package app.servises;

import app.model.entities.ScientificPublication;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class SortByAge {

    public void sortByAge(List<ScientificPublication> publicationList) {
        Collections.sort(publicationList, Comparator.comparingInt(ScientificPublication::getAgeOfPublic));

    }

}
