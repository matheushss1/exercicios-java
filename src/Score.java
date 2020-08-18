

public class Score {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your high score was: " + highScore);

        calculateScore(true, 1000, 8, 200);


        int position = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", position);

        position = calculateHighScorePosition(900);
        displayHighScorePosition("John", position);

        position = calculateHighScorePosition(400);
        displayHighScorePosition("Albert", position);

        position = calculateHighScorePosition(50);
        displayHighScorePosition("Carlos", position);



    }
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        } else{
            return  -1;
        }



    }
    public static void displayHighScorePosition(String playerName, int position){

        System.out.println(playerName
                + " managed to get into position "
                + position
                + " on the high score table");


    }
    public static int calculateHighScorePosition(int playerScore){
//        if(playerScore >= 1000){
//            return 1;
//        } else if (playerScore >= 500){
//            return 2;
//        } else if (playerScore >= 100){
//            return 3;
//        }
//        return 4;

        int position = 4; // assuming the position 4 will be returned

        if(playerScore >= 1000) position = 1;
        else if (playerScore >= 500) position = 2;
        else if (playerScore >= 100) position = 3;

        return position;




    }
}
