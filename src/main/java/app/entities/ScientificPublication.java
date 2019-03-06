package app.entities;

public class ScientificPublication {
    private String autorName;
    private String autorLastname ;
    private String title;
    private String ageOfPublic;

    public ScientificPublication() {
    }

    public ScientificPublication(String autorName, String autorLastname, String title, String ageOfPublic) {
        this.autorName = autorName;
        this.autorLastname = autorLastname;
        this.title = title;
        this.ageOfPublic = ageOfPublic;
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

    public void setLastName(String autorLastname) {
        this.autorLastname = autorLastname;
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
        return "ScientificPublication{" +
                "name='" + autorName + '\'' +
                ", last name is ='" + autorLastname + '\'' +
                "title='" + title + '\'' +
                "age of publication ='" + ageOfPublic + '\'' +
                '}';
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
