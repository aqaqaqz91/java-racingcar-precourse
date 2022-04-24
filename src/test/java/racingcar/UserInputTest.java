package racingcar;

import camp.nextstep.edu.missionutils.test.NsTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static camp.nextstep.edu.missionutils.test.Assertions.assertSimpleTest;
import static org.assertj.core.api.Assertions.assertThat;

class UserInputTest extends NsTest {
    private static final String ERROR_MESSAGE = "[ERROR]";

    @Test
    void 이름에_대한_예외_처리_글자수초과() {
        assertSimpleTest(
            () -> {
                runException("pobi,javaji");
                assertThat(output()).contains(ERROR_MESSAGE);
            }
        );
    }

    @ParameterizedTest
    @ValueSource(strings = {",123", "123, ,33"})
    void 이름에_대한_예외_처리_공백체크(String input) {
        assertSimpleTest(
                () -> {
                    runException(input);
                    assertThat(output()).contains(ERROR_MESSAGE);
                }
        );
    }

    @Override
    public void runMain() {
        Application.main(new String[]{});
    }
}
