public class MathOperations {

     String lastOperation = "noOpertations";

    int addition(int x1,int x2){
        lastOperation="add";        
        return x1+x2;
    }
    int subtraction (int y1, int y2){
        lastOperation="sub";        
        return y1-y2;
    }

    double multipication(int z1, int z2){
        
        return z1*z2;
    }

    float division(int a1, int a2){
        
        return a1/a2;
    }

    static int modulus(int b1,int b2){
        
        return b1%b2;
    }
}



class useOps{

    public static void main(String[] args) {
        MathOperations matchOperations = new MathOperations();
        System.out.println(matchOperations.lastOperation);
        System.out.println(matchOperations.addition(20,10));
        System.out.println(matchOperations.subtraction(20,10));
        System.out.println(matchOperations.lastOperation);

        MathOperations matchOperations1 = new MathOperations();
        System.out.println(matchOperations1.lastOperation);
        
    }


}