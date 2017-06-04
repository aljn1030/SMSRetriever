package sg.edu.rp.c346.smsretriever;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends Fragment {

    Button btn1;
    TextView tv1;
    EditText et1;


    public FirstFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first, container, false);

        tv1 = (TextView) view.findViewById(R.id.tvFrag1);
        btn1 = (Button) view.findViewById(R.id.button1);
        et1 = (EditText)view.findViewById(R.id.etfrag1) ;

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = tv1.getText().toString() + "\n" + "New Data";
                tv1.setText(data);
            }
        });

        return view;
    }

}
