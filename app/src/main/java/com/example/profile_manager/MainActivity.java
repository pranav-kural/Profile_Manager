package com.example.profile_manager;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        File file = new File(Environment.getExternalStorageDirectory() + "/DCIM/", "image" + new Date().getTime() + ".png");
//        Uri imgUri = Uri.fromFile(file);
//        String imgPath = file.getAbsolutePath();
//        final Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
//        intent.putExtra(MediaStore.EXTRA_OUTPUT, setImageUri());
//        startActivityForResult(intent, CAPTURE_IMAGE);
    }

    public void OnOpenInGoogleMaps (View view) {
        EditText teamAddress = (EditText) findViewById(R.id.Team_Address_Field);

        // Create a Uri from an intent string. Use the result to create an Intent.
        Uri gmmIntentUri = Uri.parse("http://maps.google.co.in/maps?q="+teamAddress.getText());

        // Create an Intent from gmmIntentUri. Set the action to ACTION VIEW
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);

        // Make the Intent explicit by setting the Google Maps package
        mapIntent.setPackage("com.google.android.apps.maps");

        // Attempt to start an activity that can handle the Intent
        startActivity(mapIntent);

    }

    /*public void OnSetAvatarButton(View view) {
        //Application Context and Activity
        Intent intent = new Intent(getApplicationContext(), ProfileActivity.class);
        startActivityForResult(intent,0);
    }*/

//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//        if (resultCode == RESULT_CANCELED) return;
//        //Getting the Avatar Image we show to our users
//        ImageView avatarImage = (ImageView) findViewById(R.id.avatarImage);
//        //Figuring out the correct image
//        String drawableName = "ic_logo_00";
//        switch (data.getIntExtra("imageID", R.id.teamid00)) {
//            case R.id.teamid00:
//                drawableName = "ic_logo_00";
//                break;
//            case R.id.teamid01:
//                drawableName = "ic_logo_01";
//                break;
//            case R.id.teamid02:
//                drawableName = "ic_logo_02";
//                break;
//            case R.id.teamid03:
//                drawableName = "ic_logo_03";
//                break;
//            case R.id.teamid04:
//                drawableName = "ic_logo_04";
//                break;
//            case R.id.teamid05:
//                drawableName = "ic_logo_05";
//                break;
//            default:
//                drawableName = "ic_logo_00";
//                break;
//        }
//        int resID = getResources().getIdentifier(drawableName, "drawable", getPackageName());
//        avatarImage.setImageResource(resID);
//    }


//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//        if (resultCode != Activity.RESULT_CANCELED) {
//            if (requestCode == CAPTURE_IMAGE) {
//                ImageView imageView = (ImageView) findViewById(R.id.imgView);
//                imageView.setImageBitmap(BitmapFactory.decodeFile(imgPath));
//            }
//        }
//    }


}