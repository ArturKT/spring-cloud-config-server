package com.softmaker.springcloudconfigserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.config.server.EnableConfigServer

@EnableConfigServer
@SpringBootApplication
class SpringCloudConfigServer

fun main(args: Array<String>) {
    runApplication<SpringCloudConfigServer>(*args)
}
