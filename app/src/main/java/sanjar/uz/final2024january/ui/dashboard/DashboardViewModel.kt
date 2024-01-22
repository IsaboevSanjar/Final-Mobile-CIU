package sanjar.uz.final2024january.ui.dashboard

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import sanjar.uz.final2024january.core.AppCache

class DashboardViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is profile Fragment\n ${AppCache.getHelper().username}"
    }
    val text: LiveData<String> = _text
}