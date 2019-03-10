package app.model.entities;

public class ScientificResearch extends ScientificPublication {
    private String typeOfPublication;
    private String autorName;
    private String title;
    private int ageOfPublic;

    public ScientificResearch(String typeOfPublication, String autorName, String title, int ageOfPublic) {
        this.typeOfPublication = typeOfPublication;
        this.autorName = autorName;
        this.title  = title;
        this.ageOfPublic  = ageOfPublic;
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

    public void setTitle(String name) {
        this.title = title;
    }

    public int getAgeOfPublic() {
        return ageOfPublic;
    }

    public void setAgeOfPublic(int ageOfPublic) {
        this.ageOfPublic = ageOfPublic;
    }

    public String getLink() {
        return Monograph.getLink();
    }

    @Override
    public String toString() {
        return "Type of Publication: " + getTypeOfPublication() +
                ", Autors name are " + getName() + '\'' +
                ", Title of Publication " + '\"' + getTitle() + '\"' +
                ", age of publication = " + getAgeOfPublic() + " year!" + '\"' +
        ", link on publication is " + getLink();
    }
}
