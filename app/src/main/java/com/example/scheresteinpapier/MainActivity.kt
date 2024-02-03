package com.example.scheresteinpapier

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.scheresteinpapier.ui.theme.SchereSteinPapierTheme




class MainActivity : ComponentActivity() {

    private lateinit var tvSymbolComp: TextView
    private lateinit var tvSymbolSpieler: TextView

    private lateinit var btnStart: Button

    private lateinit var textView: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            setContentView(R.layout.activity_main)

            btnStart = findViewById(R.id.btnStart)

            tvSymbolComp = findViewById(R.id.tvSymbolComp)
            tvSymbolSpieler = findViewById(R.id.tvSymbolSpieler)

            textView = findViewById(R.id.textView)

            // Liste mit Zahlen denen symbole zugeordnet sind

            val choice = listOf("✂️", "🪨", "📃")


            //BUTTON EVENT LISTERNER

            btnStart.setOnClickListener() {
                val playerSymbol = choice.random()
                val compSymbol = choice.random()

                tvSymbolComp.text = compSymbol
                tvSymbolSpieler.text = playerSymbol

                if (playerSymbol === compSymbol){
                    textView.text = "Gleichstand"
                }
                if  (playerSymbol == "✂️" && compSymbol == "🪨") {
                    textView.text = "Verloren"
                }
                if (playerSymbol == "✂️" && compSymbol == "📃" ){
                    textView.text = "Gewonnen"
                }
                if (playerSymbol == "🪨" && compSymbol == "📃" ) {
                    textView.text = "Verloren"
                }
                if (playerSymbol == "🪨" && compSymbol == "✂️" ) {
                    textView.text = "Gewonnen"
                }
                if (playerSymbol == "📃" && compSymbol == "✂️" ) {
                    textView.text = "Verloren"
                }
                if (playerSymbol == "📃" && compSymbol == "🪨" ) {
                    textView.text = "Gewonnen"
                }
            }

        }

    }

}



