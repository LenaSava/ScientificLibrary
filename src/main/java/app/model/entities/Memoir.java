package app.model.entities;

public class Memoir extends ScientificPublication {
    private String typeOfPublication;
    static String autorName;
    private int ageOfPublic;

    public Memoir(String typeOfPublication, String autorName, int ageOfPublic) {
        this.typeOfPublication = typeOfPublication;
        this.autorName = autorName;
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


    public int getAgeOfPublic() {
        return ageOfPublic;
    }

    public void setAgeOfPublic(int ageOfPublic) {
        this.ageOfPublic = ageOfPublic;
    }


    @Override
    public String toString() {
        return "Type of Publication: " + getTypeOfPublication() +
                ", Autor name is " + getName() + '\'' +
                ", age of publication = " + getAgeOfPublic() + " year!";
    }

}
