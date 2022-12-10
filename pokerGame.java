import java.util.Scanner;
// building a poker game
//     • There are two players, you and the computer
//     • The dealer will give each player one card.
//        • Then, the dealer will draw five cards
//     • The player with the most river matches wins!
//     • If the matches are equal, everyone's a winner!
public class pokerGame{

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        double rand=Math.random()*12;

        double randn=Math.random()*12;

        int randValueforuser=(int)rand;

        int randValueforcomputer=(int)randn;



        String usercard=functionForSmiplicity();

        String computercard=functionForSmiplicity();



        System.out.println("the usercard is: "+ usercard);

        System.out.println("the computercard is: "+ computercard);



        String randCar1=functionForSmiplicity();

        String randCar2=functionForSmiplicity();

        String randCar3=functionForSmiplicity();

        String randCar4=functionForSmiplicity();

        String randCar5=functionForSmiplicity();

        System.out.println("and the random five cards are "+ randCar1);

        System.out.println(randCar2);

        System.out.println(randCar3);

        System.out.println(randCar4);

        System.out.println(randCar5);

        int scoreforuser=0;

        int scoreforcomputer=0;



        if(randCar1.equals(usercard)){

            scoreforuser+=1;

        }

        if(randCar1.equals(computercard)){

            scoreforcomputer+=1;

        }

        if(!randCar1.equals(usercard) && !randCar1.equals(computercard)){

            System.out.println("first random card not matched ");

        }



        if(randCar2.equals(usercard)){

            scoreforuser+=1;

        }

        if(randCar2.equals(computercard)){

            scoreforcomputer+=1;

        }

        if(!randCar2.equals(usercard) && !randCar2.equals(computercard)){

            System.out.println("first random card not matched ");

        }



        if(randCar3.equals(usercard)){

            scoreforuser+=1;

        }

        if(randCar3.equals(computercard)){

            scoreforcomputer+=1;

        }

        if(!randCar3.equals(usercard) && !randCar3.equals(computercard)){

            System.out.println("first random card not matched ");

        }



        if(randCar4.equals(usercard)){

            scoreforuser+=1;

        }

        if(randCar4.equals(computercard)){

            scoreforcomputer+=1;

        }

        if(!randCar4.equals(usercard) && !randCar4.equals(computercard)){

            System.out.println("first random card not matched ");

        }



        if(randCar5.equals(usercard)){

            scoreforuser+=1;

        }

        if(randCar5.equals(computercard)){

            scoreforcomputer+=1;

        }

        if(!randCar5.equals(usercard) && !randCar5.equals(computercard)){

            System.out.println("first random card not matched ");

        }



        if(scoreforuser>scoreforcomputer){

            System.out.println("user wins yayyy");



        }

        if(scoreforuser<scoreforcomputer){

            System.out.println("user computer won pay money ");

        }

        if(scoreforuser==scoreforcomputer){

            System.out.println("its a tiee ");

        }

    }



    public static String functionForSmiplicity(){



        double funNumm = Math.random()*12;

        int funNum=(int)funNumm;

        switch(funNum){

            case 0: return           ( "   _____\n"+

                    "  |A _  |\n"+

                    "  | ( ) |\n"+

                    "  |(_'_)|\n"+

                    "  |  |  |\n"+

                    "  |____V|\n");



            case 1: return             ( "   _____\n"+

                    "  |2 _  |\n"+

                    "  | ( ) |\n"+

                    "  |(_'_)|\n"+

                    "  |  |  |\n"+

                    "  |____V|\n");



            case 2: return            ( "   _____\n"+

                    "  |3 _  |\n"+

                    "  | ( ) |\n"+

                    "  |(_'_)|\n"+

                    "  |  |  |\n"+

                    "  |____V|\n");



            case 3: return            ( "   _____\n"+

                    "  |4 _  |\n"+

                    "  | ( ) |\n"+

                    "  |(_'_)|\n"+

                    "  |  |  |\n"+

                    "  |____V|\n");



            case 4: return            ( "   _____\n"+

                    "  |5 _  |\n"+

                    "  | ( ) |\n"+

                    "  |(_'_)|\n"+

                    "  |  |  |\n"+

                    "  |____V|\n");



            case 5: return             ( "   _____\n"+

                    "  |6 _  |\n"+

                    "  | ( ) |\n"+

                    "  |(_'_)|\n"+

                    "  |  |  |\n"+

                    "  |____V|\n");



            case 6: return            ( "   _____\n"+

                    "  |7 _  |\n"+

                    "  | ( ) |\n"+

                    "  |(_'_)|\n"+

                    "  |  |  |\n"+

                    "  |____V|\n");



            case 7: return            ( "   _____\n"+

                    "  |8 _  |\n"+

                    "  | ( ) |\n"+

                    "  |(_'_)|\n"+

                    "  |  |  |\n"+

                    "  |____V|\n");



            case 8: return           ( "   _____\n"+

                    "  |9 _  |\n"+

                    "  | ( ) |\n"+

                    "  |(_'_)|\n"+

                    "  |  |  |\n"+

                    "  |____V|\n");



            case 9: return             ( "   _____\n"+

                    "  |J _  |\n"+

                    "  | ( ) |\n"+

                    "  |(_'_)|\n"+

                    "  |  |  |\n"+

                    "  |____V|\n");



            case 10: return            ( "   _____\n"+

                    "  |Q _  |\n"+

                    "  | ( ) |\n"+

                    "  |(_'_)|\n"+

                    "  |  |  |\n"+

                    "  |____V|\n");



            case 11: return            ( "   _____\n"+

                    "  |K _  |\n"+

                    "  | ( ) |\n"+

                    "  |(_'_)|\n"+

                    "  |  |  |\n"+

                    "  |____V|\n");









            default: return "errorr";



        }



    }

}
