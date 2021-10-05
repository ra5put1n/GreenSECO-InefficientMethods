std::vector<int> v;
for (int i = 0; i < n; ++i) {
  v.push_back(n);
  // This will trigger the warning since the push_back may cause multiple
  // memory reallocations in v. This can be avoid by inserting a 'reserve(n)'
  // statement before the for statement.
}

SomeProto p;
for (int i = 0; i < n; ++i) {
  p.add_xxx(n);
  // This will trigger the warning since the add_xxx may cause multiple memory
  // reallocations. This can be avoid by inserting a
  // 'p.mutable_xxx().Reserve(n)' statement before the for statement.
}

std::vector<int> data;
std::vector<int> v;

for (auto element : data) {
  v.push_back(element);
  // This will trigger the warning since the 'push_back' may cause multiple
  // memory reallocations in v. This can be avoid by inserting a
  // 'reserve(data.size())' statement before the for statement.
}