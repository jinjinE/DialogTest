package emirim0223.kr.hs.emirim.dialogtest;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    String[] itemArr = {"진영","신우","산들","바로","공찬"};
    Button butDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        butDialog = (Button) findViewById(R.id.but_dialog);
        butDialog.setOnClickListener(this);//현재 클래스가 handler클래스 자격을 가지고 있으므로 this(본인을 가르킴)를 사용
    }

    @Override
    public void onClick(View view) {
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        dialog.setTitle("B1A4");
        dialog.setIcon(R.mipmap.ic_launcher);
        //dialog.setMessage("여기는 메시지를 쓰는 곳입니다.");
       /* dialog.setItems(itemArr, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                butDialog.setText(itemArr[i]);
            }
        });*/
       //라디오 버튼 목록
        /*
        dialog.setSingleChoiceItems(itemArr,0,new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                butDialog.setText(itemArr[i]);
            }
        });*/

      //  체크 박스 목록
        //선택 여부 배열
        boolean[] checkedItems={true, false, true, false,true};
        dialog.setMultiChoiceItems(itemArr, checkedItems, new DialogInterface.OnMultiChoiceClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i, boolean b) {
                if(b)
                 butDialog.setText(itemArr[i]);
            }
        });

   //     dialog.setPositiveButton("OK",null);
        dialog.show();
    }
}
