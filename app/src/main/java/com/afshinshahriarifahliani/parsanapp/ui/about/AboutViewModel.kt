package com.afshinshahriarifahliani.parsanapp.ui.about

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.afshinshahriarifahliani.parsanapp.R

class AboutViewModel(application: Application) : AndroidViewModel(application) {


    private val _text = MutableLiveData<String>().apply {
       value = application.resources.getString(R.string.about)
    }
    val text: LiveData<String> = _text
}