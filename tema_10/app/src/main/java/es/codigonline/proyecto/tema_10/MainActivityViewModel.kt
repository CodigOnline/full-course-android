package es.codigonline.proyecto.tema_10

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import es.codigonline.proyecto.tema_10.app.App
import es.codigonline.proyecto.tema_10.database.entities.Alumno
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainActivityViewModel : ViewModel() {

    private val alumnoDao = App.db.alumnoDao()

    fun saveAlumno(alumno: Alumno): LiveData<Long> {
        val liveData = MutableLiveData<Long>()
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                val id = alumnoDao.create(alumno)
                liveData.postValue(id)
            }
        }
        return liveData
    }
}