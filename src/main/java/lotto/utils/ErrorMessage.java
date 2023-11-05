package lotto.utils;

public enum ErrorMessage {
    // 구입금액 관련 에러
    INPUT_MONEY_BELOW_MIN_AMOUNT_ERROR("[ERROR] 최소 1000원을 입력해야합니다."),
    INPUT_MONEY_ABOVE_MAX_AMOUNT_ERROR("[ERROR] 최대 100,000,000원을 입력해야합니다."),
    INPUT_MONEY_NOT_DIVISIBLE_ERROR("[ERROR] 1000원 단위의 값을 입력해야합니다."),
    INPUT_MONEY_NOT_INTEGER_ERROR("[ERROR] 정수만 입력 가능합니다."),

    // 로또 관련 에러
    LOTTO_NUMBER_COUNT_INVALID_ERROR("[ERROR] 로또 번호는 6개의 숫자여야 합니다."),
    LOTTO_NUMBER_RANGE_INVALID_ERROR("[ERROR] 로또 번호는 1부터 45 사이여야 합니다."),
    LOTTO_NUMBER_DUPLICATION_ERROR("[ERROR] 로또 번호는 중복될 수 없습니다."),

    // 당첨번호 관련 에러
    WINNING_NUMBER_COUNT_INVALID_ERROR("[ERROR] 당첨 번호는 6개여야 합니다."),
    WINNING_NUMBER_RANGE_INVALID_ERROR("[ERROR] 당첨 번호는 1부터 45 사이어야 합니다."),
    WINNING_NUMBER_DUPLICATION_ERROR("[ERROR] 당첨 번호는 중복될 수 없습니다.");

    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
