package com.turo.petstore.generated.apis

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import java.util.Optional

@jakarta.annotation.Generated(value = ["org.openapitools.codegen.languages.KotlinSpringServerCodegen"])
@Controller
@RequestMapping("\${openapi.swaggerPetstoreOpenAPI30.base-path:/api/v3}")
class StoreApiController(
        @org.springframework.beans.factory.annotation.Autowired(required = false) delegate: StoreApiDelegate?
) : StoreApi {
    private val delegate: StoreApiDelegate

    init {
        this.delegate = Optional.ofNullable(delegate).orElse(object : StoreApiDelegate {})
    }

    override fun getDelegate(): StoreApiDelegate = delegate
}
