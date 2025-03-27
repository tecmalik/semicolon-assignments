package data.models;

public class Profile {
    private Height height;
    private Gender gender;
    private Weight weight;

    public Profile(Height height, Gender gender, Weight weight) {
        this.height = height;
        this.gender = gender;
        this.weight = weight;
    }

    public Height getHeight() {
        return height;
    }

    public void setHeight(Height height) {
        this.height = height;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Weight getWeight() {
        return weight;
    }

    public void setWeight(Weight weight) {
        this.weight = weight;
    }


}
