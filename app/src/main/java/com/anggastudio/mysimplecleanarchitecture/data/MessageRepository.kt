package com.anggastudio.mysimplecleanarchitecture.data

import com.anggastudio.mysimplecleanarchitecture.domain.IMessageRepository

class MessageRepository(private val messageDataSource: MessageDataSource) : IMessageRepository {
    override fun getWelcomeMessage(name: String) =
        messageDataSource.getMessageFromSource(name)
}