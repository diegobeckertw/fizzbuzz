public class FizzBuzz{

    public String convertNumber(int number) {
        FizzBuzzUtils utils = new FizzBuzzUtils();

        if(utils.isMultipleByThreeAndFive(number)) {
            return "FizzBuzz";
        } else if(utils.isMultipleByFive(number)) {
            return "Buzz";
        } else if(utils.isMultipleByThree(number)) {
            return "Fizz";
        }

        return Integer.toString(number);
    }

    public void run(FizzBuzz fizzbuzz, Printer printer) {
        for(int i = 1; i <= 100; i++){
            printer.print(fizzbuzz.convertNumber(i));
        }
    }
    
    public static void main(String[] args) {  
        FizzBuzz fizzbuzz = new FizzBuzz();
        Printer printer = new Printer();
        fizzbuzz.run(fizzbuzz, printer);
    }
}