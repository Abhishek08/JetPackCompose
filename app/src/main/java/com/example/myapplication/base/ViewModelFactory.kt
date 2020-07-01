package com.example.myapplication.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import javax.inject.Inject
import javax.inject.Provider


/**
 * The factory method pattern is a creational design pattern that uses factory methods to create objects.
 * A factory method is a method that returns an instance of the same class.
 * This class will be responsible for instantiating the ViewModel object.
 * the key: for example the class type of ViewModel MyViewModel::class
 * the value: the instance of ViewModel MyViewModel(repository, …)
 */

class ViewModelFactory @Inject constructor(
    private val creators: Map<Class<out ViewModel>, @JvmSuppressWildcards Provider<ViewModel>>
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        var creator: Provider<ViewModel>? = creators[modelClass]
        if (creator == null) {
            for ((key, value) in creators) {
                if (modelClass.isAssignableFrom(key)) {
                    creator = value
                    break
                }
            }
        }
        if (creator == null) throw IllegalArgumentException("unknown model class " + modelClass)
        try {
            return creator.get() as T
        } catch (e: Exception) {
            throw RuntimeException(e)
        }
    }
}
