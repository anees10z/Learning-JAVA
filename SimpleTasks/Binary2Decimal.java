package SimpleTasks;

public class Binary2Decimal {
    public static int b2d(String num) {
        int deciNum=0,pow=0;
        int lsDigit;
        for(int i=num.length()-1;i>=0;--i){
            lsDigit=Character.getNumericValue(num.charAt(i));
            deciNum = deciNum + ( lsDigit* (int)Math.pow(2, pow++));
        }
        return deciNum;
    }
    public static void main(String[] args) {
        String binaryStr = "101";
        System.out.println("Decimal = " + b2d(binaryStr));
    }
}
