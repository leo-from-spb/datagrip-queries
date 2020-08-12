package lb.dgq.actions

import com.intellij.notification.Notification
import com.intellij.notification.NotificationType
import com.intellij.notification.Notifications
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent


class ShowScriptumFilesAction : AnAction() {

    override fun actionPerformed(e: AnActionEvent) {
        //val dw = DialogWrapper()
        Notifications.Bus.notify(Notification("XXX", "Title", "Content", NotificationType.INFORMATION))
    }
    
}