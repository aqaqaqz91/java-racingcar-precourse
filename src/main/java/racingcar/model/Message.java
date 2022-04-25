package racingcar.model;

public class Message {
    public static final String ERROR = "[ERROR]";

    public static final String ERROR_NAME_LEN_OVER = "이름의 길이는 최대 "+Rule.CAR_NAME_MAX_LEN+"글자 입니다";
    public static final String ERROR_NAME_USE_NOT_SPACE = "이름에는 공백이 올 수 없습니다";
    public static final String ERROR_LOOP_CNT_DIGIT = "시도 횟수는 숫자만 올 수 있습니다";
    public static final String ERROR_LOOP_CNT_NOT_NEGATIVE = "시도 횟수는 0보다 큰 숫자여야 합니다";
}
