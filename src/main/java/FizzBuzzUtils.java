public class FizzBuzzUtils {

    public boolean isMultipleByThree(int num){

        return (num % 3 == 0);
    }

    public boolean isMultipleByFive(int num){

        return (num % 5 == 0);
    }

	public boolean isMultipleByThreeAndFive(int num) {

        return (isMultipleByThree(num) && isMultipleByFive(num));
    }
}