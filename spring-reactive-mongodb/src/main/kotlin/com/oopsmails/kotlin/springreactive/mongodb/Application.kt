package com.oopsmails.kotlin.springreactive.mongodb


import com.oopsmails.kotlin.springreactive.mongodb.data.Person
import com.oopsmails.kotlin.springreactive.mongodb.data.PersonRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
open class Application {
    @Bean
    open fun init(repository: PersonRepository) = CommandLineRunner {
        repository.deleteAll()
                .then(repository.save(Person("Arthur", "Dent")))
                .then(repository.save(Person("Ford", "Prefect")))
                .subscribe()
    }
}

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}
