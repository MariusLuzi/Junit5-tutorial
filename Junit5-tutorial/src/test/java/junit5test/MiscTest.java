package junit5test;

import org.junit.jupiter.api.*;

import java.util.concurrent.TimeUnit;

public class MiscTest {

    @Test
        // @Timeout(value = 5, unit = TimeUnit.SECONDS)
    @Timeout(5)
    void timeout() throws InterruptedException {
        System.out.println("This is the test with timeout");
        Thread.sleep(6000);
    }

    @Test
    @Timeout(9)
    @DisplayName("This is the nice method")
    @Tag("theTag")
    void annotatedMethod1() {
        System.out.println("This is the annotated method");
    }

    @MyAnnotation
    void annotatedMethod2() {
        System.out.println("This is the custom annotated method 2");
    }

    @TestInstance(TestInstance.Lifecycle.PER_CLASS)
    @Nested
    class NestedTest {

        @BeforeAll
        void beforeAll() {
            System.out.println("Before all in nested test");
        }

        @Test
        void nestedTestMethod() {
            System.out.println("Nested test method");
    }

    }

}
