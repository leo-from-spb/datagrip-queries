package lb.dgq.language.parser

import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.lang.PsiParser
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet
import lb.dgq.language.ScriptumLanguage
import lb.dgq.language.lexer.ScriptumLexerAdapter
import lb.dgq.language.psi.ScriptumFile
import lb.dgq.language.psi.ScriptumTypes

/**
 *
 */
class ScriptumParserDefinition : ParserDefinition {

    companion object {
        val file: IFileElementType = IFileElementType(ScriptumLanguage)
        val whiteSpaces = TokenSet.create(TokenType.WHITE_SPACE)
        val comments = TokenSet.create(ScriptumTypes.COMMENT)
    }


    override fun createLexer(project: Project?): Lexer {
        return ScriptumLexerAdapter()
    }

    override fun createParser(project: Project?): PsiParser {
        return ScriptumParser()
    }

    override fun createFile(viewProvider: FileViewProvider): PsiFile {
        return ScriptumFile(viewProvider)
    }

    override fun createElement(node: ASTNode?): PsiElement {
        return ScriptumTypes.Factory.createElement(node)
    }

    override fun getFileNodeType(): IFileElementType = file

    override fun getCommentTokens(): TokenSet = comments

    override fun getStringLiteralElements(): TokenSet = TokenSet.EMPTY
}