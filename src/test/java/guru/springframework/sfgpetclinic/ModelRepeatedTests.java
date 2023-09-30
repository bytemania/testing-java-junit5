package guru.springframework.sfgpetclinic;

import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
@Tag("repeated")
public interface ModelRepeatedTests {

    @BeforeEach
    default void beforeEachConsoleOutputer(TestInfo testInfo, RepetitionInfo repetitionInfo) {
        System.out.println("Running Test - " + testInfo.getDisplayName() + " - " +
                repetitionInfo.getCurrentRepetition() + " | " + repetitionInfo.getTotalRepetitions());
    }

}
