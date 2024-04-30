package LeetCODE;

public class Divide {
        public static int divide(int dividend, int divisor) {
            double result = (dividend / divisor);
            int newresult = (int)result;
            return newresult;
        }
        public static void main(String[] args){
            int dividend=10;
            int divisor=3;
            float result= divide(dividend,divisor);
            System.out.println(result);
        }
    }
