import java.util.ArrayList;
import java.util.List;

class Carte {
    private String editor;
    private String dataPublicare;
    private String ISBN;
    private List<Parte> parti;

    public Carte(String editor, String dataPublicare, String ISBN) {
        this.editor = editor;
        this.dataPublicare = dataPublicare;
        this.ISBN = ISBN;
        this.parti = new ArrayList<>();
    }

    public void adaugaParte(Parte parte) {
        parti.add(parte);
    }

    public List<Parte> getParti() {
        return parti;
    }
}

class Parte {
    private String titlu;
    private int numar;
    private List<Capitol> capitole;

    public Parte(String titlu, int numar) {
        this.titlu = titlu;
        this.numar = numar;
        this.capitole = new ArrayList<>();
    }

    public void adaugaCapitol(Capitol capitol) {
        capitole.add(capitol);
    }

    public List<Capitol> getCapitole() {
        return capitole;
    }
}

class Capitol {
    private String titlu;
    private int numar;
    private String rezumat;
    private List<Sectiune> sectiuni;

    public Capitol(String titlu, int numar, String rezumat) {
        this.titlu = titlu;
        this.numar = numar;
        this.rezumat = rezumat;
        this.sectiuni = new ArrayList<>();
    }

    public void adaugaSectiune(Sectiune sectiune) {
        sectiuni.add(sectiune);
    }

    public List<Sectiune> getSectiuni() {
        return sectiuni;
    }
}

class Sectiune {
    private String titlu;
    private int numar;

    public Sectiune(String titlu, int numar) {
        this.titlu = titlu;
        this.numar = numar;
    }
}
