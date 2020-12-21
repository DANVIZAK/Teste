package ppoherancaparte1aula10b;

public class Professor extends Pessoa {

private String especialidade;
private float salario;

public void ReceberAumento(float aut){
    this.salario += aut;
}

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }



}
