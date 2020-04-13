package mn2.request.executed.twice

import io.micronaut.runtime.Micronaut

object Application {

    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.build()
                .packages("mn2.request.executed.twice")
                .mainClass(Application.javaClass)
                .start()
    }
}