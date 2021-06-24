package com.github.thetbw.springjumptemplate.services

import com.github.thetbw.springjumptemplate.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
