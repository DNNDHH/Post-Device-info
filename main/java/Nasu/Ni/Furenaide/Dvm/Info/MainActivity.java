package Nasu.Ni.Furenaide.Dvm.Info;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Build;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText userAgentEditText;
    private EditText deviceInfoEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userAgentEditText = findViewById(R.id.userAgentEditText);
        deviceInfoEditText = findViewById(R.id.deviceInfoEditText);

        Button getInfoButton = findViewById(R.id.getInfoButton);
        getInfoButton.setOnClickListener(v -> displayDeviceInfo());
    }

    private void displayDeviceInfo() {
        String userAgent = System.getProperty("http.agent");
        String deviceInfo = Build.MANUFACTURER + " " + Build.MODEL + " / Android OS " +
                Build.VERSION.RELEASE + " / API-" + Build.VERSION.SDK_INT +
                " (" + Build.DISPLAY + "/" + Build.VERSION.INCREMENTAL + ")";


        userAgentEditText.setText(userAgent);
        deviceInfoEditText.setText(deviceInfo);
    }
}