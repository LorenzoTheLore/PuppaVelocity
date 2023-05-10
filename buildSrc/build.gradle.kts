plugins {
    `kotlin-dsl`
    checkstyle
    alias(libs.plugins.indra.publishing)
}

dependencies {
}

gradlePlugin {
    plugins {
        register("set-manifest-impl-version") {
            id = "set-manifest-impl-version"
            implementationClass = "com.velocitypowered.script.SetManifestImplVersionPlugin"
        }
        register("velocity-checkstyle") {
            id = "velocity-checkstyle"
            implementationClass = "com.velocitypowered.script.VelocityCheckstylePlugin"
        }
        register("velocity-publish") {
            id = "velocity-publish"
            implementationClass = "com.velocitypowered.script.VelocityPublishPlugin"
        }
    }
}
