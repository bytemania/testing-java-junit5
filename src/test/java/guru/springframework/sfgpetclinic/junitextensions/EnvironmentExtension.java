package guru.springframework.sfgpetclinic.junitextensions;

import org.junit.jupiter.api.extension.ConditionEvaluationResult;
import org.junit.jupiter.api.extension.ExecutionCondition;
import org.junit.jupiter.api.extension.ExtensionContext;

import java.io.IOException;
import java.util.Properties;

public class EnvironmentExtension implements ExecutionCondition {
    @Override
    public ConditionEvaluationResult evaluateExecutionCondition(ExtensionContext context) {
        Properties props = new Properties();
        String env;
        try {
            props.load(EnvironmentExtension.class.getResourceAsStream("application.properties"));
            env = props.getProperty("env");
        } catch (IOException e) {
            env = "none";
        }

        if ("qa".equalsIgnoreCase(env)) {
            return ConditionEvaluationResult.disabled("Test disabled on QA environment");
        }
        return ConditionEvaluationResult.enabled("Test enabled on QA environment");
    }
}
