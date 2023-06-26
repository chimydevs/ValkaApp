package com.chimy.valkaapp.contadores

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.chimy.valkaapp.R

class ContadoresActivity : AppCompatActivity() {

    private lateinit var vidaDecrementHeroe1: Button
    private lateinit var vidaIncrementHeroe1: Button
    private lateinit var vidaHeroe1: TextView
    private var currentLife: Int = 50

    private lateinit var ataqueHeroe1: TextView
    private lateinit var ataqueDecrementHeroe1: Button
    private lateinit var ataqueIncrementHeroe1: Button
    private var currentAtk: Int = 50

    private lateinit var defensaHeroe1: TextView
    private lateinit var defensaDecrementHeroe1: Button
    private lateinit var defensaIncrementHeroe1: Button
    private var currentDef: Int = 50

    //heroe2
    private lateinit var vidaDecrementHeroe2: Button
    private lateinit var vidaIncrementHeroe2: Button
    private lateinit var vidaHeroe2: TextView
    private var currentLife2: Int = 50

    private lateinit var ataqueHeroe2: TextView
    private lateinit var ataqueDecrementHeroe2: Button
    private lateinit var ataqueIncrementHeroe2: Button
    private var currentAtk2: Int = 50

    private lateinit var defensaHeroe2: TextView
    private lateinit var defensaDecrementHeroe2: Button
    private lateinit var defensaIncrementHeroe2: Button
    private var currentDef2: Int = 50

    //heroe3
    private lateinit var vidaDecrementHeroe3: Button
    private lateinit var vidaIncrementHeroe3: Button
    private lateinit var vidaHeroe3: TextView
    private var currentLife3: Int = 50

    private lateinit var ataqueHeroe3: TextView
    private lateinit var ataqueDecrementHeroe3: Button
    private lateinit var ataqueIncrementHeroe3: Button
    private var currentAtk3: Int = 50

    private lateinit var defensaHeroe3: TextView
    private lateinit var defensaDecrementHeroe3: Button
    private lateinit var defensaIncrementHeroe3: Button
    private var currentDef3: Int = 50

