package day_38_Static.staticBlock;

public class BlocksVs {
   static int i;
    public BlocksVs(){
        System.out.println("no argumnet cunstructor yururdu");
    }
    public BlocksVs(int i){
        System.out.println("one argument cunstructor yururdu");
        System.out.println(this.i+i);
    }
    static {
        System.out.println("static init");//run first and once time
     //   BlocksVs blocksVs=new BlocksVs(5);
        i =10;
    }
    {
        System.out.println("instance block");//run again before constructor
    }

}
