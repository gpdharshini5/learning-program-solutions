package week02_TDDusingJUnit5andMockito.Mockitoexercises_handson2;

public class MyService {
    private ExternalApi api;

    public MyService(ExternalApi api) {
        this.api = api;
    }

    public String fetchData() {
        return api.getData();
    }
}
