package com.miron4dev

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.KotlinModule
import io.quarkus.jackson.ObjectMapperCustomizer
import org.slf4j.LoggerFactory
import javax.inject.Singleton

@Singleton
class RegisterCustomModuleCustomizer: ObjectMapperCustomizer {

    override fun customize(objectMapper: ObjectMapper) {
        logger.info("Registering Kotlin extension")
        objectMapper.registerModule(KotlinModule())
    }

    companion object {
        private val logger = LoggerFactory.getLogger(RegisterCustomModuleCustomizer::class.java)
    }
}