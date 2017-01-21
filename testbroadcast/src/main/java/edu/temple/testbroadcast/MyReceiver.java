package edu.temple.testbroadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {
    public MyReceiver() {
    }

    @Override
    public void onReceive(final Context context, Intent intent) {
        Toast.makeText(context,"Im BroadCast Test",Toast.LENGTH_SHORT).show();

        AlertDialog.Builder dialog = new AlertDialog.Builder(context);
        dialog.setTitle("Warning");
        dialog.setMessage("You are force to logoff");
        dialog.setCancelable(false);
        dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent broadIntent = new Intent(context,SecondActivity.class);
                context.startActivity(broadIntent);
            }
        });
        dialog.show();

    }
}
