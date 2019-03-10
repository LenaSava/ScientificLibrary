package app.model.entities;

public abstract class ScientificPublication {
    private String typeOfPublication;
    private String autorName;
    private String title;
    private int ageOfPublic;

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

    public int getAgeOfPublic() {
        return ageOfPublic;
    }

    public void setAgeOfPublic(int password) {
        this.ageOfPublic = ageOfPublic;
    }

    @Override
    public String toString() {
        return "Type of Publication: " + getTypeOfPublication();
    }

}