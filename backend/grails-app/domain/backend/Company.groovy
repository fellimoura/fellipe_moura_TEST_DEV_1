package backend

class Company {

    String name;
    String segment;

    static constraints = {
        name maxSize: 255
        segment maxSize: 255
    }

    String toString() {
        name
        segment
    }
}
