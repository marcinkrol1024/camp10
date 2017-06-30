package sages.bootcamp.designpatterns.visitor;

public class Number implements Expression {

  private final int value;

  public Number(int value) {
    this.value = value;
  }

  @Override
  public String visit(ExpressionVisitor visitor) {
    return visitor.visit(this);
  }

  public int getValue() {
    return value;
  }
}
