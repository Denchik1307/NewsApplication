package den.project.newsapplication.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FilterModel : ViewModel() {

    private var _filter = MutableLiveData<List<String>>()
    var newsFilter: LiveData<List<String>>
        get() = _filter
        set(value) {
            _filter = value as MutableLiveData<List<String>>
        }
}