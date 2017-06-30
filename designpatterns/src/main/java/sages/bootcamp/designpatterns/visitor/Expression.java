package sages.bootcamp.designpatterns.visitor;

public interface Expression {
  String visit(ExpressionVisitor visitor);
}