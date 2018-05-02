public class FizzBuzz{

    public boolean isMultipleByThree(int num){
        return (num % 3 == 0);
    }

    public boolean isMultipleByFive(int num){
        return (num % 5 == 0);
    }

	public boolean isMultipleByThreeAndFive(int num) {
		return (isMultipleByThree(num) && isMultipleByFive(num));
    }
    
    public void main(String[] args) {
        String msgReturn;
        for(int i = 1; i <= 100; i++){
            if(isMultipleByThreeAndFive(i)){
                msgReturn = "FizzBuzz";
            }else if(isMultipleByFive(i)){
                msgReturn = "Buzz";
            }else if(isMultipleByThree(i)){
                msgReturn = "Fizz";
            }else{
                msgReturn = Integer.toString(i);
            }
            System.out.println(msgReturn);
        }
    }
}