const string s;
return std::move(s);  // Warning: std::move of the const variable has no effect

int x;
return std::move(x);  // Warning: std::move of the variable of a trivially-copyable type has no effect

void f(const string &s);
string s;
f(std::move(s));  // Warning: passing result of std::move as a const reference argument; no move will actually happen