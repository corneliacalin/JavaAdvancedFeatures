//package oop.exceptions;
//
//public class ValueException extends Exception {
//    private double conditie;
//
//    public ValueException(double conditie) {
//        super();
//        this.conditie = conditie;
//    }
//
//    public ValueException() {
//        super();
//    }
//
//    public String getMessage() {
//        String mesaj= "";
//
//        switch ((double)conditie) {
//            case 10:
//                mesaj = "10 Int";
//                break;
//            case 10.0:
//                mesaj = "10.0 Double";
//                break;
//            default:
//                mesaj="Hey! That's not a value! Try once more";
//                break;
//        }
//        return mesaj;
//    }
//
//
//}
