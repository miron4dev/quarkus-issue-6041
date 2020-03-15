package com.miron4dev

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import javax.enterprise.context.ApplicationScoped
import javax.enterprise.inject.Produces

@ApplicationScoped
class JacksonConfiguration {

    @Produces
    fun objectMapper(): ObjectMapper = jacksonObjectMapper()
}