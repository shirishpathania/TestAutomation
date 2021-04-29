package Projects.ParcelEvents;

import com.intuit.karate.Results;
import com.intuit.karate.Runner;
import com.intuit.karate.junit5.Karate;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ParcelEvents_Runner {

    /*
    @Karate.Test
    Karate testAll() {
        return Karate.run().relativeTo(getClass());
    }
    */

    @Test
    void testParallel() {
        Results results = Runner.path("classpath:/Projects/ParcelEvents").tags("~@ignore").parallel(5);
        assertEquals(0, results.getFailCount(), results.getErrorMessages());
    }

}
