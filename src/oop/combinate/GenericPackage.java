package oop.combinate;

public class GenericPackage {
    private final String uniqueId;
    private double weight;
    private String packageName;
    private String courierName;

    public GenericPackage(String uniqueId, double weight, String packageName) {
        this.uniqueId = uniqueId;
        this.weight = weight;
        this.packageName = packageName;
    }

    public GenericPackage(String uniqueId, String packageName) {
        this.uniqueId = uniqueId;
        this.packageName = packageName;
    }

    public String getCourierName() {
        return courierName;
    }

    public void setCourierName(String courierName) {
        this.courierName = courierName;
    }

    public String getPackageName() {
        return packageName;
    }

    public void addItem(double weight) {
        this.weight += weight;
    }



    public String computeDetails() {
        String text = "Pachetul " + this.packageName + " avand codul " + this.uniqueId + " si greutatea " + this.weight + " apartine curierului " + this.courierName;
        return text;
    }



}
