package week02_TDDusingJUnit5andMockito.Mockitoexercises_handson2;

import static org.mockito.Mockito.*; // For when(), verify(), mock()
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MyServiceTest {

    @Test
    public void testVerifyInteraction() {
        // Step 1: Create a mock of ExternalApi
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        // Step 2: Inject the mock into the service
        MyService service = new MyService(mockApi);

        // Step 3: Call the method under test
        service.fetchData();

        // Step 4: Verify that getData() was called exactly once
        verify(mockApi).getData();
    }
}


