package guru.springframework.sfgpetclinic;

import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
@Tag("model")
public interface ModelTests {

    @BeforeEach
    default void beforeEachConsoleOutputer(TestInfo testInfo) {
        System.out.println("Running Test - " + testInfo.getDisplayName());
    }

}
