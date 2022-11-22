package com.turo.petstore.api

import com.turo.petstore.generated.apis.PetApiDelegate
import com.turo.petstore.generated.models.Pet
import org.slf4j.LoggerFactory
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service

@Service
class PetApiService: PetApiDelegate {
    private val log = LoggerFactory.getLogger(this.javaClass)

    override fun getPetById(petId: kotlin.Long): ResponseEntity<Pet> {
        log.info("Overriding getPetById")

        return ResponseEntity(HttpStatus.I_AM_A_TEAPOT)
    }
}