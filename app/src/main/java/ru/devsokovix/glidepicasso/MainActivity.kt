package ru.devsokovix.glidepicasso

import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bumptech.glide.Glide
import ru.devsokovix.glidepicasso.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        val link =
            "https://masterpiecer-images.s3.yandex.net/c352b1b9801c11ee9607720ccb3e265f:upscaled"
        Glide.with(this)//В параметры метод передаем контекст
            .load(link)//Указываем, что будем загружать
            .centerCrop()
            .placeholder(R.drawable.circular)//Картинка/анимация, которая будет отображаться, пока картинка не загрузится
            .into(binding.imageView)//Указываем, куда будем загружать
    }
}
