package com.anggastudio.mysimplecleanarchitecture.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.anggastudio.mysimplecleanarchitecture.domain.MessageEntity
import com.anggastudio.mysimplecleanarchitecture.domain.MessageUseCase

class MainViewModel(private val messageUseCase: MessageUseCase) : ViewModel() {
    private val _message = MutableLiveData<MessageEntity>()
    val message: LiveData<MessageEntity>
        get() = _message

    fun getMessage(name: String) {
        _message.value = messageUseCase.getMessage(name)
    }
}