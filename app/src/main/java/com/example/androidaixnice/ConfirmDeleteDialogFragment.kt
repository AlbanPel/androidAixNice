package com.example.androidaixnice


import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import androidx.fragment.app.DialogFragment
import android.os.Bundle
import android.util.Log

class ConfirmDeleteDialogFragment : DialogFragment() {
    val TAG = ConfirmDeleteDialogFragment::class.java.simpleName

    interface ConfirmDeleteListner {
        fun onDialogPositiveClick()
        fun onDialogNegativeClick()
    }

    var listner: ConfirmDeleteListner? = null

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builder = AlertDialog.Builder(activity)
        //config builder
        builder?.setMessage("Supprimer tout le contenu")
            ?.setPositiveButton("oui", object : DialogInterface.OnClickListener{
                override fun onClick(dialog: DialogInterface?, id: Int) {
                    Log.i(TAG, "Tu vas tout casser")
                    listner?.onDialogPositiveClick()
                }
            })
            ?.setNegativeButton("Non de non", DialogInterface.OnClickListener{dialog, id ->
             Log.i(TAG, "ok j efface rien")
                dialog.dismiss()
                listner?.onDialogNegativeClick()
            })
            return builder.create()
    }

}