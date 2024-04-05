Elrique Dolf
ST10434187
App description :

Enter Your Age Button: When users open the app, they are prompted to input their age using the "Enter Your Age" button. This age serves as the parameter for the app's search function. Users can type in their age manually or use a scroll wheel to select their age from a range.

Clear Button: The "Clear" button allows users to reset the input field if they wish to enter a different age. It clears the previously entered age, ensuring a smooth and user-friendly experience.

Search Button: After entering their age, users can click on the "Search" button to initiate the search process. The app then retrieves data from its database to display information about individuals who died at the same age as the user's input. This information may include the names, ages, of these individuals, providing users with insights into historical figures, celebrities, or notable personalities who passed away at the same age.

Display of Results: The app presents the search results in a clear and organized manner, making it easy for users to browse through the information. Users can scroll through the list of individuals who died at their age, click on each entry for more details, or share the results with others through social media or messaging platforms.

Code used: 

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
        resultTextView = findViewById(R.id.resultsTextView)

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

Disclaimer:

Unfortunely getting the app to run was a hassle despite all my efforts. I only got it to the point where it installed on my phone. Due to countless errors to a bug that i dont yet know how to fix.This was the best I could currently do. If it works on ma'ams emulator please grade according to that because a pc upgrade to run blestacks is not in my budget right now and the vc doesnt work for me either but i will get it sorted in due time.

youtuble link: https://youtu.be/vOXANt21hGM?si=ni1gVEFv3HkGCZ85

