package whereareweeating.com.hiteware.whereareweeating;

import android.hardware.SensorManager;
import android.location.LocationManager;

import org.mockito.Mockito;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created on 6/9/15.
 */
@Module(
        injects = LocationListener.class,
        overrides = true
)
public class TestModule{

    @Provides
    @Singleton
    LocationManager provideLocationManager() { return Mockito.mock(LocationManager.class); }
}
