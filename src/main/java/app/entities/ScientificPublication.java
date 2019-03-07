package app.entities;

public abstract class ScientificPublication {
    private String typeOfPublication;
    private String autorName;
    private String title;
    private String ageOfPublic;

    public ScientificPublication() {
        this.typeOfPublication = typeOfPublication;
        this.autorName = autorName;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAgeOfPublic() {
        return ageOfPublic;
    }

    public void setAgeOfPublic(String password) {
        this.ageOfPublic = ageOfPublic;
    }

    @Override
    public String toString() {
        return "Type of Publication: " + getTypeOfPublication();
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        ScientificPublication scientificPublication = (ScientificPublication) o;
//
//        if (name != null ? !name.equals(scientificPublication.name) : scientificPublication.name != null) return false;
//        return password != null ? password.equals(scientificPublication.password) : scientificPublication.password == null;
//
//    }
//
//    @Override
//    public int hashCode() {
//        int result = name != null ? name.hashCode() : 0;
//        result = 31 * result + (password != null ? password.hashCode() : 0);
//        return result;
//    }
}
