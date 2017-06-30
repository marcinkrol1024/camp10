package sages.bootcamp.designpatterns.visitor;

public interface ExpressionVisitor {
  String visit(Add add);

  String visit(Number number);

  String visit(Variable variable);
}
