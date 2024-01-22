package sanjar.uz.finalpreperation.ui.dashboard

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import sanjar.uz.finalpreperation.core.AppCache

class DashboardViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is profile Fragment\n ${AppCache.getHelper().username}"
    }
    val text: LiveData<String> = _text
}