import java.util.Random;

public class TerningMain {

    public static void main (String[]args) throws InterruptedException {
        int[] diceValue;
        while(true) {
            diceValue=dicethrow();
            System.out.println("Du slog "+diceValue[0]+"og "+diceValue[1]);
            compareThrow(diceValue);
            System.out.println();

            Thread.sleep(1000);


        }

    }
    public static void compareThrow(int[]a){
        if (a[0]==a[1]){
            switch (a[0]){
                case 1:
                    database(a[0],a[1],true,false);
                    break;
                case 6:
                    extraThrow();
                    database(a[0],a[1],false,true);
                    break;
                default:
                    extraThrow();
                    database(a[0],a[1],false,false);
                    break;

            }


        }
        else database(a[0],a[1],false,false);
    }
    public static void extraThrow(){
        System.out.println("2 ens! du får et ekstra kast");
        dicethrow();
    }
    public static int[] dicethrow (){

        Random dice = new Random();
        int[] result = {dice.nextInt(6)+1,dice.nextInt(6)+1};
        return result;

    }
    public static void database(int a,int b,boolean twoOnes,boolean twoSix){
        int player1;
        int player2;
        for (player1 =0;player1<1;){
            player1 +=a;
        }
        player1 +=a;
        if(twoOnes){
            player1=0;
        }
        for(player2=0;player2<1;){
            player2++;
        }
        player2+=b;
        int[] total = {player1, player2};




    }
}
