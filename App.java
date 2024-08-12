public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\n_______________ Char & String _______________ \n ");
        char isChr = 'a';
        String isStr = "IPA1";
        System.err.println("char = " + isChr + "\nString = " + isStr);

        System.err.println("\n________________ Boolean __________________ \n");
        boolean t = true;
        boolean f = false;
        System.err.println("T = " + t + "\nF = " + f );
        
        System.err.println("\n________________ Var & Final __________________ \n");
        byte isByte = 120;
        var isVar = 121;
        var isVarF = 12.1;
        var isVarStr = "Javac";
        
        isVar = 212;
        final var isFinal = 15;
        // isFinal = 135;

        System.err.println("\n________________ Assignment Operator __________________ \n");
        /*
        +=
        *=
        -=
        /=
        %=
        */
        
        var G = 4;
        System.err.println("G = " + G);
        G+=2;
        System.err.println("G + 2 = " + G);
        
        System.err.println("G = " + G);
        G-=2;
        System.err.println("G - 2 = " + G);
        
        System.err.println("G = " + G);
        G*=2;
        System.err.println("G * 2 = " + G);
        
        System.err.println("G = " + G);
        G/=2;
        System.err.println("G / 2 = " + G);
        
        System.err.println("G = " + G);
        G%=2;
        System.err.println("G % 2 = " + G);
        
        System.err.println("\n________________ Unary Operator __________________ \n");
        // + -
        byte abc = 12;
        System.err.println("abc = -12 : " + -abc);
        System.err.println("abc = +12 : " + +abc);
        //Decrement : Post & Pre
        byte isDec = 10;
        // pre - Decrement
        System.err.printf("pre - Decrement : %d \n", ++isDec);
        // post - Decrement
        byte isPost = 20;
        System.err.printf("1.pre - Decrement : %d \n", isPost++);
        System.err.printf("2.pre - Decrement : %d \n", isPost);
        
        //Increment (-) : Post and Pre
        System.err.printf("\n\npre - Decrement : %d \n", --isDec);
        System.err.printf("1.pre - Decrement : %d \n", isPost--);
        System.err.printf("2.pre - Decrement : %d \n", isPost);
        
        System.err.println("\n________________ Unary Operator __________________ \n");
        /*
        >
        <
        >=
        <=
        ==
        */
        
        System.err.println("\n________________ Logic Operator __________________ \n");
        
        /*
        and &&
        or ||
        not !
        xor ^
        */

        //AND
        System.err.printf("T AND T : %b \n", true && true);
        System.err.printf("F AND T : %b \n", false && true);
        System.err.printf("T AND F : %b \n", true && false);
        System.err.println("F AND F : " + (false && false));
        //OR
        System.err.printf("\nT OR T : %b \n", true || true);
        System.err.printf("F OR T : %b \n", false || true);
        System.err.printf("T OR F : %b \n", true || false);
        System.err.println("F OR F : " + (false || false));
        //XOR
        System.err.printf("\nT XOR T : %b \n", true ^ true);
        System.err.printf("F XOR T : %b \n", false ^ true);
        System.err.printf("T XOR F : %b \n", true ^ false);
        System.err.println("F XOR F : " + (false ^ false));
        //NOT
        System.err.printf("\nNOT T : %b \n", !true);
        System.err.println("NOT F : " +  !false);

        // CHALLENGE

        int x = 100;
        System.err.printf("\n X : " + ((x>1 && x<3) || ((x>88 && x<101) && (x>99 && x<101))));

        int y = 14;
        System.err.printf("\n Y : " + ( (y>10 && y<15) && ((y>13 && y<20) || (y>20 && y <30) )) );

        byte g = 14;
        boolean n1 = g > 10 && g < 15;
        boolean n2 = g > 13 && g < 20;
        boolean n3 = g > 20 && g < 30;
        boolean hasil = n1 && n2 || n3;
        System.err.println("\n Hasil : " + hasil);
    }
}
