package com.anggastudio.mysimplecleanarchitecture.data

import com.anggastudio.mysimplecleanarchitecture.domain.MessageEntity

class MessageDataSource {
    fun getMessageFromSource(name: String) =
        MessageEntity("Hello $name! Welcome to Clean Architecture")
}