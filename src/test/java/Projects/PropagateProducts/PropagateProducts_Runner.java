package Projects.PropagateProducts;

import com.intuit.karate.Results;
import com.intuit.karate.Runner;

import static org.junit.jupiter.api.Assertions.*;

import com.intuit.karate.junit5.Karate;
import org.junit.jupiter.api.Test;

class PropagateProducts_Runner {

    /*
    @Karate.Test
    Karate testAll() {
        return Karate.run().relativeTo(getClass());
    }
    */

    @Test
    void testParallel() {
        Results results = Runner.path("classpath:Projects/PropagateProducts").tags("~@ignore").parallel(5);
        assertEquals(0, results.getFailCount(), results.getErrorMessages());
    }

}