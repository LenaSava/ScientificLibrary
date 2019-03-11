package app.model;
import app.model.entities.ScientificPublication;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.lang.String;

public class CreateLibrary {
    private static CreateLibrary instance = new CreateLibrary();
    protected List<ScientificPublication> model = new ArrayList<>();
    protected List<ScientificPublication> slist = new ArrayList<>();


    public static CreateLibrary getInstance() {
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
//
//
//    public List<ScientificPublication> slist() {
//        listName();
//        return model
//                .stream()
//                .sorted(Comparator.comparing(ScientificPublication::getAgeOfPublic))
//                .collect(Collectors.toList());
//    }

    public List<ScientificPublication> getPublication () {
        return model;
    }

}


