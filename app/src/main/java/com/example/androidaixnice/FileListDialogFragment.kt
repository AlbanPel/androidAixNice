package com.example.androidaixnice

import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.DialogFragment

class FileListDialogFragment : DialogFragment() {
    val TAG = FileListDialogFragment::class.java.simpleName

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builder = AlertDialog.Builder(activity)
        val inflater = activity?.layoutInflater

        builder.setView(inflater?.inflate(R.layout.dialog_file_list, null))
            .setPositiveButton("Supprimer", DialogInterface.OnClickListener{dialog, id ->
                Log.i(TAG, "Suppression en cours....")
            })
            .setNegativeButton("Annuler", DialogInterface.OnClickListener{dialog, id ->
                dialog.dismiss()
            })
            .setTitle("Contenu supprimé")
        return builder.create()
        //return super.onCreateDialog(savedInstanceState)
    }

}