package es.hulk.entorns.refactor_ex3;

public class Student {
    public float evaluateTerm(float homeworkMark, float examMark, float attitude) {
        float exam = 0;
        float homework = 0;

        if (examMark < 5) {
            exam = 1;
        }

        if (homeworkMark < 4) {
            homework = 1;
        }
        return (homework + exam) / 2 + attitude;
    }
}