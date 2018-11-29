package ohtu;

import java.util.HashMap;

public class TennisGame {

    private final int LOVE = 0;
    private final int FIFTEEN = 1;
    private final int THIRTY = 2;
    private final int FOURTY = 3;
    private int player1Score;
    private int player2score;
    private String player1Name;
    private String player2Name;
    
    private HashMap<String, Integer> playerScore;

    public TennisGame(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
        this.player1Score = 0;
        this.player2score = 0;
        
//        playerScore = new HashMap<>();
//        playerScore.put(player1Name, 0);
//        playerScore.put(player2Name, 0);
    }

    public void wonPoint(String playerName) {
        if (playerName == player1Name) {
            player1Score += 1;
        } else if (playerName == player2Name){
            player2score += 1;
        } else {
            System.out.println("Error: No such player.");
        }
        
//        if (playerScore.containsKey(playerName)) {
//            playerScore.put(playerName, playerScore.get(playerName) +1);
//        }
    }

    public String getScore() {
        String score = "";
        int tempScore = 0;
        if (player1Score == player2score) {
            score = evenScore();
        } else if (player1Score >= 4 || player2score >= 4) {
            score = advantageOrWin(score);
        } else {
            score = unevenScore(score);
        }
        return score;
    }

    private String unevenScore(String score) {
        int tempScore;
        for (int i = 1; i < 3; i++) {
            if (i == 1) {
                tempScore = player1Score;
            } else {
                score += "-";
                tempScore = player2score;
            }
            switch (tempScore) {
                case LOVE:
                    score += "Love";
                    break;
                case FIFTEEN:
                    score += "Fifteen";
                    break;
                case THIRTY:
                    score += "Thirty";
                    break;
                case FOURTY:
                    score += "Forty";
                    break;
            }
        }
        return score;
    }

    private String advantageOrWin(String score) {
        int minusResult = player1Score - player2score;
        if (minusResult == 1) {
            score = "Advantage " + player1Name;
        } else if (minusResult == -1) {
            score = "Advantage " + player2Name;
        } else if (minusResult >= 2) {
            score = "Win for " + player1Name;
        } else if (minusResult <= -2){
            score = "Win for " + player2Name;
        }
        return score;
    }

    private String evenScore() {
        String score;
        switch (player1Score) {
            case LOVE:
                score = "Love-All";
                break;
            case FIFTEEN:
                score = "Fifteen-All";
                break;
            case THIRTY:
                score = "Thirty-All";
                break;
            case FOURTY:
                score = "Forty-All";
                break;
            default:
                score = "Deuce";
                break;
                
        }
        return score;
    }
}
