package com.oopsmails.kotlin.springreactive.mongodb.data

import org.springframework.data.repository.reactive.ReactiveCrudRepository

interface PersonRepository: ReactiveCrudRepository<Person, String>