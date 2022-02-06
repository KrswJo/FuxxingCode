package ScoreCalculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ExamResultTest {
    ExamResult examResult;
    @BeforeEach
    void setUp() {
        examResult = new ExamResult();

        examResult.scores = new LinkedList<>();
        examResult.scores.add(new Score("Finance", "C+"));
        examResult.scores.add(new Score("Writting", "B"));
        examResult.scores.add(new Score("German", "B+"));
        examResult.scores.add(new Score("Foundation Math", "D+"));
        examResult.scores.add(new Score("English Speaking", "C+"));
        examResult.scores.add(new Score("Psycho", "A+"));

        examResult.requiredClasses = new LinkedList<>();
        examResult.requiredClasses.add("English Speaking");
        examResult.requiredClasses.add("Foundation Math");
        examResult.requiredClasses.add("Enginering Math");
        examResult.requiredClasses.add("CsBasic");
    }

    @Test
    void getExamResult() {
        examResult.getExamResult(examResult.scores, examResult.requiredClasses);
        examResult.print();
    }
}