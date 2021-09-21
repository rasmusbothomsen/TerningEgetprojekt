import java.util.Random;

public class TerningMain {

    public static void main (String[]args) throws InterruptedException {
        while(true) {
            dicethrow();
            Thread.sleep(1000);
        }

    }
    public static int dicethrow (){

        Random dice = new Random();
        System.out.println(dice.nextInt(6)+1);
        return dice.nextInt(6)+1;

    }
    public int[] database(int a,boolean twoOnes,int b){
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
        return total;



    }
}
