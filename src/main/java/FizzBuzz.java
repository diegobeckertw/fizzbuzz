public class FizzBuzz{

    FizzBuzzUtils utils = new FizzBuzzUtils();

    public String convertNumber(int number) {
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
            // testar se foi chamado
            // usar mock para testar
            // criar uma classe printer para printar 
            System.out.println(fizzbuzz.convertNumber(i));
        }
    }
    
    public static void main(String[] args) {
        
        FizzBuzz fizzbuzz = new FizzBuzz();
        fizzbuzz.run(fizzbuzz);
        
        
    }
}