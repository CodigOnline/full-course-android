package es.codigonline.proyecto.tema_10

import androidx.lifecycle.*
import es.codigonline.proyecto.tema_10.app.App
import es.codigonline.proyecto.tema_10.database.entities.Alumno
import es.codigonline.proyecto.tema_10.database.entities.Materia
import es.codigonline.proyecto.tema_10.database.entities.Nota
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainActivityViewModel : ViewModel() {

    private val alumnoDao = App.db.alumnoDao()
    private val materiaDao = App.db.materiaDao()
    private val notaDao = App.db.notaDao()

    val alumnos = alumnoDao.findAllWithNotas().asLiveData()
    val materiasConNotas = materiaDao.findAllWithNotas().asLiveData()

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

    fun saveMateria(materia: Materia): LiveData<Long> {
        val liveData = MutableLiveData<Long>()
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                val id = materiaDao.create(materia)
                liveData.postValue(id)
            }
        }
        return liveData
    }

    fun saveNota(nota: Nota): LiveData<Long> {
        val liveData = MutableLiveData<Long>()
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                val id = notaDao.create(nota)
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