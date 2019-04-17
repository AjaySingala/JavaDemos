import junit.framework.*;
import org.junit.runner.notification.Failure;

public class JunitTestSuite {
    public static void main(String[] a) {
        // add the test's in the suite
        TestSuite suite = new TestSuite(TestJunit1.class, TestJunit2.class, TestJunit3.class);
        TestResult result = new TestResult();
        suite.run(result);

        System.out.println("(JunitTestSuite) Number of test cases = " + result.runCount());
    }
}
