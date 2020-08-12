// This is a generated file. Not intended for manual editing.
package lb.dgq.language.psi;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.tree.IElementType;
import lb.dgq.language.psi.impl.ScriptumPropertyImpl;

public interface ScriptumTypes {

  IElementType PROPERTY = new ScriptumElementType("PROPERTY");

  IElementType COMMENT = new ScriptumTokenType("COMMENT");
  IElementType CRLF = new ScriptumTokenType("CRLF");
  IElementType KEY = new ScriptumTokenType("KEY");
  IElementType SEPARATOR = new ScriptumTokenType("SEPARATOR");
  IElementType VALUE = new ScriptumTokenType("VALUE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == PROPERTY) {
        return new ScriptumPropertyImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
