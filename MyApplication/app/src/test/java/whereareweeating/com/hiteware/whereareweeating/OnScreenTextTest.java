package whereareweeating.com.hiteware.whereareweeating;

import android.widget.TextView;

import org.hamcrest.core.IsEqual;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.annotation.Config;

import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created on 6/8/15.
 */

@RunWith(CustomRobolectricRunner.class)
@Config(constants = BuildConfig.class)
public class OnScreenTextTest {

    public MainActivity CreatedActivity;

    @Test
    public void testToMakeSureRobolectricIsFunctionalMostLikelyAThrowAwayTest()
    {
        CreatedActivity = Robolectric.buildActivity(MainActivity.class).create().postResume().get();

        assertThat(((TextView) CreatedActivity.findViewById(R.id.helloWorld)).getText().toString(), IsEqual.equalTo("Hello world!"));
    }
}
