public class MyNumberRunner {
  public static void main(String[] args) {
    MyNumber number = new MyNumber(6);

    boolean isPrime = number.isPrime();
    System.out.println("isPrime " + isPrime);
    
    int sum = number.sumUptoN();
    System.out.println("sum " + sum);

    int sumOfDivisors = number.sumOfDivisors();
    System.out.println("sumOfDivisors " + sumOfDivisors);

    number.printNumberTriangle();
    
  }
}
class MyNumber{
  private int number;
  public MyNumber(int number){
    this.number = number;
  }

  public boolean isPrime(){
    // 2 to number-1
    //How can check if a number is divisible by 2?

    if(number < 2){
      return false;
    }

    for (int i = 2; i <= number - 1; i++){
      if (number % i == 0){
        return false;
      }
    }  

    return true;
  }
  public int sumUptoN(){
    // 1+2+3+..+number
    int sum = 0;
    for (int i=1;  i<= number; i++){
      sum += i;
    }
    return sum;
  }

  public int sumOfDivisors(){
    // 6 except 1, 6 => 2, 3 
    int sum = 0;
    for (int i=2;  i<= number-1; i++){
      if(number%i==0){
        sum += i;
      }
    }
    return sum;
  }

  public void printNumberTriangle(){
    for(int i=1; i<=number; i++){
      for(int j=1; j<=i; j++){
        System.out.print(j + " ");
      }
      System.out.println();
    }

  }
}