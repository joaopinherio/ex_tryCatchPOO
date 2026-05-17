package dados;

public enum EstadoCivil {
    
    SOLTEIRO("Solteiro"),
    CASADO("Casado"),
    DIVORCIADO("Divorciado"),
    VIUVO("Viuvo");

    private final String extenso;

    private EstadoCivil(String extenso){
        this.extenso = extenso;
    }

    public String getExtenso(){
        return extenso;
    }
}
