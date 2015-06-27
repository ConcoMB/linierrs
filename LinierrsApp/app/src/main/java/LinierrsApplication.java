import android.app.Application;
import android.content.Context;

public class LinierrsApplication extends Application {

    private static Context sContext;

    public static Context context() {
        return sContext;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        sContext = getApplicationContext();
    }
}
