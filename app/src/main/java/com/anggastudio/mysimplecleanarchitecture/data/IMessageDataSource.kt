package com.anggastudio.mysimplecleanarchitecture.data

import com.anggastudio.mysimplecleanarchitecture.domain.MessageEntity

interface IMessageDataSource {
    fun getMessageFromSource(name: String): MessageEntity
}