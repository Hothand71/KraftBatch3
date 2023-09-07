package review_5_inheritance;

public class Tester extends SoftwareDevelopmetTeam{
    boolean isManual;
    public Tester(String name,String surname){
        super(name,surname);
    }
    {

    }
    static {
        System.out.println("Tester erişim sağlanıyor");
    }
}
