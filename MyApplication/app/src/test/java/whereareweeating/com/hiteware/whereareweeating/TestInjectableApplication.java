package whereareweeating.com.hiteware.whereareweeating;

/**
 * Created on 6/9/15.
 */
public class TestInjectableApplication extends InjectableApplication {

    public TestModule testModule;

    @Override
    public void onCreate() {
        super.onCreate();
//        testModule = new TestModule();
    }
//
//    public void setMockSensorManager() {
//        useMockSensorManager = true;
//        mockSensorManagerModule = testModule;
//    }
}