package sanjar.uz.final2024january

import android.content.Intent
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import sanjar.uz.final2024january.core.AppCache
import sanjar.uz.final2024january.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.title = "Login"
        supportActionBar?.setBackgroundDrawable(ColorDrawable(resources.getColor(R.color.black)))

        binding.loginBtn.setOnClickListener {
            AppCache.getHelper().username = binding.username.text.toString()
            val intent = Intent(this@LoginActivity, MainActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intent)
        }
        binding.signUp.setOnClickListener {
            val intent = Intent(this@LoginActivity, RegistrationActivity::class.java)
            startActivity(intent)
        }
    }
}