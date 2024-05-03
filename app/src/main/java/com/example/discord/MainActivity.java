package com.example.discord;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // 각 버튼 객체 가져오기
        Button buttonConfirm = findViewById(R.id.buttonConfirm);
        Button buttonAsk = findViewById(R.id.buttonAsk);
        Button buttonStudy = findViewById(R.id.buttonStudy);
        Button buttonConnect = findViewById(R.id.buttonConnect);
        Button buttonStudyRoom = findViewById(R.id.buttonStudyRoom);

        // 각 버튼에 대한 클릭 이벤트 처리
        buttonConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("확인해 주세요 버튼을 클릭했습니다.");
            }
        });

        buttonAsk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("무엇이든 물어보세요 버튼을 클릭했습니다.");
            }
        });

        buttonStudy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("열심히 교육받아요 버튼을 클릭했습니다.");
            }
        });

        buttonConnect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("친해져요 버튼을 클릭했습니다.");
            }
        });

        buttonStudyRoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("스터디실 버튼을 클릭했습니다.");
            }
        });
    }

    // 토스트 메시지를 표시하는 메소드
    private void showToast(String message) {
        Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
    }
}