    //fortaleza
    private lateinit var fortalezaVida: TextView
    private lateinit var fortalezaDecrement: Button
    private lateinit var fortalezaIncrement: Button
    private var currentFort: Int = 50

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contadores)
        initComponents()
        initListeners()
        initUI()
    }


    private fun initComponents() {
        //heroe1
        vidaHeroe1 = findViewById(R.id.vidaHeroe1)
        vidaDecrementHeroe1 = findViewById(R.id.vidaDecrementHeroe1)
        vidaIncrementHeroe1 = findViewById(R.id.vidaIncrementHeroe1)
        ataqueHeroe1 = findViewById(R.id.ataqueHeroe1)
        ataqueDecrementHeroe1 = findViewById(R.id.ataqueDecrementHeroe1)
        ataqueIncrementHeroe1 = findViewById(R.id.ataqueIncrementHeroe1)
        defensaHeroe1 = findViewById(R.id.defensaHeroe1)
        defensaDecrementHeroe1 = findViewById(R.id.defensaDecrementHeroe1)
        defensaIncrementHeroe1 = findViewById(R.id.defensaIncrementHeroe1)
        //heroe2
        vidaHeroe2 = findViewById(R.id.vidaHeroe2)
        vidaDecrementHeroe2 = findViewById(R.id.vidaDecrementHeroe2)
        vidaIncrementHeroe2 = findViewById(R.id.vidaIncrementHeroe2)
        ataqueHeroe2 = findViewById(R.id.ataqueHeroe2)
        ataqueDecrementHeroe2 = findViewById(R.id.ataqueDecrementHeroe2)
        ataqueIncrementHeroe2 = findViewById(R.id.ataqueIncrementHeroe2)
        defensaHeroe2 = findViewById(R.id.defensaHeroe2)
        defensaDecrementHeroe2 = findViewById(R.id.defensaDecrementHeroe2)
        defensaIncrementHeroe2 = findViewById(R.id.defensaIncrementHeroe2)
        //heroe3
        vidaHeroe3 = findViewById(R.id.vidaHeroe3)
        vidaDecrementHeroe3 = findViewById(R.id.vidaDecrementHeroe3)
        vidaIncrementHeroe3 = findViewById(R.id.vidaIncrementHeroe3)
        ataqueHeroe3 = findViewById(R.id.ataqueHeroe3)
        ataqueDecrementHeroe3 = findViewById(R.id.ataqueDecrementHeroe3)
        ataqueIncrementHeroe3 = findViewById(R.id.ataqueIncrementHeroe3)
        defensaHeroe3 = findViewById(R.id.defensaHeroe3)
        defensaDecrementHeroe3 = findViewById(R.id.defensaDecrementHeroe3)
        defensaIncrementHeroe3 = findViewById(R.id.defensaIncrementHeroe3)
        //fortaleza
        fortalezaVida = findViewById(R.id.fortalezaVida)
        fortalezaDecrement = findViewById(R.id.fortalezaDecrement)
        fortalezaIncrement = findViewById(R.id.fortalezaIncrement)

    }

    private fun initListeners() {
        vidaDecrementHeroe1.setOnClickListener {
            currentLife -= 1
            setLife()
        }
        vidaIncrementHeroe1.setOnClickListener {
            currentLife += 1
            setLife()
        }
        ataqueDecrementHeroe1.setOnClickListener {
            currentAtk -= 1
            setAtk()
        }
        ataqueIncrementHeroe1.setOnClickListener {
            currentAtk += 1
            setAtk()
        }
        defensaDecrementHeroe1.setOnClickListener {
            currentDef -= 1
            setDef()
        }
        defensaIncrementHeroe1.setOnClickListener {
            currentDef += 1
            setDef()
        }
        //Heroe2
        vidaDecrementHeroe2.setOnClickListener {
            currentLife2 -= 1
            setLife2()
        }
        vidaIncrementHeroe2.setOnClickListener {
            currentLife2 += 1
            setLife2()
        }
        ataqueDecrementHeroe2.setOnClickListener {
            currentAtk2 -= 1
            setAtk2()
        }
        ataqueIncrementHeroe2.setOnClickListener {
            currentAtk2 += 1
            setAtk2()
        }
        defensaDecrementHeroe2.setOnClickListener {
            currentDef2 -= 1
            setDef2()
        }
        defensaIncrementHeroe2.setOnClickListener {
            currentDef2 += 1
            setDef2()
        }
        //heroe3
        vidaDecrementHeroe3.setOnClickListener {
            currentLife3 -= 1
            setLife3()
        }
        vidaIncrementHeroe3.setOnClickListener {
            currentLife3 += 1
            setLife3()
        }
        ataqueDecrementHeroe3.setOnClickListener {
            currentAtk3 -= 1
            setAtk3()
        }
        ataqueIncrementHeroe3.setOnClickListener {
            currentAtk3 += 1
            setAtk3()
        }
        defensaDecrementHeroe3.setOnClickListener {
            currentDef3 -= 1
            setDef3()
        }
        defensaIncrementHeroe3.setOnClickListener {
            currentDef3 += 1
            setDef3()
        }
        fortalezaDecrement.setOnClickListener {
            currentFort -= 1
            setFortaleza()
        }
        fortalezaIncrement.setOnClickListener {
            currentFort += 1
            setFortaleza()
        }

    }

    private fun setFortaleza(){
        fortalezaVida.text = currentFort.toString()
    }
    private fun setLife() {
        vidaHeroe1.text = currentLife.toString()

    }

    private fun setLife2() {
        vidaHeroe2.text = currentLife2.toString()
    }

    private fun setLife3() {
        vidaHeroe3.text = currentLife3.toString()
    }

    private fun setAtk() {
        ataqueHeroe1.text = currentAtk.toString()

    }

    private fun setAtk2() {
        ataqueHeroe2.text = currentAtk2.toString()
    }

    private fun setAtk3() {
        ataqueHeroe3.text = currentAtk3.toString()
    }

    private fun setDef() {
        defensaHeroe1.text = currentDef.toString()

    }

    private fun setDef2() {
        defensaHeroe2.text = currentDef2.toString()
    }

    private fun setDef3() {
        defensaHeroe3.text = currentDef3.toString()
    }

    private fun initUI() {
        setLife()
        setAtk()
        setDef()
        setLife2()
        setAtk2()
        setDef2()
        setLife3()
        setAtk3()
        setDef3()
    }

}