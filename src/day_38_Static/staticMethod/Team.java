package day_38_Static.staticMethod;

public class Team {
    static int team;
    String name;

    public Team(String name) {
        this.name = name;
    }
    public void teamChangeTo(int i){
        team=i;
    }
}
