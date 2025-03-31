package vcmsa.ci.imadproject1

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        var textView2 = findViewById<TextView>(R.id.textView2)
        val editText = findViewById<EditText>(R.id.editText)
        val butt = findViewById<TextView>(R.id.butt)

        val textView3 = findViewById<TextView>(R.id.textView3)
        val resetButton = findViewById<TextView>(R.id.resetButton)


        butt.setOnClickListener {
            val str = editText.text.toString()
            textView3.text = str

            val input = textView3.text.toString().trim()//get input from TextView


            when (input) {
                "morning" -> textView3.text = "Breakfast e.g eggs or pancakes"
                "mid-morning" -> textView3.text = "Snack e.g tuna sandwich or peanuts"
                "afternoon" -> textView3.text = "Lunch e.g burger or ribs"
                "mid-afternoon" -> textView3.text = "Snack e.g pineapple or grapes"
                "evening" -> textView3.text = "Dinner e.g beef curry or macaroni and cheese"
                "night" -> textView3.text ="Late-night Snack e.g ice cream or biscuits"
                else -> Toast.makeText(this,"NICE TRY MATE,TRY SOMETHING ELSE", Toast.LENGTH_SHORT).show()
                }

            // reset button fun
            resetButton.setOnClickListener {
                textView3.text ="" //clear the TextView
                editText.text.clear() //clear the EditText
                Toast.makeText(this,"Reset Successful",Toast.LENGTH_SHORT).show()
            }





                ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
                    val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
                    v.setPadding(
                        systemBars.left,
                        systemBars.top,
                        systemBars.right,
                        systemBars.bottom
                    )
                    insets
                }
            }
        }
    }