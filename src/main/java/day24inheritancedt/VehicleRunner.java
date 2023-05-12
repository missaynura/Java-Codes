package day24inheritancedt;

public class VehicleRunner {
    public static void main(String[] args) {
        Civic myCivic=new Civic();

        myCivic.hashCode(); // hashCode() comes from Object Class
        myCivic.pricing();// comes from greatgreatparent Vehicle
        myCivic.brake();
        int hashCode=myCivic.hashCode();
        System.out.println("hashCode: " + hashCode);//hashCode: 997110508

        Accord myAcc= new Accord();

        myAcc.turboSystem();
        myAcc.move();
    }
}
