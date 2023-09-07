package day_14_control_flow_statements_LoopsCont;

public class WhileLoop {
    public static void main(String[] args) {
     /*   int speed =200;
        while (speed>=100){
        System.out.println("break");
        speed--;
        }
        System.out.println("Speed ="+speed);
*/
       /* int sayi = 0;
        while (sayi <= 100) {
            if (sayi % 2 == 1) {
                System.out.println(sayi);

            }
            sayi++;*/

        //While loop kullanarak Bir program yazın ve 25 kadar olan tek sayıları toplasın
        System.out.println("-------task");
        int sayi=0;
        int sum=0;
        while (sayi<=25){
            if (sayi%2==1){
                sum+=sayi;
            }
            sayi++;
        }
        System.out.println(sum);





        }

    }
