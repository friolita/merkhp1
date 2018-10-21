package com.gmail.friolita3.merkhp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView simpleList;
    String  Item[] = {"Xiaomi", "Vivo", "Oppo", "Samsung", "Lenovo"};
    String  SubItem[] = {" Penampilan Xiaomi Redmi S2 juga cukup apik dengan dukungan layar 5.99 inci HD+ 720 pixel, serta mengandalkan mesin prosesor Snapdragon 625 yang dipadankan dengan RAM 3GB dan penyimpanan internal 32GB.",
            " HP ini menjadi sensasi di dunia smartphone, lantaran dibesut dengan teknologi Screen Touch ID pertama di dunia. Kecanggihannya memang terdapat dengan kehadiran sensor fingerprint di dalam layarnya.",
            " Hadir sebagai smartphone selfie Full Screen, penampilan OPPO A83 cukup memikat banyak orang.",
            "Terdapat dua tipe untuk seri J6 Plus ini, yaitu RAM 3 GB memori internal 32 GB serta RAM 4 GB dan memori internal 64 GB.",
            " Dengan baterai mega kapasitas 5100 mAh, kamu bisa nikmati baterai yang dapat bertahan hingga 3 hari tanpa harus mengisi ulang daya. "};

    int flags[] = {R.drawable.xiaomi, R.drawable.vivo, R.drawable.oppo, R.drawable.samsung, R.drawable.lenovo};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        simpleList = (ListView)findViewById(R.id.ListView);
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), Item,SubItem, flags);
        simpleList.setAdapter(customAdapter);
    }
}

