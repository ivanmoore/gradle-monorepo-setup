/////////////////////////////
//// settings.gradle.kts ////
/////////////////////////////
rootProject.name = "teashop"

pluginManagement {
    // Specifies an included build for defining custom plugins in the multi-project build.
    includeBuild("gradle/plugins")
}

include("teasite")
include("teapayments")