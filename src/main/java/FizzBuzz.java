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

    public void run(FizzBuzz fizzbuzz) {
        for(int i = 1; i <= 100; i++){
            Printer printer = new Printer();
            printer.print(fizzbuzz.convertNumber(i));
        }
    }
    
    public static void main(String[] args) {  
        FizzBuzz fizzbuzz = new FizzBuzz();
        fizzbuzz.run(fizzbuzz);
    }
}