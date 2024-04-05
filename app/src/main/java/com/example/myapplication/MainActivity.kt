package com.example.myapplication
// References:IIE 2024, Introduction to Mobile Application Development,Module Manual. The Independent institute of Education
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
//declare
    private lateinit var searchButton: Button
    private lateinit var resultTextView: TextView
    private lateinit var ageInput: EditText
    private lateinit var clearButton: Button
//initialize
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        searchButton = findViewById(R.id.searchButton)
        clearButton = findViewById(R.id.clearButton)
        ageInput = findViewById(R.id.ageInput)
        resultTextView = findViewById(R.id.resultTextView)

        searchButton.setOnClickListener {
            val age = ageInput.text.toString().toIntOrNull()
            if (age != null && age in 20..100) {
                val celebrityName = when (age) {
                    52 -> "William Shakespeare" //source: https://en.wikipedia.org/wiki/William_Shakespeare
                    32 -> "Bruce Lee" //source: https://en.wikipedia.org/wiki/Bruce_Lee
                    27 -> "Kurt Cobain" //source: https://en.wikipedia.org/wiki/Kurt_Cobain
                    36 -> "Princess Diana" //source: https://en.wikipedia.org/wiki/Diana,_Princess_of_Wales
                    28 -> "Heath Ledger" //source: https://en.wikipedia.org/wiki/Heath_Ledger
                    35 -> "Mozart" //source: https://en.wikipedia.org/wiki/Wolfgang_Amadeus_Mozart
                    40 -> "John Lennon" //source: https://en.wikipedia.org/wiki/John_Lennon
                    43 -> "Elvis Presley" //source: https://en.wikipedia.org/wiki/Elvis_Presley
                    50 -> "Michael Jackson" //source: https://en.wikipedia.org/wiki/Michael_Jackson
                    else -> null
                }
                val message = if (celebrityName != null) "The celebrity who passed away at age $age: $celebrityName"
                else "No celebrity found with the entered age."
                resultTextView.text = message
            } else {
                resultTextView.text = "Invalid Input. Please enter a valid age between 20 and 100."
            }
        }
    }
}