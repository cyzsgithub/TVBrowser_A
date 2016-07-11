package com.example.krischen.tvbrowser_a;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;


/**
 * Created by krischen on 16-7-11.
 */
public class TVWebViewPage extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webview_mainpage);
        String mUrl;
        Button m_BtnBack = (Button)findViewById(R.id.btn_back);
        Button m_BtnFresh = (Button)findViewById(R.id.btn_fresh);
        Button m_BtnGo = (Button)findViewById(R.id.btn_go);
        Button m_BtnHome = (Button)findViewById(R.id.btn_home);
        EditText m_EditUrl = (EditText)findViewById(R.id.textfield_url);
        EditText m_TextStatus = (EditText)findViewById(R.id.text_status);

    }
}
