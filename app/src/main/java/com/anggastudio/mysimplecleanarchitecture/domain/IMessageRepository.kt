package com.anggastudio.mysimplecleanarchitecture.domain

interface IMessageRepository {
    fun getWelcomeMessage(name: String): MessageEntity
}