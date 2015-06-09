package whereareweeating.com.hiteware.whereareweeating;

import android.location.LocationManager;

import javax.inject.Inject;

/**
 * Created on 6/9/15.
 */
public class LocationListener {

    @Inject
    LocationManager locationManager;

    public LocationListener(InjectableApplication application)
    {
        application.inject(this);
    }
}
