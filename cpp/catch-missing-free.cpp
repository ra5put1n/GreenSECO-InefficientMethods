void bad() {
  try {
    /* ... */
  }
  catch(CException* e) {
    e->ReportError();
  }
}