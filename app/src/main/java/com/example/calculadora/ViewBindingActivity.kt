package com.example.calculadora

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.calculadora.databinding.ActivityMainBinding

class ViewBindingActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.calcular.setOnClickListener(){
            val numberone:Int  =binding.numero1.toString().toInt()
            val numbertwo:Int = binding.numero2.toString().toInt()

            if(binding.suma.isChecked){
                val suma:Int = numberone+numbertwo
                binding.resultado.text="$suma"
            }else{
                binding.suma.isChecked
               val resta:Int =  numberone-numbertwo
                binding.resultado.text="$resta"
            }





        }







    }
}
