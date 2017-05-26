package naman.com.loan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Details extends AppCompatActivity {

    EditText purpose,tenure,address,amt,type;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        init();
    }

    private void setFields(String purpose,String tenure,String address,String amt,String type)
    {
        this.purpose.setText(purpose);
        this.tenure.setText(tenure);
        this.address.setText(address);
        this.amt.setText(amt);
        this.type.setText(type);
    }

    private void cleanFields()
    {
        this.purpose.setText("");
        this.tenure.setText("");
        this.address.setText("");
        this.amt.setText("");
        this.type.setText("");
    }

    private void init()
    {
        purpose=(EditText) findViewById(R.id.purpose);
        tenure=(EditText) findViewById(R.id.tenure);
        address=(EditText) findViewById(R.id.address);
        amt=(EditText) findViewById(R.id.amt);
        type=(EditText) findViewById(R.id.type);
    }
}
