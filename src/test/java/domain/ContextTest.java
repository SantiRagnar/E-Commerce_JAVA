package domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.uqbarproject.jpa.java8.extras.WithGlobalEntityManager;
import org.uqbarproject.jpa.java8.extras.test.AbstractPersistenceTest;

public class ContextTest extends AbstractPersistenceTest implements WithGlobalEntityManager {
    @Test
    public void contextUp(){
        Assertions.assertNotNull(entityManager());
    }

    @Test
    public void contextUpWithTransaction() throws Exception{
        withTransaction(() -> {});
    }

}
