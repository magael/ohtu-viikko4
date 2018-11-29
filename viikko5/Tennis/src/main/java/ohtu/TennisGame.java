package ohtu;

import java.util.HashMap;

public class TennisGame {

    private final int LOVE = 0;
    private final int FIFTEEN = 1;
    private final int THIRTY = 2;
    private final int FOURTY = 3;
    private final int ADVANTAGE = 1;
    private final int WIN_DIFFERENCE = 2;
    private final int WIN_MINIMUM = 4;
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
    }

    public void wonPoint(String playerName) {
        if (playerName == player1Name) {
            player1Score += 1;
        } else if (playerName == player2Name){
            player2score += 1;
        } else {
            System.out.println("Error: No such player.");
        }
    }

    public String getScore() {
        if (player1Score == player2score) {
            return evenScore();
        } else if (player1Score >= WIN_MINIMUM || player2score >= WIN_MINIMUM) {
            return advantageOrWin();
        }
        return unevenScore();
    }

    private String unevenScore() {
        String score = "";
        int tempScore;
        //repeat twice: first for player1, then for player2
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

    private String advantageOrWin() {
        String score = "";
        int scoreDifference = player1Score - player2score;
        if (scoreDifference == ADVANTAGE) {
            score = "Advantage " + player1Name;
        } else if (scoreDifference == -ADVANTAGE) {
            score = "Advantage " + player2Name;
        } else if (scoreDifference >= WIN_DIFFERENCE) {
            score = "Win for " + player1Name;
        } else if (scoreDifference <= -WIN_DIFFERENCE){
            score = "Win for " + player2Name;
        }
        return score;
    }

    private String evenScore() {
        String score = "";
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
