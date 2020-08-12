// This is a generated file. Not intended for manual editing.
package lb.dgq.language.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import lb.dgq.language.psi.ScriptumProperty;
import lb.dgq.language.psi.ScriptumVisitor;
import org.jetbrains.annotations.NotNull;

public class ScriptumPropertyImpl extends ASTWrapperPsiElement implements ScriptumProperty {

  public ScriptumPropertyImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ScriptumVisitor visitor) {
    visitor.visitProperty(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ScriptumVisitor) accept((ScriptumVisitor)visitor);
    else super.accept(visitor);
  }

}
