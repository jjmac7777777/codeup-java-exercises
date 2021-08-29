public class MethodsExercises {

    public static double addMethod(double numOne, double numTwo){
        return numOne + numTwo;

    }

    public static void main(String[] args) {

        System.out.println(addMethod(5, 7));
        System.out.println(addMethod(12.7, 3.3));
        System.out.println(addMethod(39.9, 2.4));
        System.out.println(addMethod(25.5, 7.7));
        System.out.println(addMethod(15.4, 8.8));

        }


    public static double Subtraction(double numOne, double numTwo){
        return numOne - numTwo;
    }

    public static double Multiplication(double numOne, double numTwo){


        double totalAdded = 0;

        for (int i = 0; i < numTwo; i++){
            totalAdded += numOne;
        }

        return totalAdded;
    }

    public static double Division(double numOne, double numTwo){
        return numOne / numTwo;
    }

    public static double Modulus(double numOne, double numTwo){

        if (numTwo == 0){
            return numOne;
        }

        return numOne % numTwo;
    }

    }

