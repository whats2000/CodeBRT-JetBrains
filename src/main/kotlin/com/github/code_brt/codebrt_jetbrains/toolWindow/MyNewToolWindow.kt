package com.github.code_brt.codebrt_jetbrains.toolWindow

import com.intellij.openapi.project.Project
import com.intellij.openapi.wm.ToolWindow
import com.intellij.openapi.wm.ToolWindowFactory
import javax.swing.JLabel
import javax.swing.JPanel

class MyNewToolWindow : ToolWindowFactory {
    override fun createToolWindowContent(project: Project, toolWindow: ToolWindow) {
        val content = MyToolWindowPanel()
        toolWindow.contentManager.addContent(toolWindow.contentManager.factory.createContent(content, "", false))
    }
}

class MyToolWindowPanel : JPanel() {
    init {
        // 將內容添加到目前的面板
        add(JLabel("這是我的新工具窗口"))
    }
}