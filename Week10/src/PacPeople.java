public class PacPeople {
    private Pacman[] people;

    public PacPeople(int count) {
        people = new Pacman[count];
        for (int i = 0; i < count; ++i) {
            people[i] = new Pacman();
        }
    }

    public Pacman[] all() {
        return people;
    }

    public void move(int width, int height) {
        for (Pacman pacman : people) {
            pacman.move(width, height);
        }
    }
}
