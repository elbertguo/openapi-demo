package com.turo.petstore

import org.springframework.boot.runApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan(basePackages = ["com.turo.petstore", "com.turo.petstore.generated.apis", "com.turo.petstore.generated.models"])
class Application

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}
