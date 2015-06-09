package whereareweeating.com.hiteware.whereareweeating;

import org.junit.Test;
import org.robolectric.Robolectric;

/**
 * Created on 6/9/15.
 */
public class LocationListenerUnitTest {

    @Test
    public void WhenLocationListenerStartsUpThenTheLocationManagerAsksForUpdates()
    {
        MainActivity CreatedActivity = Robolectric.buildActivity(MainActivity.class).create().postResume().get();
        LocationListener locationListener = new LocationListener();
    }

//    @Test
//    public void whenAppAndActivityAreConstructedTheSensorManagerAsksForStepCounter()
//    {
//        CreatedActivity = Robolectric.buildActivity(MainActivity.class).create().postResume().get();
//        verify(sensorManager, times(1)).getDefaultSensor(Sensor.TYPE_STEP_COUNTER);
//    }
}
