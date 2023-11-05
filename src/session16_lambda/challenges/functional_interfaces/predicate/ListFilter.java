package session16_lambda.challenges.functional_interfaces.predicate;

import java.util.List;
import java.util.function.Predicate;

@FunctionalInterface

public interface ListFilter<T> {
    List<?> filter(List<T> listT, Predicate<T> predicate);
}
