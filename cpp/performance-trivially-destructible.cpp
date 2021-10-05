struct A: TrivialType {
  ~A(); // Makes A non-trivially-destructible.
  TrivialType trivial_fields;
};
A::~A() = default;