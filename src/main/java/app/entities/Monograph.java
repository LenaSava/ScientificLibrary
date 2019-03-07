package app.entities;

public class Monograph extends ScientificPublication {
    private String typeOfPublication;
    private String autorName;
    private String autorLastname ;
    private String title;
    private String ageOfPublic;

    public Monograph(String typeOfPublication, String autorName, String autorLastname, String title, String ageOfPublic) {
        this.typeOfPublication = typeOfPublication;
        this.autorName = autorName;
        this.autorLastname = autorLastname;
        this.title = title;
        this.ageOfPublic = ageOfPublic;
    }

    public String getTypeOfPublication() {
        return typeOfPublication;
    }

    public void setTypeOfPublication(String name) {
        this.typeOfPublication = typeOfPublication;
    }

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
    @Override
    public String toString() {
        return super.toString();
    }

}
