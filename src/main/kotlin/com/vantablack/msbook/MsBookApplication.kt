package com.vantablack.msbook

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MsBookApplication

fun main(args: Array<String>) {
	runApplication<MsBookApplication>(*args)
}
