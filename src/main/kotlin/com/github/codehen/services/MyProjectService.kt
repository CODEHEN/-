package com.github.codehen..services

import com.intellij.openapi.project.Project
import com.github.codehen..MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
