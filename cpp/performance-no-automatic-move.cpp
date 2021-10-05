// Example 1
StatusOr<std::vector<int>> NotCool() {
  const std::vector<int> obj = ...;
  return obj;  // calls `StatusOr::StatusOr(const std::vector<int>&)`
}

// Example2
StatusOr<std::vector<int>> Uncool() {
  std::vector<int>&& obj = ...;
  return obj;  // calls `StatusOr::StatusOr(const std::vector<int>&)`
}