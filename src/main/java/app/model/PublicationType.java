package app.model;

import app.model.entities.*;

public enum PublicationType {
    SCIENTIFICRESERCH {
        public ScientificPublication factory() {
            return new ScientificResearch("Scientific Research","Alesha and Ludmila Petrenko", "Love", 23);
        }
    },
    MONOGRAPH {
        public ScientificPublication factory() {
            return new Monograph("Monograph","Artur Pirojkov", "Love", 1935);
        }
    },
    MEMOIR {
        public ScientificPublication factory() {
            return new Memoir("Memoir","Sasha Den", 1905);
        }
    },
    SOURCESTUDY {
        public ScientificPublication factory() {
            return new Sourcestudy("Sourcestudy","Sasha Kiv", 1945);
        }
    };
    public abstract ScientificPublication factory();

//    SCIENTIFICPUBLICATIONS,

//    DOCUMENTARY,

//    SOURCESTUDY
}
