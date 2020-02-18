package interfejsy;

class Pracownik implements nazwaInterfejsu, cosik, Comparable {
    public void cos() {
        System.out.println("implementacja");
    }

    Pracownik(double wynagrodzenie) {
        this.wynagrodzenie = wynagrodzenie;
    }

    private double wynagrodzenie;

    public double getWynagrodzenie() {
        return this.wynagrodzenie;
    }

    @Override
    public int compareTo(Object o) {
        Pracownik przyslany = (Pracownik) o;
        if (this.wynagrodzenie < przyslany.wynagrodzenie)
            return -1;
        if (this.wynagrodzenie > przyslany.wynagrodzenie)
            return 1;
        return 0;
    }
}