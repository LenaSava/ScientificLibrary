package app.model;
import app.entities.PublicationFactory;
import app.entities.ScientificPublication;
import app.entities.ScientificResearch;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.lang.String;

public class Model {
    private static Model instance = new Model();

    protected List<ScientificPublication> model = new ArrayList<>();

    public static Model getInstance() {
        return instance;
    }

    public void createLibrary() {
        PublicationFactory factory = new PublicationFactory();

        ScientificPublication scientRes = factory.getPublications(PublicationType.SCIENTIFICRESERCH);
        model.add(scientRes);
        ScientificPublication mono = factory.getPublications(PublicationType.MONOGRAPH);
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
}


