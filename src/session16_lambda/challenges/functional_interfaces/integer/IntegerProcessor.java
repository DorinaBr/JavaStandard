package session16_lambda.challenges.functional_interfaces.integer;

import java.util.List;

@FunctionalInterface

public interface IntegerProcessor {

    Integer process(List<Integer> input);

}
