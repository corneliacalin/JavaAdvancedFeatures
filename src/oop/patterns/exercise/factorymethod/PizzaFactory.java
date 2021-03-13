package oop.patterns.exercise.factorymethod;

public class PizzaFactory {
public Pizza getPizza(int number){
    if(number==1) {
        return new Capriciosa();
    }
    if(number==2){
        return new Margherita();
    }
return new FruttideMare();
}
}
