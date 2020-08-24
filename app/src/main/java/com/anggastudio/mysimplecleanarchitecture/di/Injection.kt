package com.anggastudio.mysimplecleanarchitecture.di

import com.anggastudio.mysimplecleanarchitecture.data.IMessageDataSource
import com.anggastudio.mysimplecleanarchitecture.data.MessageDataSource
import com.anggastudio.mysimplecleanarchitecture.data.MessageRepository
import com.anggastudio.mysimplecleanarchitecture.domain.IMessageRepository
import com.anggastudio.mysimplecleanarchitecture.domain.MessageInteractor
import com.anggastudio.mysimplecleanarchitecture.domain.MessageUseCase

object Injection {
    fun provideUseCase(): MessageUseCase {
        val messageRepository = provideRepository()
        return MessageInteractor(messageRepository)
    }

    private fun provideRepository(): IMessageRepository {
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)
    }

    private fun provideDataSource(): MessageDataSource {
        return MessageDataSource()
    }
}