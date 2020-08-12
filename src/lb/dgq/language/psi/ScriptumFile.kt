package lb.dgq.language.psi

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.psi.FileViewProvider
import lb.dgq.language.ScriptumLanguage
import lb.dgq.language.ScriptumLanguageFileType

/**
 *
 */
class ScriptumFile (viewProvider: FileViewProvider) : PsiFileBase(viewProvider, ScriptumLanguage) {

    override fun getFileType() = ScriptumLanguageFileType

    override fun toString(): String = "ScriptumFile"

}