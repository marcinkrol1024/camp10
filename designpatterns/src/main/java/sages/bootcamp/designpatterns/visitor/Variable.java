package sages.bootcamp.designpatterns.visitor;

public class Variable implements Expression {
  private final String name;

  public Variable(String name) {
    this.name = name;
  }

  @Override
  public String visit(ExpressionVisitor visitor) {
    return visitor.visit(this);
  }

  public String getName() {
    return name;
  }
}
