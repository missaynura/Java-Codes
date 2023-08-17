package question_bank;

public class QB_NestedIfTernary01 {
//------------------ Nested If Ternary ----------------
    /* Chapter 4 QB : Nested If Ternary : Q6
               General Syntax:
               variable = (condition) ? expressionTrue : expressionFalse;
    */
    public static void main(String[] args) {
        //Example 1:
        int y = 11; // x should be 33 because it will be reassigned by y
        int x = y > 5 ? 3 * y : 4 * y;
        System.out.println(x);

        //Example 2:
        String name = "Aynura";
        String cond = name.equals("Aynura") || name.equals("aynura") ? "True" : "False";
        System.out.println(cond);
    }
}
