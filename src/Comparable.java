public class Comparable {
    public class Member implements Comparable<Member> {
        private String name;
        private int salario;

        public Member(String name, int height) {
            this.name = name;
            this.salario = height;
        }

        public String getName() {
            return this.name;
        }

        public int getHeight() {
            return this.salario;
        }

        public String toString() {
            return this.getName() + " (" + this.getHeight() + ")";
        }

        public int compareTo(Member member) {
            if (this.salario == member.getHeight()) {
                return 0;
            } else if (this.salario > member.getHeight()) {
                return 1;
            } else {
                return -1;
            }
        }
    }

}
