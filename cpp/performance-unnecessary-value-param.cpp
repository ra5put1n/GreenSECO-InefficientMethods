//Example 1
void f(const string Value) {
  // The warning will suggest making Value a reference.
}

void g(ExpensiveToCopy Value) {
  // The warning will suggest making Value a const reference.
  Value.ConstMethd();
  ExpensiveToCopy Copy(Value);
}

