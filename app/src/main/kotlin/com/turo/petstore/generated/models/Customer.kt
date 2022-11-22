package com.turo.petstore.generated.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.turo.petstore.generated.models.Address
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * 
 * @param id 
 * @param username 
 * @param address 
 */
data class Customer(

    @Schema(example = "100000", description = "")
    @field:JsonProperty("id") val id: kotlin.Long? = null,

    @Schema(example = "fehguy", description = "")
    @field:JsonProperty("username") val username: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @field:JsonProperty("address") val address: kotlin.collections.List<Address>? = null
) {

}

