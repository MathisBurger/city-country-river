package de.mathisburger.ccr

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CcrApplication

fun main(args: Array<String>) {
	runApplication<CcrApplication>(*args)
}
