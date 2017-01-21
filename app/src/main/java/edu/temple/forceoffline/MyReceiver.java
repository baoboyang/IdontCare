package edu.temple.forceoffline;

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
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.

        Toast.makeText(context,"Broadcast",Toast.LENGTH_SHORT).show();

        AlertDialog.Builder dialog = new AlertDialog.Builder(context);
        dialog.setTitle("Warning");
        dialog.setMessage("You are force to logoff");
        dialog.setCancelable(false);
        dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                ActivityCollector.finishALL();
                Intent intent = new Intent(context,LoginActivity.class);
                context.startActivity(intent);
            }
        });
        dialog.show();
    }
}
