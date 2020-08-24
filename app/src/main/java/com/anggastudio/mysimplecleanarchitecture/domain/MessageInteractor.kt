package com.anggastudio.mysimplecleanarchitecture.domain

class MessageInteractor(private var messageRepository: IMessageRepository) : MessageUseCase {
    override fun getMessage(name: String): MessageEntity {
        return messageRepository.getWelcomeMessage(name)
    }
}