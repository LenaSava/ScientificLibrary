package app.entities;

public class Monograph extends ScientificPublication {
    private String autorName = "Anton";
    private String autorLastname = "Leon";
    private String title = "Планеты и бытие";
    private String ageOfPublic = "1945";

//    public Monograph() {
//        this.autorName = autorName;
//        this.autorLastname = autorLastName;
//        this.title = "Планеты и бытие";
//        this.ageOfPublic = "1945";
//    }

    public String getName() {
        return autorName;
    }

    public void setName(String name) {
        this.autorName = autorName;
    }

    public String getLastName() {
        return autorLastname;
    }

    public void setLastname(String name) {
        this.autorLastname = autorLastname;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String name) {
        this.title = title;
    }

    public String getAgeOfPublic() {
        return ageOfPublic;
    }

    public void setAgeOfPublic(String ageOfPublic) {
        this.ageOfPublic = ageOfPublic;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        ScientificPublications scientificPublications = (ScientificPublications) o;
//
//        if (autorName != null ? !autorName.equals(scientificPublications.autorName) : scientificPublications.autorName != null) return false;
//        return ageOfPublic != null ? ageOfPublic.equals(scientificPublications.ageOfPublic) : scientificPublications.ageOfPublic == null;
//
//    }
//
//    @Override
//    public int hashCode() {
//        int result = autorName != null ? autorName.hashCode() : 0;
//        result = 31 * result + (ageOfPublic != null ? ageOfPublic.hashCode() : 0);
//        return result;
//    }

}
