package com.orojinmi.theophilus.sdch.DialogBox;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;

import com.orojinmi.theophilus.sdch.R;

public class MyLoadingAlertDialogFrag extends DialogFragment {

    private AlertDialog.Builder builder;

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        builder = new AlertDialog.Builder(getActivity());
        builder.setView(getActivity().getLayoutInflater().inflate(R.layout.fragment_loading_alert_dialog, null));
        setCancelable(false);
        return builder.create();
    }

    public void callAlertLoadingTaskCallback(AlertLoadingTaskCallback alertLoadingTaskCallback){
        alertLoadingTaskCallback.CallbackTask(this);
    }

    public interface AlertLoadingTaskCallback{
        void CallbackTask(MyLoadingAlertDialogFrag myLoadingAlertDialogFrag);
    }
}
