package school.ch1.together.study.ch18_exception.diagram_project.exception;

public class CharCheckException extends RuntimeException {

    public CharCheckException() {}

    public CharCheckException(String msg) {
        super(msg);
    }
}