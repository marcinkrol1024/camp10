package sages.bootcamp.designpatterns.visitor;

public class App {
  public static void main(String[] args) {
    Add expression = new Add(
        new Add(new Number(1), new Number(2)),
        new Add(new Variable("a"), new Number(4))
    );

    System.out.println(new BasicExpressionVisitor().visit(expression));
    System.out.println(new BracketsExpressionVisitor().visit(expression));
  }
}
