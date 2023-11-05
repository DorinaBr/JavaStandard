package session16_lambda.challenges.functional_interfaces.list;

import java.util.List;

@FunctionalInterface

public interface IntegerListProcessor {
    List<Integer> process(List<Integer> inputList);
}
