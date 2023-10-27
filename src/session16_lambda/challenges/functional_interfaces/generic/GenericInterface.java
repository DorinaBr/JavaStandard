package session16_lambda.challenges.functional_interfaces.generic;

import java.util.List;

@FunctionalInterface

public interface GenericInterface<T> {
    Boolean check(List<?> genericList, Object generic);
}
