package com.example.administrator.webview_demo1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private TextView tv;
    private String url = "<p>【性质】平</p> <p>【五味】辛</p> <p>【热量】900.00大卡(千焦)/100克 </p> <p>【功效】抑癌抗瘤</p> <p>【棕榈油是什么】 棕榈油是从油棕树上的棕果(Elaeis Guineensis)中榨取出来的，果肉压榨出的油称为棕榈油( Palm Oil)，而果仁压榨出的油称为棕榈仁油(Palm Kernel Oil)，两种油的成分大不相同。棕榈油主要含有棕榈酸(C 16)和油酸(C 18)两种最普通的脂肪酸，棕榈油的饱和程度约为50%;棕榈仁油主要含有月桂酸(C 12)，饱和程度达80...</p>\"";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv = ((TextView) findViewById(R.id.tv));
        tv.setText(Html.fromHtml(url));

    }

    private String init() {

        return null;
    }

}
