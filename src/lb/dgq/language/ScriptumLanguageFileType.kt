package lb.dgq.language

import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon


object ScriptumLanguageFileType : LanguageFileType(ScriptumLanguage) {

    override fun getName() = ScriptumLanguageName

    override fun getDescription() = ScriptumLanguageDescription

    override fun getDefaultExtension() = ScriptumLanguageFileExtension

    override fun getIcon(): Icon? = null

}
