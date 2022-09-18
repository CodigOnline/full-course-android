package es.codigonline.proyecto.tema_9

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainViewModel : ViewModel() {

    fun getData(): LiveData<Boolean> {

        var data: MutableLiveData<Boolean> = MutableLiveData<Boolean>()
        data.value = false
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                Log.d("SLEEP", "EMPIEZO LA CORUTINA")
                Thread.sleep(9000)
                Log.d("SLEEP", "FINALIZO LA CORUTINA")
                data.postValue(true)
                data.postValue(true)
                data.postValue(true)
                data.postValue(true)


            }
        }
        return data
    }
}