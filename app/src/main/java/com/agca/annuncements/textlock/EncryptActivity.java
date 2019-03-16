package com.agca.annuncements.textlock;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.math.BigInteger;

public class EncryptActivity extends AppCompatActivity {


    public static String prime1 = EncryptMethods.generatePrimeNumber();
    public static String prime2 = EncryptMethods.generatePrimeNumber();
    public static BigInteger p = new BigInteger(prime1);
    public static BigInteger q = new BigInteger(prime2);
    public static BigInteger n = p.multiply(q);// n = p*q
    public static BigInteger phi = p.subtract(BigInteger.ONE).multiply(q.subtract(BigInteger.ONE)); // phi = (p-1)*(q-1)
    public static String ePrime = EncryptMethods.eAsal();//e generating e key
    public static BigInteger e = new BigInteger(ePrime);// e key
    public static BigInteger d = e.modInverse(phi);
    public static String orginalMessage;
    public static BigInteger[] orginalBigIntegerMessage;
    public static BigInteger[] encryptedBigIntegerMessage;
    public static String encryptedMessage;
    public static int primeNumber;
    public static int ePrimeNumber;
    public static char[] charArray;
    public static int i;
    public static String a = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encrypt);


        final Button btnEncrypt = findViewById(R.id.btnEncrypt);
        final Button btnCopyEncryptedData = findViewById(R.id.btnCopyEncryptedData);
        final EditText etInput = findViewById(R.id.etInput);
        final EditText etOutput = findViewById(R.id.etOutput);

        btnEncrypt.setEnabled(false);
        btnCopyEncryptedData.setEnabled(false);

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
                    btnEncrypt.setEnabled(true);
                } else {
                    btnEncrypt.setEnabled(false);
                }
            }
        });


        //--------------------------- ETINPUT TEXT CHANGE LISTENER ---------------------------------
        etOutput.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (etOutput.getText().toString().length() != 0) {
                    btnCopyEncryptedData.setEnabled(true);
                } else {
                    btnCopyEncryptedData.setEnabled(false);
                }
            }
        });

        //------------------------------ ENCRYPT BUTTON LİSTENER -----------------------------------
        View.OnClickListener btnEncryptListener = new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                try {

                    orginalMessage = etInput.getText().toString();
                    charArray = new char[orginalMessage.length()];
                    orginalBigIntegerMessage = new BigInteger[orginalMessage.length()];
                    encryptedBigIntegerMessage = new BigInteger[orginalMessage.length()];


                    for (i = 0; i < charArray.length; i++) {
                        charArray[i] = orginalMessage.charAt(i);
                        orginalBigIntegerMessage[i] = EncryptMethods.stringtoBigInteger(charArray[i]);
                        encryptedBigIntegerMessage[i] = orginalBigIntegerMessage[i].modPow(d, n);
                        a = a + " " + encryptedBigIntegerMessage[i].toString();
                    }


                    a = e.toString() + " " + n.toString() + a;
                    etOutput.setText(a.trim());
                    etInput.setText("");


                } catch (Exception e) {

                    buildDialog(R.style.Theme_AppCompat_Dialog, "Warning", "The Message, contain non-defined character!");

                }


            }
        };


        btnEncrypt.setOnClickListener(btnEncryptListener);

        //------------------------ COPY ENCRYPTED DATA BUTTON LİSTENER -----------------------------

        View.OnClickListener btnCopyEncryptedDataListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager clipboard = (ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("text", etOutput.getText().toString());
                clipboard.setPrimaryClip(clip);

                Toast.makeText(getApplicationContext(), "Encrypted text is copied.", Toast.LENGTH_SHORT).show();
            }
        };

        btnCopyEncryptedData.setOnClickListener(btnCopyEncryptedDataListener);

    }


        //-------------------------------- DIALOG BUILDING -----------------------------------------
    private void buildDialog(int animationSource, String title, String message) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(title);
        builder.setMessage(message);
        builder.setIcon(android.R.drawable.ic_dialog_alert);
        builder.setNegativeButton("OK", null);
        AlertDialog dialog = builder.create();
        dialog.getWindow().getAttributes().windowAnimations = animationSource; //Diaolg animation is selected by choosing animation source R.style.*
        dialog.show();

    }


}

