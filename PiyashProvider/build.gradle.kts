apply(plugin = "com.lagradost.cloudstream3.gradle")

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = freeCompilerArgs + "-Xskip-metadata-version-check"
    }
}
