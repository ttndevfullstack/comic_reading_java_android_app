package com.nhom14.apptruyentranh;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.GridView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.nhom14.apptruyentranh.Object.TruyenTranh;
import com.nhom14.apptruyentranh.adapter.TruyenTranhAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    GridView gdvDsTruyen;
    TruyenTranhAdapter adapter;
    ArrayList<TruyenTranh>truyenTranhArrayList;
    EditText editTimKiem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        init();
        anhXa();
        setUp();
        setClick();
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    private void init() {
        truyenTranhArrayList = new ArrayList<>();
        truyenTranhArrayList.add(new TruyenTranh("Hakaijuu","Chapter 24.2","https://cmnvymn.com/nettruyen/thumb/trung-sinh-ve-1998-yeu-duong-khong-bang-tro-nen-lon-manh.jpg"));
        truyenTranhArrayList.add(new TruyenTranh("Nghịch Thiên Tà Thần","Chapter 111","https://cmnvymn.com/nettruyen/thumb/trung-sinh-ve-1998-yeu-duong-khong-bang-tro-nen-lon-manh.jpg"));
        truyenTranhArrayList.add(new TruyenTranh("Vua Sinh Tồn","Chapter 76","https://cmnvymn.com/nettruyen/thumb/trung-sinh-ve-1998-yeu-duong-khong-bang-tro-nen-lon-manh.jpg"));
        truyenTranhArrayList.add(new TruyenTranh("Hoa Hồng Ẩn Giấu Sao Băng","Chapter 4","https://dtcdnyacd.com/nettruyen/thumb/hoa-hong-an-giau-sao-bang.jpg"));
        truyenTranhArrayList.add(new TruyenTranh("Hakaijuu","Chapter 24.2","https://cmnvymn.com/nettruyen/thumb/trung-sinh-ve-1998-yeu-duong-khong-bang-tro-nen-lon-manh.jpg"));
        truyenTranhArrayList.add(new TruyenTranh("Nghịch Thiên Tà Thần","Chapter 111","https://cmnvymn.com/nettruyen/thumb/trung-sinh-ve-1998-yeu-duong-khong-bang-tro-nen-lon-manh.jpg"));
        truyenTranhArrayList.add(new TruyenTranh("Vua Sinh Tồn","Chapter 76","https://cmnvymn.com/nettruyen/thumb/trung-sinh-ve-1998-yeu-duong-khong-bang-tro-nen-lon-manh.jpg"));
        truyenTranhArrayList.add(new TruyenTranh("Hoa Hồng Ẩn Giấu Sao Băng","Chapter 4","https://dtcdnyacd.com/nettruyen/thumb/hoa-hong-an-giau-sao-bang.jpg"));
        truyenTranhArrayList.add(new TruyenTranh("Hakaijuu","Chapter 24.2","https://cmnvymn.com/nettruyen/thumb/trung-sinh-ve-1998-yeu-duong-khong-bang-tro-nen-lon-manh.jpg"));
        truyenTranhArrayList.add(new TruyenTranh("Nghịch Thiên Tà Thần","Chapter 111","https://cmnvymn.com/nettruyen/thumb/trung-sinh-ve-1998-yeu-duong-khong-bang-tro-nen-lon-manh.jpg"));
        truyenTranhArrayList.add(new TruyenTranh("Vua Sinh Tồn","Chapter 76","https://cmnvymn.com/nettruyen/thumb/trung-sinh-ve-1998-yeu-duong-khong-bang-tro-nen-lon-manh.jpg"));
        truyenTranhArrayList.add(new TruyenTranh("Hoa Hồng Ẩn Giấu Sao Băng","Chapter 4","https://dtcdnyacd.com/nettruyen/thumb/hoa-hong-an-giau-sao-bang.jpg"));
        adapter = new TruyenTranhAdapter(this,0,truyenTranhArrayList);

    }

    private void anhXa() {
        gdvDsTruyen = findViewById(R.id.gdvDsTruyen);
        editTimKiem = findViewById(R.id.editTimKiem);
    }

    private void setUp() {
        gdvDsTruyen.setAdapter(adapter);
    }

    private void setClick(){
        editTimKiem.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                String s = editTimKiem.getText().toString();
                adapter.sortTruyen(s);
            }
        });
    }
}

