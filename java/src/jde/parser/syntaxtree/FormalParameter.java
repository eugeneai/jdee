//
// Generated by JTB 1.1.2
//

package jde.parser.syntaxtree;

/**
 * Grammar production:
 * <PRE>
 * f0 -> [ "final" ]
 * f1 -> Type()
 * f2 -> VariableDeclaratorId()
 * </PRE>
 */
public class FormalParameter implements Node {
   public NodeOptional f0;
   public Type f1;
   public VariableDeclaratorId f2;

   public FormalParameter(NodeOptional n0, Type n1, VariableDeclaratorId n2) {
      f0 = n0;
      f1 = n1;
      f2 = n2;
   }

   public void accept(jde.parser.visitor.Visitor v) {
      v.visit(this);
   }
}

