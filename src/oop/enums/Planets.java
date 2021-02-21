package oop.enums;


public enum Planets {
    JUPITER("SMALL", 1000),
    PLUTO("SMALL", 150),
    VENUS("SMALL", 687);
    private String size;
    int distance;


    Planets(String size, int distance) {
        this.size = size;
        this.distance = distance;


    }


    public String getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Planets{" +
                "size='" + size + " " + name() +
                '}';
    }

    public void distanceFromEarth() {
        System.out.println(name()+" "+ distance);
    }


}
