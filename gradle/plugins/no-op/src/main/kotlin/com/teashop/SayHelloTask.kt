///////////////////////////////////////////////////////////////////
//// gradle/plugins/no-op/src/main/kotlin/com/teashop/SayHelloTask.kt ////
///////////////////////////////////////////////////////////////////
package com.teashop

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction
import org.gradle.work.DisableCachingByDefault

@DisableCachingByDefault(because = "By default you should say hello.")
abstract class SayHelloTask : DefaultTask() {

    @TaskAction
    fun sayHello() {
        logger.lifecycle("Hello!")
    }
}