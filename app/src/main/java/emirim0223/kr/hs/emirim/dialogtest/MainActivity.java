package emirim0223.kr.hs.emirim.dialogtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button butDialog = (Button) findViewById(R.id.but_dialog);
        butDialog.setOnClickListener(this);//현재 클래스가 handler클래스 자격을 가지고 있으므로 this(본인을 가르킴)를 사용
    }

    @Override
    public void onClick(View view) {

    }
}
