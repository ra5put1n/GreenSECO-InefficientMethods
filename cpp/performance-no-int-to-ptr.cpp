char* src(char* maybe_underbiased_ptr) {
  uintptr_t maybe_underbiased_intptr = (uintptr_t)maybe_underbiased_ptr;
  uintptr_t aligned_biased_intptr = maybe_underbiased_intptr + 15;
  uintptr_t aligned_intptr = aligned_biased_intptr & (~15);
  return (char*)aligned_intptr; // warning: avoid integer to pointer casts [performance-no-int-to-ptr]
}