package mn2.request.executed.twice

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/sample")
class SampleController {
    @Get
    suspend fun test() = println("REQUEST")
}
