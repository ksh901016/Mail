package com.example.email;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
  
public class MailSend extends Activity {  
      
    @Override  
    public void onCreate(Bundle icicle) {  
        super.onCreate(icicle);  
        setContentView(R.layout.send_mail);  
        final Button send = (Button) this.findViewById(R.id.send);  
          
        send.setOnClickListener(new View.OnClickListener() {  
            public void onClick(View view) {  
            GMailSender sender = new GMailSender("id@gmail.com","storm200"); // SUBSTITUTE HERE                    
                try {  
                    sender.sendMail(  
                            "메일제목 !!",   //subject.getText().toString(),   
                            "메일 본문입니다..~~ ",           //body.getText().toString(),   
                            "id@gmail.com",          //from.getText().toString(),  
                            "id@naver.com"            //to.getText().toString()  
                            );  
                } catch (Exception e) {  
                    Log.e("SendMail", e.getMessage(), e);  
                }  
            }  
        });  
    }  
}