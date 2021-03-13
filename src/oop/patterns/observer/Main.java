package oop.patterns.observer;

public class Main {
    public static void main(String[] args) {
        Subject smiley = new Subject("Smiley");
        Subject delia = new Subject("Delia");
        Observer bogdan = new Observer("Bogdan");
        Observer dorina = new Observer("Dorina");
        Observer costel = new Observer("Costel");
        Observer adi = new Observer("Adi");
        Observer elena = new Observer("Elena");
        Observer hater = new Hater("Hater Donald");
        hater.follow(delia);
        bogdan.follow(smiley);
        dorina.follow(smiley);
        costel.follow(delia);
        adi.follow(smiley);
        elena.follow(delia);
        smiley.postUpdate("Piesa noua smiley");
        delia.postUpdate("Peisa noua delia");
        elena.unfollow(delia);
        delia.postUpdate("Piesa noua");


    }
}
