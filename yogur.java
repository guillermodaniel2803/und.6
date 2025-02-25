class Yogur {
    private final double CALORIAS = 120.5;
    
    public double getCalorias() {
        return CALORIAS;
    }
}

class YogurDesnatado extends Yogur {
    @Override
    public double getCalorias() {
        return super.getCalorias() / 2;
    }
}

class TestYogures {
    public static void main(String[] args) {
        Yogur yogur = new Yogur();
        YogurDesnatado yogurDesnatado = new YogurDesnatado();
        
        System.out.println("Calorías del Yogur: " + yogur.getCalorias());
        System.out.println("Calorías del Yogur Desnatado: " + yogurDesnatado.getCalorias());
    }
}
