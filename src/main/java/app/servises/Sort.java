package app.servises;

import app.model.entities.ScientificPublication;
import java.util.List;

public interface Sort {
    void sortBySize(List<ScientificPublication> publicationList);
}
