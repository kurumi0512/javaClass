public class TruthTable {
    public static void main(String[] args) {
        System.out.println("AND 邏輯計算");
        System.out.println("true & true = " + (true & true));
        System.out.println("true & false = " + (true & false));
        System.out.println("false & true = " + (false & true));
        System.out.println("false & false = " + (false & false));

        System.out.println("OR 邏輯計算");
        System.out.println("true | true = " + (true | true));
        System.out.println("true | false = " + (true | false));
        System.out.println("false | true = " + (false | true));
        System.out.println("false | false = " + (false | false));

        System.out.println("XOR 邏輯計算");
        System.out.println("true ^ true = " + (true ^ true));
        System.out.println("true ^ false = " + (true ^ false));
        System.out.println("false ^ true = " + (false ^ true));
        System.out.println("false ^ false = " + (false ^ false));
    }
}