package practices.practice04;

public class Q03_Static_Budget {
    //----------------------- Practice ------------------------
    //type a basic home budget
    public static void main(String[] args) {

       Budget father = new Budget();
       father.getSalary(3000);
        System.out.println(Budget.familyBudget); //3000.0
        father.getPocketMoney(500);
        System.out.println(father.pocketMoney);//500.0
        System.out.println(Budget.familyBudget);//2500.0

        Budget mother = new Budget();
        mother.getPocketMoney(1000);
        mother.getSalary(5000);
        System.out.println(Budget.familyBudget);//6500.0
        mother.spendPocketMoney(2000);// this will not work, because she doesn't have that much pocket money

        Budget kid = new Budget();
        kid.getPocketMoney(500);
        Budget.spendFamilyBudget(5000);//1000
    }
}
