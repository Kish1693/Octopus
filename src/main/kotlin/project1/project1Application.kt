package project1

import io.dropwizard.Application
import io.dropwizard.setup.Bootstrap
import io.dropwizard.setup.Environment

class project1Application : Application<project1Configuration>() {

    override fun getName(): String {
        return "project1"
    }

    override fun initialize(bootstrap: Bootstrap<project1Configuration>) {
        // TODO: application initialization
    }

    override fun run(configuration: project1Configuration,
                     environment: Environment) {
        // TODO: implement application
    }
}

fun main(args: Array<String>) {
    project1Application().run(*args)
}

