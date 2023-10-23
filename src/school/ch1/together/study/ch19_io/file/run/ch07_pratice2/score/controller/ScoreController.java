package school.ch1.together.study.ch19_io.file.run.ch07_pratice2.score.controller;

import school.ch1.together.study.ch19_io.file.run.ch07_pratice2.model.dao.ScoreDAO;

import java.io.DataInputStream;
import java.io.FileNotFoundException;

public class ScoreController {

    private ScoreDAO sd = new ScoreDAO();

    public void saveScore(String name, int kor, int eng, int math, int sum, double avg) {
        sd.saveScore(name, kor, eng, math, sum, avg);


    }
    public DataInputStream readScore() throws FileNotFoundException {

    }
}
