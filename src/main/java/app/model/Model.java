package app.model;
import app.entities.Monograph;
import app.entities.ScientificPublication;
import app.entities.ScientificResearch;
import app.model.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.lang.String;

public class Model {
    private static Model instance = new Model();
    protected List<ScientificPublication> model = new ArrayList<>();
    private List<ScientificPublication> sortByAge;


    public static Model getInstance() {
        return instance;
    }

    public void createLibrary() {
        ScientificPublication scientPub = PublicationType.valueOf("SCIENTIFICRESERCH").factory();
        model.add(scientPub);
        ScientificPublication memoir = PublicationType.valueOf("MEMOIR").factory();
        model.add(memoir);
        ScientificPublication mono = PublicationType.valueOf("MONOGRAPH").factory();
        model.add(mono);
    }

    public List<String> listName() {
        createLibrary();
        return model
                .stream()
                .map(ScientificPublication::toString)
                .collect(Collectors.toList());
    }

    public List<ScientificPublication> slist() {
        return model
                .stream()
                .sorted()
                .collect(Collectors.toList());
    }

    public List<ScientificPublication> getSortedListByAge() {
        return sortByAge;
    }
}


