package session16_lambda.challenges.functional_interfaces.list;

import java.util.List;

@FunctionalInterface

public interface StringListProcessor {
    List<String> format(List<String> stringList);
}
