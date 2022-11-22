package com.turo.petstore.generated.apis

import com.turo.petstore.generated.models.Order
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.context.request.NativeWebRequest
import org.springframework.core.io.Resource

import java.util.Optional

/**
 * A delegate to be called by the {@link StoreApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@jakarta.annotation.Generated(value = ["org.openapitools.codegen.languages.KotlinSpringServerCodegen"])
interface StoreApiDelegate {

    fun getRequest(): Optional<NativeWebRequest> = Optional.empty()

    /**
     * @see StoreApi#deleteOrder
     */
    fun deleteOrder(orderId: kotlin.Long): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)

    }


    /**
     * @see StoreApi#getInventory
     */
    fun getInventory(): ResponseEntity<Map<String, kotlin.Int>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)

    }


    /**
     * @see StoreApi#getOrderById
     */
    fun getOrderById(orderId: kotlin.Long): ResponseEntity<Order> {
        getRequest().ifPresent { request ->
            for (mediaType in MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"petId\" : 198772,  \"quantity\" : 7,  \"id\" : 10,  \"shipDate\" : \"2000-01-23T04:56:07.000+00:00\",  \"complete\" : true,  \"status\" : \"approved\"}")
                    break
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/xml"))) {
                    ApiUtil.setExampleResponse(request, "application/xml", "<order>  <id>10</id>  <petId>198772</petId>  <quantity>7</quantity>  <shipDate>2000-01-23T04:56:07.000Z</shipDate>  <status>approved</status>  <complete>true</complete></order>")
                    break
                }
            }
        }
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)

    }


    /**
     * @see StoreApi#placeOrder
     */
    fun placeOrder(order: Order?): ResponseEntity<Order> {
        getRequest().ifPresent { request ->
            for (mediaType in MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"petId\" : 198772,  \"quantity\" : 7,  \"id\" : 10,  \"shipDate\" : \"2000-01-23T04:56:07.000+00:00\",  \"complete\" : true,  \"status\" : \"approved\"}")
                    break
                }
            }
        }
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)

    }

}
