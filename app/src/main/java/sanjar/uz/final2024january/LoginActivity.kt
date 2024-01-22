package sanjar.uz.final2024january

import android.content.Intent
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
        binding.loginBtn.setOnClickListener {
            AppCache.getHelper().username = binding.edtUsername.text.toString()
            val intent = Intent(this@LoginActivity, MainActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intent)
        }
    }
}