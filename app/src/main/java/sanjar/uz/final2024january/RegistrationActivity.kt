package sanjar.uz.final2024january

import android.content.Intent
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import sanjar.uz.final2024january.core.AppCache
import sanjar.uz.final2024january.databinding.ActivityRegistrationBinding

class RegistrationActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRegistrationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegistrationBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.setBackgroundDrawable(ColorDrawable(resources.getColor(R.color.black)))

        supportActionBar?.title = "Register"
        binding.registerBtn.setOnClickListener {
            AppCache.getHelper().username = binding.email.text.toString()
            val intent = Intent(this@RegistrationActivity, MainActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intent)
        }
        binding.singIn.setOnClickListener {
            val intent = Intent(this@RegistrationActivity, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}