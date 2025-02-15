public enum Zones {
    SOUTH_SOUTH( "Akwa-Ibom", "Bayelsa", "Cross-River", "Delta", "Edo", "Rivers"),
    NORTH_EAST("Adamawa", "Bauchi", "Borno", "Gombe", "Taraba", "Yobe"),
    NORTH_WEST("Kaduna", "Katsina", "Kano", "Kebbi", "Sokoto", "Jigawa","Zamfara"),
    SOUTH_EAST("Abia", "Anambra", "Ebonyi", "Enugu", "Imo"),
    SOUTH_WEST("Ekiti", "Lagos", "Osun", "Ondo", "Ogun", "Oyo"),
    NORTH_CENTRAL("Benue", "FCT", "Kogi" , "Kwara", "Nasarawa", "Niger","Plateau");
    String[] states;
    Zones(String... zones) {
        this.states = zones;
    }

    public String[] getState() {
        return states;
    }
}


