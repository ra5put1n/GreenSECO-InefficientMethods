map<int, vector<string>> my_map;
for (const pair<int, vector<string>>& p : my_map) {}
// The iterator type is in fact pair<const int, vector<string>>, which means
// that the compiler added a conversion, resulting in a copy of the vectors.

