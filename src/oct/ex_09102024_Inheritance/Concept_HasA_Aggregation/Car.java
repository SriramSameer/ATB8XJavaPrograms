package oct.ex_09102024_Inheritance.Concept_HasA_Aggregation;

public class Car {
    // Car Has-A Engine, Tyre
    protected void startCar(){
        new Engine().start();
        new Tyre().rolling();
    }

}
