package com.github.maxxil.intellijplugin.services

import com.intellij.openapi.project.Project
import com.github.maxxil.intellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
