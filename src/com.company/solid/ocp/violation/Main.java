package com.company.solid.ocp.violation;

import static com.company.solid.ocp.violation.Printer.Mode.CONGRATS;

public class Main {

  public static void main(String[] args) {
    Printer printer = new Printer();

    printer.print("Hello", CONGRATS);
  }
}
