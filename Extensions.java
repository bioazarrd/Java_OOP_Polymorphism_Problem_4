package D_JavaAdvancedOOP.Lecture5_Polymorphism.ExProblem4;

public class Extensions {


    public static InputInterpreter buildInterpreter(CalculationEngine engine) {
        return new InputInterpreter(engine);
    }





}
