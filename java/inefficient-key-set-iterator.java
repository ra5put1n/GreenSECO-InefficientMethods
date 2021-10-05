class AddressBook {
        private Map<String, Person> people = ...;
        public String findId(String first, String last) {
                for (String id : people.keySet()) {
                        Person p = people.get(id);
                        if (first.equals(p.firstName()) && last.equals(p.lastName()))
                                return id;
                }
                return null;
        }
}