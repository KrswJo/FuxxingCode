package ScoreCalculator;

import java.util.List;

public class ExamResult {
    List<Score> scores;
    List<String> requiredClasses;

    void getExamResult(List<Score> scores, List<String> requiredClasses){
       for(Score s : scores){
           if(requiredClasses.contains(s.getSubjectName()))
               requiredClasses.remove(s.getSubjectName());
       }

       for (String s : requiredClasses){
           scores.add(new Score(s, "N"));
       }
    }

    void print(){
        for (Score result : scores){
            System.out.println(result.getSubjectName() + " : " + result.getNumScore());
        }
    }
}
