package es.codigonline.proyecto.tema_10

import androidx.lifecycle.*
import es.codigonline.proyecto.tema_10.app.App
import es.codigonline.proyecto.tema_10.database.entities.Alumno
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainActivityViewModel : ViewModel() {

    private val alumnoDao = App.db.alumnoDao()

    val alumnos = alumnoDao.findAll().asLiveData()

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

   /* fun findAll(): LiveData<List<Alumno>> {
        val liveData = MutableLiveData<List<Alumno>>()
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                val alumnos = alumnoDao.findAll()
                liveData.postValue(alumnos)
            }
        }
        return liveData
    }*/
}