package com.agca.annuncements.textlock;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.math.BigInteger;

public class DecryptActivity extends AppCompatActivity {


    public static BigInteger n;
    public static BigInteger e;
    public static BigInteger[] encryptedBigIntegerMessage;
    public static BigInteger[] decryptedBigIntegerMessage;
    public static char[] decryptedMessage;
    public static String[] encryptedBigIntegerMessages;
    public static int i;
    public static String s = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decrypt);

        final Button btnDecrypt = findViewById(R.id.btnDecrypt);
        final EditText etInput = findViewById(R.id.etInput);
        final EditText etOutput = findViewById(R.id.etOutput);

        btnDecrypt.setEnabled(false);

        //--------------------------- ETINPUT TEXT CHANGE LISTENER ---------------------------------
        etInput.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (etInput.getText().toString().length() != 0) {
                    btnDecrypt.setEnabled(true);
                } else {
                    btnDecrypt.setEnabled(false);
                }
            }
        });

        //------------------------------ DECRYPT BUTTON LİSTENER -----------------------------------
        View.OnClickListener btnDecryptListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {

                    encryptedBigIntegerMessages = etInput.getText().toString().split(" ");
                    encryptedBigIntegerMessage = new BigInteger[encryptedBigIntegerMessages.length];
                    decryptedBigIntegerMessage = new BigInteger[encryptedBigIntegerMessages.length];
                    decryptedMessage = new char[encryptedBigIntegerMessages.length];
                    e = new BigInteger(encryptedBigIntegerMessages[0]);
                    n = new BigInteger(encryptedBigIntegerMessages[1]);


                    for (i = 2; i < encryptedBigIntegerMessages.length; i++) {
                        long a = Long.parseLong(encryptedBigIntegerMessages[i]);
                        encryptedBigIntegerMessage[i] = BigInteger.valueOf(a);
                        decryptedBigIntegerMessage[i] = encryptedBigIntegerMessage[i].modPow(e, n);
                        decryptedMessage[i] = DecryptMethods.bigIntegerToString(decryptedBigIntegerMessage[i]);
                        s = s + decryptedMessage[i];

                    }

                    etOutput.setText(s);
                    s = "";
                    etInput.setText("");

                } catch (Exception e) {
                    buildDialog(R.style.Theme_AppCompat_Dialog, "Warning", "The Message, contain non-defined character!");
                }

            }
        };

        btnDecrypt.setOnClickListener(btnDecryptListener);

    }

        //-------------------------------- DIALOG BUILDING -----------------------------------------
    private void buildDialog(int animationSource, String title, String message) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(title);
        builder.setMessage(message);
        builder.setNegativeButton("OK", null);
        builder.setIcon(android.R.drawable.ic_dialog_alert);
        AlertDialog dialog = builder.create();
        dialog.getWindow().getAttributes().windowAnimations = animationSource; //Diaolg animation is selected by choosing animation source R.style.*
        dialog.show();

    }
}
