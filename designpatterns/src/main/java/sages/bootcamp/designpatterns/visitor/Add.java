package sages.bootcamp.designpatterns.visitor;

public class Add implements Expression {
  private final Expression left;
  private final Expression right;

  public Add(Expression left, Expression right) {
    this.left = left;
    this.right = right;
  }

  @Override
  public String visit(ExpressionVisitor visitor) {
    return visitor.visit(this);
  }

  public Expression getLeft() {
    return left;
  }

  public Expression getRight() {
    return right;
  }
}
