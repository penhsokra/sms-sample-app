package app.sms.com.smsapp.Smsadapter;

import android.provider.Telephony;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import app.sms.com.smsapp.R;
import app.sms.com.smsapp.modal.SMS;

public class SmsAdapter extends BaseAdapter {
    List<SMS> smss;

    public SmsAdapter(List<SMS> smss) {
        this.smss = smss;
    }

    @Override
    public int getCount() {
        return smss.size();
    }

    @Override
    public Object getItem(int position) {
        return smss.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view =null;
        if(convertView !=null)
            view =convertView;
        else
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_sms,parent,false);
            TextView txtSender = view.findViewById(R.id.senderNumber);
            TextView txtMessage = view.findViewById(R.id.txtMessage);

            SMS sms = smss.get(position);
            txtSender.setText(sms.getSender());
            txtMessage.setText(sms.getMessag());
        return view;
    }
}
