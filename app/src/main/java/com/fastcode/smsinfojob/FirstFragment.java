package com.fastcode.smsinfojob;

import android.os.Bundle;
import android.provider.Settings;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.google.android.material.snackbar.Snackbar;

public class FirstFragment extends Fragment {

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        final String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
       final EditText email= view.findViewById(R.id.editTextTextEmailAddress);

        if( email.getText().toString().length() == 0 ) {
            email.setError("Email is required");
        }

        email.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable s) {
                if (!email.getText().toString().matches(emailPattern) && s.length() > 0)
                {
                    email.setError("Email is not valid");
                } else if ( s.length() == 0) {
                    email.setError( "Email is required" );
                }
            }
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // other stuffs
            }
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // other stuffs
            }
        });
        view.findViewById(R.id.requestAPIkey).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String m_androidId = Settings.Secure.getString(getContext().getContentResolver(), Settings.Secure.ANDROID_ID);
                UserSmsInfo userLogin = new UserSmsInfo();
                userLogin.setAndroidId(m_androidId);
                userLogin.setEmail(email.getText().toString());
                RequestApiKeyAsyncTask requestApiKeyAsyncTask = new RequestApiKeyAsyncTask();
                requestApiKeyAsyncTask.execute(userLogin);
                Toast.makeText(getActivity(), "An API key was sent to " + email.getText().toString() + " . You can now  start sending programmable sms with the code snippet on wwww.smsinfojob.com",
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}