package oop.enums;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Main {
    public static void main(String[] args) {
        LengthUnit lengthUnit = LengthUnit.CENTIMETER;
        System.out.println(lengthUnit);
        System.out.println(lengthUnit + "has value " + lengthUnit.getValue());
        lengthUnit = LengthUnit.INCH;
        switch (lengthUnit) {
            case METER:
                System.out.println("we have METER");
                break;
            case CENTIMETER:
                System.out.println("we have CENTIMETER");
                break;
            case INCH:
                System.out.println("we have INCH");
                break;
            case FOOT:
                System.out.println("we have FOOT");
                break;
        }
        System.out.println(lengthUnit.name());
        System.out.println("*******");
        for (LengthUnit unit :
                LengthUnit.values()) {
            System.out.println(unit);
        }
        System.out.println("*******");
//    Planets planets =Planets.JUPITER;
        for (Planets planets : Planets.values()) {
            System.out.println(planets);

        }
        Planets.JUPITER.distanceFromEarth();

    }


}
