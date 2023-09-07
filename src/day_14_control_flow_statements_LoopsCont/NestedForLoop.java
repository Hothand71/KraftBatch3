package day_14_control_flow_statements_LoopsCont;

public class NestedForLoop {
    public static void main(String[] args) {
       /* for (int i=1;i<4;i++){
            System.out.println("Outer loop "+i+". kez döndü");
            for (int j=1;j<5;j++){
                System.out.println("\tinner loop "+j+". döndü");
            }
        }*/

     /*   for (int i=1;i<6;i++){

            for (int j=1;j<=3;j++){
                System.out.print("* ");
            }
            System.out.println();
        }*//*
        for (int i=1;i<6;i++){

            for (int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
*/
       /* for (int i=1;i<8;i++){

            for (int j=1;i<=(8-j);j++){
                System.out.print("* ");
            }
            System.out.println();
        }*/
     /*   for (int i=0;i<=6;i++){
            for (int j=1;j<i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }*/
        for (int i=5;i>0;i--){
            for (int j=1;j<i;j++){
                System.out.print(" ");

                }for (int j=6-i;j>0;j--){
                System.out.print("* ");
            }

            System.out.println();
        }


    }
}
