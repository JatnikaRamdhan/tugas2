package com.example.tugas_intent_jatnika

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

private editext edt,
private string str ="nama";


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    edt (edittext)findviewbyId(R.Id.Edit);

    fun kirimyu(view: View) {
        intent intentku= new intent (packageContext:MainActivity.this, MainActivity2.class);
        intentku.putExtra(name: "nama", edt.getext(). toString);
        startActivity(intenku);

    }
}