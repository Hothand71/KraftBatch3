package review_5_inheritance;

public class SoftwareDevelopmetTeam extends Person{
    char team;
    String domain;
    int numberOfPersonal;
    public SoftwareDevelopmetTeam(String name,String surname){
        super(name,surname);
    }
    static {
        System.out.println("SoftwareDevelopmetTeam erişim sağlanıyor");
    }
}
