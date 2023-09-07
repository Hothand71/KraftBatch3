package day_8_operatorsCont;

public class Unary {
    public static void main(String[] args) {
        //unary operators
        //+ plus aritmetik değeri pozitif yapar
        //- minos aritmetik değeri negatif yapar
        //++ increment operator değeri 1 arttırır
        //-- decrement operator değeri 1 azaltır
        //! logical not operator boolean değeri tersine cevirir

        //example
        int x ;
       // x++;//varriable shold be initilazied
        x=2;
        System.out.println(x++);//3
        System.out.println(x--);//2
        System.out.println("x="+x);//2

        //prefix and postfix
        //++x-----> prefix x in değerini operratorun uygulandığı satırda değiştirir.
        // x++--->
        System.out.println("-----------");
        //example
        //postfix
        int y =1;
        y++;//increment uygulandı ancak y nin değeri bir sonraki kullanıldığı yerde artacak
        System.out.println("y="+y);//2

        //prefix

        --y;
        System.out.println("y="+y);//1
        System.out.println("y="+(++y));//2

        // Task 1
        //Aşağıdaki işlem akışında value değişkeninin nihayi değeri kaç olur.
        int value= +1;
        A: value--;//1
        B: value++;//0
        C: value= -value;//-1
        System.out.println("value = " + value);
        System.out.println("------");
        int i = 10;
        //   9    10+   9   +   9   =37
        i= --i + ++i + --i + i++;
        System.out.println("i = " + i);
        //       37 + 38  * -37 * -38
        i= i++ + i-- * -i++ * --i;
        System.out.println("i = " + i);
//          51986-51986/51985 * 51985
        i= i++ - i++/ --i * i++;
        System.out.println("i = " + i);
        // example
        // logical not
        boolean condition = true;
        System.out.println("condition = " + condition+"\ncondition = " + !condition);

        int t = 10,k =20;
        boolean bl = !(t>k);// t büyük k değilse durumunda true döndürmek için logical not kullandım(!)
        System.out.println("bl = " + bl);

        boolean bln= t<k;
        System.out.println("bln = " + !bln);
//      task
//      aşağıdaki ifadenin true dönmesi için nereye logical not konmalı
        int n =11;
        int m=17;
        //               false true herhangi birini yapsam olur
        boolean cond=(n==m)==(n<m);// her nereye logical not koyarsam koyayım ifade trueya dönecektir.
        System.out.println("cond = " + cond);
//      Task4
//      Aşağıdaki ifadelerden hangisi
//      Ya da hangileri true döndürür
    //                  false == 12  > 12
        boolean cond2 = false ==(n+1)>(m-5);
        System.out.println("cond2 = " + cond2);
        boolean con3 = cond2==1>m/n;
        System.out.println("con3 = " + con3);



    }
}
