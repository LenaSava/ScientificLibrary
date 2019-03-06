package app.model;
import app.entities.ScientificPublication;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Model {
    private static Model instance = new Model();

    private List<ScientificPublication> model;

    public static Model getInstance() {
        return instance;
    }

    private Model() {
        model = new ArrayList<>();
    }

    public void add(ScientificPublication scientificPublication) {
        model.add(scientificPublication);
    }

    public List<String> list() {
        return model.stream()
                .map(ScientificPublication::getName)
                .collect(Collectors.toList());
    }
}
