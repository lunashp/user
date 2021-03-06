package com.example.hjproject

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.jpa.repository.config.EnableJpaAuditing
import org.springframework.data.relational.core.mapping.Table
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@EnableJpaAuditing
@SpringBootApplication
class HjprojectApplication

fun main(args: Array<String>) {
    runApplication<HjprojectApplication>(*args)
}
