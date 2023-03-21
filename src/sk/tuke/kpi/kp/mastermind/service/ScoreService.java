package sk.tuke.kpi.kp.mastermind.service;


import sk.tuke.kpi.kp.mastermind.entity.Score;

import java.util.List;

public interface ScoreService {
    void addScore(Score score) throws ScoreException;

    List<Score> getTopScores(String game) throws ScoreException;

    void reset() throws ScoreException;
}