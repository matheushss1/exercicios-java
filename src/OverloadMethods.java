public class OverloadMethods {
    public static void main(String[] args) {
        int newScore = calculateScore("João", 10);
        System.out.println("New score is: " + newScore);
        calculateScore(85);
        calculateScore();
    }
    public static int calculateScore(String playerName, int score){
        System.out.println("Player: " + playerName + " scored " + score + " points.");
        return score * 1000;
    }
    public static int calculateScore( int score){
        System.out.println("Player without name scored " + score + " points.");
        return score * 1000;
    }
    public static int calculateScore(){
        System.out.println("No player name, no score.");
        return 0;
    }

}
