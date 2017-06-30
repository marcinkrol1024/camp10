package sages.bootcamp.designpatterns.visitor;

public class BracketsExpressionVisitor implements ExpressionVisitor {
  public String visit(Add add) {
    return "(" + add.getLeft().visit(this) + " + " + add.getRight().visit(this) + ")";
  }


  public String visit(Number number) {
    return String.valueOf(number.getValue());
  }


  public String visit(Variable variable) {
    return variable.getName();
  }
}
