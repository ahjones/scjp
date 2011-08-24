Class A has protected function f.
Class B extends A, therefore can access function f.
Class C is in the same package as B, but can't access function f.

Class D in the same package as B extends A and overrides f and keeps it
  protected.
Class C can access f.
