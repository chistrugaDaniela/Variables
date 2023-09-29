import variables.Variables;

public class Main {
    public static void main(String[] args) {
        Variables variables = new Variables();
        System.out.println("Current World Population - " + variables.currentWorldPopulation);
        System.out.println("Cars Produced This Year - " + variables.carsProducedThisYear);
        System.out.println("First Letter In Alphabet - " + variables.firstLetterInAlphabet);
        System.out.println("Java is amazing - " + variables.javaIsAmazing);
        System.out.println("Pi - " + variables.pi);
    }
}